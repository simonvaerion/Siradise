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
import java.util.Optional;
import javax.annotation.Nullable;

public class cql
extends cwn {
    public static final ddb a = dcr.ba;
    public static final dcs b = dcr.a;
    protected static final float c = 5.0f;
    protected static final efb d = cpn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
    private static final Map<Integer, efb> h = Maps.newHashMap((Map)ImmutableMap.of((Object)0, (Object)cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0), (Object)4, (Object)cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0), (Object)8, (Object)cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0), (Object)12, (Object)cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)));

    public cql(dca.d $$0, ddo $$1) {
        super($$0.a($$1.e()), $$1);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, 0)).a(b, false)).a(e, false));
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cfz $$7;
        dav $$6;
        czn czn2 = $$1.c_($$2);
        if (czn2 instanceof dav && this.a($$3, $$5, $$6 = (dav)czn2, $$7 = $$3.b($$4))) {
            return bdx.d;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private boolean a(byo $$0, eee $$1, dav $$2, cfz $$3) {
        return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cfl && $$1.b().equals(ha.a);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return $$1.a_($$2.c()).a((cls)$$1, $$2.c(), ha.a, cxp.b);
    }

    @Override
    public dcb a(cih $$0) {
        boolean $$7;
        cmm $$1 = $$0.q();
        dxe $$2 = $$1.b_($$0.a());
        gu $$3 = $$0.a().c();
        dcb $$4 = $$1.a_($$3);
        boolean $$5 = $$4.a(amw.ay);
        ha $$6 = ha.a($$0.i());
        boolean bl2 = $$7 = !cpn.a($$4.k($$1, $$3), ha.a) || $$0.h();
        if ($$5 && !$$0.h()) {
            Optional<ha> $$9;
            if ($$4.b(cyk.a)) {
                ha $$8 = $$4.c(cyk.a);
                if ($$8.o().a($$6)) {
                    $$7 = false;
                }
            } else if ($$4.b(a) && ($$9 = ddh.a($$4.c(a))).isPresent() && $$9.get().o().a($$6)) {
                $$7 = false;
            }
        }
        int $$10 = !$$7 ? ddh.a($$6.g()) : ddh.a($$0.i() + 180.0f);
        return (dcb)((dcb)((dcb)this.n().a(b, $$7)).a(a, $$10)).a(e, $$2.a() == dxf.c);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        efb $$4 = h.get($$0.c(a));
        return $$4 == null ? d : $$4;
    }

    @Override
    public efb b_(dcb $$0, cls $$1, gu $$2) {
        return this.a($$0, $$1, $$2, een.a());
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public float g(dcb $$0) {
        return ddh.b($$0.c(a));
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
        $$0.a(a, b, e);
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new daj($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cql.a($$2, czp.i, dav::a);
    }
}

