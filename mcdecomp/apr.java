/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface apr {
    public static final int W = 16;

    public String c();

    public static <E extends Enum<E>> a<E> a(Supplier<E[]> $$02) {
        return apr.a($$02, (String $$0) -> $$0);
    }

    public static <E extends Enum<E>> a<E> a(Supplier<E[]> $$02, Function<String, String> $$12) {
        Enum[] $$22 = (Enum[])$$02.get();
        if ($$22.length > 16) {
            Map<String, Enum> $$3 = Arrays.stream($$22).collect(Collectors.toMap($$1 -> (String)$$12.apply(((apr)((Object)$$1)).c()), $$0 -> $$0));
            return new a($$22, $$1 -> $$1 == null ? null : (Enum)$$3.get($$1));
        }
        return new a($$22, $$2 -> {
            for (Enum $$3 : $$22) {
                if (!((String)$$12.apply(((apr)((Object)$$3)).c())).equals($$2)) continue;
                return $$3;
            }
            return null;
        });
    }

    public static Keyable a(final apr[] $$0) {
        return new Keyable(){

            public <T> Stream<T> keys(DynamicOps<T> $$02) {
                return Arrays.stream($$0).map(apr::c).map(arg_0 -> $$02.createString(arg_0));
            }
        };
    }

    @Deprecated
    public static class a<E extends Enum<E>>
    implements Codec<E> {
        private final Codec<E> a;
        private final Function<String, E> b;

        public a(E[] $$02, Function<String, E> $$12) {
            this.a = aoi.b(aoi.a($$0 -> ((apr)$$0).c(), $$12), aoi.a($$0 -> ((Enum)$$0).ordinal(), $$1 -> $$1 >= 0 && $$1 < $$02.length ? $$02[$$1] : null, -1));
            this.b = $$12;
        }

        public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$0, T $$1) {
            return this.a.decode($$0, $$1);
        }

        public <T> DataResult<T> a(E $$0, DynamicOps<T> $$1, T $$2) {
            return this.a.encode($$0, $$1, $$2);
        }

        @Nullable
        public E a(@Nullable String $$0) {
            return (E)((Enum)this.b.apply($$0));
        }

        public E a(@Nullable String $$0, E $$1) {
            return (E)((Enum)Objects.requireNonNullElse(this.a($$0), $$1));
        }

        public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
            return this.a((Enum)object, dynamicOps, object2);
        }
    }
}

