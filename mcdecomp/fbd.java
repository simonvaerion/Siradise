/*
 * Decompiled with CFR 0.152.
 */
public class fbd<T extends bfz>
extends fbs<T> {
    public boolean a;
    public boolean b;

    public fbd(fee $$0) {
        super($$0);
    }

    public static fek c() {
        float $$0 = -14.0f;
        fem $$1 = fbs.a(fei.a, -14.0f);
        fen $$2 = $$1.a();
        feg $$3 = feg.a(0.0f, -13.0f, 0.0f);
        $$2.a("hat", fej.c().a(0, 16).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new fei(-0.5f)), $$3);
        $$2.a("head", fej.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), $$3);
        $$2.a("body", fej.c().a(32, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f), feg.a(0.0f, -14.0f, 0.0f));
        $$2.a("right_arm", fej.c().a(56, 0).a(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), feg.a(-5.0f, -12.0f, 0.0f));
        $$2.a("left_arm", fej.c().a(56, 0).a().a(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), feg.a(5.0f, -12.0f, 0.0f));
        $$2.a("right_leg", fej.c().a(56, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), feg.a(-2.0f, -5.0f, 0.0f));
        $$2.a("left_leg", fej.c().a(56, 0).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), feg.a(2.0f, -5.0f, 0.0f));
        return fek.a($$1, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.k.k = true;
        int $$6 = -14;
        this.m.e = 0.0f;
        this.m.c = -14.0f;
        this.m.d = -0.0f;
        this.p.e -= 0.0f;
        this.q.e -= 0.0f;
        this.n.e *= 0.5f;
        this.o.e *= 0.5f;
        this.p.e *= 0.5f;
        this.q.e *= 0.5f;
        float $$7 = 0.4f;
        if (this.n.e > 0.4f) {
            this.n.e = 0.4f;
        }
        if (this.o.e > 0.4f) {
            this.o.e = 0.4f;
        }
        if (this.n.e < -0.4f) {
            this.n.e = -0.4f;
        }
        if (this.o.e < -0.4f) {
            this.o.e = -0.4f;
        }
        if (this.p.e > 0.4f) {
            this.p.e = 0.4f;
        }
        if (this.q.e > 0.4f) {
            this.q.e = 0.4f;
        }
        if (this.p.e < -0.4f) {
            this.p.e = -0.4f;
        }
        if (this.q.e < -0.4f) {
            this.q.e = -0.4f;
        }
        if (this.a) {
            this.n.e = -0.5f;
            this.o.e = -0.5f;
            this.n.g = 0.05f;
            this.o.g = -0.05f;
        }
        this.p.d = 0.0f;
        this.q.d = 0.0f;
        this.p.c = -5.0f;
        this.q.c = -5.0f;
        this.k.d = -0.0f;
        this.k.c = -13.0f;
        this.l.b = this.k.b;
        this.l.c = this.k.c;
        this.l.d = this.k.d;
        this.l.e = this.k.e;
        this.l.f = this.k.f;
        this.l.g = this.k.g;
        if (this.b) {
            float $$8 = 1.0f;
            this.k.c -= 5.0f;
        }
        int $$9 = -14;
        this.n.a(-5.0f, -12.0f, 0.0f);
        this.o.a(5.0f, -12.0f, 0.0f);
    }
}

