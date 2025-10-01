/*
 * Decompiled with CFR 0.152.
 */
public class fbb<T extends bwv>
extends fdw<T> {
    public fbb(fee $$0) {
        super($$0);
    }

    public static fek a(fei $$0) {
        fem $$1 = fbs.a($$0, 0.0f);
        fen $$2 = $$1.a();
        $$2.a("left_arm", fej.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(5.0f, 2.0f, 0.0f));
        $$2.a("left_leg", fej.c().a(16, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(1.9f, 12.0f, 0.0f));
        return fek.a($$1, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.s = fbs.a.a;
        this.r = fbs.a.a;
        cfz $$4 = ((bfz)$$0).b(bdw.a);
        if ($$4.a(cgc.uV) && ((bgb)$$0).fS()) {
            if (((bgb)$$0).fh() == bft.b) {
                this.s = fbs.a.e;
            } else {
                this.r = fbs.a.e;
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (this.r == fbs.a.e) {
            this.o.e = this.o.e * 0.5f - (float)Math.PI;
            this.o.f = 0.0f;
        }
        if (this.s == fbs.a.e) {
            this.n.e = this.n.e * 0.5f - (float)Math.PI;
            this.n.f = 0.0f;
        }
        if (this.u > 0.0f) {
            this.n.e = this.a(this.u, this.n.e, -2.5132742f) + this.u * 0.35f * apa.a(0.1f * $$3);
            this.o.e = this.a(this.u, this.o.e, -2.5132742f) - this.u * 0.35f * apa.a(0.1f * $$3);
            this.n.g = this.a(this.u, this.n.g, -0.15f);
            this.o.g = this.a(this.u, this.o.g, 0.15f);
            this.q.e -= this.u * 0.55f * apa.a(0.1f * $$3);
            this.p.e += this.u * 0.55f * apa.a(0.1f * $$3);
            this.k.e = 0.0f;
        }
    }
}

