/*
 * Decompiled with CFR 0.152.
 */
public class fou
extends fqe<bvs, fbd<bvs>> {
    private static final acq a = new acq("textures/entity/enderman/enderman.png");
    private final apf i = apf.a();

    public fou(foy.a $$0) {
        super($$0, new fbd($$0.a(fed.R)), 0.5f);
        this.a(new fsq<bvs>(this));
        this.a(new fsh(this, $$0.c()));
    }

    @Override
    public void a(bvs $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        dcb $$6 = $$0.fY();
        fbd $$7 = (fbd)this.a();
        $$7.a = $$6 != null;
        $$7.b = $$0.fZ();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public eei a(bvs $$0, float $$1) {
        if ($$0.fZ()) {
            double $$2 = 0.02;
            return new eei(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
        }
        return super.a($$0, $$1);
    }

    @Override
    public acq a(bvs $$0) {
        return a;
    }
}

