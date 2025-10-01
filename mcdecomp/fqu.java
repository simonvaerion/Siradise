/*
 * Decompiled with CFR 0.152.
 */
public class fqu
extends fqe<bsg, fct<bsg>> {
    private static final acq a = new acq("textures/entity/fish/salmon.png");

    public fqu(foy.a $$0) {
        super($$0, new fct($$0.a(fed.ba)), 0.4f);
    }

    @Override
    public acq a(bsg $$0) {
        return a;
    }

    @Override
    protected void a(bsg $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        float $$5 = 1.0f;
        float $$6 = 1.0f;
        if (!$$0.aV()) {
            $$5 = 1.3f;
            $$6 = 1.7f;
        }
        float $$7 = $$5 * 4.3f * apa.a($$6 * 0.6f * $$2);
        $$1.a(a.d.rotationDegrees($$7));
        $$1.a(0.0f, 0.0f, -0.4f);
        if (!$$0.aV()) {
            $$1.a(0.2f, 0.1f, 0.0f);
            $$1.a(a.f.rotationDegrees(90.0f));
        }
    }
}

