/*
 * Decompiled with CFR 0.152.
 */
public class cqj
extends cta
implements cpp,
cqi {
    private static final float f = 0.11f;

    public cqj(dca.d $$0) {
        super($$0, ha.a, r_, false, 0.1);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(d, 0)).a(s_, false));
    }

    @Override
    protected int a(apf $$0) {
        return 1;
    }

    @Override
    protected boolean g(dcb $$0) {
        return $$0.i();
    }

    @Override
    protected cpn a() {
        return cpo.rv;
    }

    @Override
    protected dcb a(dcb $$0, dcb $$1) {
        return (dcb)$$1.a(s_, $$0.c(s_));
    }

    @Override
    protected dcb a(dcb $$0, apf $$1) {
        return (dcb)super.a($$0, $$1).a(s_, $$1.i() < 0.11f);
    }

    @Override
    public cfz a(cls $$0, gu $$1, dcb $$2) {
        return new cfz(cgc.vw);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        return cqi.a($$3, $$0, $$1, $$2);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        super.a($$0);
        $$0.a(new dde[]{s_});
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return $$2.c(s_) == false;
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        $$0.a($$2, (dcb)$$3.a(s_, true), 2);
    }
}

