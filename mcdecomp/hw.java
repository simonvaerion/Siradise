/*
 * Decompiled with CFR 0.152.
 */
public class hw {
    protected final float a;
    protected final float b;
    protected final float c;

    public hw(float $$0, float $$1, float $$2) {
        this.a = Float.isInfinite($$0) || Float.isNaN($$0) ? 0.0f : $$0 % 360.0f;
        this.b = Float.isInfinite($$1) || Float.isNaN($$1) ? 0.0f : $$1 % 360.0f;
        this.c = Float.isInfinite($$2) || Float.isNaN($$2) ? 0.0f : $$2 % 360.0f;
    }

    public hw(qx $$0) {
        this($$0.i(0), $$0.i(1), $$0.i(2));
    }

    public qx a() {
        qx $$0 = new qx();
        $$0.add(qu.a(this.a));
        $$0.add(qu.a(this.b));
        $$0.add(qu.a(this.c));
        return $$0;
    }

    public boolean equals(Object $$0) {
        if (!($$0 instanceof hw)) {
            return false;
        }
        hw $$1 = (hw)$$0;
        return this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public float e() {
        return apa.g(this.a);
    }

    public float f() {
        return apa.g(this.b);
    }

    public float g() {
        return apa.g(this.c);
    }
}

