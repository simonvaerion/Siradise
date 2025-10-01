/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class bcn<R extends Runnable>
implements bbv,
bcp<R>,
Executor {
    private final String b;
    private static final Logger c = LogUtils.getLogger();
    private final Queue<R> d = Queues.newConcurrentLinkedQueue();
    private int e;

    protected bcn(String $$0) {
        this.b = $$0;
        bbt.a.a(this);
    }

    protected abstract R f(Runnable var1);

    protected abstract boolean e(R var1);

    public boolean bl() {
        return Thread.currentThread() == this.au();
    }

    protected abstract Thread au();

    protected boolean at() {
        return !this.bl();
    }

    public int bm() {
        return this.d.size();
    }

    @Override
    public String bn() {
        return this.b;
    }

    public <V> CompletableFuture<V> a(Supplier<V> $$0) {
        if (this.at()) {
            return CompletableFuture.supplyAsync($$0, this);
        }
        return CompletableFuture.completedFuture($$0.get());
    }

    private CompletableFuture<Void> a(Runnable $$0) {
        return CompletableFuture.supplyAsync(() -> {
            $$0.run();
            return null;
        }, this);
    }

    public CompletableFuture<Void> g(Runnable $$0) {
        if (this.at()) {
            return this.a($$0);
        }
        $$0.run();
        return CompletableFuture.completedFuture(null);
    }

    public void h(Runnable $$0) {
        if (!this.bl()) {
            this.a($$0).join();
        } else {
            $$0.run();
        }
    }

    public void i(R $$0) {
        this.d.add($$0);
        LockSupport.unpark(this.au());
    }

    @Override
    public void execute(Runnable $$0) {
        if (this.at()) {
            this.i(this.f($$0));
        } else {
            $$0.run();
        }
    }

    public void c(Runnable $$0) {
        this.execute($$0);
    }

    protected void bo() {
        this.d.clear();
    }

    protected void bp() {
        while (this.x()) {
        }
    }

    public boolean x() {
        Runnable $$0 = (Runnable)this.d.peek();
        if ($$0 == null) {
            return false;
        }
        if (this.e == 0 && !this.e($$0)) {
            return false;
        }
        this.d((Runnable)this.d.remove());
        return true;
    }

    public void c(BooleanSupplier $$0) {
        ++this.e;
        try {
            while (!$$0.getAsBoolean()) {
                if (this.x()) continue;
                this.bq();
            }
        }
        finally {
            --this.e;
        }
    }

    protected void bq() {
        Thread.yield();
        LockSupport.parkNanos("waiting for tasks", 100000L);
    }

    protected void d(R $$0) {
        try {
            $$0.run();
        }
        catch (Exception $$1) {
            c.error(LogUtils.FATAL_MARKER, "Error executing task on {}", (Object)this.bn(), (Object)$$1);
        }
    }

    @Override
    public List<bbs> bk() {
        return ImmutableList.of((Object)bbs.a(this.b + "-pending-tasks", bbr.b, this::bm));
    }

    @Override
    public /* synthetic */ void a(Object object) {
        this.i((Runnable)object);
    }
}

