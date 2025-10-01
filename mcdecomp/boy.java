/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class boy
extends Enum<boy>
implements apr {
    public static final /* enum */ boy a = new boy("major_negative", -5, 100, 10, 10);
    public static final /* enum */ boy b = new boy("minor_negative", -1, 200, 20, 20);
    public static final /* enum */ boy c = new boy("minor_positive", 1, 200, 1, 5);
    public static final /* enum */ boy d = new boy("major_positive", 5, 100, 0, 100);
    public static final /* enum */ boy e = new boy("trading", 1, 25, 2, 20);
    public static final int f = 25;
    public static final int g = 20;
    public static final int h = 2;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public static final Codec<boy> n;
    private static final /* synthetic */ boy[] o;

    public static boy[] values() {
        return (boy[])o.clone();
    }

    public static boy valueOf(String $$0) {
        return Enum.valueOf(boy.class, $$0);
    }

    private boy(String $$0, int $$1, int $$2, int $$3, int $$4) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        this.m = $$4;
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ boy[] a() {
        return new boy[]{a, b, c, d, e};
    }

    static {
        o = boy.a();
        n = apr.a(boy::values);
    }
}

