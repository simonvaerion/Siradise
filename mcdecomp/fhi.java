/*
 * Decompiled with CFR 0.152.
 */
public class fhi
extends fim {
    fhi(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.u = 0.75f;
        this.B = 0.999f;
        this.j *= (double)0.8f;
        this.k *= (double)0.8f;
        this.l *= (double)0.8f;
        this.k = this.r.i() * 0.4f + 0.05f;
        this.D *= this.r.i() * 2.0f + 0.2f;
        this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        int $$2 = 240;
        int $$3 = $$1 >> 16 & 0xFF;
        return 0xF0 | $$3 << 16;
    }

    @Override
    public float b(float $$0) {
        float $$1 = ((float)this.s + $$0) / (float)this.t;
        return this.D * (1.0f - $$1 * $$1);
    }

    @Override
    public void a() {
        super.a();
        if (!this.o) {
            float $$0 = (float)this.s / (float)this.t;
            if (this.r.i() > $$0) {
                this.c.a(iv.Z, this.g, this.h, this.i, this.j, this.k, this.l);
            }
        }
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhi $$8 = new fhi($$1, $$2, $$3, $$4);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

