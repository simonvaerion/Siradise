/*
 * Decompiled with CFR 0.152.
 */
public class fsu
extends ftg<btm, fbq<btm>> {
    private final fbq<btm> a;

    public fsu(fqt<btm, fbq<btm>> $$0, fea $$1) {
        super($$0);
        this.a = new fbq($$1.a(fed.ak));
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, btm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        float $$18;
        float $$17;
        float $$16;
        cfz $$10 = $$3.q();
        if (!($$10.d() instanceof cfp)) {
            return;
        }
        cfp $$11 = (cfp)$$10.d();
        ((fbq)this.c()).a(this.a);
        this.a.a($$3, $$4, $$5, $$6);
        this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
        if ($$11 instanceof ceq) {
            int $$12 = ((ceq)$$11).e_($$10);
            float $$13 = (float)($$12 >> 16 & 0xFF) / 255.0f;
            float $$14 = (float)($$12 >> 8 & 0xFF) / 255.0f;
            float $$15 = (float)($$12 & 0xFF) / 255.0f;
        } else {
            $$16 = 1.0f;
            $$17 = 1.0f;
            $$18 = 1.0f;
        }
        ein $$19 = $$1.getBuffer(fkf.d($$11.h()));
        this.a.a($$0, $$19, $$2, fum.d, $$16, $$17, $$18, 1.0f);
    }
}

