/*
 * Decompiled with CFR 0.152.
 */
public class fbe<T extends bfj>
extends fbo<T> {
    private static final int a = 4;
    private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] f = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private final fee g;
    private final fee[] h;

    public fbe(fee $$0) {
        this.g = $$0;
        this.h = new fee[4];
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            this.h[$$1] = $$0.b(fbe.a($$1));
        }
    }

    private static String a(int $$0) {
        return "segment" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float $$2 = -3.5f;
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            $$1.a(fbe.a($$3), fej.c().a(f[$$3][0], f[$$3][1]).a((float)b[$$3][0] * -0.5f, 0.0f, (float)b[$$3][2] * -0.5f, b[$$3][0], b[$$3][1], b[$$3][2]), feg.a(0.0f, 24 - b[$$3][1], $$2));
            if ($$3 >= 3) continue;
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5f;
        }
        return fek.a($$0, 64, 32);
    }

    @Override
    public fee a() {
        return this.g;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        for (int $$6 = 0; $$6 < this.h.length; ++$$6) {
            this.h[$$6].f = apa.b($$3 * 0.9f + (float)$$6 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs($$6 - 2));
            this.h[$$6].b = apa.a($$3 * 0.9f + (float)$$6 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs($$6 - 2);
        }
    }
}

