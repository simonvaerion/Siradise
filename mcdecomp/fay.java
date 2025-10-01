/*
 * Decompiled with CFR 0.152.
 */
public class fay<T extends bfj>
extends fcp<T> {
    public fay(fee $$0) {
        super($$0, false, 10.0f, 4.0f, 2.0f, 2.0f, 24);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        int $$2 = 12;
        $$1.a("head", fej.c().a(0, 0).a(-4.0f, -4.0f, -6.0f, 8.0f, 8.0f, 6.0f).a(22, 0).a("right_horn", -5.0f, -5.0f, -4.0f, 1.0f, 3.0f, 1.0f).a(22, 0).a("left_horn", 4.0f, -5.0f, -4.0f, 1.0f, 3.0f, 1.0f), feg.a(0.0f, 4.0f, -8.0f));
        $$1.a("body", fej.c().a(18, 4).a(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f).a(52, 0).a(-2.0f, 2.0f, -8.0f, 4.0f, 6.0f, 1.0f), feg.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        fej $$3 = fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f);
        $$1.a("right_hind_leg", $$3, feg.a(-4.0f, 12.0f, 7.0f));
        $$1.a("left_hind_leg", $$3, feg.a(4.0f, 12.0f, 7.0f));
        $$1.a("right_front_leg", $$3, feg.a(-4.0f, 12.0f, -6.0f));
        $$1.a("left_front_leg", $$3, feg.a(4.0f, 12.0f, -6.0f));
        return fek.a($$0, 64, 32);
    }

    public fee d() {
        return this.a;
    }
}

