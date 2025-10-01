/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface bdd<P extends bdc> {
    public static final bdd<bcz> a = bdd.a("constant", bcz.b);
    public static final bdd<bdi> b = bdd.a("uniform", bdi.a);
    public static final bdd<bcu> c = bdd.a("biased_to_bottom", bcu.a);
    public static final bdd<bcv> d = bdd.a("clamped", bcv.a);
    public static final bdd<bdj> e = bdd.a("weighted_list", bdj.a);
    public static final bdd<bcx> f = bdd.a("clamped_normal", bcx.a);

    public Codec<P> codec();

    public static <P extends bdc> bdd<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.N, $$0, () -> $$1);
    }
}

