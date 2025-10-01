/*
 * Decompiled with CFR 0.152.
 */
public class fap<T extends bsx>
extends fbo<T> {
    private static final float a = 2.0f;
    private static final float b = 2.5f;
    private static final float f = 0.45f;
    private static final float g = 29.35f;
    private static final String h = "saddle";
    private static final String i = "bridle";
    private static final String j = "reins";
    private final fee k;
    private final fee l;
    private final fee[] m;
    private final fee[] n;

    public fap(fee $$0) {
        this.k = $$0;
        fee $$1 = $$0.b("body");
        this.l = $$1.b("head");
        this.m = new fee[]{$$1.b(h), this.l.b(i)};
        this.n = new fee[]{this.l.b(j)};
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fei $$2 = new fei(0.1f);
        fen $$3 = $$1.a("body", fej.c().a(0, 25).a(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f), feg.a(0.0f, 4.0f, 9.5f));
        $$3.a("hump", fej.c().a(74, 0).a(-4.5f, -5.0f, -5.5f, 9.0f, 5.0f, 11.0f), feg.a(0.0f, -12.0f, -10.0f));
        $$3.a("tail", fej.c().a(122, 0).a(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 0.0f), feg.a(0.0f, -9.0f, 3.5f));
        fen $$4 = $$3.a("head", fej.c().a(60, 24).a(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f).a(21, 0).a(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f).a(50, 0).a(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f), feg.a(0.0f, -3.0f, -19.5f));
        $$4.a("left_ear", fej.c().a(45, 0).a(-0.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), feg.a(3.0f, -21.0f, -9.5f));
        $$4.a("right_ear", fej.c().a(67, 0).a(-2.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), feg.a(-3.0f, -21.0f, -9.5f));
        $$1.a("left_hind_leg", fej.c().a(58, 16).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), feg.a(4.9f, 1.0f, 9.5f));
        $$1.a("right_hind_leg", fej.c().a(94, 16).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), feg.a(-4.9f, 1.0f, 9.5f));
        $$1.a("left_front_leg", fej.c().a(0, 0).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), feg.a(4.9f, 1.0f, -10.5f));
        $$1.a("right_front_leg", fej.c().a(0, 26).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), feg.a(-4.9f, 1.0f, -10.5f));
        $$3.a(h, fej.c().a(74, 64).a(-4.5f, -17.0f, -15.5f, 9.0f, 5.0f, 11.0f, $$2).a(92, 114).a(-3.5f, -20.0f, -15.5f, 7.0f, 3.0f, 11.0f, $$2).a(0, 89).a(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f, $$2), feg.a(0.0f, 0.0f, 0.0f));
        $$4.a(j, fej.c().a(98, 42).a(3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f).a(84, 57).a(-3.5f, -18.0f, -2.0f, 7.0f, 7.0f, 0.0f).a(98, 42).a(-3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f), feg.a(0.0f, 0.0f, 0.0f));
        $$4.a(i, fej.c().a(60, 87).a(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f, $$2).a(21, 64).a(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f, $$2).a(50, 64).a(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f, $$2).a(74, 70).a(2.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f).a(74, 70).a().a(-3.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f), feg.a(0.0f, 0.0f, 0.0f));
        return fek.a($$0, 128, 128);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        this.a($$0, $$4, $$5, $$3);
        this.a($$0);
        this.a(eoh.a, $$1, $$2, 2.0f, 2.5f);
        this.a(((bsx)$$0).bZ, eoh.b, $$3, 1.0f);
        this.a(((bsx)$$0).ca, eoh.c, $$3, 1.0f);
        this.a(((bsx)$$0).cb, eoh.d, $$3, 1.0f);
        this.a(((bsx)$$0).cc, eoh.f, $$3, 1.0f);
        this.a(((bsx)$$0).cd, eoh.e, $$3, 1.0f);
    }

    @Override
    private void a(T $$0, float $$1, float $$2, float $$3) {
        $$1 = apa.a($$1, -30.0f, 30.0f);
        $$2 = apa.a($$2, -25.0f, 45.0f);
        if (((bsx)$$0).W_() > 0) {
            float $$4 = $$3 - (float)((bsx)$$0).ag;
            float $$5 = 45.0f * ((float)((bsx)$$0).W_() - $$4) / 55.0f;
            $$2 = apa.a($$2 + $$5, -25.0f, 70.0f);
        }
        this.l.f = $$1 * ((float)Math.PI / 180);
        this.l.e = $$2 * ((float)Math.PI / 180);
    }

    private void a(T $$0) {
        boolean $$1 = ((btk)$$0).i();
        boolean $$2 = ((bfj)$$0).bN();
        for (fee $$3 : this.m) {
            $$3.k = $$1;
        }
        for (fee $$4 : this.n) {
            $$4.k = $$2 && $$1;
        }
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        if (this.e) {
            $$0.a();
            $$0.b(0.45f, 0.45f, 0.45f);
            $$0.a(0.0f, 1.834375f, 0.0f);
            this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$0.b();
        } else {
            this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }

    @Override
    public fee a() {
        return this.k;
    }
}

