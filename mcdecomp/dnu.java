/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dnu<P extends dnt> {
    public static final dnu<dnw> a = dnu.a("two_layers_feature_size", dnw.d);
    public static final dnu<dnv> b = dnu.a("three_layers_feature_size", dnv.d);
    private final Codec<P> c;

    private static <P extends dnt> dnu<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.ab, $$0, new dnu<P>($$1));
    }

    private dnu(Codec<P> $$0) {
        this.c = $$0;
    }

    public Codec<P> a() {
        return this.c;
    }
}

