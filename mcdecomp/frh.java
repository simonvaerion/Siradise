/*
 * Decompiled with CFR 0.152.
 */
public class frh
extends fqe<bwp, fdi<bwp>> {
    private static final acq a = new acq("textures/entity/strider/strider.png");
    private static final acq i = new acq("textures/entity/strider/strider_cold.png");

    public frh(foy.a $$0) {
        super($$0, new fdi($$0.a(fed.bx)), 0.5f);
        this.a(new fth(this, new fdi($$0.a(fed.by)), new acq("textures/entity/strider/strider_saddle.png")));
    }

    @Override
    public acq a(bwp $$0) {
        return $$0.q() ? i : a;
    }

    @Override
    protected void a(bwp $$0, eij $$1, float $$2) {
        if ($$0.h_()) {
            $$1.b(0.5f, 0.5f, 0.5f);
            this.d = 0.25f;
        } else {
            this.d = 0.5f;
        }
    }

    @Override
    protected boolean b(bwp $$0) {
        return super.a($$0) || $$0.q();
    }

    @Override
    protected /* synthetic */ boolean a(bfz bfz2) {
        return this.b((bwp)bfz2);
    }
}

