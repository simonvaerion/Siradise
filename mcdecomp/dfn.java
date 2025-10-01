/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Range
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfn {
    private static final Logger d = LogUtils.getLogger();
    private static final int e = 1200;
    private static final int f = 100;
    public static final int a = 20;
    private static final int g = 8;
    public static final int b = 9;
    private static final int h = 20;
    private static final int i = 96;
    public static final int c = 128;
    private final Predicate<bfj> j;
    private final aic k = (aic)new aic(sw.c("entity.minecraft.ender_dragon"), bdn.a.a, bdn.b.a).b(true).c(true);
    private final aif l;
    private final gu m;
    private final ObjectArrayList<Integer> n = new ObjectArrayList();
    private final dcg o;
    private int p;
    private int q;
    private int r;
    private int s = 21;
    private boolean t;
    private boolean u;
    private boolean v = false;
    @Nullable
    private UUID w;
    private boolean x = true;
    @Nullable
    private gu y;
    @Nullable
    private dfm z;
    private int A;
    @Nullable
    private List<bua> B;

    public dfn(aif $$0, long $$1, a $$2) {
        this($$0, $$1, $$2, gu.b);
    }

    public dfn(aif $$0, long $$1, a $$2, gu $$3) {
        this.l = $$0;
        this.m = $$3;
        this.j = bfm.a.and(bfm.a($$3.u(), 128 + $$3.v(), $$3.w(), 192.0));
        this.x = $$2.c;
        this.w = $$2.g.orElse(null);
        this.t = $$2.d;
        this.u = $$2.e;
        if ($$2.f) {
            this.z = dfm.a;
        }
        this.y = $$2.h.orElse(null);
        this.n.addAll((Collection)$$2.i.orElseGet(() -> {
            ObjectArrayList $$1 = new ObjectArrayList((Collection)ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(20)), (DiscreteDomain)DiscreteDomain.integers()));
            ac.b($$1, apf.a($$1));
            return $$1;
        }));
        this.o = dch.a().a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").a('#', dcf.a(dcj.a(cpo.F))).b();
    }

    @Deprecated
    @VisibleForTesting
    public void a() {
        this.v = true;
    }

    public a b() {
        return new a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
    }

    public void c() {
        this.k.d(!this.t);
        if (++this.s >= 20) {
            this.o();
            this.s = 0;
        }
        if (!this.k.h().isEmpty()) {
            this.l.k().a(aik.b, new clt(0, 0), 9, apz.a);
            boolean $$0 = this.n();
            if (this.x && $$0) {
                this.j();
                this.x = false;
            }
            if (this.z != null) {
                if (this.B == null && $$0) {
                    this.z = null;
                    this.g();
                }
                this.z.a(this.l, this, this.B, this.A++, this.y);
            }
            if (!this.t) {
                if ((this.w == null || ++this.p >= 1200) && $$0) {
                    this.k();
                    this.p = 0;
                }
                if (++this.r >= 100 && $$0) {
                    this.p();
                    this.r = 0;
                }
            }
        } else {
            this.l.k().b(aik.b, new clt(0, 0), 9, apz.a);
        }
    }

    private void j() {
        d.info("Scanning for legacy world dragon fight...");
        boolean $$0 = this.l();
        if ($$0) {
            d.info("Found that the dragon has been killed in this world already.");
            this.u = true;
        } else {
            d.info("Found that the dragon has not yet been killed in this world.");
            this.u = false;
            if (this.m() == null) {
                this.a(false);
            }
        }
        List<? extends bub> $$1 = this.l.h();
        if ($$1.isEmpty()) {
            this.t = true;
        } else {
            bub $$2 = $$1.get(0);
            this.w = $$2.ct();
            d.info("Found that there's a dragon still alive ({})", (Object)$$2);
            this.t = false;
            if (!$$0) {
                d.info("But we didn't have a portal, let's remove it.");
                $$2.ai();
                this.w = null;
            }
        }
        if (!this.u && this.t) {
            this.t = false;
        }
    }

    private void k() {
        List<? extends bub> $$0 = this.l.h();
        if ($$0.isEmpty()) {
            d.debug("Haven't seen the dragon, respawning it");
            this.r();
        } else {
            d.debug("Haven't seen our dragon, but found another one to use.");
            this.w = $$0.get(0).ct();
        }
    }

    protected void a(dfm $$0) {
        if (this.z == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.A = 0;
        if ($$0 == dfm.e) {
            this.z = null;
            this.t = false;
            bub $$1 = this.r();
            if ($$1 != null) {
                for (aig $$2 : this.k.h()) {
                    ai.n.a($$2, $$1);
                }
            }
        } else {
            this.z = $$0;
        }
    }

    private boolean l() {
        for (int $$0 = -8; $$0 <= 8; ++$$0) {
            for (int $$1 = -8; $$1 <= 8; ++$$1) {
                dei $$2 = this.l.d($$0, $$1);
                for (czn $$3 : $$2.G().values()) {
                    if (!($$3 instanceof dbc)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    private dcg.b m() {
        int $$8;
        clt $$0 = new clt(this.m);
        for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; ++$$1) {
            for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; ++$$2) {
                dei $$3 = this.l.d($$1, $$2);
                for (czn $$4 : $$3.G().values()) {
                    dcg.b $$5;
                    if (!($$4 instanceof dbc) || ($$5 = this.o.a(this.l, $$4.p())) == null) continue;
                    gu $$6 = $$5.a(3, 3, 3).d();
                    if (this.y == null) {
                        this.y = $$6;
                    }
                    return $$5;
                }
            }
        }
        gu $$7 = dkn.a(this.m);
        for (int $$9 = $$8 = this.l.a(dhk.a.e, $$7).v(); $$9 >= this.l.C_(); --$$9) {
            dcg.b $$10 = this.o.a(this.l, new gu($$7.u(), $$9, $$7.w()));
            if ($$10 == null) continue;
            if (this.y == null) {
                this.y = $$10.a(3, 3, 3).d();
            }
            return $$10;
        }
        return null;
    }

    private boolean n() {
        if (this.v) {
            return true;
        }
        clt $$0 = new clt(this.m);
        for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; ++$$1) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; ++$$2) {
                ddx $$3 = this.l.a($$1, $$2, dec.n, false);
                if (!($$3 instanceof dei)) {
                    return false;
                }
                ahy $$4 = ((dei)$$3).D();
                if ($$4.a(ahy.c)) continue;
                return false;
            }
        }
        return true;
    }

    private void o() {
        HashSet $$0 = Sets.newHashSet();
        for (aig $$1 : this.l.a(this.j)) {
            this.k.a($$1);
            $$0.add($$1);
        }
        HashSet $$2 = Sets.newHashSet(this.k.h());
        $$2.removeAll($$0);
        for (aig $$3 : $$2) {
            this.k.b($$3);
        }
    }

    private void p() {
        this.r = 0;
        this.q = 0;
        for (dly.a $$0 : dly.a(this.l)) {
            this.q += this.l.a(bua.class, $$0.f()).size();
        }
        d.debug("Found {} end crystals still alive", (Object)this.q);
    }

    public void a(bub $$0) {
        if ($$0.ct().equals(this.w)) {
            this.k.a(0.0f);
            this.k.d(false);
            this.a(true);
            this.q();
            if (!this.u) {
                this.l.b(this.l.a(dhk.a.e, dkn.a(this.m)), cpo.fA.n());
            }
            this.u = true;
            this.t = true;
        }
    }

    @Deprecated
    @VisibleForTesting
    public void d() {
        this.n.clear();
    }

    private void q() {
        if (this.n.isEmpty()) {
            return;
        }
        int $$0 = (Integer)this.n.remove(this.n.size() - 1);
        int $$1 = apa.a(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)$$0)));
        int $$2 = apa.a(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)$$0)));
        this.a(new gu($$1, 75, $$2));
    }

    private void a(gu $$02) {
        this.l.c(3000, $$02, 0);
        this.l.B_().c(jc.as).flatMap($$0 -> $$0.b(ol.c)).ifPresent($$1 -> ((dkb)$$1.a()).a(this.l, this.l.k().g(), apf.a(), $$02));
    }

    private void a(boolean $$0) {
        dkn $$1 = new dkn($$0);
        if (this.y == null) {
            this.y = this.l.a(dhk.a.f, dkn.a(this.m)).d();
            while (this.l.a_(this.y).a(cpo.F) && this.y.v() > this.l.t_()) {
                this.y = this.y.d();
            }
        }
        $$1.a(dms.m, this.l, this.l.k().g(), apf.a(), this.y);
    }

    @Nullable
    private bub r() {
        this.l.l(new gu(this.m.u(), 128 + this.m.v(), this.m.w()));
        bub $$0 = bfn.C.a(this.l);
        if ($$0 != null) {
            $$0.a(this);
            $$0.h(this.m);
            $$0.fW().a(bur.a);
            $$0.b(this.m.u(), 128 + this.m.v(), this.m.w(), this.l.z.i() * 360.0f, 0.0f);
            this.l.b($$0);
            this.w = $$0.ct();
        }
        return $$0;
    }

    public void b(bub $$0) {
        if ($$0.ct().equals(this.w)) {
            this.k.a($$0.er() / $$0.eI());
            this.p = 0;
            if ($$0.aa()) {
                this.k.a($$0.H_());
            }
        }
    }

    public int e() {
        return this.q;
    }

    public void a(bua $$0, ben $$1) {
        if (this.z != null && this.B.contains($$0)) {
            d.debug("Aborting respawn sequence");
            this.z = null;
            this.A = 0;
            this.h();
            this.a(true);
        } else {
            this.p();
            bfj $$2 = this.l.a(this.w);
            if ($$2 instanceof bub) {
                ((bub)$$2).a($$0, $$0.di(), $$1);
            }
        }
    }

    public boolean f() {
        return this.u;
    }

    public void g() {
        if (this.t && this.z == null) {
            gu $$0 = this.y;
            if ($$0 == null) {
                d.debug("Tried to respawn, but need to find the portal first.");
                dcg.b $$1 = this.m();
                if ($$1 == null) {
                    d.debug("Couldn't find a portal, so we made one.");
                    this.a(true);
                } else {
                    d.debug("Found the exit portal & saved its location for next time.");
                }
                $$0 = this.y;
            }
            ArrayList $$2 = Lists.newArrayList();
            gu $$3 = $$0.b(1);
            for (ha $$4 : ha.c.a) {
                List<bua> $$5 = this.l.a(bua.class, new eed($$3.a($$4, 2)));
                if ($$5.isEmpty()) {
                    return;
                }
                $$2.addAll($$5);
            }
            d.debug("Found all crystals, respawning dragon.");
            this.a($$2);
        }
    }

    private void a(List<bua> $$0) {
        if (this.t && this.z == null) {
            dcg.b $$1 = this.m();
            while ($$1 != null) {
                for (int $$2 = 0; $$2 < this.o.c(); ++$$2) {
                    for (int $$3 = 0; $$3 < this.o.b(); ++$$3) {
                        for (int $$4 = 0; $$4 < this.o.a(); ++$$4) {
                            dcf $$5 = $$1.a($$2, $$3, $$4);
                            if (!$$5.a().a(cpo.F) && !$$5.a().a(cpo.fx)) continue;
                            this.l.b($$5.d(), cpo.fz.n());
                        }
                    }
                }
                $$1 = this.m();
            }
            this.z = dfm.a;
            this.A = 0;
            this.a(false);
            this.B = $$0;
        }
    }

    public void h() {
        for (dly.a $$0 : dly.a(this.l)) {
            List<bua> $$1 = this.l.a(bua.class, $$0.f());
            for (bua $$2 : $$1) {
                $$2.m(false);
                $$2.a((gu)null);
            }
        }
    }

    @Nullable
    public UUID i() {
        return this.w;
    }

    public static final class a
    extends Record {
        final boolean c;
        final boolean d;
        final boolean e;
        final boolean f;
        final Optional<UUID> g;
        final Optional<gu> h;
        final Optional<List<Integer>> i;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.fieldOf("NeedsStateScanning").orElse((Object)true).forGetter(a::a), (App)Codec.BOOL.fieldOf("DragonKilled").orElse((Object)false).forGetter(a::b), (App)Codec.BOOL.fieldOf("PreviouslyKilled").orElse((Object)false).forGetter(a::c), (App)Codec.BOOL.optionalFieldOf("IsRespawning", (Object)false).forGetter(a::d), (App)hy.a.optionalFieldOf("Dragon").forGetter(a::e), (App)gu.a.optionalFieldOf("ExitPortalLocation").forGetter(a::f), (App)Codec.list((Codec)Codec.INT).optionalFieldOf("Gateways").forGetter(a::g)).apply((Applicative)$$0, a::new));
        public static final a b = new a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

        public a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, Optional<UUID> $$4, Optional<gu> $$5, Optional<List<Integer>> $$6) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
            this.i = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.d;
        }

        public boolean c() {
            return this.e;
        }

        public boolean d() {
            return this.f;
        }

        public Optional<UUID> e() {
            return this.g;
        }

        public Optional<gu> f() {
            return this.h;
        }

        public Optional<List<Integer>> g() {
            return this.i;
        }
    }
}

