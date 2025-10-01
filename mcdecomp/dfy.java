/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dfy {
    private Int2ObjectMap<bfj> a = new Int2ObjectLinkedOpenHashMap();
    private Int2ObjectMap<bfj> b = new Int2ObjectLinkedOpenHashMap();
    @Nullable
    private Int2ObjectMap<bfj> c;

    private void a() {
        if (this.c == this.a) {
            this.b.clear();
            for (Int2ObjectMap.Entry $$0 : Int2ObjectMaps.fastIterable(this.a)) {
                this.b.put($$0.getIntKey(), (Object)((bfj)$$0.getValue()));
            }
            Int2ObjectMap<bfj> $$1 = this.a;
            this.a = this.b;
            this.b = $$1;
        }
    }

    public void a(bfj $$0) {
        this.a();
        this.a.put($$0.af(), (Object)$$0);
    }

    public void b(bfj $$0) {
        this.a();
        this.a.remove($$0.af());
    }

    public boolean c(bfj $$0) {
        return this.a.containsKey($$0.af());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Consumer<bfj> $$0) {
        if (this.c != null) {
            throw new UnsupportedOperationException("Only one concurrent iteration supported");
        }
        this.c = this.a;
        try {
            for (bfj $$1 : this.a.values()) {
                $$0.accept($$1);
            }
        }
        finally {
            this.c = null;
        }
    }
}

