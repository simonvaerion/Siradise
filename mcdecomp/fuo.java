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
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuo
extends fug {
    static final Logger f = LogUtils.getLogger();
    protected final acq e;

    public fuo(acq $$0) {
        this.e = $$0;
    }

    @Override
    public void a(akx $$0) throws IOException {
        boolean $$6;
        boolean $$5;
        a $$1 = this.b($$0);
        $$1.c();
        fwn $$2 = $$1.a();
        if ($$2 != null) {
            boolean $$3 = $$2.a();
            boolean $$4 = $$2.b();
        } else {
            $$5 = false;
            $$6 = false;
        }
        ehk $$7 = $$1.b();
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> this.a($$7, $$5, $$6));
        } else {
            this.a($$7, $$5, $$6);
        }
    }

    private void a(ehk $$0, boolean $$1, boolean $$2) {
        TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
        $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
    }

    protected a b(akx $$0) {
        return fuo$a.a($$0, this.e);
    }

    protected static class a
    implements Closeable {
        @Nullable
        private final fwn a;
        @Nullable
        private final ehk b;
        @Nullable
        private final IOException c;

        public a(IOException $$0) {
            this.c = $$0;
            this.a = null;
            this.b = null;
        }

        public a(@Nullable fwn $$0, ehk $$1) {
            this.c = null;
            this.a = $$0;
            this.b = $$1;
        }

        /*
         * WARNING - void declaration
         */
        public static a a(akx $$0, acq $$1) {
            try {
                void $$5;
                akv $$2 = $$0.getResourceOrThrow($$1);
                try (InputStream $$3 = $$2.d();){
                    ehk $$4 = ehk.a($$3);
                }
                fwn $$6 = null;
                try {
                    $$6 = $$2.f().a(fwn.a).orElse(null);
                }
                catch (RuntimeException $$7) {
                    f.warn("Failed reading metadata of: {}", (Object)$$1, (Object)$$7);
                }
                return new a($$6, (ehk)$$5);
            }
            catch (IOException $$8) {
                return new a($$8);
            }
        }

        @Nullable
        public fwn a() {
            return this.a;
        }

        public ehk b() throws IOException {
            if (this.c != null) {
                throw this.c;
            }
            return this.b;
        }

        @Override
        public void close() {
            if (this.b != null) {
                this.b.close();
            }
        }

        public void c() throws IOException {
            if (this.c != null) {
                throw this.c;
            }
        }
    }
}

