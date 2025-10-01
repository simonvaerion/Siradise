/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cyl
extends cwn {
    public static final dcv a = ctg.aC;
    protected static final float b = 2.0f;
    protected static final float c = 4.5f;
    protected static final float d = 12.5f;
    private static final Map<ha, efb> h = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, (Object)cpn.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0), (Object)ha.d, (Object)cpn.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0), (Object)ha.f, (Object)cpn.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0), (Object)ha.e, (Object)cpn.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)));

    public cyl(dca.d $$0, ddo $$1) {
        super($$0.a($$1.d()), $$1);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(e, false));
    }

    @Override
    public String f() {
        return this.k().a();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return h.get($$0.c(a));
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return $$1.a_($$2.a($$0.c(a).g())).e();
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha[] $$5;
        dcb $$1 = this.n();
        dxe $$2 = $$0.q().b_($$0.a());
        cmm $$3 = $$0.q();
        gu $$4 = $$0.a();
        for (ha $$6 : $$5 = $$0.f()) {
            ha $$7;
            if (!$$6.o().d() || !($$1 = (dcb)$$1.a(a, $$7 = $$6.g())).a((cmp)$$3, $$4)) continue;
            return (dcb)$$1.a(e, $$2.a() == dxf.c);
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public float g(dcb $$0) {
        return $$0.c(a).p();
    }

    @Override
    public eei h(dcb $$0) {
        efb $$1 = h.get($$0.c(a));
        return $$1.a().f();
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
        $$0.a(a, e);
    }
}

