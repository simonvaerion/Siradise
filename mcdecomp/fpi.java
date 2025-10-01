/*
 * Decompiled with CFR 0.152.
 */
public class fpi
extends fqe<bvw, fbj<bvw>> {
    private static final acq a = new acq("textures/entity/ghast/ghast.png");
    private static final acq i = new acq("textures/entity/ghast/ghast_shooting.png");

    public fpi(foy.a $$0) {
        super($$0, new fbj($$0.a(fed.aa)), 1.5f);
    }

    @Override
    public acq a(bvw $$0) {
        if ($$0.q()) {
            return i;
        }
        return a;
    }

    @Override
    protected void a(bvw $$0, eij $$1, float $$2) {
        float $$3 = 1.0f;
        float $$4 = 4.5f;
        float $$5 = 4.5f;
        $$1.b(4.5f, 4.5f, 4.5f);
    }
}

