/*
 * Decompiled with CFR 0.152.
 */
public class fdg<T extends bfj>
extends fbo<T> {
    private static final String a = "body0";
    private static final String b = "body1";
    private static final String f = "right_middle_front_leg";
    private static final String g = "left_middle_front_leg";
    private static final String h = "right_middle_hind_leg";
    private static final String i = "left_middle_hind_leg";
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

    public fdg(fee $$0) {
        this.j = $$0;
        this.k = $$0.b("head");
        this.l = $$0.b("right_hind_leg");
        this.m = $$0.b("left_hind_leg");
        this.n = $$0.b(h);
        this.o = $$0.b(i);
        this.p = $$0.b(f);
        this.q = $$0.b(g);
        this.r = $$0.b("right_front_leg");
        this.s = $$0.b("left_front_leg");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 15;
        $$1.a("head", fej.c().a(32, 4).a(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f), feg.a(0.0f, 15.0f, -3.0f));
        $$1.a(a, fej.c().a(0, 0).a(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), feg.a(0.0f, 15.0f, 0.0f));
        $$1.a(b, fej.c().a(0, 12).a(-5.0f, -4.0f, -6.0f, 10.0f, 8.0f, 12.0f), feg.a(0.0f, 15.0f, 9.0f));
        fej $$3 = fej.c().a(18, 0).a(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        fej $$4 = fej.c().a(18, 0).a().a(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        $$1.a("right_hind_leg", $$3, feg.a(-4.0f, 15.0f, 2.0f));
        $$1.a("left_hind_leg", $$4, feg.a(4.0f, 15.0f, 2.0f));
        $$1.a(h, $$3, feg.a(-4.0f, 15.0f, 1.0f));
        $$1.a(i, $$4, feg.a(4.0f, 15.0f, 1.0f));
        $$1.a(f, $$3, feg.a(-4.0f, 15.0f, 0.0f));
        $$1.a(g, $$4, feg.a(4.0f, 15.0f, 0.0f));
        $$1.a("right_front_leg", $$3, feg.a(-4.0f, 15.0f, -1.0f));
        $$1.a("left_front_leg", $$4, feg.a(4.0f, 15.0f, -1.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    public fee a() {
        return this.j;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.k.f = $$4 * ((float)Math.PI / 180);
        this.k.e = $$5 * ((float)Math.PI / 180);
        float $$6 = 0.7853982f;
        this.l.g = -0.7853982f;
        this.m.g = 0.7853982f;
        this.n.g = -0.58119464f;
        this.o.g = 0.58119464f;
        this.p.g = -0.58119464f;
        this.q.g = 0.58119464f;
        this.r.g = -0.7853982f;
        this.s.g = 0.7853982f;
        float $$7 = -0.0f;
        float $$8 = 0.3926991f;
        this.l.f = 0.7853982f;
        this.m.f = -0.7853982f;
        this.n.f = 0.3926991f;
        this.o.f = -0.3926991f;
        this.p.f = -0.3926991f;
        this.q.f = 0.3926991f;
        this.r.f = -0.7853982f;
        this.s.f = 0.7853982f;
        float $$9 = -(apa.b($$1 * 0.6662f * 2.0f + 0.0f) * 0.4f) * $$2;
        float $$10 = -(apa.b($$1 * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * $$2;
        float $$11 = -(apa.b($$1 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * $$2;
        float $$12 = -(apa.b($$1 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * $$2;
        float $$13 = Math.abs(apa.a($$1 * 0.6662f + 0.0f) * 0.4f) * $$2;
        float $$14 = Math.abs(apa.a($$1 * 0.6662f + (float)Math.PI) * 0.4f) * $$2;
        float $$15 = Math.abs(apa.a($$1 * 0.6662f + 1.5707964f) * 0.4f) * $$2;
        float $$16 = Math.abs(apa.a($$1 * 0.6662f + 4.712389f) * 0.4f) * $$2;
        this.l.f += $$9;
        this.m.f += -$$9;
        this.n.f += $$10;
        this.o.f += -$$10;
        this.p.f += $$11;
        this.q.f += -$$11;
        this.r.f += $$12;
        this.s.f += -$$12;
        this.l.g += $$13;
        this.m.g += -$$13;
        this.n.g += $$14;
        this.o.g += -$$14;
        this.p.g += $$15;
        this.q.g += -$$15;
        this.r.g += $$16;
        this.s.g += -$$16;
    }
}

