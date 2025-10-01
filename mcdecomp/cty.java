/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.ToIntFunction;

public class cty
extends cpn
implements cwo {
    public static final int a = 15;
    public static final ddb b = dcr.aP;
    public static final dcs c = dcr.C;
    public static final ToIntFunction<dcb> d = $$0 -> $$0.c(b);

    public cty(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(b, 15)).a(c, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(b, c);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if (!$$1.B && $$3.gk()) {
            $$1.a($$2, (dcb)$$0.a(b), 2);
            return bdx.a;
        }
        return bdx.b;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return $$3.a(cgc.hg) ? eey.b() : eey.a();
    }

    @Override
    public boolean c(dcb $$0, cls $$1, gu $$2) {
        return true;
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.a;
    }

    @Override
    public float b(dcb $$0, cls $$1, gu $$2) {
        return 1.0f;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public cfz a(cls $$0, gu $$1, dcb $$2) {
        return cty.a(super.a($$0, $$1, $$2), $$2.c(b));
    }

    public static cfz a(cfz $$0, int $$1) {
        if ($$1 != 15) {
            qr $$2 = new qr();
            $$2.a(b.f(), String.valueOf($$1));
            $$0.a("BlockStateTag", $$2);
        }
        return $$0;
    }
}

