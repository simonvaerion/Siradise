/*
 * Decompiled with CFR 0.152.
 */
public class fra
extends fqe<bwl, fdd<bwl>> {
    private static final acq a = new acq("textures/entity/slime/slime.png");

    public fra(foy.a $$0) {
        super($$0, new fdd($$0.a(fed.bm)), 0.25f);
        this.a(new ftk<bwl>(this, $$0.f()));
    }

    @Override
    public void a(bwl $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        this.d = 0.25f * (float)$$0.ga();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected void a(bwl $$0, eij $$1, float $$2) {
        float $$3 = 0.999f;
        $$1.b(0.999f, 0.999f, 0.999f);
        $$1.a(0.0f, 0.001f, 0.0f);
        float $$4 = $$0.ga();
        float $$5 = apa.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5f + 1.0f);
        float $$6 = 1.0f / ($$5 + 1.0f);
        $$1.b($$6 * $$4, 1.0f / $$6 * $$4, $$6 * $$4);
    }

    @Override
    public acq a(bwl $$0) {
        return a;
    }
}

