/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class bel
extends Enum<bel>
implements apr {
    public static final /* enum */ bel a = new bel("hurt", amh.sz);
    public static final /* enum */ bel b = new bel("thorns", amh.xE);
    public static final /* enum */ bel c = new bel("drowning", amh.sA);
    public static final /* enum */ bel d = new bel("burning", amh.sC);
    public static final /* enum */ bel e = new bel("poking", amh.sD);
    public static final /* enum */ bel f = new bel("freezing", amh.sB);
    public static final Codec<bel> g;
    private final String h;
    private final amg i;
    private static final /* synthetic */ bel[] j;

    public static bel[] values() {
        return (bel[])j.clone();
    }

    public static bel valueOf(String $$0) {
        return Enum.valueOf(bel.class, $$0);
    }

    private bel(String $$0, amg $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    @Override
    public String c() {
        return this.h;
    }

    public amg a() {
        return this.i;
    }

    private static /* synthetic */ bel[] b() {
        return new bel[]{a, b, c, d, e, f};
    }

    static {
        j = bel.b();
        g = apr.a(bel::values);
    }
}

