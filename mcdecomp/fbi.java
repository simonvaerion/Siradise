/*
 * Decompiled with CFR 0.152.
 */
public class fbi<T extends bta>
extends fbo<T> {
    private static final float a = 1.5f;
    private static final float b = 1.0f;
    private static final float f = 2.5f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;
    private final fee o;
    private final fee p;

    public fbi(fee $$0) {
        this.g = $$0.b("root");
        this.h = this.g.b("body");
        this.i = this.h.b("head");
        this.j = this.i.b("eyes");
        this.k = this.h.b("tongue");
        this.l = this.h.b("left_arm");
        this.m = this.h.b("right_arm");
        this.n = this.g.b("left_leg");
        this.o = this.g.b("right_leg");
        this.p = this.h.b("croaking_body");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("root", fej.c(), feg.a(0.0f, 24.0f, 0.0f));
        fen $$3 = $$2.a("body", fej.c().a(3, 1).a(-3.5f, -2.0f, -8.0f, 7.0f, 3.0f, 9.0f).a(23, 22).a(-3.5f, -1.0f, -8.0f, 7.0f, 0.0f, 9.0f), feg.a(0.0f, -2.0f, 4.0f));
        fen $$4 = $$3.a("head", fej.c().a(23, 13).a(-3.5f, -1.0f, -7.0f, 7.0f, 0.0f, 9.0f).a(0, 13).a(-3.5f, -2.0f, -7.0f, 7.0f, 3.0f, 9.0f), feg.a(0.0f, -2.0f, -1.0f));
        fen $$5 = $$4.a("eyes", fej.c(), feg.a(-0.5f, 0.0f, 2.0f));
        $$5.a("right_eye", fej.c().a(0, 0).a(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), feg.a(-1.5f, -3.0f, -6.5f));
        $$5.a("left_eye", fej.c().a(0, 5).a(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), feg.a(2.5f, -3.0f, -6.5f));
        $$3.a("croaking_body", fej.c().a(26, 5).a(-3.5f, -0.1f, -2.9f, 7.0f, 2.0f, 3.0f, new fei(-0.1f)), feg.a(0.0f, -1.0f, -5.0f));
        fen $$6 = $$3.a("tongue", fej.c().a(17, 13).a(-2.0f, 0.0f, -7.1f, 4.0f, 0.0f, 7.0f), feg.a(0.0f, -1.01f, 1.0f));
        fen $$7 = $$3.a("left_arm", fej.c().a(0, 32).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), feg.a(4.0f, -1.0f, -6.5f));
        $$7.a("left_hand", fej.c().a(18, 40).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), feg.a(0.0f, 3.0f, -1.0f));
        fen $$8 = $$3.a("right_arm", fej.c().a(0, 38).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), feg.a(-4.0f, -1.0f, -6.5f));
        $$8.a("right_hand", fej.c().a(2, 40).a(-4.0f, 0.01f, -5.0f, 8.0f, 0.0f, 8.0f), feg.a(0.0f, 3.0f, 0.0f));
        fen $$9 = $$2.a("left_leg", fej.c().a(14, 25).a(-1.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), feg.a(3.5f, -3.0f, 4.0f));
        $$9.a("left_foot", fej.c().a(2, 32).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), feg.a(2.0f, 3.0f, 0.0f));
        fen $$10 = $$2.a("right_leg", fej.c().a(0, 25).a(-2.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), feg.a(-3.5f, -3.0f, 4.0f));
        $$10.a("right_foot", fej.c().a(18, 32).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), feg.a(-2.0f, 3.0f, 0.0f));
        return fek.a($$0, 48, 48);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        this.a(((bta)$$0).bY, eoi.c, $$3);
        this.a(((bta)$$0).bZ, eoi.a, $$3);
        this.a(((bta)$$0).ca, eoi.d, $$3);
        if (((bfj)$$0).aY()) {
            this.a(eoi.e, $$1, $$2, 1.0f, 2.5f);
        } else {
            this.a(eoi.b, $$1, $$2, 1.5f, 2.5f);
        }
        this.a(((bta)$$0).cb, eoi.f, $$3);
        this.p.k = ((bta)$$0).bZ.c();
    }

    @Override
    public fee a() {
        return this.g;
    }
}

