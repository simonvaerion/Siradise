/*
 * Decompiled with CFR 0.152.
 */
public class fda<T extends bgb>
extends fbs<T> {
    public fda(fee $$0) {
        super($$0);
    }

    public static fek c() {
        fem $$0 = fbs.a(fei.a, 0.0f);
        fen $$1 = $$0.a();
        $$1.a("right_arm", fej.c().a(40, 16).a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", fej.c().a(40, 16).a().a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(5.0f, 2.0f, 0.0f));
        $$1.a("right_leg", fej.c().a(0, 16).a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", fej.c().a(0, 16).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(2.0f, 12.0f, 0.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.s = fbs.a.a;
        this.r = fbs.a.a;
        cfz $$4 = ((bfz)$$0).b(bdw.a);
        if ($$4.a(cgc.nG) && ((bgb)$$0).fS()) {
            if (((bgb)$$0).fh() == bft.b) {
                this.s = fbs.a.d;
            } else {
                this.r = fbs.a.d;
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        cfz $$6 = ((bfz)$$0).eO();
        if (((bgb)$$0).fS() && ($$6.b() || !$$6.a(cgc.nG))) {
            float $$7 = apa.a(this.c * (float)Math.PI);
            float $$8 = apa.a((1.0f - (1.0f - this.c) * (1.0f - this.c)) * (float)Math.PI);
            this.n.g = 0.0f;
            this.o.g = 0.0f;
            this.n.f = -(0.1f - $$7 * 0.6f);
            this.o.f = 0.1f - $$7 * 0.6f;
            this.n.e = -1.5707964f;
            this.o.e = -1.5707964f;
            this.n.e -= $$7 * 1.2f - $$8 * 0.4f;
            this.o.e -= $$7 * 1.2f - $$8 * 0.4f;
            faf.a(this.n, this.o, $$3);
        }
    }

    @Override
    public void a(bft $$0, eij $$1) {
        float $$2 = $$0 == bft.b ? 1.0f : -1.0f;
        fee $$3 = this.a($$0);
        $$3.b += $$2;
        $$3.a($$1);
        $$3.b -= $$2;
    }
}

