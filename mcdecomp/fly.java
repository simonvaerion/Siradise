/*
 * Decompiled with CFR 0.152.
 */
public class fly
implements flu<czr> {
    private final fpw a;

    public fly(flv.a $$0) {
        this.a = $$0.d();
    }

    @Override
    public void a(czr $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        if ($$0.k() == null) {
            return;
        }
        int $$6 = $$0.q().c(dcr.bv);
        if ($$6 <= 0) {
            return;
        }
        ha $$7 = $$0.f();
        if ($$7 == null) {
            return;
        }
        cfz $$8 = $$0.g();
        if ($$8.b()) {
            return;
        }
        $$2.a();
        $$2.a(0.0f, 0.5f, 0.0f);
        float[] $$9 = this.a($$7, $$6);
        $$2.a($$9[0], $$9[1], $$9[2]);
        $$2.a(a.d.rotationDegrees(75.0f));
        boolean $$10 = $$7 == ha.f || $$7 == ha.e;
        $$2.a(a.d.rotationDegrees(($$10 ? 90 : 0) + 11));
        $$2.b(0.5f, 0.5f, 0.5f);
        int $$11 = fjv.a($$0.k(), $$0.q(), $$0.p().a($$7));
        this.a.a($$8, cfw.i, $$11, fum.d, $$2, $$3, $$0.k(), 0);
        $$2.b();
    }

    private float[] a(ha $$0, int $$1) {
        float[] $$2 = new float[]{0.5f, 0.0f, 0.5f};
        float $$3 = (float)$$1 / 10.0f * 0.75f;
        switch ($$0) {
            case f: {
                $$2[0] = 0.73f + $$3;
                break;
            }
            case e: {
                $$2[0] = 0.25f - $$3;
                break;
            }
            case b: {
                $$2[1] = 0.25f + $$3;
                break;
            }
            case a: {
                $$2[1] = -0.23f - $$3;
                break;
            }
            case c: {
                $$2[2] = 0.25f - $$3;
                break;
            }
            case d: {
                $$2[2] = 0.73f + $$3;
            }
        }
        return $$2;
    }
}

