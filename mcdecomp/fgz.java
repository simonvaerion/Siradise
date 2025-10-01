/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fgz
extends fim {
    private final float a;
    private final fih b;

    fgz(few $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, fih $$7) {
        super($$0, $$1, $$2, $$3);
        this.b = $$7;
        this.v = $$4;
        this.w = $$5;
        this.x = $$6;
        float $$8 = 0.9f;
        this.D *= 0.67499995f;
        int $$9 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
        this.t = (int)Math.max((float)$$9 * 0.9f, 1.0f);
        this.b($$7);
        this.a = ((float)Math.random() - 0.5f) * 0.1f;
        this.z = (float)Math.random() * ((float)Math.PI * 2);
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        this.b(this.b);
        this.A = this.z;
        this.z += (float)Math.PI * this.a * 2.0f;
        if (this.m) {
            this.z = 0.0f;
            this.A = 0.0f;
        }
        this.a(this.j, this.k, this.l);
        this.k -= (double)0.003f;
        this.k = Math.max(this.k, (double)-0.14f);
    }

    public static class a
    implements fhp<in> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        @Nullable
        public fhm a(in $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            dcb $$8 = $$0.c();
            if (!$$8.i() && $$8.l() == cvs.a) {
                return null;
            }
            gu $$9 = gu.a($$2, $$3, $$4);
            int $$10 = enn.N().ax().a($$8, $$1, $$9);
            if ($$8.b() instanceof csf) {
                $$10 = ((csf)$$8.b()).d($$8, $$1, $$9);
            }
            float $$11 = (float)($$10 >> 16 & 0xFF) / 255.0f;
            float $$12 = (float)($$10 >> 8 & 0xFF) / 255.0f;
            float $$13 = (float)($$10 & 0xFF) / 255.0f;
            return new fgz($$1, $$2, $$3, $$4, $$11, $$12, $$13, this.a);
        }

        @Override
        @Nullable
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((in)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

