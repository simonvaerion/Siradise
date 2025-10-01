/*
 * Decompiled with CFR 0.152.
 */
public class fhy
extends fim {
    protected final fih a;
    private float b;
    private float F;
    private float G;
    private boolean H;

    protected fhy(few $$0, double $$1, double $$2, double $$3, fih $$4, float $$5) {
        super($$0, $$1, $$2, $$3);
        this.B = 0.91f;
        this.u = $$5;
        this.a = $$4;
    }

    public void b(int $$0) {
        float $$1 = (float)(($$0 & 0xFF0000) >> 16) / 255.0f;
        float $$2 = (float)(($$0 & 0xFF00) >> 8) / 255.0f;
        float $$3 = (float)(($$0 & 0xFF) >> 0) / 255.0f;
        float $$4 = 1.0f;
        this.a($$1 * 1.0f, $$2 * 1.0f, $$3 * 1.0f);
    }

    public void c(int $$0) {
        this.b = (float)(($$0 & 0xFF0000) >> 16) / 255.0f;
        this.F = (float)(($$0 & 0xFF00) >> 8) / 255.0f;
        this.G = (float)(($$0 & 0xFF) >> 0) / 255.0f;
        this.H = true;
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.a);
        if (this.s > this.t / 2) {
            this.e(1.0f - ((float)this.s - (float)(this.t / 2)) / (float)this.t);
            if (this.H) {
                this.v += (this.b - this.v) * 0.2f;
                this.w += (this.F - this.w) * 0.2f;
                this.x += (this.G - this.x) * 0.2f;
            }
        }
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
    }
}

