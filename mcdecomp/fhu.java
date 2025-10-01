/*
 * Decompiled with CFR 0.152.
 */
public abstract class fhu
extends fim {
    protected fhu(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.B = 0.96f;
        this.j = this.j * (double)0.01f + $$4;
        this.k = this.k * (double)0.01f + $$5;
        this.l = this.l * (double)0.01f + $$6;
        this.g += (double)((this.r.i() - this.r.i()) * 0.05f);
        this.h += (double)((this.r.i() - this.r.i()) * 0.05f);
        this.i += (double)((this.r.i() - this.r.i()) * 0.05f);
        this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
    }
}

