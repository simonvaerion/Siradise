/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class kw
implements kt {
    private final cpn a;
    private final List<kz> b;
    private final Set<dde<?>> c = Sets.newHashSet();
    private final List<kx> d = Lists.newArrayList();

    private kw(cpn $$0, List<kz> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public kw a(kx $$02) {
        $$02.b().forEach($$0 -> {
            if (this.a.l().a($$0.f()) != $$0) {
                throw new IllegalStateException("Property " + $$0 + " is not defined for block " + this.a);
            }
            if (!this.c.add((dde<?>)$$0)) {
                throw new IllegalStateException("Values of property " + $$0 + " already defined for block " + this.a);
            }
        });
        this.d.add($$02);
        return this;
    }

    public JsonElement b() {
        Stream<Object> $$0 = Stream.of(Pair.of((Object)ky.a(), this.b));
        for (kx $$13 : this.d) {
            Map<ky, List<kz>> $$2 = $$13.a();
            $$0 = $$0.flatMap($$12 -> $$2.entrySet().stream().map($$1 -> {
                ky $$2 = ((ky)$$12.getFirst()).a((ky)$$1.getKey());
                List<kz> $$3 = kw.a((List)$$12.getSecond(), (List)$$1.getValue());
                return Pair.of((Object)$$2, $$3);
            }));
        }
        TreeMap $$3 = new TreeMap();
        $$0.forEach($$1 -> $$3.put(((ky)$$1.getFirst()).b(), kz.a((List)$$1.getSecond())));
        JsonObject $$4 = new JsonObject();
        $$4.add("variants", (JsonElement)ac.a(new JsonObject(), (T $$1) -> $$3.forEach((arg_0, arg_1) -> ((JsonObject)$$1).add(arg_0, arg_1))));
        return $$4;
    }

    private static List<kz> a(List<kz> $$0, List<kz> $$1) {
        ImmutableList.Builder $$2 = ImmutableList.builder();
        $$0.forEach($$22 -> $$1.forEach($$2 -> $$2.add((Object)kz.a($$22, $$2))));
        return $$2.build();
    }

    @Override
    public cpn a() {
        return this.a;
    }

    public static kw a(cpn $$0) {
        return new kw($$0, (List<kz>)ImmutableList.of((Object)kz.a()));
    }

    public static kw a(cpn $$0, kz $$1) {
        return new kw($$0, (List<kz>)ImmutableList.of((Object)$$1));
    }

    public static kw a(cpn $$0, kz ... $$1) {
        return new kw($$0, (List<kz>)ImmutableList.copyOf((Object[])$$1));
    }

    @Override
    public /* synthetic */ Object get() {
        return this.b();
    }
}

