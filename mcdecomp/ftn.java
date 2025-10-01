/*
 * Decompiled with CFR 0.152.
 */
public class ftn<T extends bfz>
extends ftg<T, fck<T>> {
    public static final acq a = new acq("textures/entity/trident_riptide.png");
    public static final String b = "box";
    private final fee c;

    public ftn(fqt<T, fck<T>> $$0, fea $$1) {
        super($$0);
        fee $$2 = $$1.a(fed.aT);
        this.c = $$2.b(b);
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(b, fej.c().a(0, 0).a(-8.0f, -16.0f, -8.0f, 16.0f, 32.0f, 16.0f), feg.a);
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (!((bfz)$$3).fe()) {
            return;
        }
        ein $$10 = $$1.getBuffer(fkf.d(a));
        for (int $$11 = 0; $$11 < 3; ++$$11) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75f * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0f, -0.2f + 0.6f * (float)$$11, 0.0f);
            this.c.a($$0, $$10, $$2, fum.d);
            $$0.b();
        }
    }
}

