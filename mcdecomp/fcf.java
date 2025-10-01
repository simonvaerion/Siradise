/*
 * Decompiled with CFR 0.152.
 */
public class fcf
extends fbo<bsb> {
    private static final String a = "feather";
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;

    public fcf(fee $$0) {
        this.b = $$0;
        this.f = $$0.b("body");
        this.g = $$0.b("tail");
        this.h = $$0.b("left_wing");
        this.i = $$0.b("right_wing");
        this.j = $$0.b("head");
        this.k = this.j.b(a);
        this.l = $$0.b("left_leg");
        this.m = $$0.b("right_leg");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("body", fej.c().a(2, 8).a(-1.5f, 0.0f, -1.5f, 3.0f, 6.0f, 3.0f), feg.a(0.0f, 16.5f, -3.0f));
        $$1.a("tail", fej.c().a(22, 1).a(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 1.0f), feg.a(0.0f, 21.07f, 1.16f));
        $$1.a("left_wing", fej.c().a(19, 8).a(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), feg.a(1.5f, 16.94f, -2.76f));
        $$1.a("right_wing", fej.c().a(19, 8).a(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), feg.a(-1.5f, 16.94f, -2.76f));
        fen $$2 = $$1.a("head", fej.c().a(2, 2).a(-1.0f, -1.5f, -1.0f, 2.0f, 3.0f, 2.0f), feg.a(0.0f, 15.69f, -2.76f));
        $$2.a("head2", fej.c().a(10, 0).a(-1.0f, -0.5f, -2.0f, 2.0f, 1.0f, 4.0f), feg.a(0.0f, -2.0f, -1.0f));
        $$2.a("beak1", fej.c().a(11, 7).a(-0.5f, -1.0f, -0.5f, 1.0f, 2.0f, 1.0f), feg.a(0.0f, -0.5f, -1.5f));
        $$2.a("beak2", fej.c().a(16, 7).a(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f), feg.a(0.0f, -1.75f, -2.45f));
        $$2.a(a, fej.c().a(2, 18).a(0.0f, -4.0f, -2.0f, 0.0f, 5.0f, 4.0f), feg.a(0.0f, -2.15f, 0.15f));
        fej $$3 = fej.c().a(14, 18).a(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        $$1.a("left_leg", $$3, feg.a(1.0f, 22.0f, -1.05f));
        $$1.a("right_leg", $$3, feg.a(-1.0f, 22.0f, -1.05f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public fee a() {
        return this.b;
    }

    @Override
    public void a(bsb $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a(fcf.a($$0), $$0.ag, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void a(bsb $$0, float $$1, float $$2, float $$3) {
        this.a(fcf.a($$0));
    }

    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, int $$8) {
        this.a(fcf$a.e);
        this.a(fcf$a.e, $$8, $$4, $$5, 0.0f, $$6, $$7);
        this.b.a($$0, $$1, $$2, $$3);
    }

    private void a(a $$0, int $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        this.j.e = $$6 * ((float)Math.PI / 180);
        this.j.f = $$5 * ((float)Math.PI / 180);
        this.j.g = 0.0f;
        this.j.b = 0.0f;
        this.f.b = 0.0f;
        this.g.b = 0.0f;
        this.i.b = -1.5f;
        this.h.b = 1.5f;
        switch ($$0) {
            case c: {
                break;
            }
            case d: {
                float $$7 = apa.b((float)$$1);
                float $$8 = apa.a((float)$$1);
                this.j.b = $$7;
                this.j.c = 15.69f + $$8;
                this.j.e = 0.0f;
                this.j.f = 0.0f;
                this.j.g = apa.a((float)$$1) * 0.4f;
                this.f.b = $$7;
                this.f.c = 16.5f + $$8;
                this.h.g = -0.0873f - $$4;
                this.h.b = 1.5f + $$7;
                this.h.c = 16.94f + $$8;
                this.i.g = 0.0873f + $$4;
                this.i.b = -1.5f + $$7;
                this.i.c = 16.94f + $$8;
                this.g.b = $$7;
                this.g.c = 21.07f + $$8;
                break;
            }
            case b: {
                this.l.e += apa.b($$2 * 0.6662f) * 1.4f * $$3;
                this.m.e += apa.b($$2 * 0.6662f + (float)Math.PI) * 1.4f * $$3;
            }
            default: {
                float $$9 = $$4 * 0.3f;
                this.j.c = 15.69f + $$9;
                this.g.e = 1.015f + apa.b($$2 * 0.6662f) * 0.3f * $$3;
                this.g.c = 21.07f + $$9;
                this.f.c = 16.5f + $$9;
                this.h.g = -0.0873f - $$4;
                this.h.c = 16.94f + $$9;
                this.i.g = 0.0873f + $$4;
                this.i.c = 16.94f + $$9;
                this.l.c = 22.0f + $$9;
                this.m.c = 22.0f + $$9;
            }
        }
    }

    private void a(a $$0) {
        this.k.e = -0.2214f;
        this.f.e = 0.4937f;
        this.h.e = -0.6981f;
        this.h.f = (float)(-Math.PI);
        this.i.e = -0.6981f;
        this.i.f = (float)(-Math.PI);
        this.l.e = -0.0299f;
        this.m.e = -0.0299f;
        this.l.c = 22.0f;
        this.m.c = 22.0f;
        this.l.g = 0.0f;
        this.m.g = 0.0f;
        switch ($$0) {
            case a: {
                this.l.e += 0.6981317f;
                this.m.e += 0.6981317f;
                break;
            }
            case c: {
                float $$1 = 1.9f;
                this.j.c = 17.59f;
                this.g.e = 1.5388988f;
                this.g.c = 22.97f;
                this.f.c = 18.4f;
                this.h.g = -0.0873f;
                this.h.c = 18.84f;
                this.i.g = 0.0873f;
                this.i.c = 18.84f;
                this.l.c += 1.9f;
                this.m.c += 1.9f;
                this.l.e += 1.5707964f;
                this.m.e += 1.5707964f;
                break;
            }
            case d: {
                this.l.g = -0.34906584f;
                this.m.g = 0.34906584f;
                break;
            }
        }
    }

    private static a a(bsb $$0) {
        if ($$0.gf()) {
            return fcf$a.d;
        }
        if ($$0.w()) {
            return fcf$a.c;
        }
        if ($$0.gl()) {
            return fcf$a.a;
        }
        return fcf$a.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = fcf$a.a();
        }
    }
}

