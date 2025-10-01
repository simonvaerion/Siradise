/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonPrimitive
 */
import com.google.gson.JsonPrimitive;

public class la {
    public static final lb<a> a = new lb<a>("x", $$0 -> new JsonPrimitive((Number)$$0.e));
    public static final lb<a> b = new lb<a>("y", $$0 -> new JsonPrimitive((Number)$$0.e));
    public static final lb<acq> c = new lb<acq>("model", $$0 -> new JsonPrimitive($$0.toString()));
    public static final lb<Boolean> d = new lb<Boolean>("uvlock", JsonPrimitive::new);
    public static final lb<Integer> e = new lb<Integer>("weight", JsonPrimitive::new);

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(90);
        public static final /* enum */ a c = new a(180);
        public static final /* enum */ a d = new a(270);
        final int e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.e = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            f = la$a.a();
        }
    }
}

