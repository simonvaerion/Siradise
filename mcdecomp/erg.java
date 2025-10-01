/*
 * Decompiled with CFR 0.152.
 */
public interface erg {
    public static final acq b = new acq("textures/gui/toasts.png");
    public static final Object c = new Object();
    public static final int d = 32;

    public a a(eox var1, erh var2, long var3);

    default public Object d() {
        return c;
    }

    default public int a() {
        return 160;
    }

    default public int b() {
        return 32;
    }

    default public int e() {
        return apa.e(this.b(), 32);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amh.yv);
        public static final /* enum */ a b = new a(amh.yw);
        private final amg c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(amg $$0) {
            this.c = $$0;
        }

        public void a(fzc $$0) {
            $$0.a(fxt.a(this.c, 1.0f, 1.0f));
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = erg$a.a();
        }
    }
}

