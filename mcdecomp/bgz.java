/*
 * Decompiled with CFR 0.152.
 */
public class bgz {
    private float a;
    private float b;
    private float c;

    public void a(float $$0) {
        this.b = $$0;
    }

    public void a(float $$0, float $$1) {
        this.a = this.b;
        this.b += ($$0 - this.b) * $$1;
        this.c += this.b;
    }

    public float a() {
        return this.b;
    }

    public float b(float $$0) {
        return apa.i($$0, this.a, this.b);
    }

    public float b() {
        return this.c;
    }

    public float c(float $$0) {
        return this.c - this.b * (1.0f - $$0);
    }

    public boolean c() {
        return this.b > 1.0E-5f;
    }
}

