/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class ehy {
    private static final Logger a = LogUtils.getLogger();

    public static void a(int $$0) {
        RenderSystem.assertOnRenderThread();
        GlStateManager._glUseProgram($$0);
    }

    public static void a(ehz $$0) {
        RenderSystem.assertOnRenderThread();
        $$0.d().a();
        $$0.c().a();
        GlStateManager.glDeleteProgram($$0.a());
    }

    public static int a() throws IOException {
        RenderSystem.assertOnRenderThread();
        int $$0 = GlStateManager.glCreateProgram();
        if ($$0 <= 0) {
            throw new IOException("Could not create shader program (returned program ID " + $$0 + ")");
        }
        return $$0;
    }

    public static void b(ehz $$0) {
        RenderSystem.assertOnRenderThread();
        $$0.e();
        GlStateManager.glLinkProgram($$0.a());
        int $$1 = GlStateManager.glGetProgrami($$0.a(), 35714);
        if ($$1 == 0) {
            a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", (Object)$$0.c().b(), (Object)$$0.d().b());
            a.warn(GlStateManager.glGetProgramInfoLog($$0.a(), 32768));
        }
    }
}

