/*
 * Decompiled with CFR 0.152.
 */
public class fya
implements fxi {
    public static final float a = 0.01f;
    public static final float b = 0.001f;
    public static final float c = 1.0E-4f;
    private static final int d = 0;
    private final fiy e;
    private final fzc f;
    private int g = 0;

    public fya(fiy $$0, fzc $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public void a() {
        --this.g;
        if (this.g <= 0 && this.e.aZ()) {
            float $$0 = this.e.dI().z.i();
            if ($$0 < 1.0E-4f) {
                this.g = 0;
                this.f.a((fxy)new fyb.a(this.e, amh.C));
            } else if ($$0 < 0.001f) {
                this.g = 0;
                this.f.a((fxy)new fyb.a(this.e, amh.B));
            } else if ($$0 < 0.01f) {
                this.g = 0;
                this.f.a((fxy)new fyb.a(this.e, amh.A));
            }
        }
    }
}

