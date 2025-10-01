/*
 * Decompiled with CFR 0.152.
 */
public class ob {
    private static final float a = -0.51f;
    private static final float b = -0.4f;
    private static final float c = 0.1f;
    private static final float d = -0.15f;
    private static final apx<Float> e = apx.a;
    private static final apx<Float> f = apx.a($$0 -> $$0 < 0.0f ? $$0 : $$0 * 2.0f);
    private static final apx<Float> g = apx.a($$0 -> 1.25f - 6.25f / ($$0 + 5.0f));
    private static final apx<Float> h = apx.a($$0 -> $$0 * 2.0f);

    public static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, I $$2, boolean $$3) {
        apx<Float> $$4 = $$3 ? f : e;
        aod<C, I> $$5 = ob.a($$1, $$2, -0.15f, 0.0f, 0.0f, 0.1f, 0.0f, -0.03f, false, false, $$4);
        aod<C, I> $$6 = ob.a($$1, $$2, -0.1f, 0.03f, 0.1f, 0.1f, 0.01f, -0.03f, false, false, $$4);
        aod<C, I> $$7 = ob.a($$1, $$2, -0.1f, 0.03f, 0.1f, 0.7f, 0.01f, -0.03f, true, true, $$4);
        aod<C, I> $$8 = ob.a($$1, $$2, -0.05f, 0.03f, 0.1f, 1.0f, 0.01f, 0.01f, true, true, $$4);
        return aod.a($$0, $$4).a(-1.1f, 0.044f).a(-1.02f, -0.2222f).a(-0.51f, -0.2222f).a(-0.44f, -0.12f).a(-0.18f, -0.12f).a(-0.16f, $$5).a(-0.15f, $$5).a(-0.1f, $$6).a(0.25f, $$7).a(1.0f, $$8).a();
    }

    public static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, I $$2, I $$3, boolean $$4) {
        apx<Float> $$5 = $$4 ? g : e;
        return aod.a($$0, e).a(-0.19f, 3.95f).a(-0.15f, ob.a($$1, $$2, $$3, 6.25f, true, e)).a(-0.1f, ob.a($$1, $$2, $$3, 5.47f, true, $$5)).a(0.03f, ob.a($$1, $$2, $$3, 5.08f, true, $$5)).a(0.06f, ob.a($$1, $$2, $$3, 4.69f, false, $$5)).a();
    }

    public static <C, I extends apx<C>> aod<C, I> b(I $$0, I $$1, I $$2, I $$3, boolean $$4) {
        apx<Float> $$5 = $$4 ? h : e;
        float $$6 = 0.65f;
        return aod.a($$0, $$5).a(-0.11f, 0.0f).a(0.03f, ob.a($$1, $$2, $$3, 1.0f, 0.5f, 0.0f, 0.0f, $$5)).a(0.65f, ob.a($$1, $$2, $$3, 1.0f, 1.0f, 1.0f, 0.0f, $$5)).a();
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, I $$2, float $$3, float $$4, float $$5, float $$6, apx<Float> $$7) {
        float $$8 = -0.5775f;
        aod<C, I> $$9 = ob.a($$1, $$2, $$3, $$5, $$7);
        aod<C, I> $$10 = ob.a($$1, $$2, $$4, $$6, $$7);
        return aod.a($$0, $$7).a(-1.0f, $$9).a(-0.78f, $$10).a(-0.5775f, $$10).a(-0.375f, 0.0f).a();
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, float $$2, float $$3, apx<Float> $$4) {
        float $$5 = dhr.a(0.4f);
        float $$6 = dhr.a(0.56666666f);
        float $$7 = ($$5 + $$6) / 2.0f;
        aod.b<C, I> $$8 = aod.a($$1, $$4);
        $$8.a($$5, 0.0f);
        if ($$3 > 0.0f) {
            $$8.a($$7, ob.a($$0, $$3, $$4));
        } else {
            $$8.a($$7, 0.0f);
        }
        if ($$2 > 0.0f) {
            $$8.a(1.0f, ob.a($$0, $$2, $$4));
        } else {
            $$8.a(1.0f, 0.0f);
        }
        return $$8.a();
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, float $$1, apx<Float> $$2) {
        float $$3 = 0.63f * $$1;
        float $$4 = 0.3f * $$1;
        return aod.a($$0, $$2).a(-0.01f, $$3).a(0.01f, $$4).a();
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, I $$2, float $$3, boolean $$4, apx<Float> $$5) {
        aod $$6 = aod.a($$1, $$5).a(-0.2f, 6.3f).a(0.2f, $$3).a();
        aod.b $$7 = aod.a($$0, $$5).a(-0.6f, $$6).a(-0.5f, aod.a($$1, $$5).a(-0.05f, 6.3f).a(0.05f, 2.67f).a()).a(-0.35f, $$6).a(-0.25f, $$6).a(-0.1f, aod.a($$1, $$5).a(-0.05f, 2.67f).a(0.05f, 6.3f).a()).a(0.03f, $$6);
        if ($$4) {
            aod $$8 = aod.a($$1, $$5).a(0.0f, $$3).a(0.1f, 0.625f).a();
            aod $$9 = aod.a($$2, $$5).a(-0.9f, $$3).a(-0.69f, $$8).a();
            $$7.a(0.35f, $$3).a(0.45f, $$9).a(0.55f, $$9).a(0.62f, $$3);
        } else {
            aod $$10 = aod.a($$2, $$5).a(-0.7f, $$6).a(-0.15f, 1.37f).a();
            aod $$11 = aod.a($$2, $$5).a(0.45f, $$6).a(0.7f, 1.56f).a();
            $$7.a(0.05f, $$11).a(0.4f, $$11).a(0.45f, $$10).a(0.55f, $$10).a(0.58f, $$3);
        }
        return $$7.a();
    }

    private static float a(float $$0, float $$1, float $$2, float $$3) {
        return ($$1 - $$0) / ($$3 - $$2);
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, float $$1, boolean $$2, apx<Float> $$3) {
        aod.b $$4 = aod.a($$0, $$3);
        float $$5 = -0.7f;
        float $$6 = -1.0f;
        float $$7 = ob.a(-1.0f, $$1, -0.7f);
        float $$8 = 1.0f;
        float $$9 = ob.a(1.0f, $$1, -0.7f);
        float $$10 = ob.a($$1);
        float $$11 = -0.65f;
        if (-0.65f < $$10 && $$10 < 1.0f) {
            float $$12 = ob.a(-0.65f, $$1, -0.7f);
            float $$13 = -0.75f;
            float $$14 = ob.a(-0.75f, $$1, -0.7f);
            float $$15 = ob.a($$7, $$14, -1.0f, -0.75f);
            $$4.a(-1.0f, $$7, $$15);
            $$4.a(-0.75f, $$14);
            $$4.a(-0.65f, $$12);
            float $$16 = ob.a($$10, $$1, -0.7f);
            float $$17 = ob.a($$16, $$9, $$10, 1.0f);
            float $$18 = 0.01f;
            $$4.a($$10 - 0.01f, $$16);
            $$4.a($$10, $$16, $$17);
            $$4.a(1.0f, $$9, $$17);
        } else {
            float $$19 = ob.a($$7, $$9, -1.0f, 1.0f);
            if ($$2) {
                $$4.a(-1.0f, Math.max(0.2f, $$7));
                $$4.a(0.0f, apa.i(0.5f, $$7, $$9), $$19);
            } else {
                $$4.a(-1.0f, $$7, $$19);
            }
            $$4.a(1.0f, $$9, $$19);
        }
        return $$4.a();
    }

    private static float a(float $$0, float $$1, float $$2) {
        float $$3 = 1.17f;
        float $$4 = 0.46082947f;
        float $$5 = 1.0f - (1.0f - $$1) * 0.5f;
        float $$6 = 0.5f * (1.0f - $$1);
        float $$7 = ($$0 + 1.17f) * 0.46082947f;
        float $$8 = $$7 * $$5 - $$6;
        if ($$0 < $$2) {
            return Math.max($$8, -0.2222f);
        }
        return Math.max($$8, 0.0f);
    }

    private static float a(float $$0) {
        float $$1 = 1.17f;
        float $$2 = 0.46082947f;
        float $$3 = 1.0f - (1.0f - $$0) * 0.5f;
        float $$4 = 0.5f * (1.0f - $$0);
        return $$4 / (0.46082947f * $$3) - 1.17f;
    }

    public static <C, I extends apx<C>> aod<C, I> a(I $$0, I $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8, boolean $$9, apx<Float> $$10) {
        float $$11 = 0.6f;
        float $$12 = 0.5f;
        float $$13 = 0.5f;
        aod<C, I> $$14 = ob.a($$1, apa.i($$5, 0.6f, 1.5f), $$9, $$10);
        aod<C, I> $$15 = ob.a($$1, apa.i($$5, 0.6f, 1.0f), $$9, $$10);
        aod<C, I> $$16 = ob.a($$1, $$5, $$9, $$10);
        aod<C, I> $$17 = ob.a($$1, $$2 - 0.15f, 0.5f * $$5, apa.i(0.5f, 0.5f, 0.5f) * $$5, 0.5f * $$5, 0.6f * $$5, 0.5f, $$10);
        aod<C, I> $$18 = ob.a($$1, $$2, $$6 * $$5, $$3 * $$5, 0.5f * $$5, 0.6f * $$5, 0.5f, $$10);
        aod<C, I> $$19 = ob.a($$1, $$2, $$6, $$6, $$3, $$4, 0.5f, $$10);
        aod<C, I> $$20 = ob.a($$1, $$2, $$6, $$6, $$3, $$4, 0.5f, $$10);
        aod $$21 = aod.a($$1, $$10).a(-1.0f, $$2).a(-0.4f, $$19).a(0.0f, $$4 + 0.07f).a();
        aod<C, I> $$22 = ob.a($$1, -0.02f, $$7, $$7, $$3, $$4, 0.0f, $$10);
        aod.b<C, I> $$23 = aod.a($$0, $$10).a(-0.85f, $$14).a(-0.7f, $$15).a(-0.4f, $$16).a(-0.35f, $$17).a(-0.1f, $$18).a(0.2f, $$19);
        if ($$8) {
            $$23.a(0.4f, $$20).a(0.45f, $$21).a(0.55f, $$21).a(0.58f, $$20);
        }
        $$23.a(0.7f, $$22);
        return $$23.a();
    }

    private static <C, I extends apx<C>> aod<C, I> a(I $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, apx<Float> $$7) {
        float $$8 = Math.max(0.5f * ($$2 - $$1), $$6);
        float $$9 = 5.0f * ($$3 - $$2);
        return aod.a($$0, $$7).a(-1.0f, $$1, $$8).a(-0.4f, $$2, Math.min($$8, $$9)).a(0.0f, $$3, $$9).a(0.4f, $$4, 2.0f * ($$4 - $$3)).a(1.0f, $$5, 0.7f * ($$5 - $$4)).a();
    }
}

