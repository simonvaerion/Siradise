/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableLong;

public class bhk {
    public static final int a = 48;

    public static bhs<bgi> a(Predicate<he<brc>> $$0, bpb<hd> $$1, boolean $$2, Optional<Byte> $$3) {
        return bhk.a($$0, $$1, $$1, $$2, $$3);
    }

    public static bhs<bgi> a(Predicate<he<brc>> $$0, bpb<hd> $$1, bpb<hd> $$22, boolean $$3, Optional<Byte> $$4) {
        int $$5 = 5;
        int $$6 = 20;
        MutableLong $$7 = new MutableLong(0L);
        Long2ObjectOpenHashMap $$8 = new Long2ObjectOpenHashMap();
        bjb<bgi> $$9 = bld.a(arg_0 -> bhk.a($$22, $$3, $$7, (Long2ObjectMap)$$8, $$0, $$4, arg_0));
        if ($$22 == $$1) {
            return $$9;
        }
        return bld.a($$2 -> $$2.group($$2.c($$1)).apply((Applicative)$$2, $$1 -> $$9));
    }

    @Nullable
    public static dxt a(bgb $$0, Set<Pair<he<brc>, gu>> $$1) {
        if ($$1.isEmpty()) {
            return null;
        }
        HashSet<gu> $$2 = new HashSet<gu>();
        int $$3 = 1;
        for (Pair<he<brc>, gu> $$4 : $$1) {
            $$3 = Math.max($$3, ((brc)((he)$$4.getFirst()).a()).c());
            $$2.add((gu)$$4.getSecond());
        }
        return $$0.J().a($$2, $$3);
    }

    private static /* synthetic */ App a(bpb $$0, boolean $$1, MutableLong $$2, Long2ObjectMap $$3, Predicate $$4, Optional $$52, bld.b $$6) {
        return $$6.group($$6.c($$0)).apply((Applicative)$$6, $$5 -> ($$6, $$7, $$82) -> {
            if ($$1 && $$7.h_()) {
                return false;
            }
            if ($$2.getValue() == 0L) {
                $$2.setValue($$6.V() + (long)$$6.z.a(20));
                return false;
            }
            if ($$6.V() < $$2.getValue()) {
                return false;
            }
            $$2.setValue($$82 + 20L + (long)$$6.y_().a(20));
            bqz $$9 = $$6.w();
            $$3.long2ObjectEntrySet().removeIf($$1 -> !((a)$$1.getValue()).b($$82));
            Predicate<gu> $$10 = $$2 -> {
                a $$3 = (a)$$3.get($$2.a());
                if ($$3 == null) {
                    return true;
                }
                if (!$$3.c($$82)) {
                    return false;
                }
                $$3.a($$82);
                return true;
            };
            Set<Pair<he<brc>, gu>> $$11 = $$9.c($$4, $$10, $$7.di(), 48, bqz.b.a).limit(5L).collect(Collectors.toSet());
            dxt $$122 = bhk.a($$7, $$11);
            if ($$122 != null && $$122.j()) {
                gu $$13 = $$122.m();
                $$9.c($$13).ifPresent($$8 -> {
                    $$9.a((Predicate<he<brc>>)$$4, ($$1, $$2) -> $$2.equals($$13), $$13, 1);
                    $$5.a(hd.a($$6.ac(), $$13));
                    $$52.ifPresent($$2 -> $$6.a((bfj)$$7, (byte)$$2));
                    $$3.clear();
                    za.c($$6, $$13);
                });
            } else {
                for (Pair<he<brc>, gu> $$14 : $$11) {
                    $$3.computeIfAbsent(((gu)$$14.getSecond()).a(), $$2 -> new a($$0.z, $$82));
                }
            }
            return true;
        });
    }

    static class a {
        private static final int a = 40;
        private static final int b = 80;
        private static final int c = 400;
        private final apf d;
        private long e;
        private long f;
        private int g;

        a(apf $$0, long $$1) {
            this.d = $$0;
            this.a($$1);
        }

        public void a(long $$0) {
            this.e = $$0;
            int $$1 = this.g + this.d.a(40) + 40;
            this.g = Math.min($$1, 400);
            this.f = $$0 + (long)this.g;
        }

        public boolean b(long $$0) {
            return $$0 - this.e < 400L;
        }

        public boolean c(long $$0) {
            return $$0 >= this.f;
        }

        public String toString() {
            return "RetryMarker{, previousAttemptAt=" + this.e + ", nextScheduledAttemptAt=" + this.f + ", currentDelay=" + this.g + "}";
        }
    }
}

