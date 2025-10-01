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

public class coz
extends cow {
    public static final dcv a = ctg.aC;
    private static final Map<ha, efb> b = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, (Object)cpn.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0), (Object)ha.d, (Object)cpn.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0), (Object)ha.e, (Object)cpn.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0), (Object)ha.f, (Object)cpn.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)));

    protected coz(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(c, true));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return b.get($$0.c(a));
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
        $$0.a(a, c);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return $$0;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = $$0.c(a);
        gu $$4 = $$2.a($$3.g());
        dcb $$5 = $$1.a_($$4);
        return $$5.d($$1, $$4, $$3);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha[] $$4;
        dcb $$1 = super.a($$0);
        cmm $$2 = $$0.q();
        gu $$3 = $$0.a();
        for (ha $$5 : $$4 = $$0.f()) {
            if (!$$5.o().d() || !($$1 = (dcb)$$1.a(a, $$5.g())).a((cmp)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }
}

