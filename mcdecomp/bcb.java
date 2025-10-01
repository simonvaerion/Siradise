/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.slf4j.Logger
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class bcb
implements bbu {
    private static final Logger a = LogUtils.getLogger();
    private final Set<bbs> b = new ObjectOpenHashSet();
    private final bca c = new bca();

    public bcb(LongSupplier $$0, boolean $$1) {
        this.b.add(bcb.a($$0));
        if ($$1) {
            this.b.addAll(bcb.a());
        }
    }

    public static Set<bbs> a() {
        ImmutableSet.Builder $$0 = ImmutableSet.builder();
        try {
            a $$12 = new a();
            IntStream.range(0, $$12.a).mapToObj($$1 -> bbs.a("cpu#" + $$1, bbr.h, () -> $$12.a($$1))).forEach(arg_0 -> ((ImmutableSet.Builder)$$0).add(arg_0));
        }
        catch (Throwable $$2) {
            a.warn("Failed to query cpu, no cpu stats will be recorded", $$2);
        }
        $$0.add((Object)bbs.a("heap MiB", bbr.e, () -> (float)(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576.0f));
        $$0.addAll(bbt.a.a());
        return $$0.build();
    }

    @Override
    public Set<bbs> a(Supplier<bal> $$0) {
        this.b.addAll(this.c.a($$0));
        return this.b;
    }

    public static bbs a(final LongSupplier $$02) {
        Stopwatch $$1 = Stopwatch.createUnstarted((Ticker)new Ticker(){

            public long read() {
                return $$02.getAsLong();
            }
        });
        ToDoubleFunction<Stopwatch> $$2 = $$0 -> {
            if ($$0.isRunning()) {
                $$0.stop();
            }
            long $$1 = $$0.elapsed(TimeUnit.NANOSECONDS);
            $$0.reset();
            return $$1;
        };
        bbs.d $$3 = new bbs.d(2.0f);
        return bbs.a("ticktime", bbr.d, $$2, $$1).a(Stopwatch::start).a($$3).a();
    }

    static class a {
        private final SystemInfo b = new SystemInfo();
        private final CentralProcessor c = this.b.getHardware().getProcessor();
        public final int a = this.c.getLogicalProcessorCount();
        private long[][] d = this.c.getProcessorCpuLoadTicks();
        private double[] e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
        private long f;

        a() {
        }

        public double a(int $$0) {
            long $$1 = System.currentTimeMillis();
            if (this.f == 0L || this.f + 501L < $$1) {
                this.e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
                this.d = this.c.getProcessorCpuLoadTicks();
                this.f = $$1;
            }
            return this.e[$$0] * 100.0;
        }
    }
}

