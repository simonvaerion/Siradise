/*
 * Decompiled with CFR 0.152.
 */
public class fgs
extends fim {
    private final dxd b;
    protected boolean a;

    fgs(few $$0, double $$1, double $$2, double $$3, dxd $$4) {
        super($$0, $$1, $$2, $$3);
        this.b(0.01f, 0.01f);
        this.u = 0.06f;
        this.b = $$4;
    }

    protected dxd g() {
        return this.b;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public int a(float $$0) {
        if (this.a) {
            return 240;
        }
        return super.a($$0);
    }

    @Override
    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.h();
        if (this.o) {
            return;
        }
        this.k -= (double)this.u;
        this.a(this.j, this.k, this.l);
        this.i();
        if (this.o) {
            return;
        }
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        if (this.b == dxf.a) {
            return;
        }
        gu $$0 = gu.a(this.g, this.h, this.i);
        dxe $$1 = this.c.b_($$0);
        if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cls)this.c, $$0))) {
            this.k();
        }
    }

    protected void h() {
        if (this.t-- <= 0) {
            this.k();
        }
    }

    protected void i() {
    }

    public static fim a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        b $$8 = new b($$1, $$2, $$3, $$4, dxf.c, iv.n);
        $$8.a(0.2f, 0.3f, 1.0f);
        return $$8;
    }

    public static fim b(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        e $$8 = new e($$1, $$2, $$3, $$4, (dxd)dxf.c, iv.ag);
        $$8.a(0.2f, 0.3f, 1.0f);
        return $$8;
    }

    public static fim c(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        return new a($$1, $$2, $$3, $$4, dxf.e, iv.k);
    }

    public static fim d(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        e $$8 = new e($$1, $$2, $$3, $$4, (dxd)dxf.e, iv.l);
        $$8.a(1.0f, 0.2857143f, 0.083333336f);
        return $$8;
    }

    public static fim e(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        c $$8 = new c($$1, $$2, $$3, $$4, dxf.e);
        $$8.a(1.0f, 0.2857143f, 0.083333336f);
        return $$8;
    }

    public static fim f(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        b $$8 = new b($$1, $$2, $$3, $$4, dxf.a, iv.aq);
        $$8.u *= 0.01f;
        $$8.t = 100;
        $$8.a(0.622f, 0.508f, 0.082f);
        return $$8;
    }

    public static fim g(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        g $$8 = new g($$1, $$2, $$3, $$4, dxf.a, iv.ar);
        $$8.u = 0.01f;
        $$8.a(0.582f, 0.448f, 0.082f);
        return $$8;
    }

    public static fim h(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        c $$8 = new c($$1, $$2, $$3, $$4, dxf.a);
        $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
        $$8.a(0.522f, 0.408f, 0.082f);
        return $$8;
    }

    public static fim i(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        b $$8 = new b($$1, $$2, $$3, $$4, dxf.c, iv.aI);
        $$8.a(0.2f, 0.3f, 1.0f);
        return $$8;
    }

    public static fim j(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        d $$8 = new d($$1, $$2, $$3, $$4, (dxd)dxf.c, iv.ag);
        $$8.a(0.2f, 0.3f, 1.0f);
        return $$8;
    }

    public static fim k(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        return new a($$1, $$2, $$3, $$4, dxf.e, iv.aG);
    }

    public static fim l(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        d $$8 = new d($$1, $$2, $$3, $$4, (dxd)dxf.e, iv.l);
        $$8.a(1.0f, 0.2857143f, 0.083333336f);
        return $$8;
    }

    public static fim m(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        f $$8 = new f($$1, $$2, $$3, $$4, dxf.a);
        $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        $$8.u = 0.007f;
        $$8.a(0.92f, 0.782f, 0.72f);
        return $$8;
    }

    public static fim n(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        int $$8 = (int)(64.0f / apa.b($$1.y_(), 0.1f, 0.9f));
        f $$9 = new f($$1, $$2, $$3, $$4, dxf.a, $$8);
        $$9.u = 0.005f;
        $$9.a(0.32f, 0.5f, 0.22f);
        return $$9;
    }

    public static fim o(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        b $$8 = new b($$1, $$2, $$3, $$4, dxf.a, iv.az);
        $$8.a = true;
        $$8.u *= 0.01f;
        $$8.t = 100;
        $$8.a(0.51171875f, 0.03125f, 0.890625f);
        return $$8;
    }

    public static fim p(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        e $$8 = new e($$1, $$2, $$3, $$4, dxf.a, iv.aA);
        $$8.a = true;
        $$8.u = 0.01f;
        $$8.a(0.51171875f, 0.03125f, 0.890625f);
        return $$8;
    }

    public static fim q(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        c $$8 = new c($$1, $$2, $$3, $$4, dxf.a);
        $$8.a = true;
        $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
        $$8.a(0.51171875f, 0.03125f, 0.890625f);
        return $$8;
    }

    static class b
    extends fgs {
        private final it b;

        b(few $$0, double $$1, double $$2, double $$3, dxd $$4, it $$5) {
            super($$0, $$1, $$2, $$3, $$4);
            this.b = $$5;
            this.u *= 0.02f;
            this.t = 40;
        }

        @Override
        protected void h() {
            if (this.t-- <= 0) {
                this.k();
                this.c.a(this.b, this.g, this.h, this.i, this.j, this.k, this.l);
            }
        }

        @Override
        protected void i() {
            this.j *= 0.02;
            this.k *= 0.02;
            this.l *= 0.02;
        }
    }

    static class e
    extends f {
        protected final it b;

        e(few $$0, double $$1, double $$2, double $$3, dxd $$4, it $$5) {
            super($$0, $$1, $$2, $$3, $$4);
            this.b = $$5;
        }

        @Override
        protected void i() {
            if (this.m) {
                this.k();
                this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            }
        }
    }

    static class a
    extends b {
        a(few $$0, double $$1, double $$2, double $$3, dxd $$4, it $$5) {
            super($$0, $$1, $$2, $$3, $$4, $$5);
        }

        @Override
        protected void h() {
            this.v = 1.0f;
            this.w = 16.0f / (float)(40 - this.t + 16);
            this.x = 4.0f / (float)(40 - this.t + 8);
            super.h();
        }
    }

    static class c
    extends fgs {
        c(few $$0, double $$1, double $$2, double $$3, dxd $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        }
    }

    static class g
    extends e {
        g(few $$0, double $$1, double $$2, double $$3, dxd $$4, it $$5) {
            super($$0, $$1, $$2, $$3, $$4, $$5);
        }

        @Override
        protected void i() {
            if (this.m) {
                this.k();
                this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
                float $$0 = apa.b(this.r, 0.3f, 1.0f);
                this.c.a(this.g, this.h, this.i, amh.bF, ami.e, $$0, 1.0f, false);
            }
        }
    }

    static class d
    extends e {
        d(few $$0, double $$1, double $$2, double $$3, dxd $$4, it $$5) {
            super($$0, $$1, $$2, $$3, $$4, $$5);
        }

        @Override
        protected void i() {
            if (this.m) {
                this.k();
                this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
                amg $$0 = this.g() == dxf.e ? amh.gq : amh.gr;
                float $$1 = apa.b(this.r, 0.3f, 1.0f);
                this.c.a(this.g, this.h, this.i, $$0, ami.e, $$1, 1.0f, false);
            }
        }
    }

    static class f
    extends fgs {
        f(few $$0, double $$1, double $$2, double $$3, dxd $$4) {
            this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
        }

        f(few $$0, double $$1, double $$2, double $$3, dxd $$4, int $$5) {
            super($$0, $$1, $$2, $$3, $$4);
            this.t = $$5;
        }

        @Override
        protected void i() {
            if (this.m) {
                this.k();
            }
        }
    }
}

