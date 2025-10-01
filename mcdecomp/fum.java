/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;

public class fum
implements AutoCloseable {
    private static final int e = 16;
    public static final int a = 0;
    public static final int b = 3;
    public static final int c = 10;
    public static final int d = fum.a(0, 10);
    private final fui f = new fui(16, 16, false);

    public fum() {
        ehk $$0 = this.f.e();
        for (int $$1 = 0; $$1 < 16; ++$$1) {
            for (int $$2 = 0; $$2 < 16; ++$$2) {
                if ($$1 < 8) {
                    $$0.a($$2, $$1, -1308622593);
                    continue;
                }
                int $$3 = (int)((1.0f - (float)$$2 / 15.0f * 0.75f) * 255.0f);
                $$0.a($$2, $$1, $$3 << 24 | 0xFFFFFF);
            }
        }
        RenderSystem.activeTexture(33985);
        this.f.c();
        $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), false, true, false, false);
        RenderSystem.activeTexture(33984);
    }

    @Override
    public void close() {
        this.f.close();
    }

    public void a() {
        RenderSystem.setupOverlayColor(this.f::a, 16);
    }

    public static int a(float $$0) {
        return (int)($$0 * 15.0f);
    }

    public static int a(boolean $$0) {
        return $$0 ? 3 : 10;
    }

    public static int a(int $$0, int $$1) {
        return $$0 | $$1 << 16;
    }

    public static int a(float $$0, boolean $$1) {
        return fum.a(fum.a($$0), fum.a($$1));
    }

    public void b() {
        RenderSystem.teardownOverlayColor();
    }
}

