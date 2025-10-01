/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fpc
extends fox<bfp> {
    private static final acq a = new acq("textures/entity/experience_orb.png");
    private static final fkf f = fkf.f(a);

    public fpc(foy.a $$0) {
        super($$0);
        this.d = 0.15f;
        this.e = 0.75f;
    }

    @Override
    protected int a(bfp $$0, gu $$1) {
        return apa.a(super.a($$0, $$1) + 7, 0, 15);
    }

    @Override
    public void a(bfp $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        int $$6 = $$0.k();
        float $$7 = (float)($$6 % 4 * 16 + 0) / 64.0f;
        float $$8 = (float)($$6 % 4 * 16 + 16) / 64.0f;
        float $$9 = (float)($$6 / 4 * 16 + 0) / 64.0f;
        float $$10 = (float)($$6 / 4 * 16 + 16) / 64.0f;
        float $$11 = 1.0f;
        float $$12 = 0.5f;
        float $$13 = 0.25f;
        float $$14 = 255.0f;
        float $$15 = ((float)$$0.ag + $$2) / 2.0f;
        int $$16 = (int)((apa.a($$15 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        int $$17 = 255;
        int $$18 = (int)((apa.a($$15 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        $$3.a(0.0f, 0.1f, 0.0f);
        $$3.a(this.c.b());
        $$3.a(a.d.rotationDegrees(180.0f));
        float $$19 = 0.3f;
        $$3.b(0.3f, 0.3f, 0.3f);
        ein $$20 = $$4.getBuffer(f);
        eij.a $$21 = $$3.c();
        Matrix4f $$22 = $$21.a();
        Matrix3f $$23 = $$21.b();
        fpc.a($$20, $$22, $$23, -0.5f, -0.25f, $$16, 255, $$18, $$7, $$10, $$5);
        fpc.a($$20, $$22, $$23, 0.5f, -0.25f, $$16, 255, $$18, $$8, $$10, $$5);
        fpc.a($$20, $$22, $$23, 0.5f, 0.75f, $$16, 255, $$18, $$8, $$9, $$5);
        fpc.a($$20, $$22, $$23, -0.5f, 0.75f, $$16, 255, $$18, $$7, $$9, $$5);
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private static void a(ein $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, int $$5, int $$6, int $$7, float $$8, float $$9, int $$10) {
        $$0.a($$1, $$3, $$4, 0.0f).a($$5, $$6, $$7, 128).a($$8, $$9).c(fum.d).b($$10).a($$2, 0.0f, 1.0f, 0.0f).e();
    }

    @Override
    public acq a(bfp $$0) {
        return a;
    }
}

