/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.Callbacks
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWImage
 *  org.lwjgl.glfw.GLFWImage$Buffer
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public final class ehn
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final GLFWErrorCallback b = GLFWErrorCallback.create(this::a);
    private final eho c;
    private final ehl d;
    private final long e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Optional<ehm> j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private double u;
    private String v = "";
    private boolean w;
    private int x;
    private boolean y;

    public ehn(eho $$0, ehl $$1, eha $$2, @Nullable String $$3, String $$4) {
        RenderSystem.assertInInitPhase();
        this.d = $$1;
        this.u();
        this.a("Pre startup");
        this.c = $$0;
        Optional<ehm> $$5 = ehm.a($$3);
        this.j = $$5.isPresent() ? $$5 : ($$2.c.isPresent() && $$2.d.isPresent() ? Optional.of(new ehm($$2.c.getAsInt(), $$2.d.getAsInt(), 8, 8, 8, 60)) : Optional.empty());
        this.l = this.k = $$2.e;
        ehi $$6 = $$1.a(GLFW.glfwGetPrimaryMonitor());
        this.o = $$2.a > 0 ? $$2.a : 1;
        this.h = this.o;
        this.p = $$2.b > 0 ? $$2.b : 1;
        this.i = this.p;
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint((int)139265, (int)196609);
        GLFW.glfwWindowHint((int)139275, (int)221185);
        GLFW.glfwWindowHint((int)139266, (int)3);
        GLFW.glfwWindowHint((int)139267, (int)2);
        GLFW.glfwWindowHint((int)139272, (int)204801);
        GLFW.glfwWindowHint((int)139270, (int)1);
        this.e = GLFW.glfwCreateWindow((int)this.o, (int)this.p, (CharSequence)$$4, (long)(this.k && $$6 != null ? $$6.f() : 0L), (long)0L);
        if ($$6 != null) {
            ehm $$7 = $$6.a(this.k ? this.j : Optional.empty());
            this.f = this.m = $$6.c() + $$7.a() / 2 - this.o / 2;
            this.g = this.n = $$6.d() + $$7.b() / 2 - this.p / 2;
        } else {
            int[] $$8 = new int[1];
            int[] $$9 = new int[1];
            GLFW.glfwGetWindowPos((long)this.e, (int[])$$8, (int[])$$9);
            this.f = this.m = $$8[0];
            this.g = this.n = $$9[0];
        }
        GLFW.glfwMakeContextCurrent((long)this.e);
        Locale $$10 = Locale.getDefault(Locale.Category.FORMAT);
        Locale.setDefault(Locale.Category.FORMAT, Locale.ROOT);
        GL.createCapabilities();
        Locale.setDefault(Locale.Category.FORMAT, $$10);
        this.w();
        this.v();
        GLFW.glfwSetFramebufferSizeCallback((long)this.e, this::b);
        GLFW.glfwSetWindowPosCallback((long)this.e, this::a);
        GLFW.glfwSetWindowSizeCallback((long)this.e, this::c);
        GLFW.glfwSetWindowFocusCallback((long)this.e, this::a);
        GLFW.glfwSetCursorEnterCallback((long)this.e, this::b);
    }

    public int a() {
        RenderSystem.assertOnRenderThread();
        return GLX._getRefreshRate(this);
    }

    public boolean b() {
        return GLX._shouldClose(this);
    }

    public static void a(BiConsumer<Integer, String> $$0) {
        RenderSystem.assertInInitPhase();
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            PointerBuffer $$2 = $$1.mallocPointer(1);
            int $$3 = GLFW.glfwGetError((PointerBuffer)$$2);
            if ($$3 != 0) {
                long $$4 = $$2.get();
                String $$5 = $$4 == 0L ? "" : MemoryUtil.memUTF8((long)$$4);
                $$0.accept($$3, $$5);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ajl $$0, ehd $$1) throws IOException {
        RenderSystem.assertInInitPhase();
        if (enn.a) {
            ehg.a($$1.b($$0));
            return;
        }
        List<akp<InputStream>> $$2 = $$1.a($$0);
        ArrayList<ByteBuffer> $$3 = new ArrayList<ByteBuffer>($$2.size());
        try (MemoryStack $$4 = MemoryStack.stackPush();){
            GLFWImage.Buffer $$5 = GLFWImage.malloc((int)$$2.size(), (MemoryStack)$$4);
            for (int $$6 = 0; $$6 < $$2.size(); ++$$6) {
                try (ehk $$7 = ehk.a($$2.get($$6).get());){
                    ByteBuffer $$8 = MemoryUtil.memAlloc((int)($$7.a() * $$7.b() * 4));
                    $$3.add($$8);
                    $$8.asIntBuffer().put($$7.d());
                    $$5.position($$6);
                    $$5.width($$7.a());
                    $$5.height($$7.b());
                    $$5.pixels($$8);
                    continue;
                }
            }
            GLFW.glfwSetWindowIcon((long)this.e, (GLFWImage.Buffer)((GLFWImage.Buffer)$$5.position(0)));
        }
        finally {
            $$3.forEach(MemoryUtil::memFree);
        }
    }

    public void a(String $$0) {
        this.v = $$0;
    }

    private void u() {
        RenderSystem.assertInInitPhase();
        GLFW.glfwSetErrorCallback(ehn::b);
    }

    private static void b(int $$0, long $$1) {
        RenderSystem.assertInInitPhase();
        String $$2 = "GLFW error " + $$0 + ": " + MemoryUtil.memUTF8((long)$$1);
        TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)($$2 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        throw new a($$2);
    }

    public void a(int $$0, long $$1) {
        RenderSystem.assertOnRenderThread();
        String $$2 = MemoryUtil.memUTF8((long)$$1);
        a.error("########## GL ERROR ##########");
        a.error("@ {}", (Object)this.v);
        a.error("{}: {}", (Object)$$0, (Object)$$2);
    }

    public void c() {
        GLFWErrorCallback $$0 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.b);
        if ($$0 != null) {
            $$0.free();
        }
    }

    public void a(boolean $$0) {
        RenderSystem.assertOnRenderThreadOrInit();
        this.y = $$0;
        GLFW.glfwSwapInterval((int)($$0 ? 1 : 0));
    }

    @Override
    public void close() {
        RenderSystem.assertOnRenderThread();
        Callbacks.glfwFreeCallbacks((long)this.e);
        this.b.close();
        GLFW.glfwDestroyWindow((long)this.e);
        GLFW.glfwTerminate();
    }

    private void a(long $$0, int $$1, int $$2) {
        this.m = $$1;
        this.n = $$2;
    }

    private void b(long $$0, int $$1, int $$2) {
        if ($$0 != this.e) {
            return;
        }
        int $$3 = this.k();
        int $$4 = this.l();
        if ($$1 == 0 || $$2 == 0) {
            return;
        }
        this.q = $$1;
        this.r = $$2;
        if (this.k() != $$3 || this.l() != $$4) {
            this.c.a();
        }
    }

    private void v() {
        RenderSystem.assertInInitPhase();
        int[] $$0 = new int[1];
        int[] $$1 = new int[1];
        GLFW.glfwGetFramebufferSize((long)this.e, (int[])$$0, (int[])$$1);
        this.q = $$0[0] > 0 ? $$0[0] : 1;
        this.r = $$1[0] > 0 ? $$1[0] : 1;
    }

    private void c(long $$0, int $$1, int $$2) {
        this.o = $$1;
        this.p = $$2;
    }

    private void a(long $$0, boolean $$1) {
        if ($$0 == this.e) {
            this.c.a($$1);
        }
    }

    private void b(long $$0, boolean $$1) {
        if ($$1) {
            this.c.b();
        }
    }

    public void a(int $$0) {
        this.x = $$0;
    }

    public int d() {
        return this.x;
    }

    public void e() {
        RenderSystem.flipFrame(this.e);
        if (this.k != this.l) {
            this.l = this.k;
            this.c(this.y);
        }
    }

    public Optional<ehm> f() {
        return this.j;
    }

    public void a(Optional<ehm> $$0) {
        boolean $$1 = !$$0.equals(this.j);
        this.j = $$0;
        if ($$1) {
            this.w = true;
        }
    }

    public void g() {
        if (this.k && this.w) {
            this.w = false;
            this.w();
            this.c.a();
        }
    }

    private void w() {
        boolean $$0;
        RenderSystem.assertInInitPhase();
        boolean bl2 = $$0 = GLFW.glfwGetWindowMonitor((long)this.e) != 0L;
        if (this.k) {
            ehi $$1 = this.d.a(this);
            if ($$1 == null) {
                a.warn("Failed to find suitable monitor for fullscreen mode");
                this.k = false;
            } else {
                if (enn.a) {
                    ehg.a(this.e);
                }
                ehm $$2 = $$1.a(this.j);
                if (!$$0) {
                    this.f = this.m;
                    this.g = this.n;
                    this.h = this.o;
                    this.i = this.p;
                }
                this.m = 0;
                this.n = 0;
                this.o = $$2.a();
                this.p = $$2.b();
                GLFW.glfwSetWindowMonitor((long)this.e, (long)$$1.f(), (int)this.m, (int)this.n, (int)this.o, (int)this.p, (int)$$2.f());
            }
        } else {
            this.m = this.f;
            this.n = this.g;
            this.o = this.h;
            this.p = this.i;
            GLFW.glfwSetWindowMonitor((long)this.e, (long)0L, (int)this.m, (int)this.n, (int)this.o, (int)this.p, (int)-1);
        }
    }

    public void h() {
        this.k = !this.k;
    }

    public void a(int $$0, int $$1) {
        this.h = $$0;
        this.i = $$1;
        this.k = false;
        this.w();
    }

    private void c(boolean $$0) {
        RenderSystem.assertOnRenderThread();
        try {
            this.w();
            this.c.a();
            this.a($$0);
            this.e();
        }
        catch (Exception $$1) {
            a.error("Couldn't toggle fullscreen", (Throwable)$$1);
        }
    }

    public int a(int $$0, boolean $$1) {
        int $$2;
        for ($$2 = 1; $$2 != $$0 && $$2 < this.q && $$2 < this.r && this.q / ($$2 + 1) >= 320 && this.r / ($$2 + 1) >= 240; ++$$2) {
        }
        if ($$1 && $$2 % 2 != 0) {
            ++$$2;
        }
        return $$2;
    }

    public void a(double $$0) {
        this.u = $$0;
        int $$1 = (int)((double)this.q / $$0);
        this.s = (double)this.q / $$0 > (double)$$1 ? $$1 + 1 : $$1;
        int $$2 = (int)((double)this.r / $$0);
        this.t = (double)this.r / $$0 > (double)$$2 ? $$2 + 1 : $$2;
    }

    public void b(String $$0) {
        GLFW.glfwSetWindowTitle((long)this.e, (CharSequence)$$0);
    }

    public long i() {
        return this.e;
    }

    public boolean j() {
        return this.k;
    }

    public int k() {
        return this.q;
    }

    public int l() {
        return this.r;
    }

    public void b(int $$0) {
        this.q = $$0;
    }

    public void c(int $$0) {
        this.r = $$0;
    }

    public int m() {
        return this.o;
    }

    public int n() {
        return this.p;
    }

    public int o() {
        return this.s;
    }

    public int p() {
        return this.t;
    }

    public int q() {
        return this.m;
    }

    public int r() {
        return this.n;
    }

    public double s() {
        return this.u;
    }

    @Nullable
    public ehi t() {
        return this.d.a(this);
    }

    public void b(boolean $$0) {
        ehe.a(this.e, $$0);
    }

    public static class a
    extends ezz {
        a(String $$0) {
            super($$0);
        }
    }
}

