/*
 * Decompiled with CFR 0.152.
 */
public class fpt
extends fqe<brx, fbu<brx>> {
    private static final acq a = new acq("textures/entity/iron_golem/iron_golem.png");

    public fpt(foy.a $$0) {
        super($$0, new fbu($$0.a(fed.ap)), 0.7f);
        this.a(new fsx(this));
        this.a(new fsy(this, $$0.c()));
    }

    @Override
    public acq a(brx $$0) {
        return a;
    }

    @Override
    protected void a(brx $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ((double)$$0.aR.a() < 0.01) {
            return;
        }
        float $$5 = 13.0f;
        float $$6 = $$0.aR.c($$4) + 6.0f;
        float $$7 = (Math.abs($$6 % 13.0f - 6.5f) - 3.25f) / 3.25f;
        $$1.a(a.f.rotationDegrees(6.5f * $$7));
    }
}

