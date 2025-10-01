/*
 * Decompiled with CFR 0.152.
 */
public class fcu<T extends bsh>
extends fcp<T> {
    private float j;

    public fcu(fee $$0) {
        super($$0, false, 8.0f, 4.0f, 2.0f, 2.0f, 24);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-3.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, new fei(0.6f)), feg.a(0.0f, 6.0f, -8.0f));
        $$1.a("body", fej.c().a(28, 8).a(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f, new fei(1.75f)), feg.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        fej $$2 = fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new fei(0.5f));
        $$1.a("right_hind_leg", $$2, feg.a(-3.0f, 12.0f, 7.0f));
        $$1.a("left_hind_leg", $$2, feg.a(3.0f, 12.0f, 7.0f));
        $$1.a("right_front_leg", $$2, feg.a(-3.0f, 12.0f, -5.0f));
        $$1.a("left_front_leg", $$2, feg.a(3.0f, 12.0f, -5.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.a.c = 6.0f + ((bsh)$$0).D($$3) * 9.0f;
        this.j = ((bsh)$$0).E($$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.a.e = this.j;
    }
}

