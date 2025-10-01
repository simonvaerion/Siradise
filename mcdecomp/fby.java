/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fby<T extends btj>
extends fbf<T> {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;

    public fby(fee $$0) {
        this.a = $$0.b("head");
        this.b = $$0.b("body");
        this.j = $$0.b("right_chest");
        this.k = $$0.b("left_chest");
        this.f = $$0.b("right_hind_leg");
        this.g = $$0.b("left_hind_leg");
        this.h = $$0.b("right_front_leg");
        this.i = $$0.b("left_front_leg");
    }

    public static fek a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        $$2.a("head", fej.c().a(0, 0).a(-2.0f, -14.0f, -10.0f, 4.0f, 4.0f, 9.0f, $$0).a(0, 14).a("neck", -4.0f, -16.0f, -6.0f, 8.0f, 18.0f, 6.0f, $$0).a(17, 0).a("ear", -4.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, $$0).a(17, 0).a("ear", 1.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, $$0), feg.a(0.0f, 7.0f, -6.0f));
        $$2.a("body", fej.c().a(29, 0).a(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f, $$0), feg.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$2.a("right_chest", fej.c().a(45, 28).a(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, $$0), feg.a(-8.5f, 3.0f, 3.0f, 0.0f, 1.5707964f, 0.0f));
        $$2.a("left_chest", fej.c().a(45, 41).a(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, $$0), feg.a(5.5f, 3.0f, 3.0f, 0.0f, 1.5707964f, 0.0f));
        int $$3 = 4;
        int $$4 = 14;
        fej $$5 = fej.c().a(29, 29).a(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, $$0);
        $$2.a("right_hind_leg", $$5, feg.a(-3.5f, 10.0f, 6.0f));
        $$2.a("left_hind_leg", $$5, feg.a(3.5f, 10.0f, 6.0f));
        $$2.a("right_front_leg", $$5, feg.a(-3.5f, 10.0f, -5.0f));
        $$2.a("left_front_leg", $$5, feg.a(3.5f, 10.0f, -5.0f));
        return fek.a($$1, 128, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$6;
        this.a.e = $$5 * ((float)Math.PI / 180);
        this.a.f = $$4 * ((float)Math.PI / 180);
        this.f.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.g.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.i.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.j.k = $$6 = !((bfe)$$0).h_() && ((btj)$$0).r();
        this.k.k = $$6;
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        if (this.e) {
            float $$82 = 2.0f;
            $$0.a();
            float $$9 = 0.7f;
            $$0.b(0.71428573f, 0.64935064f, 0.7936508f);
            $$0.a(0.0f, 1.3125f, 0.22f);
            this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$0.b();
            $$0.a();
            float $$10 = 1.1f;
            $$0.b(0.625f, 0.45454544f, 0.45454544f);
            $$0.a(0.0f, 2.0625f, 0.0f);
            this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$0.b();
            $$0.a();
            $$0.b(0.45454544f, 0.41322312f, 0.45454544f);
            $$0.a(0.0f, 2.0625f, 0.0f);
            ImmutableList.of((Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i, (Object)this.j, (Object)this.k).forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            $$0.b();
        } else {
            ImmutableList.of((Object)this.a, (Object)this.b, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i, (Object)this.j, (Object)this.k).forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
        }
    }
}

