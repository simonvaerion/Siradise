/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class bsd
extends brl
implements bgg {
    private static final aby<Boolean> bT = acb.a(bsd.class, aca.k);
    private static final float bU = 6.0f;
    private float bW;
    private float bX;
    private int bY;
    private static final bdi bZ = apw.a(20, 39);
    private int ca;
    @Nullable
    private UUID cb;

    public bsd(bfn<? extends bsd> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        return bfn.az.a($$0);
    }

    @Override
    public boolean m(cfz $$0) {
        return false;
    }

    @Override
    protected void x() {
        super.x();
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new c());
        this.bO.a(1, new d());
        this.bO.a(4, new bmu(this, 1.25));
        this.bO.a(5, new bns(this, 1.0));
        this.bO.a(6, new bnd(this, byo.class, 6.0f));
        this.bO.a(7, new bnq(this));
        this.bP.a(1, new b());
        this.bP.a(2, new a());
        this.bP.a(3, new boo<byo>(this, byo.class, 10, true, false, this::a_));
        this.bP.a(4, new boo<brv>(this, brv.class, 10, true, true, null));
        this.bP.a(5, new bou<bsd>(this, false));
    }

    public static bhf.a q() {
        return bgb.y().a(bhg.a, 30.0).a(bhg.b, 20.0).a(bhg.d, 0.25).a(bhg.f, 6.0);
    }

    public static boolean c(bfn<bsd> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        he<cnk> $$5 = $$1.s($$3);
        if ($$5.a(amv.an)) {
            return bsd.a($$1, $$3) && $$1.a_($$3.d()).a(amw.bS);
        }
        return bsd.b($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a(this.dI(), $$0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        this.c($$0);
    }

    @Override
    public void c() {
        this.a(bZ.a(this.af));
    }

    @Override
    public void a(int $$0) {
        this.ca = $$0;
    }

    @Override
    public int a() {
        return this.ca;
    }

    @Override
    public void a(@Nullable UUID $$0) {
        this.cb = $$0;
    }

    @Override
    @Nullable
    public UUID b() {
        return this.cb;
    }

    @Override
    protected amg s() {
        if (this.h_()) {
            return amh.sK;
        }
        return amh.sJ;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.sM;
    }

    @Override
    protected amg g_() {
        return amh.sL;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.sN, 0.15f, 1.0f);
    }

    protected void r() {
        if (this.bY <= 0) {
            this.a(amh.sO, 1.0f, this.eS());
            this.bY = 40;
        }
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bT, false);
    }

    @Override
    public void l() {
        super.l();
        if (this.dI().B) {
            if (this.bX != this.bW) {
                this.d_();
            }
            this.bW = this.bX;
            this.bX = this.w() ? apa.a(this.bX + 1.0f, 0.0f, 6.0f) : apa.a(this.bX - 1.0f, 0.0f, 6.0f);
        }
        if (this.bY > 0) {
            --this.bY;
        }
        if (!this.dI().B) {
            this.a((aif)this.dI(), true);
        }
    }

    @Override
    public bfk a(bgl $$0) {
        if (this.bX > 0.0f) {
            float $$1 = this.bX / 6.0f;
            float $$2 = 1.0f + $$1;
            return super.a($$0).a(1.0f, $$2);
        }
        return super.a($$0);
    }

    @Override
    public boolean z(bfj $$0) {
        boolean $$1 = $$0.a(this.dJ().b(this), (float)((int)this.b(bhg.f)));
        if ($$1) {
            this.a((bfz)this, $$0);
        }
        return $$1;
    }

    public boolean w() {
        return this.am.b(bT);
    }

    public void w(boolean $$0) {
        this.am.b(bT, $$0);
    }

    public float D(float $$0) {
        return apa.i($$0, this.bW, this.bX) / 6.0f;
    }

    @Override
    protected float eY() {
        return 0.98f;
    }

    @Override
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        if ($$3 == null) {
            $$3 = new bfe.a(1.0f);
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    class c
    extends bnf {
        public c() {
            super(bsd.this, 1.25, true);
        }

        @Override
        protected void a(bfz $$0, double $$1) {
            double $$2 = this.a($$0);
            if ($$1 <= $$2 && this.i()) {
                this.h();
                this.a.z($$0);
                bsd.this.w(false);
            } else if ($$1 <= $$2 * 2.0) {
                if (this.i()) {
                    bsd.this.w(false);
                    this.h();
                }
                if (this.k() <= 10) {
                    bsd.this.w(true);
                    bsd.this.r();
                }
            } else {
                this.h();
                bsd.this.w(false);
            }
        }

        @Override
        public void d() {
            bsd.this.w(false);
            super.d();
        }

        @Override
        protected double a(bfz $$0) {
            return 4.0f + $$0.dd();
        }
    }

    class d
    extends bno {
        public d() {
            super(bsd.this, 2.0);
        }

        @Override
        protected boolean h() {
            return this.b.ed() != null && this.b.h_() || this.b.bL();
        }
    }

    class b
    extends bon {
        public b() {
            super(bsd.this, new Class[0]);
        }

        @Override
        public void c() {
            super.c();
            if (bsd.this.h_()) {
                this.h();
                this.d();
            }
        }

        @Override
        protected void a(bgb $$0, bfz $$1) {
            if ($$0 instanceof bsd && !$$0.h_()) {
                super.a($$0, $$1);
            }
        }
    }

    class a
    extends boo<byo> {
        public a() {
            super(bsd.this, byo.class, 20, true, true, null);
        }

        @Override
        public boolean a() {
            if (bsd.this.h_()) {
                return false;
            }
            if (super.a()) {
                List<bsd> $$0 = bsd.this.dI().a(bsd.class, bsd.this.cE().c(8.0, 4.0, 8.0));
                for (bsd $$1 : $$0) {
                    if (!$$1.h_()) continue;
                    return true;
                }
            }
            return false;
        }

        @Override
        protected double l() {
            return super.l() * 0.5;
        }
    }
}

