/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public abstract class bmv {
    private final EnumSet<a> a = EnumSet.noneOf(a.class);

    public abstract boolean a();

    public boolean b() {
        return this.a();
    }

    public boolean J_() {
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public boolean K_() {
        return false;
    }

    public void e() {
    }

    public void a(EnumSet<a> $$0) {
        this.a.clear();
        this.a.addAll($$0);
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public EnumSet<a> j() {
        return this.a;
    }

    protected int a(int $$0) {
        return this.K_() ? $$0 : bmv.b($$0);
    }

    protected static int b(int $$0) {
        return apa.e($$0, 2);
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
            e = bmv$a.a();
        }
    }
}

