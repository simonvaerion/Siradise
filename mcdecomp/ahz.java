/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ahz {
    private final Object2BooleanMap<aig> a = new Object2BooleanOpenHashMap();

    public Set<aig> a(long $$0) {
        return this.a.keySet();
    }

    public void a(long $$0, aig $$1, boolean $$2) {
        this.a.put((Object)$$1, $$2);
    }

    public void a(long $$0, aig $$1) {
        this.a.removeBoolean((Object)$$1);
    }

    public void a(aig $$0) {
        this.a.replace((Object)$$0, true);
    }

    public void b(aig $$0) {
        this.a.replace((Object)$$0, false);
    }

    public boolean c(aig $$0) {
        return this.a.getOrDefault((Object)$$0, true);
    }

    public boolean d(aig $$0) {
        return this.a.getBoolean((Object)$$0);
    }

    public void a(long $$0, long $$1, aig $$2) {
    }
}

