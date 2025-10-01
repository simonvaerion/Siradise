/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fbp<T extends bgb>
extends fad<T> {
    private static final float a = 0.87266463f;
    private static final float b = -0.34906584f;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;

    public fbp(fee $$0) {
        super(true, 8.0f, 6.0f, 1.9f, 2.0f, 24.0f);
        this.i = $$0.b("body");
        this.n = this.i.b("mane");
        this.f = $$0.b("head");
        this.g = this.f.b("right_ear");
        this.h = this.f.b("left_ear");
        this.j = $$0.b("right_front_leg");
        this.k = $$0.b("left_front_leg");
        this.l = $$0.b("right_hind_leg");
        this.m = $$0.b("left_hind_leg");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("body", fej.c().a(1, 1).a(-8.0f, -7.0f, -13.0f, 16.0f, 14.0f, 26.0f), feg.a(0.0f, 7.0f, 0.0f));
        $$2.a("mane", fej.c().a(90, 33).a(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, new fei(0.001f)), feg.a(0.0f, -14.0f, -5.0f));
        fen $$3 = $$1.a("head", fej.c().a(61, 1).a(-7.0f, -3.0f, -19.0f, 14.0f, 6.0f, 19.0f), feg.a(0.0f, 2.0f, -12.0f, 0.87266463f, 0.0f, 0.0f));
        $$3.a("right_ear", fej.c().a(1, 1).a(-6.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), feg.a(-6.0f, -2.0f, -3.0f, 0.0f, 0.0f, -0.6981317f));
        $$3.a("left_ear", fej.c().a(1, 6).a(0.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), feg.a(6.0f, -2.0f, -3.0f, 0.0f, 0.0f, 0.6981317f));
        $$3.a("right_horn", fej.c().a(10, 13).a(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), feg.a(-7.0f, 2.0f, -12.0f));
        $$3.a("left_horn", fej.c().a(1, 13).a(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), feg.a(7.0f, 2.0f, -12.0f));
        int $$4 = 14;
        int $$5 = 11;
        $$1.a("right_front_leg", fej.c().a(66, 42).a(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), feg.a(-4.0f, 10.0f, -8.5f));
        $$1.a("left_front_leg", fej.c().a(41, 42).a(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), feg.a(4.0f, 10.0f, -8.5f));
        $$1.a("right_hind_leg", fej.c().a(21, 45).a(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), feg.a(-5.0f, 13.0f, 10.0f));
        $$1.a("left_hind_leg", fej.c().a(0, 45).a(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), feg.a(5.0f, 13.0f, 10.0f));
        return fek.a($$0, 128, 64);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.f);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.i, (Object)this.j, (Object)this.k, (Object)this.l, (Object)this.m);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.g.g = -0.6981317f - $$2 * apa.a($$1);
        this.h.g = 0.6981317f + $$2 * apa.a($$1);
        this.f.f = $$4 * ((float)Math.PI / 180);
        int $$6 = ((bxa)$$0).fY();
        float $$7 = 1.0f - (float)apa.a(10 - 2 * $$6) / 10.0f;
        this.f.e = apa.i($$7, 0.87266463f, -0.34906584f);
        if (((bfz)$$0).h_()) {
            this.f.c = apa.i($$7, 2.0f, 5.0f);
            this.n.d = -3.0f;
        } else {
            this.f.c = 2.0f;
            this.n.d = -7.0f;
        }
        float $$8 = 1.2f;
        this.j.e = apa.b($$1) * 1.2f * $$2;
        this.l.e = this.k.e = apa.b($$1 + (float)Math.PI) * 1.2f * $$2;
        this.m.e = this.j.e;
    }
}

