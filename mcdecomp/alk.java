/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class alk {
    public static final File b = new File("banned-players.json");
    public static final File c = new File("banned-ips.json");
    public static final File d = new File("ops.json");
    public static final File e = new File("whitelist.json");
    public static final sw f = sw.c("chat.filtered_full");
    private static final Logger a = LogUtils.getLogger();
    private static final int h = 600;
    private static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final MinecraftServer j;
    private final List<aig> k = Lists.newArrayList();
    private final Map<UUID, aig> l = Maps.newHashMap();
    private final alq m = new alq(b);
    private final alh n = new alh(c);
    private final all o = new all(d);
    private final als p = new als(e);
    private final Map<UUID, amn> q = Maps.newHashMap();
    private final Map<UUID, acy> r = Maps.newHashMap();
    private final dzb s;
    private boolean t;
    private final hl<acz> u;
    private final hs.b v;
    protected final int g;
    private int w;
    private int x;
    private boolean y;
    private static final boolean z = false;
    private int A;

    public alk(MinecraftServer $$0, hl<acz> $$1, dzb $$2, int $$3) {
        this.j = $$0;
        this.u = $$1;
        this.v = new hs.c(hv.a($$1)).c();
        this.g = $$3;
        this.s = $$2;
    }

    public void a(sd $$0, aig $$12) {
        qr $$22;
        bfj $$23;
        tj $$19;
        aif $$11;
        String $$6;
        GameProfile $$2 = $$12.fM();
        alg $$3 = this.j.ap();
        if ($$3 != null) {
            Optional<GameProfile> $$4 = $$3.a($$2.getId());
            String $$5 = $$4.map(GameProfile::getName).orElse($$2.getName());
            $$3.a($$2);
        } else {
            $$6 = $$2.getName();
        }
        qr $$7 = this.a($$12);
        acp<cmm> $$8 = $$7 != null ? dfk.a(new Dynamic((DynamicOps)rc.a, (Object)$$7.c("Dimension"))).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).orElse(cmm.h) : cmm.h;
        aif $$9 = this.j.a($$8);
        if ($$9 == null) {
            a.warn("Unknown respawn dimension {}, defaulting to overworld", $$8);
            aif $$10 = this.j.D();
        } else {
            $$11 = $$9;
        }
        $$12.c($$11);
        String $$122 = "local";
        if ($$0.c() != null) {
            $$122 = $$0.c().toString();
        }
        a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$12.Z().getString(), $$122, $$12.af(), $$12.dn(), $$12.dp(), $$12.dt()});
        dyv $$13 = $$11.u_();
        $$12.c($$7);
        aiy $$14 = new aiy(this.j, $$0, $$12);
        cmi $$15 = $$11.X();
        boolean $$16 = $$15.b(cmi.B);
        boolean $$17 = $$15.b(cmi.p);
        $$14.a(new wi($$12.af(), $$13.n(), $$12.e.b(), $$12.e.c(), this.j.E(), this.v, $$11.aa(), $$11.ac(), cnm.a($$11.A()), this.n(), this.w, this.x, $$17, !$$16, $$11.af(), $$11.z(), $$12.gm(), $$12.ar()));
        $$14.a(new yv(cay.c.b($$11.G())));
        $$14.a(new vp(vp.a, new sf(Unpooled.buffer()).a(this.c().getServerModName())));
        $$14.a(new ve($$13.s(), $$13.t()));
        $$14.a(new ws($$12.fO()));
        $$14.a(new xr($$12.fN().l));
        $$14.a(new yx(this.j.aE().b()));
        $$14.a(new yy(ano.a(this.u)));
        this.d($$12);
        $$12.D().c();
        $$12.E().a($$12);
        this.a($$11.f(), $$12);
        this.j.ar();
        if ($$12.fM().getName().equalsIgnoreCase($$6)) {
            tj $$18 = sw.a("multiplayer.player.joined", $$12.H_());
        } else {
            $$19 = sw.a("multiplayer.player.joined.renamed", $$12.H_(), $$6);
        }
        this.a($$19.a(n.o), false);
        $$14.a($$12.dn(), $$12.dp(), $$12.dt(), $$12.dy(), $$12.dA());
        abt $$20 = this.j.aq();
        if ($$20 != null) {
            $$12.a($$20);
        }
        $$12.c.a(wy.a(this.k));
        this.k.add($$12);
        this.l.put($$12.ct(), $$12);
        this.a(wy.a(List.of($$12)));
        this.a($$12, $$11);
        $$11.c($$12);
        this.j.aJ().a($$12);
        this.j.S().ifPresent($$1 -> $$12.a($$1.a(), $$1.b(), $$1.c(), $$1.d()));
        for (bfa $$21 : $$12.eo()) {
            $$14.a(new yw($$12.af(), $$21));
        }
        if ($$7 != null && $$7.b("RootVehicle", 10) && ($$23 = bfn.a(($$22 = $$7.p("RootVehicle")).p("Entity"), $$11, $$1 -> {
            if (!$$11.c((bfj)$$1)) {
                return null;
            }
            return $$1;
        })) != null) {
            Object $$25;
            if ($$22.b("Attach")) {
                UUID $$24 = $$22.a("Attach");
            } else {
                $$25 = null;
            }
            if ($$23.ct().equals($$25)) {
                $$12.a($$23, true);
            } else {
                for (bfj $$26 : $$23.cR()) {
                    if (!$$26.ct().equals($$25)) continue;
                    $$12.a($$26, true);
                    break;
                }
            }
            if (!$$12.bM()) {
                a.warn("Couldn't reattach entity to player");
                $$23.ai();
                for (bfj $$27 : $$23.cR()) {
                    $$27.ai();
                }
            }
        }
        $$12.h();
    }

    protected void a(adg $$0, aig $$1) {
        HashSet $$2 = Sets.newHashSet();
        for (efe $$3 : $$0.g()) {
            $$1.c.a(ye.a($$3, true));
        }
        for (int $$4 = 0; $$4 < 19; ++$$4) {
            efd $$5 = $$0.a($$4);
            if ($$5 == null || $$2.contains($$5)) continue;
            List<uo<?>> $$6 = $$0.d($$5);
            for (uo<?> $$7 : $$6) {
                $$1.c.a($$7);
            }
            $$2.add($$5);
        }
    }

    public void a(aif $$0) {
        $$0.w_().a(new ddq(){

            @Override
            public void a(dds $$0, double $$1) {
                alk.this.a(new xn($$0));
            }

            @Override
            public void a(dds $$0, double $$1, double $$2, long $$3) {
                alk.this.a(new xm($$0));
            }

            @Override
            public void a(dds $$0, double $$1, double $$2) {
                alk.this.a(new xl($$0));
            }

            @Override
            public void a(dds $$0, int $$1) {
                alk.this.a(new xo($$0));
            }

            @Override
            public void b(dds $$0, int $$1) {
                alk.this.a(new xp($$0));
            }

            @Override
            public void b(dds $$0, double $$1) {
            }

            @Override
            public void c(dds $$0, double $$1) {
            }
        });
    }

    @Nullable
    public qr a(aig $$0) {
        qr $$3;
        qr $$1 = this.j.aU().y();
        if (this.j.a($$0.fM()) && $$1 != null) {
            qr $$2 = $$1;
            $$0.g($$2);
            a.debug("loading single player");
        } else {
            $$3 = this.s.b($$0);
        }
        return $$3;
    }

    protected void b(aig $$0) {
        acy $$2;
        this.s.a($$0);
        amn $$1 = this.q.get($$0.ct());
        if ($$1 != null) {
            $$1.a();
        }
        if (($$2 = this.r.get($$0.ct())) != null) {
            $$2.b();
        }
    }

    public void c(aig $$02) {
        bfj $$2;
        aif $$1 = $$02.x();
        $$02.a(amr.j);
        this.b($$02);
        if ($$02.bM() && ($$2 = $$02.cT()).cS()) {
            a.debug("Removing player mount");
            $$02.Y();
            $$2.cQ().forEach($$0 -> $$0.b(bfj.c.d));
        }
        $$02.ac();
        $$1.a($$02, bfj.c.d);
        $$02.M().a();
        this.k.remove($$02);
        this.j.aJ().b($$02);
        UUID $$3 = $$02.ct();
        aig $$4 = this.l.get($$3);
        if ($$4 == $$02) {
            this.l.remove($$3);
            this.q.remove($$3);
            this.r.remove($$3);
        }
        this.a(new wx(List.of($$02.ct())));
    }

    @Nullable
    public sw a(SocketAddress $$0, GameProfile $$1) {
        if (this.m.a($$1)) {
            alr $$2 = (alr)this.m.b($$1);
            tj $$3 = sw.a("multiplayer.disconnect.banned.reason", new Object[]{$$2.d()});
            if ($$2.c() != null) {
                $$3.b(sw.a("multiplayer.disconnect.banned.expiration", new Object[]{i.format($$2.c())}));
            }
            return $$3;
        }
        if (!this.c($$1)) {
            return sw.c("multiplayer.disconnect.not_whitelisted");
        }
        if (this.n.a($$0)) {
            ali $$4 = this.n.b($$0);
            tj $$5 = sw.a("multiplayer.disconnect.banned_ip.reason", new Object[]{$$4.d()});
            if ($$4.c() != null) {
                $$5.b(sw.a("multiplayer.disconnect.banned_ip.expiration", new Object[]{i.format($$4.c())}));
            }
            return $$5;
        }
        if (this.k.size() >= this.g && !this.d($$1)) {
            return sw.c("multiplayer.disconnect.server_full");
        }
        return null;
    }

    public aig e(GameProfile $$0) {
        UUID $$1 = hy.a($$0);
        ArrayList $$2 = Lists.newArrayList();
        for (int $$3 = 0; $$3 < this.k.size(); ++$$3) {
            aig $$4 = this.k.get($$3);
            if (!$$4.ct().equals($$1)) continue;
            $$2.add($$4);
        }
        aig $$5 = this.l.get($$0.getId());
        if ($$5 != null && !$$2.contains($$5)) {
            $$2.add($$5);
        }
        for (aig $$6 : $$2) {
            $$6.c.b(sw.c("multiplayer.disconnect.duplicate_login"));
        }
        return new aig(this.j, this.j.D(), $$0);
    }

    public aig a(aig $$0, boolean $$1) {
        Optional $$7;
        this.k.remove($$0);
        $$0.x().a($$0, bfj.c.b);
        gu $$2 = $$0.N();
        float $$3 = $$0.O();
        boolean $$4 = $$0.Q();
        aif $$5 = this.j.a($$0.P());
        if ($$5 != null && $$2 != null) {
            Optional<eei> $$6 = byo.a($$5, $$2, $$3, $$4, $$1);
        } else {
            $$7 = Optional.empty();
        }
        aif $$8 = $$5 != null && $$7.isPresent() ? $$5 : this.j.D();
        aig $$9 = new aig(this.j, $$8, $$0.fM());
        $$9.c = $$0.c;
        $$9.a($$0, $$1);
        $$9.e($$0.af());
        $$9.a($$0.fh());
        for (String $$10 : $$0.ag()) {
            $$9.a($$10);
        }
        boolean $$11 = false;
        if ($$7.isPresent()) {
            float $$17;
            dcb $$12 = $$8.a_($$2);
            boolean $$13 = $$12.a(cpo.pl);
            eei $$14 = (eei)$$7.get();
            if ($$12.a(amw.R) || $$13) {
                eei $$15 = eei.c($$2).d($$14).d();
                float $$16 = (float)apa.d(apa.d($$15.e, $$15.c) * 57.2957763671875 - 90.0);
            } else {
                $$17 = $$3;
            }
            $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0f);
            $$9.a($$8.ac(), $$2, $$3, $$4, false);
            $$11 = !$$1 && $$13;
        } else if ($$2 != null) {
            $$9.c.a(new vx(vx.a, 0.0f));
        }
        while (!$$8.g($$9) && $$9.dp() < (double)$$8.aj()) {
            $$9.e($$9.dn(), $$9.dp() + 1.0, $$9.dt());
        }
        byte $$18 = $$1 ? (byte)1 : 0;
        dyv $$19 = $$9.dI().u_();
        $$9.c.a(new xf($$9.dI().aa(), $$9.dI().ac(), cnm.a($$9.x().A()), $$9.e.b(), $$9.e.c(), $$9.dI().af(), $$9.x().z(), $$18, $$9.gm(), $$9.ar()));
        $$9.c.a($$9.dn(), $$9.dp(), $$9.dt(), $$9.dy(), $$9.dA());
        $$9.c.a(new xu($$8.R(), $$8.S()));
        $$9.c.a(new ve($$19.s(), $$19.t()));
        $$9.c.a(new ya($$9.cg, $$9.cf, $$9.ce));
        this.a($$9, $$8);
        this.d($$9);
        $$8.d($$9);
        this.k.add($$9);
        this.l.put($$9.ct(), $$9);
        $$9.h();
        $$9.t($$9.er());
        if ($$11) {
            $$9.c.a(new ym(amh.tL, ami.e, $$2.u(), $$2.v(), $$2.w(), 1.0f, 1.0f, $$8.y_().g()));
        }
        return $$9;
    }

    public void d(aig $$0) {
        GameProfile $$1 = $$0.fM();
        int $$2 = this.j.c($$1);
        this.a($$0, $$2);
    }

    public void d() {
        if (++this.A > 600) {
            this.a(new wy(EnumSet.of(wy.a.e), this.k));
            this.A = 0;
        }
    }

    public void a(uo<?> $$0) {
        for (aig $$1 : this.k) {
            $$1.c.a($$0);
        }
    }

    public void a(uo<?> $$0, acp<cmm> $$1) {
        for (aig $$2 : this.k) {
            if ($$2.dI().ac() != $$1) continue;
            $$2.c.a($$0);
        }
    }

    public void a(byo $$0, sw $$1) {
        efi $$2 = $$0.cd();
        if ($$2 == null) {
            return;
        }
        Collection<String> $$3 = $$2.g();
        for (String $$4 : $$3) {
            aig $$5 = this.a($$4);
            if ($$5 == null || $$5 == $$0) continue;
            $$5.a($$1);
        }
    }

    public void b(byo $$0, sw $$1) {
        efi $$2 = $$0.cd();
        if ($$2 == null) {
            this.a($$1, false);
            return;
        }
        for (int $$3 = 0; $$3 < this.k.size(); ++$$3) {
            aig $$4 = this.k.get($$3);
            if ($$4.cd() == $$2) continue;
            $$4.a($$1);
        }
    }

    public String[] e() {
        String[] $$0 = new String[this.k.size()];
        for (int $$1 = 0; $$1 < this.k.size(); ++$$1) {
            $$0[$$1] = this.k.get($$1).fM().getName();
        }
        return $$0;
    }

    public alq f() {
        return this.m;
    }

    public alh g() {
        return this.n;
    }

    public void a(GameProfile $$0) {
        this.o.a(new alm($$0, this.j.i(), this.o.a($$0)));
        aig $$1 = this.a($$0.getId());
        if ($$1 != null) {
            this.d($$1);
        }
    }

    public void b(GameProfile $$0) {
        this.o.c($$0);
        aig $$1 = this.a($$0.getId());
        if ($$1 != null) {
            this.d($$1);
        }
    }

    private void a(aig $$0, int $$1) {
        if ($$0.c != null) {
            byte $$4;
            if ($$1 <= 0) {
                int $$2 = 24;
            } else if ($$1 >= 4) {
                int $$3 = 28;
            } else {
                $$4 = (byte)(24 + $$1);
            }
            $$0.c.a(new vu($$0, $$4));
        }
        this.j.aC().a($$0);
    }

    public boolean c(GameProfile $$0) {
        return !this.t || this.o.d($$0) || this.p.d($$0);
    }

    public boolean f(GameProfile $$0) {
        return this.o.d($$0) || this.j.a($$0) && this.j.aU().o() || this.y;
    }

    @Nullable
    public aig a(String $$0) {
        for (aig $$1 : this.k) {
            if (!$$1.fM().getName().equalsIgnoreCase($$0)) continue;
            return $$1;
        }
        return null;
    }

    public void a(@Nullable byo $$0, double $$1, double $$2, double $$3, double $$4, acp<cmm> $$5, uo<?> $$6) {
        for (int $$7 = 0; $$7 < this.k.size(); ++$$7) {
            double $$11;
            double $$10;
            double $$9;
            aig $$8 = this.k.get($$7);
            if ($$8 == $$0 || $$8.dI().ac() != $$5 || !(($$9 = $$1 - $$8.dn()) * $$9 + ($$10 = $$2 - $$8.dp()) * $$10 + ($$11 = $$3 - $$8.dt()) * $$11 < $$4 * $$4)) continue;
            $$8.c.a($$6);
        }
    }

    public void h() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            this.b(this.k.get($$0));
        }
    }

    public als i() {
        return this.p;
    }

    public String[] j() {
        return this.p.a();
    }

    public all k() {
        return this.o;
    }

    public String[] l() {
        return this.o.a();
    }

    public void a() {
    }

    public void a(aig $$0, aif $$1) {
        dds $$2 = this.j.D().w_();
        $$0.c.a(new wa($$2));
        $$0.c.a(new yi($$1.V(), $$1.W(), $$1.X().b(cmi.k)));
        $$0.c.a(new xu($$1.R(), $$1.S()));
        if ($$1.Z()) {
            $$0.c.a(new vx(vx.b, 0.0f));
            $$0.c.a(new vx(vx.h, $$1.d(1.0f)));
            $$0.c.a(new vx(vx.i, $$1.b(1.0f)));
        }
    }

    public void e(aig $$0) {
        $$0.bQ.b();
        $$0.u();
        $$0.c.a(new xr($$0.fN().l));
    }

    public int m() {
        return this.k.size();
    }

    public int n() {
        return this.g;
    }

    public boolean o() {
        return this.t;
    }

    public void a(boolean $$0) {
        this.t = $$0;
    }

    public List<aig> b(String $$0) {
        ArrayList $$1 = Lists.newArrayList();
        for (aig $$2 : this.k) {
            if (!$$2.y().equals($$0)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public int p() {
        return this.w;
    }

    public int q() {
        return this.x;
    }

    public MinecraftServer c() {
        return this.j;
    }

    @Nullable
    public qr r() {
        return null;
    }

    public void b(boolean $$0) {
        this.y = $$0;
    }

    public void s() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            this.k.get((int)$$0).c.b(sw.c("multiplayer.disconnect.server_shutdown"));
        }
    }

    public void a(sw $$0, boolean $$12) {
        this.a($$0, (aig $$1) -> $$0, $$12);
    }

    public void a(sw $$0, Function<aig, sw> $$1, boolean $$2) {
        this.j.a($$0);
        for (aig $$3 : this.k) {
            sw $$4 = $$1.apply($$3);
            if ($$4 == null) continue;
            $$3.b($$4, $$2);
        }
    }

    public void a(tl $$0, ds $$1, ss.a $$2) {
        this.a($$0, $$1::a, $$1.i(), $$2);
    }

    public void a(tl $$0, aig $$1, ss.a $$2) {
        this.a($$0, $$1::b, $$1, $$2);
    }

    private void a(tl $$0, Predicate<aig> $$1, @Nullable aig $$2, ss.a $$3) {
        boolean $$4 = this.a($$0);
        this.j.a($$0.c(), $$3, $$4 ? null : "Not Secure");
        tk $$5 = tk.a($$0);
        boolean $$6 = false;
        for (aig $$7 : this.k) {
            boolean $$8 = $$1.test($$7);
            $$7.a($$5, $$8, $$3);
            $$6 |= $$8 && $$0.i();
        }
        if ($$6 && $$2 != null) {
            $$2.a(f);
        }
    }

    private boolean a(tl $$0) {
        return $$0.h() && !$$0.a(Instant.now());
    }

    public amn a(byo $$0) {
        UUID $$1 = $$0.ct();
        amn $$2 = this.q.get($$1);
        if ($$2 == null) {
            File $$5;
            Path $$6;
            File $$3 = this.j.a(dyw.b).toFile();
            File $$4 = new File($$3, $$1 + ".json");
            if (!$$4.exists() && v.a($$6 = ($$5 = new File($$3, $$0.Z().getString() + ".json")).toPath()) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
                $$5.renameTo($$4);
            }
            $$2 = new amn(this.j, $$4);
            this.q.put($$1, $$2);
        }
        return $$2;
    }

    public acy f(aig $$0) {
        UUID $$1 = $$0.ct();
        acy $$2 = this.r.get($$1);
        if ($$2 == null) {
            Path $$3 = this.j.a(dyw.a).resolve($$1 + ".json");
            $$2 = new acy(this.j.ay(), this, this.j.az(), $$3, $$0);
            this.r.put($$1, $$2);
        }
        $$2.a($$0);
        return $$2;
    }

    public void a(int $$0) {
        this.w = $$0;
        this.a(new xt($$0));
        for (aif $$1 : this.j.F()) {
            if ($$1 == null) continue;
            $$1.k().a($$0);
        }
    }

    public void b(int $$0) {
        this.x = $$0;
        this.a(new yg($$0));
        for (aif $$1 : this.j.F()) {
            if ($$1 == null) continue;
            $$1.k().b($$0);
        }
    }

    public List<aig> t() {
        return this.k;
    }

    @Nullable
    public aig a(UUID $$0) {
        return this.l.get($$0);
    }

    public boolean d(GameProfile $$0) {
        return false;
    }

    public void u() {
        for (acy $$0 : this.r.values()) {
            $$0.a(this.j.az());
        }
        this.a(new yy(ano.a(this.u)));
        yx $$1 = new yx(this.j.aE().b());
        for (aig $$2 : this.k) {
            $$2.c.a($$1);
            $$2.E().a($$2);
        }
    }

    public boolean v() {
        return this.y;
    }
}

