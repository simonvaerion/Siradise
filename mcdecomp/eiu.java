/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eiu
extends gan {
    static final Logger a = LogUtils.getLogger();
    private static final acq b = new acq("realms", "textures/gui/realms/on_icon.png");
    private static final acq c = new acq("realms", "textures/gui/realms/off_icon.png");
    private static final acq G = new acq("realms", "textures/gui/realms/expired_icon.png");
    private static final acq H = new acq("realms", "textures/gui/realms/expires_soon_icon.png");
    static final acq I = new acq("realms", "textures/gui/realms/invitation_icons.png");
    static final acq J = new acq("realms", "textures/gui/realms/invite_icon.png");
    static final acq K = new acq("realms", "textures/gui/realms/world_icon.png");
    private static final acq L = new acq("realms", "textures/gui/title/realms.png");
    private static final acq M = new acq("realms", "textures/gui/realms/news_icon.png");
    private static final acq N = new acq("realms", "textures/gui/realms/popup.png");
    private static final acq O = new acq("realms", "textures/gui/realms/darken.png");
    static final acq P = new acq("realms", "textures/gui/realms/cross_icon.png");
    private static final acq Q = new acq("realms", "textures/gui/realms/trial_icon.png");
    static final acq R = new acq("minecraft", "textures/gui/info_icon.png");
    static final List<sw> S = ImmutableList.of((Object)sw.c("mco.trial.message.line1"), (Object)sw.c("mco.trial.message.line2"));
    static final sw T = sw.c("mco.selectServer.uninitialized");
    static final sw U = sw.c("mco.selectServer.expiredList");
    private static final sw V = sw.c("mco.selectServer.expiredRenew");
    static final sw W = sw.c("mco.selectServer.expiredTrial");
    static final sw X = sw.c("mco.selectServer.minigame").b(sv.t);
    private static final sw Y = sw.c("mco.selectServer.popup");
    private static final sw Z = sw.c("mco.selectServer.play");
    private static final sw aa = sw.c("mco.selectServer.leave");
    private static final sw ab = sw.c("mco.selectServer.configure");
    private static final sw ac = sw.c("mco.selectServer.expired");
    private static final sw ad = sw.c("mco.selectServer.expires.soon");
    private static final sw ae = sw.c("mco.selectServer.expires.day");
    private static final sw af = sw.c("mco.selectServer.open");
    private static final sw ag = sw.c("mco.selectServer.closed");
    private static final sw ah = sw.c("mco.news");
    static final sw ai = sw.a("gui.narrate.button", T);
    static final sw aj = sv.a(S);
    private static final int ak = 100;
    private static final int al = 308;
    private static final int am = 204;
    private static final int an = 64;
    private static final int ao = 128;
    private static final int ap = 34;
    private static final int aq = 128;
    private static final int ar = 64;
    private static final int as = 5;
    private static final int at = 44;
    private static List<acq> au = ImmutableList.of();
    @Nullable
    private elx.c av;
    private eks aw;
    private final Set<UUID> ax = new HashSet<UUID>();
    private static boolean ay;
    private static int az;
    static volatile boolean aA;
    static volatile boolean aB;
    static volatile boolean aC;
    @Nullable
    static euq aD;
    private static boolean aE;
    private final RateLimiter aF;
    private boolean aG;
    final euq aH;
    h aI;
    private boolean aJ;
    private epi aK;
    private epi aL;
    private epi aM;
    private epi aN;
    private epi aO;
    private List<ejq> aP = ImmutableList.of();
    volatile int aQ;
    int aR;
    private boolean aS;
    boolean aT;
    private boolean aU;
    private volatile boolean aV;
    private volatile boolean aW;
    private volatile boolean aX;
    volatile boolean aY;
    @Nullable
    volatile String aZ;
    private int ba;
    private int bb;
    private boolean bc;
    private List<eit> bd;
    long be;
    private ReentrantLock bf = new ReentrantLock();
    private epz bg = epz.a;
    private final List<ejp> bh = new ArrayList<ejp>();
    private epi bi;
    private g bj;
    private epi bk;
    private epi bl;
    private epi bm;
    private epi bn;

    public eiu(euq $$0) {
        super(enf.a);
        this.aH = $$0;
        this.aF = RateLimiter.create((double)0.01666666753590107);
    }

    private boolean B() {
        if (!eiu.C() || !this.aS) {
            return false;
        }
        if (this.aV && !this.aW) {
            return true;
        }
        for (ejq $$0 : this.aP) {
            if (!$$0.g.equals(this.f.U().b())) continue;
            return false;
        }
        return true;
    }

    public boolean a() {
        if (!eiu.C() || !this.aS) {
            return false;
        }
        if (this.aT) {
            return true;
        }
        return this.aP.isEmpty();
    }

    @Override
    public void b() {
        this.bd = Lists.newArrayList((Object[])new eit[]{new eit(new char[]{'3', '2', '1', '4', '5', '6'}, () -> {
            ay = !ay;
        }), new eit(new char[]{'9', '8', '7', '1', '2', '3'}, () -> {
            if (eiz.a == eiz.b.b) {
                this.M();
            } else {
                this.K();
            }
        }), new eit(new char[]{'9', '8', '7', '4', '5', '6'}, () -> {
            if (eiz.a == eiz.b.c) {
                this.M();
            } else {
                this.L();
            }
        })});
        if (aD != null) {
            this.f.a(aD);
            return;
        }
        this.bf = new ReentrantLock();
        if (aC && !eiu.C()) {
            this.J();
        }
        this.I();
        if (!this.aG) {
            this.f.d(false);
        }
        this.aX = false;
        this.aI = new h();
        if (az != -1) {
            this.aI.a((double)az);
        }
        this.e(this.aI);
        this.aJ = true;
        this.c(this.aI);
        this.d();
        this.e();
        this.c();
        this.a((ejq)null);
        this.bg = epz.a(this.i, (ta)Y, 100);
        ekr $$0 = this.f.aX().h;
        this.aY = $$0.a();
        this.aZ = $$0.b();
        if (this.aw == null) {
            this.aw = new eks(this.f);
        }
        if (this.av != null) {
            this.av.a();
        }
    }

    private static boolean C() {
        return aB && aA;
    }

    public void c() {
        this.bj = this.d(new g());
        this.bk = this.d(new e());
        this.bi = this.d(epi.a(sw.c("mco.selectServer.purchase"), (epi $$0) -> {
            this.aT = !this.aT;
        }).a(this.g - 90, 12, 80, 20).a());
    }

    public void d() {
        this.bl = this.e(epi.a(sw.c("mco.selectServer.trial"), (epi $$0) -> {
            if (!this.aV || this.aW) {
                return;
            }
            ac.i().a("https://aka.ms/startjavarealmstrial");
            this.f.a(this.aH);
        }).a(this.g / 2 + 52, this.R() + 137 - 20, 98, 20).a());
        this.bm = this.e(epi.a(sw.c("mco.selectServer.buy"), (epi $$0) -> ac.i().a("https://aka.ms/BuyJavaRealms")).a(this.g / 2 + 52, this.R() + 160 - 20, 98, 20).a());
        this.bn = this.e(new b());
    }

    public void e() {
        this.aK = epi.a(Z, (epi $$0) -> this.a(this.O(), this)).a(100).a();
        this.aN = epi.a(ab, (epi $$0) -> this.g(this.O())).a(100).a();
        this.aM = epi.a(V, (epi $$0) -> this.f(this.O())).a(100).a();
        this.aO = epi.a(aa, (epi $$0) -> this.h(this.O())).a(100).a();
        this.aL = epi.a(sv.k, (epi $$0) -> {
            if (!this.aU) {
                this.f.a(this.aH);
            }
        }).a(100).a();
        esf $$02 = new esf();
        esf.b $$12 = $$02.d(1);
        esk $$2 = $$12.a(new esk(308, 20, esk.b.a), $$12.b().e(4));
        $$2.a(this.aK);
        $$2.a(this.aN);
        $$2.a(this.aM);
        esk $$3 = $$12.a(new esk(204, 20, esk.b.a), $$12.b().b());
        $$3.a(this.aO);
        $$3.a(this.aL);
        $$02.a((epf $$1) -> {
            epf cfr_ignored_0 = (epf)this.d($$1);
        });
        $$02.c();
        ese.a($$02, 0, this.h - 64, this.g, 64);
    }

    void a(@Nullable ejq $$0) {
        boolean $$1;
        this.aL.r = true;
        if (!eiu.C() || !this.aS) {
            eiu.a(this.aK, this.aM, this.aN, this.bl, this.bm, this.bn, this.bk, this.bj, this.bi, this.aO);
            return;
        }
        this.bl.s = $$1 = this.a() && this.aV && !this.aW;
        this.bl.r = $$1;
        this.bm.s = this.a();
        this.bn.s = this.a();
        this.bk.r = true;
        this.bk.s = this.aZ != null;
        this.bj.r = true;
        this.bj.s = true;
        this.bi.r = !this.a();
        this.aK.s = !this.a();
        this.aM.s = !this.a();
        this.aO.s = !this.a();
        this.aN.s = !this.a();
        this.aL.s = !this.a();
        this.aK.r = this.b($$0);
        this.aM.r = this.c($$0);
        this.aO.r = this.e($$0);
        this.aN.r = this.d($$0);
    }

    private boolean D() {
        return (!this.a() || this.aT) && eiu.C() && this.aS;
    }

    boolean b(@Nullable ejq $$0) {
        return $$0 != null && !$$0.j && $$0.e == ejq.b.b;
    }

    private boolean c(@Nullable ejq $$0) {
        return $$0 != null && $$0.j && this.j($$0);
    }

    private boolean d(@Nullable ejq $$0) {
        return $$0 != null && this.j($$0);
    }

    private boolean e(@Nullable ejq $$0) {
        return $$0 != null && !this.j($$0);
    }

    @Override
    public void f() {
        super.f();
        if (this.bj != null) {
            this.bj.a();
        }
        this.aU = false;
        ++this.aR;
        boolean $$0 = eiu.C();
        if (this.av == null && $$0) {
            this.av = this.a(this.f.aX());
        } else if (this.av != null && !$$0) {
            this.av = null;
        }
        if (this.av != null) {
            this.av.b();
        }
        if (this.a()) {
            ++this.bb;
        }
        if (this.bi != null) {
            this.bi.r = this.bi.s = this.D();
        }
    }

    private elx.c a(ekq $$02) {
        elx.c $$12 = $$02.a.a();
        $$12.a($$02.c, (T $$0) -> {
            List<ejq> $$1 = this.aw.a((List<ejq>)$$0);
            boolean $$2 = false;
            for (ejq $$3 : $$1) {
                if (!this.k($$3)) continue;
                $$2 = true;
            }
            this.aP = $$1;
            this.aS = true;
            this.E();
            if (!aE && $$2) {
                aE = true;
                this.G();
            }
        });
        eiu.a(eiz::f, (T $$0) -> {
            this.bh.clear();
            this.bh.addAll((Collection<ejp>)$$0);
            this.E();
        });
        $$12.a($$02.e, (T $$0) -> {
            this.aQ = $$0;
            if (this.aQ > 0 && this.aF.tryAcquire(1)) {
                this.f.aU().c(sw.a("mco.configure.world.invite.narration", this.aQ));
            }
        });
        $$12.a($$02.f, (T $$0) -> {
            if (this.aW) {
                return;
            }
            if ($$0 != this.aV && this.a()) {
                this.aV = $$0;
                this.aX = false;
            } else {
                this.aV = $$0;
            }
        });
        $$12.a($$02.d, (T $$0) -> {
            block0: for (eju $$1 : $$0.a) {
                for (ejq $$2 : this.aP) {
                    if ($$2.a != $$1.a) continue;
                    $$2.a($$1);
                    continue block0;
                }
            }
        });
        $$12.a($$02.g, (T $$1) -> {
            $$0.h.a((ejo)$$1);
            this.aY = $$0.h.a();
            this.aZ = $$0.h.b();
            this.a((ejq)null);
        });
        return $$12;
    }

    private static <T> void a(i<T> $$02, Consumer<T> $$1) {
        enn $$2 = enn.N();
        ((CompletableFuture)CompletableFuture.supplyAsync(() -> {
            try {
                return $$02.request(eiz.a($$2));
            }
            catch (ekm $$2) {
                throw new RuntimeException($$2);
            }
        }).thenAcceptAsync($$1, (Executor)$$2)).exceptionally($$0 -> {
            a.error("Failed to execute call to Realms Service", $$0);
            return null;
        });
    }

    private void E() {
        boolean $$0 = !this.aS;
        this.aI.v();
        ArrayList<UUID> $$12 = new ArrayList<UUID>();
        for (ejp $$2 : this.bh) {
            this.a(this.aI, $$2);
            if ($$2.a() || this.ax.contains($$2.c())) continue;
            $$12.add($$2.c());
        }
        if (!$$12.isEmpty()) {
            eiu.a((eiz $$1) -> {
                $$1.a($$12);
                return null;
            }, (T $$1) -> this.ax.addAll($$12));
        }
        if (this.B()) {
            this.aI.a(new k());
        }
        j $$3 = null;
        ejq $$4 = this.O();
        for (ejq $$5 : this.aP) {
            j $$6 = new j($$5);
            this.aI.a($$6);
            if ($$4 == null || $$4.a != $$5.a) continue;
            $$3 = $$6;
        }
        if ($$0) {
            this.a((ejq)null);
        } else {
            this.aI.a($$3);
        }
    }

    private void a(h $$0, ejp $$1) {
        if ($$1 instanceof ejp.a) {
            ejp.a $$2 = (ejp.a)$$1;
            $$0.a(new f($$2.d(), $$2));
            $$0.a(new a($$2.a(this)));
        }
    }

    void F() {
        if (this.av != null) {
            this.av.c();
        }
    }

    private void G() {
        new Thread(() -> {
            List<eka> $$0 = eiy.a();
            eiz $$1 = eiz.a();
            ejl $$2 = new ejl();
            $$2.a = $$0;
            $$2.b = this.H();
            try {
                $$1.a($$2);
            }
            catch (Throwable $$3) {
                a.warn("Could not send ping result to Realms: ", $$3);
            }
        }).start();
    }

    private List<Long> H() {
        ArrayList $$0 = Lists.newArrayList();
        for (ejq $$1 : this.aP) {
            if (!this.k($$1)) continue;
            $$0.add($$1.a);
        }
        return $$0;
    }

    public void a(boolean $$0) {
        this.aW = $$0;
    }

    private void f(@Nullable ejq $$0) {
        if ($$0 != null) {
            String $$1 = anx.a($$0.b, this.f.U().b(), $$0.k);
            this.f.o.a($$1);
            ac.i().a($$1);
        }
    }

    private void I() {
        if (!aC) {
            aC = true;
            new Thread("MCO Compatability Checker #1"){

                @Override
                public void run() {
                    eiz $$0 = eiz.a();
                    try {
                        eiz.a $$1 = $$0.j();
                        if ($$1 != eiz.a.a) {
                            aD = new ekz(eiu.this.aH);
                            eiu.this.f.execute(() -> eiu.this.f.a(aD));
                            return;
                        }
                        eiu.this.J();
                    }
                    catch (ekm $$2) {
                        aC = false;
                        a.error("Couldn't connect to realms", (Throwable)$$2);
                        if ($$2.a == 401) {
                            aD = new ele(sw.c("mco.error.invalid.session.title"), sw.c("mco.error.invalid.session.message"), eiu.this.aH);
                            eiu.this.f.execute(() -> eiu.this.f.a(aD));
                        }
                        eiu.this.f.execute(() -> eiu.this.f.a(new ele($$2, eiu.this.aH)));
                    }
                }
            }.start();
        }
    }

    void J() {
        new Thread("MCO Compatability Checker #1"){

            @Override
            public void run() {
                eiz $$0 = eiz.a();
                try {
                    Boolean $$1 = $$0.h();
                    if ($$1.booleanValue()) {
                        a.info("Realms is available for this user");
                        aA = true;
                    } else {
                        a.info("Realms is not available for this user");
                        aA = false;
                        eiu.this.f.execute(() -> eiu.this.f.a(new elj(eiu.this.aH)));
                    }
                    aB = true;
                }
                catch (ekm $$2) {
                    a.error("Couldn't connect to realms", (Throwable)$$2);
                    eiu.this.f.execute(() -> eiu.this.f.a(new ele($$2, eiu.this.aH)));
                }
            }
        }.start();
    }

    private void K() {
        if (eiz.a != eiz.b.b) {
            new Thread("MCO Stage Availability Checker #1"){

                @Override
                public void run() {
                    eiz $$0 = eiz.a();
                    try {
                        Boolean $$1 = $$0.i();
                        if ($$1.booleanValue()) {
                            eiz.b();
                            a.info("Switched to stage");
                            eiu.this.F();
                        }
                    }
                    catch (ekm $$2) {
                        a.error("Couldn't connect to Realms: {}", (Object)$$2.toString());
                    }
                }
            }.start();
        }
    }

    private void L() {
        if (eiz.a != eiz.b.c) {
            new Thread("MCO Local Availability Checker #1"){

                @Override
                public void run() {
                    eiz $$0 = eiz.a();
                    try {
                        Boolean $$1 = $$0.i();
                        if ($$1.booleanValue()) {
                            eiz.d();
                            a.info("Switched to local");
                            eiu.this.F();
                        }
                    }
                    catch (ekm $$2) {
                        a.error("Couldn't connect to Realms: {}", (Object)$$2.toString());
                    }
                }
            }.start();
        }
    }

    private void M() {
        eiz.c();
        this.F();
    }

    private void g(@Nullable ejq $$0) {
        if ($$0 != null && (this.f.U().b().equals($$0.g) || ay)) {
            this.N();
            this.f.a(new ela(this, $$0.a));
        }
    }

    private void h(@Nullable ejq $$0) {
        if ($$0 != null && !this.f.U().b().equals($$0.g)) {
            this.N();
            tj $$12 = sw.c("mco.configure.world.leave.question.line1");
            tj $$2 = sw.c("mco.configure.world.leave.question.line2");
            this.f.a(new elg($$1 -> this.a($$1, $$0), elg.a.b, $$12, $$2, true));
        }
    }

    private void N() {
        az = (int)this.aI.l();
    }

    @Nullable
    private ejq O() {
        if (this.aI == null) {
            return null;
        }
        d $$0 = (d)this.aI.f();
        return $$0 != null ? $$0.b() : null;
    }

    private void a(boolean $$0, final ejq $$1) {
        if ($$0) {
            new Thread("Realms-leave-server"){

                @Override
                public void run() {
                    try {
                        eiz $$0 = eiz.a();
                        $$0.d($$1.a);
                        eiu.this.f.execute(() -> eiu.this.i($$1));
                    }
                    catch (ekm $$12) {
                        a.error("Couldn't configure world");
                        eiu.this.f.execute(() -> eiu.this.f.a(new ele($$12, (euq)eiu.this)));
                    }
                }
            }.start();
        }
        this.f.a(this);
    }

    void i(ejq $$0) {
        this.aP = this.aw.a($$0);
        this.aI.i().removeIf($$1 -> {
            ejq $$2 = $$1.b();
            return $$2 != null && $$2.a == $$0.a;
        });
        this.aI.a((d)null);
        this.a((ejq)null);
        this.aK.r = false;
    }

    void a(UUID $$0) {
        eiu.a((eiz $$1) -> {
            $$1.b(List.of($$0));
            return null;
        }, (T $$12) -> {
            this.bh.removeIf($$1 -> $$1.b() && $$0.equals($$1.c()));
            this.E();
        });
    }

    public void g() {
        if (this.aI != null) {
            this.aI.a((d)null);
        }
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.bd.forEach(eit::a);
            this.P();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    void P() {
        if (this.a() && this.aT) {
            this.aT = false;
        } else {
            this.f.a(this.aH);
        }
    }

    @Override
    public boolean a(char $$0, int $$12) {
        this.bd.forEach($$1 -> $$1.a($$0));
        return true;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.aI.a($$0, $$1, $$2, $$3);
        $$0.a(L, this.g / 2 - 64, 5, 0.0f, 0.0f, 128, 34, 128, 64);
        if (eiz.a == eiz.b.b) {
            this.d($$0);
        }
        if (eiz.a == eiz.b.c) {
            this.c($$0);
        }
        if (this.a()) {
            $$0.c().a();
            $$0.c().a(0.0f, 0.0f, 100.0f);
            this.c($$0, $$1, $$2, $$3);
            $$0.c().b();
        } else {
            if (this.aX) {
                this.a((ejq)null);
                if (!this.aJ) {
                    this.e(this.aI);
                    this.aJ = true;
                }
                this.aK.r = this.b(this.O());
            }
            this.aX = false;
        }
        super.a($$0, $$1, $$2, $$3);
        if (this.aV && !this.aW && this.a()) {
            int $$4 = 8;
            int $$5 = 8;
            int $$6 = 0;
            if ((ac.b() / 800L & 1L) == 1L) {
                $$6 = 8;
            }
            $$0.c().a();
            $$0.c().a(0.0f, 0.0f, 110.0f);
            $$0.a(Q, this.bl.p() + this.bl.k() - 8 - 4, this.bl.r() + this.bl.h() / 2 - 4, 0.0f, (float)$$6, 8, 8, 8, 16);
            $$0.c().b();
        }
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.a($$0, $$1) && this.aT) {
            this.aT = false;
            this.aU = true;
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private boolean a(double $$0, double $$1) {
        int $$2 = this.Q();
        int $$3 = this.R();
        return $$0 < (double)($$2 - 5) || $$0 > (double)($$2 + 315) || $$1 < (double)($$3 - 5) || $$1 > (double)($$3 + 171);
    }

    private void c(eox $$0, int $$1, int $$2, float $$3) {
        int $$4 = this.Q();
        int $$5 = this.R();
        if (!this.aX) {
            this.ba = 0;
            this.bb = 0;
            this.bc = true;
            this.a((ejq)null);
            if (this.aJ) {
                this.f(this.aI);
                this.aJ = false;
            }
            this.f.aU().c(Y);
        }
        if (this.aS) {
            this.aX = true;
        }
        $$0.a(1.0f, 1.0f, 1.0f, 0.7f);
        RenderSystem.enableBlend();
        $$0.a(O, 0, 44, 0.0f, 0.0f, this.g, this.h - 44, 310, 166);
        RenderSystem.disableBlend();
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        $$0.a(N, $$4, $$5, 0.0f, 0.0f, 310, 166, 310, 166);
        if (!au.isEmpty()) {
            $$0.a(au.get(this.ba), $$4 + 7, $$5 + 7, 0.0f, 0.0f, 195, 152, 195, 152);
            if (this.bb % 95 < 5) {
                if (!this.bc) {
                    this.ba = (this.ba + 1) % au.size();
                    this.bc = true;
                }
            } else {
                this.bc = false;
            }
        }
        this.bg.c($$0, this.g / 2 + 52, $$5 + 7, 10, 0xFFFFFF);
        this.bl.a($$0, $$1, $$2, $$3);
        this.bm.a($$0, $$1, $$2, $$3);
        this.bn.a($$0, $$1, $$2, $$3);
    }

    int Q() {
        return (this.g - 310) / 2;
    }

    int R() {
        return this.h / 2 - 80;
    }

    public void a(@Nullable ejq $$0, euq $$1) {
        if ($$0 != null) {
            try {
                if (!this.bf.tryLock(1L, TimeUnit.SECONDS)) {
                    return;
                }
                if (this.bf.getHoldCount() > 1) {
                    return;
                }
            }
            catch (InterruptedException $$2) {
                return;
            }
            this.aG = true;
            this.f.a(new elh($$1, new emn(this, $$1, $$0, this.bf)));
        }
    }

    boolean j(ejq $$0) {
        return $$0.g != null && $$0.g.equals(this.f.U().b());
    }

    private boolean k(ejq $$0) {
        return this.j($$0) && !$$0.j;
    }

    void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(G, $$1, $$2, 0.0f, 0.0f, 10, 28, 10, 28);
        if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
            this.d(ac);
        }
    }

    void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if (this.aR % 20 < 10) {
            $$0.a(H, $$1, $$2, 0.0f, 0.0f, 10, 28, 20, 28);
        } else {
            $$0.a(H, $$1, $$2, 10.0f, 0.0f, 10, 28, 20, 28);
        }
        if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
            if ($$5 <= 0) {
                this.d(ad);
            } else if ($$5 == 1) {
                this.d(ae);
            } else {
                this.d(sw.a("mco.selectServer.expires.days", $$5));
            }
        }
    }

    void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(b, $$1, $$2, 0.0f, 0.0f, 10, 28, 10, 28);
        if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
            this.d(af);
        }
    }

    void c(eox $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(c, $$1, $$2, 0.0f, 0.0f, 10, 28, 10, 28);
        if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
            this.d(ag);
        }
    }

    void a(eox $$0, int $$1, int $$2, boolean $$3, int $$4, int $$5, boolean $$6, boolean $$7) {
        boolean $$8 = false;
        if ($$1 >= $$4 && $$1 <= $$4 + 20 && $$2 >= $$5 && $$2 <= $$5 + 20) {
            $$8 = true;
        }
        if (!$$7) {
            $$0.a(0.5f, 0.5f, 0.5f, 1.0f);
        }
        boolean $$9 = $$7 && $$6;
        float $$10 = $$9 ? 20.0f : 0.0f;
        $$0.a(M, $$4, $$5, $$10, 0.0f, 20, 20, 40, 20);
        if ($$8 && $$7) {
            this.d(ah);
        }
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        if ($$3 && $$7) {
            int $$11 = $$8 ? 0 : (int)(Math.max(0.0f, Math.max(apa.a((float)(10 + this.aR) * 0.57f), apa.b((float)this.aR * 0.35f))) * -6.0f);
            $$0.a(I, $$4 + 10, $$5 + 2 + $$11, 40.0f, 0.0f, 8, 8, 48, 16);
        }
    }

    private void c(eox $$0) {
        String $$1 = "LOCAL!";
        $$0.c().a();
        $$0.c().a(this.g / 2 - 25, 20.0f, 0.0f);
        $$0.c().a(a.f.rotationDegrees(-20.0f));
        $$0.c().b(1.5f, 1.5f, 1.5f);
        $$0.a(this.i, "LOCAL!", 0, 0, 0x7FFF7F, false);
        $$0.c().b();
    }

    private void d(eox $$0) {
        String $$1 = "STAGE!";
        $$0.c().a();
        $$0.c().a(this.g / 2 - 25, 20.0f, 0.0f);
        $$0.c().a(a.f.rotationDegrees(-20.0f));
        $$0.c().b(1.5f, 1.5f, 1.5f);
        $$0.a(this.i, "STAGE!", 0, 0, -256, false);
        $$0.c().b();
    }

    public eiu h() {
        eiu $$0 = new eiu(this.aH);
        $$0.b(this.f, this.g, this.h);
        return $$0;
    }

    public static void a(akx $$02) {
        Set<acq> $$1 = $$02.b("textures/gui/images", $$0 -> $$0.a().endsWith(".png")).keySet();
        au = $$1.stream().filter($$0 -> $$0.b().equals("realms")).toList();
    }

    static {
        az = -1;
    }

    class h
    extends gam<d> {
        public h() {
            super(eiu.this.g, eiu.this.h, 44, eiu.this.h - 64, 36);
        }

        @Override
        public void a(@Nullable d $$0) {
            super.a($$0);
            if ($$0 != null) {
                eiu.this.a($$0.b());
            } else {
                eiu.this.a((ejq)null);
            }
        }

        @Override
        public int a() {
            return this.k() * 36;
        }

        @Override
        public int b() {
            return 300;
        }
    }

    class g
    extends ept {
        private static final sw C = sw.c("mco.invites.title");
        private static final eqp D = eqp.a(sw.c("mco.invites.nopending"));
        private static final eqp E = eqp.a(sw.c("mco.invites.pending"));
        private static final int F = 18;
        private static final int G = 15;
        private static final int H = 10;
        private static final int I = 8;
        private static final int J = 8;
        private static final int K = 11;

        public g() {
            super(eiu.this.g / 2 + 64 + 10, 15, 18, 15, 0, 0, 15, J, 18, 30, $$1 -> eiu.this.f.a(new elk($$0.aH, C)), C);
            this.a(D);
        }

        public void a() {
            this.a(eiu.this.aQ == 0 ? D : E);
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, float $$3) {
            super.b($$0, $$1, $$2, $$3);
            this.a($$0);
        }

        private void a(eox $$0) {
            boolean $$1;
            boolean bl2 = $$1 = this.r && eiu.this.aQ != 0;
            if ($$1) {
                int $$2 = (Math.min(eiu.this.aQ, 6) - 1) * 8;
                int $$3 = (int)(Math.max(0.0f, Math.max(apa.a((float)(10 + eiu.this.aR) * 0.57f), apa.b((float)eiu.this.aR * 0.35f))) * -6.0f);
                float $$4 = this.n() ? 8.0f : 0.0f;
                $$0.a(I, this.p() + 11, this.r() + $$3, (float)$$2, $$4, 8, 8, 48, 16);
            }
        }
    }

    class e
    extends epi {
        private static final int b = 20;

        public e() {
            super(eiu.this.g - 115, 12, 20, 20, sw.c("mco.news"), $$1 -> {
                if ($$0.aZ == null) {
                    return;
                }
                etj.a($$0.aZ, eiu.this, true);
                if ($$0.aY) {
                    emd.a $$2 = emd.b();
                    $$2.b = false;
                    $$0.aY = false;
                    emd.b($$2);
                }
            }, x);
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, float $$3) {
            eiu.this.a($$0, $$1, $$2, eiu.this.aY, this.p(), this.r(), this.n(), this.r);
        }
    }

    class b
    extends c {
        public b() {
            super(eiu.this.Q() + 4, eiu.this.R() + 4, $$1 -> eiu.this.P(), sw.c("mco.selectServer.close"));
        }
    }

    static interface i<T> {
        public T request(eiz var1) throws ekm;
    }

    class k
    extends d {
        k() {
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$1, $$3, $$2, $$6, $$7);
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            eiu.this.aT = true;
            return true;
        }

        private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            int $$6 = $$3 + 8;
            int $$7 = 0;
            boolean $$8 = false;
            if ($$2 <= $$4 && $$4 <= (int)eiu.this.aI.l() && $$3 <= $$5 && $$5 <= $$3 + 32) {
                $$8 = true;
            }
            int $$9 = 0x7FFF7F;
            if ($$8 && !eiu.this.a()) {
                $$9 = 6077788;
            }
            for (sw $$10 : S) {
                $$0.a(eiu.this.i, $$10, eiu.this.g / 2, $$6 + $$7, $$9);
                $$7 += 10;
            }
        }

        @Override
        public sw a() {
            return aj;
        }
    }

    class j
    extends d {
        private static final int c = 36;
        private final ejq d;

        public j(ejq $$0) {
            this.d = $$0;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a(this.d, $$0, $$3, $$2, $$6, $$7);
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if (this.d.e == ejq.b.c) {
                eiu.this.f.a(new elc(this.d, eiu.this));
            } else if (eiu.this.b(this.d)) {
                if (ac.b() - eiu.this.be < 250L && this.aB_()) {
                    eiu.this.f.ah().a(fxt.a(amh.yo, 1.0f));
                    eiu.this.a(this.d, eiu.this);
                }
                eiu.this.be = ac.b();
            }
            return true;
        }

        @Override
        public boolean a(int $$0, int $$1, int $$2) {
            if (esu.a($$0) && eiu.this.b(this.d)) {
                eiu.this.f.ah().a(fxt.a(amh.yo, 1.0f));
                eiu.this.a(this.d, eiu.this);
                return true;
            }
            return super.a($$0, $$1, $$2);
        }

        private void a(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5) {
            this.b($$0, $$1, $$2 + 36, $$3, $$4, $$5);
        }

        private void b(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5) {
            if ($$0.e == ejq.b.c) {
                $$1.a(K, $$2 + 10, $$3 + 6, 0.0f, 0.0f, 40, 20, 40, 20);
                float $$6 = 0.5f + (1.0f + apa.a((float)eiu.this.aR * 0.25f)) * 0.25f;
                int $$7 = 0xFF000000 | (int)(127.0f * $$6) << 16 | (int)(255.0f * $$6) << 8 | (int)(127.0f * $$6);
                $$1.a(eiu.this.i, T, $$2 + 10 + 40 + 75, $$3 + 12, $$7);
                return;
            }
            int $$8 = 225;
            int $$9 = 2;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, 225, 2);
            if (!"0".equals($$0.r.a)) {
                String $$10 = n.h + $$0.r.a;
                $$1.a(eiu.this.i, $$10, $$2 + 207 - eiu.this.i.b($$10), $$3 + 3, 0x808080, false);
                if ($$4 >= $$2 + 207 - eiu.this.i.b($$10) && $$4 <= $$2 + 207 && $$5 >= $$3 + 1 && $$5 <= $$3 + 10 && $$5 < eiu.this.h - 40 && $$5 > 32 && !eiu.this.a()) {
                    eiu.this.d(sw.b($$0.r.b));
                }
            }
            if (eiu.this.j($$0) && $$0.j) {
                sw $$11 = $$0.k ? W : U;
                int $$12 = $$3 + 11 + 5;
                $$1.a(eiu.this.i, $$11, $$2 + 2, $$12 + 1, 15553363, false);
            } else {
                if ($$0.m == ejq.c.b) {
                    int $$13 = 0xCCAC5C;
                    int $$14 = eiu.this.i.a(X);
                    $$1.a(eiu.this.i, X, $$2 + 2, $$3 + 12, 0xCCAC5C, false);
                    $$1.a(eiu.this.i, $$0.c(), $$2 + 2 + $$14, $$3 + 12, 0x6C6C6C, false);
                } else {
                    $$1.a(eiu.this.i, $$0.a(), $$2 + 2, $$3 + 12, 0x6C6C6C, false);
                }
                if (!eiu.this.j($$0)) {
                    $$1.a(eiu.this.i, $$0.f, $$2 + 2, $$3 + 12 + 11, 0x4C4C4C, false);
                }
            }
            $$1.a(eiu.this.i, $$0.b(), $$2 + 2, $$3 + 1, 0xFFFFFF, false);
            emf.a($$1, $$2 - 36, $$3, 32, $$0.g);
        }

        private void a(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
            int $$8 = $$2 + $$6 + 22;
            if ($$0.j) {
                eiu.this.a($$1, $$8, $$3 + $$7, $$4, $$5);
            } else if ($$0.e == ejq.b.a) {
                eiu.this.c($$1, $$8, $$3 + $$7, $$4, $$5);
            } else if (eiu.this.j($$0) && $$0.l < 7) {
                eiu.this.a($$1, $$8, $$3 + $$7, $$4, $$5, $$0.l);
            } else if ($$0.e == ejq.b.b) {
                eiu.this.b($$1, $$8, $$3 + $$7, $$4, $$5);
            }
        }

        @Override
        public sw a() {
            if (this.d.e == ejq.b.c) {
                return ai;
            }
            return sw.a("narrator.select", new Object[]{this.d.c});
        }

        @Override
        @Nullable
        public ejq b() {
            return this.d;
        }
    }

    abstract class d
    extends eqc.a<d> {
        d() {
        }

        @Nullable
        public ejq b() {
            return null;
        }
    }

    class f
    extends d {
        private static final int c = 40;
        private static final int d = 36;
        private static final int e = -12303292;
        private final sw f;
        private final List<epf> g = new ArrayList<epf>();
        @Nullable
        private final c h;
        private final eqa i;
        private final esf j;
        private final ese k;
        private int l = -1;

        public f(sw $$0, ejp $$12) {
            this.f = $$0;
            this.j = new esf();
            int $$2 = 7;
            this.j.a(new epu(20, 20, R), 0, 0, this.j.a().a(7, 7, 0, 0));
            this.j.a(esl.a(40), 0, 0);
            this.k = this.j.a(new ese(0, ((eiu)eiu.this).i.b * 3), 0, 1, this.j.a().c(7));
            this.i = this.k.a(new eqa($$0, eiu.this.i).b(true).j(3), this.k.a().b().d());
            this.j.a(esl.a(40), 0, 2);
            this.h = $$12.b() ? this.j.a(new c($$1 -> eiu.this.a($$12.c()), sw.c("mco.notification.dismiss")), 0, 2, this.j.a().c().a(0, 7, 7, 0)) : null;
            this.j.a(this.g::add);
        }

        @Override
        public boolean a(int $$0, int $$1, int $$2) {
            if (this.h != null && this.h.a($$0, $$1, $$2)) {
                return true;
            }
            return super.a($$0, $$1, $$2);
        }

        private void a(int $$0) {
            if (this.l != $$0) {
                this.b($$0);
                this.l = $$0;
            }
        }

        private void b(int $$0) {
            int $$1 = $$0 - 80;
            this.k.b($$1);
            this.i.i($$1);
            this.j.c();
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$42, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.j.b($$3, $$2);
            this.a($$42 - 4);
            this.g.forEach($$4 -> $$4.a($$0, $$6, $$7, $$9));
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if (this.h != null) {
                this.h.a($$0, $$1, $$2);
            }
            return true;
        }

        @Override
        public sw a() {
            return this.f;
        }
    }

    class a
    extends d {
        private final epi c;
        private final int d;

        public a(epi $$0) {
            this.d = eiu.this.g / 2 - 75;
            this.c = $$0;
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            this.c.a($$0, $$1, $$2);
            return true;
        }

        @Override
        public boolean a(int $$0, int $$1, int $$2) {
            if (this.c.a($$0, $$1, $$2)) {
                return true;
            }
            return super.a($$0, $$1, $$2);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.c.b(this.d, $$2 + 4);
            this.c.a($$0, $$6, $$7, $$9);
        }

        @Override
        public sw a() {
            return this.c.l();
        }
    }

    static class c
    extends epi {
        protected c(epi.c $$0, sw $$1) {
            this(0, 0, $$0, $$1);
        }

        protected c(int $$0, int $$1, epi.c $$2, sw $$3) {
            super($$0, $$1, 14, 14, $$3, $$2, x);
            this.a(eqp.a($$3));
        }

        @Override
        public void b(eox $$0, int $$1, int $$2, float $$3) {
            float $$4 = this.n() ? 14.0f : 0.0f;
            $$0.a(P, this.p(), this.r(), 0.0f, $$4, 14, 14, 14, 28);
        }
    }
}

