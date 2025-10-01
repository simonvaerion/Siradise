/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class bbk {
    private final a a;
    private final List<Pair<b, a>> b;
    private final Duration c;

    public bbk(Duration $$0, List<Pair<b, a>> $$1) {
        this.c = $$0;
        this.a = $$1.stream().map(Pair::getSecond).reduce(a::a).orElseGet(() -> new a(0L, 0L));
        this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, bbk$a.c)).limit(10L).toList();
    }

    public double a() {
        return (double)this.a.a / (double)this.c.getSeconds();
    }

    public double b() {
        return (double)this.a.b / (double)this.c.getSeconds();
    }

    public long c() {
        return this.a.a;
    }

    public long d() {
        return this.a.b;
    }

    public List<Pair<b, a>> e() {
        return this.b;
    }

    public static final class a
    extends Record {
        final long a;
        final long b;
        static final Comparator<a> c = Comparator.comparing(a::b).thenComparing(a::a).reversed();

        public a(long $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        a a(a $$0) {
            return new a(this.a + $$0.a, this.b + $$0.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this, $$0);
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }

    public record b(up a, int b, int c) {
        private final up a;
        private final int b;
        private final int c;
        private static final Map<b, String> d;

        public String a() {
            return d.getOrDefault(this, "unknown");
        }

        public static b a(RecordedEvent $$0) {
            return new b($$0.getEventType().getName().equals("minecraft.PacketSent") ? up.b : up.a, $$0.getInt("protocolId"), $$0.getInt("packetId"));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "direction;protocolId;packetId", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "direction;protocolId;packetId", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "direction;protocolId;packetId", "a", "b", "c"}, this, $$0);
        }

        public up b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        static {
            ImmutableMap.Builder $$0 = ImmutableMap.builder();
            for (se $$1 : se.values()) {
                for (up $$2 : up.values()) {
                    Int2ObjectMap<Class<? extends uo<?>>> $$32 = $$1.b($$2);
                    $$32.forEach(($$3, $$4) -> $$0.put((Object)new b($$2, $$1.a(), (int)$$3), (Object)$$4.getSimpleName()));
                }
            }
            d = $$0.build();
        }
    }
}

