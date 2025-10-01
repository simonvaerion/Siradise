/*
 * Decompiled with CFR 0.152.
 */
public class cmk {
    private static int[] a = new int[65536];

    public static void a(int[] $$0) {
        a = $$0;
    }

    public static int a(double $$0, double $$1) {
        int $$3 = (int)((1.0 - ($$1 *= $$0)) * 255.0);
        int $$2 = (int)((1.0 - $$0) * 255.0);
        int $$4 = $$3 << 8 | $$2;
        if ($$4 >= a.length) {
            return -65281;
        }
        return a[$$4];
    }

    public static int a() {
        return cmk.a(0.5, 1.0);
    }
}

