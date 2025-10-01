/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;

public class bjo {
    private static final int a = 40;
    private static final int b = 5;
    private static final int c = 20;
    private static final int d = 4;

    public static bhs<bgi> a(float $$0) {
        Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();
        MutableLong $$2 = new MutableLong(0L);
        return bld.a(arg_0 -> bjo.a($$2, (Long2LongMap)$$1, $$0, arg_0));
    }

    private static /* synthetic */ App a(MutableLong $$0, Long2LongMap $$1, float $$2, bld.b $$32) {
        return $$32.group($$32.c(bpb.m), $$32.c(bpb.b)).apply((Applicative)$$32, ($$3, $$42) -> ($$4, $$5, $$6) -> {
            if ($$4.V() - $$0.getValue() < 20L) {
                return false;
            }
            bqz $$7 = $$4.w();
            Optional<gu> $$8 = $$7.d($$0 -> $$0.a(brd.n), $$5.di(), 48, bqz.b.c);
            if ($$8.isEmpty() || $$8.get().j($$5.di()) <= 4.0) {
                return false;
            }
            MutableInt $$9 = new MutableInt(0);
            $$0.setValue($$4.V() + (long)$$4.y_().a(20));
            Predicate<gu> $$10 = $$3 -> {
                aif $$4 = $$3.a();
                if ($$1.containsKey($$4)) {
                    return false;
                }
                if ($$9.incrementAndGet() >= 5) {
                    return false;
                }
                $$1.put($$4, $$0.getValue() + 40L);
                return true;
            };
            Set<Pair<he<brc>, gu>> $$11 = $$7.b($$0 -> $$0.a(brd.n), $$10, $$5.di(), 48, bqz.b.c).collect(Collectors.toSet());
            dxt $$122 = bhk.a($$5, $$11);
            if ($$122 != null && $$122.j()) {
                gu $$13 = $$122.m();
                Optional<he<brc>> $$14 = $$7.c($$13);
                if ($$14.isPresent()) {
                    $$3.a(new bpe($$13, $$2, 1));
                    za.c($$4, $$13);
                }
            } else if ($$9.getValue() < 5) {
                $$1.long2LongEntrySet().removeIf($$1 -> $$1.getLongValue() < $$0.getValue());
            }
            return true;
        });
    }
}

