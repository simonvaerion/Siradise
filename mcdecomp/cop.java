/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cop
extends cpv {
    public static final dcv a = ctg.aC;
    protected static final float b = 2.0f;
    private static final Map<ha, efb> c = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.d, (Object)cpn.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0), (Object)ha.e, (Object)cpn.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0), (Object)ha.c, (Object)cpn.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0), (Object)ha.f, (Object)cpn.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)));
    private final cxk d;
    private final Supplier<cfu> e;

    protected cop(cxk $$0, Supplier<cfu> $$1, dca.d $$2) {
        super($$2);
        this.k((dcb)((dcb)this.C.b()).a(a, ha.c));
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return c.get($$0.c(a));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!$$2.a(this.d) && $$1 == $$0.c(a)) {
            return (dcb)this.d.a().n().a(cxj.b, 7);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected boolean d(dcb $$0, cls $$1, gu $$2) {
        return $$0.a(cpo.cC);
    }

    @Override
    public cfz a(cls $$0, gu $$1, dcb $$2) {
        return new cfz(this.e.get());
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
}

