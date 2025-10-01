/*
 * Decompiled with CFR 0.152.
 */
public class fse<T extends bfz, M extends fck<T>>
extends ftp<T, M> {
    private final fow a;

    public fse(foy.a $$0, fpz<T, M> $$1) {
        super($$1);
        this.a = $$0.a();
    }

    @Override
    protected int a(T $$0) {
        return ((bfz)$$0).eJ();
    }

    @Override
    protected void a(eij $$0, fjx $$1, int $$2, bfj $$3, float $$4, float $$5, float $$6, float $$7) {
        float $$8 = apa.c($$4 * $$4 + $$6 * $$6);
        byw $$9 = new byw($$3.dI(), $$3.dn(), $$3.dp(), $$3.dt());
        $$9.a_((float)(Math.atan2($$4, $$6) * 57.2957763671875));
        $$9.b_((float)(Math.atan2($$5, $$8) * 57.2957763671875));
        $$9.M = $$9.dy();
        $$9.N = $$9.dA();
        this.a.a($$9, 0.0, 0.0, 0.0, 0.0f, $$7, $$0, $$1, $$2);
    }
}

