/*
 * Decompiled with CFR 0.152.
 */
public class frf<T extends bsk>
extends fqe<T, fdh<T>> {
    private static final acq a = new acq("textures/entity/squid/squid.png");

    public frf(foy.a $$0, fdh<T> $$1) {
        super($$0, $$1, 0.7f);
    }

    @Override
    public acq a(T $$0) {
        return a;
    }

    @Override
    protected void a(T $$0, eij $$1, float $$2, float $$3, float $$4) {
        float $$5 = apa.i($$4, ((bsk)$$0).c, ((bsk)$$0).b);
        float $$6 = apa.i($$4, ((bsk)$$0).e, ((bsk)$$0).d);
        $$1.a(0.0f, 0.5f, 0.0f);
        $$1.a(a.d.rotationDegrees(180.0f - $$3));
        $$1.a(a.b.rotationDegrees($$5));
        $$1.a(a.d.rotationDegrees($$6));
        $$1.a(0.0f, -1.2f, 0.0f);
    }

    @Override
    protected float a(T $$0, float $$1) {
        return apa.i($$1, ((bsk)$$0).bW, ((bsk)$$0).bV);
    }
}

