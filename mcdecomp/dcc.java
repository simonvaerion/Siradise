/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSortedMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 *  javax.annotation.Nullable
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcc<O, S extends dcd<O, S>> {
    static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
    private final O b;
    private final ImmutableSortedMap<String, dde<?>> c;
    private final ImmutableList<S> d;

    protected dcc(Function<O, S> $$0, O $$12, b<O, S> $$2, Map<String, dde<?>> $$3) {
        this.b = $$12;
        this.c = ImmutableSortedMap.copyOf($$3);
        Supplier<dcd> $$4 = () -> (dcd)$$0.apply($$12);
        MapCodec<dcd> $$52 = MapCodec.of((MapEncoder)Encoder.empty(), (MapDecoder)Decoder.unit($$4));
        for (Map.Entry $$6 : this.c.entrySet()) {
            $$52 = dcc.a($$52, $$4, (String)$$6.getKey(), (dde)$$6.getValue());
        }
        MapCodec<dcd> $$7 = $$52;
        LinkedHashMap $$8 = Maps.newLinkedHashMap();
        ArrayList $$9 = Lists.newArrayList();
        Stream<List<List<Object>>> $$10 = Stream.of(Collections.emptyList());
        for (dde $$11 : this.c.values()) {
            $$10 = $$10.flatMap($$1 -> $$11.a().stream().map($$2 -> {
                ArrayList $$3 = Lists.newArrayList((Iterable)$$1);
                $$3.add(Pair.of((Object)$$11, (Object)$$2));
                return $$3;
            }));
        }
        $$10.forEach($$5 -> {
            ImmutableMap $$6 = (ImmutableMap)$$5.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
            dcd $$7 = (dcd)$$2.create($$12, $$6, $$7);
            $$8.put($$6, $$7);
            $$9.add($$7);
        });
        for (dcd $$122 : $$9) {
            $$122.a($$8);
        }
        this.d = ImmutableList.copyOf((Collection)$$9);
    }

    private static <S extends dcd<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> $$02, Supplier<S> $$12, String $$2, dde<T> $$3) {
        return Codec.mapPair($$02, (MapCodec)$$3.e().fieldOf($$2).orElseGet($$0 -> {}, () -> $$3.a((dcd)$$12.get()))).xmap($$1 -> (dcd)((dcd)$$1.getFirst()).a($$3, ((dde.a)$$1.getSecond()).b()), $$1 -> Pair.of((Object)$$1, $$3.a((dcd<?, ?>)$$1)));
    }

    public ImmutableList<S> a() {
        return this.d;
    }

    public S b() {
        return (S)((dcd)this.d.get(0));
    }

    public O c() {
        return this.b;
    }

    public Collection<dde<?>> d() {
        return this.c.values();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", this.b).add("properties", this.c.values().stream().map(dde::f).collect(Collectors.toList())).toString();
    }

    @Nullable
    public dde<?> a(String $$0) {
        return (dde)this.c.get((Object)$$0);
    }

    public static interface b<O, S> {
        public S create(O var1, ImmutableMap<dde<?>, Comparable<?>> var2, MapCodec<S> var3);
    }

    public static class a<O, S extends dcd<O, S>> {
        private final O a;
        private final Map<String, dde<?>> b = Maps.newHashMap();

        public a(O $$0) {
            this.a = $$0;
        }

        public a<O, S> a(dde<?> ... $$0) {
            for (dde<?> $$1 : $$0) {
                this.a((dde<T>)$$1);
                this.b.put($$1.f(), $$1);
            }
            return this;
        }

        private <T extends Comparable<T>> void a(dde<T> $$0) {
            String $$1 = $$0.f();
            if (!a.matcher($$1).matches()) {
                throw new IllegalArgumentException(this.a + " has invalidly named property: " + $$1);
            }
            Collection<T> $$2 = $$0.a();
            if ($$2.size() <= 1) {
                throw new IllegalArgumentException(this.a + " attempted use property " + $$1 + " with <= 1 possible values");
            }
            for (Comparable $$3 : $$2) {
                String $$4 = $$0.a($$3);
                if (a.matcher($$4).matches()) continue;
                throw new IllegalArgumentException(this.a + " has property: " + $$1 + " with invalidly named value: " + $$4);
            }
            if (this.b.containsKey($$1)) {
                throw new IllegalArgumentException(this.a + " has duplicate property: " + $$1);
            }
        }

        public dcc<O, S> a(Function<O, S> $$0, b<O, S> $$1) {
            return new dcc<O, S>($$0, this.a, $$1, this.b);
        }
    }
}

