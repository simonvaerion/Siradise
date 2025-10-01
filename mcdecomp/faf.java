/*
 * Decompiled with CFR 0.152.
 */
public class faf {
    public static void a(fee $$0, fee $$1, fee $$2, boolean $$3) {
        fee $$4 = $$3 ? $$0 : $$1;
        fee $$5 = $$3 ? $$1 : $$0;
        $$4.f = ($$3 ? -0.3f : 0.3f) + $$2.f;
        $$5.f = ($$3 ? 0.6f : -0.6f) + $$2.f;
        $$4.e = -1.5707964f + $$2.e + 0.1f;
        $$5.e = -1.5f + $$2.e;
    }

    public static void a(fee $$0, fee $$1, bfz $$2, boolean $$3) {
        fee $$4 = $$3 ? $$0 : $$1;
        fee $$5 = $$3 ? $$1 : $$0;
        $$4.f = $$3 ? -0.8f : 0.8f;
        $$5.e = $$4.e = -0.97079635f;
        float $$6 = ceh.k($$2.fk());
        float $$7 = apa.a((float)$$2.fm(), 0.0f, $$6);
        float $$8 = $$7 / $$6;
        $$5.f = apa.i($$8, 0.4f, 0.85f) * (float)($$3 ? 1 : -1);
        $$5.e = apa.i($$8, $$5.e, -1.5707964f);
    }

    public static <T extends bgb> void a(fee $$0, fee $$1, T $$2, float $$3, float $$4) {
        float $$5 = apa.a($$3 * (float)Math.PI);
        float $$6 = apa.a((1.0f - (1.0f - $$3) * (1.0f - $$3)) * (float)Math.PI);
        $$0.g = 0.0f;
        $$1.g = 0.0f;
        $$0.f = 0.15707964f;
        $$1.f = -0.15707964f;
        if ($$2.fh() == bft.b) {
            $$0.e = -1.8849558f + apa.b($$4 * 0.09f) * 0.15f;
            $$1.e = -0.0f + apa.b($$4 * 0.19f) * 0.5f;
            $$0.e += $$5 * 2.2f - $$6 * 0.4f;
            $$1.e += $$5 * 1.2f - $$6 * 0.4f;
        } else {
            $$0.e = -0.0f + apa.b($$4 * 0.19f) * 0.5f;
            $$1.e = -1.8849558f + apa.b($$4 * 0.09f) * 0.15f;
            $$0.e += $$5 * 1.2f - $$6 * 0.4f;
            $$1.e += $$5 * 2.2f - $$6 * 0.4f;
        }
        faf.a($$0, $$1, $$4);
    }

    public static void a(fee $$0, float $$1, float $$2) {
        $$0.g += $$2 * (apa.b($$1 * 0.09f) * 0.05f + 0.05f);
        $$0.e += $$2 * (apa.a($$1 * 0.067f) * 0.05f);
    }

    public static void a(fee $$0, fee $$1, float $$2) {
        faf.a($$0, $$2, 1.0f);
        faf.a($$1, $$2, -1.0f);
    }

    public static void a(fee $$0, fee $$1, boolean $$2, float $$3, float $$4) {
        float $$7;
        float $$5 = apa.a($$3 * (float)Math.PI);
        float $$6 = apa.a((1.0f - (1.0f - $$3) * (1.0f - $$3)) * (float)Math.PI);
        $$1.g = 0.0f;
        $$0.g = 0.0f;
        $$1.f = -(0.1f - $$5 * 0.6f);
        $$0.f = 0.1f - $$5 * 0.6f;
        $$1.e = $$7 = (float)(-Math.PI) / ($$2 ? 1.5f : 2.25f);
        $$0.e = $$7;
        $$1.e += $$5 * 1.2f - $$6 * 0.4f;
        $$0.e += $$5 * 1.2f - $$6 * 0.4f;
        faf.a($$1, $$0, $$4);
    }
}

