/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cpm
extends coh {
    protected cpm(dca.d $$0) {
        super($$0);
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new czm($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cpm.a($$0, $$2, czp.C);
    }

    @Override
    protected void a(cmm $$0, gu $$1, byo $$2) {
        czn $$3 = $$0.c_($$1);
        if ($$3 instanceof czm) {
            $$2.a((bea)((Object)$$3));
            $$2.a(amr.as);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        double $$4 = (double)$$2.u() + 0.5;
        double $$5 = $$2.v();
        double $$6 = (double)$$2.w() + 0.5;
        if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, amh.cg, ami.e, 1.0f, 1.0f, false);
        }
        ha $$7 = $$0.c(a);
        ha.a $$8 = $$7.o();
        double $$9 = 0.52;
        double $$10 = $$3.j() * 0.6 - 0.3;
        double $$11 = $$8 == ha.a.a ? (double)$$7.j() * 0.52 : $$10;
        double $$12 = $$3.j() * 9.0 / 16.0;
        double $$13 = $$8 == ha.a.c ? (double)$$7.l() * 0.52 : $$10;
        $$1.a(iv.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
    }
}

