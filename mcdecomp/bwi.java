/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class bwi
extends brj
implements bgy<Optional<cen>>,
bvu {
    private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
    private static final bhe bT = new bhe(e, "Covered armor bonus", 20.0, bhe.a.a);
    protected static final aby<ha> b = acb.a(bwi.class, aca.p);
    protected static final aby<Byte> c = acb.a(bwi.class, aca.a);
    protected static final aby<Byte> d = acb.a(bwi.class, aca.a);
    private static final int bU = 6;
    private static final byte bV = 16;
    private static final byte bW = 16;
    private static final int bX = 8;
    private static final int bY = 8;
    private static final int bZ = 5;
    private static final float ca = 0.05f;
    static final Vector3f cb = ac.a(() -> {
        hz $$0 = ha.d.q();
        return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
    });
    private float cc;
    private float cd;
    @Nullable
    private gu ce;
    private int cf;
    private static final float cg = 1.0f;

    public bwi(bfn<? extends bwi> $$0, cmm $$1) {
        super((bfn<? extends brj>)$$0, $$1);
        this.bJ = 5;
        this.bK = new d(this);
    }

    @Override
    protected void x() {
        this.bO.a(1, new bnd(this, byo.class, 8.0f, 0.02f, true));
        this.bO.a(4, new a());
        this.bO.a(7, new f());
        this.bO.a(8, new bnq(this));
        this.bP.a(1, new bon(this, this.getClass()).a(new Class[0]));
        this.bP.a(2, new e(this));
        this.bP.a(3, new c(this));
    }

    @Override
    protected bfj.b aS() {
        return bfj.b.a;
    }

    @Override
    public ami cY() {
        return ami.f;
    }

    @Override
    protected amg s() {
        return amh.uY;
    }

    @Override
    public void N() {
        if (!this.gd()) {
            super.N();
        }
    }

    @Override
    protected amg g_() {
        return amh.ve;
    }

    @Override
    protected amg d(ben $$0) {
        if (this.gd()) {
            return amh.vg;
        }
        return amh.vf;
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(b, ha.a);
        this.am.a(c, (byte)0);
        this.am.a(d, (byte)16);
    }

    public static bhf.a q() {
        return bgb.y().a(bhg.a, 30.0);
    }

    @Override
    protected blt D() {
        return new b(this);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a(ha.a($$0.f("AttachFace")));
        this.am.b(c, $$0.f("Peek"));
        if ($$0.b("Color", 99)) {
            this.am.b(d, $$0.f("Color"));
        }
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("AttachFace", (byte)this.w().d());
        $$0.a("Peek", this.am.b(c));
        $$0.a("Color", this.am.b(d));
    }

    @Override
    public void l() {
        super.l();
        if (!(this.dI().B || this.bM() || this.a(this.di(), this.w()))) {
            this.ga();
        }
        if (this.gb()) {
            this.gc();
        }
        if (this.dI().B) {
            if (this.cf > 0) {
                --this.cf;
            } else {
                this.ce = null;
            }
        }
    }

    private void ga() {
        ha $$0 = this.i(this.di());
        if ($$0 != null) {
            this.a($$0);
        } else {
            this.r();
        }
    }

    @Override
    protected eed am() {
        float $$0 = bwi.F(this.cd);
        ha $$1 = this.w().g();
        float $$2 = this.ae().k() / 2.0f;
        return bwi.a($$1, $$0).d(this.dn() - (double)$$2, this.dp(), this.dt() - (double)$$2);
    }

    private static float F(float $$0) {
        return 0.5f - apa.a((0.5f + $$0) * (float)Math.PI) * 0.5f;
    }

    private boolean gb() {
        this.cc = this.cd;
        float $$0 = (float)this.gf() * 0.01f;
        if (this.cd == $$0) {
            return false;
        }
        this.cd = this.cd > $$0 ? apa.a(this.cd - 0.05f, $$0, 1.0f) : apa.a(this.cd + 0.05f, 0.0f, $$0);
        return true;
    }

    private void gc() {
        this.an();
        float $$02 = bwi.F(this.cd);
        float $$1 = bwi.F(this.cc);
        ha $$2 = this.w().g();
        float $$3 = $$02 - $$1;
        if ($$3 <= 0.0f) {
            return;
        }
        List<bfj> $$4 = this.dI().a((bfj)this, bwi.a($$2, $$1, $$02).d(this.dn() - 0.5, this.dp(), this.dt() - 0.5), bfm.f.and($$0 -> !$$0.v(this)));
        for (bfj $$5 : $$4) {
            if ($$5 instanceof bwi || $$5.ae) continue;
            $$5.a(bgf.e, new eei($$3 * (float)$$2.j(), $$3 * (float)$$2.k(), $$3 * (float)$$2.l()));
        }
    }

    public static eed a(ha $$0, float $$1) {
        return bwi.a($$0, -1.0f, $$1);
    }

    public static eed a(ha $$0, float $$1, float $$2) {
        double $$3 = Math.max($$1, $$2);
        double $$4 = Math.min($$1, $$2);
        return new eed(gu.b).b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3).a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
    }

    @Override
    public double bw() {
        bfn<?> $$0 = this.cW().ae();
        if (this.cW() instanceof cah || $$0 == bfn.an) {
            return 0.1875 - this.cW().bx();
        }
        return super.bw();
    }

    @Override
    public boolean a(bfj $$0, boolean $$1) {
        if (this.dI().r_()) {
            this.ce = null;
            this.cf = 0;
        }
        this.a(ha.a);
        return super.a($$0, $$1);
    }

    @Override
    public void Y() {
        super.Y();
        if (this.dI().B) {
            this.ce = this.di();
        }
        this.aW = 0.0f;
        this.aV = 0.0f;
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.a_(0.0f);
        this.aX = this.dy();
        this.bk();
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(bgf $$0, eei $$1) {
        if ($$0 == bgf.d) {
            this.r();
        } else {
            super.a($$0, $$1);
        }
    }

    @Override
    public eei dl() {
        return eei.b;
    }

    @Override
    public void f(eei $$0) {
    }

    @Override
    public void e(double $$0, double $$1, double $$2) {
        gu $$3 = this.di();
        if (this.bM()) {
            super.e($$0, $$1, $$2);
        } else {
            super.e((double)apa.a($$0) + 0.5, apa.a($$1 + 0.5), (double)apa.a($$2) + 0.5);
        }
        if (this.ag == 0) {
            return;
        }
        gu $$4 = this.di();
        if (!$$4.equals($$3)) {
            this.am.b(c, (byte)0);
            this.at = true;
            if (this.dI().B && !this.bM() && !$$4.equals(this.ce)) {
                this.ce = $$3;
                this.cf = 6;
                this.ab = this.dn();
                this.ac = this.dp();
                this.ad = this.dt();
            }
        }
    }

    @Nullable
    protected ha i(gu $$0) {
        for (ha $$1 : ha.values()) {
            if (!this.a($$0, $$1)) continue;
            return $$1;
        }
        return null;
    }

    boolean a(gu $$0, ha $$1) {
        if (this.j($$0)) {
            return false;
        }
        ha $$2 = $$1.g();
        if (!this.dI().a($$0.a($$1), (bfj)this, $$2)) {
            return false;
        }
        eed $$3 = bwi.a($$2, 1.0f).a($$0).h(1.0E-6);
        return this.dI().a((bfj)this, $$3);
    }

    private boolean j(gu $$0) {
        dcb $$1 = this.dI().a_($$0);
        if ($$1.i()) {
            return false;
        }
        boolean $$2 = $$1.a(cpo.bQ) && $$0.equals(this.di());
        return !$$2;
    }

    protected boolean r() {
        if (this.fQ() || !this.bs()) {
            return false;
        }
        gu $$0 = this.di();
        for (int $$1 = 0; $$1 < 5; ++$$1) {
            ha $$3;
            gu $$2 = $$0.b(apa.b(this.af, -8, 8), apa.b(this.af, -8, 8), apa.b(this.af, -8, 8));
            if ($$2.v() <= this.dI().C_() || !this.dI().t($$2) || !this.dI().w_().a($$2) || !this.dI().a((bfj)this, new eed($$2).h(1.0E-6)) || ($$3 = this.i($$2)) == null) continue;
            this.ac();
            this.a($$3);
            this.a(amh.vj, 1.0f, 1.0f);
            this.e((double)$$2.u() + 0.5, $$2.v(), (double)$$2.w() + 0.5);
            this.dI().a(dgl.S, $$0, dgl.a.a(this));
            this.am.b(c, (byte)0);
            this.h((bfz)null);
            return true;
        }
        return false;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
        this.bo = 0;
        this.e($$0, $$1, $$2);
        this.a($$3, $$4);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        bfj $$2;
        if (this.gd() && ($$2 = $$0.c()) instanceof byu) {
            return false;
        }
        if (super.a($$0, $$1)) {
            bfj $$3;
            if ((double)this.er() < (double)this.eI() * 0.5 && this.af.a(4) == 0) {
                this.r();
            } else if ($$0.a(amy.j) && ($$3 = $$0.c()) != null && $$3.ae() == bfn.aH) {
                this.ge();
            }
            return true;
        }
        return false;
    }

    private boolean gd() {
        return this.gf() == 0;
    }

    private void ge() {
        eei $$0 = this.dg();
        eed $$1 = this.cE();
        if (this.gd() || !this.r()) {
            return;
        }
        int $$2 = this.dI().a(bfn.aG, $$1.g(8.0), bfj::bs).size();
        float $$3 = (float)($$2 - 1) / 5.0f;
        if (this.dI().z.i() < $$3) {
            return;
        }
        bwi $$4 = bfn.aG.a(this.dI());
        if ($$4 != null) {
            $$4.a(this.fY());
            $$4.d($$0);
            this.dI().b($$4);
        }
    }

    @Override
    public boolean bu() {
        return this.bs();
    }

    public ha w() {
        return this.am.b(b);
    }

    @Override
    private void a(ha $$0) {
        this.am.b(b, $$0);
    }

    @Override
    public void a(aby<?> $$0) {
        if (b.equals($$0)) {
            this.a(this.am());
        }
        super.a($$0);
    }

    private int gf() {
        return this.am.b(c).byteValue();
    }

    void b(int $$0) {
        if (!this.dI().B) {
            this.a(bhg.i).d(bT);
            if ($$0 == 0) {
                this.a(bhg.i).c(bT);
                this.a(amh.vd, 1.0f, 1.0f);
                this.a(dgl.j);
            } else {
                this.a(amh.vh, 1.0f, 1.0f);
                this.a(dgl.k);
            }
        }
        this.am.b(c, (byte)$$0);
    }

    public float D(float $$0) {
        return apa.i($$0, this.cc, this.cd);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 0.5f;
    }

    @Override
    public void a(us $$0) {
        super.a($$0);
        this.aV = 0.0f;
        this.aW = 0.0f;
    }

    @Override
    public int X() {
        return 180;
    }

    @Override
    public int fC() {
        return 180;
    }

    @Override
    public void g(bfj $$0) {
    }

    @Override
    public float bC() {
        return 0.0f;
    }

    public Optional<eei> E(float $$0) {
        if (this.ce == null || this.cf <= 0) {
            return Optional.empty();
        }
        double $$1 = (double)((float)this.cf - $$0) / 6.0;
        $$1 *= $$1;
        gu $$2 = this.di();
        double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
        double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
        double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
        return Optional.of(new eei(-$$3, -$$4, -$$5));
    }

    @Override
    public void a(Optional<cen> $$02) {
        this.am.b(d, $$02.map($$0 -> (byte)$$0.a()).orElse((byte)16));
    }

    public Optional<cen> fY() {
        return Optional.ofNullable(this.fZ());
    }

    @Nullable
    public cen fZ() {
        byte $$0 = this.am.b(d);
        if ($$0 == 16 || $$0 > 15) {
            return null;
        }
        return cen.a($$0);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.fY();
    }

    class d
    extends blx {
        public d(bgb $$0) {
            super($$0);
        }

        @Override
        protected void b() {
        }

        @Override
        protected Optional<Float> i() {
            ha $$0 = bwi.this.w().g();
            Vector3f $$1 = $$0.b().transform(new Vector3f((Vector3fc)cb));
            hz $$2 = $$0.q();
            Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
            $$3.cross((Vector3fc)$$1);
            double $$4 = this.e - this.a.dn();
            double $$5 = this.f - this.a.dr();
            double $$6 = this.g - this.a.dt();
            Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
            float $$8 = $$3.dot((Vector3fc)$$7);
            float $$9 = $$1.dot((Vector3fc)$$7);
            return Math.abs($$8) > 1.0E-5f || Math.abs($$9) > 1.0E-5f ? Optional.of(Float.valueOf((float)(apa.d((double)(-$$8), (double)$$9) * 57.2957763671875))) : Optional.empty();
        }

        @Override
        protected Optional<Float> h() {
            return Optional.of(Float.valueOf(0.0f));
        }
    }

    class a
    extends bmv {
        private int b;

        public a() {
            this.a(EnumSet.of(bmv.a.a, bmv.a.b));
        }

        @Override
        public boolean a() {
            bfz $$0 = bwi.this.j();
            if ($$0 == null || !$$0.bs()) {
                return false;
            }
            return bwi.this.dI().ai() != bdu.a;
        }

        @Override
        public void c() {
            this.b = 20;
            bwi.this.b(100);
        }

        @Override
        public void d() {
            bwi.this.b(0);
        }

        @Override
        public boolean K_() {
            return true;
        }

        @Override
        public void e() {
            if (bwi.this.dI().ai() == bdu.a) {
                return;
            }
            --this.b;
            bfz $$0 = bwi.this.j();
            if ($$0 == null) {
                return;
            }
            bwi.this.E().a($$0, 180.0f, 180.0f);
            double $$1 = bwi.this.f((bfj)$$0);
            if ($$1 < 400.0) {
                if (this.b <= 0) {
                    this.b = 20 + bwi.this.af.a(10) * 20 / 2;
                    bwi.this.dI().b(new bzi(bwi.this.dI(), bwi.this, $$0, bwi.this.w().o()));
                    bwi.this.a(amh.vi, 2.0f, (bwi.this.af.i() - bwi.this.af.i()) * 0.2f + 1.0f);
                }
            } else {
                bwi.this.h((bfz)null);
            }
            super.e();
        }
    }

    class f
    extends bmv {
        private int b;

        f() {
        }

        @Override
        public boolean a() {
            return bwi.this.j() == null && bwi.this.af.a(bwi$f.b(40)) == 0 && bwi.this.a(bwi.this.di(), bwi.this.w());
        }

        @Override
        public boolean b() {
            return bwi.this.j() == null && this.b > 0;
        }

        @Override
        public void c() {
            this.b = this.a(20 * (1 + bwi.this.af.a(3)));
            bwi.this.b(30);
        }

        @Override
        public void d() {
            if (bwi.this.j() == null) {
                bwi.this.b(0);
            }
        }

        @Override
        public void e() {
            --this.b;
        }
    }

    class e
    extends boo<byo> {
        public e(bwi $$0) {
            super((bgb)$$0, byo.class, true);
        }

        @Override
        public boolean a() {
            if (bwi.this.dI().ai() == bdu.a) {
                return false;
            }
            return super.a();
        }

        @Override
        protected eed a(double $$0) {
            ha $$1 = ((bwi)this.e).w();
            if ($$1.o() == ha.a.a) {
                return this.e.cE().c(4.0, $$0, $$0);
            }
            if ($$1.o() == ha.a.c) {
                return this.e.cE().c($$0, $$0, 4.0);
            }
            return this.e.cE().c($$0, 4.0, $$0);
        }
    }

    static class c
    extends boo<bfz> {
        public c(bwi $$02) {
            super($$02, bfz.class, 10, true, false, $$0 -> $$0 instanceof bvu);
        }

        @Override
        public boolean a() {
            if (this.e.cd() == null) {
                return false;
            }
            return super.a();
        }

        @Override
        protected eed a(double $$0) {
            ha $$1 = ((bwi)this.e).w();
            if ($$1.o() == ha.a.a) {
                return this.e.cE().c(4.0, $$0, $$0);
            }
            if ($$1.o() == ha.a.c) {
                return this.e.cE().c($$0, $$0, 4.0);
            }
            return this.e.cE().c($$0, 4.0, $$0);
        }
    }

    static class b
    extends blt {
        public b(bgb $$0) {
            super($$0);
        }

        @Override
        public void a() {
        }
    }
}

