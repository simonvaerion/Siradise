/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cxl
extends cpn {
    private static final sw c = sw.c("container.stonecutter");
    public static final dcv a = ctg.aC;
    protected static final efb b = cpn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

    public cxl(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, ha.c));
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, $$0.g().g());
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$1.B) {
            return bdx.a;
        }
        $$3.a($$0.b($$1, $$2));
        $$3.a(amr.ay);
        return bdx.b;
    }

    @Override
    @Nullable
    public bea b(dcb $$0, cmm $$1, gu $$22) {
        return new bef(($$2, $$3, $$4) -> new cdb($$2, $$3, cbq.a($$1, $$22)), c);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return b;
    }

    @Override
    public boolean g_(dcb $$0) {
        return true;
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

