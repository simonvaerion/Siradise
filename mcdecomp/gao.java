/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.RateLimiter
 */
import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class gao {
    private final float a;
    private final AtomicReference<a> b = new AtomicReference();

    public gao(Duration $$0) {
        this.a = 1000.0f / (float)$$0.toMillis();
    }

    public void a(enf $$0, sw $$12) {
        a $$2 = this.b.updateAndGet($$1 -> {
            if ($$1 == null || !$$12.equals($$1.a)) {
                return new a($$12, RateLimiter.create((double)this.a));
            }
            return $$1;
        });
        if ($$2.b.tryAcquire(1)) {
            $$0.c($$12);
        }
    }

    static class a {
        final sw a;
        final RateLimiter b;

        a(sw $$0, RateLimiter $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

