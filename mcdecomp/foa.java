/*
 * Decompiled with CFR 0.152.
 */
public class foa
extends fqe<brg, fak> {
    private static final acq a = new acq("textures/entity/bat.png");

    public foa(foy.a $$0) {
        super($$0, new fak($$0.a(fed.g)), 0.25f);
    }

    @Override
    public acq a(brg $$0) {
        return a;
    }

    @Override
    protected void a(brg $$0, eij $$1, float $$2) {
        $$1.b(0.35f, 0.35f, 0.35f);
    }

    @Override
    protected void a(brg $$0, eij $$1, float $$2, float $$3, float $$4) {
        if ($$0.r()) {
            $$1.a(0.0f, -0.1f, 0.0f);
        } else {
            $$1.a(0.0f, apa.b($$2 * 0.3f) * 0.1f, 0.0f);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }
}

