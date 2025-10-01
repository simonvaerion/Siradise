/*
 * Decompiled with CFR 0.152.
 */
public class fsh
extends ftg<bvs, fbd<bvs>> {
    private final fko a;

    public fsh(fqt<bvs, fbd<bvs>> $$0, fko $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, bvs $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        dcb $$10 = $$3.fY();
        if ($$10 == null) {
            return;
        }
        $$0.a();
        $$0.a(0.0f, 0.6875f, -0.75f);
        $$0.a(a.b.rotationDegrees(20.0f));
        $$0.a(a.d.rotationDegrees(45.0f));
        $$0.a(0.25f, 0.1875f, 0.25f);
        float $$11 = 0.5f;
        $$0.b(-0.5f, -0.5f, 0.5f);
        $$0.a(a.d.rotationDegrees(90.0f));
        this.a.a($$10, $$0, $$1, $$2, fum.d);
        $$0.b();
    }
}

