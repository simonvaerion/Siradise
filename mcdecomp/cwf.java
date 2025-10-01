/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cwf
extends cpa {
    public static final dcs a = dcr.E;
    private final bdc b = bcz.a(5);

    public cwf(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$0.c(a).booleanValue()) {
            $$1.a($$2, (dcb)$$0.a(a, false), 3);
        }
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new dar($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        if ($$0.B) {
            return null;
        }
        return cwf.a($$2, czp.K, dar::a);
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, this.b);
        }
    }
}

