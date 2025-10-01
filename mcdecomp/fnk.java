/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Ordering
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class fnk
implements fnd.a {
    private final enn a;
    private final Map<Long, Map<gu, Integer>> b = Maps.newTreeMap((Comparator)Ordering.natural().reverse());

    fnk(enn $$0) {
        this.a = $$0;
    }

    public void a(long $$02, gu $$1) {
        Map $$2 = this.b.computeIfAbsent($$02, $$0 -> Maps.newHashMap());
        int $$3 = $$2.getOrDefault($$1, 0);
        $$2.put($$1, $$3 + 1);
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        long $$5 = this.a.s.V();
        int $$6 = 200;
        double $$7 = 0.0025;
        HashSet $$8 = Sets.newHashSet();
        HashMap $$9 = Maps.newHashMap();
        ein $$10 = $$1.getBuffer(fkf.x());
        Iterator<Map.Entry<Long, Map<gu, Integer>>> $$11 = this.b.entrySet().iterator();
        while ($$11.hasNext()) {
            Map.Entry<Long, Map<gu, Integer>> $$12 = $$11.next();
            Long $$13 = $$12.getKey();
            Map<gu, Integer> $$14 = $$12.getValue();
            long $$15 = $$5 - $$13;
            if ($$15 > 200L) {
                $$11.remove();
                continue;
            }
            for (Map.Entry<gu, Integer> $$16 : $$14.entrySet()) {
                gu $$17 = $$16.getKey();
                Integer $$18 = $$16.getValue();
                if (!$$8.add($$17)) continue;
                eed $$19 = new eed(gu.b).g(0.002).h(0.0025 * (double)$$15).d($$17.u(), $$17.v(), $$17.w()).d(-$$2, -$$3, -$$4);
                fjv.a($$0, $$10, $$19.a, $$19.b, $$19.c, $$19.d, $$19.e, $$19.f, 1.0f, 1.0f, 1.0f, 1.0f);
                $$9.put($$17, $$18);
            }
        }
        for (Map.Entry $$20 : $$9.entrySet()) {
            gu $$21 = (gu)$$20.getKey();
            Integer $$22 = (Integer)$$20.getValue();
            fnd.a($$0, $$1, String.valueOf($$22), $$21.u(), $$21.v(), $$21.w(), -1);
        }
    }
}

