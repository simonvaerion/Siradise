/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cfo
extends cfu
implements cgy {
    public static final Supplier<BiMap<cpn, cpn>> a = Suppliers.memoize(() -> ImmutableBiMap.builder().put((Object)cpo.qM, (Object)cpo.rb).put((Object)cpo.qL, (Object)cpo.rd).put((Object)cpo.qK, (Object)cpo.rc).put((Object)cpo.qJ, (Object)cpo.re).put((Object)cpo.qS, (Object)cpo.ri).put((Object)cpo.qR, (Object)cpo.rh).put((Object)cpo.qQ, (Object)cpo.rg).put((Object)cpo.qP, (Object)cpo.rf).put((Object)cpo.ra, (Object)cpo.rq).put((Object)cpo.qZ, (Object)cpo.rp).put((Object)cpo.qY, (Object)cpo.ro).put((Object)cpo.qX, (Object)cpo.rn).put((Object)cpo.qW, (Object)cpo.rm).put((Object)cpo.qV, (Object)cpo.rl).put((Object)cpo.qU, (Object)cpo.rk).put((Object)cpo.qT, (Object)cpo.rj).build());
    public static final Supplier<BiMap<cpn, cpn>> b = Suppliers.memoize(() -> a.get().inverse());

    public cfo(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        dcb $$32 = $$1.a_($$2);
        return cfo.b($$32).map($$3 -> {
            byo $$4 = $$0.o();
            cfz $$5 = $$0.n();
            if ($$4 instanceof aig) {
                ai.M.a((aig)$$4, $$2, $$5);
            }
            $$5.h(1);
            $$1.a($$2, (dcb)$$3, 11);
            $$1.a(dgl.c, $$2, dgl.a.a($$4, $$3));
            $$1.a($$4, 3003, $$2, 0);
            return bdx.a($$2.B);
        }).orElse(bdx.d);
    }

    public static Optional<dcb> b(dcb $$0) {
        return Optional.ofNullable((cpn)a.get().get((Object)$$0.b())).map($$1 -> $$1.l($$0));
    }

    @Override
    public boolean a(cmm $$0, dav $$1, boolean $$2, byo $$3) {
        if ($$1.b(true)) {
            $$0.a(null, 3003, $$1.p(), 0);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(daw $$0, byo $$1) {
        return true;
    }
}

