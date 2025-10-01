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
import java.util.List;

public final class dhp
extends Record {
    private final dhs j;
    private final dcb k;
    private final dcb l;
    private final dhq m;
    private final dib.o n;
    private final List<cnt.d> o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    public static final Codec<dhp> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dhs.a.fieldOf("noise").forGetter(dhp::f), (App)dcb.b.fieldOf("default_block").forGetter(dhp::g), (App)dcb.b.fieldOf("default_fluid").forGetter(dhp::h), (App)dhq.a.fieldOf("noise_router").forGetter(dhp::i), (App)dib.o.b.fieldOf("surface_rule").forGetter(dhp::j), (App)cnt.d.a.listOf().fieldOf("spawn_target").forGetter(dhp::k), (App)Codec.INT.fieldOf("sea_level").forGetter(dhp::l), (App)Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dhp::a), (App)Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dhp::b), (App)Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dhp::c), (App)Codec.BOOL.fieldOf("legacy_random_source").forGetter(dhp::n)).apply((Applicative)$$0, dhp::new));
    public static final Codec<he<dhp>> b = acm.a(jc.aw, a);
    public static final acp<dhp> c = acp.a(jc.aw, new acq("overworld"));
    public static final acp<dhp> d = acp.a(jc.aw, new acq("large_biomes"));
    public static final acp<dhp> e = acp.a(jc.aw, new acq("amplified"));
    public static final acp<dhp> f = acp.a(jc.aw, new acq("nether"));
    public static final acp<dhp> g = acp.a(jc.aw, new acq("end"));
    public static final acp<dhp> h = acp.a(jc.aw, new acq("caves"));
    public static final acp<dhp> i = acp.a(jc.aw, new acq("floating_islands"));

    public dhp(dhs $$0, dcb $$1, dcb $$2, dhq $$3, dib.o $$4, List<cnt.d> $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
        this.j = $$0;
        this.k = $$1;
        this.l = $$2;
        this.m = $$3;
        this.n = $$4;
        this.o = $$5;
        this.p = $$6;
        this.q = $$7;
        this.r = $$8;
        this.s = $$9;
        this.t = $$10;
    }

    @Deprecated
    public boolean a() {
        return this.q;
    }

    public boolean b() {
        return this.r;
    }

    public boolean c() {
        return this.s;
    }

    public dij.a d() {
        return this.t ? dij.a.a : dij.a.b;
    }

    public static void a(nm<dhp> $$0) {
        $$0.a(c, dhp.a($$0, false, false));
        $$0.a(d, dhp.a($$0, false, true));
        $$0.a(e, dhp.a($$0, true, false));
        $$0.a(f, dhp.c($$0));
        $$0.a(g, dhp.b($$0));
        $$0.a(h, dhp.d($$0));
        $$0.a(i, dhp.e($$0));
    }

    private static dhp b(nm<?> $$0) {
        return new dhp(dhs.d, cpo.fz.n(), cpo.a.n(), dhr.a($$0.a(jc.at)), nz.c(), List.of(), 0, true, false, false, true);
    }

    private static dhp c(nm<?> $$0) {
        return new dhp(dhs.c, cpo.dW.n(), cpo.H.n(), dhr.a($$0.a(jc.at), $$0.a(jc.ax)), nz.b(), List.of(), 32, false, false, false, true);
    }

    private static dhp a(nm<?> $$0, boolean $$1, boolean $$2) {
        return new dhp(dhs.b, cpo.b.n(), cpo.G.n(), dhr.a($$0.a(jc.at), $$0.a(jc.ax), $$2, $$1), nz.a(), new coa().a(), 63, false, true, true, false);
    }

    private static dhp d(nm<?> $$0) {
        return new dhp(dhs.e, cpo.b.n(), cpo.G.n(), dhr.b($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, true, true), List.of(), 32, false, false, false, true);
    }

    private static dhp e(nm<?> $$0) {
        return new dhp(dhs.f, cpo.b.n(), cpo.G.n(), dhr.c($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, false, false), List.of(), -64, false, false, false, true);
    }

    public static dhp e() {
        return new dhp(dhs.b, cpo.b.n(), cpo.a.n(), dhr.a(), nz.d(), List.of(), 63, true, false, false, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dhp.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dhp.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dhp.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"}, this, $$0);
    }

    public dhs f() {
        return this.j;
    }

    public dcb g() {
        return this.k;
    }

    public dcb h() {
        return this.l;
    }

    public dhq i() {
        return this.m;
    }

    public dib.o j() {
        return this.n;
    }

    public List<cnt.d> k() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    public boolean m() {
        return this.r;
    }

    public boolean n() {
        return this.t;
    }
}

