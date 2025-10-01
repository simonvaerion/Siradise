/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fvb {
    private static final BiMap<acq, fva> i = HashBiMap.create();
    public static final fva a = fvb.a("single", fvg.b);
    public static final fva b = fvb.a("directory", fvd.b);
    public static final fva c = fvb.a("filter", fvh.b);
    public static final fva d = fvb.a("unstitch", fvi.b);
    public static final fva e = fvb.a("paletted_permutations", fvf.b);
    public static Codec<fva> f = acq.a.flatXmap($$0 -> {
        fva $$1 = (fva)i.get($$0);
        return $$1 != null ? DataResult.success((Object)$$1) : DataResult.error(() -> "Unknown type " + $$0);
    }, $$0 -> {
        acq $$1 = (acq)i.inverse().get($$0);
        return $$0 != null ? DataResult.success((Object)$$1) : DataResult.error(() -> "Unknown type " + $$1);
    });
    public static Codec<fuz> g = f.dispatch(fuz::a, fva::a);
    public static Codec<List<fuz>> h = g.listOf().fieldOf("sources").codec();

    private static fva a(String $$0, Codec<? extends fuz> $$1) {
        acq $$3 = new acq($$0);
        fva $$2 = new fva($$1);
        fva $$4 = (fva)i.putIfAbsent((Object)$$3, (Object)$$2);
        if ($$4 != null) {
            throw new IllegalStateException("Duplicate registration " + $$3);
        }
        return $$2;
    }
}

