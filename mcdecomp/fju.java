/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class fju {
    public final Int2ObjectMap<fwy> a = new Int2ObjectOpenHashMap(256);
    private final Int2ObjectMap<fwr> b = new Int2ObjectOpenHashMap(256);
    private final fwx c;

    public fju(fwx $$0) {
        this.c = $$0;
    }

    public fwr a(cfz $$0) {
        fwr $$1 = this.a($$0.d());
        return $$1 == null ? this.c.a() : $$1;
    }

    @Nullable
    public fwr a(cfu $$0) {
        return (fwr)this.b.get(fju.b($$0));
    }

    private static int b(cfu $$0) {
        return cfu.a($$0);
    }

    public void a(cfu $$0, fwy $$1) {
        this.a.put(fju.b($$0), (Object)$$1);
    }

    public fwx a() {
        return this.c;
    }

    public void b() {
        this.b.clear();
        for (Map.Entry $$0 : this.a.entrySet()) {
            this.b.put((Integer)$$0.getKey(), (Object)this.c.a((fwy)$$0.getValue()));
        }
    }
}

