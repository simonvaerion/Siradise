/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class fug
implements AutoCloseable {
    public static final int a = -1;
    protected int b = -1;
    protected boolean c;
    protected boolean d;

    public void a(boolean $$0, boolean $$1) {
        int $$5;
        int $$4;
        RenderSystem.assertOnRenderThreadOrInit();
        this.c = $$0;
        this.d = $$1;
        if ($$0) {
            int $$2 = $$1 ? 9987 : 9729;
            int $$3 = 9729;
        } else {
            $$4 = $$1 ? 9986 : 9728;
            $$5 = 9728;
        }
        this.c();
        GlStateManager._texParameter(3553, 10241, $$4);
        GlStateManager._texParameter(3553, 10240, $$5);
    }

    public int a() {
        RenderSystem.assertOnRenderThreadOrInit();
        if (this.b == -1) {
            this.b = TextureUtil.generateTextureId();
        }
        return this.b;
    }

    public void b() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
                if (this.b != -1) {
                    TextureUtil.releaseTextureId(this.b);
                    this.b = -1;
                }
            });
        } else if (this.b != -1) {
            TextureUtil.releaseTextureId(this.b);
            this.b = -1;
        }
    }

    public abstract void a(akx var1) throws IOException;

    public void c() {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> GlStateManager._bindTexture(this.a()));
        } else {
            GlStateManager._bindTexture(this.a());
        }
    }

    public void a(fuw $$0, akx $$1, acq $$2, Executor $$3) {
        $$0.a($$2, this);
    }

    @Override
    public void close() {
    }
}

