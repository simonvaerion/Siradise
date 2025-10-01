/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.stream.IntStream;

public class dwe
implements dhd.d {
    private static final Codec<Double> e = Codec.doubleRange((double)0.001, (double)1000.0);
    private static final MapCodec<dwe> f = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)e.fieldOf("xz_scale").forGetter($$0 -> $$0.p), (App)e.fieldOf("y_scale").forGetter($$0 -> $$0.q), (App)e.fieldOf("xz_factor").forGetter($$0 -> $$0.l), (App)e.fieldOf("y_factor").forGetter($$0 -> $$0.m), (App)Codec.doubleRange((double)1.0, (double)8.0).fieldOf("smear_scale_multiplier").forGetter($$0 -> $$0.n)).apply((Applicative)$$02, dwe::a));
    public static final aou<dwe> a = aou.a(f);
    private final dwi g;
    private final dwi h;
    private final dwi i;
    private final double j;
    private final double k;
    private final double l;
    private final double m;
    private final double n;
    private final double o;
    private final double p;
    private final double q;

    public static dwe a(double $$0, double $$1, double $$2, double $$3, double $$4) {
        return new dwe(new dil(0L), $$0, $$1, $$2, $$3, $$4);
    }

    private dwe(dwi $$0, dwi $$1, dwi $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.p = $$3;
        this.q = $$4;
        this.l = $$5;
        this.m = $$6;
        this.n = $$7;
        this.j = 684.412 * this.p;
        this.k = 684.412 * this.q;
        this.o = $$0.a(this.k);
    }

    @VisibleForTesting
    public dwe(apf $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        this(dwi.a($$0, IntStream.rangeClosed(-15, 0)), dwi.a($$0, IntStream.rangeClosed(-15, 0)), dwi.a($$0, IntStream.rangeClosed(-7, 0)), $$1, $$2, $$3, $$4, $$5);
    }

    public dwe a(apf $$0) {
        return new dwe($$0, this.p, this.q, this.l, this.m, this.n);
    }

    @Override
    public double a(dhd.b $$0) {
        double $$1 = (double)$$0.a() * this.j;
        double $$2 = (double)$$0.b() * this.k;
        double $$3 = (double)$$0.c() * this.j;
        double $$4 = $$1 / this.l;
        double $$5 = $$2 / this.m;
        double $$6 = $$3 / this.l;
        double $$7 = this.k * this.n;
        double $$8 = $$7 / this.m;
        double $$9 = 0.0;
        double $$10 = 0.0;
        double $$11 = 0.0;
        boolean $$12 = true;
        double $$13 = 1.0;
        for (int $$14 = 0; $$14 < 8; ++$$14) {
            dwf $$15 = this.i.a($$14);
            if ($$15 != null) {
                $$11 += $$15.a(dwi.b($$4 * $$13), dwi.b($$5 * $$13), dwi.b($$6 * $$13), $$8 * $$13, $$5 * $$13) / $$13;
            }
            $$13 /= 2.0;
        }
        double $$16 = ($$11 / 10.0 + 1.0) / 2.0;
        boolean $$17 = $$16 >= 1.0;
        boolean $$18 = $$16 <= 0.0;
        $$13 = 1.0;
        for (int $$19 = 0; $$19 < 16; ++$$19) {
            dwf $$25;
            dwf $$24;
            double $$20 = dwi.b($$1 * $$13);
            double $$21 = dwi.b($$2 * $$13);
            double $$22 = dwi.b($$3 * $$13);
            double $$23 = $$7 * $$13;
            if (!$$17 && ($$24 = this.g.a($$19)) != null) {
                $$9 += $$24.a($$20, $$21, $$22, $$23, $$2 * $$13) / $$13;
            }
            if (!$$18 && ($$25 = this.h.a($$19)) != null) {
                $$10 += $$25.a($$20, $$21, $$22, $$23, $$2 * $$13) / $$13;
            }
            $$13 /= 2.0;
        }
        return apa.b($$9 / 512.0, $$10 / 512.0, $$16) / 128.0;
    }

    @Override
    public double a() {
        return -this.b();
    }

    @Override
    public double b() {
        return this.o;
    }

    @VisibleForTesting
    public void a(StringBuilder $$0) {
        $$0.append("BlendedNoise{minLimitNoise=");
        this.g.a($$0);
        $$0.append(", maxLimitNoise=");
        this.h.a($$0);
        $$0.append(", mainNoise=");
        this.i.a($$0);
        $$0.append(String.format(Locale.ROOT, ", xzScale=%.3f, yScale=%.3f, xzMainScale=%.3f, yMainScale=%.3f, cellWidth=4, cellHeight=8", 684.412, 684.412, 8.555150000000001, 4.277575000000001)).append('}');
    }

    @Override
    public aou<? extends dhd> c() {
        return a;
    }
}

