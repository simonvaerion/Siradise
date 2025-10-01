/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

@FunctionalInterface
public interface apt {
    public static final Logger a = LogUtils.getLogger();

    public static apt immediate(Executor $$0) {
        return $$1 -> $$1.submit($$0).exceptionally($$0 -> {
            a.error("Task failed", $$0);
            return null;
        });
    }

    public void append(a var1);

    public static interface a {
        public CompletableFuture<?> submit(Executor var1);
    }
}

