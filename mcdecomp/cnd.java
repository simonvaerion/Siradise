/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class cnd
extends Record {
    private final qr d;
    private final Optional<a> e;
    public static final String a = "entity";
    public static final Codec<cnd> b = RecordCodecBuilder.create($$02 -> $$02.group((App)qr.a.fieldOf(a).forGetter($$0 -> $$0.d), (App)cnd$a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, cnd::new));
    public static final Codec<bch<cnd>> c = bch.a(b);

    public cnd() {
        this(new qr(), Optional.empty());
    }

    public cnd(qr $$0, Optional<a> $$1) {
        if ($$0.e("id")) {
            acq $$2 = acq.a($$0.l("id"));
            if ($$2 != null) {
                $$0.a("id", $$2.toString());
            } else {
                $$0.r("id");
            }
        }
        this.d = $$0;
        this.e = $$1;
    }

    public qr a() {
        return this.d;
    }

    public Optional<a> b() {
        return this.e;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cnd.class, "entityToSpawn;customSpawnRules", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cnd.class, "entityToSpawn;customSpawnRules", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cnd.class, "entityToSpawn;customSpawnRules", "d", "e"}, this, $$0);
    }

    public qr c() {
        return this.d;
    }

    public Optional<a> d() {
        return this.e;
    }

    public static final class a
    extends Record {
        private final aot<Integer> b;
        private final aot<Integer> c;
        private static final aot<Integer> d = new aot<Integer>(0, 15);
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)cnd$a.a("block_light_limit").forGetter($$0 -> $$0.b), (App)cnd$a.a("sky_light_limit").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, a::new));

        public a(aot<Integer> $$0, aot<Integer> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        private static DataResult<aot<Integer>> a(aot<Integer> $$0) {
            if (!d.a($$0)) {
                return DataResult.error(() -> "Light values must be withing range " + d);
            }
            return DataResult.success($$0);
        }

        private static MapCodec<aot<Integer>> a(String $$0) {
            return aoi.a(aot.a.optionalFieldOf($$0, d), a::a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this, $$0);
        }

        public aot<Integer> a() {
            return this.b;
        }

        public aot<Integer> b() {
            return this.c;
        }
    }
}

