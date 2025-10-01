/*
 * Decompiled with CFR 0.152.
 */
public class fbm
extends fbo<bvy> {
    private static final float[] a = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
    private static final float[] b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
    private static final float[] f = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
    private static final float[] g = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
    private static final float[] h = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
    private static final float[] i = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
    private static final String j = "eye";
    private static final String k = "tail0";
    private static final String l = "tail1";
    private static final String m = "tail2";
    private final fee n;
    private final fee o;
    private final fee p;
    private final fee[] q;
    private final fee[] r;

    public fbm(fee $$0) {
        this.n = $$0;
        this.q = new fee[12];
        this.o = $$0.b("head");
        for (int $$1 = 0; $$1 < this.q.length; ++$$1) {
            this.q[$$1] = this.o.b(fbm.a($$1));
        }
        this.p = this.o.b(j);
        this.r = new fee[3];
        this.r[0] = this.o.b(k);
        this.r[1] = this.r[0].b(l);
        this.r[2] = this.r[1].b(m);
    }

    private static String a(int $$0) {
        return "spike" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("head", fej.c().a(0, 0).a(-6.0f, 10.0f, -8.0f, 12.0f, 12.0f, 16.0f).a(0, 28).a(-8.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f).a(0, 28).a(6.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f, true).a(16, 40).a(-6.0f, 8.0f, -6.0f, 12.0f, 2.0f, 12.0f).a(16, 40).a(-6.0f, 22.0f, -6.0f, 12.0f, 2.0f, 12.0f), feg.a);
        fej $$3 = fej.c().a(0, 0).a(-1.0f, -4.5f, -1.0f, 2.0f, 9.0f, 2.0f);
        for (int $$4 = 0; $$4 < 12; ++$$4) {
            float $$5 = fbm.b($$4, 0.0f, 0.0f);
            float $$6 = fbm.c($$4, 0.0f, 0.0f);
            float $$7 = fbm.d($$4, 0.0f, 0.0f);
            float $$8 = (float)Math.PI * a[$$4];
            float $$9 = (float)Math.PI * b[$$4];
            float $$10 = (float)Math.PI * f[$$4];
            $$2.a(fbm.a($$4), $$3, feg.a($$5, $$6, $$7, $$8, $$9, $$10));
        }
        $$2.a(j, fej.c().a(8, 0).a(-1.0f, 15.0f, 0.0f, 2.0f, 2.0f, 1.0f), feg.a(0.0f, 0.0f, -8.25f));
        fen $$11 = $$2.a(k, fej.c().a(40, 0).a(-2.0f, 14.0f, 7.0f, 4.0f, 4.0f, 8.0f), feg.a);
        fen $$12 = $$11.a(l, fej.c().a(0, 54).a(0.0f, 14.0f, 0.0f, 3.0f, 3.0f, 7.0f), feg.a(-1.5f, 0.5f, 14.0f));
        $$12.a(m, fej.c().a(41, 32).a(0.0f, 14.0f, 0.0f, 2.0f, 2.0f, 6.0f).a(25, 19).a(1.0f, 10.5f, 3.0f, 1.0f, 9.0f, 9.0f), feg.a(0.5f, 0.5f, 6.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public fee a() {
        return this.n;
    }

    @Override
    public void a(bvy $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = $$3 - (float)$$0.ag;
        this.o.f = $$4 * ((float)Math.PI / 180);
        this.o.e = $$5 * ((float)Math.PI / 180);
        float $$7 = (1.0f - $$0.E($$6)) * 0.55f;
        this.a($$3, $$7);
        bfj $$8 = enn.N().al();
        if ($$0.ga()) {
            $$8 = $$0.gb();
        }
        if ($$8 != null) {
            eei $$9 = $$8.j(0.0f);
            eei $$10 = $$0.j(0.0f);
            double $$11 = $$9.d - $$10.d;
            this.p.c = $$11 > 0.0 ? 0.0f : 1.0f;
            eei $$12 = $$0.f(0.0f);
            $$12 = new eei($$12.c, 0.0, $$12.e);
            eei $$13 = new eei($$10.c - $$9.c, 0.0, $$10.e - $$9.e).d().b(1.5707964f);
            double $$14 = $$12.b($$13);
            this.p.b = apa.c((float)Math.abs($$14)) * 2.0f * (float)Math.signum($$14);
        }
        this.p.k = true;
        float $$15 = $$0.D($$6);
        this.r[0].f = apa.a($$15) * (float)Math.PI * 0.05f;
        this.r[1].f = apa.a($$15) * (float)Math.PI * 0.1f;
        this.r[2].f = apa.a($$15) * (float)Math.PI * 0.15f;
    }

    private void a(float $$0, float $$1) {
        for (int $$2 = 0; $$2 < 12; ++$$2) {
            this.q[$$2].b = fbm.b($$2, $$0, $$1);
            this.q[$$2].c = fbm.c($$2, $$0, $$1);
            this.q[$$2].d = fbm.d($$2, $$0, $$1);
        }
    }

    private static float a(int $$0, float $$1, float $$2) {
        return 1.0f + apa.b($$1 * 1.5f + (float)$$0) * 0.01f - $$2;
    }

    private static float b(int $$0, float $$1, float $$2) {
        return g[$$0] * fbm.a($$0, $$1, $$2);
    }

    private static float c(int $$0, float $$1, float $$2) {
        return 16.0f + h[$$0] * fbm.a($$0, $$1, $$2);
    }

    private static float d(int $$0, float $$1, float $$2) {
        return i[$$0] * fbm.a($$0, $$1, $$2);
    }
}

