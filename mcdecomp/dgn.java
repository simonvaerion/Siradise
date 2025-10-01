/*
 * Decompiled with CFR 0.152.
 */
public interface dgn {
    public dgp a();

    public int b();

    public boolean a(aif var1, dgl var2, dgl.a var3, eei var4);

    default public a c() {
        return a.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = dgn$a.a();
        }
    }

    public static interface b<T extends dgn> {
        public T d();
    }
}

