/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bpw
extends bqf<bgb> {
    private static final int a = 40;
    private static final int c = 5;
    private static final int d = 20;
    private final Long2LongMap e = new Long2LongOpenHashMap();
    private int f;
    private long g;

    public bpw() {
        super(20);
    }

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.w);
    }

    @Override
    protected void a(aif $$02, bgb $$1) {
        Predicate<gu> $$3;
        if (!$$1.h_()) {
            return;
        }
        this.f = 0;
        this.g = $$02.V() + (long)$$02.y_().a(20);
        bqz $$2 = $$02.w();
        Set<Pair<he<brc>, gu>> $$4 = $$2.b($$0 -> $$0.a(brd.n), $$3 = $$0 -> {
            long $$1 = $$0.a();
            if (this.e.containsKey($$1)) {
                return false;
            }
            if (++this.f >= 5) {
                return false;
            }
            this.e.put($$1, this.g + 40L);
            return true;
        }, $$1.di(), 48, bqz.b.c).collect(Collectors.toSet());
        dxt $$5 = bhk.a($$1, $$4);
        if ($$5 != null && $$5.j()) {
            gu $$6 = $$5.m();
            Optional<he<brc>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
                $$1.dK().a(bpb.w, $$6);
            }
        } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0 -> $$0.getLongValue() < this.g);
        }
    }
}

