/*
 * Decompiled with CFR 0.152.
 */
public class fdu<T extends buv>
extends fbo<T> {
    private static final String a = "ribcage";
    private static final String b = "center_head";
    private static final String f = "right_head";
    private static final String g = "left_head";
    private static final float h = 0.065f;
    private static final float i = 0.265f;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;
    private final fee o;

    public fdu(fee $$0) {
        this.j = $$0;
        this.n = $$0.b(a);
        this.o = $$0.b("tail");
        this.k = $$0.b(b);
        this.l = $$0.b(f);
        this.m = $$0.b(g);
    }

    public static fek a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        $$2.a("shoulders", fej.c().a(0, 16).a(-10.0f, 3.9f, -0.5f, 20.0f, 3.0f, 3.0f, $$0), feg.a);
        float $$3 = 0.20420352f;
        $$2.a(a, fej.c().a(0, 22).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f, $$0).a(24, 22).a(-4.0f, 1.5f, 0.5f, 11.0f, 2.0f, 2.0f, $$0).a(24, 22).a(-4.0f, 4.0f, 0.5f, 11.0f, 2.0f, 2.0f, $$0).a(24, 22).a(-4.0f, 6.5f, 0.5f, 11.0f, 2.0f, 2.0f, $$0), feg.a(-2.0f, 6.9f, -0.5f, 0.20420352f, 0.0f, 0.0f));
        $$2.a("tail", fej.c().a(12, 22).a(0.0f, 0.0f, 0.0f, 3.0f, 6.0f, 3.0f, $$0), feg.a(-2.0f, 6.9f + apa.b(0.20420352f) * 10.0f, -0.5f + apa.a(0.20420352f) * 10.0f, 0.83252203f, 0.0f, 0.0f));
        $$2.a(b, fej.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), feg.a);
        fej $$4 = fej.c().a(32, 0).a(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, $$0);
        $$2.a(f, $$4, feg.a(-8.0f, 4.0f, 0.0f));
        $$2.a(g, $$4, feg.a(10.0f, 4.0f, 0.0f));
        return fek.a($$1, 64, 64);
    }

    @Override
    public fee a() {
        return this.j;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = apa.b($$3 * 0.1f);
        this.n.e = (0.065f + 0.05f * $$6) * (float)Math.PI;
        this.o.a(-2.0f, 6.9f + apa.b(this.n.e) * 10.0f, -0.5f + apa.a(this.n.e) * 10.0f);
        this.o.e = (0.265f + 0.1f * $$6) * (float)Math.PI;
        this.k.f = $$4 * ((float)Math.PI / 180);
        this.k.e = $$5 * ((float)Math.PI / 180);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        fdu.a($$0, this.l, 0);
        fdu.a($$0, this.m, 1);
    }

    private static <T extends buv> void a(T $$0, fee $$1, int $$2) {
        $$1.f = ($$0.b($$2) - $$0.aV) * ((float)Math.PI / 180);
        $$1.e = $$0.c($$2) * ((float)Math.PI / 180);
    }
}

