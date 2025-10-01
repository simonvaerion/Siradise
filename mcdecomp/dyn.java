/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class dyn
extends dyj {
    public static final String a = "idcounts";
    private final Object2IntMap<String> b = new Object2IntOpenHashMap();

    public dyn() {
        this.b.defaultReturnValue(-1);
    }

    public static dyn b(qr $$0) {
        dyn $$1 = new dyn();
        for (String $$2 : $$0.e()) {
            if (!$$0.b($$2, 99)) continue;
            $$1.b.put((Object)$$2, $$0.h($$2));
        }
        return $$1;
    }

    @Override
    public qr a(qr $$0) {
        for (Object2IntMap.Entry $$1 : this.b.object2IntEntrySet()) {
            $$0.a((String)$$1.getKey(), $$1.getIntValue());
        }
        return $$0;
    }

    public int a() {
        int $$0 = this.b.getInt((Object)"map") + 1;
        this.b.put((Object)"map", $$0);
        this.b();
        return $$0;
    }
}

