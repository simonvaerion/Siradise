/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class dhq
extends Record {
    private final dhd b;
    private final dhd c;
    private final dhd d;
    private final dhd e;
    private final dhd f;
    private final dhd g;
    private final dhd h;
    private final dhd i;
    private final dhd j;
    private final dhd k;
    private final dhd l;
    private final dhd m;
    private final dhd n;
    private final dhd o;
    private final dhd p;
    public static final Codec<dhq> a = RecordCodecBuilder.create($$0 -> $$0.group(dhq.a("barrier", dhq::a), dhq.a("fluid_level_floodedness", dhq::b), dhq.a("fluid_level_spread", dhq::c), dhq.a("lava", dhq::d), dhq.a("temperature", dhq::e), dhq.a("vegetation", dhq::f), dhq.a("continents", dhq::g), dhq.a("erosion", dhq::h), dhq.a("depth", dhq::i), dhq.a("ridges", dhq::j), dhq.a("initial_density_without_jaggedness", dhq::k), dhq.a("final_density", dhq::l), dhq.a("vein_toggle", dhq::m), dhq.a("vein_ridged", dhq::n), dhq.a("vein_gap", dhq::o)).apply((Applicative)$$0, dhq::new));

    public dhq(dhd $$0, dhd $$1, dhd $$2, dhd $$3, dhd $$4, dhd $$5, dhd $$6, dhd $$7, dhd $$8, dhd $$9, dhd $$10, dhd $$11, dhd $$12, dhd $$13, dhd $$14) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
        this.m = $$11;
        this.n = $$12;
        this.o = $$13;
        this.p = $$14;
    }

    private static RecordCodecBuilder<dhq, dhd> a(String $$0, Function<dhq, dhd> $$1) {
        return dhd.d.fieldOf($$0).forGetter($$1);
    }

    public dhq a(dhd.f $$0) {
        return new dhq(this.b.a($$0), this.c.a($$0), this.d.a($$0), this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h.a($$0), this.i.a($$0), this.j.a($$0), this.k.a($$0), this.l.a($$0), this.m.a($$0), this.n.a($$0), this.o.a($$0), this.p.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dhq.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;initialDensityWithoutJaggedness;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dhq.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;initialDensityWithoutJaggedness;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dhq.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;initialDensityWithoutJaggedness;finalDensity;veinToggle;veinRidged;veinGap", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this, $$0);
    }

    public dhd a() {
        return this.b;
    }

    public dhd b() {
        return this.c;
    }

    public dhd c() {
        return this.d;
    }

    public dhd d() {
        return this.e;
    }

    public dhd e() {
        return this.f;
    }

    public dhd f() {
        return this.g;
    }

    public dhd g() {
        return this.h;
    }

    public dhd h() {
        return this.i;
    }

    public dhd i() {
        return this.j;
    }

    public dhd j() {
        return this.k;
    }

    public dhd k() {
        return this.l;
    }

    public dhd l() {
        return this.m;
    }

    public dhd m() {
        return this.n;
    }

    public dhd n() {
        return this.o;
    }

    public dhd o() {
        return this.p;
    }
}

