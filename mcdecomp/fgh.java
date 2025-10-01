/*
 * Decompiled with CFR 0.152.
 */
public class fgh
extends fim {
    private final fih a;

    fgh(few $$0, double $$1, double $$2, double $$3, double $$4, fih $$5) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        float $$6;
        this.a = $$5;
        this.t = 4;
        this.v = $$6 = this.r.i() * 0.6f + 0.4f;
        this.w = $$6;
        this.x = $$6;
        this.D = 1.0f - (float)$$4 * 0.5f;
        this.b($$5);
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
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
        this.b(this.a);
    }

    @Override
    public fhq b() {
        return fhq.d;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgh($$1, $$2, $$3, $$4, $$5, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

