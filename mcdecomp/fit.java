/*
 * Decompiled with CFR 0.152.
 */
public class fit
extends fgi {
    private static final int a = 12235202;

    protected fit(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fih $$8) {
        super($$0, $$1, $$2, $$3, 0.1f, -0.1f, 0.1f, $$4, $$5, $$6, $$7, $$8, 0.0f, 20, 0.0125f, false);
        this.v = 0.7294118f;
        this.w = 0.69411767f;
        this.x = 0.7607843f;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            apf $$8 = $$1.z;
            double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
            double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
            double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
            return new fit($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0f, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

