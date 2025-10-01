/*
 * Decompiled with CFR 0.152.
 */
public class fgv<T extends iq>
extends fim {
    private final fih a;

    protected fgv(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, T $$7, fih $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.B = 0.96f;
        this.C = true;
        this.a = $$8;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        float $$9 = this.r.i() * 0.4f + 0.6f;
        this.v = this.a(((iq)$$7).e().x(), $$9);
        this.w = this.a(((iq)$$7).e().y(), $$9);
        this.x = this.a(((iq)$$7).e().z(), $$9);
        this.D *= 0.75f * ((iq)$$7).f();
        int $$10 = (int)(8.0 / (this.r.j() * 0.8 + 0.2));
        this.t = (int)Math.max((float)$$10 * ((iq)$$7).f(), 1.0f);
        this.b($$8);
    }

    protected float a(float $$0, float $$1) {
        return (this.r.i() * 0.2f + 0.8f) * $$0 * $$1;
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
        super.a();
        this.b(this.a);
    }
}

