/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fcq<T extends bsf>
extends fbf<T> {
    private static final float a = 50.0f;
    private static final float b = -40.0f;
    private static final String f = "left_haunch";
    private static final String g = "right_haunch";
    private final fee h;
    private final fee i;
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
    private float t;
    private static final float u = 0.6f;

    public fcq(fee $$0) {
        this.h = $$0.b("left_hind_foot");
        this.i = $$0.b("right_hind_foot");
        this.j = $$0.b(f);
        this.k = $$0.b(g);
        this.l = $$0.b("body");
        this.m = $$0.b("left_front_leg");
        this.n = $$0.b("right_front_leg");
        this.o = $$0.b("head");
        this.p = $$0.b("right_ear");
        this.q = $$0.b("left_ear");
        this.r = $$0.b("tail");
        this.s = $$0.b("nose");
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("left_hind_foot", fej.c().a(26, 24).a(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), feg.a(3.0f, 17.5f, 3.7f));
        $$1.a("right_hind_foot", fej.c().a(8, 24).a(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), feg.a(-3.0f, 17.5f, 3.7f));
        $$1.a(f, fej.c().a(30, 15).a(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), feg.a(3.0f, 17.5f, 3.7f, -0.34906584f, 0.0f, 0.0f));
        $$1.a(g, fej.c().a(16, 15).a(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), feg.a(-3.0f, 17.5f, 3.7f, -0.34906584f, 0.0f, 0.0f));
        $$1.a("body", fej.c().a(0, 0).a(-3.0f, -2.0f, -10.0f, 6.0f, 5.0f, 10.0f), feg.a(0.0f, 19.0f, 8.0f, -0.34906584f, 0.0f, 0.0f));
        $$1.a("left_front_leg", fej.c().a(8, 15).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), feg.a(3.0f, 17.0f, -1.0f, -0.17453292f, 0.0f, 0.0f));
        $$1.a("right_front_leg", fej.c().a(0, 15).a(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), feg.a(-3.0f, 17.0f, -1.0f, -0.17453292f, 0.0f, 0.0f));
        $$1.a("head", fej.c().a(32, 0).a(-2.5f, -4.0f, -5.0f, 5.0f, 4.0f, 5.0f), feg.a(0.0f, 16.0f, -1.0f));
        $$1.a("right_ear", fej.c().a(52, 0).a(-2.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), feg.a(0.0f, 16.0f, -1.0f, 0.0f, -0.2617994f, 0.0f));
        $$1.a("left_ear", fej.c().a(58, 0).a(0.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), feg.a(0.0f, 16.0f, -1.0f, 0.0f, 0.2617994f, 0.0f));
        $$1.a("tail", fej.c().a(52, 6).a(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 2.0f), feg.a(0.0f, 20.0f, 7.0f, -0.3490659f, 0.0f, 0.0f));
        $$1.a("nose", fej.c().a(32, 9).a(-0.5f, -2.5f, -5.5f, 1.0f, 1.0f, 1.0f), feg.a(0.0f, 16.0f, -1.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        if (this.e) {
            float $$82 = 1.5f;
            $$0.a();
            $$0.b(0.56666666f, 0.56666666f, 0.56666666f);
            $$0.a(0.0f, 1.375f, 0.125f);
            ImmutableList.of((Object)this.o, (Object)this.q, (Object)this.p, (Object)this.s).forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
            $$0.a();
            $$0.b(0.4f, 0.4f, 0.4f);
            $$0.a(0.0f, 2.25f, 0.0f);
            ImmutableList.of((Object)this.h, (Object)this.i, (Object)this.j, (Object)this.k, (Object)this.l, (Object)this.m, (Object)this.n, (Object)this.r).forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
        } else {
            $$0.a();
            $$0.b(0.6f, 0.6f, 0.6f);
            $$0.a(0.0f, 1.0f, 0.0f);
            ImmutableList.of((Object)this.h, (Object)this.i, (Object)this.j, (Object)this.k, (Object)this.l, (Object)this.m, (Object)this.n, (Object)this.o, (Object)this.p, (Object)this.q, (Object)this.r, (Object)this.s, (Object[])new fee[0]).forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
        }
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = $$3 - (float)((bsf)$$0).ag;
        this.s.e = $$5 * ((float)Math.PI / 180);
        this.o.e = $$5 * ((float)Math.PI / 180);
        this.p.e = $$5 * ((float)Math.PI / 180);
        this.q.e = $$5 * ((float)Math.PI / 180);
        this.s.f = $$4 * ((float)Math.PI / 180);
        this.o.f = $$4 * ((float)Math.PI / 180);
        this.p.f = this.s.f - 0.2617994f;
        this.q.f = this.s.f + 0.2617994f;
        this.t = apa.a(((bsf)$$0).D($$6) * (float)Math.PI);
        this.j.e = (this.t * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.k.e = (this.t * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.h.e = this.t * 50.0f * ((float)Math.PI / 180);
        this.i.e = this.t * 50.0f * ((float)Math.PI / 180);
        this.m.e = (this.t * -40.0f - 11.0f) * ((float)Math.PI / 180);
        this.n.e = (this.t * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.t = apa.a(((bsf)$$0).D($$3) * (float)Math.PI);
    }
}

