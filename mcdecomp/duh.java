/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class duh
extends dsa {
    private static final String[] e = new String[]{"ruined_portal/portal_1", "ruined_portal/portal_2", "ruined_portal/portal_3", "ruined_portal/portal_4", "ruined_portal/portal_5", "ruined_portal/portal_6", "ruined_portal/portal_7", "ruined_portal/portal_8", "ruined_portal/portal_9", "ruined_portal/portal_10"};
    private static final String[] f = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
    private static final float g = 0.05f;
    private static final int h = 15;
    private final List<a> i;
    public static final Codec<duh> d = RecordCodecBuilder.create($$02 -> $$02.group(duh.a($$02), (App)aoi.a(duh$a.a.listOf()).fieldOf("setups").forGetter($$0 -> $$0.i)).apply((Applicative)$$02, duh::new));

    public duh(dsa.c $$0, List<a> $$1) {
        super($$0);
        this.i = $$1;
    }

    public duh(dsa.c $$0, a $$1) {
        this($$0, List.of($$1));
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        acq $$102;
        dug.a $$1 = new dug.a();
        dij $$2 = $$0.f();
        a $$3 = null;
        if (this.i.size() > 1) {
            float $$4 = 0.0f;
            for (a a2 : this.i) {
                $$4 += a2.h();
            }
            float $$6 = $$2.i();
            for (a $$7 : this.i) {
                if (!(($$6 -= $$7.h() / $$4) < 0.0f)) continue;
                $$3 = $$7;
                break;
            }
        } else {
            $$3 = this.i.get(0);
        }
        if ($$3 == null) {
            throw new IllegalStateException();
        }
        a $$8 = $$3;
        $$1.d = duh.a($$2, $$8.b());
        $$1.c = $$8.c();
        $$1.e = $$8.d();
        $$1.f = $$8.e();
        $$1.g = $$8.g();
        if ($$2.i() < 0.05f) {
            acq $$9 = new acq(f[$$2.a(f.length)]);
        } else {
            $$102 = new acq(e[$$2.a(e.length)]);
        }
        dvt dvt2 = $$0.e().a($$102);
        cvz $$12 = ac.a(cvz.values(), (apf)$$2);
        cui $$13 = $$2.i() < 0.5f ? cui.a : cui.c;
        gu $$14 = new gu(dvt2.a().u() / 2, 0, dvt2.a().w() / 2);
        ddy $$15 = $$0.b();
        cmo $$16 = $$0.i();
        dhy $$17 = $$0.d();
        gu $$18 = $$0.h().l();
        drs $$19 = dvt2.a($$18, $$12, $$14, $$13);
        gu $$20 = $$19.f();
        int $$21 = $$15.a($$20.u(), $$20.w(), dug.a($$8.a()), $$16, $$17) - 1;
        int $$22 = duh.a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
        gu $$23 = new gu($$18.u(), $$22, $$18.w());
        return Optional.of(new dsa.b($$23, $$10 -> {
            if ($$8.f()) {
                $$1.b = duh.a($$23, $$0.b().c().getNoiseBiome(hq.a($$23.u()), hq.a($$23.v()), hq.a($$23.w()), $$17.b()));
            }
            $$10.a(new dug($$0.e(), $$23, $$8.a(), $$1, $$102, $$11, $$12, $$13, $$14));
        }));
    }

    private static boolean a(dij $$0, float $$1) {
        if ($$1 == 0.0f) {
            return false;
        }
        if ($$1 == 1.0f) {
            return true;
        }
        return $$0.i() < $$1;
    }

    private static boolean a(gu $$0, he<cnk> $$1) {
        return $$1.a().b($$0);
    }

    private static int a(apf $$0, ddy $$1, dug.b $$2, boolean $$32, int $$4, int $$5, drs $$6, cmo $$7, dhy $$8) {
        int $$22;
        int $$9 = $$7.C_() + 15;
        if ($$2 == dug.b.f) {
            if ($$32) {
                int $$10 = apa.b($$0, 32, 100);
            } else if ($$0.i() < 0.5f) {
                int $$11 = apa.b($$0, 27, 29);
            } else {
                int $$12 = apa.b($$0, 29, 100);
            }
        } else if ($$2 == dug.b.d) {
            int $$13 = $$4 - $$5;
            int $$14 = duh.a($$0, 70, $$13);
        } else if ($$2 == dug.b.e) {
            int $$15 = $$4 - $$5;
            int $$16 = duh.a($$0, $$9, $$15);
        } else if ($$2 == dug.b.b) {
            int $$17 = $$4 - $$5 + apa.b($$0, 2, 8);
        } else {
            int $$18 = $$4;
        }
        ImmutableList $$19 = ImmutableList.of((Object)new gu($$6.g(), 0, $$6.i()), (Object)new gu($$6.j(), 0, $$6.i()), (Object)new gu($$6.g(), 0, $$6.l()), (Object)new gu($$6.j(), 0, $$6.l()));
        List $$20 = $$19.stream().map($$3 -> $$1.a($$3.u(), $$3.w(), $$7, $$8)).collect(Collectors.toList());
        dhk.a $$21 = $$2 == dug.b.c ? dhk.a.c : dhk.a.a;
        block0: for ($$22 = $$18; $$22 > $$9; --$$22) {
            int $$23 = 0;
            for (cmy $$24 : $$20) {
                dcb $$25 = $$24.a($$22);
                if (!$$21.e().test($$25) || ++$$23 != 3) continue;
                break block0;
            }
        }
        return $$22;
    }

    private static int a(apf $$0, int $$1, int $$2) {
        if ($$1 < $$2) {
            return apa.b($$0, $$1, $$2);
        }
        return $$2;
    }

    @Override
    public dsj<?> e() {
        return dsj.l;
    }

    public static final class a
    extends Record {
        private final dug.b b;
        private final float c;
        private final float d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final float i;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dug.b.g.fieldOf("placement").forGetter(a::a), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("air_pocket_probability").forGetter(a::b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("mossiness").forGetter(a::c), (App)Codec.BOOL.fieldOf("overgrown").forGetter(a::d), (App)Codec.BOOL.fieldOf("vines").forGetter(a::e), (App)Codec.BOOL.fieldOf("can_be_cold").forGetter(a::f), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(a::g), (App)aoi.k.fieldOf("weight").forGetter(a::h)).apply((Applicative)$$0, a::new));

        public a(dug.b $$0, float $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, float $$7) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
            this.i = $$7;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public dug.b a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public float c() {
            return this.d;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public boolean f() {
            return this.g;
        }

        public boolean g() {
            return this.h;
        }

        public float h() {
            return this.i;
        }
    }
}

