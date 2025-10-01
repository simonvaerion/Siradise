/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import java.util.List;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class flq
implements flu<czi> {
    public static final acq a = new acq("textures/entity/beacon_beam.png");
    public static final int b = 1024;

    public flq(flv.a $$0) {
    }

    @Override
    public void a(czi $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        long $$6 = $$0.k().V();
        List<czi.a> $$7 = $$0.c();
        int $$8 = 0;
        for (int $$9 = 0; $$9 < $$7.size(); ++$$9) {
            czi.a $$10 = $$7.get($$9);
            flq.a($$2, $$3, $$1, $$6, $$8, $$9 == $$7.size() - 1 ? 1024 : $$10.c(), $$10.b());
            $$8 += $$10.c();
        }
    }

    private static void a(eij $$0, fjx $$1, float $$2, long $$3, int $$4, int $$5, float[] $$6) {
        flq.a($$0, $$1, a, $$2, 1.0f, $$3, $$4, $$5, $$6, 0.2f, 0.25f);
    }

    public static void a(eij $$0, fjx $$1, acq $$2, float $$3, float $$4, long $$5, int $$6, int $$7, float[] $$8, float $$9, float $$10) {
        int $$11 = $$6 + $$7;
        $$0.a();
        $$0.a(0.5, 0.0, 0.5);
        float $$12 = (float)Math.floorMod($$5, 40) + $$3;
        float $$13 = $$7 < 0 ? $$12 : -$$12;
        float $$14 = apa.h($$13 * 0.2f - (float)apa.d($$13 * 0.1f));
        float $$15 = $$8[0];
        float $$16 = $$8[1];
        float $$17 = $$8[2];
        $$0.a();
        $$0.a(a.d.rotationDegrees($$12 * 2.25f - 45.0f));
        float $$18 = 0.0f;
        float $$19 = $$9;
        float $$20 = $$9;
        float $$21 = 0.0f;
        float $$22 = -$$9;
        float $$23 = 0.0f;
        float $$24 = 0.0f;
        float $$25 = -$$9;
        float $$26 = 0.0f;
        float $$27 = 1.0f;
        float $$28 = -1.0f + $$14;
        float $$29 = (float)$$7 * $$4 * (0.5f / $$9) + $$28;
        flq.a($$0, $$1.getBuffer(fkf.e($$2, false)), $$15, $$16, $$17, 1.0f, $$6, $$11, 0.0f, $$19, $$20, 0.0f, $$22, 0.0f, 0.0f, $$25, 0.0f, 1.0f, $$29, $$28);
        $$0.b();
        float $$30 = -$$10;
        float $$31 = -$$10;
        float $$32 = $$10;
        float $$33 = -$$10;
        float $$34 = -$$10;
        float $$35 = $$10;
        float $$36 = $$10;
        float $$37 = $$10;
        float $$38 = 0.0f;
        float $$39 = 1.0f;
        float $$40 = -1.0f + $$14;
        float $$41 = (float)$$7 * $$4 + $$40;
        flq.a($$0, $$1.getBuffer(fkf.e($$2, true)), $$15, $$16, $$17, 0.125f, $$6, $$11, $$30, $$31, $$32, $$33, $$34, $$35, $$36, $$37, 0.0f, 1.0f, $$41, $$40);
        $$0.b();
    }

    private static void a(eij $$0, ein $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10, float $$11, float $$12, float $$13, float $$14, float $$15, float $$16, float $$17, float $$18, float $$19) {
        eij.a $$20 = $$0.c();
        Matrix4f $$21 = $$20.a();
        Matrix3f $$22 = $$20.b();
        flq.a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$16, $$17, $$18, $$19);
        flq.a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$14, $$15, $$12, $$13, $$16, $$17, $$18, $$19);
        flq.a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10, $$11, $$14, $$15, $$16, $$17, $$18, $$19);
        flq.a($$21, $$22, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$12, $$13, $$8, $$9, $$16, $$17, $$18, $$19);
    }

    private static void a(Matrix4f $$0, Matrix3f $$1, ein $$2, float $$3, float $$4, float $$5, float $$6, int $$7, int $$8, float $$9, float $$10, float $$11, float $$12, float $$13, float $$14, float $$15, float $$16) {
        flq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9, $$10, $$14, $$15);
        flq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$9, $$10, $$14, $$16);
        flq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$11, $$12, $$13, $$16);
        flq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$11, $$12, $$13, $$15);
    }

    private static void a(Matrix4f $$0, Matrix3f $$1, ein $$2, float $$3, float $$4, float $$5, float $$6, int $$7, float $$8, float $$9, float $$10, float $$11) {
        $$2.a($$0, $$8, (float)$$7, $$9).a($$3, $$4, $$5, $$6).a($$10, $$11).c(fum.d).b(0xF000F0).a($$1, 0.0f, 1.0f, 0.0f).e();
    }

    @Override
    public boolean a(czi $$0) {
        return true;
    }

    @Override
    public int aK_() {
        return 256;
    }

    @Override
    public boolean a(czi $$0, eei $$1) {
        return eei.b($$0.p()).d(1.0, 0.0, 1.0).a((ho)$$1.d(1.0, 0.0, 1.0), (double)this.aK_());
    }
}

