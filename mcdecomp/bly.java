/*
 * Decompiled with CFR 0.152.
 */
public class bly
implements blu {
    public static final float a = 5.0E-4f;
    public static final float b = 2.5000003E-7f;
    protected static final int c = 90;
    protected final bgb d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected float i;
    protected float j;
    protected a k = bly$a.a;

    public bly(bgb $$0) {
        this.d = $$0;
    }

    public boolean b() {
        return this.k == bly$a.b;
    }

    public double c() {
        return this.h;
    }

    public void a(double $$0, double $$1, double $$2, double $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        if (this.k != bly$a.d) {
            this.k = bly$a.b;
        }
    }

    public void a(float $$0, float $$1) {
        this.k = bly$a.c;
        this.i = $$0;
        this.j = $$1;
        this.h = 0.25;
    }

    public void a() {
        if (this.k == bly$a.c) {
            float $$8;
            float $$0 = (float)this.d.b(bhg.d);
            float $$1 = (float)this.h * $$0;
            float $$2 = this.i;
            float $$3 = this.j;
            float $$4 = apa.c($$2 * $$2 + $$3 * $$3);
            if ($$4 < 1.0f) {
                $$4 = 1.0f;
            }
            $$4 = $$1 / $$4;
            float $$5 = apa.a(this.d.dy() * ((float)Math.PI / 180));
            float $$6 = apa.b(this.d.dy() * ((float)Math.PI / 180));
            float $$7 = ($$2 *= $$4) * $$6 - ($$3 *= $$4) * $$5;
            if (!this.b($$7, $$8 = $$3 * $$6 + $$2 * $$5)) {
                this.i = 1.0f;
                this.j = 0.0f;
            }
            this.d.w($$1);
            this.d.z(this.i);
            this.d.B(this.j);
            this.k = bly$a.a;
        } else if (this.k == bly$a.b) {
            this.k = bly$a.a;
            double $$9 = this.e - this.d.dn();
            double $$10 = this.g - this.d.dt();
            double $$11 = this.f - this.d.dp();
            double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
            if ($$12 < 2.500000277905201E-7) {
                this.d.z(0.0f);
                return;
            }
            float $$13 = (float)(apa.d($$10, $$9) * 57.2957763671875) - 90.0f;
            this.d.a_(this.a(this.d.dy(), $$13, 90.0f));
            this.d.w((float)(this.h * this.d.b(bhg.d)));
            gu $$14 = this.d.di();
            dcb $$15 = this.d.dI().a_($$14);
            efb $$16 = $$15.k(this.d.dI(), $$14);
            if ($$11 > (double)this.d.dC() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0f, this.d.dd()) || !$$16.b() && this.d.dp() < $$16.c(ha.a.b) + (double)$$14.v() && !$$15.a(amw.p) && !$$15.a(amw.S)) {
                this.d.I().a();
                this.k = bly$a.d;
            }
        } else if (this.k == bly$a.d) {
            this.d.w((float)(this.h * this.d.b(bhg.d)));
            if (this.d.ay()) {
                this.k = bly$a.a;
            }
        } else {
            this.d.z(0.0f);
        }
    }

    private boolean b(float $$0, float $$1) {
        dxs $$3;
        bpj $$2 = this.d.J();
        return $$2 == null || ($$3 = $$2.p()) == null || $$3.a(this.d.dI(), apa.a(this.d.dn() + (double)$$0), this.d.do(), apa.a(this.d.dt() + (double)$$1)) == dxp.c;
    }

    protected float a(float $$0, float $$1, float $$2) {
        float $$4;
        float $$3 = apa.g($$1 - $$0);
        if ($$3 > $$2) {
            $$3 = $$2;
        }
        if ($$3 < -$$2) {
            $$3 = -$$2;
        }
        if (($$4 = $$0 + $$3) < 0.0f) {
            $$4 += 360.0f;
        } else if ($$4 > 360.0f) {
            $$4 -= 360.0f;
        }
        return $$4;
    }

    public double d() {
        return this.e;
    }

    public double e() {
        return this.f;
    }

    public double f() {
        return this.g;
    }

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = bly$a.a();
        }
    }
}

