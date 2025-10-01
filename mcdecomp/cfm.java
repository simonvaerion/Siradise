/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cfm
extends cej {
    protected static final Map<cpn, Pair<Predicate<cij>, Consumer<cij>>> a = Maps.newHashMap((Map)ImmutableMap.of((Object)cpo.i, (Object)Pair.of(cfm::b, cfm.b(cpo.cC.n())), (Object)cpo.kE, (Object)Pair.of(cfm::b, cfm.b(cpo.cC.n())), (Object)cpo.j, (Object)Pair.of(cfm::b, cfm.b(cpo.cC.n())), (Object)cpo.k, (Object)Pair.of(cfm::b, cfm.b(cpo.j.n())), (Object)cpo.rG, (Object)Pair.of($$0 -> true, cfm.a(cpo.j.n(), cgc.ds))));

    protected cfm(chm $$0, int $$1, float $$2, cfu.a $$3) {
        super($$1, $$2, $$0, amw.by, $$3);
    }

    @Override
    public bdx a(cij $$0) {
        gu $$2;
        cmm $$12 = $$0.q();
        Pair<Predicate<cij>, Consumer<cij>> $$3 = a.get($$12.a_($$2 = $$0.a()).b());
        if ($$3 == null) {
            return bdx.d;
        }
        Predicate $$4 = (Predicate)$$3.getFirst();
        Consumer $$5 = (Consumer)$$3.getSecond();
        if ($$4.test($$0)) {
            byo $$6 = $$0.o();
            $$12.a($$6, $$2, amh.kL, ami.e, 1.0f, 1.0f);
            if (!$$12.B) {
                $$5.accept($$0);
                if ($$6 != null) {
                    $$0.n().a(1, $$6, (T $$1) -> $$1.d($$0.p()));
                }
            }
            return bdx.a($$12.B);
        }
        return bdx.d;
    }

    public static Consumer<cij> b(dcb $$0) {
        return $$1 -> {
            $$1.q().a($$1.a(), $$0, 11);
            $$1.q().a(dgl.c, $$1.a(), dgl.a.a($$1.o(), $$0));
        };
    }

    public static Consumer<cij> a(dcb $$0, cml $$1) {
        return $$2 -> {
            $$2.q().a($$2.a(), $$0, 11);
            $$2.q().a(dgl.c, $$2.a(), dgl.a.a($$2.o(), $$0));
            cpn.a($$2.q(), $$2.a(), $$2.k(), new cfz($$1));
        };
    }

    public static boolean b(cij $$0) {
        return $$0.k() != ha.a && $$0.q().a_($$0.a().c()).i();
    }
}

