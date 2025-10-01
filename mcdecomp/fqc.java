/*
 * Decompiled with CFR 0.152.
 */
public class fqc
extends fqe<bwb, fbv<bwb>> {
    private static final acq a = new acq("textures/entity/slime/magmacube.png");

    public fqc(foy.a $$0) {
        super($$0, new fbv($$0.a(fed.au)), 0.25f);
    }

    @Override
    protected int a(bwb $$0, gu $$1) {
        return 15;
    }

    @Override
    public acq a(bwb $$0) {
        return a;
    }

    @Override
    public void a(bwb $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        this.d = 0.25f * (float)$$0.ga();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected void a(bwb $$0, eij $$1, float $$2) {
        int $$3 = $$0.ga();
        float $$4 = apa.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5f + 1.0f);
        float $$5 = 1.0f / ($$4 + 1.0f);
        $$1.b($$5 * (float)$$3, 1.0f / $$5 * (float)$$3, $$5 * (float)$$3);
    }
}

