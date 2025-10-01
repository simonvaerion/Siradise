/*
 * Decompiled with CFR 0.152.
 */
public class bdy<T> {
    private final bdx a;
    private final T b;

    public bdy(bdx $$0, T $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public bdx a() {
        return this.a;
    }

    public T b() {
        return this.b;
    }

    public static <T> bdy<T> a(T $$0) {
        return new bdy<T>(bdx.a, $$0);
    }

    public static <T> bdy<T> b(T $$0) {
        return new bdy<T>(bdx.b, $$0);
    }

    public static <T> bdy<T> c(T $$0) {
        return new bdy<T>(bdx.d, $$0);
    }

    public static <T> bdy<T> d(T $$0) {
        return new bdy<T>(bdx.e, $$0);
    }

    public static <T> bdy<T> a(T $$0, boolean $$1) {
        return $$1 ? bdy.a($$0) : bdy.b($$0);
    }
}

