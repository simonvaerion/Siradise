/*
 * Decompiled with CFR 0.152.
 */
public class fol
extends fqe<bvo, faz<bvo>> {
    private static final acq a = new acq("textures/entity/creeper/creeper.png");

    public fol(foy.a $$0) {
        super($$0, new faz($$0.a(fed.B)), 0.5f);
        this.a(new fsj(this, $$0.f()));
    }

    @Override
    protected void a(bvo $$0, eij $$1, float $$2) {
        float $$3 = $$0.D($$2);
        float $$4 = 1.0f + apa.a($$3 * 100.0f) * $$3 * 0.01f;
        $$3 = apa.a($$3, 0.0f, 1.0f);
        $$3 *= $$3;
        $$3 *= $$3;
        float $$5 = (1.0f + $$3 * 0.4f) * $$4;
        float $$6 = (1.0f + $$3 * 0.1f) / $$4;
        $$1.b($$5, $$6, $$5);
    }

    @Override
    protected float a(bvo $$0, float $$1) {
        float $$2 = $$0.D($$1);
        if ((int)($$2 * 10.0f) % 2 == 0) {
            return 0.0f;
        }
        return apa.a($$2, 0.5f, 1.0f);
    }

    @Override
    public acq a(bvo $$0) {
        return a;
    }

    @Override
    protected /* synthetic */ float b(bfz bfz2, float f2) {
        return this.a((bvo)bfz2, f2);
    }
}

