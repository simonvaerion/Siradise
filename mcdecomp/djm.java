/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Function;

public class djm
extends djp<djl> {
    public djm(Codec<djl> $$0) {
        super($$0);
    }

    @Override
    public boolean a(djl $$0, apf $$1) {
        return $$1.i() <= $$0.l;
    }

    @Override
    public boolean a(djk $$0, djl $$12, ddx $$22, Function<gu, he<cnk>> $$32, apf $$42, dgw $$52, clt $$6, ddw $$7) {
        int $$8 = hx.c(this.d() * 2 - 1);
        int $$9 = $$42.a($$42.a($$42.a(this.a()) + 1) + 1);
        for (int $$10 = 0; $$10 < $$9; ++$$10) {
            double $$11 = $$6.a($$42.a(16));
            double $$122 = $$12.e.a($$42, $$0);
            double $$13 = $$6.b($$42.a(16));
            double $$14 = $$12.b.a($$42);
            double $$15 = $$12.c.a($$42);
            double $$16 = $$12.j.a($$42);
            djp.a $$17 = ($$1, $$2, $$3, $$4, $$5) -> djm.a($$2, $$3, $$4, $$16);
            int $$18 = 1;
            if ($$42.a(4) == 0) {
                double $$19 = $$12.f.a($$42);
                float $$20 = 1.0f + $$42.i() * 6.0f;
                this.a($$0, $$12, $$22, $$32, $$52, $$11, $$122, $$13, $$20, $$19, $$7, $$17);
                $$18 += $$42.a(4);
            }
            for (int $$21 = 0; $$21 < $$18; ++$$21) {
                float $$222 = $$42.i() * ((float)Math.PI * 2);
                float $$23 = ($$42.i() - 0.5f) / 4.0f;
                float $$24 = this.a($$42);
                int $$25 = $$8 - $$42.a($$8 / 4);
                boolean $$26 = false;
                this.a($$0, $$12, $$22, $$32, $$42.g(), $$52, $$11, $$122, $$13, $$14, $$15, $$24, $$222, $$23, 0, $$25, this.b(), $$7, $$17);
            }
        }
        return true;
    }

    protected int a() {
        return 15;
    }

    protected float a(apf $$0) {
        float $$1 = $$0.i() * 2.0f + $$0.i();
        if ($$0.a(10) == 0) {
            $$1 *= $$0.i() * $$0.i() * 3.0f + 1.0f;
        }
        return $$1;
    }

    protected double b() {
        return 1.0;
    }

    protected void a(djk $$0, djl $$1, ddx $$2, Function<gu, he<cnk>> $$3, dgw $$4, double $$5, double $$6, double $$7, float $$8, double $$9, ddw $$10, djp.a $$11) {
        double $$12 = 1.5 + (double)(apa.a(1.5707964f) * $$8);
        double $$13 = $$12 * $$9;
        this.a($$0, $$1, $$2, $$3, $$4, $$5 + 1.0, $$6, $$7, $$12, $$13, $$10, $$11);
    }

    protected void a(djk $$0, djl $$1, ddx $$2, Function<gu, he<cnk>> $$3, long $$4, dgw $$5, double $$6, double $$7, double $$8, double $$9, double $$10, float $$11, float $$12, float $$13, int $$14, int $$15, double $$16, ddw $$17, djp.a $$18) {
        apf $$19 = apf.a($$4);
        int $$20 = $$19.a($$15 / 2) + $$15 / 4;
        boolean $$21 = $$19.a(6) == 0;
        float $$22 = 0.0f;
        float $$23 = 0.0f;
        for (int $$24 = $$14; $$24 < $$15; ++$$24) {
            double $$25 = 1.5 + (double)(apa.a((float)Math.PI * (float)$$24 / (float)$$15) * $$11);
            double $$26 = $$25 * $$16;
            float $$27 = apa.b($$13);
            $$6 += (double)(apa.b($$12) * $$27);
            $$7 += (double)apa.a($$13);
            $$8 += (double)(apa.a($$12) * $$27);
            $$13 *= $$21 ? 0.92f : 0.7f;
            $$13 += $$23 * 0.1f;
            $$12 += $$22 * 0.1f;
            $$23 *= 0.9f;
            $$22 *= 0.75f;
            $$23 += ($$19.i() - $$19.i()) * $$19.i() * 2.0f;
            $$22 += ($$19.i() - $$19.i()) * $$19.i() * 4.0f;
            if ($$24 == $$20 && $$11 > 1.0f) {
                this.a($$0, $$1, $$2, $$3, $$19.g(), $$5, $$6, $$7, $$8, $$9, $$10, $$19.i() * 0.5f + 0.5f, $$12 - 1.5707964f, $$13 / 3.0f, $$24, $$15, 1.0, $$17, $$18);
                this.a($$0, $$1, $$2, $$3, $$19.g(), $$5, $$6, $$7, $$8, $$9, $$10, $$19.i() * 0.5f + 0.5f, $$12 + 1.5707964f, $$13 / 3.0f, $$24, $$15, 1.0, $$17, $$18);
                return;
            }
            if ($$19.a(4) == 0) continue;
            if (!djm.a($$2.f(), $$6, $$8, $$24, $$15, $$11)) {
                return;
            }
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$8, $$25 * $$9, $$26 * $$10, $$17, $$18);
        }
    }

    private static boolean a(double $$0, double $$1, double $$2, double $$3) {
        if ($$1 <= $$3) {
            return true;
        }
        return $$0 * $$0 + $$1 * $$1 + $$2 * $$2 >= 1.0;
    }
}

