/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.slf4j.Logger;

public class fzr {
    public static final fzr a = new fzr(Ticker.systemTicker());
    private static final Logger b = LogUtils.getLogger();
    private final Ticker c;
    private final Map<fzn<a>, Stopwatch> d = new HashMap<fzn<a>, Stopwatch>();
    private OptionalLong e = OptionalLong.empty();

    protected fzr(Ticker $$0) {
        this.c = $$0;
    }

    public synchronized void a(fzn<a> $$02) {
        this.a($$02, (fzn<a> $$0) -> Stopwatch.createStarted((Ticker)this.c));
    }

    public synchronized void a(fzn<a> $$0, Stopwatch $$12) {
        this.a($$0, (fzn<a> $$1) -> $$12);
    }

    private synchronized void a(fzn<a> $$0, Function<fzn<a>, Stopwatch> $$1) {
        this.d.computeIfAbsent($$0, $$1);
    }

    public synchronized void b(fzn<a> $$0) {
        Stopwatch $$1 = this.d.get($$0);
        if ($$1 == null) {
            b.warn("Attempted to end step for {} before starting it", (Object)$$0.b());
            return;
        }
        if ($$1.isRunning()) {
            $$1.stop();
        }
    }

    public void a(fzk $$02) {
        $$02.send(fzl.g, $$0 -> {
            fzr fzr2 = this;
            synchronized (fzr2) {
                this.d.forEach(($$1, $$2) -> {
                    if (!$$2.isRunning()) {
                        long $$3 = $$2.elapsed(TimeUnit.MILLISECONDS);
                        $$0.a($$1, new a((int)$$3));
                    } else {
                        b.warn("Measurement {} was discarded since it was still ongoing when the event {} was sent.", (Object)$$1.b(), (Object)fzl.g.a());
                    }
                });
                this.e.ifPresent($$1 -> $$0.a(fzn.B, new a((int)$$1)));
                this.d.clear();
            }
        });
    }

    public synchronized void a(long $$0) {
        this.e = OptionalLong.of($$0);
    }

    public static final class a
    extends Record {
        private final int b;
        public static final Codec<a> a = Codec.INT.xmap(a::new, $$0 -> $$0.b);

        public a(int $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "millis", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "millis", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "millis", "b"}, this, $$0);
        }

        public int a() {
            return this.b;
        }
    }
}

