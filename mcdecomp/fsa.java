/*
 * Decompiled with CFR 0.152.
 */
public class fsa
extends fqe<bso, fdv<bso>> {
    private static final acq a = new acq("textures/entity/wolf/wolf.png");
    private static final acq i = new acq("textures/entity/wolf/wolf_tame.png");
    private static final acq j = new acq("textures/entity/wolf/wolf_angry.png");

    public fsa(foy.a $$0) {
        super($$0, new fdv($$0.a(fed.bV)), 0.5f);
        this.a(new ftv(this));
    }

    @Override
    protected float a(bso $$0, float $$1) {
        return $$0.gg();
    }

    @Override
    public void a(bso $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        if ($$0.gf()) {
            float $$6 = $$0.D($$2);
            ((fdv)this.f).a($$6, $$6, $$6);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if ($$0.gf()) {
            ((fdv)this.f).a(1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public acq a(bso $$0) {
        if ($$0.q()) {
            return i;
        }
        if ($$0.S_()) {
            return j;
        }
        return a;
    }
}

