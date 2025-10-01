/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dqh {
    private static final Codec<Either<die, dqh>> a = Codec.either(die.a, (Codec)jb.O.q().dispatch(dqh::a, dqi::codec));
    public static final Codec<dqh> c = a.xmap($$02 -> (dqh)$$02.map(dqg::a, $$0 -> $$0), $$0 -> $$0.a() == dqi.a ? Either.left((Object)((dqg)$$0).b()) : Either.right((Object)$$0));

    public abstract int a(apf var1, dih var2);

    public abstract dqi<?> a();
}

