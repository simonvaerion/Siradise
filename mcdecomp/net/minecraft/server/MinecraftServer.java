/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer
extends bcr<adi>
implements dr,
AutoCloseable {
    private static final Logger n = LogUtils.getLogger();
    public static final String b = "vanilla";
    private static final float o = 0.8f;
    private static final int p = 100;
    public static final int c = 50;
    private static final int q = 2000;
    private static final int r = 15000;
    private static final long s = 5000000000L;
    private static final int t = 12;
    public static final int d = 11;
    private static final int u = 441;
    private static final int v = 6000;
    private static final int w = 3;
    public static final int e = 29999984;
    public static final cmq f = new cmq("Demo World", cmj.a, false, bdu.c, false, new cmi(), cnf.c);
    private static final long x = 50L;
    public static final GameProfile g = new GameProfile(ac.c, "Anonymous Player");
    protected final dyy.c h;
    protected final dzb i;
    private final List<Runnable> y = Lists.newArrayList();
    private bbz z = bby.a;
    private ban A = this.z.f();
    private Consumer<bam> B = $$0 -> this.aP();
    private Consumer<Path> C = $$0 -> {};
    private boolean D;
    @Nullable
    private c E;
    private boolean F;
    private final aix G;
    private final aip H;
    @Nullable
    private abt I;
    @Nullable
    private abt.a J;
    private final apf K = apf.a();
    private final DataFixer L;
    private String M;
    private int N = -1;
    private final hl<acz> O;
    private final Map<acp<cmm>, aif> P = Maps.newLinkedHashMap();
    private alk Q;
    private volatile boolean R = true;
    private boolean S;
    private int T;
    protected final Proxy j;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    @Nullable
    private String Y;
    private int Z;
    public final long[] k = new long[100];
    @Nullable
    private KeyPair aa;
    @Nullable
    private GameProfile ab;
    private boolean ac;
    private volatile boolean ad;
    private long ae;
    protected final adh l;
    private long af;
    private final Thread ag;
    private long ah = ac.b();
    private long ai;
    private boolean aj;
    private final aki ak;
    private final adg al = new adg(this);
    @Nullable
    private dyr am;
    private final ado an = new ado();
    private final ade ao;
    private final aoo ap = new aoo();
    private boolean aq;
    private float ar;
    private final Executor as;
    @Nullable
    private String at;
    private a au;
    private final dvu av;
    protected final dze m;
    private volatile boolean aw;

    public static <S extends MinecraftServer> S a(Function<Thread, S> $$02) {
        AtomicReference<MinecraftServer> $$12 = new AtomicReference<MinecraftServer>();
        Thread $$2 = new Thread(() -> ((MinecraftServer)$$12.get()).w(), "Server thread");
        $$2.setUncaughtExceptionHandler(($$0, $$1) -> n.error("Uncaught exception in server thread", $$1));
        if (Runtime.getRuntime().availableProcessors() > 4) {
            $$2.setPriority(8);
        }
        MinecraftServer $$3 = (MinecraftServer)$$02.apply($$2);
        $$12.set($$3);
        $$2.start();
        return (S)$$3;
    }

    public MinecraftServer(Thread $$02, dyy.c $$1, aki $$2, adk $$3, Proxy $$4, DataFixer $$5, adh $$6, aip $$7) {
        super("Server");
        this.O = $$3.c();
        this.m = $$3.d();
        if (!this.O.a().d(jc.aI).c(dfl.b)) {
            throw new IllegalStateException("Missing Overworld dimension data");
        }
        this.j = $$4;
        this.ak = $$2;
        this.au = new a($$3.a(), $$3.b());
        this.l = $$6;
        if ($$6.e() != null) {
            $$6.e().a(this);
        }
        this.G = new aix(this);
        this.H = $$7;
        this.h = $$1;
        this.i = $$1.b();
        this.L = $$5;
        this.ao = new ade(this, this.au.b.a());
        hg<cpn> $$8 = this.O.a().d(jc.e).p().a(this.m.M());
        this.av = new dvu($$3.a(), $$1, $$5, $$8);
        this.ag = $$02;
        this.as = ac.f();
    }

    @Override
    private void a(dyu $$0) {
        $$0.a(this.aF()::a, this.aF()::b, "scoreboard");
    }

    protected abstract boolean e() throws IOException;

    protected void n_() {
        if (!bat.e.c()) {
            // empty if block
        }
        boolean $$0 = false;
        baw $$1 = bat.e.e();
        this.m.a(this.getServerModName(), this.K().a());
        aio $$2 = this.H.create(11);
        this.a($$2);
        this.r();
        this.b($$2);
        if ($$1 != null) {
            $$1.finish();
        }
        if ($$0) {
            try {
                bat.e.b();
            }
            catch (Throwable $$3) {
                n.warn("Failed to stop JFR profiling", $$3);
            }
        }
    }

    protected void r() {
    }

    @Override
    protected void a(aio $$0) {
        dzd $$1 = this.m.K();
        boolean $$2 = this.m.C();
        hr<dfl> $$3 = this.O.a().d(jc.aI);
        dii $$4 = this.m.A();
        long $$5 = $$4.b();
        long $$6 = cnm.a($$5);
        ImmutableList $$7 = ImmutableList.of((Object)new dhw(), (Object)new dhv(), (Object)new bxx(), (Object)new bqx(), (Object)new byi($$1));
        dfl $$8 = $$3.a(dfl.b);
        aif $$9 = new aif(this, this.as, this.h, $$1, cmm.h, $$8, $$0, $$2, $$6, (List<clz>)$$7, true, null);
        this.P.put(cmm.h, $$9);
        dyu $$10 = $$9.s();
        this.a($$10);
        this.am = new dyr($$10);
        dds $$11 = $$9.w_();
        if (!$$1.p()) {
            try {
                MinecraftServer.a($$9, $$1, $$4.d(), $$2);
                $$1.c(true);
                if ($$2) {
                    this.a(this.m);
                }
            }
            catch (Throwable $$12) {
                o $$13 = o.a($$12, "Exception initializing level");
                try {
                    $$9.a($$13);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                throw new y($$13);
            }
            $$1.c(true);
        }
        this.ac().a($$9);
        if (this.m.G() != null) {
            this.aJ().a(this.m.G());
        }
        bed $$14 = $$9.H();
        for (Map.Entry<acp<dfl>, dfl> $$15 : $$3.g()) {
            acp<dfl> $$16 = $$15.getKey();
            if ($$16 == dfl.b) continue;
            acp<cmm> $$17 = acp.a(jc.aH, $$16.a());
            dyt $$18 = new dyt(this.m, $$1);
            aif $$19 = new aif(this, this.as, this.h, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, (List<clz>)ImmutableList.of(), false, $$14);
            $$11.a(new ddq.a($$19.w_()));
            this.P.put($$17, $$19);
        }
        $$11.a($$1.r());
    }

    private static void a(aif $$02, dzd $$1, boolean $$2, boolean $$32) {
        if ($$32) {
            $$1.a(gu.b.b(80), 0.0f);
            return;
        }
        aid $$4 = $$02.k();
        clt $$5 = new clt($$4.i().b().a());
        int $$6 = $$4.g().a($$02);
        if ($$6 < $$02.C_()) {
            gu $$7 = $$5.l();
            $$6 = $$02.a(dhk.a.b, $$7.u() + 8, $$7.w() + 8);
        }
        $$1.a($$5.l().b(8, $$6, 8), 0.0f);
        int $$8 = 0;
        int $$9 = 0;
        int $$10 = 0;
        int $$11 = -1;
        int $$12 = 5;
        for (int $$13 = 0; $$13 < apa.h(11); ++$$13) {
            gu $$14;
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5 && ($$14 = aia.a($$02, new clt($$5.e + $$8, $$5.f + $$9))) != null) {
                $$1.a($$14, 0.0f);
                break;
            }
            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
                int $$15 = $$10;
                $$10 = -$$11;
                $$11 = $$15;
            }
            $$8 += $$10;
            $$9 += $$11;
        }
        if ($$2) {
            $$02.B_().c(jc.as).flatMap($$0 -> $$0.b(on.m)).ifPresent($$3 -> ((dkb)$$3.a()).a($$02, $$4.g(), $$0.z, new gu($$1.a(), $$1.b(), $$1.c())));
        }
    }

    @Override
    private void a(dze $$0) {
        $$0.a(bdu.a);
        $$0.d(true);
        dzd $$1 = $$0.K();
        $$1.b(false);
        $$1.a(false);
        $$1.a(1000000000);
        $$1.b(6000L);
        $$1.a(cmj.d);
    }

    private void b(aio $$0) {
        aif $$1 = this.D();
        n.info("Preparing start region for dimension {}", (Object)$$1.ac().a());
        gu $$2 = $$1.R();
        $$0.a(new clt($$2));
        aid $$3 = $$1.k();
        this.ah = ac.b();
        $$3.a(aik.a, new clt($$2), 11, apz.a);
        while ($$3.b() != 441) {
            this.ah = ac.b() + 10L;
            this.p_();
        }
        this.ah = ac.b() + 10L;
        this.p_();
        for (aif $$4 : this.P.values()) {
            cmh $$5 = $$4.s().a(cmh::b, "chunks");
            if ($$5 == null) continue;
            LongIterator $$6 = $$5.a().iterator();
            while ($$6.hasNext()) {
                long $$7 = $$6.nextLong();
                clt $$8 = new clt($$7);
                $$4.k().a($$8, true);
            }
        }
        this.ah = ac.b() + 10L;
        this.p_();
        $$0.b();
        this.bs();
    }

    public cmj o_() {
        return this.m.m();
    }

    public boolean h() {
        return this.m.n();
    }

    public abstract int i();

    public abstract int j();

    public abstract boolean k();

    public boolean a(boolean $$0, boolean $$1, boolean $$2) {
        boolean $$3 = false;
        for (aif $$4 : this.F()) {
            if (!$$0) {
                n.info("Saving chunks for level '{}'/{}", (Object)$$4, (Object)$$4.ac().a());
            }
            $$4.a(null, $$1, $$4.e && !$$2);
            $$3 = true;
        }
        aif $$5 = this.D();
        dzd $$6 = this.m.K();
        $$6.a($$5.w_().t());
        this.m.a(this.aJ().c());
        this.h.a(this.aV(), this.m, this.ac().r());
        if ($$1) {
            for (aif $$7 : this.F()) {
                n.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", (Object)$$7.k().a.n());
            }
            n.info("ThreadedAnvilChunkStorage: All dimensions are saved");
        }
        return $$3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(boolean $$0, boolean $$1, boolean $$2) {
        try {
            this.aw = true;
            this.ac().h();
            boolean bl2 = this.a($$0, $$1, $$2);
            return bl2;
        }
        finally {
            this.aw = false;
        }
    }

    @Override
    public void close() {
        this.t();
    }

    public void t() {
        if (this.z.e()) {
            this.aR();
        }
        n.info("Stopping server");
        if (this.ad() != null) {
            this.ad().b();
        }
        this.aw = true;
        if (this.Q != null) {
            n.info("Saving players");
            this.Q.h();
            this.Q.s();
        }
        n.info("Saving worlds");
        for (aif $$02 : this.F()) {
            if ($$02 == null) continue;
            $$02.e = false;
        }
        while (this.P.values().stream().anyMatch($$0 -> $$0.k().a.f())) {
            this.ah = ac.b() + 1L;
            for (aif $$1 : this.F()) {
                $$1.k().o();
                $$1.k().a(() -> true, false);
            }
            this.p_();
        }
        this.a(false, true, false);
        for (aif $$2 : this.F()) {
            if ($$2 == null) continue;
            try {
                $$2.close();
            }
            catch (IOException $$3) {
                n.error("Exception closing the level", (Throwable)$$3);
            }
        }
        this.aw = false;
        this.au.close();
        try {
            this.h.close();
        }
        catch (IOException $$4) {
            n.error("Failed to unlock level {}", (Object)this.h.a(), (Object)$$4);
        }
    }

    public String u() {
        return this.M;
    }

    public void a_(String $$0) {
        this.M = $$0;
    }

    public boolean v() {
        return this.R;
    }

    @Override
    public void a(boolean $$0) {
        this.R = false;
        if ($$0) {
            try {
                this.ag.join();
            }
            catch (InterruptedException $$1) {
                n.error("Error while shutting down", (Throwable)$$1);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void w() {
        block25: {
            try {
                if (this.e()) {
                    this.ah = ac.b();
                    this.J = this.bh().orElse(null);
                    this.I = this.bi();
                    while (this.R) {
                        long $$0 = ac.b() - this.ah;
                        if ($$0 > 2000L && this.ah - this.ae >= 15000L) {
                            long $$1 = $$0 / 50L;
                            n.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", (Object)$$0, (Object)$$1);
                            this.ah += $$1 * 50L;
                            this.ae = this.ah;
                        }
                        if (this.F) {
                            this.F = false;
                            this.E = new c(ac.c(), this.T);
                        }
                        this.ah += 50L;
                        this.bt();
                        this.A.a("tick");
                        this.a(this::bf);
                        this.A.b("nextTickWait");
                        this.aj = true;
                        this.ai = Math.max(ac.b() + 50L, this.ah);
                        this.p_();
                        this.A.c();
                        this.bu();
                        this.ad = true;
                        bat.e.a(this.ar);
                    }
                    break block25;
                }
                throw new IllegalStateException("Failed to initialize server");
            }
            catch (Throwable $$3) {
                n.error("Encountered an unexpected exception", $$3);
                o $$4 = MinecraftServer.a($$3);
                this.b($$4.g());
                File $$5 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
                if ($$4.a($$5)) {
                    n.error("This crash report has been saved to: {}", (Object)$$5.getAbsolutePath());
                } else {
                    n.error("We were unable to save this crash report to disk.");
                }
                this.a($$4);
            }
            finally {
                try {
                    this.S = true;
                    this.t();
                }
                catch (Throwable $$2) {
                    n.error("Exception stopping the server", $$2);
                }
                finally {
                    if (this.l.e() != null) {
                        this.l.e().a();
                    }
                    this.g();
                }
            }
        }
    }

    private static o a(Throwable $$0) {
        o $$5;
        y $$1 = null;
        for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
            y $$3;
            if (!($$2 instanceof y)) continue;
            $$1 = $$3 = (y)$$2;
        }
        if ($$1 != null) {
            o $$4 = $$1.a();
            if ($$1 != $$0) {
                $$4.a("Wrapped in").a("Wrapping exception", $$0);
            }
        } else {
            $$5 = new o("Exception in server tick loop", $$0);
        }
        return $$5;
    }

    private boolean bf() {
        return this.br() || ac.b() < (this.aj ? this.ai : this.ah);
    }

    protected void p_() {
        this.bp();
        this.c(() -> !this.bf());
    }

    protected adi a(Runnable $$0) {
        return new adi(this.T, $$0);
    }

    protected boolean a(adi $$0) {
        return $$0.a() + 3 < this.T || this.bf();
    }

    @Override
    public boolean x() {
        boolean $$0;
        this.aj = $$0 = this.bg();
        return $$0;
    }

    private boolean bg() {
        if (super.x()) {
            return true;
        }
        if (this.bf()) {
            for (aif $$0 : this.F()) {
                if (!$$0.k().d()) continue;
                return true;
            }
        }
        return false;
    }

    protected void b(adi $$0) {
        this.aN().d("runTask");
        super.d($$0);
    }

    private Optional<abt.a> bh() {
        Optional<Path> $$02 = Optional.of(this.c("server-icon.png").toPath()).filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])).or(() -> this.h.e().filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])));
        return $$02.flatMap($$0 -> {
            try {
                BufferedImage $$1 = ImageIO.read($$0.toFile());
                Preconditions.checkState(($$1.getWidth() == 64 ? 1 : 0) != 0, (Object)"Must be 64 pixels wide");
                Preconditions.checkState(($$1.getHeight() == 64 ? 1 : 0) != 0, (Object)"Must be 64 pixels high");
                ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
                ImageIO.write((RenderedImage)$$1, "PNG", $$2);
                return Optional.of(new abt.a($$2.toByteArray()));
            }
            catch (Exception $$3) {
                n.error("Couldn't load server icon", (Throwable)$$3);
                return Optional.empty();
            }
        });
    }

    public Optional<Path> y() {
        return this.h.e();
    }

    public File z() {
        return new File(".");
    }

    @Override
    public void a(o $$0) {
    }

    public void g() {
    }

    @Override
    public void a(BooleanSupplier $$0) {
        long $$1 = ac.c();
        ++this.T;
        this.b($$0);
        if ($$1 - this.af >= 5000000000L) {
            this.af = $$1;
            this.I = this.bi();
        }
        if (this.T % 6000 == 0) {
            n.debug("Autosave started");
            this.A.a("save");
            this.b(true, false, false);
            this.A.c();
            n.debug("Autosave finished");
        }
        this.A.a("tallying");
        long l2 = ac.c() - $$1;
        this.k[this.T % 100] = l2;
        long $$2 = l2;
        this.ar = this.ar * 0.8f + (float)$$2 / 1000000.0f * 0.19999999f;
        long $$3 = ac.c();
        this.ap.a($$3 - $$1);
        this.A.c();
    }

    private abt bi() {
        abt.b $$0 = this.bj();
        return new abt(sw.a(this.Y), Optional.of($$0), Optional.of(abt.c.a()), Optional.ofNullable(this.J), this.aw());
    }

    private abt.b bj() {
        List<aig> $$0 = this.Q.t();
        int $$1 = this.I();
        if (this.aj()) {
            return new abt.b($$1, $$0.size(), List.of());
        }
        int $$2 = Math.min($$0.size(), 12);
        ObjectArrayList $$3 = new ObjectArrayList($$2);
        int $$4 = apa.a(this.K, 0, $$0.size() - $$2);
        for (int $$5 = 0; $$5 < $$2; ++$$5) {
            aig $$6 = $$0.get($$4 + $$5);
            $$3.add((Object)($$6.V() ? $$6.fM() : g));
        }
        ac.b($$3, this.K);
        return new abt.b($$1, $$0.size(), (List<GameProfile>)$$3);
    }

    public void b(BooleanSupplier $$0) {
        this.A.a("commandFunctions");
        this.aA().c();
        this.A.b("levels");
        for (aif $$1 : this.F()) {
            this.A.a(() -> $$1 + " " + $$1.ac().a());
            if (this.T % 20 == 0) {
                this.A.a("timeSync");
                this.b($$1);
                this.A.c();
            }
            this.A.a("tick");
            try {
                $$1.a($$0);
            }
            catch (Throwable $$2) {
                o $$3 = o.a($$2, "Exception ticking world");
                $$1.a($$3);
                throw new y($$3);
            }
            this.A.c();
            this.A.c();
        }
        this.A.b("connection");
        this.ad().c();
        this.A.b("players");
        this.Q.d();
        if (aa.aS) {
            px.a.b();
        }
        this.A.b("server gui refresh");
        for (int $$4 = 0; $$4 < this.y.size(); ++$$4) {
            this.y.get($$4).run();
        }
        this.A.c();
    }

    private void b(aif $$0) {
        this.Q.a(new yi($$0.V(), $$0.W(), $$0.X().b(cmi.k)), $$0.ac());
    }

    public void A() {
        this.A.a("timeSync");
        for (aif $$0 : this.F()) {
            this.b($$0);
        }
        this.A.c();
    }

    public boolean B() {
        return true;
    }

    public void b(Runnable $$0) {
        this.y.add($$0);
    }

    protected void b(String $$0) {
        this.at = $$0;
    }

    public boolean C() {
        return !this.ag.isAlive();
    }

    public File c(String $$0) {
        return new File(this.z(), $$0);
    }

    public final aif D() {
        return this.P.get(cmm.h);
    }

    @Nullable
    public aif a(acp<cmm> $$0) {
        return this.P.get($$0);
    }

    public Set<acp<cmm>> E() {
        return this.P.keySet();
    }

    public Iterable<aif> F() {
        return this.P.values();
    }

    public String G() {
        return aa.b().c();
    }

    public int H() {
        return this.Q.m();
    }

    public int I() {
        return this.Q.n();
    }

    public String[] J() {
        return this.Q.e();
    }

    @DontObfuscate
    public String getServerModName() {
        return b;
    }

    public ab b(ab $$0) {
        $$0.a("Server Running", () -> Boolean.toString(this.R));
        if (this.Q != null) {
            $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
        }
        $$0.a("Data Packs", () -> this.ak.f().stream().map($$0 -> $$0.f() + ($$0.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
        $$0.a("Enabled Feature Flags", () -> cay.c.b(this.m.M()).stream().map(acq::toString).collect(Collectors.joining(", ")));
        $$0.a("World Generation", () -> this.m.D().toString());
        if (this.at != null) {
            $$0.a("Server Id", () -> this.at);
        }
        return this.a($$0);
    }

    public abstract ab a(ab var1);

    public aoz K() {
        return aoz.a(b, this::getServerModName, "Server", MinecraftServer.class);
    }

    @Override
    public void a(sw $$0) {
        n.info($$0.getString());
    }

    public KeyPair L() {
        return this.aa;
    }

    public int M() {
        return this.N;
    }

    @Override
    public void a(int $$0) {
        this.N = $$0;
    }

    @Nullable
    public GameProfile N() {
        return this.ab;
    }

    public void b(@Nullable GameProfile $$0) {
        this.ab = $$0;
    }

    public boolean O() {
        return this.ab != null;
    }

    protected void P() {
        n.info("Generating keypair");
        try {
            this.aa = anz.b();
        }
        catch (aoa $$0) {
            throw new IllegalStateException("Failed to generate key pair", $$0);
        }
    }

    public void a(bdu $$0, boolean $$1) {
        if (!$$1 && this.m.t()) {
            return;
        }
        this.m.a(this.m.n() ? bdu.d : $$0);
        this.bs();
        this.ac().t().forEach(this::c);
    }

    public int b(int $$0) {
        return $$0;
    }

    private void bs() {
        for (aif $$0 : this.F()) {
            $$0.b(this.Q(), this.W());
        }
    }

    public void b(boolean $$0) {
        this.m.d($$0);
        this.ac().t().forEach(this::c);
    }

    private void c(aig $$0) {
        dyv $$1 = $$0.dI().u_();
        $$0.c.a(new ve($$1.s(), $$1.t()));
    }

    public boolean Q() {
        return this.m.s() != bdu.a;
    }

    public boolean R() {
        return this.ac;
    }

    public void c(boolean $$0) {
        this.ac = $$0;
    }

    public Optional<b> S() {
        return Optional.empty();
    }

    public boolean T() {
        return this.S().filter(b::c).isPresent();
    }

    public abstract boolean l();

    public abstract int m();

    public boolean U() {
        return this.U;
    }

    @Override
    public void d(boolean $$0) {
        this.U = $$0;
    }

    public boolean V() {
        return this.V;
    }

    public void e(boolean $$0) {
        this.V = $$0;
    }

    public boolean W() {
        return true;
    }

    public boolean X() {
        return true;
    }

    public abstract boolean n();

    public boolean Y() {
        return this.W;
    }

    public void f(boolean $$0) {
        this.W = $$0;
    }

    public boolean Z() {
        return this.X;
    }

    public void g(boolean $$0) {
        this.X = $$0;
    }

    public abstract boolean o();

    public String aa() {
        return this.Y;
    }

    @Override
    public void d(String $$0) {
        this.Y = $$0;
    }

    public boolean ab() {
        return this.S;
    }

    public alk ac() {
        return this.Q;
    }

    @Override
    public void a(alk $$0) {
        this.Q = $$0;
    }

    public abstract boolean p();

    @Override
    public void a(cmj $$0) {
        this.m.a($$0);
    }

    @Nullable
    public aix ad() {
        return this.G;
    }

    public boolean ae() {
        return this.ad;
    }

    public boolean af() {
        return false;
    }

    public boolean a(@Nullable cmj $$0, boolean $$1, int $$2) {
        return false;
    }

    public int ag() {
        return this.T;
    }

    public int ah() {
        return 16;
    }

    public boolean a(aif $$0, gu $$1, byo $$2) {
        return false;
    }

    public boolean ai() {
        return true;
    }

    public boolean aj() {
        return false;
    }

    public Proxy ak() {
        return this.j;
    }

    public int al() {
        return this.Z;
    }

    public void c(int $$0) {
        this.Z = $$0;
    }

    public MinecraftSessionService am() {
        return this.l.b();
    }

    @Nullable
    public apj an() {
        return this.l.a();
    }

    public GameProfileRepository ao() {
        return this.l.d();
    }

    @Nullable
    public alg ap() {
        return this.l.e();
    }

    @Nullable
    public abt aq() {
        return this.I;
    }

    public void ar() {
        this.af = 0L;
    }

    public int as() {
        return 29999984;
    }

    @Override
    public boolean at() {
        return super.at() && !this.ab();
    }

    @Override
    public void c(Runnable $$0) {
        if (this.ab()) {
            throw new RejectedExecutionException("Server already shutting down");
        }
        super.c($$0);
    }

    @Override
    public Thread au() {
        return this.ag;
    }

    public int av() {
        return 256;
    }

    public boolean aw() {
        return false;
    }

    public long ax() {
        return this.ah;
    }

    public DataFixer ay() {
        return this.L;
    }

    public int a(@Nullable aif $$0) {
        if ($$0 != null) {
            return $$0.X().c(cmi.r);
        }
        return 10;
    }

    public adc az() {
        return this.au.b.e();
    }

    public ade aA() {
        return this.ao;
    }

    @Override
    public CompletableFuture<Void> a(Collection<String> $$0) {
        hs.b $$13 = this.O.b(acz.d);
        CompletionStage $$2 = ((CompletableFuture)CompletableFuture.supplyAsync(() -> (ImmutableList)$$0.stream().map(this.ak::c).filter(Objects::nonNull).map(akg::e).collect(ImmutableList.toImmutableList()), this).thenCompose($$12 -> {
            akq $$22 = new akq(ajm.b, (List<ajl>)$$12);
            return ((CompletableFuture)ada.a($$22, $$13, this.m.M(), this.l() ? dt.a.b : dt.a.c, this.j(), this.as, this).whenComplete(($$1, $$2) -> {
                if ($$2 != null) {
                    $$22.close();
                }
            })).thenApply($$1 -> new a($$22, (ada)$$1));
        })).thenAcceptAsync($$1 -> {
            this.au.close();
            this.au = $$1;
            this.ak.a($$0);
            cnf $$2 = new cnf(MinecraftServer.a(this.ak), this.m.M());
            this.m.a($$2);
            this.au.b.a(this.aV());
            this.ac().h();
            this.ac().u();
            this.ao.a(this.au.b.a());
            this.av.a(this.au.a);
        }, (Executor)this);
        if (this.bl()) {
            this.c(((CompletableFuture)$$2)::isDone);
        }
        return $$2;
    }

    public static cnf a(aki $$0, cma $$1, boolean $$2, caw $$3) {
        $$0.a();
        if ($$2) {
            $$0.a(Collections.singleton(b));
            return cnf.c;
        }
        LinkedHashSet $$4 = Sets.newLinkedHashSet();
        for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
                $$4.add($$5);
                continue;
            }
            n.warn("Missing data pack {}", (Object)$$5);
        }
        for (akg $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if ($$1.b().contains($$7)) continue;
            caw $$8 = $$6.d();
            boolean $$9 = $$4.contains($$7);
            if (!$$9 && $$6.j().a()) {
                if ($$8.a($$3)) {
                    n.info("Found new data pack {}, loading it automatically", (Object)$$7);
                    $$4.add($$7);
                } else {
                    n.info("Found new data pack {}, but can't load it due to missing features {}", (Object)$$7, (Object)cay.a($$3, $$8));
                }
            }
            if (!$$9 || $$8.a($$3)) continue;
            n.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", (Object)$$7, (Object)cay.a($$3, $$8));
            $$4.remove($$7);
        }
        if ($$4.isEmpty()) {
            n.info("No datapacks selected, forcing vanilla");
            $$4.add(b);
        }
        $$0.a($$4);
        cma $$10 = MinecraftServer.a($$0);
        caw $$11 = $$0.e();
        return new cnf($$10, $$11);
    }

    private static cma a(aki $$0) {
        Collection<String> $$12 = $$0.d();
        ImmutableList $$2 = ImmutableList.copyOf($$12);
        List $$3 = (List)$$0.b().stream().filter($$1 -> !$$12.contains($$1)).collect(ImmutableList.toImmutableList());
        return new cma((List<String>)$$2, $$3);
    }

    @Override
    public void a(ds $$0) {
        if (!this.aK()) {
            return;
        }
        alk $$1 = $$0.l().ac();
        als $$2 = $$1.i();
        ArrayList $$3 = Lists.newArrayList($$1.t());
        for (aig $$4 : $$3) {
            if ($$2.a($$4.fM())) continue;
            $$4.c.b(sw.c("multiplayer.disconnect.not_whitelisted"));
        }
    }

    public aki aB() {
        return this.ak;
    }

    public dt aC() {
        return this.au.b.d();
    }

    public ds aD() {
        aif $$0 = this.D();
        return new ds(this, $$0 == null ? eei.b : eei.a($$0.R()), eeh.a, $$0, 4, "Server", sw.b("Server"), this, null);
    }

    @Override
    public boolean e_() {
        return true;
    }

    @Override
    public boolean q_() {
        return true;
    }

    @Override
    public abstract boolean N_();

    public cjd aE() {
        return this.au.b.c();
    }

    public adg aF() {
        return this.al;
    }

    public dyr aG() {
        if (this.am == null) {
            throw new NullPointerException("Called before server init");
        }
        return this.am;
    }

    public dzn aH() {
        return this.au.b.b();
    }

    public cmi aI() {
        return this.D().X();
    }

    public ado aJ() {
        return this.an;
    }

    public boolean aK() {
        return this.aq;
    }

    public void h(boolean $$0) {
        this.aq = $$0;
    }

    public float aL() {
        return this.ar;
    }

    public int c(GameProfile $$0) {
        if (this.ac().f($$0)) {
            alm $$1 = (alm)this.ac().k().b($$0);
            if ($$1 != null) {
                return $$1.a();
            }
            if (this.a($$0)) {
                return 4;
            }
            if (this.O()) {
                return this.ac().v() ? 4 : 0;
            }
            return this.i();
        }
        return 0;
    }

    public aoo aM() {
        return this.ap;
    }

    public ban aN() {
        return this.A;
    }

    public abstract boolean a(GameProfile var1);

    @Override
    public void a(Path $$0) throws IOException {
    }

    private void b(Path $$0) {
        Path $$1 = $$0.resolve("levels");
        try {
            for (Map.Entry<acp<cmm>, aif> $$2 : this.P.entrySet()) {
                acq $$3 = $$2.getKey().a();
                Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
                Files.createDirectories($$4, new FileAttribute[0]);
                $$2.getValue().a($$4);
            }
            this.d($$0.resolve("gamerules.txt"));
            this.e($$0.resolve("classpath.txt"));
            this.c($$0.resolve("stats.txt"));
            this.f($$0.resolve("threads.txt"));
            this.a($$0.resolve("server.properties.txt"));
            this.g($$0.resolve("modules.txt"));
        }
        catch (IOException $$5) {
            n.warn("Failed to save debug report", (Throwable)$$5);
        }
    }

    private void c(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bm()));
            $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", Float.valueOf(this.aL())));
            $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.k)));
            $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
        }
    }

    @Override
    private void d(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            final ArrayList $$2 = Lists.newArrayList();
            final cmi $$3 = this.aI();
            cmi.a(new cmi.c(){

                @Override
                public <T extends cmi.g<T>> void a(cmi.e<T> $$0, cmi.f<T> $$1) {
                    $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
                }
            });
            for (String $$4 : $$2) {
                $$1.write($$4);
            }
        }
    }

    private void e(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            String $$2 = System.getProperty("java.class.path");
            String $$3 = System.getProperty("path.separator");
            for (String $$4 : Splitter.on((String)$$3).split((CharSequence)$$2)) {
                $$1.write($$4);
                $$1.write("\n");
            }
        }
    }

    private void f(Path $$0) throws IOException {
        ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
        ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
        Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));
        try (BufferedWriter $$3 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            for (ThreadInfo $$4 : $$2) {
                $$3.write($$4.toString());
                ((Writer)$$3).write(10);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void g(Path $$02) throws IOException {
        BufferedWriter $$1 = Files.newBufferedWriter($$02, new OpenOption[0]);
        try {
            void $$4;
            try {
                ArrayList $$2 = Lists.newArrayList(apb.a());
            }
            catch (Throwable $$3) {
                n.warn("Failed to list native modules", $$3);
                if ($$1 != null) {
                    ((Writer)$$1).close();
                }
                return;
            }
            $$4.sort(Comparator.comparing($$0 -> $$0.a));
            for (apb.a $$5 : $$4) {
                $$1.write($$5.toString());
                ((Writer)$$1).write(10);
            }
        }
        finally {
            if ($$1 != null) {
                try {
                    ((Writer)$$1).close();
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    throwable2.addSuppressed(throwable);
                }
            }
        }
    }

    private void bt() {
        if (this.D) {
            this.z = bbx.a(new bcb(ac.a, this.l()), ac.a, ac.g(), new bcd("server"), this.B, $$0 -> {
                this.h(() -> this.b($$0.resolve("server")));
                this.C.accept((Path)$$0);
            });
            this.D = false;
        }
        this.A = baq.a(this.z.f(), baq.a("Server"));
        this.z.c();
        this.A.a();
    }

    private void bu() {
        this.A.b();
        this.z.d();
    }

    public boolean aO() {
        return this.z.e();
    }

    public void a(Consumer<bam> $$0, Consumer<Path> $$12) {
        this.B = $$1 -> {
            this.aP();
            $$0.accept((bam)$$1);
        };
        this.C = $$12;
        this.D = true;
    }

    public void aP() {
        this.z = bby.a;
    }

    public void aQ() {
        this.z.a();
    }

    public void aR() {
        this.z.b();
        this.A = this.z.f();
    }

    public Path a(dyw $$0) {
        return this.h.a($$0);
    }

    public boolean aS() {
        return true;
    }

    public dvu aT() {
        return this.av;
    }

    public dze aU() {
        return this.m;
    }

    public hs.b aV() {
        return this.O.a();
    }

    public hl<acz> aW() {
        return this.O;
    }

    public ajd a(aig $$0) {
        return ajd.a;
    }

    public aih b(aig $$0) {
        return this.R() ? new ahw($$0) : new aih($$0);
    }

    @Nullable
    public cmj aX() {
        return null;
    }

    public akx aY() {
        return this.au.a;
    }

    public boolean aZ() {
        return this.aw;
    }

    public boolean ba() {
        return this.F || this.E != null;
    }

    public void bb() {
        this.F = true;
    }

    public bam bc() {
        if (this.E == null) {
            return bai.a;
        }
        bam $$0 = this.E.a(ac.c(), this.T);
        this.E = null;
        return $$0;
    }

    public int bd() {
        return 1000000;
    }

    public void a(sw $$0, ss.a $$1, @Nullable String $$2) {
        String $$3 = $$1.a($$0).getString();
        if ($$2 != null) {
            n.info("[{}] {}", (Object)$$2, (Object)$$3);
        } else {
            n.info("{}", (Object)$$3);
        }
    }

    public sr be() {
        return sr.a;
    }

    @Override
    public /* synthetic */ void d(Runnable runnable) {
        this.b((adi)runnable);
    }

    @Override
    public /* synthetic */ boolean e(Runnable runnable) {
        return this.a((adi)runnable);
    }

    @Override
    public /* synthetic */ Runnable f(Runnable runnable) {
        return this.a(runnable);
    }

    static final class a
    extends Record
    implements AutoCloseable {
        final akn a;
        final ada b;

        a(akn $$0, ada $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this, $$0);
        }

        public akn a() {
            return this.a;
        }

        public ada b() {
            return this.b;
        }
    }

    static class c {
        final long a;
        final int b;

        c(long $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        bam a(final long $$0, final int $$1) {
            return new bam(){

                @Override
                public List<bap> a(String $$02) {
                    return Collections.emptyList();
                }

                @Override
                public boolean a(Path $$02) {
                    return false;
                }

                @Override
                public long a() {
                    return a;
                }

                @Override
                public int b() {
                    return b;
                }

                @Override
                public long c() {
                    return $$0;
                }

                @Override
                public int d() {
                    return $$1;
                }

                @Override
                public String e() {
                    return "";
                }
            };
        }
    }

    public record b(String a, String b, boolean c, @Nullable sw d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "url;hash;isRequired;prompt", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "url;hash;isRequired;prompt", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "url;hash;isRequired;prompt", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

