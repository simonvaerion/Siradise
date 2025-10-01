/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cgx
extends cej {
    protected static final Map<cpn, dcb> a = Maps.newHashMap((Map)new ImmutableMap.Builder().put((Object)cpo.i, (Object)cpo.kE.n()).put((Object)cpo.j, (Object)cpo.kE.n()).put((Object)cpo.l, (Object)cpo.kE.n()).put((Object)cpo.k, (Object)cpo.kE.n()).put((Object)cpo.fl, (Object)cpo.kE.n()).put((Object)cpo.rG, (Object)cpo.kE.n()).build());

    public cgx(chm $$0, float $$1, float $$2, cfu.a $$3) {
        super($$1, $$2, $$0, amw.bA, $$3);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$12 = $$0.q();
        gu $$2 = $$0.a();
        dcb $$3 = $$12.a_($$2);
        if ($$0.k() != ha.a) {
            byo $$4 = $$0.o();
            dcb $$5 = a.get($$3.b());
            dcb $$6 = null;
            if ($$5 != null && $$12.a_($$2.c()).i()) {
                $$12.a($$4, $$2, amh.uX, ami.e, 1.0f, 1.0f);
                $$6 = $$5;
            } else if ($$3.b() instanceof cqa && $$3.c(cqa.b).booleanValue()) {
                if (!$$12.r_()) {
                    $$12.a(null, 1009, $$2, 0);
                }
                cqa.a($$0.o(), (cmn)$$12, $$2, $$3);
                $$6 = (dcb)$$3.a(cqa.b, false);
            }
            if ($$6 != null) {
                if (!$$12.B) {
                    $$12.a($$2, $$6, 11);
                    $$12.a(dgl.c, $$2, dgl.a.a($$4, $$6));
                    if ($$4 != null) {
                        $$0.n().a(1, $$4, (T $$1) -> $$1.d($$0.p()));
                    }
                }
                return bdx.a($$12.B);
            }
            return bdx.d;
        }
        return bdx.d;
    }
}

