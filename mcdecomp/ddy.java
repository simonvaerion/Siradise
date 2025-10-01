/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class ddy {
    public static final Codec<ddy> a = jb.ad.q().dispatchStable(ddy::a, Function.identity());
    protected final cno b;
    private final Supplier<List<cnu.b>> c;
    private final Function<he<cnk>, cnl> d;

    public ddy(cno $$02) {
        this($$02, $$0 -> ((cnk)$$0.a()).d());
    }

    public ddy(cno $$0, Function<he<cnk>, cnl> $$1) {
        this.b = $$0;
        this.d = $$1;
        this.c = Suppliers.memoize(() -> cnu.a(List.copyOf($$0.c()), (T $$1) -> ((cnl)$$1.apply((he<cnk>)$$1)).b(), true));
    }

    protected abstract Codec<? extends ddy> a();

    public ddz a(hg<dsg> $$0, dhy $$1, long $$2) {
        return ddz.a($$1, $$2, this.b, $$0);
    }

    public Optional<acp<Codec<? extends ddy>>> b() {
        return jb.ad.c(this.a());
    }

    public CompletableFuture<ddx> a(Executor $$0, dhy $$1, dim $$2, cne $$3, ddx $$4) {
        return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
            $$4.a(this.b, $$1.b());
            return $$4;
        }), ac.f());
    }

    public abstract void a(aim var1, long var2, dhy var4, cnm var5, cne var6, ddx var7, dhg.a var8);

    @Nullable
    public Pair<gu, he<dsa>> a(aif $$02, hi<dsa> $$1, gu $$2, int $$3, boolean $$4) {
        ddz $$5 = $$02.k().h();
        Object2ObjectArrayMap $$6 = new Object2ObjectArrayMap();
        for (he he2 : $$1) {
            for (dsx $$8 : $$5.a(he2)) {
                $$6.computeIfAbsent($$8, $$0 -> new ObjectArraySet()).add(he2);
            }
        }
        if ($$6.isEmpty()) {
            return null;
        }
        Pair<gu, he<dsa>> $$9 = null;
        double d2 = Double.MAX_VALUE;
        cne $$11 = $$02.a();
        ArrayList $$12 = new ArrayList($$6.size());
        for (Map.Entry $$13 : $$6.entrySet()) {
            dsx $$14 = (dsx)$$13.getKey();
            if ($$14 instanceof dsu) {
                gu gu2;
                double $$18;
                dsu $$15 = (dsu)$$14;
                Pair<gu, he<dsa>> $$16 = this.a((Set)$$13.getValue(), $$02, $$11, $$2, $$4, $$15);
                if ($$16 == null || !(($$18 = $$2.j(gu2 = (gu)$$16.getFirst())) < d2)) continue;
                d2 = $$18;
                $$9 = $$16;
                continue;
            }
            if (!($$14 instanceof dsv)) continue;
            $$12.add($$13);
        }
        if (!$$12.isEmpty()) {
            int $$19 = hx.a($$2.u());
            int $$20 = hx.a($$2.w());
            for (int $$21 = 0; $$21 <= $$3; ++$$21) {
                boolean $$22 = false;
                for (Map.Entry entry : $$12) {
                    dsv $$24 = (dsv)entry.getKey();
                    Pair<gu, he<dsa>> $$25 = ddy.a((Set)entry.getValue(), $$02, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                    if ($$25 == null) continue;
                    $$22 = true;
                    double $$26 = $$2.j((hz)$$25.getFirst());
                    if (!($$26 < d2)) continue;
                    d2 = $$26;
                    $$9 = $$25;
                }
                if (!$$22) continue;
                return $$9;
            }
        }
        return $$9;
    }

    @Nullable
    private Pair<gu, he<dsa>> a(Set<he<dsa>> $$0, aif $$1, cne $$2, gu $$3, boolean $$4, dsu $$5) {
        List<clt> $$6 = $$1.k().h().a($$5);
        if ($$6 == null) {
            throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
        }
        Pair<gu, he<dsa>> $$7 = null;
        double $$8 = Double.MAX_VALUE;
        gu.a $$9 = new gu.a();
        for (clt $$10 : $$6) {
            Pair<gu, he<dsa>> $$13;
            $$9.d(hx.a($$10.e, 8), 32, hx.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if (!$$12 || ($$13 = ddy.a($$0, $$1, $$2, $$4, $$5, $$10)) == null) continue;
            $$7 = $$13;
            $$8 = $$11;
        }
        return $$7;
    }

    @Nullable
    private static Pair<gu, he<dsa>> a(Set<he<dsa>> $$0, cmp $$1, cne $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dsv $$8) {
        int $$9 = $$8.a();
        for (int $$10 = -$$5; $$10 <= $$5; ++$$10) {
            boolean $$11 = $$10 == -$$5 || $$10 == $$5;
            for (int $$12 = -$$5; $$12 <= $$5; ++$$12) {
                int $$15;
                int $$14;
                clt $$16;
                Pair<gu, he<dsa>> $$17;
                boolean $$13;
                boolean bl2 = $$13 = $$12 == -$$5 || $$12 == $$5;
                if (!$$11 && !$$13 || ($$17 = ddy.a($$0, $$1, $$2, $$6, $$8, $$16 = $$8.a($$7, $$14 = $$3 + $$9 * $$10, $$15 = $$4 + $$9 * $$12))) == null) continue;
                return $$17;
            }
        }
        return null;
    }

    @Nullable
    private static Pair<gu, he<dsa>> a(Set<he<dsa>> $$0, cmp $$1, cne $$2, boolean $$3, dsx $$4, clt $$5) {
        for (he<dsa> $$6 : $$0) {
            dsc $$7 = $$2.a($$5, $$6.a(), $$3);
            if ($$7 == dsc.b) continue;
            if (!$$3 && $$7 == dsc.a) {
                return Pair.of((Object)$$4.a($$5), $$6);
            }
            ddx $$8 = $$1.a($$5.e, $$5.f, dec.d);
            dsi $$9 = $$2.a(hx.a($$8), $$6.a(), $$8);
            if ($$9 == null || !$$9.b() || $$3 && !ddy.a($$2, $$9)) continue;
            return Pair.of((Object)$$4.a($$9.c()), $$6);
        }
        return null;
    }

    private static boolean a(cne $$0, dsi $$1) {
        if ($$1.d()) {
            $$0.a($$1);
            return true;
        }
        return false;
    }

    public void a(cng $$02, ddx $$1, cne $$2) {
        clt $$3 = $$1.f();
        if (aa.a($$3)) {
            return;
        }
        hx $$4 = hx.a($$3, $$02.al());
        gu $$52 = $$4.j();
        hr<dsa> $$6 = $$02.B_().d(jc.az);
        Map<Integer, List<dsa>> $$7 = $$6.s().collect(Collectors.groupingBy($$0 -> $$0.c().ordinal()));
        List<cnu.b> $$8 = this.c.get();
        dij $$9 = new dij(new dil(dhz.a()));
        long $$10 = $$9.a($$02.A(), $$52.u(), $$52.w());
        ObjectArraySet $$11 = new ObjectArraySet();
        clt.a($$4.r(), 1).forEach(arg_0 -> ddy.a($$02, (Set)$$11, arg_0));
        $$11.retainAll(this.b.c());
        int $$12 = $$8.size();
        try {
            hr<dre> $$13 = $$02.B_().d(jc.ay);
            int $$14 = Math.max(dhg.b.values().length, $$12);
            for (int $$15 = 0; $$15 < $$14; ++$$15) {
                int $$16 = 0;
                if ($$2.a()) {
                    List $$17 = $$7.getOrDefault($$15, Collections.emptyList());
                    for (dsa $$18 : $$17) {
                        $$9.b($$10, $$16, $$15);
                        Supplier<String> $$19 = () -> $$6.c($$18).map(Object::toString).orElseGet($$18::toString);
                        try {
                            $$02.a($$19);
                            $$2.a($$4, $$18).forEach($$5 -> $$5.a($$02, $$2, this, $$9, ddy.a($$1), $$3));
                        }
                        catch (Exception $$20) {
                            o $$21 = o.a($$20, "Feature placement");
                            $$21.a("Feature").a("Description", $$19::get);
                            throw new y($$21);
                        }
                        ++$$16;
                    }
                }
                if ($$15 >= $$12) continue;
                IntArraySet $$22 = new IntArraySet();
                for (he $$23 : $$11) {
                    List<hi<dre>> $$24 = this.d.apply($$23).b();
                    if ($$15 >= $$24.size()) continue;
                    hi<dre> $$25 = $$24.get($$15);
                    cnu.b $$26 = $$8.get($$15);
                    $$25.a().map(he::a).forEach(arg_0 -> ddy.a((IntSet)$$22, $$26, arg_0));
                }
                int $$27 = $$22.size();
                int[] $$28 = $$22.toIntArray();
                Arrays.sort($$28);
                cnu.b $$29 = $$8.get($$15);
                for (int $$30 = 0; $$30 < $$27; ++$$30) {
                    int $$31 = $$28[$$30];
                    dre $$32 = $$29.a().get($$31);
                    Supplier<String> $$33 = () -> $$13.c($$32).map(Object::toString).orElseGet($$32::toString);
                    $$9.b($$10, $$31, $$15);
                    try {
                        $$02.a($$33);
                        $$32.b($$02, this, $$9, $$52);
                        continue;
                    }
                    catch (Exception $$34) {
                        o $$35 = o.a($$34, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new y($$35);
                    }
                }
            }
            $$02.a((Supplier<String>)null);
        }
        catch (Exception $$36) {
            o $$37 = o.a($$36, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Seed", $$10);
            throw new y($$37);
        }
    }

    private static drs a(ddx $$0) {
        clt $$1 = $$0.f();
        int $$2 = $$1.d();
        int $$3 = $$1.e();
        cmo $$4 = $$0.z();
        int $$5 = $$4.C_() + 1;
        int $$6 = $$4.aj() - 1;
        return new drs($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
    }

    public abstract void a(aim var1, cne var2, dhy var3, ddx var4);

    public abstract void a(aim var1);

    public int a(cmo $$0) {
        return 64;
    }

    public cno c() {
        return this.b;
    }

    public abstract int d();

    public bcl<cnw.c> a(he<cnk> $$0, cne $$12, bgc $$22, gu $$3) {
        Map<dsa, LongSet> $$4 = $$12.b($$3);
        for (Map.Entry<dsa, LongSet> $$5 : $$4.entrySet()) {
            dsa $$6 = $$5.getKey();
            dsh $$7 = $$6.b().get($$22);
            if ($$7 == null) continue;
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dsi> $$9 = $$7.a() == dsh.a.a ? $$2 -> $$12.a($$3, (dsi)$$2) : $$1 -> $$1.a().b($$3);
            $$12.a($$6, $$5.getValue(), (dsi $$2) -> {
                if ($$8.isFalse() && $$9.test((dsi)$$2)) {
                    $$8.setTrue();
                }
            });
            if (!$$8.isTrue()) continue;
            return $$7.b();
        }
        return $$0.a().b().a($$22);
    }

    public void a(hs $$0, ddz $$1, cne $$2, ddx $$3, dvu $$4) {
        clt $$5 = $$3.f();
        hx $$6 = hx.a($$3);
        dhy $$7 = $$1.c();
        $$1.a().forEach($$8 -> {
            dsx $$9 = ((dsg)$$8.a()).b();
            List<dsg.a> $$10 = ((dsg)$$8.a()).a();
            for (dsg.a $$11 : $$10) {
                dsi $$12 = $$2.a($$6, $$11.a().a(), $$3);
                if ($$12 == null || !$$12.b()) continue;
                return;
            }
            if (!$$9.b($$1, $$4.e, $$4.f)) {
                return;
            }
            if ($$10.size() == 1) {
                this.a($$10.get(0), $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6);
                return;
            }
            ArrayList<dsg.a> $$13 = new ArrayList<dsg.a>($$10.size());
            $$13.addAll($$10);
            dij $$14 = new dij(new dhl(0L));
            $$14.c($$1.d(), $$4.e, $$4.f);
            int $$15 = 0;
            for (dsg.a $$16 : $$13) {
                $$15 += $$16.b();
            }
            while (!$$13.isEmpty()) {
                dsg.a $$19;
                int $$17 = $$14.a($$15);
                int $$18 = 0;
                Iterator iterator = $$13.iterator();
                while (iterator.hasNext() && ($$17 -= ($$19 = (dsg.a)iterator.next()).b()) >= 0) {
                    ++$$18;
                }
                dsg.a $$20 = (dsg.a)$$13.get($$18);
                if (this.a($$20, $$2, $$0, $$7, $$4, $$1.d(), $$3, $$5, $$6)) {
                    return;
                }
                $$13.remove($$18);
                $$15 -= $$20.b();
            }
        });
    }

    private boolean a(dsg.a $$0, cne $$1, hs $$2, dhy $$3, dvu $$4, long $$5, ddx $$6, clt $$7, hx $$8) {
        dsa $$9 = $$0.a().a();
        int $$10 = ddy.a($$1, $$6, $$8, $$9);
        hi<cnk> $$11 = $$9.a();
        Predicate<he<cnk>> $$12 = $$11::a;
        dsi $$13 = $$9.a($$2, this, this.b, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
        if ($$13.b()) {
            $$1.a($$8, $$9, $$13, (deu)$$6);
            return true;
        }
        return false;
    }

    private static int a(cne $$0, ddx $$1, hx $$2, dsa $$3) {
        dsi $$4 = $$0.a($$2, $$3, $$1);
        return $$4 != null ? $$4.f() : 0;
    }

    public void a(cng $$0, cne $$1, ddx $$2) {
        int $$3 = 8;
        clt $$4 = $$2.f();
        int $$5 = $$4.e;
        int $$6 = $$4.f;
        int $$7 = $$4.d();
        int $$8 = $$4.e();
        hx $$9 = hx.a($$2);
        for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; ++$$10) {
            for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; ++$$11) {
                long $$12 = clt.c($$10, $$11);
                for (dsi $$13 : $$0.a($$10, $$11).g().values()) {
                    try {
                        if (!$$13.b() || !$$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) continue;
                        $$1.a($$9, $$13.h(), $$12, (deu)$$2);
                        za.a($$0, $$13);
                    }
                    catch (Exception $$14) {
                        o $$15 = o.a($$14, "Generating structure reference");
                        p $$16 = $$15.a("Structure");
                        Optional<hr<dsa>> $$17 = $$0.B_().c(jc.az);
                        $$16.a("Id", () -> $$17.map($$1 -> $$1.b($$13.h()).toString()).orElse("UNKNOWN"));
                        $$16.a("Name", () -> jb.U.b($$13.h().e()).toString());
                        $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                        throw new y($$15);
                    }
                }
            }
        }
    }

    public abstract CompletableFuture<ddx> a(Executor var1, dim var2, dhy var3, cne var4, ddx var5);

    public abstract int e();

    public abstract int f();

    public abstract int a(int var1, int var2, dhk.a var3, cmo var4, dhy var5);

    public abstract cmy a(int var1, int var2, cmo var3, dhy var4);

    public int b(int $$0, int $$1, dhk.a $$2, cmo $$3, dhy $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4);
    }

    public int c(int $$0, int $$1, dhk.a $$2, cmo $$3, dhy $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4) - 1;
    }

    public abstract void a(List<String> var1, dhy var2, gu var3);

    @Deprecated
    public cnl a(he<cnk> $$0) {
        return this.d.apply($$0);
    }

    private static /* synthetic */ void a(IntSet $$0, cnu.b $$1, dre $$2) {
        $$0.add($$1.b().applyAsInt($$2));
    }

    private static /* synthetic */ void a(cng $$0, Set $$1, clt $$2) {
        ddx $$3 = $$0.a($$2.e, $$2.f);
        for (dej $$4 : $$3.d()) {
            $$4.i().a($$1::add);
        }
    }
}

