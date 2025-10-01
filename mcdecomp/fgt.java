/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fgt
extends fgv<io> {
    private final Vector3f a;
    private final Vector3f b;

    protected fgt(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, io $$7, fih $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        float $$9 = this.r.i() * 0.4f + 0.6f;
        this.a = this.a($$7.c(), $$9);
        this.b = this.a($$7.d(), $$9);
    }

    private Vector3f a(Vector3f $$0, float $$1) {
        return new Vector3f(this.a($$0.x(), $$1), this.a($$0.y(), $$1), this.a($$0.z(), $$1));
    }

    private void f(float $$0) {
        float $$1 = ((float)this.s + $$0) / ((float)this.t + 1.0f);
        Vector3f $$2 = new Vector3f((Vector3fc)this.a).lerp((Vector3fc)this.b, $$1);
        this.v = $$2.x();
        this.w = $$2.y();
        this.x = $$2.z();
    }

    @Override
    public void a(ein $$0, emz $$1, float $$2) {
        this.f($$2);
        super.a($$0, $$1, $$2);
    }

    public static class a
    implements fhp<io> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(io $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgt($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((io)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

