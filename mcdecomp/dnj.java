/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dnj
extends Record
implements dms {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final bdc g;
    private final float h;
    public static final Codec<dnj> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.intRange((int)1, (int)32).fieldOf("charge_count").forGetter(dnj::a), (App)Codec.intRange((int)1, (int)500).fieldOf("amount_per_charge").forGetter(dnj::b), (App)Codec.intRange((int)1, (int)64).fieldOf("spread_attempts").forGetter(dnj::c), (App)Codec.intRange((int)0, (int)8).fieldOf("growth_rounds").forGetter(dnj::d), (App)Codec.intRange((int)0, (int)8).fieldOf("spread_rounds").forGetter(dnj::f), (App)bdc.c.fieldOf("extra_rare_growths").forGetter(dnj::g), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("catalyst_chance").forGetter(dnj::h)).apply((Applicative)$$0, dnj::new));

    public dnj(int $$0, int $$1, int $$2, int $$3, int $$4, bdc $$5, float $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnj.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnj.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnj.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public bdc g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }
}

