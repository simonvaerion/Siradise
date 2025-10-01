/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public final class dfk
extends Record {
    private final OptionalLong k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final double p;
    private final boolean q;
    private final boolean r;
    private final int s;
    private final int t;
    private final int u;
    private final anl<cpn> v;
    private final acq w;
    private final float x;
    private final a y;
    public static final int a = gu.c;
    public static final int b = 16;
    public static final int c = (1 << a) - 32;
    public static final int d = (c >> 1) - 1;
    public static final int e = d - c + 1;
    public static final int f = d << 4;
    public static final int g = e << 4;
    public static final Codec<dfk> h = aoi.c(RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.a((MapCodec<Optional<Long>>)Codec.LONG.optionalFieldOf("fixed_time")).forGetter(dfk::f), (App)Codec.BOOL.fieldOf("has_skylight").forGetter(dfk::g), (App)Codec.BOOL.fieldOf("has_ceiling").forGetter(dfk::h), (App)Codec.BOOL.fieldOf("ultrawarm").forGetter(dfk::i), (App)Codec.BOOL.fieldOf("natural").forGetter(dfk::j), (App)Codec.doubleRange((double)1.0E-5f, (double)3.0E7).fieldOf("coordinate_scale").forGetter(dfk::k), (App)Codec.BOOL.fieldOf("bed_works").forGetter(dfk::l), (App)Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dfk::m), (App)Codec.intRange((int)e, (int)d).fieldOf("min_y").forGetter(dfk::n), (App)Codec.intRange((int)16, (int)c).fieldOf("height").forGetter(dfk::o), (App)Codec.intRange((int)0, (int)c).fieldOf("logical_height").forGetter(dfk::p), (App)anl.b(jc.e).fieldOf("infiniburn").forGetter(dfk::q), (App)acq.a.fieldOf("effects").orElse((Object)dfi.e).forGetter(dfk::r), (App)Codec.FLOAT.fieldOf("ambient_light").forGetter(dfk::s), (App)dfk$a.a.forGetter(dfk::t)).apply((Applicative)$$0, dfk::new)));
    private static final int z = 8;
    public static final float[] i = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public static final Codec<he<dfk>> j = acm.a(jc.au, h);

    public dfk(OptionalLong $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, double $$5, boolean $$6, boolean $$7, int $$8, int $$9, int $$10, anl<cpn> $$11, acq $$12, float $$13, a $$14) {
        if ($$9 < 16) {
            throw new IllegalStateException("height has to be at least 16");
        }
        if ($$8 + $$9 > d + 1) {
            throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
        }
        if ($$10 > $$9) {
            throw new IllegalStateException("logical_height cannot be higher than height");
        }
        if ($$9 % 16 != 0) {
            throw new IllegalStateException("height has to be multiple of 16");
        }
        if ($$8 % 16 != 0) {
            throw new IllegalStateException("min_y has to be a multiple of 16");
        }
        this.k = $$0;
        this.l = $$1;
        this.m = $$2;
        this.n = $$3;
        this.o = $$4;
        this.p = $$5;
        this.q = $$6;
        this.r = $$7;
        this.s = $$8;
        this.t = $$9;
        this.u = $$10;
        this.v = $$11;
        this.w = $$12;
        this.x = $$13;
        this.y = $$14;
    }

    @Deprecated
    public static DataResult<acp<cmm>> a(Dynamic<?> $$0) {
        Optional $$1 = $$0.asNumber().result();
        if ($$1.isPresent()) {
            int $$2 = ((Number)$$1.get()).intValue();
            if ($$2 == -1) {
                return DataResult.success(cmm.i);
            }
            if ($$2 == 0) {
                return DataResult.success(cmm.h);
            }
            if ($$2 == 1) {
                return DataResult.success(cmm.j);
            }
        }
        return cmm.g.parse($$0);
    }

    public static double a(dfk $$0, dfk $$1) {
        double $$2 = $$0.k();
        double $$3 = $$1.k();
        return $$2 / $$3;
    }

    public static Path a(acp<cmm> $$0, Path $$1) {
        if ($$0 == cmm.h) {
            return $$1;
        }
        if ($$0 == cmm.j) {
            return $$1.resolve("DIM1");
        }
        if ($$0 == cmm.i) {
            return $$1.resolve("DIM-1");
        }
        return $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
    }

    public boolean a() {
        return this.k.isPresent();
    }

    public float a(long $$0) {
        double $$1 = apa.e((double)this.k.orElse($$0) / 24000.0 - 0.25);
        double $$2 = 0.5 - Math.cos($$1 * Math.PI) / 2.0;
        return (float)($$1 * 2.0 + $$2) / 3.0f;
    }

    public int b(long $$0) {
        return (int)($$0 / 24000L % 8L + 8L) % 8;
    }

    public boolean b() {
        return this.y.a();
    }

    public boolean c() {
        return this.y.b();
    }

    public bdc d() {
        return this.y.c();
    }

    public int e() {
        return this.y.d();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfk.class, "fixedTime;hasSkyLight;hasCeiling;ultraWarm;natural;coordinateScale;bedWorks;respawnAnchorWorks;minY;height;logicalHeight;infiniburn;effectsLocation;ambientLight;monsterSettings", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfk.class, "fixedTime;hasSkyLight;hasCeiling;ultraWarm;natural;coordinateScale;bedWorks;respawnAnchorWorks;minY;height;logicalHeight;infiniburn;effectsLocation;ambientLight;monsterSettings", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfk.class, "fixedTime;hasSkyLight;hasCeiling;ultraWarm;natural;coordinateScale;bedWorks;respawnAnchorWorks;minY;height;logicalHeight;infiniburn;effectsLocation;ambientLight;monsterSettings", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"}, this, $$0);
    }

    public OptionalLong f() {
        return this.k;
    }

    public boolean g() {
        return this.l;
    }

    public boolean h() {
        return this.m;
    }

    public boolean i() {
        return this.n;
    }

    public boolean j() {
        return this.o;
    }

    public double k() {
        return this.p;
    }

    public boolean l() {
        return this.q;
    }

    public boolean m() {
        return this.r;
    }

    public int n() {
        return this.s;
    }

    public int o() {
        return this.t;
    }

    public int p() {
        return this.u;
    }

    public anl<cpn> q() {
        return this.v;
    }

    public acq r() {
        return this.w;
    }

    public float s() {
        return this.x;
    }

    public a t() {
        return this.y;
    }

    public static final class a
    extends Record {
        private final boolean b;
        private final boolean c;
        private final bdc d;
        private final int e;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.fieldOf("piglin_safe").forGetter(a::a), (App)Codec.BOOL.fieldOf("has_raids").forGetter(a::b), (App)bdc.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(a::c), (App)Codec.intRange((int)0, (int)15).fieldOf("monster_spawn_block_light_limit").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(boolean $$0, boolean $$1, bdc $$2, int $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "piglinSafe;hasRaids;monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "piglinSafe;hasRaids;monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "piglinSafe;hasRaids;monsterSpawnLightTest;monsterSpawnBlockLightLimit", "b", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public bdc c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }
    }
}

