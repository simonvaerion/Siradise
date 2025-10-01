/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package com.mojang.blaze3d.platform;

import com.google.common.base.Charsets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

@egb
public class GlStateManager {
    private static final boolean ON_LINUX = ac.i() == ac.b.a;
    public static final int TEXTURE_COUNT = 12;
    private static final a BLEND = new a();
    private static final f DEPTH = new f();
    private static final e CULL = new e();
    private static final h POLY_OFFSET = new h();
    private static final c COLOR_LOGIC = new c();
    private static final k STENCIL = new k();
    private static final i SCISSOR = new i();
    private static int activeTexture;
    private static final l[] TEXTURES;
    private static final d COLOR_MASK;

    public static void _disableScissorTest() {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager.SCISSOR.a.a();
    }

    public static void _enableScissorTest() {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager.SCISSOR.a.b();
    }

    public static void _scissorBox(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL20.glScissor((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static void _disableDepthTest() {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager.DEPTH.a.a();
    }

    public static void _enableDepthTest() {
        RenderSystem.assertOnRenderThreadOrInit();
        GlStateManager.DEPTH.a.b();
    }

    public static void _depthFunc(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        if ($$0 != GlStateManager.DEPTH.c) {
            GlStateManager.DEPTH.c = $$0;
            GL11.glDepthFunc((int)$$0);
        }
    }

    public static void _depthMask(boolean $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.DEPTH.b) {
            GlStateManager.DEPTH.b = $$0;
            GL11.glDepthMask((boolean)$$0);
        }
    }

    public static void _disableBlend() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.a.a();
    }

    public static void _enableBlend() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.a.b();
    }

    public static void _blendFunc(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.BLEND.b || $$1 != GlStateManager.BLEND.c) {
            GlStateManager.BLEND.b = $$0;
            GlStateManager.BLEND.c = $$1;
            GL11.glBlendFunc((int)$$0, (int)$$1);
        }
    }

    public static void _blendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.BLEND.b || $$1 != GlStateManager.BLEND.c || $$2 != GlStateManager.BLEND.d || $$3 != GlStateManager.BLEND.e) {
            GlStateManager.BLEND.b = $$0;
            GlStateManager.BLEND.c = $$1;
            GlStateManager.BLEND.d = $$2;
            GlStateManager.BLEND.e = $$3;
            GlStateManager.glBlendFuncSeparate($$0, $$1, $$2, $$3);
        }
    }

    public static void _blendEquation(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL14.glBlendEquation((int)$$0);
    }

    public static int glGetProgrami(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgrami((int)$$0, (int)$$1);
    }

    public static void glAttachShader(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glAttachShader((int)$$0, (int)$$1);
    }

    public static void glDeleteShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteShader((int)$$0);
    }

    public static int glCreateShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateShader((int)$$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void glShaderSource(int $$0, List<String> $$1) {
        RenderSystem.assertOnRenderThread();
        StringBuilder $$2 = new StringBuilder();
        for (String $$3 : $$1) {
            $$2.append($$3);
        }
        byte[] $$4 = $$2.toString().getBytes(Charsets.UTF_8);
        ByteBuffer $$5 = MemoryUtil.memAlloc((int)($$4.length + 1));
        $$5.put($$4);
        $$5.put((byte)0);
        $$5.flip();
        try (MemoryStack $$6 = MemoryStack.stackPush();){
            PointerBuffer $$7 = $$6.mallocPointer(1);
            $$7.put($$5);
            GL20C.nglShaderSource((int)$$0, (int)1, (long)$$7.address0(), (long)0L);
        }
        finally {
            MemoryUtil.memFree((Buffer)$$5);
        }
    }

    public static void glCompileShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glCompileShader((int)$$0);
    }

    public static int glGetShaderi(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderi((int)$$0, (int)$$1);
    }

    public static void _glUseProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glUseProgram((int)$$0);
    }

    public static int glCreateProgram() {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateProgram();
    }

    public static void glDeleteProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteProgram((int)$$0);
    }

    public static void glLinkProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glLinkProgram((int)$$0);
    }

    public static int _glGetUniformLocation(int $$0, CharSequence $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetUniformLocation((int)$$0, (CharSequence)$$1);
    }

    public static void _glUniform1(int $$0, IntBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform1iv((int)$$0, (IntBuffer)$$1);
    }

    public static void _glUniform1i(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform1i((int)$$0, (int)$$1);
    }

    public static void _glUniform1(int $$0, FloatBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform1fv((int)$$0, (FloatBuffer)$$1);
    }

    public static void _glUniform2(int $$0, IntBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform2iv((int)$$0, (IntBuffer)$$1);
    }

    public static void _glUniform2(int $$0, FloatBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform2fv((int)$$0, (FloatBuffer)$$1);
    }

    public static void _glUniform3(int $$0, IntBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform3iv((int)$$0, (IntBuffer)$$1);
    }

    public static void _glUniform3(int $$0, FloatBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform3fv((int)$$0, (FloatBuffer)$$1);
    }

    public static void _glUniform4(int $$0, IntBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform4iv((int)$$0, (IntBuffer)$$1);
    }

    public static void _glUniform4(int $$0, FloatBuffer $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform4fv((int)$$0, (FloatBuffer)$$1);
    }

    public static void _glUniformMatrix2(int $$0, boolean $$1, FloatBuffer $$2) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniformMatrix2fv((int)$$0, (boolean)$$1, (FloatBuffer)$$2);
    }

    public static void _glUniformMatrix3(int $$0, boolean $$1, FloatBuffer $$2) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniformMatrix3fv((int)$$0, (boolean)$$1, (FloatBuffer)$$2);
    }

    public static void _glUniformMatrix4(int $$0, boolean $$1, FloatBuffer $$2) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniformMatrix4fv((int)$$0, (boolean)$$1, (FloatBuffer)$$2);
    }

    public static int _glGetAttribLocation(int $$0, CharSequence $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetAttribLocation((int)$$0, (CharSequence)$$1);
    }

    public static void _glBindAttribLocation(int $$0, int $$1, CharSequence $$2) {
        RenderSystem.assertOnRenderThread();
        GL20.glBindAttribLocation((int)$$0, (int)$$1, (CharSequence)$$2);
    }

    public static int _glGenBuffers() {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL15.glGenBuffers();
    }

    public static int _glGenVertexArrays() {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL30.glGenVertexArrays();
    }

    public static void _glBindBuffer(int $$0, int $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL15.glBindBuffer((int)$$0, (int)$$1);
    }

    public static void _glBindVertexArray(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glBindVertexArray((int)$$0);
    }

    public static void _glBufferData(int $$0, ByteBuffer $$1, int $$2) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL15.glBufferData((int)$$0, (ByteBuffer)$$1, (int)$$2);
    }

    public static void _glBufferData(int $$0, long $$1, int $$2) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL15.glBufferData((int)$$0, (long)$$1, (int)$$2);
    }

    @Nullable
    public static ByteBuffer _glMapBuffer(int $$0, int $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL15.glMapBuffer((int)$$0, (int)$$1);
    }

    public static void _glUnmapBuffer(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL15.glUnmapBuffer((int)$$0);
    }

    public static void _glDeleteBuffers(int $$0) {
        RenderSystem.assertOnRenderThread();
        if (ON_LINUX) {
            GL32C.glBindBuffer((int)34962, (int)$$0);
            GL32C.glBufferData((int)34962, (long)0L, (int)35048);
            GL32C.glBindBuffer((int)34962, (int)0);
        }
        GL15.glDeleteBuffers((int)$$0);
    }

    public static void _glCopyTexSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL20.glCopyTexSubImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7);
    }

    public static void _glDeleteVertexArrays(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL30.glDeleteVertexArrays((int)$$0);
    }

    public static void _glBindFramebuffer(int $$0, int $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glBindFramebuffer((int)$$0, (int)$$1);
    }

    public static void _glBlitFrameBuffer(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glBlitFramebuffer((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (int)$$8, (int)$$9);
    }

    public static void _glBindRenderbuffer(int $$0, int $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glBindRenderbuffer((int)$$0, (int)$$1);
    }

    public static void _glDeleteRenderbuffers(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glDeleteRenderbuffers((int)$$0);
    }

    public static void _glDeleteFramebuffers(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glDeleteFramebuffers((int)$$0);
    }

    public static int glGenFramebuffers() {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL30.glGenFramebuffers();
    }

    public static int glGenRenderbuffers() {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL30.glGenRenderbuffers();
    }

    public static void _glRenderbufferStorage(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glRenderbufferStorage((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static void _glFramebufferRenderbuffer(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glFramebufferRenderbuffer((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static int glCheckFramebufferStatus(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL30.glCheckFramebufferStatus((int)$$0);
    }

    public static void _glFramebufferTexture2D(int $$0, int $$1, int $$2, int $$3, int $$4) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL30.glFramebufferTexture2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4);
    }

    public static int getBoundFramebuffer() {
        RenderSystem.assertOnRenderThread();
        return GlStateManager._getInteger(36006);
    }

    public static void glActiveTexture(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL13.glActiveTexture((int)$$0);
    }

    public static void glBlendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        GL14.glBlendFuncSeparate((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static String glGetShaderInfoLog(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderInfoLog((int)$$0, (int)$$1);
    }

    public static String glGetProgramInfoLog(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgramInfoLog((int)$$0, (int)$$1);
    }

    public static void setupLevelDiffuseLighting(Vector3f $$0, Vector3f $$1, Matrix4f $$2) {
        RenderSystem.assertOnRenderThread();
        Vector4f $$3 = $$2.transform(new Vector4f((Vector3fc)$$0, 1.0f));
        Vector4f $$4 = $$2.transform(new Vector4f((Vector3fc)$$1, 1.0f));
        RenderSystem.setShaderLights(new Vector3f($$3.x(), $$3.y(), $$3.z()), new Vector3f($$4.x(), $$4.y(), $$4.z()));
    }

    public static void setupGuiFlatDiffuseLighting(Vector3f $$0, Vector3f $$1) {
        RenderSystem.assertOnRenderThread();
        Matrix4f $$2 = new Matrix4f().scaling(1.0f, -1.0f, 1.0f).rotateY(-0.3926991f).rotateX(2.3561945f);
        GlStateManager.setupLevelDiffuseLighting($$0, $$1, $$2);
    }

    public static void setupGui3DDiffuseLighting(Vector3f $$0, Vector3f $$1) {
        RenderSystem.assertOnRenderThread();
        Matrix4f $$2 = new Matrix4f().rotationYXZ(1.0821041f, 3.2375858f, 0.0f).rotateYXZ(-0.3926991f, 2.3561945f, 0.0f);
        GlStateManager.setupLevelDiffuseLighting($$0, $$1, $$2);
    }

    public static void _enableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.a.b();
    }

    public static void _disableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.a.a();
    }

    public static void _polygonMode(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL11.glPolygonMode((int)$$0, (int)$$1);
    }

    public static void _enablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.a.b();
    }

    public static void _disablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.a.a();
    }

    public static void _polygonOffset(float $$0, float $$1) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.POLY_OFFSET.c || $$1 != GlStateManager.POLY_OFFSET.d) {
            GlStateManager.POLY_OFFSET.c = $$0;
            GlStateManager.POLY_OFFSET.d = $$1;
            GL11.glPolygonOffset((float)$$0, (float)$$1);
        }
    }

    public static void _enableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.a.b();
    }

    public static void _disableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.a.a();
    }

    public static void _logicOp(int $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.COLOR_LOGIC.b) {
            GlStateManager.COLOR_LOGIC.b = $$0;
            GL11.glLogicOp((int)$$0);
        }
    }

    public static void _activeTexture(int $$0) {
        RenderSystem.assertOnRenderThread();
        if (activeTexture != $$0 - 33984) {
            activeTexture = $$0 - 33984;
            GlStateManager.glActiveTexture($$0);
        }
    }

    public static void _texParameter(int $$0, int $$1, float $$2) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glTexParameterf((int)$$0, (int)$$1, (float)$$2);
    }

    public static void _texParameter(int $$0, int $$1, int $$2) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glTexParameteri((int)$$0, (int)$$1, (int)$$2);
    }

    public static int _getTexLevelParameter(int $$0, int $$1, int $$2) {
        RenderSystem.assertInInitPhase();
        return GL11.glGetTexLevelParameteri((int)$$0, (int)$$1, (int)$$2);
    }

    public static int _genTexture() {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL11.glGenTextures();
    }

    public static void _genTextures(int[] $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glGenTextures((int[])$$0);
    }

    public static void _deleteTexture(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glDeleteTextures((int)$$0);
        for (l $$1 : TEXTURES) {
            if ($$1.a != $$0) continue;
            $$1.a = -1;
        }
    }

    public static void _deleteTextures(int[] $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        for (l $$1 : TEXTURES) {
            for (int $$2 : $$0) {
                if ($$1.a != $$2) continue;
                $$1.a = -1;
            }
        }
        GL11.glDeleteTextures((int[])$$0);
    }

    public static void _bindTexture(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        if ($$0 != GlStateManager.TEXTURES[GlStateManager.activeTexture].a) {
            GlStateManager.TEXTURES[GlStateManager.activeTexture].a = $$0;
            GL11.glBindTexture((int)3553, (int)$$0);
        }
    }

    public static int _getActiveTexture() {
        return activeTexture + 33984;
    }

    public static void _texImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, @Nullable IntBuffer $$8) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glTexImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (IntBuffer)$$8);
    }

    public static void _texSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glTexSubImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (long)$$8);
    }

    public static void upload(int $$0, int $$1, int $$2, int $$3, int $$4, ehk.a $$5, IntBuffer $$6, Consumer<IntBuffer> $$7) {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> GlStateManager._upload($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
        } else {
            GlStateManager._upload($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void _upload(int $$0, int $$1, int $$2, int $$3, int $$4, ehk.a $$5, IntBuffer $$6, Consumer<IntBuffer> $$7) {
        try {
            RenderSystem.assertOnRenderThreadOrInit();
            GlStateManager._pixelStore(3314, $$3);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            $$5.c();
            GL11.glTexSubImage2D((int)3553, (int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5.d(), (int)5121, (IntBuffer)$$6);
        }
        finally {
            $$7.accept($$6);
        }
    }

    public static void _getTexImage(int $$0, int $$1, int $$2, int $$3, long $$4) {
        RenderSystem.assertOnRenderThread();
        GL11.glGetTexImage((int)$$0, (int)$$1, (int)$$2, (int)$$3, (long)$$4);
    }

    public static void _viewport(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThreadOrInit();
        m.a.b = $$0;
        m.a.c = $$1;
        m.a.d = $$2;
        m.a.e = $$3;
        GL11.glViewport((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static void _colorMask(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.COLOR_MASK.a || $$1 != GlStateManager.COLOR_MASK.b || $$2 != GlStateManager.COLOR_MASK.c || $$3 != GlStateManager.COLOR_MASK.d) {
            GlStateManager.COLOR_MASK.a = $$0;
            GlStateManager.COLOR_MASK.b = $$1;
            GlStateManager.COLOR_MASK.c = $$2;
            GlStateManager.COLOR_MASK.d = $$3;
            GL11.glColorMask((boolean)$$0, (boolean)$$1, (boolean)$$2, (boolean)$$3);
        }
    }

    public static void _stencilFunc(int $$0, int $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.STENCIL.a.a || $$0 != GlStateManager.STENCIL.a.b || $$0 != GlStateManager.STENCIL.a.c) {
            GlStateManager.STENCIL.a.a = $$0;
            GlStateManager.STENCIL.a.b = $$1;
            GlStateManager.STENCIL.a.c = $$2;
            GL11.glStencilFunc((int)$$0, (int)$$1, (int)$$2);
        }
    }

    public static void _stencilMask(int $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.STENCIL.b) {
            GlStateManager.STENCIL.b = $$0;
            GL11.glStencilMask((int)$$0);
        }
    }

    public static void _stencilOp(int $$0, int $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.STENCIL.c || $$1 != GlStateManager.STENCIL.d || $$2 != GlStateManager.STENCIL.e) {
            GlStateManager.STENCIL.c = $$0;
            GlStateManager.STENCIL.d = $$1;
            GlStateManager.STENCIL.e = $$2;
            GL11.glStencilOp((int)$$0, (int)$$1, (int)$$2);
        }
    }

    public static void _clearDepth(double $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glClearDepth((double)$$0);
    }

    public static void _clearColor(float $$0, float $$1, float $$2, float $$3) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glClearColor((float)$$0, (float)$$1, (float)$$2, (float)$$3);
    }

    public static void _clearStencil(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL11.glClearStencil((int)$$0);
    }

    public static void _clear(int $$0, boolean $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glClear((int)$$0);
        if ($$1) {
            GlStateManager._getError();
        }
    }

    public static void _glDrawPixels(int $$0, int $$1, int $$2, int $$3, long $$4) {
        RenderSystem.assertOnRenderThread();
        GL11.glDrawPixels((int)$$0, (int)$$1, (int)$$2, (int)$$3, (long)$$4);
    }

    public static void _vertexAttribPointer(int $$0, int $$1, int $$2, boolean $$3, int $$4, long $$5) {
        RenderSystem.assertOnRenderThread();
        GL20.glVertexAttribPointer((int)$$0, (int)$$1, (int)$$2, (boolean)$$3, (int)$$4, (long)$$5);
    }

    public static void _vertexAttribIPointer(int $$0, int $$1, int $$2, int $$3, long $$4) {
        RenderSystem.assertOnRenderThread();
        GL30.glVertexAttribIPointer((int)$$0, (int)$$1, (int)$$2, (int)$$3, (long)$$4);
    }

    public static void _enableVertexAttribArray(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glEnableVertexAttribArray((int)$$0);
    }

    public static void _disableVertexAttribArray(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glDisableVertexAttribArray((int)$$0);
    }

    public static void _drawElements(int $$0, int $$1, int $$2, long $$3) {
        RenderSystem.assertOnRenderThread();
        GL11.glDrawElements((int)$$0, (int)$$1, (int)$$2, (long)$$3);
    }

    public static void _pixelStore(int $$0, int $$1) {
        RenderSystem.assertOnRenderThreadOrInit();
        GL11.glPixelStorei((int)$$0, (int)$$1);
    }

    public static void _readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, ByteBuffer $$6) {
        RenderSystem.assertOnRenderThread();
        GL11.glReadPixels((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (ByteBuffer)$$6);
    }

    public static void _readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, long $$6) {
        RenderSystem.assertOnRenderThread();
        GL11.glReadPixels((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (long)$$6);
    }

    public static int _getError() {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetError();
    }

    public static String _getString(int $$0) {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetString((int)$$0);
    }

    public static int _getInteger(int $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        return GL11.glGetInteger((int)$$0);
    }

    static {
        TEXTURES = (l[])IntStream.range(0, 12).mapToObj($$0 -> new l()).toArray(l[]::new);
        COLOR_MASK = new d();
    }

    static class i {
        public final b a = new b(3089);

        i() {
        }
    }

    static class b {
        private final int a;
        private boolean b;

        public b(int $$0) {
            this.a = $$0;
        }

        public void a() {
            this.a(false);
        }

        public void b() {
            this.a(true);
        }

        public void a(boolean $$0) {
            RenderSystem.assertOnRenderThreadOrInit();
            if ($$0 != this.b) {
                this.b = $$0;
                if ($$0) {
                    GL11.glEnable((int)this.a);
                } else {
                    GL11.glDisable((int)this.a);
                }
            }
        }
    }

    static class f {
        public final b a = new b(2929);
        public boolean b = true;
        public int c = 513;

        f() {
        }
    }

    static class a {
        public final b a = new b(3042);
        public int b = 1;
        public int c = 0;
        public int d = 1;
        public int e = 0;

        a() {
        }
    }

    static class e {
        public final b a = new b(2884);
        public int b = 1029;

        e() {
        }
    }

    static class h {
        public final b a = new b(32823);
        public final b b = new b(10754);
        public float c;
        public float d;

        h() {
        }
    }

    static class c {
        public final b a = new b(3058);
        public int b = 5379;

        c() {
        }
    }

    static class l {
        public int a;

        l() {
        }
    }

    public static final class m
    extends Enum<m> {
        public static final /* enum */ m a = new m();
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        private static final /* synthetic */ m[] f;

        public static m[] values() {
            return (m[])f.clone();
        }

        public static m valueOf(String $$0) {
            return Enum.valueOf(m.class, $$0);
        }

        public static int a() {
            return m.a.b;
        }

        public static int b() {
            return m.a.c;
        }

        public static int c() {
            return m.a.d;
        }

        public static int d() {
            return m.a.e;
        }

        private static /* synthetic */ m[] e() {
            return new m[]{a};
        }

        static {
            f = m.e();
        }
    }

    static class d {
        public boolean a = true;
        public boolean b = true;
        public boolean c = true;
        public boolean d = true;

        d() {
        }
    }

    static class k {
        public final j a = new j();
        public int b = -1;
        public int c = 7680;
        public int d = 7680;
        public int e = 7680;

        k() {
        }
    }

    static class j {
        public int a = 519;
        public int b;
        public int c = -1;

        j() {
        }
    }

    @egb
    public static enum DestFactor {
        CONSTANT_ALPHA(32771),
        CONSTANT_COLOR(32769),
        DST_ALPHA(772),
        DST_COLOR(774),
        ONE(1),
        ONE_MINUS_CONSTANT_ALPHA(32772),
        ONE_MINUS_CONSTANT_COLOR(32770),
        ONE_MINUS_DST_ALPHA(773),
        ONE_MINUS_DST_COLOR(775),
        ONE_MINUS_SRC_ALPHA(771),
        ONE_MINUS_SRC_COLOR(769),
        SRC_ALPHA(770),
        SRC_COLOR(768),
        ZERO(0);

        public final int value;

        private DestFactor(int $$0) {
            this.value = $$0;
        }
    }

    @egb
    public static enum SourceFactor {
        CONSTANT_ALPHA(32771),
        CONSTANT_COLOR(32769),
        DST_ALPHA(772),
        DST_COLOR(774),
        ONE(1),
        ONE_MINUS_CONSTANT_ALPHA(32772),
        ONE_MINUS_CONSTANT_COLOR(32770),
        ONE_MINUS_DST_ALPHA(773),
        ONE_MINUS_DST_COLOR(775),
        ONE_MINUS_SRC_ALPHA(771),
        ONE_MINUS_SRC_COLOR(769),
        SRC_ALPHA(770),
        SRC_ALPHA_SATURATE(776),
        SRC_COLOR(768),
        ZERO(0);

        public final int value;

        private SourceFactor(int $$0) {
            this.value = $$0;
        }
    }

    public static final class g
    extends Enum<g> {
        public static final /* enum */ g a = new g(5377);
        public static final /* enum */ g b = new g(5380);
        public static final /* enum */ g c = new g(5378);
        public static final /* enum */ g d = new g(5376);
        public static final /* enum */ g e = new g(5379);
        public static final /* enum */ g f = new g(5388);
        public static final /* enum */ g g = new g(5385);
        public static final /* enum */ g h = new g(5386);
        public static final /* enum */ g i = new g(5390);
        public static final /* enum */ g j = new g(5381);
        public static final /* enum */ g k = new g(5384);
        public static final /* enum */ g l = new g(5383);
        public static final /* enum */ g m = new g(5389);
        public static final /* enum */ g n = new g(5387);
        public static final /* enum */ g o = new g(5391);
        public static final /* enum */ g p = new g(5382);
        public final int q;
        private static final /* synthetic */ g[] r;

        public static g[] values() {
            return (g[])r.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private g(int $$0) {
            this.q = $$0;
        }

        private static /* synthetic */ g[] a() {
            return new g[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
        }

        static {
            r = com.mojang.blaze3d.platform.GlStateManager$g.a();
        }
    }
}

