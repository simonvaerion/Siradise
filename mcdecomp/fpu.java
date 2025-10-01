/*
 * Decompiled with CFR 0.152.
 */
public class fpu
extends fox<bvh> {
    private static final float a = 0.15f;
    private static final int f = 48;
    private static final int g = 32;
    private static final int h = 16;
    private static final int i = 1;
    private static final float j = 0.0f;
    private static final float k = 0.0f;
    private static final float l = 0.09375f;
    private final fpw m;
    private final apf n = apf.a();

    public fpu(foy.a $$0) {
        super($$0);
        this.m = $$0.b();
        this.d = 0.15f;
        this.e = 0.75f;
    }

    private int a(cfz $$0) {
        int $$1 = 1;
        if ($$0.L() > 48) {
            $$1 = 5;
        } else if ($$0.L() > 32) {
            $$1 = 4;
        } else if ($$0.L() > 16) {
            $$1 = 3;
        } else if ($$0.L() > 1) {
            $$1 = 2;
        }
        return $$1;
    }

    @Override
    public void a(bvh $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        cfz $$6 = $$0.j();
        int $$7 = $$6.b() ? 187 : cfu.a($$6.d()) + $$6.k();
        this.n.b((long)$$7);
        fwr $$8 = this.m.a($$6, $$0.dI(), null, $$0.af());
        boolean $$9 = $$8.b();
        int $$10 = this.a($$6);
        float $$11 = 0.25f;
        float $$12 = apa.a(((float)$$0.k() + $$2) / 10.0f + $$0.b) * 0.1f + 0.1f;
        float $$13 = $$8.f().a((cfw)cfw.h).d.y();
        $$3.a(0.0f, $$12 + 0.25f * $$13, 0.0f);
        float $$14 = $$0.a($$2);
        $$3.a(a.d.rotation($$14));
        float $$15 = $$8.f().h.d.x();
        float $$16 = $$8.f().h.d.y();
        float $$17 = $$8.f().h.d.z();
        if (!$$9) {
            float $$18 = -0.0f * (float)($$10 - 1) * 0.5f * $$15;
            float $$19 = -0.0f * (float)($$10 - 1) * 0.5f * $$16;
            float $$20 = -0.09375f * (float)($$10 - 1) * 0.5f * $$17;
            $$3.a($$18, $$19, $$20);
        }
        for (int $$21 = 0; $$21 < $$10; ++$$21) {
            $$3.a();
            if ($$21 > 0) {
                if ($$9) {
                    float $$22 = (this.n.i() * 2.0f - 1.0f) * 0.15f;
                    float $$23 = (this.n.i() * 2.0f - 1.0f) * 0.15f;
                    float $$24 = (this.n.i() * 2.0f - 1.0f) * 0.15f;
                    $$3.a($$22, $$23, $$24);
                } else {
                    float $$25 = (this.n.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    float $$26 = (this.n.i() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    $$3.a($$25, $$26, 0.0f);
                }
            }
            this.m.a($$6, cfw.h, false, $$3, $$4, $$5, fum.d, $$8);
            $$3.b();
            if ($$9) continue;
            $$3.a(0.0f * $$15, 0.0f * $$16, 0.09375f * $$17);
        }
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bvh $$0) {
        return fuu.e;
    }
}

