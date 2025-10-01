/*
 * Decompiled with CFR 0.152.
 */
public class fco<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee b;
    private final fee f;

    public fco(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("left_fin");
        this.f = $$0.b("right_fin");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 23;
        $$1.a("body", fej.c().a(0, 27).a(-1.5f, -2.0f, -1.5f, 3.0f, 2.0f, 3.0f), feg.a(0.0f, 23.0f, 0.0f));
        $$1.a("right_eye", fej.c().a(24, 6).a(-1.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), feg.a(0.0f, 20.0f, 0.0f));
        $$1.a("left_eye", fej.c().a(28, 6).a(0.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), feg.a(0.0f, 20.0f, 0.0f));
        $$1.a("back_fin", fej.c().a(-3, 0).a(-1.5f, 0.0f, 0.0f, 3.0f, 0.0f, 3.0f), feg.a(0.0f, 22.0f, 1.5f));
        $$1.a("right_fin", fej.c().a(25, 0).a(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), feg.a(-1.5f, 22.0f, -1.5f));
        $$1.a("left_fin", fej.c().a(25, 0).a(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), feg.a(1.5f, 22.0f, -1.5f));
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

