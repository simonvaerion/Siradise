/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fpf
extends fox<bzc> {
    private static final acq a = new acq("textures/entity/fishing_hook.png");
    private static final fkf f = fkf.c(a);
    private static final double g = 960.0;

    public fpf(foy.a $$0) {
        super($$0);
    }

    @Override
    public void a(bzc $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        float $$29;
        double $$28;
        double $$27;
        double $$26;
        byo $$6 = $$0.k();
        if ($$6 == null) {
            return;
        }
        $$3.a();
        $$3.a();
        $$3.b(0.5f, 0.5f, 0.5f);
        $$3.a(this.c.b());
        $$3.a(a.d.rotationDegrees(180.0f));
        eij.a $$7 = $$3.c();
        Matrix4f $$8 = $$7.a();
        Matrix3f $$9 = $$7.b();
        ein $$10 = $$4.getBuffer(f);
        fpf.a($$10, $$8, $$9, $$5, 0.0f, 0, 0, 1);
        fpf.a($$10, $$8, $$9, $$5, 1.0f, 0, 1, 1);
        fpf.a($$10, $$8, $$9, $$5, 1.0f, 1, 1, 0);
        fpf.a($$10, $$8, $$9, $$5, 0.0f, 1, 0, 0);
        $$3.b();
        int $$11 = $$6.fh() == bft.b ? 1 : -1;
        cfz $$12 = $$6.eO();
        if (!$$12.a(cgc.qh)) {
            $$11 = -$$11;
        }
        float $$13 = $$6.x($$2);
        float $$14 = apa.a(apa.c($$13) * (float)Math.PI);
        float $$15 = apa.i($$2, $$6.aW, $$6.aV) * ((float)Math.PI / 180);
        double $$16 = apa.a($$15);
        double $$17 = apa.b($$15);
        double $$18 = (double)$$11 * 0.35;
        double $$19 = 0.8;
        if (this.c.d != null && !this.c.d.au().a() || $$6 != enn.N().t) {
            double $$20 = apa.d((double)$$2, $$6.J, $$6.dn()) - $$17 * $$18 - $$16 * 0.8;
            double $$21 = $$6.K + (double)$$6.cF() + ($$6.dp() - $$6.K) * (double)$$2 - 0.45;
            double $$22 = apa.d((double)$$2, $$6.L, $$6.dt()) - $$16 * $$18 + $$17 * 0.8;
            float $$23 = $$6.bU() ? -0.1875f : 0.0f;
        } else {
            double $$24 = 960.0 / (double)this.c.d.ac().c().intValue();
            eei $$25 = this.c.b.j().a((float)$$11 * 0.525f, -0.1f);
            $$25 = $$25.a($$24);
            $$25 = $$25.b($$14 * 0.5f);
            $$25 = $$25.a(-$$14 * 0.7f);
            $$26 = apa.d((double)$$2, $$6.J, $$6.dn()) + $$25.c;
            $$27 = apa.d((double)$$2, $$6.K, $$6.dp()) + $$25.d;
            $$28 = apa.d((double)$$2, $$6.L, $$6.dt()) + $$25.e;
            $$29 = $$6.cF();
        }
        double $$30 = apa.d((double)$$2, $$0.J, $$0.dn());
        double $$31 = apa.d((double)$$2, $$0.K, $$0.dp()) + 0.25;
        double $$32 = apa.d((double)$$2, $$0.L, $$0.dt());
        float $$33 = (float)($$26 - $$30);
        float $$34 = (float)($$27 - $$31) + $$29;
        float $$35 = (float)($$28 - $$32);
        ein $$36 = $$4.getBuffer(fkf.y());
        eij.a $$37 = $$3.c();
        int $$38 = 16;
        for (int $$39 = 0; $$39 <= 16; ++$$39) {
            fpf.a($$33, $$34, $$35, $$36, $$37, fpf.a($$39, 16), fpf.a($$39 + 1, 16));
        }
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private static float a(int $$0, int $$1) {
        return (float)$$0 / (float)$$1;
    }

    private static void a(ein $$0, Matrix4f $$1, Matrix3f $$2, int $$3, float $$4, int $$5, int $$6, int $$7) {
        $$0.a($$1, $$4 - 0.5f, (float)$$5 - 0.5f, 0.0f).a(255, 255, 255, 255).a((float)$$6, (float)$$7).c(fum.d).b($$3).a($$2, 0.0f, 1.0f, 0.0f).e();
    }

    private static void a(float $$0, float $$1, float $$2, ein $$3, eij.a $$4, float $$5, float $$6) {
        float $$7 = $$0 * $$5;
        float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5f + 0.25f;
        float $$9 = $$2 * $$5;
        float $$10 = $$0 * $$6 - $$7;
        float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5f + 0.25f - $$8;
        float $$12 = $$2 * $$6 - $$9;
        float $$13 = apa.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
        $$3.a($$4.a(), $$7, $$8, $$9).a(0, 0, 0, 255).a($$4.b(), $$10 /= $$13, $$11 /= $$13, $$12 /= $$13).e();
    }

    @Override
    public acq a(bzc $$0) {
        return a;
    }
}

