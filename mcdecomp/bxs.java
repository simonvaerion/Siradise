/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.Contract
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class bxs
extends bwc
implements dgu {
    private static final Logger bV = LogUtils.getLogger();
    private static final int bW = 40;
    private static final int bX = 200;
    private static final int bY = 500;
    private static final float bZ = 0.3f;
    private static final float ca = 1.0f;
    private static final float cb = 1.5f;
    private static final int cc = 30;
    private static final aby<Integer> cd = acb.a(bxs.class, aca.b);
    private static final int ce = 200;
    private static final int cf = 260;
    private static final int cg = 20;
    private static final int ch = 120;
    private static final int ci = 20;
    private static final int cj = 35;
    private static final int ck = 10;
    private static final int cl = 20;
    private static final int cm = 100;
    private static final int cn = 20;
    private static final int co = 30;
    private static final float cp = 4.5f;
    private static final float cq = 0.7f;
    private static final int cr = 30;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    public bff b = new bff();
    public bff c = new bff();
    public bff d = new bff();
    public bff e = new bff();
    public bff bT = new bff();
    public bff bU = new bff();
    private final dgi<dgu.b> cw;
    private final dgu.d cx;
    private dgu.a cy;
    bxr cz = new bxr(this::a, Collections.emptyList());

    public bxs(bfn<? extends bwc> $$0, cmm $$1) {
        super($$0, $$1);
        this.cx = new a();
        this.cy = new dgu.a();
        this.cw = new dgi<dgu.b>(new dgu.b(this));
        this.bJ = 5;
        this.J().a(true);
        this.a(dxp.m, 0.0f);
        this.a(dxp.q, 8.0f);
        this.a(dxp.f, 8.0f);
        this.a(dxp.i, 8.0f);
        this.a(dxp.o, 0.0f);
        this.a(dxp.n, 0.0f);
    }

    @Override
    public uo<ur> S() {
        return new us(this, this.c(bgl.n) ? 1 : 0);
    }

    @Override
    public void a(us $$0) {
        super.a($$0);
        if ($$0.n() == 1) {
            this.b(bgl.n);
        }
    }

    @Override
    public boolean a(cmp $$0) {
        return super.a($$0) && $$0.a((bfj)this, this.ae().n().a(this.dg()));
    }

    @Override
    public float a(gu $$0, cmp $$1) {
        return 0.0f;
    }

    @Override
    public boolean b(ben $$0) {
        if (this.ga() && !$$0.a(amy.d)) {
            return true;
        }
        return super.b($$0);
    }

    boolean ga() {
        return this.c(bgl.o) || this.c(bgl.n);
    }

    @Override
    protected boolean l(bfj $$0) {
        return false;
    }

    @Override
    public boolean fB() {
        return true;
    }

    @Override
    protected float aI() {
        return this.Y + 0.55f;
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.a, 500.0).a(bhg.d, 0.3f).a(bhg.c, 1.0).a(bhg.g, 1.5).a(bhg.f, 30.0);
    }

    @Override
    public boolean aT() {
        return true;
    }

    @Override
    protected float eR() {
        return 4.0f;
    }

    @Override
    @Nullable
    protected amg s() {
        if (this.c(bgl.l) || this.ga()) {
            return null;
        }
        return this.w().b();
    }

    @Override
    protected amg d(ben $$0) {
        return amh.zx;
    }

    @Override
    protected amg g_() {
        return amh.zt;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.zH, 10.0f, 1.0f);
    }

    @Override
    public boolean z(bfj $$0) {
        this.dI().a((bfj)this, (byte)4);
        this.a(amh.zs, 10.0f, this.eS());
        blq.a((bfz)this, 40);
        return super.z($$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(cd, 0);
    }

    public int r() {
        return this.am.b(cd);
    }

    private void gf() {
        this.am.b(cd, this.gi());
    }

    @Override
    public void l() {
        cmm cmm2 = this.dI();
        if (cmm2 instanceof aif) {
            aif $$0 = (aif)cmm2;
            dgu.c.a((cmm)$$0, this.cy, this.cx);
            if (this.fH() || this.T()) {
                bxt.a((bfz)this);
            }
        }
        super.l();
        if (this.dI().r_()) {
            if (this.ag % this.gg() == 0) {
                this.cu = 10;
                if (!this.aQ()) {
                    this.dI().a(this.dn(), this.dp(), this.dt(), amh.zw, this.cY(), 5.0f, this.eS(), false);
                }
            }
            this.ct = this.cs;
            if (this.cs > 0) {
                --this.cs;
            }
            this.cv = this.cu;
            if (this.cu > 0) {
                --this.cu;
            }
            switch (this.al()) {
                case n: {
                    this.a(this.d);
                    break;
                }
                case o: {
                    this.a(this.e);
                }
            }
        }
    }

    @Override
    protected void W() {
        aif $$0 = (aif)this.dI();
        $$0.ad().a("wardenBrain");
        this.dK().a($$0, this);
        this.dI().ad().c();
        super.W();
        if ((this.ag + this.af()) % 120 == 0) {
            bxs.a($$0, this.dg(), this, 20);
        }
        if (this.ag % 20 == 0) {
            this.cz.a($$0, this::a);
            this.gf();
        }
        bxt.a(this);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.b.a();
            this.bT.a(this.ag);
        } else if ($$0 == 61) {
            this.cs = 10;
        } else if ($$0 == 62) {
            this.bU.a(this.ag);
        } else {
            super.b($$0);
        }
    }

    private int gg() {
        float $$0 = (float)this.r() / (float)bxq.c.a();
        return 40 - apa.d(apa.a($$0, 0.0f, 1.0f) * 30.0f);
    }

    public float D(float $$0) {
        return apa.i($$0, this.ct, this.cs) / 10.0f;
    }

    public float E(float $$0) {
        return apa.i($$0, this.cv, this.cu) / 10.0f;
    }

    private void a(bff $$0) {
        if ((float)$$0.b() < 4500.0f) {
            apf $$1 = this.ec();
            dcb $$2 = this.bf();
            if ($$2.l() != cvs.a) {
                for (int $$3 = 0; $$3 < 30; ++$$3) {
                    double $$4 = this.dn() + (double)apa.b($$1, -0.7f, 0.7f);
                    double $$5 = this.dp();
                    double $$6 = this.dt() + (double)apa.b($$1, -0.7f, 0.7f);
                    this.dI().a(new in(iv.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
                }
            }
        }
    }

    @Override
    public void a(aby<?> $$0) {
        if (ar.equals($$0)) {
            switch (this.al()) {
                case l: {
                    this.b.a(this.ag);
                    break;
                }
                case m: {
                    this.c.a(this.ag);
                    break;
                }
                case n: {
                    this.d.a(this.ag);
                    break;
                }
                case o: {
                    this.e.a(this.ag);
                }
            }
        }
        super.a($$0);
    }

    @Override
    public boolean cJ() {
        return this.ga();
    }

    @Override
    protected bha<?> a(Dynamic<?> $$0) {
        return bxt.a(this, $$0);
    }

    public bha<bxs> dK() {
        return super.dK();
    }

    @Override
    protected void V() {
        super.V();
        za.a(this);
    }

    @Override
    public void a(BiConsumer<dgi<?>, aif> $$0) {
        cmm cmm2 = this.dI();
        if (cmm2 instanceof aif) {
            aif $$1 = (aif)cmm2;
            $$0.accept(this.cw, $$1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Contract(value="null->false")
    public boolean a(@Nullable bfj $$0) {
        if (!($$0 instanceof bfz)) return false;
        bfz $$1 = (bfz)$$0;
        if (this.dI() != $$0.dI()) return false;
        if (!bfm.e.test($$0)) return false;
        if (this.p($$0)) return false;
        if ($$1.ae() == bfn.d) return false;
        if ($$1.ae() == bfn.bi) return false;
        if ($$1.co()) return false;
        if ($$1.es()) return false;
        if (!this.dI().w_().a($$1.cE())) return false;
        return true;
    }

    public static void a(aif $$0, eei $$1, @Nullable bfj $$2, int $$3) {
        bfa $$4 = new bfa(bfc.G, 260, 0, false, false);
        bfb.a($$0, $$2, $$1, $$3, $$4, 200);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        bxr.a(this::a).encodeStart((DynamicOps)rc.a, (Object)this.cz).resultOrPartial(arg_0 -> ((Logger)bV).error(arg_0)).ifPresent($$1 -> $$0.a("anger", (rk)$$1));
        dgu.a.a.encodeStart((DynamicOps)rc.a, (Object)this.cy).resultOrPartial(arg_0 -> ((Logger)bV).error(arg_0)).ifPresent($$1 -> $$0.a("listener", (rk)$$1));
    }

    @Override
    public void a(qr $$02) {
        super.a($$02);
        if ($$02.e("anger")) {
            bxr.a(this::a).parse(new Dynamic((DynamicOps)rc.a, (Object)$$02.c("anger"))).resultOrPartial(arg_0 -> ((Logger)bV).error(arg_0)).ifPresent($$0 -> {
                this.cz = $$0;
            });
            this.gf();
        }
        if ($$02.b("listener", 10)) {
            dgu.a.a.parse(new Dynamic((DynamicOps)rc.a, (Object)$$02.p("listener"))).resultOrPartial(arg_0 -> ((Logger)bV).error(arg_0)).ifPresent($$0 -> {
                this.cy = $$0;
            });
        }
    }

    private void gh() {
        if (!this.c(bgl.l)) {
            this.a(this.w().c(), 10.0f, this.eS());
        }
    }

    public bxq w() {
        return bxq.a(this.gi());
    }

    private int gi() {
        return this.cz.b(this.j());
    }

    public void b(bfj $$0) {
        this.cz.a($$0);
    }

    public void c(@Nullable bfj $$0) {
        this.a($$0, 35, true);
    }

    @VisibleForTesting
    public void a(@Nullable bfj $$0, int $$1, boolean $$2) {
        if (!this.fQ() && this.a($$0)) {
            bxt.a((bfz)this);
            boolean $$3 = !(this.dK().c(bpb.o).orElse(null) instanceof byo);
            int $$4 = this.cz.a($$0, $$1);
            if ($$0 instanceof byo && $$3 && bxq.a($$4).d()) {
                this.dK().b(bpb.o);
            }
            if ($$2) {
                this.gh();
            }
        }
    }

    public Optional<bfz> fY() {
        if (this.w().d()) {
            return this.cz.a();
        }
        return Optional.empty();
    }

    @Override
    @Nullable
    public bfz j() {
        return this.dK().c(bpb.o).orElse(null);
    }

    @Override
    public boolean h(double $$0) {
        return false;
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.dK().a(bpb.aD, apz.a, 1200L);
        if ($$2 == bgd.k) {
            this.b(bgl.n);
            this.dK().a(bpb.aB, apz.a, bxt.a);
            this.a(amh.zp, 5.0f, 1.0f);
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        boolean $$2 = super.a($$0, $$1);
        if (!(this.dI().B || this.fQ() || this.ga())) {
            bfj $$3 = $$0.d();
            this.a($$3, bxq.c.a() + 20, false);
            if (this.bA.c(bpb.o).isEmpty() && $$3 instanceof bfz) {
                bfz $$4 = (bfz)$$3;
                if (!$$0.b() || this.a((bfj)$$4, 5.0)) {
                    this.l($$4);
                }
            }
        }
        return $$2;
    }

    public void l(bfz $$0) {
        this.dK().b(bpb.ax);
        this.dK().a(bpb.o, $$0);
        this.dK().b(bpb.E);
        blq.a((bfz)this, 200);
    }

    @Override
    public bfk a(bgl $$0) {
        bfk $$1 = super.a($$0);
        if (this.ga()) {
            return bfk.c($$1.a, 1.0f);
        }
        return $$1;
    }

    @Override
    public boolean bp() {
        return !this.ga() && super.bp();
    }

    @Override
    protected void A(bfj $$0) {
        if (!this.fQ() && !this.dK().a(bpb.aG)) {
            this.dK().a(bpb.aG, apz.a, 20L);
            this.c($$0);
            bxt.a(this, $$0.di());
        }
        super.A($$0);
    }

    @VisibleForTesting
    public bxr fZ() {
        return this.cz;
    }

    @Override
    protected bpj b(cmm $$0) {
        return new bpi(this, $$0){

            @Override
            protected dxv a(int $$0) {
                this.o = new dxy();
                this.o.a(true);
                return new dxv(this.o, $$0){

                    @Override
                    protected float a(dxr $$0, dxr $$1) {
                        return $$0.b($$1);
                    }
                };
            }
        };
    }

    @Override
    public dgu.a gb() {
        return this.cy;
    }

    @Override
    public dgu.d gc() {
        return this.cx;
    }

    class a
    implements dgu.d {
        private static final int b = 16;
        private final dgp c;

        a() {
            this.c = new dgj(bxs.this, bxs.this.cF());
        }

        @Override
        public int a() {
            return 16;
        }

        @Override
        public dgp b() {
            return this.c;
        }

        @Override
        public anl<dgl> c() {
            return anc.b;
        }

        @Override
        public boolean d() {
            return true;
        }

        @Override
        public boolean a(aif $$0, gu $$1, dgl $$2, dgl.a $$3) {
            bfz $$4;
            if (bxs.this.fQ() || bxs.this.es() || bxs.this.dK().a(bpb.aH) || bxs.this.ga() || !$$0.w_().a($$1)) {
                return false;
            }
            bfj bfj2 = $$3.a();
            return !(bfj2 instanceof bfz) || bxs.this.a((bfj)($$4 = (bfz)bfj2));
        }

        @Override
        public void a(aif $$0, gu $$1, dgl $$2, @Nullable bfj $$3, @Nullable bfj $$4, float $$5) {
            if (bxs.this.es()) {
                return;
            }
            bxs.this.bA.a(bpb.aH, apz.a, 40L);
            $$0.a((bfj)bxs.this, (byte)61);
            bxs.this.a(amh.zI, 5.0f, bxs.this.eS());
            gu $$6 = $$1;
            if ($$4 != null) {
                if (bxs.this.a($$4, 30.0)) {
                    if (bxs.this.dK().a(bpb.az)) {
                        if (bxs.this.a($$4)) {
                            $$6 = $$4.di();
                        }
                        bxs.this.c($$4);
                    } else {
                        bxs.this.a($$4, 10, true);
                    }
                }
                bxs.this.dK().a(bpb.az, apz.a, 100L);
            } else {
                bxs.this.c($$3);
            }
            if (!bxs.this.w().d()) {
                Optional<bfz> $$7 = bxs.this.cz.a();
                if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                    bxt.a(bxs.this, $$6);
                }
            }
        }
    }
}

