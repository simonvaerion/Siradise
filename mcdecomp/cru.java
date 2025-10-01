/*
 * Decompiled with CFR 0.152.
 */
public class cru
extends cro {
    private static final ih c = new ig();

    public cru(dca.d $$0) {
        super($$0);
    }

    @Override
    protected ih a(cfz $$0) {
        return c;
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new daf($$0, $$1);
    }

    @Override
    protected void a(aif $$0, gu $$1) {
        cfz $$9;
        gw $$2 = new gw($$0, $$1);
        dae $$3 = (dae)$$2.f();
        int $$4 = $$3.a($$0.z);
        if ($$4 < 0) {
            $$0.c(1001, $$1, 0);
            return;
        }
        cfz $$5 = $$3.a($$4);
        if ($$5.b()) {
            return;
        }
        ha $$6 = $$0.a_($$1).c(a);
        bdq $$7 = dal.a((cmm)$$0, $$1.a($$6));
        if ($$7 == null) {
            cfz $$8 = c.dispense($$2, $$5);
        } else {
            $$9 = dal.a((bdq)$$3, $$7, $$5.p().a(1), $$6.g());
            if ($$9.b()) {
                $$9 = $$5.p();
                $$9.h(1);
            } else {
                $$9 = $$5.p();
            }
        }
        $$3.a($$4, $$9);
    }
}

