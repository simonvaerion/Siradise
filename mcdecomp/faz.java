/*
 * Decompiled with CFR 0.152.
 */
public class faz<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private static final int j = 6;

    public faz(fee $$0) {
        this.a = $$0;
        this.b = $$0.b("head");
        this.g = $$0.b("right_hind_leg");
        this.f = $$0.b("left_hind_leg");
        this.i = $$0.b("right_front_leg");
        this.h = $$0.b("left_front_leg");
    }

    public static fek a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        $$2.a("head", fej.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), feg.a(0.0f, 6.0f, 0.0f));
        $$2.a("body", fej.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), feg.a(0.0f, 6.0f, 0.0f));
        fej $$3 = fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, $$0);
        $$2.a("right_hind_leg", $$3, feg.a(-2.0f, 18.0f, 4.0f));
        $$2.a("left_hind_leg", $$3, feg.a(2.0f, 18.0f, 4.0f));
        $$2.a("right_front_leg", $$3, feg.a(-2.0f, 18.0f, -4.0f));
        $$2.a("left_front_leg", $$3, feg.a(2.0f, 18.0f, -4.0f));
        return fek.a($$1, 64, 32);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.f = $$4 * ((float)Math.PI / 180);
        this.b.e = $$5 * ((float)Math.PI / 180);
        this.f.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.g.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.i.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
    }
}

