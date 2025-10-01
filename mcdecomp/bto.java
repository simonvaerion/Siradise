/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class bto
extends Enum<bto> {
    public static final /* enum */ bto a = new bto(0);
    public static final /* enum */ bto b = new bto(1);
    public static final /* enum */ bto c = new bto(2);
    public static final /* enum */ bto d = new bto(3);
    public static final /* enum */ bto e = new bto(4);
    private static final IntFunction<bto> f;
    private final int g;
    private static final /* synthetic */ bto[] h;

    public static bto[] values() {
        return (bto[])h.clone();
    }

    public static bto valueOf(String $$0) {
        return Enum.valueOf(bto.class, $$0);
    }

    private bto(int $$0) {
        this.g = $$0;
    }

    public int a() {
        return this.g;
    }

    public static bto a(int $$0) {
        return f.apply($$0);
    }

    private static /* synthetic */ bto[] b() {
        return new bto[]{a, b, c, d, e};
    }

    static {
        h = bto.b();
        f = anu.a(bto::a, bto.values(), anu.a.b);
    }
}

