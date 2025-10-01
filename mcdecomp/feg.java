/*
 * Decompiled with CFR 0.152.
 */
public class feg {
    public static final feg a = feg.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    private feg(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    public static feg a(float $$0, float $$1, float $$2) {
        return feg.a($$0, $$1, $$2, 0.0f, 0.0f, 0.0f);
    }

    public static feg b(float $$0, float $$1, float $$2) {
        return feg.a(0.0f, 0.0f, 0.0f, $$0, $$1, $$2);
    }

    public static feg a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        return new feg($$0, $$1, $$2, $$3, $$4, $$5);
    }
}

