/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bda
implements bdf {
    private static final Codec<Either<Float, bda>> a = Codec.either((Codec)Codec.FLOAT, (Codec)jb.M.q().dispatch(bda::c, bdb::codec));
    public static final Codec<bda> c = a.xmap($$02 -> (bda)$$02.map(bcy::a, $$0 -> $$0), $$0 -> $$0.c() == bdb.a ? Either.left((Object)Float.valueOf(((bcy)$$0).d())) : Either.right((Object)$$0));

    public static Codec<bda> a(float $$0, float $$1) {
        return aoi.a(c, (T $$2) -> {
            if ($$2.a() < $$0) {
                return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            if ($$2.b() > $$1) {
                return DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            return DataResult.success((Object)$$2);
        });
    }

    public abstract float a();

    public abstract float b();

    public abstract bdb<?> c();
}

