/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnw {
    private static final Logger d = LogUtils.getLogger();
    private static final float e = 0.1f;
    public static final bcl<c> a = bcl.c();
    public static final cnw b = new a().a();
    public static final MapCodec<cnw> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)0.9999999f).optionalFieldOf("creature_spawn_probability", (Object)Float.valueOf(0.1f)).forGetter($$0 -> Float.valueOf($$0.f)), (App)Codec.simpleMap(bgc.i, (Codec)bcl.c(cnw$c.a).promotePartial(ac.a("Spawn data: ", arg_0 -> ((Logger)d).error(arg_0))), (Keyable)apr.a(bgc.values())).fieldOf("spawners").forGetter($$0 -> $$0.g), (App)Codec.simpleMap(jb.h.q(), cnw$b.a, jb.h).fieldOf("spawn_costs").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, cnw::new));
    private final float f;
    private final Map<bgc, bcl<c>> g;
    private final Map<bfn<?>, b> h;

    cnw(float $$0, Map<bgc, bcl<c>> $$1, Map<bfn<?>, b> $$2) {
        this.f = $$0;
        this.g = ImmutableMap.copyOf($$1);
        this.h = ImmutableMap.copyOf($$2);
    }

    public bcl<c> a(bgc $$0) {
        return this.g.getOrDefault($$0, a);
    }

    @Nullable
    public b a(bfn<?> $$0) {
        return this.h.get($$0);
    }

    public float a() {
        return this.f;
    }

    public static final class b
    extends Record {
        private final double b;
        private final double c;
        public static final Codec<b> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0 -> $$0.b), (App)Codec.DOUBLE.fieldOf("charge").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, b::new));

        public b(double $$0, double $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "energyBudget;charge", "b", "c"}, this, $$0);
        }

        public double a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }
    }

    public static class c
    extends bcj.a {
        public static final Codec<c> a = aoi.a(RecordCodecBuilder.create($$02 -> $$02.group((App)jb.h.q().fieldOf("type").forGetter($$0 -> $$0.b), (App)bci.a.fieldOf("weight").forGetter(bcj.a::a), (App)aoi.j.fieldOf("minCount").forGetter($$0 -> $$0.c), (App)aoi.j.fieldOf("maxCount").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, c::new)), $$0 -> {
            if ($$0.c > $$0.d) {
                return DataResult.error(() -> "minCount needs to be smaller or equal to maxCount");
            }
            return DataResult.success((Object)$$0);
        });
        public final bfn<?> b;
        public final int c;
        public final int d;

        public c(bfn<?> $$0, int $$1, int $$2, int $$3) {
            this($$0, bci.a($$1), $$2, $$3);
        }

        public c(bfn<?> $$0, bci $$1, int $$2, int $$3) {
            super($$1);
            this.b = $$0.f() == bgc.h ? bfn.av : $$0;
            this.c = $$2;
            this.d = $$3;
        }

        public String toString() {
            return bfn.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
        }
    }

    public static class a {
        private final Map<bgc, List<c>> a = (Map)Stream.of(bgc.values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
        private final Map<bfn<?>, b> b = Maps.newLinkedHashMap();
        private float c = 0.1f;

        public a a(bgc $$0, c $$1) {
            this.a.get($$0).add($$1);
            return this;
        }

        public a a(bfn<?> $$0, double $$1, double $$2) {
            this.b.put($$0, new b($$2, $$1));
            return this;
        }

        public a a(float $$0) {
            this.c = $$0;
            return this;
        }

        public cnw a() {
            return new cnw(this.c, (Map)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> bcl.a((List)$$0.getValue()))), (Map<bfn<?>, b>)ImmutableMap.copyOf(this.b));
        }
    }
}

