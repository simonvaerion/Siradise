/*
 * Decompiled with CFR 0.152.
 */
public class cwx
extends cpn {
    public static final dcs a = dcr.z;

    protected cwx(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, false));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.b) {
            return (dcb)$$0.a(a, cwx.h($$2));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a().c());
        return (dcb)this.n().a(a, cwx.h($$1));
    }

    private static boolean h(dcb $$0) {
        return $$0.a(amw.bw);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }
}

