/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cno
implements cnn {
    public static final Codec<cno> a = jb.ac.q().dispatchStable(cno::a, Function.identity());
    private final Supplier<Set<he<cnk>>> b = Suppliers.memoize(() -> (Set)this.b().distinct().collect(ImmutableSet.toImmutableSet()));

    protected cno() {
    }

    protected abstract Codec<? extends cno> a();

    protected abstract Stream<he<cnk>> b();

    public Set<he<cnk>> c() {
        return this.b.get();
    }

    public Set<he<cnk>> a(int $$0, int $$1, int $$2, int $$3, cnt.f $$4) {
        int $$5 = hq.a($$0 - $$3);
        int $$6 = hq.a($$1 - $$3);
        int $$7 = hq.a($$2 - $$3);
        int $$8 = hq.a($$0 + $$3);
        int $$9 = hq.a($$1 + $$3);
        int $$10 = hq.a($$2 + $$3);
        int $$11 = $$8 - $$5 + 1;
        int $$12 = $$9 - $$6 + 1;
        int $$13 = $$10 - $$7 + 1;
        HashSet $$14 = Sets.newHashSet();
        for (int $$15 = 0; $$15 < $$13; ++$$15) {
            for (int $$16 = 0; $$16 < $$11; ++$$16) {
                for (int $$17 = 0; $$17 < $$12; ++$$17) {
                    int $$18 = $$5 + $$16;
                    int $$19 = $$6 + $$17;
                    int $$20 = $$7 + $$15;
                    $$14.add(this.getNoiseBiome($$18, $$19, $$20, $$4));
                }
            }
        }
        return $$14;
    }

    @Nullable
    public Pair<gu, he<cnk>> a(int $$0, int $$1, int $$2, int $$3, Predicate<he<cnk>> $$4, apf $$5, cnt.f $$6) {
        return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
    }

    @Nullable
    public Pair<gu, he<cnk>> a(gu $$0, int $$1, int $$2, int $$3, Predicate<he<cnk>> $$4, cnt.f $$5, cmp $$6) {
        Set $$7 = this.c().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
        if ($$7.isEmpty()) {
            return null;
        }
        int $$8 = Math.floorDiv($$1, $$2);
        int[] $$9 = apa.a($$0.v(), $$6.C_() + 1, $$6.aj(), $$3).toArray();
        for (gu.a $$10 : gu.a(gu.b, $$8, ha.f, ha.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = hq.a($$11);
            int $$14 = hq.a($$12);
            for (int $$15 : $$9) {
                int $$16 = hq.a($$15);
                he<cnk> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
                if (!$$7.contains($$17)) continue;
                return Pair.of((Object)new gu($$11, $$15, $$12), $$17);
            }
        }
        return null;
    }

    @Nullable
    public Pair<gu, he<cnk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<he<cnk>> $$5, apf $$6, boolean $$7, cnt.f $$8) {
        int $$15;
        int $$9 = hq.a($$0);
        int $$10 = hq.a($$2);
        int $$11 = hq.a($$3);
        int $$12 = hq.a($$1);
        Pair $$13 = null;
        int $$14 = 0;
        for (int $$16 = $$15 = $$7 ? 0 : $$11; $$16 <= $$11; $$16 += $$4) {
            int $$17;
            int n2 = $$17 = aa.ap ? 0 : -$$16;
            while ($$17 <= $$16) {
                boolean $$18 = Math.abs($$17) == $$16;
                for (int $$19 = -$$16; $$19 <= $$16; $$19 += $$4) {
                    int $$22;
                    int $$21;
                    he<cnk> $$23;
                    if ($$7) {
                        boolean $$20;
                        boolean bl2 = $$20 = Math.abs($$19) == $$16;
                        if (!$$20 && !$$18) continue;
                    }
                    if (!$$5.test($$23 = this.getNoiseBiome($$21 = $$9 + $$19, $$12, $$22 = $$10 + $$17, $$8))) continue;
                    if ($$13 == null || $$6.a($$14 + 1) == 0) {
                        gu $$24 = new gu(hq.c($$21), $$1, hq.c($$22));
                        if ($$7) {
                            return Pair.of((Object)$$24, $$23);
                        }
                        $$13 = Pair.of((Object)$$24, $$23);
                    }
                    ++$$14;
                }
                $$17 += $$4;
            }
        }
        return $$13;
    }

    @Override
    public abstract he<cnk> getNoiseBiome(int var1, int var2, int var3, cnt.f var4);

    public void a(List<String> $$0, gu $$1, cnt.f $$2) {
    }
}

