/*
 * Decompiled with CFR 0.152.
 */
public class frz
extends fox<bzt> {
    private static final acq a = new acq("textures/entity/wither/wither_invulnerable.png");
    private static final acq f = new acq("textures/entity/wither/wither.png");
    private final fdb g;

    public frz(foy.a $$0) {
        super($$0);
        this.g = new fdb($$0.a(fed.bU));
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 35).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        return fek.a($$0, 64, 64);
    }

    @Override
    protected int a(bzt $$0, gu $$1) {
        return 15;
    }

    @Override
    public void a(bzt $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        $$3.b(-1.0f, -1.0f, 1.0f);
        float $$6 = apa.j($$2, $$0.M, $$0.dy());
        float $$7 = apa.i($$2, $$0.N, $$0.dA());
        ein $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
        this.g.a(0.0f, $$6, $$7);
        this.g.a($$3, $$8, $$5, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bzt $$0) {
        return $$0.p() ? a : f;
    }
}

