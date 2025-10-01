/*
 * Decompiled with CFR 0.152.
 */
public class ckt
extends ckg {
    public final a a;

    public ckt(ckg.a $$0, a $$1, bfo ... $$2) {
        super($$0, $$1 == ckt$a.c ? ckh.b : ckh.a, $$2);
        this.a = $$1;
    }

    @Override
    public int a(int $$0) {
        return this.a.a() + ($$0 - 1) * this.a.b();
    }

    @Override
    public int b(int $$0) {
        return this.a($$0) + this.a.b();
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public int a(int $$0, ben $$1) {
        if ($$1.a(amy.d)) {
            return 0;
        }
        if (this.a == ckt$a.a) {
            return $$0;
        }
        if (this.a == ckt$a.b && $$1.a(amy.i)) {
            return $$0 * 2;
        }
        if (this.a == ckt$a.c && $$1.a(amy.m)) {
            return $$0 * 3;
        }
        if (this.a == ckt$a.d && $$1.a(amy.l)) {
            return $$0 * 2;
        }
        if (this.a == ckt$a.e && $$1.a(amy.j)) {
            return $$0 * 2;
        }
        return 0;
    }

    @Override
    public boolean a(ckg $$0) {
        if ($$0 instanceof ckt) {
            ckt $$1 = (ckt)$$0;
            if (this.a == $$1.a) {
                return false;
            }
            return this.a == ckt$a.c || $$1.a == ckt$a.c;
        }
        return super.a($$0);
    }

    public static int a(bfz $$0, int $$1) {
        int $$2 = cki.a(ckk.b, $$0);
        if ($$2 > 0) {
            $$1 -= apa.d((float)$$1 * ((float)$$2 * 0.15f));
        }
        return $$1;
    }

    public static double a(bfz $$0, double $$1) {
        int $$2 = cki.a(ckk.d, $$0);
        if ($$2 > 0) {
            $$1 *= apa.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
        }
        return $$1;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(1, 11);
        public static final /* enum */ a b = new a(10, 8);
        public static final /* enum */ a c = new a(5, 6);
        public static final /* enum */ a d = new a(5, 8);
        public static final /* enum */ a e = new a(3, 6);
        private final int f;
        private final int g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public int a() {
            return this.f;
        }

        public int b() {
            return this.g;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e};
        }

        static {
            h = ckt$a.c();
        }
    }
}

