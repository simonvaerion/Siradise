/*
 * Decompiled with CFR 0.152.
 */
public class fct<T extends bfj>
extends fbo<T> {
    private static final String a = "body_front";
    private static final String b = "body_back";
    private final fee f;
    private final fee g;

    public fct(fee $$0) {
        this.f = $$0;
        this.g = $$0.b(b);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 20;
        fen $$3 = $$1.a(a, fej.c().a(0, 0).a(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), feg.a(0.0f, 20.0f, 0.0f));
        fen $$4 = $$1.a(b, fej.c().a(0, 13).a(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), feg.a(0.0f, 20.0f, 8.0f));
        $$1.a("head", fej.c().a(22, 0).a(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), feg.a(0.0f, 20.0f, 0.0f));
        $$4.a("back_fin", fej.c().a(20, 10).a(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 6.0f), feg.a(0.0f, 0.0f, 8.0f));
        $$3.a("top_front_fin", fej.c().a(2, 1).a(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f), feg.a(0.0f, -4.5f, 5.0f));
        $$4.a("top_back_fin", fej.c().a(0, 2).a(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f), feg.a(0.0f, -4.5f, -1.0f));
        $$1.a("right_fin", fej.c().a(-4, 0).a(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), feg.a(-1.5f, 21.5f, 0.0f, 0.0f, 0.0f, -0.7853982f));
        $$1.a("left_fin", fej.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), feg.a(1.5f, 21.5f, 0.0f, 0.0f, 0.0f, 0.7853982f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public fee a() {
        return this.f;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = 1.0f;
        float $$7 = 1.0f;
        if (!((bfj)$$0).aV()) {
            $$6 = 1.3f;
            $$7 = 1.7f;
        }
        this.g.f = -$$6 * 0.25f * apa.a($$7 * 0.6f * $$3);
    }
}

