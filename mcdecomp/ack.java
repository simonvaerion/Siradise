/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ack<E>
implements Codec<hi<E>> {
    private final acp<? extends hr<E>> a;
    private final Codec<he<E>> b;
    private final Codec<List<he<E>>> c;
    private final Codec<Either<anl<E>, List<he<E>>>> d;

    private static <E> Codec<List<he<E>>> a(Codec<he<E>> $$03, boolean $$1) {
        Codec $$2 = aoi.a($$03.listOf(), aoi.b(he::f));
        if ($$1) {
            return $$2;
        }
        return Codec.either($$2, $$03).xmap($$02 -> (List)$$02.map($$0 -> $$0, List::of), $$0 -> $$0.size() == 1 ? Either.right((Object)((he)$$0.get(0))) : Either.left((Object)$$0));
    }

    public static <E> Codec<hi<E>> a(acp<? extends hr<E>> $$0, Codec<he<E>> $$1, boolean $$2) {
        return new ack<E>($$0, $$1, $$2);
    }

    private ack(acp<? extends hr<E>> $$0, Codec<he<E>> $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = ack.a($$1, $$2);
        this.d = Codec.either(anl.b($$0), this.c);
    }

    public <T> DataResult<Pair<hi<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
        aco $$2;
        Optional $$3;
        if ($$0 instanceof aco && ($$3 = ($$2 = (aco)$$0).b(this.a)).isPresent()) {
            hf $$4 = $$3.get();
            return this.d.decode($$0, $$1).map($$12 -> $$12.mapFirst($$1 -> (hi)$$1.map($$4::b, hi::a)));
        }
        return this.a($$0, $$1);
    }

    public <T> DataResult<T> a(hi<E> $$0, DynamicOps<T> $$1, T $$2) {
        aco $$3;
        Optional $$4;
        if ($$1 instanceof aco && ($$4 = ($$3 = (aco)$$1).a(this.a)).isPresent()) {
            if (!$$0.a($$4.get())) {
                return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }
            return this.d.encode((Object)$$0.c().mapRight(List::copyOf), $$1, $$2);
        }
        return this.b($$0, $$1, $$2);
    }

    private <T> DataResult<Pair<hi<E>, T>> a(DynamicOps<T> $$02, T $$1) {
        return this.b.listOf().decode($$02, $$1).flatMap($$0 -> {
            ArrayList<he.a> $$1 = new ArrayList<he.a>();
            for (he $$2 : (List)$$0.getFirst()) {
                if ($$2 instanceof he.a) {
                    he.a $$3 = (he.a)$$2;
                    $$1.add($$3);
                    continue;
                }
                return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }
            return DataResult.success((Object)new Pair(hi.a($$1), $$0.getSecond()));
        });
    }

    private <T> DataResult<T> b(hi<E> $$0, DynamicOps<T> $$1, T $$2) {
        return this.c.encode($$0.a().toList(), $$1, $$2);
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.a((hi)object, dynamicOps, object2);
    }
}

