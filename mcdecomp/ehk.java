/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.stb.STBIWriteCallback
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.stb.STBImageResize
 *  org.lwjgl.stb.STBImageWrite
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.lwjgl.stb.STBIWriteCallback;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public final class ehk
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final Set<StandardOpenOption> b = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    private final a c;
    private final int d;
    private final int e;
    private final boolean f;
    private long g;
    private final long h;

    public ehk(int $$0, int $$1, boolean $$2) {
        this(ehk$a.a, $$0, $$1, $$2);
    }

    public ehk(a $$0, int $$1, int $$2, boolean $$3) {
        if ($$1 <= 0 || $$2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
        }
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.h = (long)$$1 * (long)$$2 * (long)$$0.a();
        this.f = false;
        this.g = $$3 ? MemoryUtil.nmemCalloc((long)1L, (long)this.h) : MemoryUtil.nmemAlloc((long)this.h);
    }

    private ehk(a $$0, int $$1, int $$2, boolean $$3, long $$4) {
        if ($$1 <= 0 || $$2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + $$1 + "x" + $$2);
        }
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = (long)$$1 * (long)$$2 * (long)$$0.a();
    }

    public String toString() {
        return "NativeImage[" + this.c + " " + this.d + "x" + this.e + "@" + this.g + (this.f ? "S" : "N") + "]";
    }

    private boolean f(int $$0, int $$1) {
        return $$0 < 0 || $$0 >= this.d || $$1 < 0 || $$1 >= this.e;
    }

    public static ehk a(InputStream $$0) throws IOException {
        return ehk.a(ehk$a.a, $$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ehk a(@Nullable a $$0, InputStream $$1) throws IOException {
        ByteBuffer $$2 = null;
        try {
            $$2 = TextureUtil.readResource($$1);
            $$2.rewind();
            ehk ehk2 = ehk.a($$0, $$2);
            return ehk2;
        }
        finally {
            MemoryUtil.memFree((Buffer)$$2);
            IOUtils.closeQuietly((InputStream)$$1);
        }
    }

    public static ehk a(ByteBuffer $$0) throws IOException {
        return ehk.a(ehk$a.a, $$0);
    }

    public static ehk a(byte[] $$0) throws IOException {
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            ByteBuffer $$2 = $$1.malloc($$0.length);
            $$2.put($$0);
            $$2.rewind();
            ehk ehk2 = ehk.a($$2);
            return ehk2;
        }
    }

    public static ehk a(@Nullable a $$0, ByteBuffer $$1) throws IOException {
        if ($$0 != null && !$$0.w()) {
            throw new UnsupportedOperationException("Don't know how to read format " + $$0);
        }
        if (MemoryUtil.memAddress((ByteBuffer)$$1) == 0L) {
            throw new IllegalArgumentException("Invalid buffer");
        }
        try (MemoryStack $$2 = MemoryStack.stackPush();){
            IntBuffer $$3 = $$2.mallocInt(1);
            IntBuffer $$4 = $$2.mallocInt(1);
            IntBuffer $$5 = $$2.mallocInt(1);
            ByteBuffer $$6 = STBImage.stbi_load_from_memory((ByteBuffer)$$1, (IntBuffer)$$3, (IntBuffer)$$4, (IntBuffer)$$5, (int)($$0 == null ? 0 : $$0.e));
            if ($$6 == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            ehk ehk2 = new ehk($$0 == null ? ehk$a.a($$5.get(0)) : $$0, $$3.get(0), $$4.get(0), true, MemoryUtil.memAddress((ByteBuffer)$$6));
            return ehk2;
        }
    }

    private static void a(boolean $$0, boolean $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        if ($$0) {
            GlStateManager._texParameter(3553, 10241, $$1 ? 9987 : 9729);
            GlStateManager._texParameter(3553, 10240, 9729);
        } else {
            GlStateManager._texParameter(3553, 10241, $$1 ? 9986 : 9728);
            GlStateManager._texParameter(3553, 10240, 9728);
        }
    }

    private void j() {
        if (this.g == 0L) {
            throw new IllegalStateException("Image is not allocated.");
        }
    }

    @Override
    public void close() {
        if (this.g != 0L) {
            if (this.f) {
                STBImage.nstbi_image_free((long)this.g);
            } else {
                MemoryUtil.nmemFree((long)this.g);
            }
        }
        this.g = 0L;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public a c() {
        return this.c;
    }

    public int a(int $$0, int $$1) {
        if (this.c != ehk$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        this.j();
        long $$2 = ((long)$$0 + (long)$$1 * (long)this.d) * 4L;
        return MemoryUtil.memGetInt((long)(this.g + $$2));
    }

    public void a(int $$0, int $$1, int $$2) {
        if (this.c != ehk$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        this.j();
        long $$3 = ((long)$$0 + (long)$$1 * (long)this.d) * 4L;
        MemoryUtil.memPutInt((long)(this.g + $$3), (int)$$2);
    }

    public ehk a(IntUnaryOperator $$0) {
        if (this.c != ehk$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", new Object[]{this.c}));
        }
        this.j();
        ehk $$1 = new ehk(this.d, this.e, false);
        int $$2 = this.d * this.e;
        IntBuffer $$3 = MemoryUtil.memIntBuffer((long)this.g, (int)$$2);
        IntBuffer $$4 = MemoryUtil.memIntBuffer((long)$$1.g, (int)$$2);
        for (int $$5 = 0; $$5 < $$2; ++$$5) {
            $$4.put($$5, $$0.applyAsInt($$3.get($$5)));
        }
        return $$1;
    }

    public void b(IntUnaryOperator $$0) {
        if (this.c != ehk$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", new Object[]{this.c}));
        }
        this.j();
        int $$1 = this.d * this.e;
        IntBuffer $$2 = MemoryUtil.memIntBuffer((long)this.g, (int)$$1);
        for (int $$3 = 0; $$3 < $$1; ++$$3) {
            $$2.put($$3, $$0.applyAsInt($$2.get($$3)));
        }
    }

    public int[] d() {
        if (this.c != ehk$a.a) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelsRGBA only works on RGBA images; have %s", new Object[]{this.c}));
        }
        this.j();
        int[] $$0 = new int[this.d * this.e];
        MemoryUtil.memIntBuffer((long)this.g, (int)(this.d * this.e)).get($$0);
        return $$0;
    }

    public void a(int $$0, int $$1, byte $$2) {
        RenderSystem.assertOnRenderThread();
        if (!this.c.h()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelLuminance only works on image with luminance; have %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        this.j();
        long $$3 = ((long)$$0 + (long)$$1 * (long)this.d) * (long)this.c.a() + (long)(this.c.m() / 8);
        MemoryUtil.memPutByte((long)(this.g + $$3), (byte)$$2);
    }

    public byte b(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        if (!this.c.o()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no red or luminance in %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        int $$2 = ($$0 + $$1 * this.d) * this.c.a() + this.c.s() / 8;
        return MemoryUtil.memGetByte((long)(this.g + (long)$$2));
    }

    public byte c(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        if (!this.c.p()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no green or luminance in %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        int $$2 = ($$0 + $$1 * this.d) * this.c.a() + this.c.t() / 8;
        return MemoryUtil.memGetByte((long)(this.g + (long)$$2));
    }

    public byte d(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        if (!this.c.q()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no blue or luminance in %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        int $$2 = ($$0 + $$1 * this.d) * this.c.a() + this.c.u() / 8;
        return MemoryUtil.memGetByte((long)(this.g + (long)$$2));
    }

    public byte e(int $$0, int $$1) {
        if (!this.c.r()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", new Object[]{this.c}));
        }
        if (this.f($$0, $$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", $$0, $$1, this.d, this.e));
        }
        int $$2 = ($$0 + $$1 * this.d) * this.c.a() + this.c.v() / 8;
        return MemoryUtil.memGetByte((long)(this.g + (long)$$2));
    }

    public void b(int $$0, int $$1, int $$2) {
        if (this.c != ehk$a.a) {
            throw new UnsupportedOperationException("Can only call blendPixel with RGBA format");
        }
        int $$3 = this.a($$0, $$1);
        float $$4 = (float)aok.a.a($$2) / 255.0f;
        float $$5 = (float)aok.a.d($$2) / 255.0f;
        float $$6 = (float)aok.a.c($$2) / 255.0f;
        float $$7 = (float)aok.a.b($$2) / 255.0f;
        float $$8 = (float)aok.a.a($$3) / 255.0f;
        float $$9 = (float)aok.a.d($$3) / 255.0f;
        float $$10 = (float)aok.a.c($$3) / 255.0f;
        float $$11 = (float)aok.a.b($$3) / 255.0f;
        float $$12 = $$4;
        float $$13 = 1.0f - $$4;
        float $$14 = $$4 * $$12 + $$8 * $$13;
        float $$15 = $$5 * $$12 + $$9 * $$13;
        float $$16 = $$6 * $$12 + $$10 * $$13;
        float $$17 = $$7 * $$12 + $$11 * $$13;
        if ($$14 > 1.0f) {
            $$14 = 1.0f;
        }
        if ($$15 > 1.0f) {
            $$15 = 1.0f;
        }
        if ($$16 > 1.0f) {
            $$16 = 1.0f;
        }
        if ($$17 > 1.0f) {
            $$17 = 1.0f;
        }
        int $$18 = (int)($$14 * 255.0f);
        int $$19 = (int)($$15 * 255.0f);
        int $$20 = (int)($$16 * 255.0f);
        int $$21 = (int)($$17 * 255.0f);
        this.a($$0, $$1, aok.a.a($$18, $$19, $$20, $$21));
    }

    @Deprecated
    public int[] e() {
        if (this.c != ehk$a.a) {
            throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
        }
        this.j();
        int[] $$0 = new int[this.a() * this.b()];
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            for (int $$2 = 0; $$2 < this.a(); ++$$2) {
                int $$3 = this.a($$2, $$1);
                $$0[$$2 + $$1 * this.a()] = aok.b.a(aok.a.a($$3), aok.a.b($$3), aok.a.c($$3), aok.a.d($$3));
            }
        }
        return $$0;
    }

    public void a(int $$0, int $$1, int $$2, boolean $$3) {
        this.a($$0, $$1, $$2, 0, 0, this.d, this.e, false, $$3);
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, false, $$7, $$8);
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10));
        } else {
            this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, boolean $$9, boolean $$10) {
        try {
            RenderSystem.assertOnRenderThreadOrInit();
            this.j();
            ehk.a($$7, $$9);
            if ($$5 == this.a()) {
                GlStateManager._pixelStore(3314, 0);
            } else {
                GlStateManager._pixelStore(3314, this.a());
            }
            GlStateManager._pixelStore(3316, $$3);
            GlStateManager._pixelStore(3315, $$4);
            this.c.c();
            GlStateManager._texSubImage2D(3553, $$0, $$1, $$2, $$5, $$6, this.c.d(), 5121, this.g);
            if ($$8) {
                GlStateManager._texParameter(3553, 10242, 33071);
                GlStateManager._texParameter(3553, 10243, 33071);
            }
        }
        finally {
            if ($$10) {
                this.close();
            }
        }
    }

    public void a(int $$0, boolean $$1) {
        RenderSystem.assertOnRenderThread();
        this.j();
        this.c.b();
        GlStateManager._getTexImage(3553, $$0, this.c.d(), 5121, this.g);
        if ($$1 && this.c.i()) {
            for (int $$2 = 0; $$2 < this.b(); ++$$2) {
                for (int $$3 = 0; $$3 < this.a(); ++$$3) {
                    this.a($$3, $$2, this.a($$3, $$2) | 255 << this.c.n());
                }
            }
        }
    }

    public void a(float $$0) {
        RenderSystem.assertOnRenderThread();
        if (this.c.a() != 1) {
            throw new IllegalStateException("Depth buffer must be stored in NativeImage with 1 component.");
        }
        this.j();
        this.c.b();
        GlStateManager._readPixels(0, 0, this.d, this.e, 6402, 5121, this.g);
    }

    public void f() {
        RenderSystem.assertOnRenderThread();
        this.c.c();
        GlStateManager._glDrawPixels(this.d, this.e, this.c.d(), 5121, this.g);
    }

    public void a(File $$0) throws IOException {
        this.a($$0.toPath());
    }

    public void a(STBTTFontinfo $$0, int $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7, int $$8, int $$9) {
        if ($$8 < 0 || $$8 + $$2 > this.a() || $$9 < 0 || $$9 + $$3 > this.b()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", $$8, $$9, $$2, $$3, this.a(), this.b()));
        }
        if (this.c.a() != 1) {
            throw new IllegalArgumentException("Can only write fonts into 1-component images.");
        }
        STBTruetype.nstbtt_MakeGlyphBitmapSubpixel((long)$$0.address(), (long)(this.g + (long)$$8 + (long)($$9 * this.a())), (int)$$2, (int)$$3, (int)this.a(), (float)$$4, (float)$$5, (float)$$6, (float)$$7, (int)$$1);
    }

    public void a(Path $$0) throws IOException {
        if (!this.c.w()) {
            throw new UnsupportedOperationException("Don't know how to write format " + this.c);
        }
        this.j();
        try (SeekableByteChannel $$1 = Files.newByteChannel($$0, b, new FileAttribute[0]);){
            if (!this.a($$1)) {
                throw new IOException("Could not write image to the PNG file \"" + $$0.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
        }
    }

    public byte[] g() throws IOException {
        try (ByteArrayOutputStream $$0 = new ByteArrayOutputStream();){
            byte[] byArray;
            block12: {
                WritableByteChannel $$1 = Channels.newChannel($$0);
                try {
                    if (!this.a($$1)) {
                        throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
                    }
                    byArray = $$0.toByteArray();
                    if ($$1 == null) break block12;
                }
                catch (Throwable throwable) {
                    if ($$1 != null) {
                        try {
                            $$1.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                $$1.close();
            }
            return byArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(WritableByteChannel $$0) throws IOException {
        c $$1 = new c($$0);
        try {
            int $$2 = Math.min(this.b(), Integer.MAX_VALUE / this.a() / this.c.a());
            if ($$2 < this.b()) {
                a.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", (Object)this.b(), (Object)$$2);
            }
            if (STBImageWrite.nstbi_write_png_to_func((long)$$1.address(), (long)0L, (int)this.a(), (int)$$2, (int)this.c.a(), (long)this.g, (int)0) == 0) {
                boolean bl2 = false;
                return bl2;
            }
            $$1.a();
            boolean bl3 = true;
            return bl3;
        }
        finally {
            $$1.free();
        }
    }

    public void a(ehk $$0) {
        if ($$0.c() != this.c) {
            throw new UnsupportedOperationException("Image formats don't match.");
        }
        int $$1 = this.c.a();
        this.j();
        $$0.j();
        if (this.d == $$0.d) {
            MemoryUtil.memCopy((long)$$0.g, (long)this.g, (long)Math.min(this.h, $$0.h));
        } else {
            int $$2 = Math.min(this.a(), $$0.a());
            int $$3 = Math.min(this.b(), $$0.b());
            for (int $$4 = 0; $$4 < $$3; ++$$4) {
                int $$5 = $$4 * $$0.a() * $$1;
                int $$6 = $$4 * this.a() * $$1;
                MemoryUtil.memCopy((long)($$0.g + (long)$$5), (long)(this.g + (long)$$6), (long)$$2);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$1 + $$3; ++$$5) {
            for (int $$6 = $$0; $$6 < $$0 + $$2; ++$$6) {
                this.a($$6, $$5, $$4);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6, boolean $$7) {
        this.a(this, $$0, $$1, $$0 + $$2, $$1 + $$3, $$4, $$5, $$6, $$7);
    }

    public void a(ehk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8) {
        for (int $$9 = 0; $$9 < $$6; ++$$9) {
            for (int $$10 = 0; $$10 < $$5; ++$$10) {
                int $$11 = $$7 ? $$5 - 1 - $$10 : $$10;
                int $$12 = $$8 ? $$6 - 1 - $$9 : $$9;
                int $$13 = this.a($$1 + $$10, $$2 + $$9);
                $$0.a($$3 + $$11, $$4 + $$12, $$13);
            }
        }
    }

    public void h() {
        this.j();
        try (MemoryStack $$0 = MemoryStack.stackPush();){
            int $$1 = this.c.a();
            int $$2 = this.a() * $$1;
            long $$3 = $$0.nmalloc($$2);
            for (int $$4 = 0; $$4 < this.b() / 2; ++$$4) {
                int $$5 = $$4 * this.a() * $$1;
                int $$6 = (this.b() - 1 - $$4) * this.a() * $$1;
                MemoryUtil.memCopy((long)(this.g + (long)$$5), (long)$$3, (long)$$2);
                MemoryUtil.memCopy((long)(this.g + (long)$$6), (long)(this.g + (long)$$5), (long)$$2);
                MemoryUtil.memCopy((long)$$3, (long)(this.g + (long)$$6), (long)$$2);
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, ehk $$4) {
        this.j();
        if ($$4.c() != this.c) {
            throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
        }
        int $$5 = this.c.a();
        STBImageResize.nstbir_resize_uint8((long)(this.g + (long)(($$0 + $$1 * this.a()) * $$5)), (int)$$2, (int)$$3, (int)(this.a() * $$5), (long)$$4.g, (int)$$4.a(), (int)$$4.b(), (int)0, (int)$$5);
    }

    public void i() {
        egz.a(this.g);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true);
        public static final /* enum */ a b = new a(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true);
        public static final /* enum */ a c = new a(2, 33319, false, false, false, true, true, 255, 255, 255, 0, 8, true);
        public static final /* enum */ a d = new a(1, 6403, false, false, false, true, false, 0, 0, 0, 0, 255, true);
        final int e;
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;
        private final int p;
        private final boolean q;
        private static final /* synthetic */ a[] r;

        public static a[] values() {
            return (a[])r.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, int $$7, int $$8, int $$9, int $$10, int $$11, boolean $$12) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
            this.j = $$5;
            this.k = $$6;
            this.l = $$7;
            this.m = $$8;
            this.n = $$9;
            this.o = $$10;
            this.p = $$11;
            this.q = $$12;
        }

        public int a() {
            return this.e;
        }

        public void b() {
            RenderSystem.assertOnRenderThread();
            GlStateManager._pixelStore(3333, this.a());
        }

        public void c() {
            RenderSystem.assertOnRenderThreadOrInit();
            GlStateManager._pixelStore(3317, this.a());
        }

        public int d() {
            return this.f;
        }

        public boolean e() {
            return this.g;
        }

        public boolean f() {
            return this.h;
        }

        public boolean g() {
            return this.i;
        }

        public boolean h() {
            return this.j;
        }

        public boolean i() {
            return this.k;
        }

        public int j() {
            return this.l;
        }

        public int k() {
            return this.m;
        }

        public int l() {
            return this.n;
        }

        public int m() {
            return this.o;
        }

        public int n() {
            return this.p;
        }

        public boolean o() {
            return this.j || this.g;
        }

        public boolean p() {
            return this.j || this.h;
        }

        public boolean q() {
            return this.j || this.i;
        }

        public boolean r() {
            return this.j || this.k;
        }

        public int s() {
            return this.j ? this.o : this.l;
        }

        public int t() {
            return this.j ? this.o : this.m;
        }

        public int u() {
            return this.j ? this.o : this.n;
        }

        public int v() {
            return this.j ? this.o : this.p;
        }

        public boolean w() {
            return this.q;
        }

        static a a(int $$0) {
            switch ($$0) {
                case 1: {
                    return d;
                }
                case 2: {
                    return c;
                }
                case 3: {
                    return b;
                }
            }
            return a;
        }

        private static /* synthetic */ a[] x() {
            return new a[]{a, b, c, d};
        }

        static {
            r = ehk$a.x();
        }
    }

    static class c
    extends STBIWriteCallback {
        private final WritableByteChannel a;
        @Nullable
        private IOException b;

        c(WritableByteChannel $$0) {
            this.a = $$0;
        }

        public void invoke(long $$0, long $$1, int $$2) {
            ByteBuffer $$3 = ehk$c.getData((long)$$1, (int)$$2);
            try {
                this.a.write($$3);
            }
            catch (IOException $$4) {
                this.b = $$4;
            }
        }

        public void a() throws IOException {
            if (this.b != null) {
                throw this.b;
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(6408);
        public static final /* enum */ b b = new b(6407);
        public static final /* enum */ b c = new b(33319);
        public static final /* enum */ b d = new b(6403);
        private final int e;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0) {
            this.e = $$0;
        }

        public int a() {
            return this.e;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d};
        }

        static {
            f = ehk$b.b();
        }
    }
}

