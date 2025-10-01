/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dis<P extends dir> {
    public static final dis<dix> a = dis.a("matching_blocks", dix.a);
    public static final dis<diw> b = dis.a("matching_block_tag", diw.e);
    public static final dis<diy> c = dis.a("matching_fluids", diy.a);
    public static final dis<diu> d = dis.a("has_sturdy_face", diu.a);
    public static final dis<djb> e = dis.a("solid", djb.a);
    public static final dis<dja> f = dis.a("replaceable", dja.a);
    public static final dis<dje> g = dis.a("would_survive", dje.a);
    public static final dis<div> h = dis.a("inside_world_bounds", div.a);
    public static final dis<diq> i = dis.a("any_of", diq.a);
    public static final dis<dip> j = dis.a("all_of", dip.a);
    public static final dis<diz> k = dis.a("not", diz.a);
    public static final dis<djd> l = dis.a("true", djd.e);

    public Codec<P> codec();

    private static <P extends dir> dis<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.P, $$0, () -> $$1);
    }
}

