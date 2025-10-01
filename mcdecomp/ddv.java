/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ddv
implements AutoCloseable {
    private final cmn a;
    private final Long2ObjectMap<dej> b = new Long2ObjectOpenHashMap();
    @Nullable
    private dej c;
    private long d;

    public ddv(cmn $$0) {
        this.a = $$0;
    }

    @Nullable
    public dej a(gu $$0) {
        int $$1 = this.a.e($$0.v());
        if ($$1 < 0 || $$1 >= this.a.ak()) {
            return null;
        }
        long $$22 = hx.c($$0);
        if (this.c == null || this.d != $$22) {
            this.c = (dej)this.b.computeIfAbsent($$22, $$2 -> {
                ddx $$3 = this.a.a(hx.a($$0.u()), hx.a($$0.w()));
                dej $$4 = $$3.b($$1);
                $$4.a();
                return $$4;
            });
            this.d = $$22;
        }
        return this.c;
    }

    public dcb b(gu $$0) {
        dej $$1 = this.a($$0);
        if ($$1 == null) {
            return cpo.a.n();
        }
        int $$2 = hx.b($$0.u());
        int $$3 = hx.b($$0.v());
        int $$4 = hx.b($$0.w());
        return $$1.a($$2, $$3, $$4);
    }

    @Override
    public void close() {
        for (dej $$0 : this.b.values()) {
            $$0.b();
        }
    }
}

