/*
 * Decompiled with CFR 0.152.
 */
public class fjz {
    private final enn a;
    private final fjl b;
    private float c;
    private float d;

    public fjz(fjl $$0) {
        this.b = $$0;
        this.a = enn.N();
    }

    public void a(float $$0, float $$1) {
        float $$2 = (float)((double)$$0 * this.a.m.p().c());
        this.c = fjz.b(this.c + $$2 * 0.1f, 360.0f);
        this.d = fjz.b(this.d + $$2 * 0.001f, (float)Math.PI * 2);
        this.b.a(this.a, 10.0f, -this.c, $$1);
    }

    private static float b(float $$0, float $$1) {
        return $$0 > $$1 ? $$0 - $$1 : $$0;
    }
}

