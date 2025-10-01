/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dvh<P extends dvg> {
    public static final dvh<dvf> a = dvh.a("always_true", dvf.a);
    public static final dvh<dvd> b = dvh.a("linear_pos", dvd.a);
    public static final dvh<dus> c = dvh.a("axis_aligned_linear_pos", dus.a);

    public Codec<P> codec();

    public static <P extends dvg> dvh<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.r, $$0, () -> $$1);
    }
}

