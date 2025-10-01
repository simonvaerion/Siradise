/*
 * Decompiled with CFR 0.152.
 */
public class fdi<T extends bwp>
extends fbo<T> {
    private static final String a = "right_bottom_bristle";
    private static final String b = "right_middle_bristle";
    private static final String f = "right_top_bristle";
    private static final String g = "left_top_bristle";
    private static final String h = "left_middle_bristle";
    private static final String i = "left_bottom_bristle";
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;
    private final fee o;
    private final fee p;
    private final fee q;
    private final fee r;
    private final fee s;

    public fdi(fee $$0) {
        this.j = $$0;
        this.k = $$0.b("right_leg");
        this.l = $$0.b("left_leg");
        this.m = $$0.b("body");
        this.n = this.m.b(a);
        this.o = this.m.b(b);
        this.p = this.m.b(f);
        this.q = this.m.b(g);
        this.r = this.m.b(h);
        this.s = this.m.b(i);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("right_leg", fej.c().a(0, 32).a(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), feg.a(-4.0f, 8.0f, 0.0f));
        $$1.a("left_leg", fej.c().a(0, 55).a(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), feg.a(4.0f, 8.0f, 0.0f));
        fen $$2 = $$1.a("body", fej.c().a(0, 0).a(-8.0f, -6.0f, -8.0f, 16.0f, 14.0f, 16.0f), feg.a(0.0f, 1.0f, 0.0f));
        $$2.a(a, fej.c().a(16, 65).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), feg.a(-8.0f, 4.0f, -8.0f, 0.0f, 0.0f, -1.2217305f));
        $$2.a(b, fej.c().a(16, 49).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), feg.a(-8.0f, -1.0f, -8.0f, 0.0f, 0.0f, -1.134464f));
        $$2.a(f, fej.c().a(16, 33).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), feg.a(-8.0f, -5.0f, -8.0f, 0.0f, 0.0f, -0.87266463f));
        $$2.a(g, fej.c().a(16, 33).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), feg.a(8.0f, -6.0f, -8.0f, 0.0f, 0.0f, 0.87266463f));
        $$2.a(h, fej.c().a(16, 49).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), feg.a(8.0f, -2.0f, -8.0f, 0.0f, 0.0f, 1.134464f));
        $$2.a(i, fej.c().a(16, 65).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), feg.a(8.0f, 3.0f, -8.0f, 0.0f, 0.0f, 1.2217305f));
        return fek.a($$0, 64, 128);
    }

    @Override
    public void a(bwp $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        $$2 = Math.min(0.25f, $$2);
        if (!$$0.bN()) {
            this.m.e = $$5 * ((float)Math.PI / 180);
            this.m.f = $$4 * ((float)Math.PI / 180);
        } else {
            this.m.e = 0.0f;
            this.m.f = 0.0f;
        }
        float $$6 = 1.5f;
        this.m.g = 0.1f * apa.a($$1 * 1.5f) * 4.0f * $$2;
        this.m.c = 2.0f;
        this.m.c -= 2.0f * apa.b($$1 * 1.5f) * 2.0f * $$2;
        this.l.e = apa.a($$1 * 1.5f * 0.5f) * 2.0f * $$2;
        this.k.e = apa.a($$1 * 1.5f * 0.5f + (float)Math.PI) * 2.0f * $$2;
        this.l.g = 0.17453292f * apa.b($$1 * 1.5f * 0.5f) * $$2;
        this.k.g = 0.17453292f * apa.b($$1 * 1.5f * 0.5f + (float)Math.PI) * $$2;
        this.l.c = 8.0f + 2.0f * apa.a($$1 * 1.5f * 0.5f + (float)Math.PI) * 2.0f * $$2;
        this.k.c = 8.0f + 2.0f * apa.a($$1 * 1.5f * 0.5f) * 2.0f * $$2;
        this.n.g = -1.2217305f;
        this.o.g = -1.134464f;
        this.p.g = -0.87266463f;
        this.q.g = 0.87266463f;
        this.r.g = 1.134464f;
        this.s.g = 1.2217305f;
        float $$7 = apa.b($$1 * 1.5f + (float)Math.PI) * $$2;
        this.n.g += $$7 * 1.3f;
        this.o.g += $$7 * 1.2f;
        this.p.g += $$7 * 0.6f;
        this.q.g += $$7 * 0.6f;
        this.r.g += $$7 * 1.2f;
        this.s.g += $$7 * 1.3f;
        float $$8 = 1.0f;
        float $$9 = 1.0f;
        this.n.g += 0.05f * apa.a($$3 * 1.0f * -0.4f);
        this.o.g += 0.1f * apa.a($$3 * 1.0f * 0.2f);
        this.p.g += 0.1f * apa.a($$3 * 1.0f * 0.4f);
        this.q.g += 0.1f * apa.a($$3 * 1.0f * 0.4f);
        this.r.g += 0.1f * apa.a($$3 * 1.0f * 0.2f);
        this.s.g += 0.05f * apa.a($$3 * 1.0f * -0.4f);
    }

    @Override
    public fee a() {
        return this.j;
    }
}

