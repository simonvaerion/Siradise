/*
 * Decompiled with CFR 0.152.
 */
public abstract class eeg {
    protected final eei a;

    protected eeg(eei $$0) {
        this.a = $$0;
    }

    public double a(bfj $$0) {
        double $$1 = this.a.c - $$0.dn();
        double $$2 = this.a.d - $$0.dp();
        double $$3 = this.a.e - $$0.dt();
        return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
    }

    public abstract a c();

    public eei e() {
        return this.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = eeg$a.a();
        }
    }
}

