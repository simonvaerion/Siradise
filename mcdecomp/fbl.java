/*
 * Decompiled with CFR 0.152.
 */
public class fbl<T extends btg>
extends fcp<T> {
    public fbl(fee $$0) {
        super($$0, true, 19.0f, 1.0f, 2.5f, 2.0f, 24);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("head", fej.c().a(2, 61).a("right ear", -6.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).a(2, 61).a().a("left ear", 2.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).a(23, 52).a("goatee", -0.5f, -3.0f, -14.0f, 0.0f, 7.0f, 5.0f), feg.a(1.0f, 14.0f, 0.0f));
        $$2.a("left_horn", fej.c().a(12, 55).a(-0.01f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), feg.a(0.0f, 0.0f, 0.0f));
        $$2.a("right_horn", fej.c().a(12, 55).a(-2.99f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), feg.a(0.0f, 0.0f, 0.0f));
        $$2.a("nose", fej.c().a(34, 46).a(-3.0f, -4.0f, -8.0f, 5.0f, 7.0f, 10.0f), feg.a(0.0f, -8.0f, -8.0f, 0.9599f, 0.0f, 0.0f));
        $$1.a("body", fej.c().a(1, 1).a(-4.0f, -17.0f, -7.0f, 9.0f, 11.0f, 16.0f).a(0, 28).a(-5.0f, -18.0f, -8.0f, 11.0f, 14.0f, 11.0f), feg.a(0.0f, 24.0f, 0.0f));
        $$1.a("left_hind_leg", fej.c().a(36, 29).a(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), feg.a(1.0f, 14.0f, 4.0f));
        $$1.a("right_hind_leg", fej.c().a(49, 29).a(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), feg.a(-3.0f, 14.0f, 4.0f));
        $$1.a("left_front_leg", fej.c().a(49, 2).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), feg.a(1.0f, 14.0f, -6.0f));
        $$1.a("right_front_leg", fej.c().a(35, 2).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), feg.a(-3.0f, 14.0f, -6.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a.b((String)"left_horn").k = ((btg)$$0).fY();
        this.a.b((String)"right_horn").k = ((btg)$$0).ge();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        float $$6 = ((btg)$$0).gj();
        if ($$6 != 0.0f) {
            this.a.e = $$6;
        }
    }
}

