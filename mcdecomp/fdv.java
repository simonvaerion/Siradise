/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fdv<T extends bso>
extends faw<T> {
    private static final String a = "real_head";
    private static final String b = "upper_body";
    private static final String f = "real_tail";
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
    private static final int q = 8;

    public fdv(fee $$0) {
        this.g = $$0.b("head");
        this.h = this.g.b(a);
        this.i = $$0.b("body");
        this.p = $$0.b(b);
        this.j = $$0.b("right_hind_leg");
        this.k = $$0.b("left_hind_leg");
        this.l = $$0.b("right_front_leg");
        this.m = $$0.b("left_front_leg");
        this.n = $$0.b("tail");
        this.o = this.n.b(f);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float $$2 = 13.5f;
        fen $$3 = $$1.a("head", fej.c(), feg.a(-1.0f, 13.5f, -7.0f));
        $$3.a(a, fej.c().a(0, 0).a(-2.0f, -3.0f, -2.0f, 6.0f, 6.0f, 4.0f).a(16, 14).a(-2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f).a(16, 14).a(2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f).a(0, 10).a(-0.5f, -0.001f, -5.0f, 3.0f, 3.0f, 4.0f), feg.a);
        $$1.a("body", fej.c().a(18, 14).a(-3.0f, -2.0f, -3.0f, 6.0f, 9.0f, 6.0f), feg.a(0.0f, 14.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a(b, fej.c().a(21, 0).a(-3.0f, -3.0f, -3.0f, 8.0f, 6.0f, 7.0f), feg.a(-1.0f, 14.0f, -3.0f, 1.5707964f, 0.0f, 0.0f));
        fej $$4 = fej.c().a(0, 18).a(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f);
        $$1.a("right_hind_leg", $$4, feg.a(-2.5f, 16.0f, 7.0f));
        $$1.a("left_hind_leg", $$4, feg.a(0.5f, 16.0f, 7.0f));
        $$1.a("right_front_leg", $$4, feg.a(-2.5f, 16.0f, -4.0f));
        $$1.a("left_front_leg", $$4, feg.a(0.5f, 16.0f, -4.0f));
        fen $$5 = $$1.a("tail", fej.c(), feg.a(-1.0f, 12.0f, 8.0f, 0.62831855f, 0.0f, 0.0f));
        $$5.a(f, fej.c().a(9, 18).a(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.g);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.i, (Object)this.j, (Object)this.k, (Object)this.l, (Object)this.m, (Object)this.n, (Object)this.p);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.n.f = $$0.S_() ? 0.0f : apa.b($$1 * 0.6662f) * 1.4f * $$2;
        if (((bgv)$$0).w()) {
            this.p.a(-1.0f, 16.0f, -3.0f);
            this.p.e = 1.2566371f;
            this.p.f = 0.0f;
            this.i.a(0.0f, 18.0f, 0.0f);
            this.i.e = 0.7853982f;
            this.n.a(-1.0f, 21.0f, 6.0f);
            this.j.a(-2.5f, 22.7f, 2.0f);
            this.j.e = 4.712389f;
            this.k.a(0.5f, 22.7f, 2.0f);
            this.k.e = 4.712389f;
            this.l.e = 5.811947f;
            this.l.a(-2.49f, 17.0f, -4.0f);
            this.m.e = 5.811947f;
            this.m.a(0.51f, 17.0f, -4.0f);
        } else {
            this.i.a(0.0f, 14.0f, 2.0f);
            this.i.e = 1.5707964f;
            this.p.a(-1.0f, 14.0f, -3.0f);
            this.p.e = this.i.e;
            this.n.a(-1.0f, 12.0f, 8.0f);
            this.j.a(-2.5f, 16.0f, 7.0f);
            this.k.a(0.5f, 16.0f, 7.0f);
            this.l.a(-2.5f, 16.0f, -4.0f);
            this.m.a(0.5f, 16.0f, -4.0f);
            this.j.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
            this.k.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
            this.l.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
            this.m.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        }
        this.h.g = ((bso)$$0).E($$3) + ((bso)$$0).f($$3, 0.0f);
        this.p.g = ((bso)$$0).f($$3, -0.08f);
        this.i.g = ((bso)$$0).f($$3, -0.16f);
        this.o.g = ((bso)$$0).f($$3, -0.2f);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.g.e = $$5 * ((float)Math.PI / 180);
        this.g.f = $$4 * ((float)Math.PI / 180);
        this.n.e = $$3;
    }
}

