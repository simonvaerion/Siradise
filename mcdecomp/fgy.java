/*
 * Decompiled with CFR 0.152.
 */
public class fgy
extends fim {
    private final fih a;

    protected fgy(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3);
        float $$8;
        this.u = -0.1f;
        this.B = 0.9f;
        this.a = $$7;
        this.j = $$4 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.k = $$5 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.l = $$6 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.v = $$8 = this.r.i() * 0.3f + 0.7f;
        this.w = $$8;
        this.x = $$8;
        this.D = 0.1f * (this.r.i() * this.r.i() * 6.0f + 1.0f);
        this.t = (int)(16.0 / ((double)this.r.i() * 0.8 + 0.2)) + 2;
        this.b($$7);
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.a);
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

