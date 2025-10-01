/*
 * Decompiled with CFR 0.152.
 */
public class fao
extends fcb {
    private static final String a = "left_pages";
    private static final String b = "right_pages";
    private static final String c = "flip_page1";
    private static final String d = "flip_page2";
    private final fee e;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;

    public fao(fee $$0) {
        super(fkf::b);
        this.e = $$0;
        this.f = $$0.b("left_lid");
        this.g = $$0.b("right_lid");
        this.h = $$0.b(a);
        this.i = $$0.b(b);
        this.j = $$0.b(c);
        this.k = $$0.b(d);
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("left_lid", fej.c().a(0, 0).a(-6.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), feg.a(0.0f, 0.0f, -1.0f));
        $$1.a("right_lid", fej.c().a(16, 0).a(0.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), feg.a(0.0f, 0.0f, 1.0f));
        $$1.a("seam", fej.c().a(12, 0).a(-1.0f, -5.0f, 0.0f, 2.0f, 10.0f, 0.005f), feg.b(0.0f, 1.5707964f, 0.0f));
        $$1.a(a, fej.c().a(0, 10).a(0.0f, -4.0f, -0.99f, 5.0f, 8.0f, 1.0f), feg.a);
        $$1.a(b, fej.c().a(12, 10).a(0.0f, -4.0f, -0.01f, 5.0f, 8.0f, 1.0f), feg.a);
        fej $$2 = fej.c().a(24, 10).a(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        $$1.a(c, $$2, feg.a);
        $$1.a(d, $$2, feg.a);
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public void b(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public void a(float $$0, float $$1, float $$2, float $$3) {
        float $$4 = (apa.a($$0 * 0.02f) * 0.1f + 1.25f) * $$3;
        this.f.f = (float)Math.PI + $$4;
        this.g.f = -$$4;
        this.h.f = $$4;
        this.i.f = -$$4;
        this.j.f = $$4 - $$4 * 2.0f * $$1;
        this.k.f = $$4 - $$4 * 2.0f * $$2;
        this.h.b = apa.a($$4);
        this.i.b = apa.a($$4);
        this.j.b = apa.a($$4);
        this.k.b = apa.a($$4);
    }
}

