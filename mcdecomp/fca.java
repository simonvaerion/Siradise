/*
 * Decompiled with CFR 0.152.
 */
public class fca<T extends bfj>
extends fbo<T> {
    private final fee a;

    public fca(fee $$0) {
        this.a = $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 20;
        int $$3 = 8;
        int $$4 = 16;
        int $$5 = 4;
        $$1.a("bottom", fej.c().a(0, 10).a(-10.0f, -8.0f, -1.0f, 20.0f, 16.0f, 2.0f), feg.a(0.0f, 4.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a("front", fej.c().a(0, 0).a(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f), feg.a(-9.0f, 4.0f, 0.0f, 0.0f, 4.712389f, 0.0f));
        $$1.a("back", fej.c().a(0, 0).a(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f), feg.a(9.0f, 4.0f, 0.0f, 0.0f, 1.5707964f, 0.0f));
        $$1.a("left", fej.c().a(0, 0).a(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f), feg.a(0.0f, 4.0f, -7.0f, 0.0f, (float)Math.PI, 0.0f));
        $$1.a("right", fej.c().a(0, 0).a(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f), feg.a(0.0f, 4.0f, 7.0f));
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

