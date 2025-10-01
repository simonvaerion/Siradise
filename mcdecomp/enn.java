/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Queues
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.UserApiService$UserFlag
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.yggdrasil.ServicesKeyType
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2BooleanFunction
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.joml.Matrix4f
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.joml.Matrix4f;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class enn
extends bcr<Runnable>
implements eho {
    static enn F;
    private static final Logger G;
    public static final boolean a;
    private static final int H = 10;
    public static final acq b;
    public static final acq c;
    public static final acq d;
    private static final acq I;
    private static final CompletableFuture<apz> J;
    private static final sw K;
    public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
    private final Path L;
    private final PropertyMap M;
    private final fuw N;
    private final DataFixer O;
    private final fkm P;
    private final ehn Q;
    private final eoa R = new eoa(20.0f, 0L);
    private final fkd S;
    public final fjv f;
    private final fow T;
    private final fpw U;
    public final fho g;
    private final fyk V = new fyk();
    private final eoc W;
    public final eov h;
    public final eov i;
    public final fjq j;
    public final fnd k;
    private final AtomicReference<ais> X = new AtomicReference();
    public final eow l;
    public final enr m;
    private final enj Y;
    public final eno n;
    public final enm o;
    private enk Z = enk.a;
    public final File p;
    private final String aa;
    private final String ab;
    private final Proxy ac;
    private final dyy ad;
    public final aoo q = new aoo();
    private final boolean ae;
    private final boolean af;
    private final boolean ag;
    private final boolean ah;
    private final aku ai;
    private final ajo aj;
    private final fvn ak;
    private final aki al;
    private final fwb am;
    private final eoo an;
    private final eos ao;
    private final egv ap;
    private final fzc aq;
    private final fyx ar;
    private final erm as;
    private final fvv at;
    private final fjr au;
    private final ent av = new ent(I, (Object2BooleanFunction<String>)((Object2BooleanFunction)enn::b));
    private final YggdrasilAuthenticationService aw;
    private final MinecraftSessionService ax;
    private final UserApiService ay;
    private final fvu az;
    private final fwx aA;
    private final fko aB;
    private final fvt aC;
    private final fvs aD;
    private final erh aE;
    private final gaf aF;
    private final eys aG;
    private final fea aH;
    private final flt aI;
    private final fzg aJ;
    private final ffc aK;
    private final ekq aL;
    private final fjg aM;
    @Nullable
    public ffa r;
    @Nullable
    public few s;
    @Nullable
    public fiy t;
    @Nullable
    private fyp aN;
    @Nullable
    private sd aO;
    private boolean aP;
    @Nullable
    public bfj u;
    @Nullable
    public bfj v;
    @Nullable
    public eeg w;
    private int aQ;
    protected int x;
    private volatile boolean aR;
    private float aS;
    private long aT = ac.c();
    private long aU;
    private int aV;
    public boolean y;
    @Nullable
    public euq z;
    @Nullable
    private euk aW;
    private boolean aX;
    private Thread aY;
    private volatile boolean aZ;
    @Nullable
    private Supplier<o> ba;
    private static int bb;
    public String A = "";
    private long bc;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E = true;
    private boolean bd;
    private final Queue<Runnable> be = Queues.newConcurrentLinkedQueue();
    @Nullable
    private CompletableFuture<Void> bf;
    @Nullable
    private eri bg;
    private ban bh = bak.a;
    private int bi;
    private final bah bj = new bah(ac.a, () -> this.bi);
    @Nullable
    private bam bk;
    private bbz bl = bby.a;
    private final enx bm = new enx();
    private long bn;
    private double bo;
    @Nullable
    private eic.a bp;
    private final env bq;
    private final enf br;
    private final ffg bs;
    private ffs bt;
    private String bu = "root";

    public enn(ezy $$02) {
        super("Client");
        eha $$5;
        F = this;
        this.p = $$02.c.a;
        File $$1 = $$02.c.c;
        this.L = $$02.c.b.toPath();
        this.aa = $$02.d.b;
        this.ab = $$02.d.c;
        this.M = $$02.a.c;
        fvl $$2 = new fvl($$02.c.a());
        this.ak = new fvn(new File(this.p, "server-resource-packs"));
        akf $$32 = new akf(this.L, ajm.a, akj.b);
        this.al = new aki($$2, this.ak, $$32);
        this.aj = $$2.a();
        this.ac = $$02.a.d;
        this.aw = new YggdrasilAuthenticationService(this.ac);
        this.ax = this.aw.createMinecraftSessionService();
        this.ay = this.a(this.aw, $$02);
        this.W = $$02.a.a;
        G.info("Setting user: {}", (Object)this.W.c());
        G.debug("(Session ID is {})", (Object)this.W.a());
        this.af = $$02.d.a;
        this.ag = !$$02.d.d;
        this.ah = !$$02.d.e;
        this.ae = enn.bd();
        this.aN = null;
        ua.a(enl::a);
        this.O = aqd.a();
        this.aE = new erh(this);
        this.aY = Thread.currentThread();
        this.m = new enr(this, this.p);
        RenderSystem.setShaderGlintAlpha(this.m.ai().c());
        this.aZ = true;
        this.aF = new gaf(this, this.m);
        this.Y = new enj(this.p, this.O);
        G.info("Backend library: {}", (Object)RenderSystem.getBackendDescription());
        if (this.m.p > 0 && this.m.o > 0) {
            eha $$4 = new eha(this.m.o, this.m.p, $$02.b.c, $$02.b.d, $$02.b.e);
        } else {
            $$5 = $$02.b;
        }
        ac.a = RenderSystem.initBackendSystem();
        this.P = new fkm(this);
        this.Q = this.P.a($$5, this.m.k, this.ba());
        this.a(true);
        fzr.a.b(fzn.A);
        try {
            this.Q.a(this.aj, aa.b().g() ? ehd.a : ehd.b);
        }
        catch (IOException $$6) {
            G.error("Couldn't set icon", (Throwable)$$6);
        }
        this.Q.a(this.m.g().c());
        this.n = new eno(this);
        this.n.a(this.Q.i());
        this.o = new enm(this);
        this.o.a(this.Q.i());
        RenderSystem.initRenderer(this.m.u, false);
        this.ap = new egs(this.Q.k(), this.Q.l());
        this.ap.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.ap.b(a);
        this.ai = new aku(ajm.a);
        this.al.a();
        this.m.b(this.al);
        this.am = new fwb(this.m.ag);
        this.ai.a(this.am);
        this.N = new fuw(this.ai);
        this.ai.a(this.N);
        this.az = new fvu(this.N, new File($$1, "skins"), this.ax);
        Path $$7 = this.p.toPath();
        edy $$8 = dyy.a($$7.resolve("allowed_symlinks.txt"));
        this.ad = new dyy($$7.resolve("saves"), $$7.resolve("backups"), $$8, this.O);
        this.aq = new fzc(this.m);
        this.ai.a(this.aq);
        this.at = new fvv(this.W);
        this.ai.a(this.at);
        this.ar = new fyx(this);
        this.as = new erm(this.N);
        this.h = this.as.a();
        this.i = this.as.b();
        this.ai.a(this.as);
        this.b(this.i());
        this.ai.a(new fvp());
        this.ai.a(new fvo());
        this.Q.a("Startup");
        RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
        this.Q.a("Post startup");
        this.an = eoo.a();
        this.ao = eos.a(this.an);
        this.aA = new fwx(this.N, this.an, this.m.y().c());
        this.ai.a(this.aA);
        this.aH = new fea();
        this.ai.a(this.aH);
        this.aI = new flt(this.h, this.aH, this::am, this::ap, this::an);
        this.ai.a(this.aI);
        fjj $$9 = new fjj(this.aI, this.aH);
        this.ai.a($$9);
        this.U = new fpw(this, this.N, this.aA, this.ao, $$9);
        this.ai.a(this.U);
        this.S = new fkd();
        this.aG = new eys(this, this.ay);
        this.aB = new fko(this.aA.b(), $$9, this.an);
        this.ai.a(this.aB);
        this.T = new fow(this, this.N, this.U, this.aB, this.h, this.m, this.aH);
        this.ai.a(this.T);
        this.j = new fjq(this, this.T.d(), this.ai, this.S);
        this.ai.a(this.j.e());
        this.f = new fjv(this, this.T, this.aI, this.S);
        this.ai.a(this.f);
        this.bc();
        this.ai.a(this.V);
        this.g = new fho(this.s, this.N);
        this.ai.a(this.g);
        this.aC = new fvt(this.N);
        this.ai.a(this.aC);
        this.aD = new fvs(this.N);
        this.ai.a(this.aD);
        this.au = new fjr();
        this.ai.a(this.au);
        this.ai.a(this.av);
        this.l = new eow(this, this.U);
        this.k = new fnd(this);
        eiz $$10 = eiz.a(this);
        this.aL = new ekq($$10);
        RenderSystem.setErrorCallback(this::a);
        if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
            StringBuilder $$11 = new StringBuilder("Recovering from unsupported resolution (" + this.Q.k() + "x" + this.Q.l() + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).");
            if (ehb.b()) {
                $$11.append("\n\nReported GL debug messages:\n").append(String.join((CharSequence)"\n", ehb.a()));
            }
            this.Q.a(this.ap.c, this.ap.d);
            TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)$$11.toString(), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        } else if (this.m.V().c().booleanValue() && !this.Q.j()) {
            this.Q.h();
            this.m.V().a(this.Q.j());
        }
        this.Q.a(this.m.J().c());
        this.Q.b(this.m.C().c());
        this.Q.c();
        this.a();
        this.j.a(this.aj.c());
        this.aJ = new fzg(this, this.ay, this.W);
        this.aK = ffc.a(this.ay, this.W, $$7);
        this.bq = new env(this);
        this.br = new enf(this);
        this.br.a(this.m.an().c() != enp.a);
        this.bs = new ffg(this);
        this.bs.a(this.m.w().c());
        this.bt = ffs.a(ffq.a(), this.ay);
        eud.a(this);
        List<ajl> $$12 = this.al.g();
        this.bm.a(enx.b.a, $$12);
        akt $$13 = this.ai.a(ac.f(), this, J, $$12);
        fzr.a.a(fzn.C);
        this.a(new eud(this, $$13, $$0 -> ac.a($$0, this::a, () -> {
            if (aa.aS) {
                this.be();
            }
            this.bm.a();
            this.aZ();
        }), false));
        this.aM = fjg.a($$02.e.b());
        if (this.E()) {
            this.a(etg.a($$3 -> {
                if ($$3) {
                    ac.i().a("https://aka.ms/mcjavamoderation");
                }
                this.a($$10, $$13, $$2.e);
            }, this.F()));
        } else {
            this.a($$10, $$13, $$02.e);
        }
    }

    private void aZ() {
        fzr.a.b(fzn.C);
        fzr.a.b(fzn.z);
        fzr.a.a(this.aJ.a());
    }

    private void a(eiz $$0, akt $$1, ezy.c $$2) {
        if ($$2.a()) {
            fjf.a(this, $$2, $$1, $$0);
        } else if (this.m.ah) {
            this.a(new etc(this.m));
        } else {
            this.a(new euw(true));
        }
    }

    private static boolean b(Object $$0) {
        try {
            return Locale.getDefault().getISO3Country().equals($$0);
        }
        catch (MissingResourceException $$1) {
            return false;
        }
    }

    public void c() {
        this.Q.b(this.ba());
    }

    private String ba() {
        StringBuilder $$0 = new StringBuilder("Minecraft");
        if (enn.d().a()) {
            $$0.append("*");
        }
        $$0.append(" ");
        $$0.append(aa.b().c());
        fex $$1 = this.I();
        if ($$1 != null && $$1.g().h()) {
            $$0.append(" - ");
            if (this.aN != null && !this.aN.p()) {
                $$0.append(fvz.a("title.singleplayer", new Object[0]));
            } else if (this.ar()) {
                $$0.append(fvz.a("title.multiplayer.realms", new Object[0]));
            } else if (this.aN != null || this.P() != null && this.P().d()) {
                $$0.append(fvz.a("title.multiplayer.lan", new Object[0]));
            } else {
                $$0.append(fvz.a("title.multiplayer.other", new Object[0]));
            }
        }
        return $$0.toString();
    }

    private UserApiService a(YggdrasilAuthenticationService $$0, ezy $$1) {
        try {
            return $$0.createUserApiService($$1.a.a.d());
        }
        catch (AuthenticationException $$2) {
            G.error("Failed to verify authentication", (Throwable)$$2);
            return UserApiService.OFFLINE;
        }
    }

    public static aoz d() {
        return aoz.a("vanilla", ClientBrandRetriever::getClientModName, "Client", enn.class);
    }

    @Override
    private void a(Throwable $$0) {
        if (this.al.d().size() > 1) {
            this.a($$0, null);
        } else {
            ac.a($$0);
        }
    }

    public void a(Throwable $$0, @Nullable sw $$1) {
        G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
        this.bm.a($$0);
        this.al.a(Collections.emptyList());
        this.m.i.clear();
        this.m.j.clear();
        this.m.aq();
        this.e(true).thenRun(() -> this.a($$1));
    }

    private void bb() {
        this.a((euk)null);
        if (this.s != null) {
            this.s.U();
            this.y();
        }
        this.a(new euw());
        this.a((sw)null);
    }

    @Override
    private void a(@Nullable sw $$0) {
        erh $$1 = this.az();
        erf.b($$1, erf.a.d, sw.c("resourcePack.load_fail"), $$0);
    }

    public void e() {
        this.aY = Thread.currentThread();
        if (Runtime.getRuntime().availableProcessors() > 4) {
            this.aY.setPriority(10);
        }
        try {
            boolean $$0 = false;
            while (this.aZ) {
                if (this.ba != null) {
                    enn.c(this.ba.get());
                    return;
                }
                try {
                    baq $$1 = baq.a("Renderer");
                    boolean $$2 = this.bf();
                    this.bh = this.a($$2, $$1);
                    this.bh.a();
                    this.bl.c();
                    this.f(!$$0);
                    this.bl.d();
                    this.bh.b();
                    this.b($$2, $$1);
                }
                catch (OutOfMemoryError $$3) {
                    if ($$0) {
                        throw $$3;
                    }
                    this.o();
                    this.a(new euj());
                    System.gc();
                    G.error(LogUtils.FATAL_MARKER, "Out of memory", (Throwable)$$3);
                    $$0 = true;
                }
            }
        }
        catch (y $$4) {
            this.d($$4.a());
            this.o();
            G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", (Throwable)$$4);
            enn.c($$4.a());
        }
        catch (Throwable $$5) {
            o $$6 = this.d(new o("Unexpected error", $$5));
            G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", $$5);
            this.o();
            enn.c($$6);
        }
    }

    void b(boolean $$0) {
        this.as.a((Map<acq, acq>)($$0 ? ImmutableMap.of((Object)b, (Object)c) : ImmutableMap.of()));
    }

    private void bc() {
        this.V.a(fyk.a, $$03 -> new fyd<cfz>($$02 -> $$02.a(null, chq.a.a.c()).stream().map($$0 -> n.a($$0.getString()).trim()).filter($$0 -> !$$0.isEmpty()), $$0 -> Stream.of(jb.i.b($$0.d())), (List<cfz>)$$03));
        this.V.a(fyk.b, $$02 -> new fye<cfz>($$0 -> $$0.f().map(anl::b), (List<cfz>)$$02));
        this.V.a(fyk.c, $$03 -> new fyd<eyg>($$02 -> $$02.e().stream().flatMap($$1 -> $$1.a($$02.a()).a(null, chq.a.a).stream()).map($$0 -> n.a($$0.getString()).trim()).filter($$0 -> !$$0.isEmpty()), $$0 -> $$0.e().stream().map($$1 -> jb.i.b($$1.a($$0.a()).d())), (List<eyg>)$$03));
        ceg.e().a((List<cfz> $$0) -> {
            this.a(fyk.a, (List)$$0);
            this.a(fyk.b, (List)$$0);
        });
    }

    private void a(int $$0, long $$1) {
        this.m.J().a(false);
        this.m.aq();
    }

    private static boolean bd() {
        String[] $$0;
        for (String $$1 : $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"}) {
            String $$2 = System.getProperty($$1);
            if ($$2 == null || !$$2.contains("64")) continue;
            return true;
        }
        return false;
    }

    public egv f() {
        return this.ap;
    }

    public String g() {
        return this.aa;
    }

    public String h() {
        return this.ab;
    }

    @Override
    public void a(o $$0) {
        this.ba = () -> this.d($$0);
    }

    public void b(o $$0) {
        this.ba = () -> $$0;
    }

    public static void c(o $$0) {
        File $$1 = new File(enn.N().p, "crash-reports");
        File $$2 = new File($$1, "crash-" + ac.e() + "-client.txt");
        acs.a($$0.e());
        if ($$0.f() != null) {
            acs.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
            System.exit(-1);
        } else if ($$0.a($$2)) {
            acs.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
            System.exit(-1);
        } else {
            acs.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public boolean i() {
        return this.m.L().c();
    }

    public CompletableFuture<Void> j() {
        return this.e(false);
    }

    private CompletableFuture<Void> e(boolean $$0) {
        if (this.bf != null) {
            return this.bf;
        }
        CompletableFuture<Void> $$1 = new CompletableFuture<Void>();
        if (!$$0 && this.aW instanceof eud) {
            this.bf = $$1;
            return $$1;
        }
        this.al.a();
        List<ajl> $$22 = this.al.g();
        if (!$$0) {
            this.bm.a(enx.b.b, $$22);
        }
        this.a(new eud(this, this.ai.a(ac.f(), this, J, $$22), $$2 -> ac.a($$2, (T $$1) -> {
            if ($$0) {
                this.bb();
            } else {
                this.a((Throwable)$$1);
            }
        }, () -> {
            this.f.f();
            this.bm.a();
            $$1.complete(null);
        }), true));
        return $$1;
    }

    private void be() {
        boolean $$0 = false;
        fkn $$1 = this.am().a();
        fwr $$2 = $$1.a().a();
        for (cpn $$3 : jb.f) {
            for (dcb $$4 : $$3.l().a()) {
                fwr $$5;
                if ($$4.l() != cvs.c || ($$5 = $$1.b($$4)) != $$2) continue;
                G.debug("Missing model for: {}", (Object)$$4);
                $$0 = true;
            }
        }
        fuv $$6 = $$2.e();
        for (cpn $$7 : jb.f) {
            for (dcb $$8 : $$7.l().a()) {
                fuv $$9 = $$1.a($$8);
                if ($$8.i() || $$9 != $$6) continue;
                G.debug("Missing particle icon for: {}", (Object)$$8);
            }
        }
        for (cfu $$10 : jb.i) {
            cfz $$11 = $$10.ae_();
            String $$12 = $$11.q();
            String $$13 = sw.c($$12).getString();
            if (!$$13.toLowerCase(Locale.ROOT).equals($$10.a())) continue;
            G.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
        }
        $$0 |= eue.a();
        if ($$0 |= foz.a()) {
            throw new IllegalStateException("Your game data is foobar, fix the errors above!");
        }
    }

    public dyy k() {
        return this.ad;
    }

    @Override
    private void a(String $$02) {
        a $$1 = this.G();
        if (!$$1.a(this.Q())) {
            if (this.l.b()) {
                this.l.b(false);
                this.a(new etj($$0 -> {
                    if ($$0) {
                        ac.i().a("https://aka.ms/JavaAccountSettings");
                    }
                    this.a((euq)null);
                }, enn$a.e, "https://aka.ms/JavaAccountSettings", true));
            } else {
                sw $$2 = $$1.a();
                this.l.a($$2, false);
                this.br.c($$2);
                this.l.b($$1 == enn$a.d);
            }
        } else {
            this.a(new eti($$02));
        }
    }

    @Override
    public void a(@Nullable euq $$0) {
        if (aa.aS && Thread.currentThread() != this.aY) {
            G.error("setScreen called from non-game thread");
        }
        if (this.z != null) {
            this.z.ax_();
        }
        if ($$0 == null && this.s == null) {
            $$0 = new euw();
        } else if ($$0 == null && this.t.es()) {
            if (this.t.y()) {
                $$0 = new etq(null, this.s.k().n());
            } else {
                this.t.fL();
            }
        }
        this.z = $$0;
        if (this.z != null) {
            this.z.ay_();
        }
        eif.a();
        if ($$0 != null) {
            this.n.j();
            enl.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.y = false;
        } else {
            this.aq.g();
            this.n.i();
        }
        this.c();
    }

    @Override
    public void a(@Nullable euk $$0) {
        this.aW = $$0;
    }

    public void l() {
        try {
            G.info("Stopping!");
            try {
                this.br.c();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (this.s != null) {
                    this.s.U();
                }
                this.y();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (this.z != null) {
                this.z.ax_();
            }
            this.close();
        }
        finally {
            ac.a = System::nanoTime;
            if (this.ba == null) {
                System.exit(0);
            }
        }
    }

    @Override
    public void close() {
        if (this.bp != null) {
            this.bp.a();
        }
        try {
            this.aJ.close();
            this.av.close();
            this.aA.close();
            this.as.close();
            this.j.close();
            this.f.close();
            this.aq.f();
            this.g.a();
            this.aD.close();
            this.aC.close();
            this.N.close();
            this.ai.close();
            ac.h();
        }
        catch (Throwable $$0) {
            G.error("Shutdown failure!", $$0);
            throw $$0;
        }
        finally {
            this.P.close();
            this.Q.close();
        }
    }

    private void f(boolean $$02) {
        boolean $$11;
        boolean $$8;
        Runnable $$3;
        this.Q.a("Pre render");
        long $$1 = ac.c();
        if (this.Q.b()) {
            this.p();
        }
        if (this.bf != null && !(this.aW instanceof eud)) {
            CompletableFuture<Void> $$2 = this.bf;
            this.bf = null;
            this.j().thenRun(() -> $$2.complete(null));
        }
        while (($$3 = this.be.poll()) != null) {
            $$3.run();
        }
        if ($$02) {
            int $$4 = this.R.a(ac.b());
            this.bh.a("scheduledExecutables");
            this.bp();
            this.bh.c();
            this.bh.a("tick");
            for (int $$5 = 0; $$5 < Math.min(10, $$4); ++$$5) {
                this.bh.d("clientTick");
                this.s();
            }
            this.bh.c();
        }
        this.n.a();
        this.Q.a("Render");
        this.bh.a("sound");
        this.aq.a(this.j.m());
        this.bh.c();
        this.bh.a("render");
        long $$6 = ac.c();
        if (this.m.aa || this.bl.e()) {
            boolean $$7;
            boolean bl2 = $$7 = this.bp == null || this.bp.b();
            if ($$7) {
                eic.a().ifPresent(eic::b);
            }
        } else {
            $$8 = false;
            this.bo = 0.0;
        }
        RenderSystem.clear(16640, a);
        this.ap.a(true);
        fjp.a();
        this.bh.a("display");
        RenderSystem.enableCull();
        this.bh.c();
        if (!this.y) {
            this.bh.b("gameRenderer");
            this.j.a(this.aR ? this.aS : this.R.a, $$1, $$02);
            this.bh.c();
        }
        if (this.bk != null) {
            this.bh.a("fpsPie");
            eox $$9 = new eox(this, this.S.b());
            this.a($$9, this.bk);
            $$9.e();
            this.bh.c();
        }
        this.bh.a("blit");
        this.ap.e();
        this.ap.a(this.Q.k(), this.Q.l());
        this.bc = ac.c() - $$6;
        if ($$8) {
            eic.a().ifPresent($$0 -> {
                this.bp = $$0.c();
            });
        }
        this.bh.b("updateDisplay");
        this.Q.e();
        int $$10 = this.bg();
        if ($$10 < 260) {
            RenderSystem.limitDisplayFPS($$10);
        }
        this.bh.b("yield");
        Thread.yield();
        this.bh.c();
        this.Q.a("Post render");
        ++this.aV;
        boolean bl3 = $$11 = this.R() && (this.z != null && this.z.az_() || this.aW != null && this.aW.a()) && !this.aN.p();
        if (this.aR != $$11) {
            if (this.aR) {
                this.aS = this.R.a;
            } else {
                this.R.a = this.aS;
            }
            this.aR = $$11;
        }
        long $$12 = ac.c();
        long $$13 = $$12 - this.aT;
        if ($$8) {
            this.bn = $$13;
        }
        this.q.a($$13);
        this.aT = $$12;
        this.bh.a("fpsUpdate");
        if (this.bp != null && this.bp.b()) {
            this.bo = (double)this.bp.c() * 100.0 / (double)this.bn;
        }
        while (ac.b() >= this.aU + 1000L) {
            String $$15;
            if (this.bo > 0.0) {
                String $$14 = " GPU: " + (this.bo > 100.0 ? n.m + "100%" : Math.round(this.bo) + "%");
            } else {
                $$15 = "";
            }
            bb = this.aV;
            this.A = String.format(Locale.ROOT, "%d fps T: %s%s%s%s B: %d%s", bb, $$10 == 260 ? "inf" : Integer.valueOf($$10), this.m.J().c() != false ? " vsync" : "", this.m.i().c(), this.m.h().c() == enc.a ? "" : (this.m.h().c() == enc.b ? " fast-clouds" : " fancy-clouds"), this.m.A().c(), $$15);
            this.aU += 1000L;
            this.aV = 0;
        }
        this.bh.c();
    }

    private boolean bf() {
        return this.m.aa && this.m.ab && !this.m.Z;
    }

    private ban a(boolean $$0, @Nullable baq $$1) {
        ban $$3;
        if (!$$0) {
            this.bj.b();
            if (!this.bl.e() && $$1 == null) {
                return bak.a;
            }
        }
        if ($$0) {
            if (!this.bj.a()) {
                this.bi = 0;
                this.bj.c();
            }
            ++this.bi;
            ban $$2 = this.bj.d();
        } else {
            $$3 = bak.a;
        }
        if (this.bl.e()) {
            $$3 = ban.a($$3, this.bl.f());
        }
        return baq.a($$3, $$1);
    }

    private void b(boolean $$0, @Nullable baq $$1) {
        if ($$1 != null) {
            $$1.b();
        }
        this.bk = $$0 ? this.bj.e() : null;
        this.bh = this.bj.d();
    }

    @Override
    public void a() {
        int $$0 = this.Q.a((int)this.m.al().c(), this.i());
        this.Q.a((double)$$0);
        if (this.z != null) {
            this.z.a(this, this.Q.o(), this.Q.p());
        }
        egv $$1 = this.f();
        $$1.a(this.Q.k(), this.Q.l(), a);
        this.j.a(this.Q.k(), this.Q.l());
        this.n.g();
    }

    @Override
    public void b() {
        this.n.k();
    }

    public int m() {
        return bb;
    }

    public long n() {
        return this.bc;
    }

    private int bg() {
        if (this.s == null && (this.z != null || this.aW != null)) {
            return 60;
        }
        return this.Q.d();
    }

    public void o() {
        try {
            aoy.b();
            this.f.p();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            if (this.aP && this.aN != null) {
                this.aN.a(true);
            }
            this.b(new etx(sw.c("menu.savingLevel")));
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    public boolean a(Consumer<sw> $$02) {
        Consumer<Path> $$8;
        if (this.bl.e()) {
            this.bh();
            return false;
        }
        Consumer<bam> $$13 = $$1 -> {
            if ($$1 == bai.a) {
                return;
            }
            int $$2 = $$1.f();
            double $$3 = (double)$$1.g() / (double)apw.a;
            this.execute(() -> $$02.accept(sw.a("commands.debug.stopped", new Object[]{String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)})));
        };
        Consumer<Path> $$22 = $$12 -> {
            tj $$2 = sw.b($$12.toString()).a(n.t).a($$1 -> $$1.a(new su(su.a.b, $$12.toFile().getParent())));
            this.execute(() -> $$02.accept(sw.a("debug.profiling.stop", $$2)));
        };
        ab $$3 = enn.a(new ab(), this, this.am, this.aa, this.m);
        Consumer<List> $$4 = $$2 -> {
            Path $$3 = this.a($$3, (List<Path>)$$2);
            $$22.accept($$3);
        };
        if (this.aN == null) {
            Consumer<Path> $$5 = $$1 -> $$4.accept((List)ImmutableList.of((Object)$$1));
        } else {
            this.aN.b($$3);
            CompletableFuture $$6 = new CompletableFuture();
            CompletableFuture $$7 = new CompletableFuture();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept((List)ImmutableList.of((Object)((Path)$$6.join()), (Object)((Path)$$7.join()))), ac.g());
            this.aN.a((bam $$0) -> {}, $$7::complete);
            $$8 = $$6::complete;
        }
        this.bl = bbx.a(new fjd(ac.a, this.f), ac.a, ac.g(), new bcd("client"), $$1 -> {
            this.bl = bby.a;
            $$13.accept((bam)$$1);
        }, $$8);
        return true;
    }

    private void bh() {
        this.bl.a();
        if (this.aN != null) {
            this.aN.aQ();
        }
    }

    private void bi() {
        this.bl.b();
        if (this.aN != null) {
            this.aN.aR();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private Path a(ab $$0, List<Path> $$1) {
        void $$9;
        String $$4;
        if (this.Q()) {
            String $$2 = this.S().aU().g();
        } else {
            ffd $$3 = this.P();
            $$4 = $$3 != null ? $$3.a : "unknown";
        }
        try {
            String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$4, aa.b().b());
            String $$6 = v.a(bcd.a, $$5, ".zip");
            Path $$7 = bcd.a.resolve($$6);
        }
        catch (IOException $$8) {
            throw new UncheckedIOException($$8);
        }
        try (aol $$10 = new aol((Path)$$9);){
            $$10.a(Paths.get("system.txt", new String[0]), $$0.a());
            $$10.a(Paths.get("client", new String[0]).resolve(this.m.av().getName()), this.m.aw());
            $$1.forEach($$10::a);
        }
        finally {
            for (Path $$11 : $$1) {
                try {
                    FileUtils.forceDelete((File)$$11.toFile());
                }
                catch (IOException $$12) {
                    G.warn("Failed to delete temporary profiling result {}", (Object)$$11, (Object)$$12);
                }
            }
        }
        return $$9;
    }

    @Override
    public void a(int $$0) {
        if (this.bk == null) {
            return;
        }
        List<bap> $$1 = this.bk.a(this.bu);
        if ($$1.isEmpty()) {
            return;
        }
        bap $$2 = $$1.remove(0);
        if ($$0 == 0) {
            int $$3;
            if (!$$2.d.isEmpty() && ($$3 = this.bu.lastIndexOf(30)) >= 0) {
                this.bu = this.bu.substring(0, $$3);
            }
        } else if (--$$0 < $$1.size() && !"unspecified".equals($$1.get((int)$$0).d)) {
            if (!this.bu.isEmpty()) {
                this.bu = this.bu + "\u001e";
            }
            this.bu = this.bu + $$1.get((int)$$0).d;
        }
    }

    private void a(eox $$0, bam $$1) {
        List<bap> $$2 = $$1.a(this.bu);
        bap $$3 = $$2.remove(0);
        RenderSystem.clear(256, a);
        RenderSystem.setShader(fjq::q);
        Matrix4f $$4 = new Matrix4f().setOrtho(0.0f, (float)this.Q.k(), (float)this.Q.l(), 0.0f, 1000.0f, 3000.0f);
        RenderSystem.setProjectionMatrix($$4, eir.b);
        eij $$5 = RenderSystem.getModelViewStack();
        $$5.a();
        $$5.e();
        $$5.a(0.0f, 0.0f, -2000.0f);
        RenderSystem.applyModelViewMatrix();
        RenderSystem.lineWidth(1.0f);
        eil $$6 = eil.a();
        eie $$7 = $$6.c();
        int $$8 = 160;
        int $$9 = this.Q.k() - 160 - 10;
        int $$10 = this.Q.l() - 320;
        RenderSystem.enableBlend();
        $$7.a(eio.b.h, eih.n);
        $$7.a((double)((float)$$9 - 176.0f), (double)((float)$$10 - 96.0f - 16.0f), 0.0).a(200, 0, 0, 0).e();
        $$7.a((double)((float)$$9 - 176.0f), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
        $$7.a((double)((float)$$9 + 176.0f), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
        $$7.a((double)((float)$$9 + 176.0f), (double)((float)$$10 - 96.0f - 16.0f), 0.0).a(200, 0, 0, 0).e();
        $$6.b();
        RenderSystem.disableBlend();
        double $$11 = 0.0;
        for (bap $$12 : $$2) {
            int $$13 = apa.a($$12.a / 4.0) + 1;
            $$7.a(eio.b.g, eih.n);
            int $$14 = $$12.a();
            int $$15 = $$14 >> 16 & 0xFF;
            int $$16 = $$14 >> 8 & 0xFF;
            int $$17 = $$14 & 0xFF;
            $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();
            for (int $$18 = $$13; $$18 >= 0; --$$18) {
                float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * 6.2831854820251465 / 100.0);
                float $$20 = apa.a($$19) * 160.0f;
                float $$21 = apa.b($$19) * 160.0f * 0.5f;
                $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
            }
            $$6.b();
            $$7.a(eio.b.f, eih.n);
            for (int $$22 = $$13; $$22 >= 0; --$$22) {
                float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * 6.2831854820251465 / 100.0);
                float $$24 = apa.a($$23) * 160.0f;
                float $$25 = apa.b($$23) * 160.0f * 0.5f;
                if ($$25 > 0.0f) continue;
                $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
                $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25 + 10.0f), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
            }
            $$6.b();
            $$11 += $$12.a;
        }
        DecimalFormat $$26 = new DecimalFormat("##0.00");
        $$26.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
        String $$27 = bam.b($$3.d);
        Object $$28 = "";
        if (!"unspecified".equals($$27)) {
            $$28 = (String)$$28 + "[0] ";
        }
        $$28 = $$27.isEmpty() ? (String)$$28 + "ROOT " : (String)$$28 + $$27 + " ";
        int $$29 = 0xFFFFFF;
        $$0.b(this.h, (String)$$28, $$9 - 160, $$10 - 80 - 16, 0xFFFFFF);
        $$28 = $$26.format($$3.b) + "%";
        $$0.b(this.h, (String)$$28, $$9 + 160 - this.h.b((String)$$28), $$10 - 80 - 16, 0xFFFFFF);
        for (int $$30 = 0; $$30 < $$2.size(); ++$$30) {
            bap $$31 = $$2.get($$30);
            StringBuilder $$32 = new StringBuilder();
            if ("unspecified".equals($$31.d)) {
                $$32.append("[?] ");
            } else {
                $$32.append("[").append($$30 + 1).append("] ");
            }
            Object $$33 = $$32.append($$31.d).toString();
            $$0.b(this.h, (String)$$33, $$9 - 160, $$10 + 80 + $$30 * 8 + 20, $$31.a());
            $$33 = $$26.format($$31.a) + "%";
            $$0.b(this.h, (String)$$33, $$9 + 160 - 50 - this.h.b((String)$$33), $$10 + 80 + $$30 * 8 + 20, $$31.a());
            $$33 = $$26.format($$31.b) + "%";
            $$0.b(this.h, (String)$$33, $$9 + 160 - this.h.b((String)$$33), $$10 + 80 + $$30 * 8 + 20, $$31.a());
        }
        $$5.b();
        RenderSystem.applyModelViewMatrix();
    }

    public void p() {
        this.aZ = false;
    }

    public boolean q() {
        return this.aZ;
    }

    public void c(boolean $$0) {
        boolean $$1;
        if (this.z != null) {
            return;
        }
        boolean bl2 = $$1 = this.R() && !this.aN.p();
        if ($$1) {
            this.a(new eul(!$$0));
            this.aq.d();
        } else {
            this.a(new eul(true));
        }
    }

    private void g(boolean $$0) {
        if (!$$0) {
            this.x = 0;
        }
        if (this.x > 0 || this.t.fi()) {
            return;
        }
        if ($$0 && this.w != null && this.w.c() == eeg.a.b) {
            ha $$3;
            eee $$1 = (eee)this.w;
            gu $$2 = $$1.a();
            if (!this.s.a_($$2).i() && this.r.b($$2, $$3 = $$1.b())) {
                this.g.a($$2, $$3);
                this.t.a(bdw.a);
            }
            return;
        }
        this.r.b();
    }

    private boolean bj() {
        if (this.x > 0) {
            return false;
        }
        if (this.w == null) {
            G.error("Null returned as 'hitResult', this shouldn't happen!");
            if (this.r.f()) {
                this.x = 10;
            }
            return false;
        }
        if (this.t.G()) {
            return false;
        }
        cfz $$0 = this.t.b(bdw.a);
        if (!$$0.a(this.s.G())) {
            return false;
        }
        boolean $$1 = false;
        switch (this.w.c()) {
            case c: {
                this.r.a((byo)this.t, ((eef)this.w).a());
                break;
            }
            case b: {
                eee $$2 = (eee)this.w;
                gu $$3 = $$2.a();
                if (!this.s.a_($$3).i()) {
                    this.r.a($$3, $$2.b());
                    if (!this.s.a_($$3).i()) break;
                    $$1 = true;
                    break;
                }
            }
            case a: {
                if (this.r.f()) {
                    this.x = 10;
                }
                this.t.gh();
            }
        }
        this.t.a(bdw.a);
        return $$1;
    }

    private void bs() {
        if (this.r.m()) {
            return;
        }
        this.aQ = 4;
        if (this.t.G()) {
            return;
        }
        if (this.w == null) {
            G.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        for (bdw $$0 : bdw.values()) {
            bdx $$8;
            cfz $$1 = this.t.b($$0);
            if (!$$1.a(this.s.G())) {
                return;
            }
            if (this.w != null) {
                switch (this.w.c()) {
                    case c: {
                        eef $$2 = (eef)this.w;
                        bfj $$3 = $$2.a();
                        if (!this.s.w_().a($$3.di())) {
                            return;
                        }
                        bdx $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                            $$4 = this.r.a((byo)this.t, $$3, $$0);
                        }
                        if (!$$4.a()) break;
                        if ($$4.b()) {
                            this.t.a($$0);
                        }
                        return;
                    }
                    case b: {
                        eee $$5 = (eee)this.w;
                        int $$6 = $$1.L();
                        bdx $$7 = this.r.a(this.t, $$0, $$5);
                        if ($$7.a()) {
                            if ($$7.b()) {
                                this.t.a($$0);
                                if (!$$1.b() && ($$1.L() != $$6 || this.r.g())) {
                                    this.j.b.a($$0);
                                }
                            }
                            return;
                        }
                        if ($$7 != bdx.e) break;
                        return;
                    }
                }
            }
            if ($$1.b() || !($$8 = this.r.a((byo)this.t, $$0)).a()) continue;
            if ($$8.b()) {
                this.t.a($$0);
            }
            this.j.b.a($$0);
            return;
        }
    }

    public fyx r() {
        return this.ar;
    }

    public void s() {
        if (this.aQ > 0) {
            --this.aQ;
        }
        this.bh.a("gui");
        this.bs.a();
        this.l.a(this.aR);
        this.bh.c();
        this.j.a(1.0f);
        this.aF.a(this.s, this.w);
        this.bh.a("gameMode");
        if (!this.aR && this.s != null) {
            this.r.d();
        }
        this.bh.b("textures");
        if (this.s != null) {
            this.N.e();
        }
        if (this.z == null && this.t != null) {
            if (this.t.es() && !(this.z instanceof etq)) {
                this.a((euq)null);
            } else if (this.t.fy() && this.s != null) {
                this.a(new etz());
            }
        } else {
            euq euq2 = this.z;
            if (euq2 instanceof etz) {
                etz $$0 = (etz)euq2;
                if (!this.t.fy()) {
                    $$0.k();
                }
            }
        }
        if (this.z != null) {
            this.x = 10000;
        }
        if (this.z != null) {
            euq.a(() -> this.z.f(), "Ticking screen", this.z.getClass().getCanonicalName());
        }
        if (!this.m.aa) {
            this.l.k();
        }
        if (this.aW == null && this.z == null) {
            this.bh.b("Keybindings");
            this.bu();
            if (this.x > 0) {
                --this.x;
            }
        }
        if (this.s != null) {
            this.bh.b("gameRenderer");
            if (!this.aR) {
                this.j.f();
            }
            this.bh.b("levelRenderer");
            if (!this.aR) {
                this.f.o();
            }
            this.bh.b("level");
            if (!this.aR) {
                this.s.f();
            }
        } else if (this.j.g() != null) {
            this.j.b();
        }
        if (!this.aR) {
            this.ar.a();
        }
        this.aq.a(this.aR);
        if (this.s != null) {
            if (!this.aR) {
                if (!this.m.s && this.bt()) {
                    tj $$1 = sw.c("tutorial.socialInteractions.title");
                    tj $$2 = sw.a("tutorial.socialInteractions.description", gaf.a("socialInteractions"));
                    this.bg = new eri(eri.a.f, $$1, $$2, true);
                    this.aF.a(this.bg, 160);
                    this.m.s = true;
                    this.m.aq();
                }
                this.aF.d();
                try {
                    this.s.a(() -> true);
                }
                catch (Throwable $$3) {
                    o $$4 = o.a($$3, "Exception in world tick");
                    if (this.s == null) {
                        p $$5 = $$4.a("Affected level");
                        $$5.a("Problem", "Level is null!");
                    } else {
                        this.s.a($$4);
                    }
                    throw new y($$4);
                }
            }
            this.bh.b("animateTick");
            if (!this.aR && this.s != null) {
                this.s.b(this.t.dm(), this.t.do(), this.t.ds());
            }
            this.bh.b("particles");
            if (!this.aR) {
                this.g.b();
            }
        } else if (this.aO != null) {
            this.bh.b("pendingConnection");
            this.aO.a();
        }
        this.bh.b("keyboard");
        this.o.b();
        this.bh.c();
    }

    private boolean bt() {
        return !this.aP || this.aN != null && this.aN.p();
    }

    private void bu() {
        while (this.m.P.g()) {
            ena $$0 = this.m.au();
            this.m.a(this.m.au().c());
            if ($$0.a() != this.m.au().a()) {
                this.j.a(this.m.au().a() ? this.al() : null);
            }
            this.f.r();
        }
        while (this.m.Q.g()) {
            this.m.ae = !this.m.ae;
        }
        for (int $$1 = 0; $$1 < 9; ++$$1) {
            boolean $$2 = this.m.V.e();
            boolean $$3 = this.m.W.e();
            if (!this.m.U[$$1].g()) continue;
            if (this.t.G_()) {
                this.l.g().a($$1);
                continue;
            }
            if (this.t.f() && this.z == null && ($$3 || $$2)) {
                ewd.a(this, $$1, $$3, $$2);
                continue;
            }
            this.t.fN().l = $$1;
        }
        while (this.m.N.g()) {
            if (!this.bt()) {
                this.t.a(K, true);
                this.br.c(K);
                continue;
            }
            if (this.bg != null) {
                this.aF.a(this.bg);
                this.bg = null;
            }
            this.a(new eyu());
        }
        while (this.m.E.g()) {
            if (this.r.i()) {
                this.t.t();
                continue;
            }
            this.aF.a();
            this.a(new ewo(this.t));
        }
        while (this.m.T.g()) {
            this.a(new evg(this.t.cl.l()));
        }
        while (this.m.F.g()) {
            if (this.t.G_()) continue;
            this.I().a(new aad(aad.a.g, gu.b, ha.a));
        }
        while (this.m.G.g()) {
            if (this.t.G_() || !this.t.a(euq.p())) continue;
            this.t.a(bdw.a);
        }
        while (this.m.K.g()) {
            this.a("");
        }
        if (this.z == null && this.aW == null && this.m.M.g()) {
            this.a("/");
        }
        boolean $$4 = false;
        if (this.t.fi()) {
            if (!this.m.H.e()) {
                this.r.b(this.t);
            }
            while (this.m.I.g()) {
            }
            while (this.m.H.g()) {
            }
            while (this.m.J.g()) {
            }
        } else {
            while (this.m.I.g()) {
                $$4 |= this.bj();
            }
            while (this.m.H.g()) {
                this.bs();
            }
            while (this.m.J.g()) {
                this.bv();
            }
        }
        if (this.m.H.e() && this.aQ == 0 && !this.t.fi()) {
            this.bs();
        }
        this.g(this.z == null && !$$4 && this.m.I.e() && this.n.h());
    }

    public fzg t() {
        return this.aJ;
    }

    public double u() {
        return this.bo;
    }

    public ffc v() {
        return this.aK;
    }

    public ezk w() {
        return new ezk(this, this.ad);
    }

    public void a(String $$02, dyy.c $$1, aki $$2, adk $$3, boolean $$42) {
        this.y();
        this.X.set(null);
        Instant $$5 = Instant.now();
        try {
            $$1.a($$3.c().a(), $$3.d());
            adh $$6 = adh.a(this.aw, this.p);
            $$6.e().a(this);
            dax.a($$6, this);
            alg.a(false);
            this.aN = MinecraftServer.a((Thread $$4) -> new fyp((Thread)$$4, this, $$1, $$2, $$3, $$6, $$0 -> {
                aki $$2 = new ais($$0 + 0);
                this.X.set((ais)((Object)$$2));
                return air.a($$2, this.be::add);
            }));
            this.aP = true;
            this.a(ffq.a());
            this.aM.a(fjg.c.a, $$02, $$3.d().g());
        }
        catch (Throwable $$7) {
            o $$8 = o.a($$7, "Starting integrated server");
            p $$9 = $$8.a("Starting integrated server");
            $$9.a("Level ID", $$02);
            $$9.a("Level Name", () -> $$3.d().g());
            throw new y($$8);
        }
        while (this.X.get() == null) {
            Thread.yield();
        }
        eub $$10 = new eub(this.X.get());
        this.a($$10);
        this.bh.a("waitForServer");
        while (!this.aN.ae()) {
            $$10.f();
            this.f(false);
            try {
                Thread.sleep(16L);
            }
            catch (InterruptedException $$8) {
                // empty catch block
            }
            if (this.ba == null) continue;
            enn.c(this.ba.get());
            return;
        }
        this.bh.c();
        Duration $$11 = Duration.between($$5, Instant.now());
        SocketAddress $$12 = this.aN.ad().a();
        sd $$13 = sd.a($$12);
        $$13.a(new fev($$13, this, null, null, $$42, $$11, $$0 -> {}));
        $$13.a(new abb($$12.toString(), 0, se.d));
        $$13.a(new abm(this.U().c(), Optional.ofNullable(this.U().g())));
        this.aO = $$13;
    }

    @Override
    public void a(few $$0) {
        euo $$1 = new euo(true);
        $$1.a(sw.c("connect.joining"));
        this.d($$1);
        this.s = $$0;
        this.b($$0);
        if (!this.aP) {
            adh $$2 = adh.a(this.aw, this.p);
            $$2.e().a(this);
            dax.a($$2, this);
            alg.a(false);
        }
    }

    public void y() {
        this.b(new euo(true));
    }

    public void b(euq $$0) {
        fex $$1 = this.I();
        if ($$1 != null) {
            this.bo();
            $$1.e();
        }
        this.aG.b();
        if (this.bl.e()) {
            this.bi();
        }
        fyp $$2 = this.aN;
        this.aN = null;
        this.j.i();
        this.r = null;
        this.br.b();
        this.d($$0);
        if (this.s != null) {
            if ($$2 != null) {
                this.bh.a("waitForServer");
                while (!$$2.C()) {
                    this.f(false);
                }
                this.bh.c();
            }
            this.ak.a();
            this.l.i();
            this.aP = false;
        }
        this.s = null;
        this.b((few)null);
        this.t = null;
        dax.c();
    }

    @Override
    private void d(euq $$0) {
        this.bh.a("forcedTick");
        this.aq.e();
        this.u = null;
        this.aO = null;
        this.a($$0);
        this.f(false);
        this.bh.c();
    }

    public void c(euq $$0) {
        this.bh.a("forcedTick");
        this.a($$0);
        this.f(false);
        this.bh.c();
    }

    private void b(@Nullable few $$0) {
        this.f.a($$0);
        this.g.a($$0);
        this.aI.a($$0);
        this.c();
    }

    public boolean z() {
        return this.A() && this.m.ad().c() != false;
    }

    public boolean A() {
        return this.B() && this.ay.properties().flag(UserApiService.UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
    }

    public boolean B() {
        return this.ay.properties().flag(UserApiService.UserFlag.TELEMETRY_ENABLED);
    }

    public boolean C() {
        return this.ag && this.ay.properties().flag(UserApiService.UserFlag.SERVERS_ALLOWED) && this.F() == null;
    }

    public boolean D() {
        return this.ay.properties().flag(UserApiService.UserFlag.REALMS_ALLOWED) && this.F() == null;
    }

    public boolean E() {
        return this.F() != null;
    }

    @Nullable
    public BanDetails F() {
        return (BanDetails)this.ay.properties().bannedScopes().get("MULTIPLAYER");
    }

    public boolean a(UUID $$0) {
        if (!this.G().a(false)) {
            return (this.t == null || !$$0.equals(this.t.ct())) && !$$0.equals(ac.c);
        }
        return this.aG.c($$0);
    }

    public a G() {
        if (this.m.l().c() == bym.c) {
            return enn$a.b;
        }
        if (!this.ah) {
            return enn$a.c;
        }
        if (!this.ay.properties().flag(UserApiService.UserFlag.CHAT_ALLOWED)) {
            return enn$a.d;
        }
        return enn$a.a;
    }

    public final boolean H() {
        return this.af;
    }

    @Nullable
    public fex I() {
        return this.t == null ? null : this.t.cl;
    }

    public static boolean J() {
        return !enn.F.m.Z;
    }

    public static boolean K() {
        return enn.F.m.i().c().a() >= eng.b.a();
    }

    public static boolean L() {
        return !enn.F.j.a() && enn.F.m.i().c().a() >= eng.c.a();
    }

    public static boolean M() {
        return enn.F.m.j().c();
    }

    /*
     * WARNING - void declaration
     */
    private void bv() {
        void $$9;
        if (this.w == null || this.w.c() == eeg.a.a) {
            return;
        }
        boolean $$0 = this.t.fO().d;
        czn $$1 = null;
        eeg.a $$2 = this.w.c();
        if ($$2 == eeg.a.b) {
            gu $$3 = ((eee)this.w).a();
            dcb $$4 = this.s.a_($$3);
            if ($$4.i()) {
                return;
            }
            cpn $$5 = $$4.b();
            cfz $$6 = $$5.a((cls)this.s, $$3, $$4);
            if ($$6.b()) {
                return;
            }
            if ($$0 && euq.p() && $$4.t()) {
                $$1 = this.s.c_($$3);
            }
        } else if ($$2 == eeg.a.c && $$0) {
            bfj $$7 = ((eef)this.w).a();
            cfz $$8 = $$7.dv();
            if ($$8 == null) {
                return;
            }
        } else {
            return;
        }
        if ($$9.b()) {
            String $$10 = "";
            if ($$2 == eeg.a.b) {
                $$10 = jb.f.b(this.s.a_(((eee)this.w).a()).b()).toString();
            } else if ($$2 == eeg.a.c) {
                $$10 = jb.h.b(((eef)this.w).a().ae()).toString();
            }
            G.warn("Picking on: [{}] {} gave null item", (Object)$$2, (Object)$$10);
            return;
        }
        byn $$11 = this.t.fN();
        if ($$1 != null) {
            this.a((cfz)$$9, $$1);
        }
        int $$12 = $$11.b((cfz)$$9);
        if ($$0) {
            $$11.a((cfz)$$9);
            this.r.a(this.t.b(bdw.a), 36 + $$11.l);
        } else if ($$12 != -1) {
            if (byn.d($$12)) {
                $$11.l = $$12;
            } else {
                this.r.a($$12);
            }
        }
    }

    private void a(cfz $$0, czn $$1) {
        qr $$2 = $$1.m();
        cds.a($$0, $$1.u(), $$2);
        if ($$0.d() instanceof cgn && $$2.e("SkullOwner")) {
            qr $$3 = $$2.p("SkullOwner");
            qr $$4 = $$0.w();
            $$4.a("SkullOwner", $$3);
            qr $$5 = $$4.p("BlockEntityTag");
            $$5.r("SkullOwner");
            $$5.r("x");
            $$5.r("y");
            $$5.r("z");
            return;
        }
        qr $$6 = new qr();
        qx $$7 = new qx();
        $$7.add(ri.a("\"(+NBT)\""));
        $$6.a("Lore", $$7);
        $$0.a("display", $$6);
    }

    public o d(o $$0) {
        ab $$1 = $$0.g();
        enn.a($$1, this, this.am, this.aa, this.m);
        if (this.s != null) {
            this.s.a($$0);
        }
        if (this.aN != null) {
            this.aN.b($$1);
        }
        this.bm.a($$0);
        return $$0;
    }

    public static void a(@Nullable enn $$0, @Nullable fwb $$1, String $$2, @Nullable enr $$3, o $$4) {
        ab $$5 = $$4.g();
        enn.a($$5, $$0, $$1, $$2, $$3);
    }

    private static ab a(ab $$0, @Nullable enn $$1, @Nullable fwb $$2, String $$3, enr $$4) {
        $$0.a("Launched Version", () -> $$3);
        $$0.a("Backend library", RenderSystem::getBackendDescription);
        $$0.a("Backend API", RenderSystem::getApiDescription);
        $$0.a("Window size", () -> $$1 != null ? $$0.Q.k() + "x" + $$0.Q.l() : "<not initialized>");
        $$0.a("GL Caps", RenderSystem::getCapsString);
        $$0.a("GL debug messages", () -> ehb.b() ? String.join((CharSequence)"\n", ehb.a()) : "<disabled>");
        $$0.a("Using VBOs", () -> "Yes");
        $$0.a("Is Modded", () -> enn.d().b());
        $$0.a("Type", "Client (map_client.txt)");
        if ($$4 != null) {
            String $$5;
            if (F != null && ($$5 = F.ag().m()) != null) {
                $$0.a("GPU Warnings", $$5);
            }
            $$0.a("Graphics mode", $$4.i().c().toString());
            $$0.a("Resource Packs", () -> {
                StringBuilder $$1 = new StringBuilder();
                for (String $$2 : $$0.i) {
                    if ($$1.length() > 0) {
                        $$1.append(", ");
                    }
                    $$1.append($$2);
                    if (!$$0.j.contains($$2)) continue;
                    $$1.append(" (incompatible)");
                }
                return $$1.toString();
            });
        }
        if ($$2 != null) {
            $$0.a("Current Language", () -> $$2.a());
        }
        $$0.a("CPU", ehc::b);
        return $$0;
    }

    public static enn N() {
        return F;
    }

    public CompletableFuture<Void> O() {
        return ((bcn)this).a(this::j).thenCompose($$0 -> $$0);
    }

    @Override
    public void a(ffq $$0) {
        if (!this.bt.a($$0)) {
            this.bt = ffs.a($$0, this.ay);
        }
    }

    @Nullable
    public ffd P() {
        return x.a(this.I(), fex::s);
    }

    public boolean Q() {
        return this.aP;
    }

    public boolean R() {
        return this.aP && this.aN != null;
    }

    @Nullable
    public fyp S() {
        return this.aN;
    }

    public boolean T() {
        fyp $$0 = this.S();
        return $$0 != null && !$$0.p();
    }

    public eoc U() {
        return this.W;
    }

    public PropertyMap V() {
        if (this.M.isEmpty()) {
            GameProfile $$0 = this.aj().fillProfileProperties(this.W.h(), false);
            this.M.putAll((Multimap)$$0.getProperties());
        }
        return this.M;
    }

    public Proxy W() {
        return this.ac;
    }

    public fuw X() {
        return this.N;
    }

    public akx Y() {
        return this.ai;
    }

    public aki Z() {
        return this.al;
    }

    public ajo aa() {
        return this.aj;
    }

    public fvn ab() {
        return this.ak;
    }

    public Path ac() {
        return this.L;
    }

    public fwb ad() {
        return this.am;
    }

    public Function<acq, fuv> a(acq $$0) {
        return this.aA.a($$0)::a;
    }

    public boolean ae() {
        return this.ae;
    }

    public boolean af() {
        return this.aR;
    }

    public fjr ag() {
        return this.au;
    }

    public fzc ah() {
        return this.aq;
    }

    public ame ai() {
        ame $$0 = x.a(this.z, euq::A);
        if ($$0 != null) {
            return $$0;
        }
        if (this.t != null) {
            if (this.t.dI().ac() == cmm.j) {
                if (this.l.j().b()) {
                    return amf.d;
                }
                return amf.e;
            }
            he<cnk> $$1 = this.t.dI().s(this.t.di());
            if (this.ar.c(amf.f) || this.t.aZ() && $$1.a(amv.Y)) {
                return amf.f;
            }
            if (this.t.dI().ac() != cmm.i && this.t.fO().d && this.t.fO().c) {
                return amf.b;
            }
            return $$1.a().o().orElse(amf.g);
        }
        return amf.a;
    }

    public MinecraftSessionService aj() {
        return this.ax;
    }

    public fvu ak() {
        return this.az;
    }

    @Nullable
    public bfj al() {
        return this.u;
    }

    @Override
    public void a(bfj $$0) {
        this.u = $$0;
        this.j.a($$0);
    }

    public boolean b(bfj $$0) {
        return $$0.ca() || this.t != null && this.t.G_() && this.m.S.e() && $$0.ae() == bfn.bt;
    }

    @Override
    protected Thread au() {
        return this.aY;
    }

    @Override
    protected Runnable f(Runnable $$0) {
        return $$0;
    }

    @Override
    protected boolean e(Runnable $$0) {
        return true;
    }

    public fko am() {
        return this.aB;
    }

    public fow an() {
        return this.T;
    }

    public flt ao() {
        return this.aI;
    }

    public fpw ap() {
        return this.U;
    }

    @Override
    public <T> fyl<T> a(fyk.a<T> $$0) {
        return this.V.a($$0);
    }

    public <T> void a(fyk.a<T> $$0, List<T> $$1) {
        this.V.a($$0, $$1);
    }

    public aoo aq() {
        return this.q;
    }

    public boolean ar() {
        return this.aX;
    }

    @Override
    public void d(boolean $$0) {
        this.aX = $$0;
    }

    public DataFixer as() {
        return this.O;
    }

    public float av() {
        return this.R.a;
    }

    public float aw() {
        return this.R.b;
    }

    public eoo ax() {
        return this.an;
    }

    public boolean ay() {
        return this.t != null && this.t.gd() || this.m.Q().c() != false;
    }

    public erh az() {
        return this.aE;
    }

    public gaf aA() {
        return this.aF;
    }

    public boolean aB() {
        return this.bd;
    }

    public enj aC() {
        return this.Y;
    }

    public fwx aD() {
        return this.aA;
    }

    public fvt aE() {
        return this.aC;
    }

    public fvs aF() {
        return this.aD;
    }

    @Override
    public void a(boolean $$0) {
        this.bd = $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public sw a(File $$02, int $$12, int $$2) {
        int $$3 = this.Q.k();
        int $$4 = this.Q.l();
        egw $$5 = new egw($$12, $$2, true, a);
        float $$6 = this.t.dA();
        float $$7 = this.t.dy();
        float $$8 = this.t.N;
        float $$9 = this.t.M;
        this.j.b(false);
        try {
            this.j.c(true);
            this.f.e();
            this.Q.b($$12);
            this.Q.c($$2);
            for (int $$10 = 0; $$10 < 6; ++$$10) {
                switch ($$10) {
                    case 0: {
                        this.t.a_($$7);
                        this.t.b_(0.0f);
                        break;
                    }
                    case 1: {
                        this.t.a_(($$7 + 90.0f) % 360.0f);
                        this.t.b_(0.0f);
                        break;
                    }
                    case 2: {
                        this.t.a_(($$7 + 180.0f) % 360.0f);
                        this.t.b_(0.0f);
                        break;
                    }
                    case 3: {
                        this.t.a_(($$7 - 90.0f) % 360.0f);
                        this.t.b_(0.0f);
                        break;
                    }
                    case 4: {
                        this.t.a_($$7);
                        this.t.b_(-90.0f);
                        break;
                    }
                    default: {
                        this.t.a_($$7);
                        this.t.b_(90.0f);
                    }
                }
                this.t.M = this.t.dy();
                this.t.N = this.t.dA();
                $$5.a(true);
                this.j.a(1.0f, 0L, new eij());
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                eny.a($$02, "panorama_" + $$10 + ".png", $$5, $$0 -> {});
            }
            tj $$11 = sw.b($$02.getName()).a(n.t).a($$1 -> $$1.a(new su(su.a.b, $$02.getAbsolutePath())));
            tj tj2 = sw.a("screenshot.success", $$11);
            return tj2;
        }
        catch (Exception $$122) {
            G.error("Couldn't save image", (Throwable)$$122);
            tj tj3 = sw.a("screenshot.failure", new Object[]{$$122.getMessage()});
            return tj3;
        }
        finally {
            this.t.b_($$6);
            this.t.a_($$7);
            this.t.N = $$8;
            this.t.M = $$9;
            this.j.b(true);
            this.Q.b($$3);
            this.Q.c($$4);
            $$5.a();
            this.j.c(false);
            this.f.e();
            this.f().a(true);
        }
    }

    private sw a(File $$0, int $$12, int $$2, int $$3, int $$4) {
        try {
            ByteBuffer $$5 = ehc.a($$12 * $$2 * 3);
            eny $$6 = new eny($$0, $$3, $$4, $$2);
            float $$7 = (float)$$3 / (float)$$12;
            float $$8 = (float)$$4 / (float)$$2;
            float $$9 = $$7 > $$8 ? $$7 : $$8;
            for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
                for (int $$11 = 0; $$11 < $$3; $$11 += $$12) {
                    RenderSystem.setShaderTexture(0, fuu.e);
                    float $$122 = (float)($$3 - $$12) / 2.0f * 2.0f - (float)($$11 * 2);
                    float $$13 = (float)($$4 - $$2) / 2.0f * 2.0f - (float)($$10 * 2);
                    this.j.a($$9, $$122 /= (float)$$12, $$13 /= (float)$$2);
                    $$5.clear();
                    RenderSystem.pixelStore(3333, 1);
                    RenderSystem.pixelStore(3317, 1);
                    RenderSystem.readPixels(0, 0, $$12, $$2, 32992, 5121, $$5);
                    $$6.a($$5, $$11, $$10, $$12, $$2);
                }
                $$6.a();
            }
            File $$14 = $$6.b();
            ehc.a($$5);
            tj $$15 = sw.b($$14.getName()).a(n.t).a($$1 -> $$1.a(new su(su.a.b, $$14.getAbsolutePath())));
            return sw.a("screenshot.success", $$15);
        }
        catch (Exception $$16) {
            G.warn("Couldn't save screenshot", (Throwable)$$16);
            return sw.a("screenshot.failure", new Object[]{$$16.getMessage()});
        }
    }

    public ban aG() {
        return this.bh;
    }

    @Nullable
    public ais aH() {
        return this.X.get();
    }

    public fvv aI() {
        return this.at;
    }

    @Nullable
    public euk aJ() {
        return this.aW;
    }

    public eys aK() {
        return this.aG;
    }

    public boolean aL() {
        return false;
    }

    public ehn aM() {
        return this.Q;
    }

    public fkd aN() {
        return this.S;
    }

    public void b(int $$0) {
        this.aA.a($$0);
    }

    public fea aO() {
        return this.aH;
    }

    public boolean aP() {
        return this.ay.properties().flag(UserApiService.UserFlag.PROFANITY_FILTER_ENABLED);
    }

    public void aQ() {
        this.aG.a();
        this.v().a();
    }

    public env aR() {
        return this.bq;
    }

    @Nullable
    public apj aS() {
        return apj.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
    }

    public enk aT() {
        return this.Z;
    }

    @Override
    public void a(enk $$0) {
        this.Z = $$0;
    }

    public enf aU() {
        return this.br;
    }

    public ffg aV() {
        return this.bs;
    }

    public ffs aW() {
        return this.bt;
    }

    public ekq aX() {
        return this.aL;
    }

    public fjg aY() {
        return this.aM;
    }

    static {
        G = LogUtils.getLogger();
        a = ac.i() == ac.b.d;
        b = new acq("default");
        c = new acq("uniform");
        d = new acq("alt");
        I = new acq("regional_compliancies.json");
        J = CompletableFuture.completedFuture(apz.a);
        K = sw.c("multiplayer.socialInteractions.not_available");
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(sv.a){

            @Override
            public boolean a(boolean $$0) {
                return true;
            }
        };
        public static final /* enum */ a b = new a(sw.c("chat.disabled.options").a(n.m)){

            @Override
            public boolean a(boolean $$0) {
                return false;
            }
        };
        public static final /* enum */ a c = new a(sw.c("chat.disabled.launcher").a(n.m)){

            @Override
            public boolean a(boolean $$0) {
                return $$0;
            }
        };
        public static final /* enum */ a d = new a(sw.a("chat.disabled.profile", sw.d(enn.F.m.K.h())).a(n.m)){

            @Override
            public boolean a(boolean $$0) {
                return $$0;
            }
        };
        static final sw e;
        private final sw f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(sw $$0) {
            this.f = $$0;
        }

        public sw a() {
            return this.f;
        }

        public abstract boolean a(boolean var1);

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            g = enn$a.b();
            e = sw.c("chat.disabled.profile.moreInfo");
        }
    }
}

