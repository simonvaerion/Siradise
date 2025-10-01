/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@FunctionalInterface
public interface sr {
    public static final sr a = ($$0, $$1) -> CompletableFuture.completedFuture($$1);

    public CompletableFuture<sw> decorate(@Nullable aig var1, sw var2);
}

