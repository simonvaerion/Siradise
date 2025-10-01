/*
 * Decompiled with CFR 0.152.
 */
public class fde<T extends btx>
extends fac<T> {
    private static final float a = 9.0f;
    private static final float b = 100.0f;
    private final fee f;
    private final fee g;

    public fde(fee $$0) {
        super(0.5f, 24.0f);
        this.f = $$0.b("root");
        this.g = this.f.b("bone").b("body").b("head");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a().a("root", fej.c(), feg.a(0.0f, 5.0f, 0.0f));
        fen $$2 = $$1.a("bone", fej.c(), feg.a(0.0f, 0.0f, 0.0f));
        fen $$3 = $$2.a("body", fej.c().a(62, 68).a(-12.5f, -14.0f, -20.0f, 25.0f, 29.0f, 40.0f, new fei(0.0f)).a(62, 0).a(-12.5f, -14.0f, -20.0f, 25.0f, 24.0f, 40.0f, new fei(0.5f)).a(87, 68).a(-12.5f, 12.0f, -20.0f, 25.0f, 0.0f, 40.0f, new fei(0.0f)), feg.a(0.0f, 0.0f, 0.0f));
        $$2.a("right_front_leg", fej.c().a(32, 87).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(-7.5f, 10.0f, -15.0f));
        $$2.a("right_mid_leg", fej.c().a(32, 105).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(-7.5f, 10.0f, 0.0f));
        $$2.a("right_hind_leg", fej.c().a(32, 123).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(-7.5f, 10.0f, 15.0f));
        $$2.a("left_front_leg", fej.c().a(0, 87).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(7.5f, 10.0f, -15.0f));
        $$2.a("left_mid_leg", fej.c().a(0, 105).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(7.5f, 10.0f, 0.0f));
        $$2.a("left_hind_leg", fej.c().a(0, 123).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new fei(0.0f)), feg.a(7.5f, 10.0f, 15.0f));
        fen $$4 = $$3.a("head", fej.c().a(8, 15).a(-6.5f, -7.5f, -11.5f, 13.0f, 18.0f, 11.0f, new fei(0.0f)).a(8, 4).a(-6.5f, 7.5f, -11.5f, 13.0f, 0.0f, 11.0f, new fei(0.0f)), feg.a(0.0f, 6.5f, -19.48f));
        $$4.a("left_ear", fej.c().a(2, 0).a(0.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new fei(0.0f)), feg.a(6.51f, -7.5f, -4.51f));
        $$4.a("right_ear", fej.c().a(48, 0).a(-1.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new fei(0.0f)), feg.a(-6.51f, -7.5f, -4.51f));
        $$4.a("nose", fej.c().a(10, 45).a(-6.5f, -2.0f, -9.0f, 13.0f, 2.0f, 9.0f, new fei(0.0f)), feg.a(0.0f, -4.5f, -11.5f));
        $$4.a("lower_beak", fej.c().a(10, 57).a(-6.5f, -7.0f, -8.0f, 13.0f, 12.0f, 9.0f, new fei(0.0f)), feg.a(0.0f, 2.5f, -12.5f));
        return fek.a($$0, 192, 192);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        this.g.e = $$5 * ((float)Math.PI / 180);
        this.g.f = $$4 * ((float)Math.PI / 180);
        if (((btx)$$0).w()) {
            this.a(eoj.e, $$1, $$2, 9.0f, 100.0f);
        } else {
            this.a(eoj.d, $$1, $$2, 9.0f, 100.0f);
        }
        this.a(((btx)$$0).bX, eoj.f, $$3);
        this.a(((btx)$$0).bW, eoj.c, $$3);
        this.a(((btx)$$0).bY, eoj.g, $$3);
        this.a(((btx)$$0).bT, eoj.i, $$3);
        this.a(((btx)$$0).bU, eoj.b, $$3);
        if (this.e) {
            this.a(eoj.a);
        }
    }

    @Override
    public fee a() {
        return this.f;
    }
}

