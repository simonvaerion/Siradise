/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dor<P extends doq> {
    public static final dor<dop> a = dor.a("mangrove_root_placer", dop.c);
    private final Codec<P> b;

    private static <P extends doq> dor<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.Z, $$0, new dor<P>($$1));
    }

    private dor(Codec<P> $$0) {
        this.b = $$0;
    }

    public Codec<P> a() {
        return this.b;
    }
}

