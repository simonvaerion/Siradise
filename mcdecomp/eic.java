/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.lwjgl.opengl.ARBTimerQuery
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL32C
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBTimerQuery;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL32C;

public class eic {
    private int a;

    public static Optional<eic> a() {
        return b.a;
    }

    public void b() {
        RenderSystem.assertOnRenderThread();
        if (this.a != 0) {
            throw new IllegalStateException("Current profile not ended");
        }
        this.a = GL32C.glGenQueries();
        GL32C.glBeginQuery((int)35007, (int)this.a);
    }

    public a c() {
        RenderSystem.assertOnRenderThread();
        if (this.a == 0) {
            throw new IllegalStateException("endProfile called before beginProfile");
        }
        GL32C.glEndQuery((int)35007);
        a $$0 = new a(this.a);
        this.a = 0;
        return $$0;
    }

    static class b {
        static final Optional<eic> a = Optional.ofNullable(b.a());

        private b() {
        }

        @Nullable
        private static eic a() {
            if (!GL.getCapabilities().GL_ARB_timer_query) {
                return null;
            }
            return new eic();
        }
    }

    public static class a {
        private static final long a = 0L;
        private static final long b = -1L;
        private final int c;
        private long d;

        a(int $$0) {
            this.c = $$0;
        }

        public void a() {
            RenderSystem.assertOnRenderThread();
            if (this.d != 0L) {
                return;
            }
            this.d = -1L;
            GL32C.glDeleteQueries((int)this.c);
        }

        public boolean b() {
            RenderSystem.assertOnRenderThread();
            if (this.d != 0L) {
                return true;
            }
            if (1 == GL32C.glGetQueryObjecti((int)this.c, (int)34919)) {
                this.d = ARBTimerQuery.glGetQueryObjecti64((int)this.c, (int)34918);
                GL32C.glDeleteQueries((int)this.c);
                return true;
            }
            return false;
        }

        public long c() {
            RenderSystem.assertOnRenderThread();
            if (this.d == 0L) {
                this.d = ARBTimerQuery.glGetQueryObjecti64((int)this.c, (int)34918);
                GL32C.glDeleteQueries((int)this.c);
            }
            return this.d;
        }
    }
}

