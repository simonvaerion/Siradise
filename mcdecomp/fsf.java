/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fsf<T extends bfz, M extends fck<T>>
extends ftp<T, M> {
    private static final acq a = new acq("textures/entity/bee/bee_stinger.png");

    public fsf(fpz<T, M> $$0) {
        super($$0);
    }

    @Override
    protected int a(T $$0) {
        return ((bfz)$$0).eK();
    }

    @Override
    protected void a(eij $$0, fjx $$1, int $$2, bfj $$3, float $$4, float $$5, float $$6, float $$7) {
        float $$8 = apa.c($$4 * $$4 + $$6 * $$6);
        float $$9 = (float)(Math.atan2($$4, $$6) * 57.2957763671875);
        float $$10 = (float)(Math.atan2($$5, $$8) * 57.2957763671875);
        $$0.a(0.0f, 0.0f, 0.0f);
        $$0.a(a.d.rotationDegrees($$9 - 90.0f));
        $$0.a(a.f.rotationDegrees($$10));
        float $$11 = 0.0f;
        float $$12 = 0.125f;
        float $$13 = 0.0f;
        float $$14 = 0.0625f;
        float $$15 = 0.03125f;
        $$0.a(a.b.rotationDegrees(45.0f));
        $$0.b(0.03125f, 0.03125f, 0.03125f);
        $$0.a(2.5f, 0.0f, 0.0f);
        ein $$16 = $$1.getBuffer(fkf.d(a));
        for (int $$17 = 0; $$17 < 4; ++$$17) {
            $$0.a(a.b.rotationDegrees(90.0f));
            eij.a $$18 = $$0.c();
            Matrix4f $$19 = $$18.a();
            Matrix3f $$20 = $$18.b();
            fsf.a($$16, $$19, $$20, -4.5f, -1, 0.0f, 0.0f, $$2);
            fsf.a($$16, $$19, $$20, 4.5f, -1, 0.125f, 0.0f, $$2);
            fsf.a($$16, $$19, $$20, 4.5f, 1, 0.125f, 0.0625f, $$2);
            fsf.a($$16, $$19, $$20, -4.5f, 1, 0.0f, 0.0625f, $$2);
        }
    }

    private static void a(ein $$0, Matrix4f $$1, Matrix3f $$2, float $$3, int $$4, float $$5, float $$6, int $$7) {
        $$0.a($$1, $$3, (float)$$4, 0.0f).a(255, 255, 255, 255).a($$5, $$6).c(fum.d).b($$7).a($$2, 0.0f, 1.0f, 0.0f).e();
    }
}

