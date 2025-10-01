/*
 * Decompiled with CFR 0.152.
 */
public class fil
extends fim {
    private final gu a;
    private final float b;
    private final float F;

    public fil(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dcb $$7) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, gu.a($$1, $$2, $$3));
    }

    public fil(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dcb $$7, gu $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.a = $$8;
        this.a(enn.N().am().a().a($$7));
        this.u = 1.0f;
        this.v = 0.6f;
        this.w = 0.6f;
        this.x = 0.6f;
        if (!$$7.a(cpo.i)) {
            int $$9 = enn.N().ax().a($$7, $$0, $$8, 0);
            this.v *= (float)($$9 >> 16 & 0xFF) / 255.0f;
            this.w *= (float)($$9 >> 8 & 0xFF) / 255.0f;
            this.x *= (float)($$9 & 0xFF) / 255.0f;
        }
        this.D /= 2.0f;
        this.b = this.r.i() * 3.0f;
        this.F = this.r.i() * 3.0f;
    }

    @Override
    public fhq b() {
        return fhq.a;
    }

    @Override
    protected float c() {
        return this.E.a((double)((this.b + 1.0f) / 4.0f * 16.0f));
    }

    @Override
    protected float d() {
        return this.E.a((double)(this.b / 4.0f * 16.0f));
    }

    @Override
    protected float e() {
        return this.E.b((double)(this.F / 4.0f * 16.0f));
    }

    @Override
    protected float f() {
        return this.E.b((double)((this.F + 1.0f) / 4.0f * 16.0f));
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        if ($$1 == 0 && this.c.A(this.a)) {
            return fjv.a(this.c, this.a);
        }
        return $$1;
    }

    public static class a
    implements fhp<in> {
        public fhm a(in $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            dcb $$8 = $$0.c();
            if ($$8.i() || $$8.a(cpo.bQ)) {
                return null;
            }
            return new fil($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((in)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

