/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anm<T> {
    private static final Logger a = LogUtils.getLogger();
    final Function<acq, Optional<? extends T>> b;
    private final String c;

    public anm(Function<acq, Optional<? extends T>> $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public Map<acq, List<a>> a(akx $$02) {
        HashMap $$1 = Maps.newHashMap();
        acj $$22 = acj.a(this.c);
        for (Map.Entry<acq, List<akv>> $$3 : $$22.b($$02).entrySet()) {
            acq $$4 = $$3.getKey();
            acq $$5 = $$22.b($$4);
            for (akv $$6 : $$3.getValue()) {
                try {
                    BufferedReader $$7 = $$6.e();
                    try {
                        JsonElement $$8 = JsonParser.parseReader((Reader)$$7);
                        List $$9 = $$1.computeIfAbsent($$5, $$0 -> new ArrayList());
                        ank $$10 = (ank)ank.a.parse(new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)$$8)).getOrThrow(false, arg_0 -> ((Logger)a).error(arg_0));
                        if ($$10.b()) {
                            $$9.clear();
                        }
                        String $$11 = $$6.b();
                        $$10.a().forEach($$2 -> $$9.add(new a((anj)$$2, $$11)));
                    }
                    finally {
                        if ($$7 == null) continue;
                        ((Reader)$$7).close();
                    }
                }
                catch (Exception $$12) {
                    a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), $$12});
                }
            }
        }
        return $$1;
    }

    private Either<Collection<a>, Collection<T>> a(anj.a<T> $$0, List<a> $$1) {
        ImmutableSet.Builder $$2 = ImmutableSet.builder();
        ArrayList<a> $$3 = new ArrayList<a>();
        for (a $$4 : $$1) {
            if ($$4.a().a($$0, arg_0 -> ((ImmutableSet.Builder)$$2).add(arg_0))) continue;
            $$3.add($$4);
        }
        return $$3.isEmpty() ? Either.right((Object)$$2.build()) : Either.left($$3);
    }

    public Map<acq, Collection<T>> a(Map<acq, List<a>> $$0) {
        final HashMap $$12 = Maps.newHashMap();
        anj.a $$23 = new anj.a<T>(){

            @Override
            @Nullable
            public T a(acq $$0) {
                return anm.this.b.apply($$0).orElse(null);
            }

            @Override
            @Nullable
            public Collection<T> b(acq $$0) {
                return (Collection)$$12.get($$0);
            }
        };
        aof<acq, b> $$32 = new aof<acq, b>();
        $$0.forEach(($$1, $$2) -> $$32.a((acq)$$1, new b((List<a>)$$2)));
        $$32.a((K $$22, V $$3) -> this.a($$23, $$3.a).ifLeft($$1 -> a.error("Couldn't load tag {} as it is missing following references: {}", $$22, (Object)$$1.stream().map(Objects::toString).collect(Collectors.joining(", ")))).ifRight($$2 -> $$12.put($$22, $$2)));
        return $$12;
    }

    public Map<acq, Collection<T>> b(akx $$0) {
        return this.a(this.a($$0));
    }

    public static final class a
    extends Record {
        final anj a;
        private final String b;

        public a(anj $$0, String $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public String toString() {
            return this.a + " (from " + this.b + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entry;source", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entry;source", "a", "b"}, this, $$0);
        }

        public anj a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    static final class b
    extends Record
    implements aof.a<acq> {
        final List<a> a;

        b(List<a> $$0) {
            this.a = $$0;
        }

        @Override
        public void a(Consumer<acq> $$0) {
            this.a.forEach($$1 -> $$1.a.a($$0));
        }

        @Override
        public void b(Consumer<acq> $$0) {
            this.a.forEach($$1 -> $$1.a.b($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entries", "a"}, this, $$0);
        }

        public List<a> a() {
            return this.a;
        }
    }
}

