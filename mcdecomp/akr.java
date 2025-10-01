/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface akr {
    public CompletableFuture<Void> a(a var1, akx var2, ban var3, ban var4, Executor var5, Executor var6);

    default public String c() {
        return this.getClass().getSimpleName();
    }

    public static interface a {
        public <T> CompletableFuture<T> a(T var1);
    }
}

