/*
 * Decompiled with CFR 0.152.
 */
public class fdd<T extends bfj>
extends fbo<T> {
    private final fee a;

    public fdd(fee $$0) {
        this.a = $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("cube", fej.c().a(0, 0).a(-4.0f, 16.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("cube", fej.c().a(0, 16).a(-3.0f, 17.0f, -3.0f, 6.0f, 6.0f, 6.0f), feg.a);
        $$1.a("right_eye", fej.c().a(32, 0).a(-3.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f), feg.a);
        $$1.a("left_eye", fej.c().a(32, 4).a(1.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f), feg.a);
        $$1.a("mouth", fej.c().a(32, 8).a(0.0f, 21.0f, -3.5f, 1.0f, 1.0f, 1.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
    }

    @Override
    public fee a() {
        return this.a;
    }
}

