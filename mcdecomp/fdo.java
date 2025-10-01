/*
 * Decompiled with CFR 0.152.
 */
public class fdo
extends fbo<bwq>
implements fag {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;

    public fdo(fee $$0) {
        super(fkf::h);
        this.a = $$0.b("root");
        this.b = this.a.b("body");
        this.f = this.b.b("right_arm");
        this.g = this.b.b("left_arm");
        this.h = this.b.b("right_wing");
        this.i = this.b.b("left_wing");
        this.j = this.a.b("head");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("root", fej.c(), feg.a(0.0f, -2.5f, 0.0f));
        $$2.a("head", fej.c().a(0, 0).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new fei(0.0f)), feg.a(0.0f, 20.0f, 0.0f));
        fen $$3 = $$2.a("body", fej.c().a(0, 10).a(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new fei(0.0f)).a(0, 16).a(-1.5f, 1.0f, -1.0f, 3.0f, 5.0f, 2.0f, new fei(-0.2f)), feg.a(0.0f, 20.0f, 0.0f));
        $$3.a("right_arm", fej.c().a(23, 0).a(-1.25f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new fei(-0.1f)), feg.a(-1.75f, 0.25f, 0.0f));
        $$3.a("left_arm", fej.c().a(23, 6).a(-0.75f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new fei(-0.1f)), feg.a(1.75f, 0.25f, 0.0f));
        $$3.a("left_wing", fej.c().a(16, 14).a().a(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new fei(0.0f)).a(false), feg.a(0.5f, 1.0f, 1.0f));
        $$3.a("right_wing", fej.c().a(16, 14).a(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new fei(0.0f)), feg.a(-0.5f, 1.0f, 1.0f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public void a(bwq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        this.j.f = $$4 * ((float)Math.PI / 180);
        this.j.e = $$5 * ((float)Math.PI / 180);
        float $$6 = apa.b($$3 * 5.5f * ((float)Math.PI / 180)) * 0.1f;
        this.f.g = 0.62831855f + $$6;
        this.g.g = -(0.62831855f + $$6);
        if ($$0.fY()) {
            this.b.e = 0.0f;
            this.a($$0.eO(), $$0.eP(), $$6);
        } else {
            this.b.e = 0.15707964f;
        }
        this.i.f = 1.0995574f + apa.b($$3 * 45.836624f * ((float)Math.PI / 180)) * ((float)Math.PI / 180) * 16.2f;
        this.h.f = -this.i.f;
        this.i.e = 0.47123888f;
        this.i.g = -0.47123888f;
        this.h.e = 0.47123888f;
        this.h.g = 0.47123888f;
    }

    private void a(cfz $$0, cfz $$1, float $$2) {
        if ($$0.b() && $$1.b()) {
            this.f.e = -1.2217305f;
            this.f.f = 0.2617994f;
            this.f.g = -0.47123888f - $$2;
            this.g.e = -1.2217305f;
            this.g.f = -0.2617994f;
            this.g.g = 0.47123888f + $$2;
            return;
        }
        if (!$$0.b()) {
            this.f.e = 3.6651914f;
            this.f.f = 0.2617994f;
            this.f.g = -0.47123888f - $$2;
        }
        if (!$$1.b()) {
            this.g.e = 3.6651914f;
            this.g.f = -0.2617994f;
            this.g.g = 0.47123888f + $$2;
        }
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(bft $$0, eij $$1) {
        boolean $$2 = $$0 == bft.b;
        fee $$3 = $$2 ? this.f : this.g;
        this.a.a($$1);
        this.b.a($$1);
        $$3.a($$1);
        $$1.b(0.55f, 0.55f, 0.55f);
        this.a($$1, $$2);
    }

    private void a(eij $$0, boolean $$1) {
        if ($$1) {
            $$0.a(0.046875, -0.15625, 0.078125);
        } else {
            $$0.a(-0.046875, -0.15625, 0.078125);
        }
    }
}

