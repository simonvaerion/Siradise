/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class fcz<T extends bfj>
extends fbo<T> {
    private static final int a = 7;
    private final fee b;
    private final fee[] f = new fee[7];
    private final fee[] g = new fee[3];
    private static final int[][] h = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] i = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public fcz(fee $$0) {
        this.b = $$0;
        Arrays.setAll(this.f, $$1 -> $$0.b(fcz.b($$1)));
        Arrays.setAll(this.g, $$1 -> $$0.b(fcz.a($$1)));
    }

    private static String a(int $$0) {
        return "layer" + $$0;
    }

    private static String b(int $$0) {
        return "segment" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float[] $$2 = new float[7];
        float $$3 = -3.5f;
        for (int $$4 = 0; $$4 < 7; ++$$4) {
            $$1.a(fcz.b($$4), fej.c().a(i[$$4][0], i[$$4][1]).a((float)h[$$4][0] * -0.5f, 0.0f, (float)h[$$4][2] * -0.5f, h[$$4][0], h[$$4][1], h[$$4][2]), feg.a(0.0f, 24 - h[$$4][1], $$3));
            $$2[$$4] = $$3;
            if ($$4 >= 6) continue;
            $$3 += (float)(h[$$4][2] + h[$$4 + 1][2]) * 0.5f;
        }
        $$1.a(fcz.a(0), fej.c().a(20, 0).a(-5.0f, 0.0f, (float)h[2][2] * -0.5f, 10.0f, 8.0f, h[2][2]), feg.a(0.0f, 16.0f, $$2[2]));
        $$1.a(fcz.a(1), fej.c().a(20, 11).a(-3.0f, 0.0f, (float)h[4][2] * -0.5f, 6.0f, 4.0f, h[4][2]), feg.a(0.0f, 20.0f, $$2[4]));
        $$1.a(fcz.a(2), fej.c().a(20, 18).a(-3.0f, 0.0f, (float)h[4][2] * -0.5f, 6.0f, 5.0f, h[1][2]), feg.a(0.0f, 19.0f, $$2[1]));
        return fek.a($$0, 64, 32);
    }

    @Override
    public fee a() {
        return this.b;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        for (int $$6 = 0; $$6 < this.f.length; ++$$6) {
            this.f[$$6].f = apa.b($$3 * 0.9f + (float)$$6 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs($$6 - 2));
            this.f[$$6].b = apa.a($$3 * 0.9f + (float)$$6 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs($$6 - 2);
        }
        this.g[0].f = this.f[2].f;
        this.g[1].f = this.f[4].f;
        this.g[1].b = this.f[4].b;
        this.g[2].f = this.f[1].f;
        this.g[2].b = this.f[1].b;
    }
}

