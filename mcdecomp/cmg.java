/*
 * Decompiled with CFR 0.152.
 */
public class cmg {
    private static int[] a = new int[65536];

    public static void a(int[] $$0) {
        a = $$0;
    }

    public static int a(double $$0, double $$1) {
        int $$3 = (int)((1.0 - ($$1 *= $$0)) * 255.0);
        int $$2 = (int)((1.0 - $$0) * 255.0);
        int $$4 = $$3 << 8 | $$2;
        if ($$4 >= a.length) {
            return cmg.c();
        }
        return a[$$4];
    }

    public static int a() {
        return 0x619961;
    }

    public static int b() {
        return 8431445;
    }

    public static int c() {
        return 4764952;
    }

    public static int d() {
        return 9619016;
    }
}

