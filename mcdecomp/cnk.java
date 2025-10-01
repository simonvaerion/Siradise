/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cnk {
    public static final Codec<cnk> a = RecordCodecBuilder.create($$02 -> $$02.group((App)cnk$b.a.forGetter($$0 -> $$0.i), (App)cnq.a.fieldOf("effects").forGetter($$0 -> $$0.l), (App)cnl.b.forGetter($$0 -> $$0.j), (App)cnw.c.forGetter($$0 -> $$0.k)).apply((Applicative)$$02, cnk::new));
    public static final Codec<cnk> b = RecordCodecBuilder.create($$02 -> $$02.group((App)cnk$b.a.forGetter($$0 -> $$0.i), (App)cnq.a.fieldOf("effects").forGetter($$0 -> $$0.l)).apply((Applicative)$$02, ($$0, $$1) -> new cnk((b)$$0, (cnq)$$1, cnl.a, cnw.b)));
    public static final Codec<he<cnk>> c = acm.a(jc.ap, a);
    public static final Codec<hi<cnk>> d = ht.a(jc.ap, a);
    private static final dwj f = new dwj((apf)new dij(new dhl(1234L)), (List<Integer>)ImmutableList.of((Object)0));
    static final dwj g = new dwj((apf)new dij(new dhl(3456L)), (List<Integer>)ImmutableList.of((Object)-2, (Object)-1, (Object)0));
    @Deprecated(forRemoval=true)
    public static final dwj e = new dwj((apf)new dij(new dhl(2345L)), (List<Integer>)ImmutableList.of((Object)0));
    private static final int h = 1024;
    private final b i;
    private final cnl j;
    private final cnw k;
    private final cnq l;
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
        Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(1024, 0.25f){

            protected void rehash(int $$0) {
            }
        };
        $$0.defaultReturnValue(Float.NaN);
        return $$0;
    }));

    cnk(b $$0, cnq $$1, cnl $$2, cnw $$3) {
        this.i = $$0;
        this.j = $$2;
        this.k = $$3;
        this.l = $$1;
    }

    public int a() {
        return this.l.d();
    }

    public cnw b() {
        return this.k;
    }

    public boolean c() {
        return this.i.a();
    }

    public c a(gu $$0) {
        if (!this.c()) {
            return cnk$c.a;
        }
        return this.b($$0) ? cnk$c.c : cnk$c.b;
    }

    private float e(gu $$0) {
        float $$1 = this.i.d.a($$0, this.g());
        if ($$0.v() > 80) {
            float $$2 = (float)(f.a((float)$$0.u() / 8.0f, (float)$$0.w() / 8.0f, false) * 8.0);
            return $$1 - ($$2 + (float)$$0.v() - 80.0f) * 0.05f / 40.0f;
        }
        return $$1;
    }

    @Deprecated
    private float f(gu $$0) {
        long $$1 = $$0.a();
        Long2FloatLinkedOpenHashMap $$2 = this.m.get();
        float $$3 = $$2.get($$1);
        if (!Float.isNaN($$3)) {
            return $$3;
        }
        float $$4 = this.e($$0);
        if ($$2.size() == 1024) {
            $$2.removeFirstFloat();
        }
        $$2.put($$1, $$4);
        return $$4;
    }

    public boolean a(cmp $$0, gu $$1) {
        return this.a($$0, $$1, true);
    }

    public boolean a(cmp $$0, gu $$1, boolean $$2) {
        if (this.c($$1)) {
            return false;
        }
        if ($$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cmv.b, $$1) < 10) {
            dcb $$3 = $$0.a_($$1);
            dxe $$4 = $$0.b_($$1);
            if ($$4.a() == dxf.c && $$3.b() instanceof cua) {
                boolean $$5;
                if (!$$2) {
                    return true;
                }
                boolean bl2 = $$5 = $$0.y($$1.g()) && $$0.y($$1.h()) && $$0.y($$1.e()) && $$0.y($$1.f());
                if (!$$5) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(gu $$0) {
        return !this.c($$0);
    }

    public boolean c(gu $$0) {
        return this.f($$0) >= 0.15f;
    }

    public boolean d(gu $$0) {
        return this.f($$0) > 0.1f;
    }

    public boolean b(cmp $$0, gu $$1) {
        dcb $$2;
        if (this.c($$1)) {
            return false;
        }
        return $$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cmv.b, $$1) < 10 && (($$2 = $$0.a_($$1)).i() || $$2.a(cpo.dN)) && cpo.dN.n().a($$0, $$1);
    }

    public cnl d() {
        return this.j;
    }

    public int e() {
        return this.l.a();
    }

    public int a(double $$0, double $$1) {
        int $$2 = this.l.f().orElseGet(this::p);
        return this.l.g().a($$0, $$1, $$2);
    }

    private int p() {
        double $$0 = apa.a(this.i.c, 0.0f, 1.0f);
        double $$1 = apa.a(this.i.e, 0.0f, 1.0f);
        return cmk.a($$0, $$1);
    }

    public int f() {
        return this.l.e().orElseGet(this::q);
    }

    private int q() {
        double $$0 = apa.a(this.i.c, 0.0f, 1.0f);
        double $$1 = apa.a(this.i.e, 0.0f, 1.0f);
        return cmg.a($$0, $$1);
    }

    public float g() {
        return this.i.c;
    }

    public cnq h() {
        return this.l;
    }

    public int i() {
        return this.l.b();
    }

    public int j() {
        return this.l.c();
    }

    public Optional<cnj> k() {
        return this.l.h();
    }

    public Optional<he<amg>> l() {
        return this.l.i();
    }

    public Optional<cni> m() {
        return this.l.j();
    }

    public Optional<cnh> n() {
        return this.l.k();
    }

    public Optional<ame> o() {
        return this.l.l();
    }

    static final class b
    extends Record {
        private final boolean b;
        final float c;
        final d d;
        final float e;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("has_precipitation").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("temperature").forGetter($$0 -> Float.valueOf($$0.c)), (App)cnk$d.c.optionalFieldOf("temperature_modifier", (Object)cnk$d.a).forGetter($$0 -> $$0.d), (App)Codec.FLOAT.fieldOf("downfall").forGetter($$0 -> Float.valueOf($$0.e))).apply((Applicative)$$02, b::new));

        b(boolean $$0, float $$1, d $$2, float $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "b", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public d c() {
            return this.d;
        }

        public float d() {
            return this.e;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = cnk$c.a();
        }
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class d
    extends Enum<d>
    implements apr {
        public static final /* enum */ d a = new d("none"){

            @Override
            public float a(gu $$0, float $$1) {
                return $$1;
            }
        };
        public static final /* enum */ d b = new d("frozen"){

            @Override
            public float a(gu $$0, float $$1) {
                double $$5;
                double $$3;
                double $$2 = g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
                double $$4 = $$2 + ($$3 = cnk.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false));
                if ($$4 < 0.3 && ($$5 = cnk.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false)) < 0.8) {
                    return 0.2f;
                }
                return $$1;
            }
        };
        private final String d;
        public static final Codec<d> c;
        private static final /* synthetic */ d[] e;

        public static d[] values() {
            return (d[])e.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        public abstract float a(gu var1, float var2);

        d(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b};
        }

        static {
            e = cnk$d.b();
            c = apr.a(d::values);
        }
    }

    public static class a {
        private boolean a = true;
        @Nullable
        private Float b;
        private d c = cnk$d.a;
        @Nullable
        private Float d;
        @Nullable
        private cnq e;
        @Nullable
        private cnw f;
        @Nullable
        private cnl g;

        public a a(boolean $$0) {
            this.a = $$0;
            return this;
        }

        public a a(float $$0) {
            this.b = Float.valueOf($$0);
            return this;
        }

        public a b(float $$0) {
            this.d = Float.valueOf($$0);
            return this;
        }

        public a a(cnq $$0) {
            this.e = $$0;
            return this;
        }

        public a a(cnw $$0) {
            this.f = $$0;
            return this;
        }

        public a a(cnl $$0) {
            this.g = $$0;
            return this;
        }

        public a a(d $$0) {
            this.c = $$0;
            return this;
        }

        public cnk a() {
            if (this.b == null || this.d == null || this.e == null || this.f == null || this.g == null) {
                throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
            }
            return new cnk(new b(this.a, this.b.floatValue(), this.c, this.d.floatValue()), this.e, this.g, this.f);
        }

        public String toString() {
            return "BiomeBuilder{\nhasPrecipitation=" + this.a + ",\ntemperature=" + this.b + ",\ntemperatureModifier=" + this.c + ",\ndownfall=" + this.d + ",\nspecialEffects=" + this.e + ",\nmobSpawnSettings=" + this.f + ",\ngenerationSettings=" + this.g + ",\n}";
        }
    }
}

