/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dou<P extends dot> {
    public static final dou<dpc> a = dou.a("simple_state_provider", dpc.b);
    public static final dou<dpd> b = dou.a("weighted_state_provider", dpd.b);
    public static final dou<doy> c = dou.a("noise_threshold_provider", doy.b);
    public static final dou<dox> d = dou.a("noise_provider", dox.g);
    public static final dou<dov> e = dou.a("dual_noise_provider", dov.b);
    public static final dou<dpa> f = dou.a("rotated_block_provider", dpa.b);
    public static final dou<doz> g = dou.a("randomized_int_state_provider", doz.b);
    private final Codec<P> h;

    private static <P extends dot> dou<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.W, $$0, new dou<P>($$1));
    }

    private dou(Codec<P> $$0) {
        this.h = $$0;
    }

    public Codec<P> a() {
        return this.h;
    }
}

