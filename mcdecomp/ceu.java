/*
 * Decompiled with CFR 0.152.
 */
public class ceu
extends cee {
    public ceu(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        if ($$0.B) {
            return bdy.a($$3);
        }
        if (!$$1.fO().d) {
            $$3.h(1);
        }
        $$1.b(amr.c.b(this));
        $$1.dI().a(null, $$1, amh.yr, $$1.cY(), 1.0f, 1.0f);
        cfz $$4 = cgg.a($$0, $$1.dm(), $$1.ds(), (byte)0, true, false);
        if ($$3.b()) {
            return bdy.b($$4);
        }
        if (!$$1.fN().e($$4.p())) {
            $$1.a($$4, false);
        }
        return bdy.b($$3);
    }
}

