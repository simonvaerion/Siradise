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

public abstract class bdc {
    private static final Codec<Either<Integer, bdc>> a = Codec.either((Codec)Codec.INT, (Codec)jb.N.q().dispatch(bdc::c, bdd::codec));
    public static final Codec<bdc> c = a.xmap($$02 -> (bdc)$$02.map(bcz::a, $$0 -> $$0), $$0 -> $$0.c() == bdd.a ? Either.left((Object)((bcz)$$0).d()) : Either.right((Object)$$0));
    public static final Codec<bdc> d = bdc.b(0, Integer.MAX_VALUE);
    public static final Codec<bdc> e = bdc.b(1, Integer.MAX_VALUE);

    public static Codec<bdc> b(int $$0, int $$1) {
        return bdc.a($$0, $$1, c);
    }

    public static <T extends bdc> Codec<T> a(int $$0, int $$1, Codec<T> $$22) {
        return aoi.a($$22, (T $$2) -> {
            if ($$2.a() < $$0) {
                return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            if ($$2.b() > $$1) {
                return DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            return DataResult.success((Object)$$2);
        });
    }

    public abstract int a(apf var1);

    public abstract int a();

    public abstract int b();

    public abstract bdd<?> c();
}

