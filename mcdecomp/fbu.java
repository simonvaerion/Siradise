/*
 * Decompiled with CFR 0.152.
 */
public class fbu<T extends brx>
extends fbo<T> {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;

    public fbu(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("head");
        this.f = $$0.b("right_arm");
        this.g = $$0.b("left_arm");
        this.h = $$0.b("right_leg");
        this.i = $$0.b("left_leg");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f).a(24, 0).a(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f), feg.a(0.0f, -7.0f, -2.0f));
        $$1.a("body", fej.c().a(0, 40).a(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f).a(0, 70).a(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, new fei(0.5f)), feg.a(0.0f, -7.0f, 0.0f));
        $$1.a("right_arm", fej.c().a(60, 21).a(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), feg.a(0.0f, -7.0f, 0.0f));
        $$1.a("left_arm", fej.c().a(60, 58).a(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), feg.a(0.0f, -7.0f, 0.0f));
        $$1.a("right_leg", fej.c().a(37, 0).a(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), feg.a(-4.0f, 11.0f, 0.0f));
        $$1.a("left_leg", fej.c().a(60, 0).a().a(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), feg.a(5.0f, 11.0f, 0.0f));
        return fek.a($$0, 128, 128);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.f = $$4 * ((float)Math.PI / 180);
        this.b.e = $$5 * ((float)Math.PI / 180);
        this.h.e = -1.5f * apa.e($$1, 13.0f) * $$2;
        this.i.e = 1.5f * apa.e($$1, 13.0f) * $$2;
        this.h.f = 0.0f;
        this.i.f = 0.0f;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        int $$4 = ((brx)$$0).w();
        if ($$4 > 0) {
            this.f.e = -2.0f + 1.5f * apa.e((float)$$4 - $$3, 10.0f);
            this.g.e = -2.0f + 1.5f * apa.e((float)$$4 - $$3, 10.0f);
        } else {
            int $$5 = ((brx)$$0).fY();
            if ($$5 > 0) {
                this.f.e = -0.8f + 0.025f * apa.e((float)$$5, 70.0f);
                this.g.e = 0.0f;
            } else {
                this.f.e = (-0.2f + 1.5f * apa.e($$1, 13.0f)) * $$2;
                this.g.e = (-0.2f - 1.5f * apa.e($$1, 13.0f)) * $$2;
            }
        }
    }

    public fee c() {
        return this.f;
    }
}

