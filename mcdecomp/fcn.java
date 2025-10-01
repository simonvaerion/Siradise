/*
 * Decompiled with CFR 0.152.
 */
public class fcn<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee b;
    private final fee f;

    public fcn(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("left_blue_fin");
        this.f = $$0.b("right_blue_fin");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 22;
        $$1.a("body", fej.c().a(12, 22).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f), feg.a(0.0f, 22.0f, 0.0f));
        $$1.a("right_blue_fin", fej.c().a(24, 0).a(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), feg.a(-2.5f, 17.0f, -1.5f));
        $$1.a("left_blue_fin", fej.c().a(24, 3).a(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), feg.a(2.5f, 17.0f, -1.5f));
        $$1.a("top_front_fin", fej.c().a(15, 16).a(-2.5f, -1.0f, 0.0f, 5.0f, 1.0f, 1.0f), feg.a(0.0f, 17.0f, -2.5f, 0.7853982f, 0.0f, 0.0f));
        $$1.a("top_back_fin", fej.c().a(10, 16).a(-2.5f, -1.0f, -1.0f, 5.0f, 1.0f, 1.0f), feg.a(0.0f, 17.0f, 2.5f, -0.7853982f, 0.0f, 0.0f));
        $$1.a("right_front_fin", fej.c().a(8, 16).a(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f), feg.a(-2.5f, 22.0f, -2.5f, 0.0f, -0.7853982f, 0.0f));
        $$1.a("right_back_fin", fej.c().a(8, 16).a(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f), feg.a(-2.5f, 22.0f, 2.5f, 0.0f, 0.7853982f, 0.0f));
        $$1.a("left_back_fin", fej.c().a(4, 16).a(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f), feg.a(2.5f, 22.0f, 2.5f, 0.0f, -0.7853982f, 0.0f));
        $$1.a("left_front_fin", fej.c().a(0, 16).a(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f), feg.a(2.5f, 22.0f, -2.5f, 0.0f, 0.7853982f, 0.0f));
        $$1.a("bottom_back_fin", fej.c().a(8, 22).a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), feg.a(0.5f, 22.0f, 2.5f, 0.7853982f, 0.0f, 0.0f));
        $$1.a("bottom_front_fin", fej.c().a(17, 21).a(-2.5f, 0.0f, 0.0f, 5.0f, 1.0f, 1.0f), feg.a(0.0f, 22.0f, -2.5f, -0.7853982f, 0.0f, 0.0f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.f.g = -0.2f + 0.4f * apa.a($$3 * 0.2f);
        this.b.g = 0.2f - 0.4f * apa.a($$3 * 0.2f);
    }
}

