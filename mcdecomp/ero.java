/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class ero
extends fug
implements fuh {
    private static final int e = 256;
    private final erp f;
    private final boolean g;
    private final a h;

    public ero(erp $$0, boolean $$1) {
        this.g = $$1;
        this.h = new a(0, 0, 256, 256);
        TextureUtil.prepareImage($$1 ? ehk.b.a : ehk.b.d, this.a(), 256, 256);
        this.f = $$0;
    }

    @Override
    public void a(akx $$0) {
    }

    @Override
    public void close() {
        this.b();
    }

    @Nullable
    public err a(egn $$0) {
        if ($$0.c() != this.g) {
            return null;
        }
        a $$1 = this.h.a($$0);
        if ($$1 != null) {
            this.c();
            $$0.a($$1.a, $$1.b);
            float $$2 = 256.0f;
            float $$3 = 256.0f;
            float $$4 = 0.01f;
            return new err(this.f, ((float)$$1.a + 0.01f) / 256.0f, ((float)$$1.a - 0.01f + (float)$$0.a()) / 256.0f, ((float)$$1.b + 0.01f) / 256.0f, ((float)$$1.b - 0.01f + (float)$$0.b()) / 256.0f, $$0.e(), $$0.f(), $$0.g(), $$0.h());
        }
        return null;
    }

    @Override
    public void a(acq $$02, Path $$1) {
        String $$2 = $$02.c();
        TextureUtil.writeAsPNG($$1, $$2, this.a(), 0, 256, 256, $$0 -> ($$0 & 0xFF000000) == 0 ? -16777216 : $$0);
    }

    static class a {
        final int a;
        final int b;
        private final int c;
        private final int d;
        @Nullable
        private a e;
        @Nullable
        private a f;
        private boolean g;

        a(int $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Nullable
        a a(egn $$0) {
            if (this.e != null && this.f != null) {
                a $$1 = this.e.a($$0);
                if ($$1 == null) {
                    $$1 = this.f.a($$0);
                }
                return $$1;
            }
            if (this.g) {
                return null;
            }
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            if ($$2 > this.c || $$3 > this.d) {
                return null;
            }
            if ($$2 == this.c && $$3 == this.d) {
                this.g = true;
                return this;
            }
            int $$4 = this.c - $$2;
            int $$5 = this.d - $$3;
            if ($$4 > $$5) {
                this.e = new a(this.a, this.b, $$2, this.d);
                this.f = new a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
            } else {
                this.e = new a(this.a, this.b, this.c, $$3);
                this.f = new a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
            }
            return this.e.a($$0);
        }
    }
}

