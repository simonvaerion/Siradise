/*
 * Decompiled with CFR 0.152.
 */
public class fce<T extends bsa>
extends fcp<T> {
    private float j;
    private float k;
    private float l;

    public fce(fee $$0) {
        super($$0, true, 23.0f, 4.8f, 2.7f, 3.0f, 49);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 6).a(-6.5f, -5.0f, -4.0f, 13.0f, 10.0f, 9.0f).a(45, 16).a("nose", -3.5f, 0.0f, -6.0f, 7.0f, 5.0f, 2.0f).a(52, 25).a("left_ear", 3.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f).a(52, 25).a("right_ear", -8.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f), feg.a(0.0f, 11.5f, -17.0f));
        $$1.a("body", fej.c().a(0, 25).a(-9.5f, -13.0f, -6.5f, 19.0f, 26.0f, 13.0f), feg.a(0.0f, 10.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        int $$2 = 9;
        int $$3 = 6;
        fej $$4 = fej.c().a(40, 0).a(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        $$1.a("right_hind_leg", $$4, feg.a(-5.5f, 15.0f, 9.0f));
        $$1.a("left_hind_leg", $$4, feg.a(5.5f, 15.0f, 9.0f));
        $$1.a("right_front_leg", $$4, feg.a(-5.5f, 15.0f, -9.0f));
        $$1.a("left_front_leg", $$4, feg.a(5.5f, 15.0f, -9.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.j = ((bsa)$$0).D($$3);
        this.k = ((bsa)$$0).E($$3);
        this.l = ((bfe)$$0).h_() ? 0.0f : ((bsa)$$0).F($$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        boolean $$6 = ((bsa)$$0).q() > 0;
        boolean $$7 = ((bsa)$$0).r();
        int $$8 = ((bsa)$$0).gf();
        boolean $$9 = ((bsa)$$0).ge();
        boolean $$10 = ((bsa)$$0).gq();
        if ($$6) {
            this.a.f = 0.35f * apa.a(0.6f * $$3);
            this.a.g = 0.35f * apa.a(0.6f * $$3);
            this.h.e = -0.75f * apa.a(0.3f * $$3);
            this.i.e = 0.75f * apa.a(0.3f * $$3);
        } else {
            this.a.g = 0.0f;
        }
        if ($$7) {
            if ($$8 < 15) {
                this.a.e = -0.7853982f * (float)$$8 / 14.0f;
            } else if ($$8 < 20) {
                float $$11 = ($$8 - 15) / 5;
                this.a.e = -0.7853982f + 0.7853982f * $$11;
            }
        }
        if (this.j > 0.0f) {
            this.b.e = fcc.a(this.b.e, 1.7407963f, this.j);
            this.a.e = fcc.a(this.a.e, 1.5707964f, this.j);
            this.h.g = -0.27079642f;
            this.i.g = 0.27079642f;
            this.f.g = 0.5707964f;
            this.g.g = -0.5707964f;
            if ($$9) {
                this.a.e = 1.5707964f + 0.2f * apa.a($$3 * 0.6f);
                this.h.e = -0.4f - 0.2f * apa.a($$3 * 0.6f);
                this.i.e = -0.4f - 0.2f * apa.a($$3 * 0.6f);
            }
            if ($$10) {
                this.a.e = 2.1707964f;
                this.h.e = -0.9f;
                this.i.e = -0.9f;
            }
        } else {
            this.f.g = 0.0f;
            this.g.g = 0.0f;
            this.h.g = 0.0f;
            this.i.g = 0.0f;
        }
        if (this.k > 0.0f) {
            this.f.e = -0.6f * apa.a($$3 * 0.15f);
            this.g.e = 0.6f * apa.a($$3 * 0.15f);
            this.h.e = 0.3f * apa.a($$3 * 0.25f);
            this.i.e = -0.3f * apa.a($$3 * 0.25f);
            this.a.e = fcc.a(this.a.e, 1.5707964f, this.k);
        }
        if (this.l > 0.0f) {
            this.a.e = fcc.a(this.a.e, 2.0561945f, this.l);
            this.f.e = -0.5f * apa.a($$3 * 0.5f);
            this.g.e = 0.5f * apa.a($$3 * 0.5f);
            this.h.e = 0.5f * apa.a($$3 * 0.5f);
            this.i.e = -0.5f * apa.a($$3 * 0.5f);
        }
    }
}

