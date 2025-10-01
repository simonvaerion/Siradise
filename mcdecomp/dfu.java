/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfu<T extends dfs> {
    private static final Logger a = LogUtils.getLogger();
    private final Int2ObjectMap<T> b = new Int2ObjectLinkedOpenHashMap();
    private final Map<UUID, T> c = Maps.newHashMap();

    public <U extends T> void a(dfz<T, U> $$0, anr<U> $$1) {
        for (dfs $$2 : this.b.values()) {
            dfs $$3 = (dfs)$$0.a($$2);
            if ($$3 == null || !$$1.accept($$3).a()) continue;
            return;
        }
    }

    public Iterable<T> a() {
        return Iterables.unmodifiableIterable((Iterable)this.b.values());
    }

    public void a(T $$0) {
        UUID $$1 = $$0.ct();
        if (this.c.containsKey($$1)) {
            a.warn("Duplicate entity UUID {}: {}", (Object)$$1, $$0);
            return;
        }
        this.c.put($$1, $$0);
        this.b.put($$0.af(), $$0);
    }

    public void b(T $$0) {
        this.c.remove($$0.ct());
        this.b.remove($$0.af());
    }

    @Nullable
    public T a(int $$0) {
        return (T)((dfs)this.b.get($$0));
    }

    @Nullable
    public T a(UUID $$0) {
        return (T)((dfs)this.c.get($$0));
    }

    public int b() {
        return this.c.size();
    }
}

