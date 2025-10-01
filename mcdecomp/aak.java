/*
 * Decompiled with CFR 0.152.
 */
public class aak
implements uo<zb> {
    private final a a;

    public aak(a $$0) {
        this.a = $$0;
    }

    public aak(sf $$0) {
        this.a = $$0.b(a.class);
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public a a() {
        return this.a;
    }

    public static final class a
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
            e = aak$a.a();
        }
    }
}

