/*
 * Decompiled with CFR 0.152.
 */
public class fpj
extends fqe<bvx, fbs<bvx>> {
    private static final acq a = new acq("textures/entity/zombie/zombie.png");
    private final float i;

    public fpj(foy.a $$0, float $$1) {
        super($$0, new fbk($$0.a(fed.ab)), 0.5f * $$1);
        this.i = $$1;
        this.a(new fsz<bvx, fbs<bvx>>(this, $$0.d()));
        this.a(new fsw<bvx, fbs<bvx>, fbk>(this, new fbk($$0.a(fed.ac)), new fbk($$0.a(fed.ad)), $$0.g()));
    }

    @Override
    protected void a(bvx $$0, eij $$1, float $$2) {
        $$1.b(this.i, this.i, this.i);
    }

    @Override
    public acq a(bvx $$0) {
        return a;
    }
}

