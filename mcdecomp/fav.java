/*
 * Decompiled with CFR 0.152.
 */
public class fav<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee b;

    public fav(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("tail_fin");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 22;
        $$1.a("body", fej.c().a(0, 0).a(-1.0f, -2.0f, 0.0f, 2.0f, 4.0f, 7.0f), feg.a(0.0f, 22.0f, 0.0f));
        $$1.a("head", fej.c().a(11, 0).a(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), feg.a(0.0f, 22.0f, 0.0f));
        $$1.a("nose", fej.c().a(0, 0).a(-1.0f, -2.0f, -1.0f, 2.0f, 3.0f, 1.0f), feg.a(0.0f, 22.0f, -3.0f));
        $$1.a("right_fin", fej.c().a(22, 1).a(-2.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), feg.a(-1.0f, 23.0f, 0.0f, 0.0f, 0.0f, -0.7853982f));
        $$1.a("left_fin", fej.c().a(22, 4).a(0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), feg.a(1.0f, 23.0f, 0.0f, 0.0f, 0.0f, 0.7853982f));
        $$1.a("tail_fin", fej.c().a(22, 3).a(0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 4.0f), feg.a(0.0f, 22.0f, 7.0f));
        $$1.a("top_fin", fej.c().a(20, -6).a(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 6.0f), feg.a(0.0f, 20.0f, 0.0f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = 1.0f;
        if (!((bfj)$$0).aV()) {
            $$6 = 1.5f;
        }
        this.b.f = -$$6 * 0.45f * apa.a(0.6f * $$3);
    }
}

