/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class age {
    private static final Map<Pair<cdk, bfo>, cfu> a = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put(Pair.of((Object)cdl.b, (Object)((Object)bfo.f)), cgc.oO);
        $$0.put(Pair.of((Object)cdl.b, (Object)((Object)bfo.e)), cgc.oP);
        $$0.put(Pair.of((Object)cdl.b, (Object)((Object)bfo.d)), cgc.oQ);
        $$0.put(Pair.of((Object)cdl.b, (Object)((Object)bfo.c)), cgc.oR);
        $$0.put(Pair.of((Object)cdl.c, (Object)((Object)bfo.f)), cgc.oS);
        $$0.put(Pair.of((Object)cdl.c, (Object)((Object)bfo.e)), cgc.oT);
        $$0.put(Pair.of((Object)cdl.c, (Object)((Object)bfo.d)), cgc.oU);
        $$0.put(Pair.of((Object)cdl.c, (Object)((Object)bfo.c)), cgc.oV);
        $$0.put(Pair.of((Object)cdl.d, (Object)((Object)bfo.f)), cgc.pa);
        $$0.put(Pair.of((Object)cdl.d, (Object)((Object)bfo.e)), cgc.pb);
        $$0.put(Pair.of((Object)cdl.d, (Object)((Object)bfo.d)), cgc.pc);
        $$0.put(Pair.of((Object)cdl.d, (Object)((Object)bfo.c)), cgc.pd);
        $$0.put(Pair.of((Object)cdl.g, (Object)((Object)bfo.f)), cgc.pe);
        $$0.put(Pair.of((Object)cdl.g, (Object)((Object)bfo.e)), cgc.pf);
        $$0.put(Pair.of((Object)cdl.g, (Object)((Object)bfo.d)), cgc.pg);
        $$0.put(Pair.of((Object)cdl.g, (Object)((Object)bfo.c)), cgc.ph);
        $$0.put(Pair.of((Object)cdl.e, (Object)((Object)bfo.f)), cgc.oW);
        $$0.put(Pair.of((Object)cdl.e, (Object)((Object)bfo.e)), cgc.oX);
        $$0.put(Pair.of((Object)cdl.e, (Object)((Object)bfo.d)), cgc.oY);
        $$0.put(Pair.of((Object)cdl.e, (Object)((Object)bfo.c)), cgc.oZ);
        $$0.put(Pair.of((Object)cdl.f, (Object)((Object)bfo.f)), cgc.nC);
    });
    private static final List<acp<cie>> b = List.of(cif.a, cif.b, cif.c, cif.d, cif.e, cif.f, cif.g, cif.h, cif.i, cif.j, cif.k, cif.l, cif.m, cif.n, cif.o, cif.p);
    private static final List<acp<cic>> c = List.of(cid.a, cid.b, cid.c, cid.d, cid.e, cid.f, cid.g, cid.h, cid.i, cid.j);
    private static final ToIntFunction<acp<cie>> d = ac.e(b);
    private static final ToIntFunction<acp<cic>> e = ac.e(c);

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0 -> $$0.c(2))).executes($$0 -> age.a((ds)$$0.getSource(), ((ds)$$0.getSource()).h())));
    }

    private static int a(ds $$0, byo $$12) {
        cmm $$2 = $$12.dI();
        hn<cib> $$32 = hn.a();
        hr<cie> $$4 = $$2.B_().d(jc.aE);
        hr<cic> $$5 = $$2.B_().d(jc.aD);
        $$4.s().sorted(Comparator.comparing($$1 -> d.applyAsInt($$4.c((cie)$$1).orElse(null)))).forEachOrdered($$3 -> $$5.s().sorted(Comparator.comparing($$1 -> e.applyAsInt($$5.c((cic)$$1).orElse(null)))).forEachOrdered($$4 -> $$32.add(new cib($$5.d((cic)$$4), $$4.d((cie)$$3)))));
        gu $$6 = $$12.di().a($$12.cB(), 5);
        int $$7 = cdl.values().length - 1;
        double $$8 = 3.0;
        int $$9 = 0;
        int $$10 = 0;
        for (cib $$11 : $$32) {
            for (cdl $$122 : cdl.values()) {
                if ($$122 == cdl.a) continue;
                double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
                double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
                double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
                bux $$16 = new bux($$2, $$13, $$14, $$15);
                $$16.a_(180.0f);
                $$16.e(true);
                for (bfo $$17 : bfo.values()) {
                    cdj $$20;
                    cfu $$18 = a.get(Pair.of((Object)$$122, (Object)((Object)$$17)));
                    if ($$18 == null) continue;
                    cfz $$19 = new cfz($$18);
                    cib.a($$2.B_(), $$19, $$11);
                    $$16.a($$17, $$19);
                    if ($$18 instanceof cdj && ($$20 = (cdj)$$18).d() == cdl.f) {
                        $$16.b($$11.a().a().a($$11.b()).e().f(" ").b($$11.b().a().e()));
                        $$16.n(true);
                        continue;
                    }
                    $$16.j(true);
                }
                $$2.b($$16);
                ++$$10;
            }
            ++$$9;
        }
        $$0.a(() -> sw.b("Armorstands with trimmed armor spawned around you"), true);
        return 1;
    }
}

