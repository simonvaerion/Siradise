/*
 * Decompiled with CFR 0.152.
 */
public class aad
implements uo<zb> {
    private final gu a;
    private final ha b;
    private final a c;
    private final int d;

    public aad(a $$0, gu $$1, ha $$2, int $$3) {
        this.c = $$0;
        this.a = $$1.i();
        this.b = $$2;
        this.d = $$3;
    }

    public aad(a $$0, gu $$1, ha $$2) {
        this($$0, $$1, $$2, 0);
    }

    public aad(sf $$0) {
        this.c = $$0.b(a.class);
        this.a = $$0.f();
        this.b = ha.a($$0.readUnsignedByte());
        this.d = $$0.m();
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.c);
        $$0.a(this.a);
        $$0.writeByte(this.b.d());
        $$0.d(this.d);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public gu a() {
        return this.a;
    }

    public ha c() {
        return this.b;
    }

    public a d() {
        return this.c;
    }

    public int e() {
        return this.d;
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
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            h = aad$a.a();
        }
    }
}

