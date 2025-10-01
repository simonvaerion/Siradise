/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cdo
extends cej {
    protected static final Map<cpn, cpn> a = new ImmutableMap.Builder().put((Object)cpo.ao, (Object)cpo.aw).put((Object)cpo.U, (Object)cpo.al).put((Object)cpo.au, (Object)cpo.aC).put((Object)cpo.aa, (Object)cpo.ak).put((Object)cpo.as, (Object)cpo.aA).put((Object)cpo.Y, (Object)cpo.ai).put((Object)cpo.at, (Object)cpo.aB).put((Object)cpo.Z, (Object)cpo.aj).put((Object)cpo.aq, (Object)cpo.ay).put((Object)cpo.W, (Object)cpo.ag).put((Object)cpo.ar, (Object)cpo.az).put((Object)cpo.X, (Object)cpo.ah).put((Object)cpo.ap, (Object)cpo.ax).put((Object)cpo.V, (Object)cpo.af).put((Object)cpo.oj, (Object)cpo.ok).put((Object)cpo.ol, (Object)cpo.om).put((Object)cpo.os, (Object)cpo.ot).put((Object)cpo.ou, (Object)cpo.ov).put((Object)cpo.av, (Object)cpo.aD).put((Object)cpo.ab, (Object)cpo.am).put((Object)cpo.ae, (Object)cpo.an).build();

    protected cdo(chm $$0, float $$1, float $$2, cfu.a $$3) {
        super($$1, $$2, $$0, amw.bx, $$3);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$12 = $$0.q();
        gu $$2 = $$0.a();
        byo $$3 = $$0.o();
        dcb $$4 = $$12.a_($$2);
        Optional<dcb> $$5 = this.b($$4);
        Optional<dcb> $$6 = cyp.b($$4);
        Optional<dcb> $$7 = Optional.ofNullable((cpn)cfo.b.get().get((Object)$$4.b())).map($$1 -> $$1.l($$4));
        cfz $$8 = $$0.n();
        Optional<Object> $$9 = Optional.empty();
        if ($$5.isPresent()) {
            $$12.a($$3, $$2, amh.as, ami.e, 1.0f, 1.0f);
            $$9 = $$5;
        } else if ($$6.isPresent()) {
            $$12.a($$3, $$2, amh.at, ami.e, 1.0f, 1.0f);
            $$12.a($$3, 3005, $$2, 0);
            $$9 = $$6;
        } else if ($$7.isPresent()) {
            $$12.a($$3, $$2, amh.au, ami.e, 1.0f, 1.0f);
            $$12.a($$3, 3004, $$2, 0);
            $$9 = $$7;
        }
        if ($$9.isPresent()) {
            if ($$3 instanceof aig) {
                ai.M.a((aig)$$3, $$2, $$8);
            }
            $$12.a($$2, (dcb)$$9.get(), 11);
            $$12.a(dgl.c, $$2, dgl.a.a($$3, (dcb)$$9.get()));
            if ($$3 != null) {
                $$8.a(1, $$3, (T $$1) -> $$1.d($$0.p()));
            }
            return bdx.a($$12.B);
        }
        return bdx.d;
    }

    private Optional<dcb> b(dcb $$0) {
        return Optional.ofNullable(a.get($$0.b())).map($$1 -> (dcb)$$1.n().a(cvy.g, $$0.c(cvy.g)));
    }
}

