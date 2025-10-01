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

public class cyk
extends cwn {
    public static final dcv a = ctg.aC;
    public static final efb b = cpn.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
    public static final efb c = cpn.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
    public static final efb d = eey.a(b, cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
    public static final efb h = eey.a(c, cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
    private static final Map<ha, efb> i = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, (Object)d, (Object)ha.d, (Object)d, (Object)ha.f, (Object)h, (Object)ha.e, (Object)h));

    public cyk(dca.d $$0, ddo $$1) {
        super($$0.a($$1.e()), $$1);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(e, false));
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cfz $$7;
        dav $$6;
        czn czn2 = $$1.c_($$2);
        if (czn2 instanceof dav && this.a($$0, $$3, $$5, $$6 = (dav)czn2, $$7 = $$3.b($$4))) {
            return bdx.d;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private boolean a(dcb $$0, byo $$1, eee $$2, dav $$3, cfz $$4) {
        return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cfl && !this.a($$2, $$0);
    }

    private boolean a(eee $$0, dcb $$1) {
        return $$0.b().o() == $$1.c(a).o();
    }

    @Override
    public String f() {
        return this.k().a();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return i.get($$0.c(a));
    }

    @Override
    public efb b_(dcb $$0, cls $$1, gu $$2) {
        return this.a($$0, $$1, $$2, een.a());
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        switch ($$0.c(a)) {
            case f: 
            case e: {
                return c;
            }
        }
        return b;
    }

    public boolean b(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = $$0.c(a).h();
        ha $$4 = $$0.c(a).i();
        return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
    }

    public boolean a(cmp $$0, dcb $$1, gu $$2, ha $$3) {
        dcb $$4 = $$0.a_($$2);
        if ($$4.a(amw.ax)) {
            return $$4.c(a).o().a($$1.c(a));
        }
        return $$4.a((cls)$$0, $$2, $$3, cxp.a);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = this.n();
        dxe $$2 = $$0.q().b_($$0.a());
        cmm $$3 = $$0.q();
        gu $$4 = $$0.a();
        for (ha $$5 : $$0.f()) {
            ha $$6;
            if (!$$5.o().d() || $$5.o().a($$0.k()) || !($$1 = (dcb)$$1.a(a, $$6 = $$5.g())).a((cmp)$$3, $$4) || !this.b($$1, (cmp)$$3, $$4)) continue;
            return (dcb)$$1.a(e, $$2.a() == dxf.c);
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public float g(dcb $$0) {
        return $$0.c(a).p();
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

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new daj($$0, $$1);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cyk.a($$2, czp.i, dav::a);
    }
}

