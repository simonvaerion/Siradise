/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class aks
extends ald<a> {
    private static final Logger c = LogUtils.getLogger();
    private final Stopwatch d = Stopwatch.createUnstarted();

    public aks(akx $$0, List<akr> $$12, Executor $$2, Executor $$32, CompletableFuture<apz> $$42) {
        super($$2, $$32, $$0, $$12, ($$1, $$22, $$3, $$4, $$52) -> {
            AtomicLong $$6 = new AtomicLong();
            AtomicLong $$7 = new AtomicLong();
            bag $$8 = new bag(ac.a, () -> 0, false);
            bag $$9 = new bag(ac.a, () -> 0, false);
            CompletableFuture<Void> $$10 = $$3.a($$1, $$22, $$8, $$9, $$2 -> $$4.execute(() -> {
                Runnable $$2 = ac.c();
                $$2.run();
                $$6.addAndGet(ac.c() - $$2);
            }), $$2 -> $$52.execute(() -> {
                Runnable $$2 = ac.c();
                $$2.run();
                $$7.addAndGet(ac.c() - $$2);
            }));
            return $$10.thenApplyAsync($$5 -> {
                c.debug("Finished reloading " + $$3.c());
                return new a($$3.c(), $$8.d(), $$9.d(), $$6, $$7);
            }, $$32);
        }, $$42);
        this.d.start();
        this.b = this.b.thenApplyAsync(this::a, $$32);
    }

    private List<a> a(List<a> $$0) {
        this.d.stop();
        long $$1 = 0L;
        c.info("Resource reload finished after {} ms", (Object)this.d.elapsed(TimeUnit.MILLISECONDS));
        for (a $$2 : $$0) {
            bam $$3 = $$2.b;
            bam $$4 = $$2.c;
            long $$5 = TimeUnit.NANOSECONDS.toMillis($$2.d.get());
            long $$6 = TimeUnit.NANOSECONDS.toMillis($$2.e.get());
            long $$7 = $$5 + $$6;
            String $$8 = $$2.a;
            c.info("{} took approximately {} ms ({} ms preparing, {} ms applying)", new Object[]{$$8, $$7, $$5, $$6});
            $$1 += $$6;
        }
        c.info("Total blocking time: {} ms", (Object)$$1);
        return $$0;
    }

    public static class a {
        final String a;
        final bam b;
        final bam c;
        final AtomicLong d;
        final AtomicLong e;

        a(String $$0, bam $$1, bam $$2, AtomicLong $$3, AtomicLong $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }
    }
}

