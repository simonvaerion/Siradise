/*
 * Decompiled with CFR 0.152.
 */
public class crc
extends coz {
    private final cpn b;

    protected crc(cpn $$0, dca.d $$1) {
        super($$1);
        this.b = $$0;
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        this.a($$0, (cmn)$$1, $$2);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!crc.e($$0, $$1, $$2)) {
            $$1.a($$2, (dcb)((dcb)this.b.n().a(c, false)).a(a, $$0.c(a)), 2);
        }
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        this.a($$0, $$3, $$4);
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }
}

