/*
 * Decompiled with CFR 0.152.
 */
public abstract class fnv<T extends bwv, M extends fdw<T>>
extends fpp<T, M> {
    private static final acq a = new acq("textures/entity/zombie/zombie.png");

    protected fnv(foy.a $$0, M $$1, M $$2, M $$3) {
        super($$0, $$1, 0.5f);
        this.a(new fsw(this, $$2, $$3, $$0.g()));
    }

    @Override
    public acq a(bwv $$0) {
        return a;
    }

    @Override
    protected boolean b(T $$0) {
        return super.a($$0) || ((bwv)$$0).gf();
    }

    @Override
    protected /* synthetic */ boolean a(bfz bfz2) {
        return this.b((T)((bwv)bfz2));
    }
}

