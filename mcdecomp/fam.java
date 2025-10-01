/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class fam<T extends bfj>
extends fbo<T> {
    private final fee a;
    private final fee[] b;
    private final fee f;

    public fam(fee $$0) {
        this.a = $$0;
        this.f = $$0.b("head");
        this.b = new fee[12];
        Arrays.setAll(this.b, $$1 -> $$0.b(fam.a($$1)));
    }

    private static String a(int $$0) {
        return "part" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        float $$2 = 0.0f;
        fej $$3 = fej.c().a(0, 16).a(0.0f, 0.0f, 0.0f, 2.0f, 8.0f, 2.0f);
        for (int $$4 = 0; $$4 < 4; ++$$4) {
            float $$5 = apa.b($$2) * 9.0f;
            float $$6 = -2.0f + apa.b((float)($$4 * 2) * 0.25f);
            float $$7 = apa.a($$2) * 9.0f;
            $$1.a(fam.a($$4), $$3, feg.a($$5, $$6, $$7));
            $$2 += 1.5707964f;
        }
        $$2 = 0.7853982f;
        for (int $$8 = 4; $$8 < 8; ++$$8) {
            float $$9 = apa.b($$2) * 7.0f;
            float $$10 = 2.0f + apa.b((float)($$8 * 2) * 0.25f);
            float $$11 = apa.a($$2) * 7.0f;
            $$1.a(fam.a($$8), $$3, feg.a($$9, $$10, $$11));
            $$2 += 1.5707964f;
        }
        $$2 = 0.47123894f;
        for (int $$12 = 8; $$12 < 12; ++$$12) {
            float $$13 = apa.b($$2) * 5.0f;
            float $$14 = 11.0f + apa.b((float)$$12 * 1.5f * 0.5f);
            float $$15 = apa.a($$2) * 5.0f;
            $$1.a(fam.a($$12), $$3, feg.a($$13, $$14, $$15));
            $$2 += 1.5707964f;
        }
        return fek.a($$0, 64, 32);
    }

    @Override
    public fee a() {
        return this.a;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = $$3 * (float)Math.PI * -0.1f;
        for (int $$7 = 0; $$7 < 4; ++$$7) {
            this.b[$$7].c = -2.0f + apa.b(((float)($$7 * 2) + $$3) * 0.25f);
            this.b[$$7].b = apa.b($$6) * 9.0f;
            this.b[$$7].d = apa.a($$6) * 9.0f;
            $$6 += 1.5707964f;
        }
        $$6 = 0.7853982f + $$3 * (float)Math.PI * 0.03f;
        for (int $$8 = 4; $$8 < 8; ++$$8) {
            this.b[$$8].c = 2.0f + apa.b(((float)($$8 * 2) + $$3) * 0.25f);
            this.b[$$8].b = apa.b($$6) * 7.0f;
            this.b[$$8].d = apa.a($$6) * 7.0f;
            $$6 += 1.5707964f;
        }
        $$6 = 0.47123894f + $$3 * (float)Math.PI * -0.05f;
        for (int $$9 = 8; $$9 < 12; ++$$9) {
            this.b[$$9].c = 11.0f + apa.b(((float)$$9 * 1.5f + $$3) * 0.5f);
            this.b[$$9].b = apa.b($$6) * 5.0f;
            this.b[$$9].d = apa.a($$6) * 5.0f;
            $$6 += 1.5707964f;
        }
        this.f.f = $$4 * ((float)Math.PI / 180);
        this.f.e = $$5 * ((float)Math.PI / 180);
    }
}

