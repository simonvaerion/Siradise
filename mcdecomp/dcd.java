/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayTable
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dcd<O, S> {
    public static final String c = "Name";
    public static final String d = "Properties";
    private static final Function<Map.Entry<dde<?>, Comparable<?>>, String> a = new Function<Map.Entry<dde<?>, Comparable<?>>, String>(){

        public String a(@Nullable Map.Entry<dde<?>, Comparable<?>> $$0) {
            if ($$0 == null) {
                return "<NULL>";
            }
            dde<?> $$1 = $$0.getKey();
            return $$1.f() + "=" + this.a($$1, $$0.getValue());
        }

        private <T extends Comparable<T>> String a(dde<T> $$0, Comparable<?> $$1) {
            return $$0.a($$1);
        }

        @Override
        public /* synthetic */ Object apply(@Nullable Object object) {
            return this.a((Map.Entry)object);
        }
    };
    protected final O e;
    private final ImmutableMap<dde<?>, Comparable<?>> b;
    private Table<dde<?>, Comparable<?>, S> g;
    protected final MapCodec<S> f;

    protected dcd(O $$0, ImmutableMap<dde<?>, Comparable<?>> $$1, MapCodec<S> $$2) {
        this.e = $$0;
        this.b = $$1;
        this.f = $$2;
    }

    public <T extends Comparable<T>> S a(dde<T> $$0) {
        return this.a($$0, (Comparable)dcd.a($$0.a(), this.c($$0)));
    }

    protected static <T> T a(Collection<T> $$0, T $$1) {
        Iterator<T> $$2 = $$0.iterator();
        while ($$2.hasNext()) {
            if (!$$2.next().equals($$1)) continue;
            if ($$2.hasNext()) {
                return $$2.next();
            }
            return $$0.iterator().next();
        }
        return $$2.next();
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append(this.e);
        if (!this.C().isEmpty()) {
            $$0.append('[');
            $$0.append(this.C().entrySet().stream().map(a).collect(Collectors.joining(",")));
            $$0.append(']');
        }
        return $$0.toString();
    }

    public Collection<dde<?>> B() {
        return Collections.unmodifiableCollection(this.b.keySet());
    }

    public <T extends Comparable<T>> boolean b(dde<T> $$0) {
        return this.b.containsKey($$0);
    }

    public <T extends Comparable<T>> T c(dde<T> $$0) {
        Comparable $$1 = (Comparable)this.b.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("Cannot get property " + $$0 + " as it does not exist in " + this.e);
        }
        return (T)((Comparable)$$0.g().cast($$1));
    }

    public <T extends Comparable<T>> Optional<T> d(dde<T> $$0) {
        Comparable $$1 = (Comparable)this.b.get($$0);
        if ($$1 == null) {
            return Optional.empty();
        }
        return Optional.of((Comparable)$$0.g().cast($$1));
    }

    public <T extends Comparable<T>, V extends T> S a(dde<T> $$0, V $$1) {
        Comparable $$2 = (Comparable)this.b.get($$0);
        if ($$2 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " as it does not exist in " + this.e);
        }
        if ($$2.equals($$1)) {
            return (S)this;
        }
        Object $$3 = this.g.get($$0, $$1);
        if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.e + ", it is not an allowed value");
        }
        return (S)$$3;
    }

    public <T extends Comparable<T>, V extends T> S b(dde<T> $$0, V $$1) {
        Comparable $$2 = (Comparable)this.b.get($$0);
        if ($$2 == null || $$2.equals($$1)) {
            return (S)this;
        }
        Object $$3 = this.g.get($$0, $$1);
        if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.e + ", it is not an allowed value");
        }
        return (S)$$3;
    }

    public void a(Map<Map<dde<?>, Comparable<?>>, S> $$0) {
        if (this.g != null) {
            throw new IllegalStateException();
        }
        HashBasedTable $$1 = HashBasedTable.create();
        for (Map.Entry $$2 : this.b.entrySet()) {
            dde $$3 = (dde)$$2.getKey();
            for (Comparable $$4 : $$3.a()) {
                if ($$4.equals($$2.getValue())) continue;
                $$1.put((Object)$$3, (Object)$$4, $$0.get(this.c($$3, $$4)));
            }
        }
        this.g = $$1.isEmpty() ? $$1 : ArrayTable.create((Table)$$1);
    }

    private Map<dde<?>, Comparable<?>> c(dde<?> $$0, Comparable<?> $$1) {
        HashMap $$2 = Maps.newHashMap(this.b);
        $$2.put($$0, $$1);
        return $$2;
    }

    public ImmutableMap<dde<?>, Comparable<?>> C() {
        return this.b;
    }

    protected static <O, S extends dcd<O, S>> Codec<S> a(Codec<O> $$02, Function<O, S> $$1) {
        return $$02.dispatch(c, $$0 -> $$0.e, $$12 -> {
            dcd $$2 = (dcd)$$1.apply($$12);
            if ($$2.C().isEmpty()) {
                return Codec.unit((Object)$$2);
            }
            return $$2.f.codec().optionalFieldOf(d).xmap($$1 -> $$1.orElse($$2), Optional::of).codec();
        });
    }
}

