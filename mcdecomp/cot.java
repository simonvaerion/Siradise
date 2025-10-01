/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class cot
extends cod {
    public static final ddb a = dcr.ba;
    private static final Map<cen, cpn> b = Maps.newHashMap();
    private static final efb c = cpn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

    public cot(cen $$0, dca.d $$1) {
        super($$0, $$1);
        this.k((dcb)((dcb)this.C.b()).a(a, 0));
        b.put($$0, this);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return $$1.a_($$2.d()).e();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return c;
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, ddh.a($$0.i() + 180.0f));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.a && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a), 16));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a), 16));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    public static cpn a(cen $$0) {
        return b.getOrDefault($$0, cpo.iJ);
    }
}

