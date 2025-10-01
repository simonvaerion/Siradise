/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import org.joml.Matrix4f;

public class fmn<T extends dbc>
implements flu<T> {
    public static final acq a = new acq("textures/environment/end_sky.png");
    public static final acq b = new acq("textures/entity/end_portal.png");

    public fmn(flv.a $$0) {
    }

    @Override
    public void a(T $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        Matrix4f $$6 = $$2.c().a();
        this.a($$0, $$6, $$3.getBuffer(this.d()));
    }

    private void a(T $$0, Matrix4f $$1, ein $$2) {
        float $$3 = this.c();
        float $$4 = this.b();
        this.a($$0, $$1, $$2, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, ha.d);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ha.c);
        this.a($$0, $$1, $$2, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, ha.f);
        this.a($$0, $$1, $$2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, ha.e);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, $$3, $$3, 0.0f, 0.0f, 1.0f, 1.0f, ha.a);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, $$4, $$4, 1.0f, 1.0f, 0.0f, 0.0f, ha.b);
    }

    private void a(T $$0, Matrix4f $$1, ein $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, ha $$11) {
        if (((dbc)$$0).a($$11)) {
            $$2.a($$1, $$3, $$5, $$7).e();
            $$2.a($$1, $$4, $$5, $$8).e();
            $$2.a($$1, $$4, $$6, $$9).e();
            $$2.a($$1, $$3, $$6, $$10).e();
        }
    }

    protected float b() {
        return 0.75f;
    }

    protected float c() {
        return 0.375f;
    }

    protected fkf d() {
        return fkf.v();
    }
}

