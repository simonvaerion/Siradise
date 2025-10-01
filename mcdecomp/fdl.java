/*
 * Decompiled with CFR 0.152.
 */
public class fdl<T extends bfj>
extends fax<T> {
    private final fee a;
    private final fee b;

    public fdl(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("tail");
    }

    public static fek a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        int $$3 = 22;
        $$2.a("body", fej.c().a(0, 0).a(-1.0f, -1.5f, -3.0f, 2.0f, 3.0f, 6.0f, $$0), feg.a(0.0f, 22.0f, 0.0f));
        $$2.a("tail", fej.c().a(22, -6).a(0.0f, -1.5f, 0.0f, 0.0f, 3.0f, 6.0f, $$0), feg.a(0.0f, 22.0f, 3.0f));
        $$2.a("right_fin", fej.c().a(2, 16).a(-2.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, $$0), feg.a(-1.0f, 22.5f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        $$2.a("left_fin", fej.c().a(2, 12).a(0.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, $$0), feg.a(1.0f, 22.5f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        $$2.a("top_fin", fej.c().a(10, -5).a(0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 6.0f, $$0), feg.a(0.0f, 20.5f, -3.0f));
        return fek.a($$1, 32, 32);
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

