/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddz {
    private static final Logger a = LogUtils.getLogger();
    private final dhy b;
    private final cno c;
    private final long d;
    private final long e;
    private final Map<dsa, List<dsx>> f = new Object2ObjectOpenHashMap();
    private final Map<dsu, CompletableFuture<List<clt>>> g = new Object2ObjectArrayMap();
    private boolean h;
    private final List<he<dsg>> i;

    public static ddz a(dhy $$0, long $$12, cno $$2, Stream<he<dsg>> $$3) {
        List<he<dsg>> $$4 = $$3.filter($$1 -> ddz.a((dsg)$$1.a(), $$2)).toList();
        return new ddz($$0, $$2, $$12, 0L, $$4);
    }

    public static ddz a(dhy $$0, long $$12, cno $$2, hg<dsg> $$3) {
        List<he<dsg>> $$4 = $$3.b().filter($$1 -> ddz.a((dsg)$$1.a(), $$2)).collect(Collectors.toUnmodifiableList());
        return new ddz($$0, $$2, $$12, $$12, $$4);
    }

    private static boolean a(dsg $$02, cno $$1) {
        Stream $$2 = $$02.a().stream().flatMap($$0 -> {
            dsa $$1 = $$0.a().a();
            return $$1.a().a();
        });
        return $$2.anyMatch($$1.c()::contains);
    }

    private ddz(dhy $$0, cno $$1, long $$2, long $$3, List<he<dsg>> $$4) {
        this.b = $$0;
        this.d = $$2;
        this.c = $$1;
        this.e = $$3;
        this.i = $$4;
    }

    public List<he<dsg>> a() {
        return this.i;
    }

    private void e() {
        Set<he<cnk>> $$0 = this.c.c();
        this.a().forEach($$1 -> {
            dsx $$6;
            dsg $$2 = (dsg)$$1.a();
            boolean $$3 = false;
            for (dsg.a $$4 : $$2.a()) {
                dsa $$5 = $$4.a().a();
                if (!$$5.a().a().anyMatch($$0::contains)) continue;
                this.f.computeIfAbsent($$5, $$0 -> new ArrayList()).add($$2.b());
                $$3 = true;
            }
            if ($$3 && ($$6 = $$2.b()) instanceof dsu) {
                dsu $$7 = (dsu)$$6;
                this.g.put($$7, this.a((he<dsg>)$$1, $$7));
            }
        });
    }

    private CompletableFuture<List<clt>> a(he<dsg> $$0, dsu $$1) {
        if ($$1.c() == 0) {
            return CompletableFuture.completedFuture(List.of());
        }
        Stopwatch $$22 = Stopwatch.createStarted((Ticker)ac.b);
        int $$3 = $$1.a();
        int $$4 = $$1.c();
        ArrayList<CompletableFuture<clt>> $$5 = new ArrayList<CompletableFuture<clt>>($$4);
        int $$6 = $$1.b();
        hi<cnk> $$7 = $$1.d();
        apf $$8 = apf.a();
        $$8.b(this.e);
        double $$9 = $$8.j() * Math.PI * 2.0;
        int $$10 = 0;
        int $$11 = 0;
        for (int $$12 = 0; $$12 < $$4; ++$$12) {
            double $$13 = (double)(4 * $$3 + $$3 * $$11 * 6) + ($$8.j() - 0.5) * ((double)$$3 * 2.5);
            int $$14 = (int)Math.round(Math.cos($$9) * $$13);
            int $$15 = (int)Math.round(Math.sin($$9) * $$13);
            apf $$16 = $$8.d();
            $$5.add(CompletableFuture.supplyAsync(() -> {
                Pair<gu, he<cnk>> $$4 = this.c.a(hx.a($$14, 8), 0, hx.a($$15, 8), 112, $$7::a, $$16, this.b.b());
                if ($$4 != null) {
                    gu $$5 = (gu)$$4.getFirst();
                    return new clt(hx.a($$5.u()), hx.a($$5.w()));
                }
                return new clt($$14, $$15);
            }, ac.f()));
            $$9 += Math.PI * 2 / (double)$$6;
            if (++$$10 != $$6) continue;
            $$10 = 0;
            $$6 += 2 * $$6 / (++$$11 + 1);
            $$6 = Math.min($$6, $$4 - $$12);
            $$9 += $$8.j() * Math.PI * 2.0;
        }
        return ((CompletableFuture)((Object)ac.b($$5))).thenApply($$2 -> {
            double $$3 = (double)$$22.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
            a.debug("Calculation for {} took {}s", (Object)$$0, (Object)$$3);
            return $$2;
        });
    }

    public void b() {
        if (!this.h) {
            this.e();
            this.h = true;
        }
    }

    @Nullable
    public List<clt> a(dsu $$0) {
        this.b();
        CompletableFuture<List<clt>> $$1 = this.g.get($$0);
        return $$1 != null ? $$1.join() : null;
    }

    public List<dsx> a(he<dsa> $$0) {
        this.b();
        return this.f.getOrDefault($$0.a(), List.of());
    }

    public dhy c() {
        return this.b;
    }

    public boolean a(he<dsg> $$0, int $$1, int $$2, int $$3) {
        dsx $$4 = $$0.a().b();
        for (int $$5 = $$1 - $$3; $$5 <= $$1 + $$3; ++$$5) {
            for (int $$6 = $$2 - $$3; $$6 <= $$2 + $$3; ++$$6) {
                if (!$$4.b(this, $$5, $$6)) continue;
                return true;
            }
        }
        return false;
    }

    public long d() {
        return this.d;
    }
}

