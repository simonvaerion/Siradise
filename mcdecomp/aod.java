/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.floats.FloatArrayList
 *  it.unimi.dsi.fastutil.floats.FloatList
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.lang3.mutable.MutableObject;

public interface aod<C, I extends apx<C>>
extends apx<C> {
    @aqa
    public String a();

    public aod<C, I> a(d<I> var1);

    public static <C, I extends apx<C>> Codec<aod<C, I>> a(Codec<I> $$03) {
        record A<C, I extends apx<C>>(float a, aod<C, I> b, float c) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "location;value;derivative", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "location;value;derivative", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "location;value;derivative", "a", "b", "c"}, this, $$0);
            }
        }
        MutableObject $$1 = new MutableObject();
        Codec $$22 = RecordCodecBuilder.create($$12 -> $$12.group((App)Codec.FLOAT.fieldOf("location").forGetter(A::a), (App)aoi.a(() -> ((MutableObject)$$1).getValue()).fieldOf("value").forGetter(A::b), (App)Codec.FLOAT.fieldOf("derivative").forGetter(A::c)).apply((Applicative)$$12, ($$0, $$1, $$2) -> new A((float)$$0, $$1, (float)$$2)));
        Codec $$3 = RecordCodecBuilder.create($$2 -> $$2.group((App)$$03.fieldOf("coordinate").forGetter(e::d), (App)aoi.a($$22.listOf()).fieldOf("points").forGetter($$0 -> IntStream.range(0, $$0.c.length).mapToObj($$1 -> new A($$0.e()[$$1], $$0.f().get($$1), $$0.g()[$$1])).toList())).apply((Applicative)$$2, ($$0, $$1) -> {
            Object $$2 = new float[$$1.size()];
            ImmutableList.Builder $$3 = ImmutableList.builder();
            float[] $$4 = new float[$$1.size()];
            for (int $$5 = 0; $$5 < $$1.size(); ++$$5) {
                A $$6 = (A)$$1.get($$5);
                $$2[$$5] = $$6.a();
                $$3.add($$6.b());
                $$4[$$5] = $$6.c();
            }
            return e.a($$0, $$2, $$3.build(), $$4);
        }));
        $$1.setValue((Object)Codec.either((Codec)Codec.FLOAT, (Codec)$$3).xmap($$02 -> (aod)$$02.map(c::new, $$0 -> $$0), $$0 -> {
            Either either;
            if ($$0 instanceof c) {
                c $$1 = (c)$$0;
                either = Either.left((Object)Float.valueOf($$1.d()));
            } else {
                either = Either.right((Object)((e)$$0));
            }
            return either;
        }));
        return (Codec)$$1.getValue();
    }

    public static <C, I extends apx<C>> aod<C, I> a(float $$0) {
        return new c($$0);
    }

    public static <C, I extends apx<C>> b<C, I> a(I $$0) {
        return new b($$0);
    }

    public static <C, I extends apx<C>> b<C, I> a(I $$0, apx<Float> $$1) {
        return new b($$0, $$1);
    }

    @aqa
    public record c<C, I extends apx<C>>(float b) implements aod<C, I>
    {
        @Override
        public float a(C $$0) {
            return this.b;
        }

        @Override
        public String a() {
            return String.format(Locale.ROOT, "k=%.3f", Float.valueOf(this.b));
        }

        @Override
        public float c() {
            return this.b;
        }

        @Override
        public aod<C, I> a(d<I> $$0) {
            return this;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "value", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "value", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "value", "b"}, this, $$0);
        }

        public float d() {
            return this.b;
        }
    }

    public static final class b<C, I extends apx<C>> {
        private final I a;
        private final apx<Float> b;
        private final FloatList c = new FloatArrayList();
        private final List<aod<C, I>> d = Lists.newArrayList();
        private final FloatList e = new FloatArrayList();

        protected b(I $$0) {
            this($$0, apx.a);
        }

        protected b(I $$0, apx<Float> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public b<C, I> a(float $$0, float $$1) {
            return this.a($$0, new c(this.b.a(Float.valueOf($$1))), 0.0f);
        }

        public b<C, I> a(float $$0, float $$1, float $$2) {
            return this.a($$0, new c(this.b.a(Float.valueOf($$1))), $$2);
        }

        public b<C, I> a(float $$0, aod<C, I> $$1) {
            return this.a($$0, $$1, 0.0f);
        }

        private b<C, I> a(float $$0, aod<C, I> $$1, float $$2) {
            if (!this.c.isEmpty() && $$0 <= this.c.getFloat(this.c.size() - 1)) {
                throw new IllegalArgumentException("Please register points in ascending order");
            }
            this.c.add($$0);
            this.d.add($$1);
            this.e.add($$2);
            return this;
        }

        public aod<C, I> a() {
            if (this.c.isEmpty()) {
                throw new IllegalStateException("No elements added");
            }
            return aod$e.a(this.a, this.c.toFloatArray(), ImmutableList.copyOf(this.d), this.e.toFloatArray());
        }
    }

    @aqa
    public static final class e<C, I extends apx<C>>
    extends Record
    implements aod<C, I> {
        private final I b;
        final float[] c;
        private final List<aod<C, I>> d;
        private final float[] e;
        private final float f;
        private final float g;

        public e(I $$0, float[] $$1, List<aod<C, I>> $$2, float[] $$3, float $$4, float $$5) {
            aod$e.a($$1, $$2, $$3);
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
        }

        static <C, I extends apx<C>> e<C, I> a(I $$0, float[] $$1, List<aod<C, I>> $$2, float[] $$3) {
            aod$e.a($$1, $$2, $$3);
            int $$4 = $$1.length - 1;
            float $$5 = Float.POSITIVE_INFINITY;
            float $$6 = Float.NEGATIVE_INFINITY;
            float $$7 = $$0.b();
            float $$8 = $$0.c();
            if ($$7 < $$1[0]) {
                float $$9 = aod$e.a($$7, $$1, $$2.get(0).b(), $$3, 0);
                float $$10 = aod$e.a($$7, $$1, $$2.get(0).c(), $$3, 0);
                $$5 = Math.min($$5, Math.min($$9, $$10));
                $$6 = Math.max($$6, Math.max($$9, $$10));
            }
            if ($$8 > $$1[$$4]) {
                float $$11 = aod$e.a($$8, $$1, $$2.get($$4).b(), $$3, $$4);
                float $$12 = aod$e.a($$8, $$1, $$2.get($$4).c(), $$3, $$4);
                $$5 = Math.min($$5, Math.min($$11, $$12));
                $$6 = Math.max($$6, Math.max($$11, $$12));
            }
            for (aod<C, I> $$13 : $$2) {
                $$5 = Math.min($$5, $$13.b());
                $$6 = Math.max($$6, $$13.c());
            }
            for (int $$14 = 0; $$14 < $$4; ++$$14) {
                float $$15 = $$1[$$14];
                float $$16 = $$1[$$14 + 1];
                float $$17 = $$16 - $$15;
                aod<C, I> $$18 = $$2.get($$14);
                aod<C, I> $$19 = $$2.get($$14 + 1);
                float $$20 = $$18.b();
                float $$21 = $$18.c();
                float $$22 = $$19.b();
                float $$23 = $$19.c();
                float $$24 = $$3[$$14];
                float $$25 = $$3[$$14 + 1];
                if ($$24 == 0.0f && $$25 == 0.0f) continue;
                float $$26 = $$24 * $$17;
                float $$27 = $$25 * $$17;
                float $$28 = Math.min($$20, $$22);
                float $$29 = Math.max($$21, $$23);
                float $$30 = $$26 - $$23 + $$20;
                float $$31 = $$26 - $$22 + $$21;
                float $$32 = -$$27 + $$22 - $$21;
                float $$33 = -$$27 + $$23 - $$20;
                float $$34 = Math.min($$30, $$32);
                float $$35 = Math.max($$31, $$33);
                $$5 = Math.min($$5, $$28 + 0.25f * $$34);
                $$6 = Math.max($$6, $$29 + 0.25f * $$35);
            }
            return new e<C, I>($$0, $$1, $$2, $$3, $$5, $$6);
        }

        private static float a(float $$0, float[] $$1, float $$2, float[] $$3, int $$4) {
            float $$5 = $$3[$$4];
            if ($$5 == 0.0f) {
                return $$2;
            }
            return $$2 + $$5 * ($$0 - $$1[$$4]);
        }

        private static <C, I extends apx<C>> void a(float[] $$0, List<aod<C, I>> $$1, float[] $$2) {
            if ($$0.length != $$1.size() || $$0.length != $$2.length) {
                throw new IllegalArgumentException("All lengths must be equal, got: " + $$0.length + " " + $$1.size() + " " + $$2.length);
            }
            if ($$0.length == 0) {
                throw new IllegalArgumentException("Cannot create a multipoint spline with no points");
            }
        }

        @Override
        public float a(C $$0) {
            float $$1 = this.b.a($$0);
            int $$2 = aod$e.a(this.c, $$1);
            int $$3 = this.c.length - 1;
            if ($$2 < 0) {
                return aod$e.a($$1, this.c, this.d.get(0).a($$0), this.e, 0);
            }
            if ($$2 == $$3) {
                return aod$e.a($$1, this.c, this.d.get($$3).a($$0), this.e, $$3);
            }
            float $$4 = this.c[$$2];
            float $$5 = this.c[$$2 + 1];
            float $$6 = ($$1 - $$4) / ($$5 - $$4);
            apx $$7 = this.d.get($$2);
            apx $$8 = this.d.get($$2 + 1);
            float $$9 = this.e[$$2];
            float $$10 = this.e[$$2 + 1];
            float $$11 = $$7.a($$0);
            float $$12 = $$8.a($$0);
            float $$13 = $$9 * ($$5 - $$4) - ($$12 - $$11);
            float $$14 = -$$10 * ($$5 - $$4) + ($$12 - $$11);
            float $$15 = apa.i($$6, $$11, $$12) + $$6 * (1.0f - $$6) * apa.i($$6, $$13, $$14);
            return $$15;
        }

        private static int a(float[] $$0, float $$1) {
            return apa.a(0, $$0.length, (int $$2) -> $$1 < $$0[$$2]) - 1;
        }

        @Override
        @VisibleForTesting
        public String a() {
            return "Spline{coordinate=" + this.b + ", locations=" + this.a(this.c) + ", derivatives=" + this.a(this.e) + ", values=" + this.d.stream().map(aod::a).collect(Collectors.joining(", ", "[", "]")) + "}";
        }

        private String a(float[] $$02) {
            return "[" + IntStream.range(0, $$02.length).mapToDouble($$1 -> $$02[$$1]).mapToObj($$0 -> String.format(Locale.ROOT, "%.3f", $$0)).collect(Collectors.joining(", ")) + "]";
        }

        @Override
        public aod<C, I> a(d<I> $$0) {
            return aod$e.a((apx)$$0.visit(this.b), this.c, this.f().stream().map($$1 -> $$1.a($$0)).toList(), this.e);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "coordinate;locations;values;derivatives;minValue;maxValue", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "coordinate;locations;values;derivatives;minValue;maxValue", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "coordinate;locations;values;derivatives;minValue;maxValue", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public I d() {
            return this.b;
        }

        public float[] e() {
            return this.c;
        }

        public List<aod<C, I>> f() {
            return this.d;
        }

        public float[] g() {
            return this.e;
        }

        @Override
        public float b() {
            return this.f;
        }

        @Override
        public float c() {
            return this.g;
        }
    }

    public static interface d<I> {
        public I visit(I var1);
    }
}

