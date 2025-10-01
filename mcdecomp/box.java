/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class box {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 2;
    private final Map<UUID, a> c = Maps.newHashMap();

    @aqa
    public Map<UUID, Object2IntMap<boy>> a() {
        HashMap $$0 = Maps.newHashMap();
        this.c.keySet().forEach($$1 -> {
            a $$2 = this.c.get($$1);
            $$0.put($$1, $$2.a);
        });
        return $$0;
    }

    public void b() {
        Iterator<a> $$0 = this.c.values().iterator();
        while ($$0.hasNext()) {
            a $$1 = $$0.next();
            $$1.a();
            if (!$$1.b()) continue;
            $$0.remove();
        }
    }

    private Stream<b> c() {
        return this.c.entrySet().stream().flatMap($$0 -> ((a)$$0.getValue()).a((UUID)$$0.getKey()));
    }

    private Collection<b> a(apf $$0, int $$1) {
        List<b> $$2 = this.c().toList();
        if ($$2.isEmpty()) {
            return Collections.emptyList();
        }
        int[] $$3 = new int[$$2.size()];
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$2.size(); ++$$5) {
            b $$6 = $$2.get($$5);
            $$3[$$5] = ($$4 += Math.abs($$6.a())) - 1;
        }
        Set $$7 = Sets.newIdentityHashSet();
        for (int $$8 = 0; $$8 < $$1; ++$$8) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
        }
        return $$7;
    }

    private a a(UUID $$02) {
        return this.c.computeIfAbsent($$02, $$0 -> new a());
    }

    public void a(box $$02, apf $$1, int $$2) {
        Collection<b> $$3 = $$02.a($$1, $$2);
        $$3.forEach($$0 -> {
            int $$1 = $$0.e - $$0.d.m;
            if ($$1 >= 2) {
                this.a((UUID)$$0.c).a.mergeInt((Object)$$0.d, $$1, box::a);
            }
        });
    }

    public int a(UUID $$0, Predicate<boy> $$1) {
        a $$2 = this.c.get($$0);
        return $$2 != null ? $$2.a($$1) : 0;
    }

    public long a(boy $$0, DoublePredicate $$1) {
        return this.c.values().stream().filter($$2 -> $$1.test($$2.a.getOrDefault((Object)$$0, 0) * $$1.j)).count();
    }

    public void a(UUID $$0, boy $$12, int $$22) {
        a $$3 = this.a($$0);
        $$3.a.mergeInt((Object)$$12, $$22, ($$1, $$2) -> this.a($$12, $$1, $$2));
        $$3.a($$12);
        if ($$3.b()) {
            this.c.remove($$0);
        }
    }

    public void b(UUID $$0, boy $$1, int $$2) {
        this.a($$0, $$1, -$$2);
    }

    public void a(UUID $$0, boy $$1) {
        a $$2 = this.c.get($$0);
        if ($$2 != null) {
            $$2.b($$1);
            if ($$2.b()) {
                this.c.remove($$0);
            }
        }
    }

    public void a(boy $$0) {
        Iterator<a> $$1 = this.c.values().iterator();
        while ($$1.hasNext()) {
            a $$2 = $$1.next();
            $$2.b($$0);
            if (!$$2.b()) continue;
            $$1.remove();
        }
    }

    public <T> T a(DynamicOps<T> $$02) {
        return (T)box$b.b.encodeStart($$02, this.c().toList()).resultOrPartial($$0 -> b.warn("Failed to serialize gossips: {}", $$0)).orElseGet(() -> $$02.emptyList());
    }

    public void a(Dynamic<?> $$02) {
        box$b.b.decode($$02).resultOrPartial($$0 -> b.warn("Failed to deserialize gossips: {}", $$0)).stream().flatMap($$0 -> ((List)$$0.getFirst()).stream()).forEach($$0 -> this.a((UUID)$$0.c).a.put((Object)$$0.d, $$0.e));
    }

    private static int a(int $$0, int $$1) {
        return Math.max($$0, $$1);
    }

    private int a(boy $$0, int $$1, int $$2) {
        int $$3 = $$1 + $$2;
        return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
    }

    static class a {
        final Object2IntMap<boy> a = new Object2IntOpenHashMap();

        a() {
        }

        public int a(Predicate<boy> $$02) {
            return this.a.object2IntEntrySet().stream().filter($$1 -> $$02.test((boy)$$1.getKey())).mapToInt($$0 -> $$0.getIntValue() * ((boy)$$0.getKey()).j).sum();
        }

        public Stream<b> a(UUID $$0) {
            return this.a.object2IntEntrySet().stream().map($$1 -> new b($$0, (boy)$$1.getKey(), $$1.getIntValue()));
        }

        public void a() {
            ObjectIterator $$0 = this.a.object2IntEntrySet().iterator();
            while ($$0.hasNext()) {
                Object2IntMap.Entry $$1 = (Object2IntMap.Entry)$$0.next();
                int $$2 = $$1.getIntValue() - ((boy)$$1.getKey()).l;
                if ($$2 < 2) {
                    $$0.remove();
                    continue;
                }
                $$1.setValue($$2);
            }
        }

        public boolean b() {
            return this.a.isEmpty();
        }

        public void a(boy $$0) {
            int $$1 = this.a.getInt((Object)$$0);
            if ($$1 > $$0.k) {
                this.a.put((Object)$$0, $$0.k);
            }
            if ($$1 < 2) {
                this.b($$0);
            }
        }

        public void b(boy $$0) {
            this.a.removeInt((Object)$$0);
        }
    }

    static final class b
    extends Record {
        final UUID c;
        final boy d;
        final int e;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hy.a.fieldOf("Target").forGetter(b::b), (App)boy.n.fieldOf("Type").forGetter(b::c), (App)aoi.j.fieldOf("Value").forGetter(b::d)).apply((Applicative)$$0, b::new));
        public static final Codec<List<b>> b = a.listOf();

        b(UUID $$0, boy $$1, int $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public int a() {
            return this.e * this.d.j;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "target;type;value", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "target;type;value", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "target;type;value", "c", "d", "e"}, this, $$0);
        }

        public UUID b() {
            return this.c;
        }

        public boy c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }
    }
}

