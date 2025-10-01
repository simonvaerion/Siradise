/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cny {
    public static final Codec<cny> a = RecordCodecBuilder.create($$02 -> $$02.group((App)cny$a.c.fieldOf("preset").forGetter($$0 -> $$0.c), aco.c(jc.ap)).apply((Applicative)$$02, cny::new));
    public static final Codec<he<cny>> b = acm.a(jc.aG, a);
    private final a c;
    private final cnt.c<he<cnk>> d;

    public cny(a $$0, hf<cnk> $$1) {
        this.c = $$0;
        this.d = $$0.e.apply($$1::b);
    }

    public cnt.c<he<cnk>> a() {
        return this.d;
    }

    public static Map<a, cnt.c<acp<cnk>>> b() {
        return cny$a.f.values().stream().collect(Collectors.toMap($$0 -> $$0, $$02 -> $$02.c().apply($$0 -> $$0)));
    }

    public static final class cny$a
    extends Record {
        private final acq d;
        final a e;
        public static final cny$a a = new cny$a(new acq("nether"), new a(){

            @Override
            public <T> cnt.c<T> apply(Function<acp<cnk>, T> $$0) {
                return new cnt.c(List.of(Pair.of((Object)cnt.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(cnr.ac)), Pair.of((Object)cnt.a(0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(cnr.af)), Pair.of((Object)cnt.a(0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), $$0.apply(cnr.ae)), Pair.of((Object)cnt.a(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.375f), $$0.apply(cnr.ad)), Pair.of((Object)cnt.a(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.175f), $$0.apply(cnr.ag))));
            }
        });
        public static final cny$a b = new cny$a(new acq("overworld"), new a(){

            @Override
            public <T> cnt.c<T> apply(Function<acp<cnk>, T> $$0) {
                return cny$a.a($$0);
            }
        });
        static final Map<acq, cny$a> f = Stream.of(a, b).collect(Collectors.toMap(cny$a::b, $$0 -> $$0));
        public static final Codec<cny$a> c = acq.a.flatXmap($$0 -> Optional.ofNullable(f.get($$0)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)), $$0 -> DataResult.success((Object)$$0.d));

        public cny$a(acq $$0, a $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        static <T> cnt.c<T> a(Function<acp<cnk>, T> $$0) {
            ImmutableList.Builder $$1 = ImmutableList.builder();
            new coa().a($$2 -> $$1.add((Object)$$2.mapSecond($$0)));
            return new cnt.c($$1.build());
        }

        public Stream<acp<cnk>> a() {
            return this.e.apply($$0 -> $$0).a().stream().map(Pair::getSecond).distinct();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{cny$a.class, "id;provider", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cny$a.class, "id;provider", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cny$a.class, "id;provider", "d", "e"}, this, $$0);
        }

        public acq b() {
            return this.d;
        }

        public a c() {
            return this.e;
        }

        @FunctionalInterface
        static interface a {
            public <T> cnt.c<T> apply(Function<acp<cnk>, T> var1);
        }
    }
}

