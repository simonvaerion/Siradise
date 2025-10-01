/*
 * Decompiled with CFR 0.152.
 */
public class fdy
extends fdc {
    private final fee a;
    private final fee b;

    public fdy(fee $$0) {
        this.a = $$0.b("head");
        this.b = this.a.b("jaw");
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float $$2 = -16.0f;
        fen $$3 = $$1.a("head", fej.c().a("upper_lip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 176, 44).a("upper_head", -8.0f, -8.0f, -10.0f, 16, 16, 16, 112, 30).a(true).a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0).a(false).a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0), feg.a);
        $$3.a("jaw", fej.c().a(176, 65).a("jaw", -6.0f, 0.0f, -16.0f, 12.0f, 4.0f, 16.0f), feg.a(0.0f, 4.0f, -8.0f));
        return fek.a($$0, 256, 256);
    }

    @Override
    public void a(float $$0, float $$1, float $$2) {
        this.b.e = (float)(Math.sin($$0 * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.a.f = $$1 * ((float)Math.PI / 180);
        this.a.e = $$2 * ((float)Math.PI / 180);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        $$0.a();
        $$0.a(0.0f, -0.374375f, 0.0f);
        $$0.b(0.75f, 0.75f, 0.75f);
        this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        $$0.b();
    }
}

