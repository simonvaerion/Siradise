/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class cjg
extends ciu {
    public cjg(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (int $$3 = 0; $$3 < $$0.b(); ++$$3) {
            cfz $$5;
            cfz $$4 = $$0.a($$3);
            if ($$4.b()) continue;
            $$2.add($$4);
            if ($$2.size() <= 1 || $$4.a(($$5 = (cfz)$$2.get(0)).d()) && $$5.L() == 1 && $$4.L() == 1 && $$5.d().o()) continue;
            return false;
        }
        return $$2.size() == 2;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        cfz $$7;
        cfz $$6;
        ArrayList $$2 = Lists.newArrayList();
        for (int $$32 = 0; $$32 < $$0.b(); ++$$32) {
            cfz $$5;
            cfz $$4 = $$0.a($$32);
            if ($$4.b()) continue;
            $$2.add($$4);
            if ($$2.size() <= 1 || $$4.a(($$5 = (cfz)$$2.get(0)).d()) && $$5.L() == 1 && $$4.L() == 1 && $$5.d().o()) continue;
            return cfz.b;
        }
        if ($$2.size() == 2 && ($$6 = (cfz)$$2.get(0)).a(($$7 = (cfz)$$2.get(1)).d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().o()) {
            cfu $$8 = $$6.d();
            int $$9 = $$8.n() - $$6.k();
            int $$10 = $$8.n() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.n() * 5 / 100;
            int $$12 = $$8.n() - $$11;
            if ($$12 < 0) {
                $$12 = 0;
            }
            cfz $$13 = new cfz($$6.d());
            $$13.b($$12);
            HashMap $$14 = Maps.newHashMap();
            Map<ckg, Integer> $$15 = cki.a($$6);
            Map<ckg, Integer> $$16 = cki.a($$7);
            jb.g.s().filter(ckg::c).forEach($$3 -> {
                int $$4 = Math.max($$15.getOrDefault($$3, 0), $$16.getOrDefault($$3, 0));
                if ($$4 > 0) {
                    $$14.put($$3, $$4);
                }
            });
            if (!$$14.isEmpty()) {
                cki.a($$14, $$13);
            }
            return $$13;
        }
        return cfz.b;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }

    @Override
    public cje<?> aj_() {
        return cje.o;
    }
}

