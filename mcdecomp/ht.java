/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.UnboundedMapCodec
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class ht {
    private static <T> MapCodec<a<T>> a(acp<? extends hr<T>> $$0, MapCodec<T> $$1) {
        return RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)acp.a($$0).fieldOf("name").forGetter(a::a), (App)Codec.INT.fieldOf("id").forGetter(a::b), (App)$$1.forGetter(a::c)).apply((Applicative)$$2, a::new));
    }

    public static <T> Codec<hr<T>> a(acp<? extends hr<T>> $$02, Lifecycle $$1, Codec<T> $$22) {
        return ht.a($$02, $$22.fieldOf("element")).codec().listOf().xmap($$2 -> {
            hm $$3 = new hm($$02, $$1);
            for (a $$4 : $$2) {
                $$3.b($$4.b(), $$4.a(), $$4.c(), $$1);
            }
            return $$3;
        }, $$0 -> {
            ImmutableList.Builder $$1 = ImmutableList.builder();
            for (Object $$2 : $$0) {
                $$1.add(new a($$0.c($$2).get(), $$0.a($$2), $$2));
            }
            return $$1.build();
        });
    }

    public static <E> Codec<hr<E>> b(acp<? extends hr<E>> $$02, Lifecycle $$1, Codec<E> $$2) {
        UnboundedMapCodec $$3 = Codec.unboundedMap(acp.a($$02), $$2);
        return $$3.xmap($$22 -> {
            hm $$32 = new hm($$02, $$1);
            $$22.forEach(($$2, $$3) -> $$32.a($$2, $$3, $$1));
            return $$32.l();
        }, $$0 -> ImmutableMap.copyOf($$0.g()));
    }

    public static <E> Codec<hi<E>> a(acp<? extends hr<E>> $$0, Codec<E> $$1) {
        return ht.a($$0, $$1, false);
    }

    public static <E> Codec<hi<E>> a(acp<? extends hr<E>> $$0, Codec<E> $$1, boolean $$2) {
        return ack.a($$0, acm.a($$0, $$1), $$2);
    }

    public static <E> Codec<hi<E>> a(acp<? extends hr<E>> $$0) {
        return ht.a($$0, false);
    }

    public static <E> Codec<hi<E>> a(acp<? extends hr<E>> $$0, boolean $$1) {
        return ack.a($$0, acn.a($$0), $$1);
    }

    record a<T>(acp<T> a, int b, T c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "key;id;value", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "key;id;value", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "key;id;value", "a", "b", "c"}, this, $$0);
        }
    }
}

