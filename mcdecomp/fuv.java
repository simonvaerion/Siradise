/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fuv {
    private final acq a;
    private final fup b;
    final int c;
    final int d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    protected fuv(acq $$0, fup $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$4;
        this.d = $$5;
        this.e = (float)$$4 / (float)$$2;
        this.f = (float)($$4 + $$1.a()) / (float)$$2;
        this.g = (float)$$5 / (float)$$3;
        this.h = (float)($$5 + $$1.b()) / (float)$$3;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.f;
    }

    public fup e() {
        return this.b;
    }

    @Nullable
    public a f() {
        final fur $$0 = this.b.e();
        if ($$0 != null) {
            return new a(){

                @Override
                public void a() {
                    $$0.a(fuv.this.c, fuv.this.d);
                }

                @Override
                public void close() {
                    $$0.close();
                }
            };
        }
        return null;
    }

    public float a(double $$0) {
        float $$1 = this.f - this.e;
        return this.e + $$1 * (float)$$0 / 16.0f;
    }

    public float a(float $$0) {
        float $$1 = this.f - this.e;
        return ($$0 - this.e) / $$1 * 16.0f;
    }

    public float g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }

    public float b(double $$0) {
        float $$1 = this.h - this.g;
        return this.g + $$1 * (float)$$0 / 16.0f;
    }

    public float b(float $$0) {
        float $$1 = this.h - this.g;
        return ($$0 - this.g) / $$1 * 16.0f;
    }

    public acq i() {
        return this.a;
    }

    public String toString() {
        return "TextureAtlasSprite{contents='" + this.b + "', u0=" + this.e + ", u1=" + this.f + ", v0=" + this.g + ", v1=" + this.h + "}";
    }

    public void j() {
        this.b.a(this.c, this.d);
    }

    private float l() {
        float $$0 = (float)this.b.a() / (this.f - this.e);
        float $$1 = (float)this.b.b() / (this.h - this.g);
        return Math.max($$1, $$0);
    }

    public float k() {
        return 4.0f / this.l();
    }

    public ein a(ein $$0) {
        return new fkk($$0, this);
    }

    public static interface a
    extends AutoCloseable {
        public void a();

        @Override
        public void close();
    }
}

