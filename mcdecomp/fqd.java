/*
 * Decompiled with CFR 0.152.
 */
public class fqd<T extends caf>
extends fox<T> {
    private static final acq f = new acq("textures/entity/minecart.png");
    protected final fbf<T> a;
    private final fko g;

    public fqd(foy.a $$0, fec $$1) {
        super($$0);
        this.d = 0.7f;
        this.a = new fca($$0.a($$1));
        this.g = $$0.c();
    }

    @Override
    public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        $$3.a();
        long $$6 = (long)((bfj)$$0).af() * 493286711L;
        $$6 = $$6 * $$6 * 4392167121L + $$6 * 98761L;
        float $$7 = (((float)($$6 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float $$8 = (((float)($$6 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float $$9 = (((float)($$6 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        $$3.a($$7, $$8, $$9);
        double $$10 = apa.d((double)$$2, ((caf)$$0).ab, ((bfj)$$0).dn());
        double $$11 = apa.d((double)$$2, ((caf)$$0).ac, ((bfj)$$0).dp());
        double $$12 = apa.d((double)$$2, ((caf)$$0).ad, ((bfj)$$0).dt());
        double $$13 = 0.3f;
        eei $$14 = ((caf)$$0).q($$10, $$11, $$12);
        float $$15 = apa.i($$2, ((caf)$$0).N, ((bfj)$$0).dA());
        if ($$14 != null) {
            eei $$16 = ((caf)$$0).a($$10, $$11, $$12, (double)0.3f);
            eei $$17 = ((caf)$$0).a($$10, $$11, $$12, (double)-0.3f);
            if ($$16 == null) {
                $$16 = $$14;
            }
            if ($$17 == null) {
                $$17 = $$14;
            }
            $$3.a($$14.c - $$10, ($$16.d + $$17.d) / 2.0 - $$11, $$14.e - $$12);
            eei $$18 = $$17.b(-$$16.c, -$$16.d, -$$16.e);
            if ($$18.f() != 0.0) {
                $$18 = $$18.d();
                $$1 = (float)(Math.atan2($$18.e, $$18.c) * 180.0 / Math.PI);
                $$15 = (float)(Math.atan($$18.d) * 73.0);
            }
        }
        $$3.a(0.0f, 0.375f, 0.0f);
        $$3.a(a.d.rotationDegrees(180.0f - $$1));
        $$3.a(a.f.rotationDegrees(-$$15));
        float $$19 = (float)((caf)$$0).r() - $$2;
        float $$20 = ((caf)$$0).q() - $$2;
        if ($$20 < 0.0f) {
            $$20 = 0.0f;
        }
        if ($$19 > 0.0f) {
            $$3.a(a.b.rotationDegrees(apa.a($$19) * $$19 * $$20 / 10.0f * (float)((caf)$$0).s()));
        }
        int $$21 = ((caf)$$0).x();
        dcb $$22 = ((caf)$$0).v();
        if ($$22.l() != cvs.a) {
            $$3.a();
            float $$23 = 0.75f;
            $$3.b(0.75f, 0.75f, 0.75f);
            $$3.a(-0.5f, (float)($$21 - 8) / 16.0f, 0.5f);
            $$3.a(a.d.rotationDegrees(90.0f));
            this.a($$0, $$2, $$22, $$3, $$4, $$5);
            $$3.b();
        }
        $$3.b(-1.0f, -1.0f, 1.0f);
        this.a.a($$0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        ein $$24 = $$4.getBuffer(this.a.a(this.a($$0)));
        this.a.a($$3, $$24, $$5, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$3.b();
    }

    @Override
    public acq a(T $$0) {
        return f;
    }

    protected void a(T $$0, float $$1, dcb $$2, eij $$3, fjx $$4, int $$5) {
        this.g.a($$2, $$3, $$4, $$5, fum.d);
    }
}

