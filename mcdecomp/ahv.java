/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ahv(int a, int b) {
    private final int a;
    private final int b;
    private static final long c = 32L;
    private static final long d = 0xFFFFFFFFL;

    public clt a() {
        return new clt(hx.a(this.a), hx.a(this.b));
    }

    public long b() {
        return ahv.a(this.a, this.b);
    }

    public static long a(int $$0, int $$1) {
        return (long)$$0 & 0xFFFFFFFFL | ((long)$$1 & 0xFFFFFFFFL) << 32;
    }

    public static int a(long $$0) {
        return (int)($$0 & 0xFFFFFFFFL);
    }

    public static int b(long $$0) {
        return (int)($$0 >>> 32 & 0xFFFFFFFFL);
    }

    @Override
    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }

    @Override
    public int hashCode() {
        return clt.d(this.a, this.b);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahv.class, "x;z", "a", "b"}, this, $$0);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

