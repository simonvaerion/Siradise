/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public abstract class fhz
extends fhm {
    protected float D;

    protected fhz(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3);
        this.D = 0.1f * (this.r.i() * 0.5f + 0.5f) * 2.0f;
    }

    protected fhz(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.D = 0.1f * (this.r.i() * 0.5f + 0.5f) * 2.0f;
    }

    @Override
    public void a(ein $$0, emz $$1, float $$2) {
        Quaternionf $$8;
        eei $$3 = $$1.b();
        float $$4 = (float)(apa.d((double)$$2, this.d, this.g) - $$3.a());
        float $$5 = (float)(apa.d((double)$$2, this.e, this.h) - $$3.b());
        float $$6 = (float)(apa.d((double)$$2, this.f, this.i) - $$3.c());
        if (this.z == 0.0f) {
            Quaternionf $$7 = $$1.f();
        } else {
            $$8 = new Quaternionf((Quaternionfc)$$1.f());
            $$8.rotateZ(apa.i($$2, this.A, this.z));
        }
        Vector3f[] $$9 = new Vector3f[]{new Vector3f(-1.0f, -1.0f, 0.0f), new Vector3f(-1.0f, 1.0f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f), new Vector3f(1.0f, -1.0f, 0.0f)};
        float $$10 = this.b($$2);
        for (int $$11 = 0; $$11 < 4; ++$$11) {
            Vector3f $$12 = $$9[$$11];
            $$12.rotate((Quaternionfc)$$8);
            $$12.mul($$10);
            $$12.add($$4, $$5, $$6);
        }
        float $$13 = this.c();
        float $$14 = this.d();
        float $$15 = this.e();
        float $$16 = this.f();
        int $$17 = this.a($$2);
        $$0.a((double)$$9[0].x(), (double)$$9[0].y(), (double)$$9[0].z()).a($$14, $$16).a(this.v, this.w, this.x, this.y).b($$17).e();
        $$0.a((double)$$9[1].x(), (double)$$9[1].y(), (double)$$9[1].z()).a($$14, $$15).a(this.v, this.w, this.x, this.y).b($$17).e();
        $$0.a((double)$$9[2].x(), (double)$$9[2].y(), (double)$$9[2].z()).a($$13, $$15).a(this.v, this.w, this.x, this.y).b($$17).e();
        $$0.a((double)$$9[3].x(), (double)$$9[3].y(), (double)$$9[3].z()).a($$13, $$16).a(this.v, this.w, this.x, this.y).b($$17).e();
    }

    public float b(float $$0) {
        return this.D;
    }

    @Override
    public fhm d(float $$0) {
        this.D *= $$0;
        return super.d($$0);
    }

    protected abstract float c();

    protected abstract float d();

    protected abstract float e();

    protected abstract float f();
}

