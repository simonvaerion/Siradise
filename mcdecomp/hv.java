/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.UnboundedMapCodec
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class hv {
    private static final Map<acp<? extends hr<?>>, a<?>> b = (Map)ac.a(() -> {
        ImmutableMap.Builder $$0 = ImmutableMap.builder();
        hv.a($$0, jc.ap, cnk.b);
        hv.a($$0, jc.aq, ss.a);
        hv.a($$0, jc.aE, cie.a);
        hv.a($$0, jc.aD, cic.a);
        hv.a($$0, jc.au, dfk.h);
        hv.a($$0, jc.p, bep.a);
        return $$0.build();
    });
    public static final Codec<hs> a = hv.a();

    private static <E> void a(ImmutableMap.Builder<acp<? extends hr<?>>, a<?>> $$0, acp<? extends hr<E>> $$1, Codec<E> $$2) {
        $$0.put($$1, new a<E>($$1, $$2));
    }

    private static Stream<hs.d<?>> a(hs $$02) {
        return $$02.b().filter($$0 -> b.containsKey($$0.a()));
    }

    private static <E> DataResult<? extends Codec<E>> a(acp<? extends hr<E>> $$02) {
        return Optional.ofNullable(b.get($$02)).map($$0 -> $$0.b()).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$02));
    }

    private static <E> Codec<hs> a() {
        Codec $$02 = acq.a.xmap(acp::a, acp::a);
        Codec $$1 = $$02.partialDispatch("type", $$0 -> DataResult.success($$0.c()), $$0 -> hv.a($$0).map($$1 -> ht.a($$0, Lifecycle.experimental(), $$1)));
        UnboundedMapCodec $$2 = Codec.unboundedMap((Codec)$$02, (Codec)$$1);
        return hv.a($$2);
    }

    private static <K extends acp<? extends hr<?>>, V extends hr<?>> Codec<hs> a(UnboundedMapCodec<K, V> $$0) {
        return $$0.xmap(hs.c::new, $$02 -> (Map)hv.a($$02).collect(ImmutableMap.toImmutableMap($$0 -> $$0.a(), $$0 -> $$0.b())));
    }

    public static Stream<hs.d<?>> a(hl<acz> $$0) {
        return hv.a($$0.c(acz.b));
    }

    public static Stream<hs.d<?>> b(hl<acz> $$0) {
        Stream<hs.d<?>> $$1 = $$0.a(acz.a).b();
        Stream<hs.d<?>> $$2 = hv.a($$0);
        return Stream.concat($$2, $$1);
    }

    record a<E>(acp<? extends hr<E>> a, Codec<E> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "key;networkCodec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "key;networkCodec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "key;networkCodec", "a", "b"}, this, $$0);
        }
    }
}

