/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dvo<P extends dvn> {
    public static final dvo<dur> a = dvo.a("always_true", dur.a);
    public static final dvo<duw> b = dvo.a("block_match", duw.a);
    public static final dvo<duy> c = dvo.a("blockstate_match", duy.a);
    public static final dvo<dvv> d = dvo.a("tag_match", dvv.a);
    public static final dvo<dvk> e = dvo.a("random_block_match", dvk.a);
    public static final dvo<dvl> f = dvo.a("random_blockstate_match", dvl.a);

    public Codec<P> codec();

    public static <P extends dvn> dvo<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.p, $$0, () -> $$1);
    }
}

