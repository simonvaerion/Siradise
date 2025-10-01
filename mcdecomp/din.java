/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.primitives.Doubles;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import javax.annotation.Nullable;

public class din {
    private static final double f = 0.1;
    protected static final int a = 4;
    protected static final int b = 8;
    protected static final int c = 2;
    private static final double g = 1.0;
    private static final double h = -1.0;
    private static final int i = 2;
    private static final int j = hq.a(16);
    private static final int k = j - 1;
    private static final int l = j;
    private static final int m = 2 * k + 1;
    private static final int n = 2 * l + 1;
    private static final int o = m + n;
    private final cmo p;
    private static final List<cpn> q = List.of(cpo.l, cpo.L, cpo.i, cpo.b, cpo.k, cpo.I, cpo.K, cpo.fl, cpo.dP, cpo.iA, cpo.j);
    protected static final double d = Double.MAX_VALUE;
    private boolean r;
    private final double[] s;
    private final List<List<he<cnk>>> t;
    private final transient double[][] u;
    private static final Codec<double[]> v = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
    public static final Codec<din> e = RecordCodecBuilder.create($$03 -> $$03.group((App)Codec.INT.fieldOf("min_section").forGetter($$0 -> $$0.p.al()), (App)Codec.INT.fieldOf("max_section").forGetter($$0 -> $$0.p.am()), (App)v.optionalFieldOf("heights").forGetter($$02 -> DoubleStream.of($$02.s).anyMatch($$0 -> $$0 != Double.MAX_VALUE) ? Optional.of($$02.s) : Optional.empty())).apply((Applicative)$$03, din::new)).comapFlatMap(din::a, Function.identity());

    private static DataResult<din> a(din $$0) {
        if ($$0.s.length != o) {
            return DataResult.error(() -> "heights has to be of length " + o);
        }
        return DataResult.success((Object)$$0);
    }

    private din(int $$02, int $$1, Optional<double[]> $$2) {
        this.s = $$2.orElse(ac.a(new double[o], (T $$0) -> Arrays.fill($$0, Double.MAX_VALUE)));
        this.u = new double[o][];
        ObjectArrayList $$3 = new ObjectArrayList(o);
        $$3.size(o);
        this.t = $$3;
        int $$4 = hx.c($$02);
        int $$5 = hx.c($$1) - $$4;
        this.p = cmo.e($$4, $$5);
    }

    @Nullable
    public static din a(aim $$0, int $$1, int $$2) {
        ddx $$3 = $$0.a($$1, $$2);
        din $$4 = $$3.t();
        if ($$4 == null || !$$3.k().b(dec.f)) {
            return null;
        }
        $$4.a($$3, din.a($$0, $$1, $$2, false));
        return $$4;
    }

    public static Set<hb> a(cng $$0, int $$1, int $$2, boolean $$3) {
        EnumSet<hb> $$4 = EnumSet.noneOf(hb.class);
        for (hb $$5 : hb.values()) {
            int $$7;
            int $$6 = $$1 + $$5.b();
            if ($$0.a($$6, $$7 = $$2 + $$5.c()).s() != $$3) continue;
            $$4.add($$5);
        }
        return $$4;
    }

    private void a(ddx $$0, Set<hb> $$1) {
        if (this.r) {
            return;
        }
        if ($$1.contains((Object)hb.a) || $$1.contains((Object)hb.g) || $$1.contains((Object)hb.h)) {
            this.a(din.a(0, 0), $$0, 0, 0);
        }
        if ($$1.contains((Object)hb.a)) {
            for (int $$2 = 1; $$2 < j; ++$$2) {
                this.a(din.a($$2, 0), $$0, 4 * $$2, 0);
            }
        }
        if ($$1.contains((Object)hb.g)) {
            for (int $$3 = 1; $$3 < j; ++$$3) {
                this.a(din.a(0, $$3), $$0, 0, 4 * $$3);
            }
        }
        if ($$1.contains((Object)hb.c)) {
            for (int $$4 = 1; $$4 < j; ++$$4) {
                this.a(din.b(l, $$4), $$0, 15, 4 * $$4);
            }
        }
        if ($$1.contains((Object)hb.e)) {
            for (int $$5 = 0; $$5 < j; ++$$5) {
                this.a(din.b($$5, l), $$0, 4 * $$5, 15);
            }
        }
        if ($$1.contains((Object)hb.c) && $$1.contains((Object)hb.b)) {
            this.a(din.b(l, 0), $$0, 15, 0);
        }
        if ($$1.contains((Object)hb.c) && $$1.contains((Object)hb.e) && $$1.contains((Object)hb.d)) {
            this.a(din.b(l, l), $$0, 15, 15);
        }
        this.r = true;
    }

    private void a(int $$0, ddx $$1, int $$2, int $$3) {
        if (this.s[$$0] == Double.MAX_VALUE) {
            this.s[$$0] = this.a($$1, $$2, $$3);
        }
        this.u[$$0] = this.a($$1, $$2, $$3, apa.a(this.s[$$0]));
        this.t.set($$0, this.b($$1, $$2, $$3));
    }

    private int a(ddx $$0, int $$1, int $$2) {
        int $$4;
        if ($$0.b(dhk.a.a)) {
            int $$3 = Math.min($$0.a(dhk.a.a, $$1, $$2) + 1, this.p.aj());
        } else {
            $$4 = this.p.aj();
        }
        int $$5 = this.p.C_();
        gu.a $$6 = new gu.a($$1, $$4, $$2);
        while ($$6.v() > $$5) {
            $$6.c(ha.a);
            if (!q.contains($$0.a_($$6).b())) continue;
            return $$6.v();
        }
        return $$5;
    }

    private static double a(ddx $$0, gu.a $$1) {
        return din.a($$0, (gu)$$1.c(ha.a)) ? 1.0 : -1.0;
    }

    private static double b(ddx $$0, gu.a $$1) {
        double $$2 = 0.0;
        for (int $$3 = 0; $$3 < 7; ++$$3) {
            $$2 += din.a($$0, $$1);
        }
        return $$2;
    }

    private double[] a(ddx $$0, int $$1, int $$2, int $$3) {
        double[] $$4 = new double[this.b()];
        Arrays.fill($$4, -1.0);
        gu.a $$5 = new gu.a($$1, this.p.aj(), $$2);
        double $$6 = din.b($$0, $$5);
        for (int $$7 = $$4.length - 2; $$7 >= 0; --$$7) {
            double $$8 = din.a($$0, $$5);
            double $$9 = din.b($$0, $$5);
            $$4[$$7] = ($$6 + $$8 + $$9) / 15.0;
            $$6 = $$9;
        }
        int $$10 = this.a(apa.a($$3, 8));
        if ($$10 >= 0 && $$10 < $$4.length - 1) {
            double $$11 = ((double)$$3 + 0.5) % 8.0 / 8.0;
            double $$12 = (1.0 - $$11) / $$11;
            double $$13 = Math.max($$12, 1.0) * 0.25;
            $$4[$$10 + 1] = -$$12 / $$13;
            $$4[$$10] = 1.0 / $$13;
        }
        return $$4;
    }

    private List<he<cnk>> b(ddx $$0, int $$1, int $$2) {
        ObjectArrayList $$3 = new ObjectArrayList(this.c());
        $$3.size(this.c());
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            int $$5 = $$4 + hq.a(this.p.C_());
            $$3.set($$4, $$0.getNoiseBiome(hq.a($$1), $$5, hq.a($$2)));
        }
        return $$3;
    }

    private static boolean a(ddx $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        if ($$2.i()) {
            return false;
        }
        if ($$2.a(amw.O)) {
            return false;
        }
        if ($$2.a(amw.t)) {
            return false;
        }
        if ($$2.a(cpo.eU) || $$2.a(cpo.eV)) {
            return false;
        }
        return !$$2.k($$0, $$1).b();
    }

    protected double a(int $$0, int $$1, int $$2) {
        if ($$0 == l || $$2 == l) {
            return this.s[din.b($$0, $$2)];
        }
        if ($$0 == 0 || $$2 == 0) {
            return this.s[din.a($$0, $$2)];
        }
        return Double.MAX_VALUE;
    }

    private double a(@Nullable double[] $$0, int $$1) {
        if ($$0 == null) {
            return Double.MAX_VALUE;
        }
        int $$2 = this.a($$1);
        if ($$2 < 0 || $$2 >= $$0.length) {
            return Double.MAX_VALUE;
        }
        return $$0[$$2] * 0.1;
    }

    protected double b(int $$0, int $$1, int $$2) {
        if ($$1 == this.e()) {
            return 0.1;
        }
        if ($$0 == l || $$2 == l) {
            return this.a(this.u[din.b($$0, $$2)], $$1);
        }
        if ($$0 == 0 || $$2 == 0) {
            return this.a(this.u[din.a($$0, $$2)], $$1);
        }
        return Double.MAX_VALUE;
    }

    protected void a(int $$0, int $$1, int $$2, a $$3) {
        if ($$1 < hq.a(this.p.C_()) || $$1 >= hq.a(this.p.aj())) {
            return;
        }
        int $$4 = $$1 - hq.a(this.p.C_());
        for (int $$5 = 0; $$5 < this.t.size(); ++$$5) {
            he<cnk> $$6;
            if (this.t.get($$5) == null || ($$6 = this.t.get($$5).get($$4)) == null) continue;
            $$3.consume($$0 + din.b($$5), $$2 + din.c($$5), $$6);
        }
    }

    protected void a(int $$0, int $$1, c $$2) {
        for (int $$3 = 0; $$3 < this.s.length; ++$$3) {
            double $$4 = this.s[$$3];
            if ($$4 == Double.MAX_VALUE) continue;
            $$2.consume($$0 + din.b($$3), $$1 + din.c($$3), $$4);
        }
    }

    protected void a(int $$0, int $$1, int $$2, int $$3, b $$4) {
        int $$5 = this.d();
        int $$6 = Math.max(0, $$2 - $$5);
        int $$7 = Math.min(this.b(), $$3 - $$5);
        for (int $$8 = 0; $$8 < this.u.length; ++$$8) {
            double[] $$9 = this.u[$$8];
            if ($$9 == null) continue;
            int $$10 = $$0 + din.b($$8);
            int $$11 = $$1 + din.c($$8);
            for (int $$12 = $$6; $$12 < $$7; ++$$12) {
                $$4.consume($$10, $$12 + $$5, $$11, $$9[$$12] * 0.1);
            }
        }
    }

    private int b() {
        return this.p.ak() * 2;
    }

    private int c() {
        return hq.d(this.p.ak());
    }

    private int d() {
        return this.e() + 1;
    }

    private int e() {
        return this.p.al() * 2;
    }

    private int a(int $$0) {
        return $$0 - this.d();
    }

    private static int a(int $$0, int $$1) {
        return k - $$0 + $$1;
    }

    private static int b(int $$0, int $$1) {
        return m + $$0 + l - $$1;
    }

    private static int b(int $$0) {
        if ($$0 < m) {
            return din.d(k - $$0);
        }
        int $$1 = $$0 - m;
        return l - din.d(l - $$1);
    }

    private static int c(int $$0) {
        if ($$0 < m) {
            return din.d($$0 - k);
        }
        int $$1 = $$0 - m;
        return l - din.d($$1 - l);
    }

    private static int d(int $$0) {
        return $$0 & ~($$0 >> 31);
    }

    public cmo a() {
        return this.p;
    }

    protected static interface a {
        public void consume(int var1, int var2, he<cnk> var3);
    }

    protected static interface c {
        public void consume(int var1, int var2, double var3);
    }

    protected static interface b {
        public void consume(int var1, int var2, int var3, double var4);
    }
}

