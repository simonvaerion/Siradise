/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class acn<E>
implements Codec<he<E>> {
    private final acp<? extends hr<E>> a;

    public static <E> acn<E> a(acp<? extends hr<E>> $$0) {
        return new acn<E>($$0);
    }

    private acn(acp<? extends hr<E>> $$0) {
        this.a = $$0;
    }

    public <T> DataResult<T> a(he<E> $$02, DynamicOps<T> $$1, T $$22) {
        aco $$3;
        Optional $$4;
        if ($$1 instanceof aco && ($$4 = ($$3 = (aco)$$1).a(this.a)).isPresent()) {
            if (!$$02.a($$4.get())) {
                return DataResult.error(() -> "Element " + $$02 + " is not valid in current registry set");
            }
            return (DataResult)$$02.d().map($$2 -> acq.a.encode((Object)$$2.a(), $$1, $$22), $$0 -> DataResult.error(() -> "Elements from registry " + this.a + " can't be serialized to a value"));
        }
        return DataResult.error(() -> "Can't access registry " + this.a);
    }

    public <T> DataResult<Pair<he<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
        aco $$2;
        Optional $$3;
        if ($$0 instanceof aco && ($$3 = ($$2 = (aco)$$0).b(this.a)).isPresent()) {
            return acq.a.decode($$0, $$1).flatMap($$12 -> {
                acq $$2 = (acq)$$12.getFirst();
                return ((hf)$$3.get()).a(acp.a(this.a, $$2)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Failed to get element " + $$2)).map($$1 -> Pair.of((Object)$$1, (Object)$$12.getSecond())).setLifecycle(Lifecycle.stable());
            });
        }
        return DataResult.error(() -> "Can't access registry " + this.a);
    }

    public String toString() {
        return "RegistryFixedCodec[" + this.a + "]";
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.a((he)object, dynamicOps, object2);
    }
}

