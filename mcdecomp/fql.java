/*
 * Decompiled with CFR 0.152.
 */
public class fql
extends fqe<bwe, fcg<bwe>> {
    private static final acq a = new acq("textures/entity/phantom.png");

    public fql(foy.a $$0) {
        super($$0, new fcg($$0.a(fed.aB)), 0.75f);
        this.a(new fte<bwe>(this));
    }

    @Override
    public acq a(bwe $$0) {
        return a;
    }

    @Override
    protected void a(bwe $$0, eij $$1, float $$2) {
        int $$3 = $$0.q();
        float $$4 = 1.0f + 0.15f * (float)$$3;
        $$1.b($$4, $$4, $$4);
        $$1.a(0.0f, 1.3125f, 0.1875f);
    }

    @Override
    protected void a(bwe $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a(a.b.rotationDegrees($$0.dA()));
    }
}

