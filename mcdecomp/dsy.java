/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dsy<SP extends dsx> {
    public static final dsy<dsv> a = dsy.a("random_spread", dsv.a);
    public static final dsy<dsu> b = dsy.a("concentric_rings", dsu.a);

    public Codec<SP> codec();

    private static <SP extends dsx> dsy<SP> a(String $$0, Codec<SP> $$1) {
        return hr.a(jb.S, $$0, () -> $$1);
    }
}

