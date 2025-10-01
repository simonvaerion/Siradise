/*
 * Decompiled with CFR 0.152.
 */
public class fsd
extends fpp<bww, fdx<bww>> {
    private static final acq a = new acq("textures/entity/zombie_villager/zombie_villager.png");

    public fsd(foy.a $$0) {
        super($$0, new fdx($$0.a(fed.cc)), 0.5f);
        this.a(new fsw(this, new fdx($$0.a(fed.cd)), new fdx($$0.a(fed.ce)), $$0.g()));
        this.a(new ftr<bww, fdx<bww>>(this, $$0.e(), "zombie_villager"));
    }

    @Override
    public acq a(bww $$0) {
        return a;
    }

    @Override
    protected boolean b(bww $$0) {
        return super.a($$0) || $$0.gi();
    }

    @Override
    protected /* synthetic */ boolean a(bfz bfz2) {
        return this.b((bww)bfz2);
    }
}

