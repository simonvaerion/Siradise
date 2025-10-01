/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class aop
implements apt,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    private CompletableFuture<?> c = CompletableFuture.completedFuture(null);
    private final Executor d = $$1 -> {
        if (!this.e) {
            $$0.execute($$1);
        }
    };
    private volatile boolean e;

    public aop(Executor $$0) {
    }

    @Override
    public void append(apt.a $$02) {
        this.c = ((CompletableFuture)this.c.thenComposeAsync($$1 -> $$02.submit(this.d), this.d)).exceptionally($$0 -> {
            if ($$0 instanceof CompletionException) {
                CompletionException $$1 = (CompletionException)$$0;
                $$0 = $$1.getCause();
            }
            if ($$0 instanceof CancellationException) {
                CancellationException $$2 = (CancellationException)$$0;
                throw $$2;
            }
            b.error("Chain link failed, continuing to next one", $$0);
            return null;
        });
    }

    @Override
    public void close() {
        this.e = true;
    }
}

