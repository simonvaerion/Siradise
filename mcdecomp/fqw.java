/*
 * Decompiled with CFR 0.152.
 */
public class fqw
extends fox<bzi> {
    private static final acq a = new acq("textures/entity/shulker/spark.png");
    private static final fkf f = fkf.h(a);
    private final fcx<bzi> g;

    public fqw(foy.a $$0) {
        super($$0);
        this.g = new fcx($$0.a(fed.bf));
    }

    @Override
    protected int a(bzi $$0, gu $$1) {
        return 15;
    }

    @Override
    public void a(bzi $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        float $$6 = apa.j($$2, $$0.M, $$0.dy());
        float $$7 = apa.i($$2, $$0.N, $$0.dA());
        float $$8 = (float)$$0.ag + $$2;
        $$3.a(0.0f, 0.15f, 0.0f);
        $$3.a(a.d.rotationDegrees(apa.a($$8 * 0.1f) * 180.0f));
        $$3.a(a.b.rotationDegrees(apa.b($$8 * 0.1f) * 180.0f));
        $$3.a(a.f.rotationDegrees(apa.a($$8 * 0.15f) * 360.0f));
        $$3.b(-0.5f, -0.5f, 0.5f);
        this.g.a($$0, 0.0f, 0.0f, 0.0f, $$6, $$7);
        ein $$9 = $$4.getBuffer(this.g.a(a));
        this.g.a($$3, $$9, $$5, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$3.b(1.5f, 1.5f, 1.5f);
        ein $$10 = $$4.getBuffer(f);
        this.g.a($$3, $$10, $$5, fum.d, 1.0f, 1.0f, 1.0f, 0.15f);
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bzi $$0) {
        return a;
    }
}

