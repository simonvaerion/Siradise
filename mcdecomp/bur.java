/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bur<T extends bul> {
    private static bur<?>[] l = new bur[0];
    public static final bur<buh> a = bur.a(buh.class, "HoldingPattern");
    public static final bur<bup> b = bur.a(bup.class, "StrafePlayer");
    public static final bur<buj> c = bur.a(buj.class, "LandingApproach");
    public static final bur<buk> d = bur.a(buk.class, "Landing");
    public static final bur<buq> e = bur.a(buq.class, "Takeoff");
    public static final bur<bun> f = bur.a(bun.class, "SittingFlaming");
    public static final bur<buo> g = bur.a(buo.class, "SittingScanning");
    public static final bur<bum> h = bur.a(bum.class, "SittingAttacking");
    public static final bur<buf> i = bur.a(buf.class, "ChargingPlayer");
    public static final bur<bug> j = bur.a(bug.class, "Dying");
    public static final bur<bui> k = bur.a(bui.class, "Hover");
    private final Class<? extends bul> m;
    private final int n;
    private final String o;

    private bur(int $$0, Class<? extends bul> $$1, String $$2) {
        this.n = $$0;
        this.m = $$1;
        this.o = $$2;
    }

    public bul a(bub $$0) {
        try {
            Constructor<bul> $$1 = this.a();
            return $$1.newInstance($$0);
        }
        catch (Exception $$2) {
            throw new Error($$2);
        }
    }

    protected Constructor<? extends bul> a() throws NoSuchMethodException {
        return this.m.getConstructor(bub.class);
    }

    public int b() {
        return this.n;
    }

    public String toString() {
        return this.o + " (#" + this.n + ")";
    }

    public static bur<?> a(int $$0) {
        if ($$0 < 0 || $$0 >= l.length) {
            return a;
        }
        return l[$$0];
    }

    public static int c() {
        return l.length;
    }

    private static <T extends bul> bur<T> a(Class<T> $$0, String $$1) {
        bur<T> $$2 = new bur<T>(l.length, $$0, $$1);
        l = Arrays.copyOf(l, l.length + 1);
        bur.l[$$2.b()] = $$2;
        return $$2;
    }
}

