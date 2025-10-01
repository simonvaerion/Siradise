/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package com.mojang.blaze3d.platform;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@egb
public class TextureUtil {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final int MIN_MIPMAP_LEVEL = 0;
    private static final int DEFAULT_IMAGE_BUFFER_SIZE = 8192;

    public static int generateTextureId() {
        RenderSystem.assertOnRenderThreadOrInit();
        if (aa.aS) {
            int[] $$0 = new int[ThreadLocalRandom.current().nextInt(15) + 1];
            GlStateManager._genTextures($$0);
            int $$1 = GlStateManager._genTexture();
            GlStateManager._deleteTextures($$0);
            return $$1;
        }
        return GlStateManager._genTexture();
    }

    public static void releaseTextureId(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager._deleteTexture($$0);
    }

    public static void prepareImage(int $$0, int $$1, int $$2) {
        TextureUtil.prepareImage(ehk.b.a, $$0, 0, $$1, $$2);
    }

    public static void prepareImage(ehk.b $$0, int $$1, int $$2, int $$3) {
        TextureUtil.prepareImage($$0, $$1, 0, $$2, $$3);
    }

    public static void prepareImage(int $$0, int $$1, int $$2, int $$3) {
        TextureUtil.prepareImage(ehk.b.a, $$0, $$1, $$2, $$3);
    }

    public static void prepareImage(ehk.b $$0, int $$1, int $$2, int $$3, int $$4) {
        RenderSystem.assertOnRenderThreadOrInit();
        TextureUtil.bind($$1);
        if ($$2 >= 0) {
            GlStateManager._texParameter(3553, 33085, $$2);
            GlStateManager._texParameter(3553, 33082, 0);
            GlStateManager._texParameter(3553, 33083, $$2);
            GlStateManager._texParameter(3553, 34049, 0.0f);
        }
        for (int $$5 = 0; $$5 <= $$2; ++$$5) {
            GlStateManager._texImage2D(3553, $$5, $$0.a(), $$3 >> $$5, $$4 >> $$5, 0, 6408, 5121, null);
        }
    }

    private static void bind(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager._bindTexture($$0);
    }

    public static ByteBuffer readResource(InputStream $$0) throws IOException {
        ReadableByteChannel $$1 = Channels.newChannel($$0);
        if ($$1 instanceof SeekableByteChannel) {
            SeekableByteChannel $$2 = (SeekableByteChannel)$$1;
            return TextureUtil.readResource($$1, (int)$$2.size() + 1);
        }
        return TextureUtil.readResource($$1, 8192);
    }

    private static ByteBuffer readResource(ReadableByteChannel $$0, int $$1) throws IOException {
        ByteBuffer $$2 = MemoryUtil.memAlloc((int)$$1);
        try {
            while ($$0.read($$2) != -1) {
                if ($$2.hasRemaining()) continue;
                $$2 = MemoryUtil.memRealloc((ByteBuffer)$$2, (int)($$2.capacity() * 2));
            }
            return $$2;
        }
        catch (IOException $$3) {
            MemoryUtil.memFree((Buffer)$$2);
            throw $$3;
        }
    }

    public static void writeAsPNG(Path $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
        TextureUtil.writeAsPNG($$0, $$1, $$2, $$3, $$4, $$5, null);
    }

    public static void writeAsPNG(Path $$0, String $$1, int $$2, int $$3, int $$4, int $$5, @Nullable IntUnaryOperator $$6) {
        RenderSystem.assertOnRenderThread();
        TextureUtil.bind($$2);
        for (int $$7 = 0; $$7 <= $$3; ++$$7) {
            int $$8 = $$4 >> $$7;
            int $$9 = $$5 >> $$7;
            try (ehk $$10 = new ehk($$8, $$9, false);){
                $$10.a($$7, false);
                if ($$6 != null) {
                    $$10.b($$6);
                }
                Path $$11 = $$0.resolve($$1 + "_" + $$7 + ".png");
                $$10.a($$11);
                LOGGER.debug("Exported png to: {}", (Object)$$11.toAbsolutePath());
                continue;
            }
            catch (IOException $$12) {
                LOGGER.debug("Unable to write: ", (Throwable)$$12);
            }
        }
    }

    public static Path getDebugTexturePath(Path $$0) {
        return $$0.resolve("screenshots").resolve("debug");
    }

    public static Path getDebugTexturePath() {
        return TextureUtil.getDebugTexturePath(Path.of(".", new String[0]));
    }
}

