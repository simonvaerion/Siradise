/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fau<T extends bfj>
extends fad<T> {
    public static final String a = "red_thing";
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;

    public fau(fee $$0) {
        this.b = $$0.b("head");
        this.k = $$0.b("beak");
        this.l = $$0.b(a);
        this.f = $$0.b("body");
        this.g = $$0.b("right_leg");
        this.h = $$0.b("left_leg");
        this.i = $$0.b("right_wing");
        this.j = $$0.b("left_wing");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 16;
        $$1.a("head", fej.c().a(0, 0).a(-2.0f, -6.0f, -2.0f, 4.0f, 6.0f, 3.0f), feg.a(0.0f, 15.0f, -4.0f));
        $$1.a("beak", fej.c().a(14, 0).a(-2.0f, -4.0f, -4.0f, 4.0f, 2.0f, 2.0f), feg.a(0.0f, 15.0f, -4.0f));
        $$1.a(a, fej.c().a(14, 4).a(-1.0f, -2.0f, -3.0f, 2.0f, 2.0f, 2.0f), feg.a(0.0f, 15.0f, -4.0f));
        $$1.a("body", fej.c().a(0, 9).a(-3.0f, -4.0f, -3.0f, 6.0f, 8.0f, 6.0f), feg.a(0.0f, 16.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        fej $$3 = fej.c().a(26, 0).a(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        $$1.a("right_leg", $$3, feg.a(-2.0f, 19.0f, 1.0f));
        $$1.a("left_leg", $$3, feg.a(1.0f, 19.0f, 1.0f));
        $$1.a("right_wing", fej.c().a(24, 13).a(0.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), feg.a(-4.0f, 13.0f, 0.0f));
        $$1.a("left_wing", fej.c().a(24, 13).a(-1.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), feg.a(4.0f, 13.0f, 0.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.b, (Object)this.k, (Object)this.l);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i, (Object)this.j);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.e = $$5 * ((float)Math.PI / 180);
        this.b.f = $$4 * ((float)Math.PI / 180);
        this.k.e = this.b.e;
        this.k.f = this.b.f;
        this.l.e = this.b.e;
        this.l.f = this.b.f;
        this.g.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.i.g = $$3;
        this.j.g = -$$3;
    }
}

