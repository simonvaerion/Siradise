/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class ams {
    protected final Object2IntMap<amo<?>> a = Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap());

    public ams() {
        this.a.defaultReturnValue(0);
    }

    public void b(byo $$0, amo<?> $$1, int $$2) {
        int $$3 = (int)Math.min((long)this.a($$1) + (long)$$2, Integer.MAX_VALUE);
        this.a($$0, $$1, $$3);
    }

    public void a(byo $$0, amo<?> $$1, int $$2) {
        this.a.put($$1, $$2);
    }

    public <T> int a(amq<T> $$0, T $$1) {
        return $$0.a($$1) ? this.a($$0.b($$1)) : 0;
    }

    public int a(amo<?> $$0) {
        return this.a.getInt($$0);
    }
}

