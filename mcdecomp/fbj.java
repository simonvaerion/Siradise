/*
 * Decompiled with CFR 0.152.
 */
public class fbj<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee[] b = new fee[9];

    public fbj(fee $$0) {
        this.a = $$0;
        for (int $$1 = 0; $$1 < this.b.length; ++$$1) {
            this.b[$$1] = $$0.b(fbj.a($$1));
        }
    }

    private static String a(int $$0) {
        return "tentacle" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("body", fej.c().a(0, 0).a(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), feg.a(0.0f, 17.6f, 0.0f));
        apf $$2 = apf.a(1660L);
        for (int $$3 = 0; $$3 < 9; ++$$3) {
            float $$4 = (((float)($$3 % 3) - (float)($$3 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float $$5 = ((float)($$3 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int $$6 = $$2.a(7) + 8;
            $$1.a(fbj.a($$3), fej.c().a(0, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, $$6, 2.0f), feg.a($$4, 24.6f, $$5));
        }
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        for (int $$6 = 0; $$6 < this.b.length; ++$$6) {
            this.b[$$6].e = 0.2f * apa.a($$3 * 0.3f + (float)$$6) + 0.4f;
        }
    }

    @Override
    public fee a() {
        return this.a;
    }
}

