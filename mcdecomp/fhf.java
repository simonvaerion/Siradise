/*
 * Decompiled with CFR 0.152.
 */
public class fhf
extends fhk {
    private int a;
    private final int b;

    fhf(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.b = 8;
    }

    @Override
    public void a() {
        for (int $$0 = 0; $$0 < 6; ++$$0) {
            double $$1 = this.g + (this.r.j() - this.r.j()) * 4.0;
            double $$2 = this.h + (this.r.j() - this.r.j()) * 4.0;
            double $$3 = this.i + (this.r.j() - this.r.j()) * 4.0;
            this.c.a(iv.x, $$1, $$2, $$3, (double)((float)this.a / (float)this.b), 0.0, 0.0);
        }
        ++this.a;
        if (this.a == this.b) {
            this.k();
        }
    }

    public static class a
    implements fhp<iy> {
        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fhf($$1, $$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

