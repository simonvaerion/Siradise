/*
 * Decompiled with CFR 0.152.
 */
public class aae
implements uo<zb> {
    private final int a;
    private final a b;
    private final int c;

    public aae(bfj $$0, a $$1) {
        this($$0, $$1, 0);
    }

    public aae(bfj $$0, a $$1, int $$2) {
        this.a = $$0.af();
        this.b = $$1;
        this.c = $$2;
    }

    public aae(sf $$0) {
        this.a = $$0.m();
        this.b = $$0.b(a.class);
        this.c = $$0.m();
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.a(this.b);
        $$0.d(this.c);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public int a() {
        return this.a;
    }

    public a c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        public static final /* enum */ a i = new a();
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h, i};
        }

        static {
            j = aae$a.a();
        }
    }
}

