/*
 * Decompiled with CFR 0.152.
 */
public class fpx
extends fox<bvb> {
    private static final acq a = new acq("textures/entity/lead_knot.png");
    private final fbw<bvb> f;

    public fpx(foy.a $$0) {
        super($$0);
        this.f = new fbw($$0.a(fed.aq));
    }

    @Override
    public void a(bvb $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        $$3.b(-1.0f, -1.0f, 1.0f);
        this.f.a($$0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        ein $$6 = $$4.getBuffer(this.f.a(a));
        this.f.a($$3, $$6, $$5, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bvb $$0) {
        return a;
    }
}

