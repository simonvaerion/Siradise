/*
 * Decompiled with CFR 0.152.
 */
public class fro
extends fqe<bsl, fax<bsl>> {
    private final fax<bsl> a = (fax)this.a();
    private final fax<bsl> i;
    private static final acq j = new acq("textures/entity/fish/tropical_a.png");
    private static final acq k = new acq("textures/entity/fish/tropical_b.png");

    public fro(foy.a $$0) {
        super($$0, new fdl($$0.a(fed.bF)), 0.15f);
        this.i = new fdm<bsl>($$0.a(fed.bD));
        this.a(new ftq(this, $$0.f()));
    }

    @Override
    public acq a(bsl $$0) {
        return switch ($$0.gj().a()) {
            default -> throw new IncompatibleClassChangeError();
            case bsl.a.a -> j;
            case bsl.a.b -> k;
        };
    }

    @Override
    public void a(bsl $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        fax<bsl> $$6;
        this.f = $$6 = (switch ($$0.gj().a()) {
            default -> throw new IncompatibleClassChangeError();
            case bsl.a.a -> this.a;
            case bsl.a.b -> this.i;
        });
        float[] $$7 = $$0.gh().d();
        $$6.a($$7[0], $$7[1], $$7[2]);
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        $$6.a(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected void a(bsl $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        float $$5 = 4.3f * apa.a(0.6f * $$2);
        $$1.a(a.d.rotationDegrees($$5));
        if (!$$0.aV()) {
            $$1.a(0.2f, 0.1f, 0.0f);
            $$1.a(a.f.rotationDegrees(90.0f));
        }
    }
}

