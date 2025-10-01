/*
 * Decompiled with CFR 0.152.
 */
public class fin
extends fhy {
    fin(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, $$7, 1.25f);
        this.B = 0.6f;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.D *= 0.75f;
        this.t = 60 + this.r.a(12);
        this.b($$7);
        if (this.r.a(4) == 0) {
            this.a(0.6f + this.r.i() * 0.2f, 0.6f + this.r.i() * 0.3f, this.r.i() * 0.2f);
        } else {
            this.a(0.1f + this.r.i() * 0.2f, 0.4f + this.r.i() * 0.3f, this.r.i() * 0.2f);
        }
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fin($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

