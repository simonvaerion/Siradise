/*
 * Decompiled with CFR 0.152.
 */
public class frw
extends fqe<bws, fdt<bws>> {
    private static final acq a = new acq("textures/entity/witch.png");

    public frw(foy.a $$0) {
        super($$0, new fdt($$0.a(fed.bN)), 0.5f);
        this.a(new ftt<bws>(this, $$0.d()));
    }

    @Override
    public void a(bws $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        ((fdt)this.f).b(!$$0.eO().b());
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bws $$0) {
        return a;
    }

    @Override
    protected void a(bws $$0, eij $$1, float $$2) {
        float $$3 = 0.9375f;
        $$1.b(0.9375f, 0.9375f, 0.9375f);
    }
}

