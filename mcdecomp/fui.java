/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fui
extends fug
implements fuh {
    private static final Logger e = LogUtils.getLogger();
    @Nullable
    private ehk f;

    public fui(ehk $$0) {
        this.f = $$0;
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
                TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
                this.d();
            });
        } else {
            TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
            this.d();
        }
    }

    public fui(int $$0, int $$1, boolean $$2) {
        RenderSystem.assertOnGameThreadOrInit();
        this.f = new ehk($$0, $$1, $$2);
        TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
    }

    @Override
    public void a(akx $$0) {
    }

    public void d() {
        if (this.f != null) {
            this.c();
            this.f.a(0, 0, 0, false);
        } else {
            e.warn("Trying to upload disposed texture {}", (Object)this.a());
        }
    }

    @Nullable
    public ehk e() {
        return this.f;
    }

    public void a(ehk $$0) {
        if (this.f != null) {
            this.f.close();
        }
        this.f = $$0;
    }

    @Override
    public void close() {
        if (this.f != null) {
            this.f.close();
            this.b();
            this.f = null;
        }
    }

    @Override
    public void a(acq $$0, Path $$1) throws IOException {
        if (this.f != null) {
            String $$2 = $$0.c() + ".png";
            Path $$3 = $$1.resolve($$2);
            this.f.a($$3);
        }
    }
}

