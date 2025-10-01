/*
 * Decompiled with CFR 0.152.
 */
public class fcj<T extends bgb>
extends fck<T> {
    public final fee a;
    private final fee A;
    private final feg B;
    private final feg C;
    private final feg D;
    private final feg E;

    public fcj(fee $$0) {
        super($$0, false);
        this.a = this.k.b("right_ear");
        this.A = this.k.b("left_ear");
        this.B = this.m.a();
        this.C = this.k.a();
        this.D = this.o.a();
        this.E = this.n.a();
    }

    public static fem a(fei $$0) {
        fem $$1 = fck.a($$0, false);
        fen $$2 = $$1.a();
        $$2.a("body", fej.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), feg.a);
        fcj.a($$0, $$1);
        $$2.a("hat", fej.c(), feg.a);
        return $$1;
    }

    public static void a(fei $$0, fem $$1) {
        fen $$2 = $$1.a();
        fen $$3 = $$2.a("head", fej.c().a(0, 0).a(-5.0f, -8.0f, -4.0f, 10.0f, 8.0f, 8.0f, $$0).a(31, 1).a(-2.0f, -4.0f, -5.0f, 4.0f, 4.0f, 1.0f, $$0).a(2, 4).a(2.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, $$0).a(2, 0).a(-3.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, $$0), feg.a);
        $$3.a("left_ear", fej.c().a(51, 6).a(0.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, $$0), feg.a(4.5f, -6.0f, 0.0f, 0.0f, 0.0f, -0.5235988f));
        $$3.a("right_ear", fej.c().a(39, 6).a(-1.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, $$0), feg.a(-4.5f, -6.0f, 0.0f, 0.0f, 0.0f, 0.5235988f));
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.m.b(this.B);
        this.k.b(this.C);
        this.o.b(this.D);
        this.n.b(this.E);
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        float $$6 = 0.5235988f;
        float $$7 = $$3 * 0.1f + $$1 * 0.5f;
        float $$8 = 0.08f + $$2 * 0.4f;
        this.A.g = -0.5235988f - apa.b($$7 * 1.2f) * $$8;
        this.a.g = 0.5235988f + apa.b($$7) * $$8;
        if ($$0 instanceof bxd) {
            bxd $$9 = (bxd)$$0;
            bxg $$10 = $$9.ga();
            if ($$10 == bxg.e) {
                float $$11 = $$3 / 60.0f;
                this.a.g = 0.5235988f + (float)Math.PI / 180 * apa.a($$11 * 30.0f) * 10.0f;
                this.A.g = -0.5235988f - (float)Math.PI / 180 * apa.b($$11 * 30.0f) * 10.0f;
                this.k.b = apa.a($$11 * 10.0f);
                this.k.c = apa.a($$11 * 40.0f) + 0.4f;
                this.n.g = (float)Math.PI / 180 * (70.0f + apa.b($$11 * 40.0f) * 10.0f);
                this.o.g = this.n.g * -1.0f;
                this.n.c = apa.a($$11 * 40.0f) * 0.5f + 1.5f;
                this.o.c = apa.a($$11 * 40.0f) * 0.5f + 1.5f;
                this.m.c = apa.a($$11 * 40.0f) * 0.35f;
            } else if ($$10 == bxg.a && this.c == 0.0f) {
                this.a($$0);
            } else if ($$10 == bxg.b) {
                faf.a(this.n, this.o, this.k, !((bgb)$$0).fR());
            } else if ($$10 == bxg.c) {
                faf.a(this.n, this.o, $$0, !((bgb)$$0).fR());
            } else if ($$10 == bxg.d) {
                this.k.e = 0.5f;
                this.k.f = 0.0f;
                if (((bgb)$$0).fR()) {
                    this.n.f = -0.5f;
                    this.n.e = -0.9f;
                } else {
                    this.o.f = 0.5f;
                    this.o.e = -0.9f;
                }
            }
        } else if (((bfj)$$0).ae() == bfn.bs) {
            faf.a(this.o, this.n, ((bgb)$$0).fS(), this.c, $$3);
        }
        this.x.a(this.q);
        this.y.a(this.p);
        this.b.a(this.o);
        this.w.a(this.n);
        this.z.a(this.m);
        this.l.a(this.k);
    }

    @Override
    protected void a(T $$0, float $$1) {
        if (this.c > 0.0f && $$0 instanceof bxe && ((bxe)$$0).ga() == bxg.a) {
            faf.a(this.n, this.o, $$0, this.c, $$1);
            return;
        }
        super.a($$0, $$1);
    }

    private void a(T $$0) {
        if (((bgb)$$0).fR()) {
            this.o.e = -1.8f;
        } else {
            this.n.e = -1.8f;
        }
    }
}

