/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface bdb<P extends bda> {
    public static final bdb<bcy> a = bdb.a("constant", bcy.b);
    public static final bdb<bdh> b = bdb.a("uniform", bdh.a);
    public static final bdb<bcw> c = bdb.a("clamped_normal", bcw.a);
    public static final bdb<bdg> d = bdb.a("trapezoid", bdg.a);

    public Codec<P> codec();

    public static <P extends bda> bdb<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.M, $$0, () -> $$1);
    }
}

