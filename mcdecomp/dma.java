/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class dma
extends dko<dno> {
    private static final int a = 19;

    public dma(Codec<dno> $$0) {
        super($$0);
    }

    private static boolean d(cms $$02, gu $$1) {
        return $$02.a($$1, (dcb $$0) -> $$0.a(cpo.ff));
    }

    public static boolean b(cms $$02, gu $$1) {
        return $$02.a($$1, (dcb $$0) -> $$0.i() || $$0.a(amw.O));
    }

    private static void b(cmu $$0, gu $$1, dcb $$2) {
        $$0.a($$1, $$2, 19);
    }

    public static boolean c(cms $$02, gu $$1) {
        return $$02.a($$1, (dcb $$0) -> $$0.i() || $$0.a(amw.cd));
    }

    private boolean a(cng $$0, apf $$1, gu $$22, BiConsumer<gu, dcb> $$3, BiConsumer<gu, dcb> $$4, doe.b $$5, dno $$6) {
        int $$72 = $$6.d.a($$1);
        int $$8 = $$6.f.a($$1, $$72, $$6);
        int $$9 = $$72 - $$8;
        int $$10 = $$6.f.a($$1, $$9);
        gu $$11 = $$6.g.map($$2 -> $$2.a($$22, $$1)).orElse($$22);
        int $$12 = Math.min($$22.v(), $$11.v());
        int $$13 = Math.max($$22.v(), $$11.v()) + $$72 + 1;
        if ($$12 < $$0.C_() + 1 || $$13 > $$0.aj()) {
            return false;
        }
        OptionalInt $$14 = $$6.h.c();
        int $$15 = this.a((cms)$$0, $$72, $$11, $$6);
        if ($$15 < $$72 && ($$14.isEmpty() || $$15 < $$14.getAsInt())) {
            return false;
        }
        if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$22, $$11, $$6)) {
            return false;
        }
        List<doe.a> $$16 = $$6.d.a((cms)$$0, $$4, $$1, $$15, $$11, $$6);
        $$16.forEach($$7 -> $$0.f.a((cms)$$0, $$5, $$1, $$6, $$15, (doe.a)$$7, $$8, $$10));
        return true;
    }

    private int a(cms $$0, int $$1, gu $$2, dno $$3) {
        gu.a $$4 = new gu.a();
        for (int $$5 = 0; $$5 <= $$1 + 1; ++$$5) {
            int $$6 = $$3.h.a($$1, $$5);
            for (int $$7 = -$$6; $$7 <= $$6; ++$$7) {
                for (int $$8 = -$$6; $$8 <= $$6; ++$$8) {
                    $$4.a($$2, $$7, $$5, $$8);
                    if ($$3.d.b($$0, $$4) && ($$3.j || !dma.d($$0, $$4))) continue;
                    return $$5 - 2;
                }
            }
        }
        return $$1;
    }

    @Override
    protected void a(cmu $$0, gu $$1, dcb $$2) {
        dma.b($$0, $$1, $$2);
    }

    @Override
    public final boolean a(dkq<dno> $$0) {
        final cng $$12 = $$0.b();
        apf $$22 = $$0.d();
        gu $$32 = $$0.e();
        dno $$42 = $$0.f();
        HashSet $$5 = Sets.newHashSet();
        HashSet $$6 = Sets.newHashSet();
        final HashSet $$7 = Sets.newHashSet();
        HashSet $$8 = Sets.newHashSet();
        BiConsumer<gu, dcb> $$9 = ($$2, $$3) -> {
            $$5.add($$2.i());
            $$12.a((gu)$$2, (dcb)$$3, 19);
        };
        BiConsumer<gu, dcb> $$10 = ($$2, $$3) -> {
            $$6.add($$2.i());
            $$12.a((gu)$$2, (dcb)$$3, 19);
        };
        doe.b $$11 = new doe.b(){

            @Override
            public void a(gu $$0, dcb $$1) {
                $$7.add($$0.i());
                $$12.a($$0, $$1, 19);
            }

            @Override
            public boolean a(gu $$0) {
                return $$7.contains($$0);
            }
        };
        BiConsumer<gu, dcb> $$122 = ($$2, $$3) -> {
            $$8.add($$2.i());
            $$12.a((gu)$$2, (dcb)$$3, 19);
        };
        boolean $$13 = this.a($$12, $$22, $$32, $$9, $$10, $$11, $$42);
        if (!$$13 || $$6.isEmpty() && $$7.isEmpty()) {
            return false;
        }
        if (!$$42.i.isEmpty()) {
            dpk.a $$14 = new dpk.a($$12, $$122, $$22, $$6, $$7, $$5);
            $$42.i.forEach($$1 -> $$1.a($$14));
        }
        return drs.a(Iterables.concat((Iterable)$$5, (Iterable)$$6, (Iterable)$$7, (Iterable)$$8)).map($$4 -> {
            eer $$5 = dma.a((cmn)$$12, $$4, (Set<gu>)$$6, (Set<gu>)$$8, $$5);
            dvt.a($$12, 3, $$5, $$4.g(), $$4.h(), $$4.i());
            return true;
        }).orElse(false);
    }

    /*
     * Unable to fully structure code
     */
    private static eer a(cmn $$0, drs $$1, Set<gu> $$2, Set<gu> $$3, Set<gu> $$4) {
        $$5 = new eel($$1.c(), $$1.d(), $$1.e());
        $$6 = 7;
        $$7 = Lists.newArrayList();
        for ($$8 = 0; $$8 < 7; ++$$8) {
            $$7.add(Sets.newHashSet());
        }
        for (gu $$9 : Lists.newArrayList((Iterable)Sets.union($$3, $$4))) {
            if (!$$1.b($$9)) continue;
            $$5.c($$9.u() - $$1.g(), $$9.v() - $$1.h(), $$9.w() - $$1.i());
        }
        $$10 = new gu.a();
        $$11 = 0;
        ((Set)$$7.get(0)).addAll($$2);
        block2: while (true) {
            if ($$11 < 7 && ((Set)$$7.get($$11)).isEmpty()) {
                ++$$11;
                continue;
            }
            if ($$11 >= 7) break;
            $$12 = ((Set)$$7.get($$11)).iterator();
            $$13 = (gu)$$12.next();
            $$12.remove();
            if (!$$1.b($$13)) continue;
            if ($$11 != 0) {
                $$14 = $$0.a_($$13);
                dma.b($$0, $$13, (dcb)$$14.a(dcr.aC, $$11));
            }
            $$5.c($$13.u() - $$1.g(), $$13.v() - $$1.h(), $$13.w() - $$1.i());
            var12_14 = ha.values();
            var13_15 = var12_14.length;
            var14_16 = 0;
            while (true) {
                if (var14_16 < var13_15) ** break;
                continue block2;
                $$15 = var12_14[var14_16];
                $$10.a((hz)$$13, $$15);
                if ($$1.b($$10) && !$$5.b($$16 = $$10.u() - $$1.g(), $$17 = $$10.v() - $$1.h(), $$18 = $$10.w() - $$1.i()) && !($$20 = ctu.n($$19 = $$0.a_($$10))).isEmpty() && ($$21 = Math.min($$20.getAsInt(), $$11 + 1)) < 7) {
                    ((Set)$$7.get($$21)).add($$10.i());
                    $$11 = Math.min($$11, $$21);
                }
                ++var14_16;
            }
            break;
        }
        return $$5;
    }
}

