/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public abstract class fny<T extends byu>
extends fox<T> {
    public fny(foy.a $$0) {
        super($$0);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        $$3.a(a.d.rotationDegrees(apa.i($$2, ((byu)$$0).M, ((bfj)$$0).dy()) - 90.0f));
        $$3.a(a.f.rotationDegrees(apa.i($$2, ((byu)$$0).N, ((bfj)$$0).dA())));
        boolean $$6 = false;
        float $$7 = 0.0f;
        float $$8 = 0.5f;
        float $$9 = 0.0f;
        float $$10 = 0.15625f;
        float $$11 = 0.0f;
        float $$12 = 0.15625f;
        float $$13 = 0.15625f;
        float $$14 = 0.3125f;
        float $$15 = 0.05625f;
        float $$16 = (float)((byu)$$0).e - $$2;
        if ($$16 > 0.0f) {
            float $$17 = -apa.a($$16 * 3.0f) * $$16;
            $$3.a(a.f.rotationDegrees($$17));
        }
        $$3.a(a.b.rotationDegrees(45.0f));
        $$3.b(0.05625f, 0.05625f, 0.05625f);
        $$3.a(-4.0f, 0.0f, 0.0f);
        ein $$18 = $$4.getBuffer(fkf.c(this.a($$0)));
        eij.a $$19 = $$3.c();
        Matrix4f $$20 = $$19.a();
        Matrix3f $$21 = $$19.b();
        this.a($$20, $$21, $$18, -7, -2, -2, 0.0f, 0.15625f, -1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, -2, 2, 0.15625f, 0.15625f, -1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, 2, 2, 0.15625f, 0.3125f, -1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, 2, -2, 0.0f, 0.3125f, -1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, 2, -2, 0.0f, 0.15625f, 1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, 2, 2, 0.15625f, 0.15625f, 1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, -2, 2, 0.15625f, 0.3125f, 1, 0, 0, $$5);
        this.a($$20, $$21, $$18, -7, -2, -2, 0.0f, 0.3125f, 1, 0, 0, $$5);
        for (int $$22 = 0; $$22 < 4; ++$$22) {
            $$3.a(a.b.rotationDegrees(90.0f));
            this.a($$20, $$21, $$18, -8, -2, 0, 0.0f, 0.0f, 0, 1, 0, $$5);
            this.a($$20, $$21, $$18, 8, -2, 0, 0.5f, 0.0f, 0, 1, 0, $$5);
            this.a($$20, $$21, $$18, 8, 2, 0, 0.5f, 0.15625f, 0, 1, 0, $$5);
            this.a($$20, $$21, $$18, -8, 2, 0, 0.0f, 0.15625f, 0, 1, 0, $$5);
        }
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void a(Matrix4f $$0, Matrix3f $$1, ein $$2, int $$3, int $$4, int $$5, float $$6, float $$7, int $$8, int $$9, int $$10, int $$11) {
        $$2.a($$0, (float)$$3, (float)$$4, (float)$$5).a(255, 255, 255, 255).a($$6, $$7).c(fum.d).b($$11).a($$1, (float)$$8, (float)$$10, (float)$$9).e();
    }
}

