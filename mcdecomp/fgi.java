/*
 * Decompiled with CFR 0.152.
 */
public class fgi
extends fim {
    private final fih a;

    protected fgi(few $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, double $$7, double $$8, double $$9, float $$10, fih $$11, float $$12, int $$13, float $$14, boolean $$15) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        float $$16;
        this.B = 0.96f;
        this.u = $$14;
        this.C = true;
        this.a = $$11;
        this.j *= (double)$$4;
        this.k *= (double)$$5;
        this.l *= (double)$$6;
        this.j += $$7;
        this.k += $$8;
        this.l += $$9;
        this.v = $$16 = $$0.z.i() * $$12;
        this.w = $$16;
        this.x = $$16;
        this.D *= 0.75f * $$10;
        this.t = (int)((double)$$13 / ((double)$$0.z.i() * 0.8 + 0.2) * (double)$$10);
        this.t = Math.max(this.t, 1);
        this.b($$11);
        this.n = $$15;
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

