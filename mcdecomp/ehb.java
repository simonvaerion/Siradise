/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.lwjgl.opengl.ARBDebugOutput
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.GLDebugMessageARBCallback
 *  org.lwjgl.opengl.GLDebugMessageARBCallbackI
 *  org.lwjgl.opengl.GLDebugMessageCallback
 *  org.lwjgl.opengl.GLDebugMessageCallbackI
 *  org.lwjgl.opengl.KHRDebug
 *  org.slf4j.Logger
 */
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public class ehb {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 10;
    private static final Queue<a> c = EvictingQueue.create((int)10);
    @Nullable
    private static volatile a d;
    private static final List<Integer> e;
    private static final List<Integer> f;
    private static boolean g;

    private static String d(int $$0) {
        return "Unknown (0x" + Integer.toHexString($$0).toUpperCase() + ")";
    }

    public static String a(int $$0) {
        switch ($$0) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WINDOW SYSTEM";
            }
            case 33352: {
                return "SHADER COMPILER";
            }
            case 33353: {
                return "THIRD PARTY";
            }
            case 33354: {
                return "APPLICATION";
            }
            case 33355: {
                return "OTHER";
            }
        }
        return ehb.d($$0);
    }

    public static String b(int $$0) {
        switch ($$0) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED BEHAVIOR";
            }
            case 33358: {
                return "UNDEFINED BEHAVIOR";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
            case 33384: {
                return "MARKER";
            }
        }
        return ehb.d($$0);
    }

    public static String c(int $$0) {
        switch ($$0) {
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
            case 33387: {
                return "NOTIFICATION";
            }
        }
        return ehb.d($$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static void a(int $$0, int $$1, int $$2, int $$3, int $$4, long $$5, long $$6) {
        void $$9;
        String $$7 = GLDebugMessageCallback.getMessage((int)$$4, (long)$$5);
        Queue<a> queue = c;
        synchronized (queue) {
            a $$8 = d;
            if ($$8 == null || !$$8.a($$0, $$1, $$2, $$3, $$7)) {
                $$8 = new a($$0, $$1, $$2, $$3, $$7);
                c.add($$8);
                d = $$8;
            } else {
                ++$$8.f;
            }
        }
        a.info("OpenGL debug message: {}", (Object)$$9);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List<String> a() {
        Queue<a> queue = c;
        synchronized (queue) {
            ArrayList $$0 = Lists.newArrayListWithCapacity((int)c.size());
            for (a $$1 : c) {
                $$0.add($$1 + " x " + $$1.f);
            }
            return $$0;
        }
    }

    public static boolean b() {
        return g;
    }

    public static void a(int $$0, boolean $$1) {
        RenderSystem.assertInInitPhase();
        if ($$0 <= 0) {
            return;
        }
        GLCapabilities $$2 = GL.getCapabilities();
        if ($$2.GL_KHR_debug) {
            g = true;
            GL11.glEnable((int)37600);
            if ($$1) {
                GL11.glEnable((int)33346);
            }
            for (int $$3 = 0; $$3 < e.size(); ++$$3) {
                boolean $$4 = $$3 < $$0;
                KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)e.get($$3), (int[])null, (boolean)$$4);
            }
            KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)((GLDebugMessageCallbackI)GLX.make(GLDebugMessageCallback.create(ehb::a), egz::a)), (long)0L);
        } else if ($$2.GL_ARB_debug_output) {
            g = true;
            if ($$1) {
                GL11.glEnable((int)33346);
            }
            for (int $$5 = 0; $$5 < f.size(); ++$$5) {
                boolean $$6 = $$5 < $$0;
                ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)f.get($$5), (int[])null, (boolean)$$6);
            }
            ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)((GLDebugMessageARBCallbackI)GLX.make(GLDebugMessageARBCallback.create(ehb::a), egz::a)), (long)0L);
        }
    }

    static {
        e = ImmutableList.of((Object)37190, (Object)37191, (Object)37192, (Object)33387);
        f = ImmutableList.of((Object)37190, (Object)37191, (Object)37192);
    }

    static class a {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final String e;
        int f = 1;

        a(int $$0, int $$1, int $$2, int $$3, String $$4) {
            this.a = $$2;
            this.b = $$0;
            this.c = $$1;
            this.d = $$3;
            this.e = $$4;
        }

        boolean a(int $$0, int $$1, int $$2, int $$3, String $$4) {
            return $$1 == this.c && $$0 == this.b && $$2 == this.a && $$3 == this.d && $$4.equals(this.e);
        }

        public String toString() {
            return "id=" + this.a + ", source=" + ehb.a(this.b) + ", type=" + ehb.b(this.c) + ", severity=" + ehb.c(this.d) + ", message='" + this.e + "'";
        }
    }
}

