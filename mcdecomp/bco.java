/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

public class bco
implements ThreadFactory {
    private static final Logger a = LogUtils.getLogger();
    private final ThreadGroup b;
    private final AtomicInteger c = new AtomicInteger(1);
    private final String d;

    public bco(String $$0) {
        SecurityManager $$1 = System.getSecurityManager();
        this.b = $$1 != null ? $$1.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.d = $$0 + "-";
    }

    @Override
    public Thread newThread(Runnable $$0) {
        Thread $$12 = new Thread(this.b, $$0, this.d + this.c.getAndIncrement(), 0L);
        $$12.setUncaughtExceptionHandler(($$1, $$2) -> {
            a.error("Caught exception in thread {} from {}", (Object)$$1, (Object)$$0);
            a.error("", $$2);
        });
        if ($$12.getPriority() != 5) {
            $$12.setPriority(5);
        }
        return $$12;
    }
}

