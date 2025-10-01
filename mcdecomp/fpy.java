/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import org.joml.Matrix4f;

public class fpy
extends fox<bfy> {
    public fpy(foy.a $$0) {
        super($$0);
    }

    @Override
    public void a(bfy $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        float[] $$6 = new float[8];
        float[] $$7 = new float[8];
        float $$8 = 0.0f;
        float $$9 = 0.0f;
        apf $$10 = apf.a($$0.b);
        for (int $$11 = 7; $$11 >= 0; --$$11) {
            $$6[$$11] = $$8;
            $$7[$$11] = $$9;
            $$8 += (float)($$10.a(11) - 5);
            $$9 += (float)($$10.a(11) - 5);
        }
        ein $$12 = $$4.getBuffer(fkf.t());
        Matrix4f $$13 = $$3.c().a();
        for (int $$14 = 0; $$14 < 4; ++$$14) {
            apf $$15 = apf.a($$0.b);
            for (int $$16 = 0; $$16 < 3; ++$$16) {
                int $$17 = 7;
                int $$18 = 0;
                if ($$16 > 0) {
                    $$17 = 7 - $$16;
                }
                if ($$16 > 0) {
                    $$18 = $$17 - 2;
                }
                float $$19 = $$6[$$17] - $$8;
                float $$20 = $$7[$$17] - $$9;
                for (int $$21 = $$17; $$21 >= $$18; --$$21) {
                    float $$22 = $$19;
                    float $$23 = $$20;
                    if ($$16 == 0) {
                        $$19 += (float)($$15.a(11) - 5);
                        $$20 += (float)($$15.a(11) - 5);
                    } else {
                        $$19 += (float)($$15.a(31) - 15);
                        $$20 += (float)($$15.a(31) - 15);
                    }
                    float $$24 = 0.5f;
                    float $$25 = 0.45f;
                    float $$26 = 0.45f;
                    float $$27 = 0.5f;
                    float $$28 = 0.1f + (float)$$14 * 0.2f;
                    if ($$16 == 0) {
                        $$28 *= (float)$$21 * 0.1f + 1.0f;
                    }
                    float $$29 = 0.1f + (float)$$14 * 0.2f;
                    if ($$16 == 0) {
                        $$29 *= ((float)$$21 - 1.0f) * 0.1f + 1.0f;
                    }
                    fpy.a($$13, $$12, $$19, $$20, $$21, $$22, $$23, 0.45f, 0.45f, 0.5f, $$28, $$29, false, false, true, false);
                    fpy.a($$13, $$12, $$19, $$20, $$21, $$22, $$23, 0.45f, 0.45f, 0.5f, $$28, $$29, true, false, true, true);
                    fpy.a($$13, $$12, $$19, $$20, $$21, $$22, $$23, 0.45f, 0.45f, 0.5f, $$28, $$29, true, true, false, true);
                    fpy.a($$13, $$12, $$19, $$20, $$21, $$22, $$23, 0.45f, 0.45f, 0.5f, $$28, $$29, false, true, false, false);
                }
            }
        }
    }

    private static void a(Matrix4f $$0, ein $$1, float $$2, float $$3, int $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, boolean $$12, boolean $$13, boolean $$14, boolean $$15) {
        $$1.a($$0, $$2 + ($$12 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$13 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3f).e();
        $$1.a($$0, $$5 + ($$12 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$13 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3f).e();
        $$1.a($$0, $$5 + ($$14 ? $$10 : -$$10), (float)(($$4 + 1) * 16), $$6 + ($$15 ? $$10 : -$$10)).a($$7, $$8, $$9, 0.3f).e();
        $$1.a($$0, $$2 + ($$14 ? $$11 : -$$11), (float)($$4 * 16), $$3 + ($$15 ? $$11 : -$$11)).a($$7, $$8, $$9, 0.3f).e();
    }

    @Override
    public acq a(bfy $$0) {
        return fuu.e;
    }
}

