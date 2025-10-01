/*
 * Decompiled with CFR 0.152.
 */
public class eoa {
    public float a;
    public float b;
    private long c;
    private final float d;

    public eoa(float $$0, long $$1) {
        this.d = 1000.0f / $$0;
        this.c = $$1;
    }

    public int a(long $$0) {
        this.b = (float)($$0 - this.c) / this.d;
        this.c = $$0;
        this.a += this.b;
        int $$1 = (int)this.a;
        this.a -= (float)$$1;
        return $$1;
    }
}

