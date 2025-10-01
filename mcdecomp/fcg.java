/*
 * Decompiled with CFR 0.152.
 */
public class fcg<T extends bwe>
extends fbo<T> {
    private static final String a = "tail_base";
    private static final String b = "tail_tip";
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;

    public fcg(fee $$0) {
        this.f = $$0;
        fee $$1 = $$0.b("body");
        this.k = $$1.b(a);
        this.l = this.k.b(b);
        this.g = $$1.b("left_wing_base");
        this.h = this.g.b("left_wing_tip");
        this.i = $$1.b("right_wing_base");
        this.j = this.i.b("right_wing_tip");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("body", fej.c().a(0, 8).a(-3.0f, -2.0f, -8.0f, 5.0f, 3.0f, 9.0f), feg.b(-0.1f, 0.0f, 0.0f));
        fen $$3 = $$2.a(a, fej.c().a(3, 20).a(-2.0f, 0.0f, 0.0f, 3.0f, 2.0f, 6.0f), feg.a(0.0f, -2.0f, 1.0f));
        $$3.a(b, fej.c().a(4, 29).a(-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f), feg.a(0.0f, 0.5f, 6.0f));
        fen $$4 = $$2.a("left_wing_base", fej.c().a(23, 12).a(0.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), feg.a(2.0f, -2.0f, -8.0f, 0.0f, 0.0f, 0.1f));
        $$4.a("left_wing_tip", fej.c().a(16, 24).a(0.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), feg.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f));
        fen $$5 = $$2.a("right_wing_base", fej.c().a(23, 12).a().a(-6.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), feg.a(-3.0f, -2.0f, -8.0f, 0.0f, 0.0f, -0.1f));
        $$5.a("right_wing_tip", fej.c().a(16, 24).a().a(-13.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), feg.a(-6.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f));
        $$2.a("head", fej.c().a(0, 0).a(-4.0f, -2.0f, -5.0f, 7.0f, 3.0f, 5.0f), feg.a(0.0f, 1.0f, -7.0f, 0.2f, 0.0f, 0.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public fee a() {
        return this.f;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = ((float)((bwe)$$0).r() + $$3) * 7.448451f * ((float)Math.PI / 180);
        float $$7 = 16.0f;
        this.g.g = apa.b($$6) * 16.0f * ((float)Math.PI / 180);
        this.h.g = apa.b($$6) * 16.0f * ((float)Math.PI / 180);
        this.i.g = -this.g.g;
        this.j.g = -this.h.g;
        this.k.e = -(5.0f + apa.b($$6 * 2.0f) * 5.0f) * ((float)Math.PI / 180);
        this.l.e = -(5.0f + apa.b($$6 * 2.0f) * 5.0f) * ((float)Math.PI / 180);
    }
}

