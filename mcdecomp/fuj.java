/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fuj
extends fuo {
    private static final Logger f = LogUtils.getLogger();
    private static final int g = 64;
    private static final int h = 64;
    private static final int i = 32;
    @Nullable
    private final File j;
    private final String k;
    private final boolean l;
    @Nullable
    private final Runnable m;
    @Nullable
    private CompletableFuture<?> n;
    private boolean o;

    public fuj(@Nullable File $$0, String $$1, acq $$2, boolean $$3, @Nullable Runnable $$4) {
        super($$2);
        this.j = $$0;
        this.k = $$1;
        this.l = $$3;
        this.m = $$4;
    }

    private void a(ehk $$0) {
        if (this.m != null) {
            this.m.run();
        }
        enn.N().execute(() -> {
            this.o = true;
            if (!RenderSystem.isOnRenderThread()) {
                RenderSystem.recordRenderCall(() -> this.b($$0));
            } else {
                this.b($$0);
            }
        });
    }

    private void b(ehk $$0) {
        TextureUtil.prepareImage(this.a(), $$0.a(), $$0.b());
        $$0.a(0, 0, 0, true);
    }

    @Override
    public void a(akx $$0) throws IOException {
        ehk $$3;
        enn.N().execute(() -> {
            if (!this.o) {
                try {
                    super.a($$0);
                }
                catch (IOException $$1) {
                    f.warn("Failed to load texture: {}", (Object)this.e, (Object)$$1);
                }
                this.o = true;
            }
        });
        if (this.n != null) {
            return;
        }
        if (this.j != null && this.j.isFile()) {
            f.debug("Loading http texture from local cache ({})", (Object)this.j);
            FileInputStream $$1 = new FileInputStream(this.j);
            ehk $$2 = this.a($$1);
        } else {
            $$3 = null;
        }
        if ($$3 != null) {
            this.a($$3);
            return;
        }
        this.n = CompletableFuture.runAsync(() -> {
            HttpURLConnection $$0 = null;
            f.debug("Downloading http texture from {} to {}", (Object)this.k, (Object)this.j);
            try {
                InputStream $$2;
                $$0 = (HttpURLConnection)new URL(this.k).openConnection(enn.N().W());
                $$0.setDoInput(true);
                $$0.setDoOutput(false);
                $$0.connect();
                if ($$0.getResponseCode() / 100 != 2) {
                    return;
                }
                if (this.j != null) {
                    FileUtils.copyInputStreamToFile((InputStream)$$0.getInputStream(), (File)this.j);
                    FileInputStream $$1 = new FileInputStream(this.j);
                } else {
                    $$2 = $$0.getInputStream();
                }
                enn.N().execute(() -> {
                    ehk $$1 = this.a($$2);
                    if ($$1 != null) {
                        this.a($$1);
                    }
                });
            }
            catch (Exception $$3) {
                f.error("Couldn't download http texture", (Throwable)$$3);
            }
            finally {
                if ($$0 != null) {
                    $$0.disconnect();
                }
            }
        }, ac.f());
    }

    @Nullable
    private ehk a(InputStream $$0) {
        ehk $$1 = null;
        try {
            $$1 = ehk.a($$0);
            if (this.l) {
                $$1 = this.c($$1);
            }
        }
        catch (Exception $$2) {
            f.warn("Error while loading the skin texture", (Throwable)$$2);
        }
        return $$1;
    }

    @Nullable
    private ehk c(ehk $$0) {
        boolean $$3;
        int $$1 = $$0.b();
        int $$2 = $$0.a();
        if ($$2 != 64 || $$1 != 32 && $$1 != 64) {
            $$0.close();
            f.warn("Discarding incorrectly sized ({}x{}) skin texture from {}", new Object[]{$$2, $$1, this.k});
            return null;
        }
        boolean bl2 = $$3 = $$1 == 32;
        if ($$3) {
            ehk $$4 = new ehk(64, 64, true);
            $$4.a($$0);
            $$0.close();
            $$0 = $$4;
            $$0.a(0, 32, 64, 32, 0);
            $$0.a(4, 16, 16, 32, 4, 4, true, false);
            $$0.a(8, 16, 16, 32, 4, 4, true, false);
            $$0.a(0, 20, 24, 32, 4, 12, true, false);
            $$0.a(4, 20, 16, 32, 4, 12, true, false);
            $$0.a(8, 20, 8, 32, 4, 12, true, false);
            $$0.a(12, 20, 16, 32, 4, 12, true, false);
            $$0.a(44, 16, -8, 32, 4, 4, true, false);
            $$0.a(48, 16, -8, 32, 4, 4, true, false);
            $$0.a(40, 20, 0, 32, 4, 12, true, false);
            $$0.a(44, 20, -8, 32, 4, 12, true, false);
            $$0.a(48, 20, -16, 32, 4, 12, true, false);
            $$0.a(52, 20, -8, 32, 4, 12, true, false);
        }
        fuj.b($$0, 0, 0, 32, 16);
        if ($$3) {
            fuj.a($$0, 32, 0, 64, 32);
        }
        fuj.b($$0, 0, 16, 64, 32);
        fuj.b($$0, 16, 48, 48, 64);
        return $$0;
    }

    private static void a(ehk $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$3; ++$$5) {
            for (int $$6 = $$2; $$6 < $$4; ++$$6) {
                int $$7 = $$0.a($$5, $$6);
                if (($$7 >> 24 & 0xFF) >= 128) continue;
                return;
            }
        }
        for (int $$8 = $$1; $$8 < $$3; ++$$8) {
            for (int $$9 = $$2; $$9 < $$4; ++$$9) {
                $$0.a($$8, $$9, $$0.a($$8, $$9) & 0xFFFFFF);
            }
        }
    }

    private static void b(ehk $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$3; ++$$5) {
            for (int $$6 = $$2; $$6 < $$4; ++$$6) {
                $$0.a($$5, $$6, $$0.a($$5, $$6) | 0xFF000000);
            }
        }
    }
}

