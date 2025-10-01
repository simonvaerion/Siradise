/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dqi<P extends dqh> {
    public static final dqi<dqg> a = dqi.a("constant", dqg.b);
    public static final dqi<dqk> b = dqi.a("uniform", dqk.a);
    public static final dqi<dqf> c = dqi.a("biased_to_bottom", dqf.a);
    public static final dqi<dql> d = dqi.a("very_biased_to_bottom", dql.a);
    public static final dqi<dqj> e = dqi.a("trapezoid", dqj.a);
    public static final dqi<dqm> f = dqi.a("weighted_list", dqm.a);

    public Codec<P> codec();

    private static <P extends dqh> dqi<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.O, $$0, () -> $$1);
    }
}

