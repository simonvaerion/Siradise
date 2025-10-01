/*
 * Decompiled with CFR 0.152.
 */
public class fbt<T extends bvk>
extends fbo<T>
implements fag,
fbn {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;

    public fbt(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("head");
        this.f = this.b.b("hat");
        this.f.k = false;
        this.g = $$0.b("arms");
        this.h = $$0.b("left_leg");
        this.i = $$0.b("right_leg");
        this.k = $$0.b("left_arm");
        this.j = $$0.b("right_arm");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("head", fej.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), feg.a(0.0f, 0.0f, 0.0f));
        $$2.a("hat", fej.c().a(32, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 12.0f, 8.0f, new fei(0.45f)), feg.a);
        $$2.a("nose", fej.c().a(24, 0).a(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f), feg.a(0.0f, -2.0f, 0.0f));
        $$1.a("body", fej.c().a(16, 20).a(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f).a(0, 38).a(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new fei(0.5f)), feg.a(0.0f, 0.0f, 0.0f));
        fen $$3 = $$1.a("arms", fej.c().a(44, 22).a(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f).a(40, 38).a(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f), feg.a(0.0f, 3.0f, -1.0f, -0.75f, 0.0f, 0.0f));
        $$3.a("left_shoulder", fej.c().a(44, 22).a().a(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f), feg.a);
        $$1.a("right_leg", fej.c().a(0, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), feg.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", fej.c().a(0, 22).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), feg.a(2.0f, 12.0f, 0.0f));
        $$1.a("right_arm", fej.c().a(40, 46).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), feg.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", fej.c().a(40, 46).a().a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), feg.a(5.0f, 2.0f, 0.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$7;
        this.b.f = $$4 * ((float)Math.PI / 180);
        this.b.e = $$5 * ((float)Math.PI / 180);
        if (this.d) {
            this.j.e = -0.62831855f;
            this.j.f = 0.0f;
            this.j.g = 0.0f;
            this.k.e = -0.62831855f;
            this.k.f = 0.0f;
            this.k.g = 0.0f;
            this.i.e = -1.4137167f;
            this.i.f = 0.31415927f;
            this.i.g = 0.07853982f;
            this.h.e = -1.4137167f;
            this.h.f = -0.31415927f;
            this.h.g = -0.07853982f;
        } else {
            this.j.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 2.0f * $$2 * 0.5f;
            this.j.f = 0.0f;
            this.j.g = 0.0f;
            this.k.e = apa.b($$1 * 0.6662f) * 2.0f * $$2 * 0.5f;
            this.k.f = 0.0f;
            this.k.g = 0.0f;
            this.i.e = apa.b($$1 * 0.6662f) * 1.4f * $$2 * 0.5f;
            this.i.f = 0.0f;
            this.i.g = 0.0f;
            this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2 * 0.5f;
            this.h.f = 0.0f;
            this.h.g = 0.0f;
        }
        bvk.a $$6 = ((bvk)$$0).q();
        if ($$6 == bvk.a.b) {
            if (((bfz)$$0).eO().b()) {
                faf.a(this.k, this.j, true, this.c, $$3);
            } else {
                faf.a(this.j, this.k, $$0, this.c, $$3);
            }
        } else if ($$6 == bvk.a.c) {
            this.j.d = 0.0f;
            this.j.b = -5.0f;
            this.k.d = 0.0f;
            this.k.b = 5.0f;
            this.j.e = apa.b($$3 * 0.6662f) * 0.25f;
            this.k.e = apa.b($$3 * 0.6662f) * 0.25f;
            this.j.g = 2.3561945f;
            this.k.g = -2.3561945f;
            this.j.f = 0.0f;
            this.k.f = 0.0f;
        } else if ($$6 == bvk.a.d) {
            this.j.f = -0.1f + this.b.f;
            this.j.e = -1.5707964f + this.b.e;
            this.k.e = -0.9424779f + this.b.e;
            this.k.f = this.b.f - 0.4f;
            this.k.g = 1.5707964f;
        } else if ($$6 == bvk.a.e) {
            faf.a(this.j, this.k, this.b, true);
        } else if ($$6 == bvk.a.f) {
            faf.a(this.j, this.k, $$0, true);
        } else if ($$6 == bvk.a.g) {
            this.j.d = 0.0f;
            this.j.b = -5.0f;
            this.j.e = apa.b($$3 * 0.6662f) * 0.05f;
            this.j.g = 2.670354f;
            this.j.f = 0.0f;
            this.k.d = 0.0f;
            this.k.b = 5.0f;
            this.k.e = apa.b($$3 * 0.6662f) * 0.05f;
            this.k.g = -2.3561945f;
            this.k.f = 0.0f;
        }
        this.g.k = $$7 = $$6 == bvk.a.a;
        this.k.k = !$$7;
        this.j.k = !$$7;
    }

    private fee a(bft $$0) {
        if ($$0 == bft.a) {
            return this.k;
        }
        return this.j;
    }

    public fee c() {
        return this.f;
    }

    @Override
    public fee d() {
        return this.b;
    }

    @Override
    public void a(bft $$0, eij $$1) {
        this.a($$0).a($$1);
    }
}

