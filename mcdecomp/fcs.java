/*
 * Decompiled with CFR 0.152.
 */
public class fcs
extends fbo<bwh> {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;

    public fcs(fee $$0) {
        this.a = $$0;
        this.k = $$0.b("neck");
        this.b = this.k.b("head");
        this.f = this.b.b("mouth");
        this.g = $$0.b("right_hind_leg");
        this.h = $$0.b("left_hind_leg");
        this.i = $$0.b("right_front_leg");
        this.j = $$0.b("left_front_leg");
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 16;
        fen $$3 = $$1.a("neck", fej.c().a(68, 73).a(-5.0f, -1.0f, -18.0f, 10.0f, 10.0f, 18.0f), feg.a(0.0f, -7.0f, 5.5f));
        fen $$4 = $$3.a("head", fej.c().a(0, 0).a(-8.0f, -20.0f, -14.0f, 16.0f, 20.0f, 16.0f).a(0, 0).a(-2.0f, -6.0f, -18.0f, 4.0f, 8.0f, 4.0f), feg.a(0.0f, 16.0f, -17.0f));
        $$4.a("right_horn", fej.c().a(74, 55).a(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), feg.a(-10.0f, -14.0f, -8.0f, 1.0995574f, 0.0f, 0.0f));
        $$4.a("left_horn", fej.c().a(74, 55).a().a(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), feg.a(8.0f, -14.0f, -8.0f, 1.0995574f, 0.0f, 0.0f));
        $$4.a("mouth", fej.c().a(0, 36).a(-8.0f, 0.0f, -16.0f, 16.0f, 3.0f, 16.0f), feg.a(0.0f, -2.0f, 2.0f));
        $$1.a("body", fej.c().a(0, 55).a(-7.0f, -10.0f, -7.0f, 14.0f, 16.0f, 20.0f).a(0, 91).a(-6.0f, 6.0f, -7.0f, 12.0f, 13.0f, 18.0f), feg.a(0.0f, 1.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a("right_hind_leg", fej.c().a(96, 0).a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), feg.a(-8.0f, -13.0f, 18.0f));
        $$1.a("left_hind_leg", fej.c().a(96, 0).a().a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), feg.a(8.0f, -13.0f, 18.0f));
        $$1.a("right_front_leg", fej.c().a(64, 0).a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), feg.a(-8.0f, -13.0f, -5.0f));
        $$1.a("left_front_leg", fej.c().a(64, 0).a().a(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), feg.a(8.0f, -13.0f, -5.0f));
        return fek.a($$0, 128, 128);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(bwh $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.e = $$5 * ((float)Math.PI / 180);
        this.b.f = $$4 * ((float)Math.PI / 180);
        float $$6 = 0.4f * $$2;
        this.g.e = apa.b($$1 * 0.6662f) * $$6;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * $$6;
        this.i.e = apa.b($$1 * 0.6662f + (float)Math.PI) * $$6;
        this.j.e = apa.b($$1 * 0.6662f) * $$6;
    }

    @Override
    public void a(bwh $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        int $$4 = $$0.fY();
        int $$5 = $$0.gi();
        int $$6 = 20;
        int $$7 = $$0.r();
        int $$8 = 10;
        if ($$7 > 0) {
            float $$9 = apa.e((float)$$7 - $$3, 10.0f);
            float $$10 = (1.0f + $$9) * 0.5f;
            float $$11 = $$10 * $$10 * $$10 * 12.0f;
            float $$12 = $$11 * apa.a(this.k.e);
            this.k.d = -6.5f + $$11;
            this.k.c = -7.0f - $$12;
            float $$13 = apa.a(((float)$$7 - $$3) / 10.0f * (float)Math.PI * 0.25f);
            this.f.e = 1.5707964f * $$13;
            this.f.e = $$7 > 5 ? apa.a(((float)(-4 + $$7) - $$3) / 4.0f) * (float)Math.PI * 0.4f : 0.15707964f * apa.a((float)Math.PI * ((float)$$7 - $$3) / 10.0f);
        } else {
            float $$14 = -1.0f;
            float $$15 = -1.0f * apa.a(this.k.e);
            this.k.b = 0.0f;
            this.k.c = -7.0f - $$15;
            this.k.d = 5.5f;
            boolean $$16 = $$4 > 0;
            this.k.e = $$16 ? 0.21991149f : 0.0f;
            this.f.e = (float)Math.PI * ($$16 ? 0.05f : 0.01f);
            if ($$16) {
                double $$17 = (double)$$4 / 40.0;
                this.k.b = (float)Math.sin($$17 * 10.0) * 3.0f;
            } else if ($$5 > 0) {
                float $$18 = apa.a(((float)(20 - $$5) - $$3) / 20.0f * (float)Math.PI * 0.25f);
                this.f.e = 1.5707964f * $$18;
            }
        }
    }
}

