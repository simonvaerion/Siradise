/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface fxy {
    public acq a();

    @Nullable
    public fzd a(fzc var1);

    public fxv b();

    public ami c();

    public boolean d();

    public boolean l();

    public int e();

    public float f();

    public float g();

    public double h();

    public double i();

    public double j();

    public a k();

    default public boolean r() {
        return false;
    }

    default public boolean s() {
        return true;
    }

    public static apf t() {
        return apf.a();
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
            c = fxy$a.a();
        }
    }
}

