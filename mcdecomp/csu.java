/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.ToIntFunction;

public class csu
extends cul
implements cpp,
cwo {
    private static final dcs b = dcr.C;
    private final cum c = new cum(this);

    public csu(dca.d $$0) {
        super($$0);
        this.k((dcb)this.n().a(b, false));
    }

    public static ToIntFunction<dcb> b(int $$0) {
        return $$1 -> cul.n($$1) ? $$0 : 0;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        super.a($$0);
        $$0.a(new dde[]{b});
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        return !$$1.n().a(cgc.fA) || super.a($$0, $$1);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$32) {
        return ha.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        this.c.a($$3, (cmn)$$0, $$2, $$1);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean c(dcb $$0, cls $$1, gu $$2) {
        return $$0.u().c();
    }

    @Override
    public cum b() {
        return this.c;
    }
}

