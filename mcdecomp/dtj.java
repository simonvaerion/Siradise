/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class dtj {
    private static final int c = Integer.MIN_VALUE;
    private static final MutableObject<Codec<he<dtj>>> d = new MutableObject();
    public static final Codec<dtj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.a(() -> d.getValue()).fieldOf("fallback").forGetter(dtj::a), (App)Codec.mapPair((MapCodec)dth.e.fieldOf("element"), (MapCodec)Codec.intRange((int)1, (int)150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dtj::new));
    public static final Codec<he<dtj>> b = ac.a(acm.a(jc.aC, a), arg_0 -> d.setValue(arg_0));
    private final List<Pair<dth, Integer>> e;
    private final ObjectArrayList<dth> f;
    private final he<dtj> g;
    private int h = Integer.MIN_VALUE;

    public dtj(he<dtj> $$0, List<Pair<dth, Integer>> $$1) {
        this.e = $$1;
        this.f = new ObjectArrayList();
        for (Pair<dth, Integer> $$2 : $$1) {
            dth $$3 = (dth)$$2.getFirst();
            for (int $$4 = 0; $$4 < (Integer)$$2.getSecond(); ++$$4) {
                this.f.add((Object)$$3);
            }
        }
        this.g = $$0;
    }

    public dtj(he<dtj> $$0, List<Pair<Function<a, ? extends dth>, Integer>> $$1, a $$2) {
        this.e = Lists.newArrayList();
        this.f = new ObjectArrayList();
        for (Pair<Function<a, ? extends dth>, Integer> $$3 : $$1) {
            dth $$4 = (dth)((Function)$$3.getFirst()).apply($$2);
            this.e.add((Pair<dth, Integer>)Pair.of((Object)$$4, (Object)((Integer)$$3.getSecond())));
            for (int $$5 = 0; $$5 < (Integer)$$3.getSecond(); ++$$5) {
                this.f.add((Object)$$4);
            }
        }
        this.g = $$0;
    }

    public int a(dvu $$02) {
        if (this.h == Integer.MIN_VALUE) {
            this.h = this.f.stream().filter($$0 -> $$0 != dta.b).mapToInt($$1 -> $$1.a($$02, gu.b, cvz.a).d()).max().orElse(0);
        }
        return this.h;
    }

    public he<dtj> a() {
        return this.g;
    }

    public dth a(apf $$0) {
        return (dth)this.f.get($$0.a(this.f.size()));
    }

    public List<dth> b(apf $$0) {
        return ac.a(this.f, $$0);
    }

    public int b() {
        return this.f.size();
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("terrain_matching", (ImmutableList<dvq>)ImmutableList.of((Object)new dva(dhk.a.a, -1)));
        public static final /* enum */ a b = new a("rigid", (ImmutableList<dvq>)ImmutableList.of());
        public static final apr.a<a> c;
        private final String d;
        private final ImmutableList<dvq> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, ImmutableList<dvq> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public String a() {
            return this.d;
        }

        public static a a(String $$0) {
            return c.a($$0);
        }

        public ImmutableList<dvq> b() {
            return this.e;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b};
        }

        static {
            f = dtj$a.d();
            c = apr.a(a::values);
        }
    }
}

