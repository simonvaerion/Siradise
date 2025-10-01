/*
 * Decompiled with CFR 0.152.
 */
public class fba<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;

    public fba(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("body");
        this.f = this.b.b("tail");
        this.g = this.f.b("tail_fin");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float $$2 = 18.0f;
        float $$3 = -8.0f;
        fen $$4 = $$1.a("body", fej.c().a(22, 0).a(-4.0f, -7.0f, 0.0f, 8.0f, 7.0f, 13.0f), feg.a(0.0f, 22.0f, -5.0f));
        $$4.a("back_fin", fej.c().a(51, 0).a(-0.5f, 0.0f, 8.0f, 1.0f, 4.0f, 5.0f), feg.b(1.0471976f, 0.0f, 0.0f));
        $$4.a("left_fin", fej.c().a(48, 20).a().a(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), feg.a(2.0f, -2.0f, 4.0f, 1.0471976f, 0.0f, 2.0943952f));
        $$4.a("right_fin", fej.c().a(48, 20).a(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), feg.a(-2.0f, -2.0f, 4.0f, 1.0471976f, 0.0f, -2.0943952f));
        fen $$5 = $$4.a("tail", fej.c().a(0, 19).a(-2.0f, -2.5f, 0.0f, 4.0f, 5.0f, 11.0f), feg.a(0.0f, -2.5f, 11.0f, -0.10471976f, 0.0f, 0.0f));
        $$5.a("tail_fin", fej.c().a(19, 20).a(-5.0f, -0.5f, 0.0f, 10.0f, 1.0f, 6.0f), feg.a(0.0f, 0.0f, 9.0f));
        fen $$6 = $$4.a("head", fej.c().a(0, 0).a(-4.0f, -3.0f, -3.0f, 8.0f, 7.0f, 6.0f), feg.a(0.0f, -4.0f, -3.0f));
        $$6.a("nose", fej.c().a(0, 13).a(-1.0f, 2.0f, -7.0f, 2.0f, 2.0f, 4.0f), feg.a);
        return fek.a($$0, 64, 64);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.e = $$5 * ((float)Math.PI / 180);
        this.b.f = $$4 * ((float)Math.PI / 180);
        if (((bfj)$$0).dl().i() > 1.0E-7) {
            this.b.e += -0.05f - 0.05f * apa.b($$3 * 0.3f);
            this.f.e = -0.1f * apa.b($$3 * 0.3f);
            this.g.e = -0.2f * apa.b($$3 * 0.3f);
        }
    }
}

