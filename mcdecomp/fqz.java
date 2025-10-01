/*
 * Decompiled with CFR 0.152.
 */
public class fqz
extends fpp<bvl, fda<bvl>> {
    private static final acq a = new acq("textures/entity/skeleton/skeleton.png");

    public fqz(foy.a $$0) {
        this($$0, fed.bh, fed.bj, fed.bk);
    }

    public fqz(foy.a $$0, fec $$1, fec $$2, fec $$3) {
        super($$0, new fda($$0.a($$1)), 0.5f);
        this.a(new fsw(this, new fda($$0.a($$2)), new fda($$0.a($$3)), $$0.g()));
    }

    @Override
    public acq a(bvl $$0) {
        return a;
    }

    @Override
    protected boolean b(bvl $$0) {
        return $$0.fY();
    }

    @Override
    protected /* synthetic */ boolean a(bfz bfz2) {
        return this.b((bvl)bfz2);
    }
}

