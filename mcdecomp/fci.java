/*
 * Decompiled with CFR 0.152.
 */
public class fci
extends fdc {
    private final fee a;
    private final fee b;
    private final fee c;

    public fci(fee $$0) {
        this.a = $$0.b("head");
        this.b = this.a.b("left_ear");
        this.c = this.a.b("right_ear");
    }

    public static fem a() {
        fem $$0 = new fem();
        fcj.a(fei.a, $$0);
        return $$0;
    }

    @Override
    public void a(float $$0, float $$1, float $$2) {
        this.a.f = $$1 * ((float)Math.PI / 180);
        this.a.e = $$2 * ((float)Math.PI / 180);
        float $$3 = 1.2f;
        this.b.g = (float)(-(Math.cos($$0 * (float)Math.PI * 0.2f * 1.2f) + 2.5)) * 0.2f;
        this.c.g = (float)(Math.cos($$0 * (float)Math.PI * 0.2f) + 2.5) * 0.2f;
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }
}

