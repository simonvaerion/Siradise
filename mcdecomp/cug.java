/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cug
extends cpn
implements cwo {
    public static final dcs a = dcr.C;

    protected cug(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, false));
    }

    @Override
    public boolean a(dcb $$0, dcb $$1, ha $$2) {
        return $$1.a(cpo.ac) && $$2.o() == ha.a.b;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == dxf.c;
        return (dcb)super.a($$0).a(a, $$2);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(a).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(a).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }
}

