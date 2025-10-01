/*
 * Decompiled with CFR 0.152.
 */
public interface bxa {
    public static final int l_ = 10;

    public int fY();

    public static boolean a(bfz $$0, bfz $$1) {
        float $$4;
        float $$2 = (float)$$0.b(bhg.f);
        if (!$$0.h_() && (int)$$2 > 0) {
            float $$3 = $$2 / 2.0f + (float)$$0.dI().z.a((int)$$2);
        } else {
            $$4 = $$2;
        }
        boolean $$5 = $$1.a($$0.dJ().b($$0), $$4);
        if ($$5) {
            $$0.a($$0, (bfj)$$1);
            if (!$$0.h_()) {
                bxa.b($$0, $$1);
            }
        }
        return $$5;
    }

    public static void b(bfz $$0, bfz $$1) {
        double $$3;
        double $$2 = $$0.b(bhg.g);
        double $$4 = $$2 - ($$3 = $$1.b(bhg.c));
        if ($$4 <= 0.0) {
            return;
        }
        double $$5 = $$1.dn() - $$0.dn();
        double $$6 = $$1.dt() - $$0.dt();
        float $$7 = $$0.dI().z.a(21) - 10;
        double $$8 = $$4 * (double)($$0.dI().z.i() * 0.5f + 0.2f);
        eei $$9 = new eei($$5, 0.0, $$6).d().a($$8).b($$7);
        double $$10 = $$4 * (double)$$0.dI().z.i() * 0.5;
        $$1.j($$9.c, $$10, $$9.e);
        $$1.S = true;
    }
}

