/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eif {
    @Nullable
    private static eim a;

    public static void a() {
        if (a != null) {
            eif.b();
            eim.b();
        }
    }

    public static void b() {
        a = null;
    }

    public static void a(eie.b $$0) {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> eif.c($$0));
        } else {
            eif.c($$0);
        }
    }

    private static void c(eie.b $$0) {
        eim $$1 = eif.d($$0);
        if ($$1 != null) {
            $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
        }
    }

    public static void b(eie.b $$0) {
        eim $$1 = eif.d($$0);
        if ($$1 != null) {
            $$1.c();
        }
    }

    @Nullable
    private static eim d(eie.b $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0.d()) {
            $$0.e();
            return null;
        }
        eim $$1 = eif.a($$0.c().g());
        $$1.a($$0);
        return $$1;
    }

    private static eim a(eio $$0) {
        eim $$1 = $$0.g();
        eif.a($$1);
        return $$1;
    }

    private static void a(eim $$0) {
        if ($$0 != a) {
            $$0.a();
            a = $$0;
        }
    }
}

