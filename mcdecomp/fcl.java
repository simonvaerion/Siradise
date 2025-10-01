/*
 * Decompiled with CFR 0.152.
 */
public class fcl<T extends bsd>
extends fcp<T> {
    public fcl(fee $$0) {
        super($$0, true, 16.0f, 4.0f, 2.25f, 2.0f, 24);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-3.5f, -3.0f, -3.0f, 7.0f, 7.0f, 7.0f).a(0, 44).a("mouth", -2.5f, 1.0f, -6.0f, 5.0f, 3.0f, 3.0f).a(26, 0).a("right_ear", -4.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f).a(26, 0).a().a("left_ear", 2.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f), feg.a(0.0f, 10.0f, -16.0f));
        $$1.a("body", fej.c().a(0, 19).a(-5.0f, -13.0f, -7.0f, 14.0f, 14.0f, 11.0f).a(39, 0).a(-4.0f, -25.0f, -7.0f, 12.0f, 12.0f, 10.0f), feg.a(-2.0f, 9.0f, 12.0f, 1.5707964f, 0.0f, 0.0f));
        int $$2 = 10;
        fej $$3 = fej.c().a(50, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f);
        $$1.a("right_hind_leg", $$3, feg.a(-4.5f, 14.0f, 6.0f));
        $$1.a("left_hind_leg", $$3, feg.a(4.5f, 14.0f, 6.0f));
        fej $$4 = fej.c().a(50, 40).a(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f);
        $$1.a("right_front_leg", $$4, feg.a(-3.5f, 14.0f, -8.0f));
        $$1.a("left_front_leg", $$4, feg.a(3.5f, 14.0f, -8.0f));
        return fek.a($$0, 128, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        float $$6 = $$3 - (float)((bsd)$$0).ag;
        float $$7 = ((bsd)$$0).D($$6);
        $$7 *= $$7;
        float $$8 = 1.0f - $$7;
        this.b.e = 1.5707964f - $$7 * (float)Math.PI * 0.35f;
        this.b.c = 9.0f * $$8 + 11.0f * $$7;
        this.h.c = 14.0f * $$8 - 6.0f * $$7;
        this.h.d = -8.0f * $$8 - 4.0f * $$7;
        this.h.e -= $$7 * (float)Math.PI * 0.45f;
        this.i.c = this.h.c;
        this.i.d = this.h.d;
        this.i.e -= $$7 * (float)Math.PI * 0.45f;
        if (this.e) {
            this.a.c = 10.0f * $$8 - 9.0f * $$7;
            this.a.d = -16.0f * $$8 - 7.0f * $$7;
        } else {
            this.a.c = 10.0f * $$8 - 14.0f * $$7;
            this.a.d = -16.0f * $$8 - 3.0f * $$7;
        }
        this.a.e += $$7 * (float)Math.PI * 0.15f;
    }
}

