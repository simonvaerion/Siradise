/*
 * Decompiled with CFR 0.152.
 */
public class frv
extends fqe<bxs, fdr<bxs>> {
    private static final acq a = new acq("textures/entity/warden/warden.png");
    private static final acq i = new acq("textures/entity/warden/warden_bioluminescent_layer.png");
    private static final acq j = new acq("textures/entity/warden/warden_heart.png");
    private static final acq k = new acq("textures/entity/warden/warden_pulsating_spots_1.png");
    private static final acq l = new acq("textures/entity/warden/warden_pulsating_spots_2.png");

    public frv(foy.a $$02) {
        super($$02, new fdr($$02.a(fed.bL)), 0.9f);
        this.a(new fts<bxs, fdr>(this, i, ($$0, $$1, $$2) -> 1.0f, fdr::e));
        this.a(new fts<bxs, fdr>(this, k, ($$0, $$1, $$2) -> Math.max(0.0f, apa.b($$2 * 0.045f) * 0.25f), fdr::f));
        this.a(new fts<bxs, fdr>(this, l, ($$0, $$1, $$2) -> Math.max(0.0f, apa.b($$2 * 0.045f + (float)Math.PI) * 0.25f), fdr::f));
        this.a(new fts<bxs, fdr>(this, a, ($$0, $$1, $$2) -> $$0.D($$1), fdr::c));
        this.a(new fts<bxs, fdr>(this, j, ($$0, $$1, $$2) -> $$0.E($$1), fdr::d));
    }

    @Override
    public acq a(bxs $$0) {
        return a;
    }
}

