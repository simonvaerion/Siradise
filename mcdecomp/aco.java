/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class aco<T>
extends aci<T> {
    private final b b;

    private static b a(final b $$0) {
        return new b(){
            private final Map<acp<? extends hr<?>>, Optional<? extends a<?>>> b = new HashMap();

            @Override
            public <T> Optional<a<T>> a(acp<? extends hr<? extends T>> $$02) {
                return this.b.computeIfAbsent($$02, $$0::a);
            }
        };
    }

    public static <T> aco<T> a(DynamicOps<T> $$0, final hg.b $$1) {
        return aco.a($$0, aco.a(new b(){

            public <E> Optional<a<E>> a(acp<? extends hr<? extends E>> $$02) {
                return $$1.a($$02).map($$0 -> new a($$0, $$0, $$0.g()));
            }
        }));
    }

    public static <T> aco<T> a(DynamicOps<T> $$0, b $$1) {
        return new aco<T>($$0, $$1);
    }

    private aco(DynamicOps<T> $$0, b $$1) {
        super($$0);
        this.b = $$1;
    }

    public <E> Optional<hh<E>> a(acp<? extends hr<? extends E>> $$0) {
        return this.b.a($$0).map(a::a);
    }

    public <E> Optional<hf<E>> b(acp<? extends hr<? extends E>> $$0) {
        return this.b.a($$0).map(a::b);
    }

    public static <E, O> RecordCodecBuilder<O, hf<E>> c(acp<? extends hr<? extends E>> $$02) {
        return aoi.a((DynamicOps<?> $$1) -> {
            if ($$1 instanceof aco) {
                aco $$2 = (aco)$$1;
                return $$2.b.a($$02).map($$0 -> DataResult.success($$0.b(), (Lifecycle)$$0.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$02));
            }
            return DataResult.error(() -> "Not a registry ops");
        }).forGetter($$0 -> null);
    }

    public static <E, O> RecordCodecBuilder<O, he.c<E>> d(acp<E> $$02) {
        acp $$1 = acp.a($$02.b());
        return aoi.a((DynamicOps<?> $$2) -> {
            if ($$2 instanceof aco) {
                aco $$3 = (aco)$$2;
                return $$3.b.a($$1).flatMap($$1 -> $$1.b().a($$02)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$02));
            }
            return DataResult.error(() -> "Not a registry ops");
        }).forGetter($$0 -> null);
    }

    public static interface b {
        public <T> Optional<a<T>> a(acp<? extends hr<? extends T>> var1);
    }

    public record a<T>(hh<T> a, hf<T> b, Lifecycle c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this, $$0);
        }
    }
}

