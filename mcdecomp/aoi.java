/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Codec$ResultFunction
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.floats.FloatArrayList
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.joml.AxisAngle4f
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.joml.AxisAngle4f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aoi {
    public static final Codec<JsonElement> a = Codec.PASSTHROUGH.xmap($$0 -> (JsonElement)$$0.convert((DynamicOps)JsonOps.INSTANCE).getValue(), $$0 -> new Dynamic((DynamicOps)JsonOps.INSTANCE, $$0));
    public static final Codec<sw> b = a.flatXmap($$0 -> {
        try {
            return DataResult.success((Object)sw.a.a($$0));
        }
        catch (JsonParseException $$1) {
            return DataResult.error($$1::getMessage);
        }
    }, $$0 -> {
        try {
            return DataResult.success((Object)sw.a.c($$0));
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error($$1::getMessage);
        }
    });
    public static final Codec<sw> c = Codec.STRING.flatXmap($$0 -> {
        try {
            return DataResult.success((Object)sw.a.a($$0));
        }
        catch (JsonParseException $$1) {
            return DataResult.error($$1::getMessage);
        }
    }, $$0 -> {
        try {
            return DataResult.success((Object)sw.a.a($$0));
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error($$1::getMessage);
        }
    });
    public static final Codec<Vector3f> d = Codec.FLOAT.listOf().comapFlatMap($$02 -> ac.a($$02, 3).map($$0 -> new Vector3f(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue(), ((Float)$$0.get(2)).floatValue())), $$0 -> List.of(Float.valueOf($$0.x()), Float.valueOf($$0.y()), Float.valueOf($$0.z())));
    public static final Codec<Quaternionf> e = Codec.FLOAT.listOf().comapFlatMap($$02 -> ac.a($$02, 4).map($$0 -> new Quaternionf(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue(), ((Float)$$0.get(2)).floatValue(), ((Float)$$0.get(3)).floatValue())), $$0 -> List.of(Float.valueOf($$0.x), Float.valueOf($$0.y), Float.valueOf($$0.z), Float.valueOf($$0.w)));
    public static final Codec<AxisAngle4f> f = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("angle").forGetter($$0 -> Float.valueOf($$0.angle)), (App)d.fieldOf("axis").forGetter($$0 -> new Vector3f($$0.x, $$0.y, $$0.z))).apply((Applicative)$$02, AxisAngle4f::new));
    public static final Codec<Quaternionf> g = Codec.either(e, (Codec)f.xmap(Quaternionf::new, AxisAngle4f::new)).xmap($$02 -> (Quaternionf)$$02.map($$0 -> $$0, $$0 -> $$0), Either::left);
    public static Codec<Matrix4f> h = Codec.FLOAT.listOf().comapFlatMap($$02 -> ac.a($$02, 16).map($$0 -> {
        Matrix4f $$1 = new Matrix4f();
        for (int $$2 = 0; $$2 < $$0.size(); ++$$2) {
            $$1.setRowColumn($$2 >> 2, $$2 & 3, ((Float)$$0.get($$2)).floatValue());
        }
        return $$1.determineProperties();
    }), $$0 -> {
        FloatArrayList $$1 = new FloatArrayList(16);
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            $$1.add($$0.getRowColumn($$2 >> 2, $$2 & 3));
        }
        return $$1;
    });
    public static final Codec<Integer> i = aoi.a(0, Integer.MAX_VALUE, (Integer $$0) -> "Value must be non-negative: " + $$0);
    public static final Codec<Integer> j = aoi.a(1, Integer.MAX_VALUE, (Integer $$0) -> "Value must be positive: " + $$0);
    public static final Codec<Float> k = aoi.a(0.0f, Float.MAX_VALUE, (Float $$0) -> "Value must be positive: " + $$0);
    public static final Codec<Pattern> l = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)Pattern.compile($$0));
        }
        catch (PatternSyntaxException $$1) {
            return DataResult.error(() -> "Invalid regex pattern '" + $$0 + "': " + $$1.getMessage());
        }
    }, Pattern::pattern);
    public static final Codec<Instant> m = aoi.a(DateTimeFormatter.ISO_INSTANT);
    public static final Codec<byte[]> n = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)Base64.getDecoder().decode((String)$$0));
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error(() -> "Malformed base64 string");
        }
    }, $$0 -> Base64.getEncoder().encodeToString((byte[])$$0));
    public static final Codec<d> o = Codec.STRING.comapFlatMap($$02 -> $$02.startsWith("#") ? acq.b($$02.substring(1)).map($$0 -> new d((acq)$$0, true)) : acq.b($$02).map($$0 -> new d((acq)$$0, false)), d::c);
    public static final Function<Optional<Long>, OptionalLong> p = $$0 -> $$0.map(OptionalLong::of).orElseGet(OptionalLong::empty);
    public static final Function<OptionalLong, Optional<Long>> q = $$0 -> $$0.isPresent() ? Optional.of($$0.getAsLong()) : Optional.empty();
    public static final Codec<BitSet> r = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> Arrays.stream($$0.toLongArray()));
    private static final Codec<Property> w = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.STRING.fieldOf("name").forGetter(Property::getName), (App)Codec.STRING.fieldOf("value").forGetter(Property::getValue), (App)Codec.STRING.optionalFieldOf("signature").forGetter($$0 -> Optional.ofNullable($$0.getSignature()))).apply((Applicative)$$02, ($$0, $$1, $$2) -> new Property($$0, $$1, (String)$$2.orElse(null))));
    @VisibleForTesting
    public static final Codec<PropertyMap> s = Codec.either((Codec)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING.listOf()), (Codec)w.listOf()).xmap($$0 -> {
        PropertyMap $$13 = new PropertyMap();
        $$0.ifLeft($$12 -> $$12.forEach(($$1, $$2) -> {
            for (String $$3 : $$2) {
                $$13.put($$1, (Object)new Property($$1, $$3));
            }
        })).ifRight($$1 -> {
            for (Property $$2 : $$1) {
                $$13.put((Object)$$2.getName(), (Object)$$2);
            }
        });
        return $$13;
    }, $$0 -> Either.right($$0.values().stream().toList()));
    public static final Codec<GameProfile> t = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.mapPair((MapCodec)hy.c.xmap(Optional::of, $$0 -> $$0.orElse(null)).optionalFieldOf("id", Optional.empty()), (MapCodec)Codec.STRING.xmap(Optional::of, $$0 -> $$0.orElse(null)).optionalFieldOf("name", Optional.empty())).flatXmap(aoi::a, aoi::a).forGetter(Function.identity()), (App)s.optionalFieldOf("properties", (Object)new PropertyMap()).forGetter(GameProfile::getProperties)).apply((Applicative)$$02, ($$0, $$12) -> {
        $$12.forEach(($$1, $$2) -> $$0.getProperties().put($$1, $$2));
        return $$0;
    }));
    public static final Codec<String> u = aoi.a(Codec.STRING, (T $$0) -> $$0.isEmpty() ? DataResult.error(() -> "Expected non-empty string") : DataResult.success((Object)$$0));
    public static final Codec<Integer> v = Codec.STRING.comapFlatMap($$0 -> {
        int[] $$1 = $$0.codePoints().toArray();
        if ($$1.length != 1) {
            return DataResult.error(() -> "Expected one codepoint, got: " + $$0);
        }
        return DataResult.success((Object)$$1[0]);
    }, Character::toString);

    public static <F, S> Codec<Either<F, S>> a(Codec<F> $$0, Codec<S> $$1) {
        return new e<F, S>($$0, $$1);
    }

    public static <P, I> Codec<I> a(Codec<P> $$0, String $$13, String $$22, BiFunction<P, P, DataResult<I>> $$32, Function<I, P> $$4, Function<I, P> $$5) {
        Codec $$6 = Codec.list($$0).comapFlatMap($$12 -> ac.a($$12, 2).flatMap($$1 -> {
            Object $$2 = $$1.get(0);
            Object $$3 = $$1.get(1);
            return (DataResult)$$32.apply($$2, $$3);
        }), $$2 -> ImmutableList.of($$4.apply($$2), $$5.apply($$2)));
        Codec $$7 = RecordCodecBuilder.create($$3 -> $$3.group((App)$$0.fieldOf($$13).forGetter(Pair::getFirst), (App)$$0.fieldOf($$22).forGetter(Pair::getSecond)).apply((Applicative)$$3, Pair::of)).comapFlatMap($$1 -> (DataResult)$$32.apply($$1.getFirst(), $$1.getSecond()), $$2 -> Pair.of($$4.apply($$2), $$5.apply($$2)));
        Codec $$8 = new b($$6, $$7).xmap($$02 -> $$02.map($$0 -> $$0, $$0 -> $$0), Either::left);
        return Codec.either($$0, (Codec)$$8).comapFlatMap($$12 -> (DataResult)$$12.map($$1 -> (DataResult)$$32.apply($$1, $$1), DataResult::success), $$2 -> {
            Object $$4;
            Object $$3 = $$4.apply($$2);
            if (Objects.equals($$3, $$4 = $$5.apply($$2))) {
                return Either.left($$3);
            }
            return Either.right((Object)$$2);
        });
    }

    public static <A> Codec.ResultFunction<A> a(final A $$0) {
        return new Codec.ResultFunction<A>(){

            public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> $$02, T $$1, DataResult<Pair<A, T>> $$2) {
                MutableObject $$3 = new MutableObject();
                Optional $$4 = $$2.resultOrPartial(arg_0 -> ((MutableObject)$$3).setValue(arg_0));
                if ($$4.isPresent()) {
                    return $$2;
                }
                return DataResult.error(() -> "(" + (String)$$3.getValue() + " -> using default)", (Object)Pair.of((Object)$$0, $$1));
            }

            public <T> DataResult<T> coApply(DynamicOps<T> $$02, A $$1, DataResult<T> $$2) {
                return $$2;
            }

            public String toString() {
                return "OrElsePartial[" + $$0 + "]";
            }
        };
    }

    public static <E> Codec<E> a(ToIntFunction<E> $$0, IntFunction<E> $$12, int $$22) {
        return Codec.INT.flatXmap($$1 -> Optional.ofNullable($$12.apply((int)$$1)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown element id: " + $$1)), $$2 -> {
            int $$3 = $$0.applyAsInt($$2);
            return $$3 == $$22 ? DataResult.error(() -> "Element with unknown id: " + $$2) : DataResult.success((Object)$$3);
        });
    }

    public static <E> Codec<E> a(Function<E, String> $$0, Function<String, E> $$12) {
        return Codec.STRING.flatXmap($$1 -> Optional.ofNullable($$12.apply((String)$$1)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown element name:" + $$1)), $$1 -> Optional.ofNullable((String)$$0.apply($$1)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Element with unknown name: " + $$1)));
    }

    public static <E> Codec<E> b(final Codec<E> $$0, final Codec<E> $$1) {
        return new Codec<E>(){

            public <T> DataResult<T> encode(E $$02, DynamicOps<T> $$12, T $$2) {
                if ($$12.compressMaps()) {
                    return $$1.encode($$02, $$12, $$2);
                }
                return $$0.encode($$02, $$12, $$2);
            }

            public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$02, T $$12) {
                if ($$02.compressMaps()) {
                    return $$1.decode($$02, $$12);
                }
                return $$0.decode($$02, $$12);
            }

            public String toString() {
                return $$0 + " orCompressed " + $$1;
            }
        };
    }

    public static <E> Codec<E> a(Codec<E> $$0, final Function<E, Lifecycle> $$1, final Function<E, Lifecycle> $$2) {
        return $$0.mapResult(new Codec.ResultFunction<E>(){

            public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> $$0, T $$12, DataResult<Pair<E, T>> $$22) {
                return $$22.result().map($$2 -> $$22.setLifecycle((Lifecycle)$$1.apply($$2.getFirst()))).orElse($$22);
            }

            public <T> DataResult<T> coApply(DynamicOps<T> $$0, E $$12, DataResult<T> $$22) {
                return $$22.setLifecycle((Lifecycle)$$2.apply($$12));
            }

            public String toString() {
                return "WithLifecycle[" + $$1 + " " + $$2 + "]";
            }
        });
    }

    public static <T> Codec<T> a(Codec<T> $$0, Function<T, DataResult<T>> $$1) {
        return $$0.flatXmap($$1, $$1);
    }

    public static <T> MapCodec<T> a(MapCodec<T> $$0, Function<T, DataResult<T>> $$1) {
        return $$0.flatXmap($$1, $$1);
    }

    private static Codec<Integer> a(int $$0, int $$1, Function<Integer, String> $$2) {
        return aoi.a(Codec.INT, (T $$3) -> {
            if ($$3.compareTo($$0) >= 0 && $$3.compareTo($$1) <= 0) {
                return DataResult.success((Object)$$3);
            }
            return DataResult.error(() -> (String)$$2.apply((Integer)$$3));
        });
    }

    public static Codec<Integer> a(int $$0, int $$1) {
        return aoi.a($$0, $$1, (Integer $$2) -> "Value must be within range [" + $$0 + ";" + $$1 + "]: " + $$2);
    }

    private static Codec<Float> a(float $$0, float $$1, Function<Float, String> $$2) {
        return aoi.a(Codec.FLOAT, (T $$3) -> {
            if ($$3.compareTo(Float.valueOf($$0)) > 0 && $$3.compareTo(Float.valueOf($$1)) <= 0) {
                return DataResult.success((Object)$$3);
            }
            return DataResult.error(() -> (String)$$2.apply((Float)$$3));
        });
    }

    public static <T> Codec<List<T>> a(Codec<List<T>> $$02) {
        return aoi.a($$02, (T $$0) -> $$0.isEmpty() ? DataResult.error(() -> "List must have contents") : DataResult.success((Object)$$0));
    }

    public static <T> Codec<hi<T>> b(Codec<hi<T>> $$02) {
        return aoi.a($$02, (T $$0) -> {
            if ($$0.c().right().filter(List::isEmpty).isPresent()) {
                return DataResult.error(() -> "List must have contents");
            }
            return DataResult.success((Object)$$0);
        });
    }

    public static <A> Codec<A> a(Supplier<Codec<A>> $$0) {
        return new c<A>($$0);
    }

    public static <E> MapCodec<E> a(Function<DynamicOps<?>, DataResult<E>> $$0) {
        class A
        extends MapCodec<E> {
            final /* synthetic */ Function a;

            A(Function function) {
                this.a = function;
            }

            public <T> RecordBuilder<T> encode(E $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
                return $$2;
            }

            public <T> DataResult<E> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
                return (DataResult)this.a.apply($$0);
            }

            public String toString() {
                return "ContextRetrievalCodec[" + this.a + "]";
            }

            public <T> Stream<T> keys(DynamicOps<T> $$0) {
                return Stream.empty();
            }
        }
        return new A($$0);
    }

    public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> b(Function<E, T> $$0) {
        return $$1 -> {
            Iterator $$2 = $$1.iterator();
            if ($$2.hasNext()) {
                Object $$3 = $$0.apply($$2.next());
                while ($$2.hasNext()) {
                    Object $$4 = $$2.next();
                    Object $$5 = $$0.apply($$4);
                    if ($$5 == $$3) continue;
                    return DataResult.error(() -> "Mixed type list: element " + $$4 + " had type " + $$5 + ", but list is of type " + $$3);
                }
            }
            return DataResult.success((Object)$$1, (Lifecycle)Lifecycle.stable());
        };
    }

    public static <A> Codec<A> c(final Codec<A> $$0) {
        return Codec.of($$0, (Decoder)new Decoder<A>(){

            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$02, T $$1) {
                try {
                    return $$0.decode($$02, $$1);
                }
                catch (Exception $$2) {
                    return DataResult.error(() -> "Caught exception decoding " + $$1 + ": " + $$2.getMessage());
                }
            }
        });
    }

    public static Codec<Instant> a(DateTimeFormatter $$0) {
        return Codec.STRING.comapFlatMap($$1 -> {
            try {
                return DataResult.success((Object)Instant.from($$0.parse((CharSequence)$$1)));
            }
            catch (Exception $$2) {
                return DataResult.error($$2::getMessage);
            }
        }, $$0::format);
    }

    public static MapCodec<OptionalLong> a(MapCodec<Optional<Long>> $$0) {
        return $$0.xmap(p, q);
    }

    private static DataResult<GameProfile> a(Pair<Optional<UUID>, Optional<String>> $$0) {
        try {
            return DataResult.success((Object)new GameProfile((UUID)((Optional)$$0.getFirst()).orElse(null), (String)((Optional)$$0.getSecond()).orElse(null)));
        }
        catch (Throwable $$1) {
            return DataResult.error($$1::getMessage);
        }
    }

    private static DataResult<Pair<Optional<UUID>, Optional<String>>> a(GameProfile $$0) {
        return DataResult.success((Object)Pair.of(Optional.ofNullable($$0.getId()), Optional.ofNullable($$0.getName())));
    }

    public static Codec<String> b(int $$0, int $$1) {
        return aoi.a(Codec.STRING, (T $$2) -> {
            int $$3 = $$2.length();
            if ($$3 < $$0) {
                return DataResult.error(() -> "String \"" + $$2 + "\" is too short: " + $$3 + ", expected range [" + $$0 + "-" + $$1 + "]");
            }
            if ($$3 > $$1) {
                return DataResult.error(() -> "String \"" + $$2 + "\" is too long: " + $$3 + ", expected range [" + $$0 + "-" + $$1 + "]");
            }
            return DataResult.success((Object)$$2);
        });
    }

    static final class e<F, S>
    implements Codec<Either<F, S>> {
        private final Codec<F> a;
        private final Codec<S> b;

        public e(Codec<F> $$0, Codec<S> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$02, T $$1) {
            DataResult $$2 = this.a.decode($$02, $$1).map($$0 -> $$0.mapFirst(Either::left));
            DataResult $$3 = this.b.decode($$02, $$1).map($$0 -> $$0.mapFirst(Either::right));
            Optional $$4 = $$2.result();
            Optional $$5 = $$3.result();
            if ($$4.isPresent() && $$5.isPresent()) {
                return DataResult.error(() -> "Both alternatives read successfully, can not pick the correct one; first: " + $$4.get() + " second: " + $$5.get(), (Object)((Pair)$$4.get()));
            }
            return $$4.isPresent() ? $$2 : $$3;
        }

        public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$22) {
            return (DataResult)$$0.map($$2 -> this.a.encode($$2, $$1, $$22), $$2 -> this.b.encode($$2, $$1, $$22));
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            e $$1 = (e)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return "XorCodec[" + this.a + ", " + this.b + "]";
        }

        public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
            return this.a((Either)object, dynamicOps, object2);
        }
    }

    static final class b<F, S>
    implements Codec<Either<F, S>> {
        private final Codec<F> a;
        private final Codec<S> b;

        public b(Codec<F> $$0, Codec<S> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$02, T $$12) {
            DataResult $$2 = this.a.decode($$02, $$12).map($$0 -> $$0.mapFirst(Either::left));
            if (!$$2.error().isPresent()) {
                return $$2;
            }
            DataResult $$3 = this.b.decode($$02, $$12).map($$0 -> $$0.mapFirst(Either::right));
            if (!$$3.error().isPresent()) {
                return $$3;
            }
            return $$2.apply2(($$0, $$1) -> $$1, $$3);
        }

        public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$22) {
            return (DataResult)$$0.map($$2 -> this.a.encode($$2, $$1, $$22), $$2 -> this.b.encode($$2, $$1, $$22));
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            b $$1 = (b)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return "EitherCodec[" + this.a + ", " + this.b + "]";
        }

        public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
            return this.a((Either)object, dynamicOps, object2);
        }
    }

    record c<A>(Supplier<Codec<A>> a) implements Codec<A>
    {
        c(Supplier<Codec<A>> $$0) {
            this.a = $$0 = Suppliers.memoize(() -> $$0.get());
        }

        public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0, T $$1) {
            return this.a.get().decode($$0, $$1);
        }

        public <T> DataResult<T> encode(A $$0, DynamicOps<T> $$1, T $$2) {
            return this.a.get().encode($$0, $$1, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "delegate", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "delegate", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "delegate", "a"}, this, $$0);
        }
    }

    public record d(acq a, boolean b) {
        @Override
        public String toString() {
            return this.c();
        }

        private String c() {
            return this.b ? "#" + this.a : this.a.toString();
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "id;tag", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "id;tag", "a", "b"}, this, $$0);
        }
    }
}

