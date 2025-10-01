/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dfv<T>
extends AutoCloseable {
    public CompletableFuture<dfq<T>> a(clt var1);

    public void a(dfq<T> var1);

    public void a(boolean var1);

    @Override
    default public void close() throws IOException {
    }
}

