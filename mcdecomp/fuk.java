/*
 * Decompiled with CFR 0.152.
 */
public class fuk {
    private static final int a = 96;
    private static final float[] b = ac.a(new float[256], $$0 -> {
        for (int $$1 = 0; $$1 < ((float[])$$0).length; ++$$1) {
            $$0[$$1] = (float)Math.pow((float)$$1 / 255.0f, 2.2);
        }
    });

    private fuk() {
    }

    public static ehk[] a(ehk[] $$0, int $$1) {
        if ($$1 + 1 <= $$0.length) {
            return $$0;
        }
        ehk[] $$2 = new ehk[$$1 + 1];
        $$2[0] = $$0[0];
        boolean $$3 = fuk.a($$2[0]);
        for (int $$4 = 1; $$4 <= $$1; ++$$4) {
            if ($$4 < $$0.length) {
                $$2[$$4] = $$0[$$4];
                continue;
            }
            ehk $$5 = $$2[$$4 - 1];
            ehk $$6 = new ehk($$5.a() >> 1, $$5.b() >> 1, false);
            int $$7 = $$6.a();
            int $$8 = $$6.b();
            for (int $$9 = 0; $$9 < $$7; ++$$9) {
                for (int $$10 = 0; $$10 < $$8; ++$$10) {
                    $$6.a($$9, $$10, fuk.a($$5.a($$9 * 2 + 0, $$10 * 2 + 0), $$5.a($$9 * 2 + 1, $$10 * 2 + 0), $$5.a($$9 * 2 + 0, $$10 * 2 + 1), $$5.a($$9 * 2 + 1, $$10 * 2 + 1), $$3));
                }
            }
            $$2[$$4] = $$6;
        }
        return $$2;
    }

    private static boolean a(ehk $$0) {
        for (int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            for (int $$2 = 0; $$2 < $$0.b(); ++$$2) {
                if ($$0.a($$1, $$2) >> 24 != 0) continue;
                return true;
            }
        }
        return false;
    }

    private static int a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
        if ($$4) {
            float $$5 = 0.0f;
            float $$6 = 0.0f;
            float $$7 = 0.0f;
            float $$8 = 0.0f;
            if ($$0 >> 24 != 0) {
                $$5 += fuk.a($$0 >> 24);
                $$6 += fuk.a($$0 >> 16);
                $$7 += fuk.a($$0 >> 8);
                $$8 += fuk.a($$0 >> 0);
            }
            if ($$1 >> 24 != 0) {
                $$5 += fuk.a($$1 >> 24);
                $$6 += fuk.a($$1 >> 16);
                $$7 += fuk.a($$1 >> 8);
                $$8 += fuk.a($$1 >> 0);
            }
            if ($$2 >> 24 != 0) {
                $$5 += fuk.a($$2 >> 24);
                $$6 += fuk.a($$2 >> 16);
                $$7 += fuk.a($$2 >> 8);
                $$8 += fuk.a($$2 >> 0);
            }
            if ($$3 >> 24 != 0) {
                $$5 += fuk.a($$3 >> 24);
                $$6 += fuk.a($$3 >> 16);
                $$7 += fuk.a($$3 >> 8);
                $$8 += fuk.a($$3 >> 0);
            }
            int $$9 = (int)(Math.pow($$5 /= 4.0f, 0.45454545454545453) * 255.0);
            int $$10 = (int)(Math.pow($$6 /= 4.0f, 0.45454545454545453) * 255.0);
            int $$11 = (int)(Math.pow($$7 /= 4.0f, 0.45454545454545453) * 255.0);
            int $$12 = (int)(Math.pow($$8 /= 4.0f, 0.45454545454545453) * 255.0);
            if ($$9 < 96) {
                $$9 = 0;
            }
            return $$9 << 24 | $$10 << 16 | $$11 << 8 | $$12;
        }
        int $$13 = fuk.a($$0, $$1, $$2, $$3, 24);
        int $$14 = fuk.a($$0, $$1, $$2, $$3, 16);
        int $$15 = fuk.a($$0, $$1, $$2, $$3, 8);
        int $$16 = fuk.a($$0, $$1, $$2, $$3, 0);
        return $$13 << 24 | $$14 << 16 | $$15 << 8 | $$16;
    }

    private static int a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        float $$5 = fuk.a($$0 >> $$4);
        float $$6 = fuk.a($$1 >> $$4);
        float $$7 = fuk.a($$2 >> $$4);
        float $$8 = fuk.a($$3 >> $$4);
        float $$9 = (float)((double)((float)Math.pow((double)($$5 + $$6 + $$7 + $$8) * 0.25, 0.45454545454545453)));
        return (int)((double)$$9 * 255.0);
    }

    private static float a(int $$0) {
        return b[$$0 & 0xFF];
    }
}

