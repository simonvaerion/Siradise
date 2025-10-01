/*
 * Decompiled with CFR 0.152.
 */
public class frs
extends fqe<byb, fdq<byb>> {
    private static final acq a = new acq("textures/entity/villager/villager.png");

    public frs(foy.a $$0) {
        super($$0, new fdq($$0.a(fed.bJ)), 0.5f);
        this.a(new fsl<byb, fdq<byb>>(this, $$0.f(), $$0.d()));
        this.a(new ftr<byb, fdq<byb>>(this, $$0.e(), "villager"));
        this.a(new fsk<byb, fdq<byb>>(this, $$0.d()));
    }

    @Override
    public acq a(byb $$0) {
        return a;
    }

    @Override
    protected void a(byb $$0, eij $$1, float $$2) {
        float $$3 = 0.9375f;
        if ($$0.h_()) {
            $$3 *= 0.5f;
            this.d = 0.25f;
        } else {
            this.d = 0.5f;
        }
        $$1.b($$3, $$3, $$3);
    }
}

