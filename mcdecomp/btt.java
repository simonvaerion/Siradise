/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class btt
extends Enum<btt>
implements apr {
    public static final /* enum */ btt a = new btt(0, "white");
    public static final /* enum */ btt b = new btt(1, "creamy");
    public static final /* enum */ btt c = new btt(2, "chestnut");
    public static final /* enum */ btt d = new btt(3, "brown");
    public static final /* enum */ btt e = new btt(4, "black");
    public static final /* enum */ btt f = new btt(5, "gray");
    public static final /* enum */ btt g = new btt(6, "dark_brown");
    public static final Codec<btt> h;
    private static final IntFunction<btt> i;
    private final int j;
    private final String k;
    private static final /* synthetic */ btt[] l;

    public static btt[] values() {
        return (btt[])l.clone();
    }

    public static btt valueOf(String $$0) {
        return Enum.valueOf(btt.class, $$0);
    }

    private btt(int $$0, String $$1) {
        this.j = $$0;
        this.k = $$1;
    }

    public int a() {
        return this.j;
    }

    public static btt a(int $$0) {
        return i.apply($$0);
    }

    @Override
    public String c() {
        return this.k;
    }

    private static /* synthetic */ btt[] b() {
        return new btt[]{a, b, c, d, e, f, g};
    }

    static {
        l = btt.b();
        h = apr.a(btt::values);
        i = anu.a(btt::a, btt.values(), anu.a.b);
    }
}

