/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dgb<T extends dfs> {
    @Nullable
    public T a(int var1);

    @Nullable
    public T a(UUID var1);

    public Iterable<T> a();

    public <U extends T> void a(dfz<T, U> var1, anr<U> var2);

    public void a(eed var1, Consumer<T> var2);

    public <U extends T> void a(dfz<T, U> var1, eed var2, anr<U> var3);
}

