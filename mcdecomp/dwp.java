/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public abstract class dwp<M extends dwp<M>> {
    private static final int b = 2;
    private final long[] c = new long[2];
    private final ded[] d = new ded[2];
    private boolean e;
    protected final Long2ObjectOpenHashMap<ded> a;

    protected dwp(Long2ObjectOpenHashMap<ded> $$0) {
        this.a = $$0;
        this.c();
        this.e = true;
    }

    public abstract M b();

    public ded a(long $$0) {
        ded $$1 = ((ded)this.a.get($$0)).b();
        this.a.put($$0, (Object)$$1);
        this.c();
        return $$1;
    }

    public boolean b(long $$0) {
        return this.a.containsKey($$0);
    }

    @Nullable
    public ded c(long $$0) {
        ded $$2;
        if (this.e) {
            for (int $$1 = 0; $$1 < 2; ++$$1) {
                if ($$0 != this.c[$$1]) continue;
                return this.d[$$1];
            }
        }
        if (($$2 = (ded)this.a.get($$0)) != null) {
            if (this.e) {
                for (int $$3 = 1; $$3 > 0; --$$3) {
                    this.c[$$3] = this.c[$$3 - 1];
                    this.d[$$3] = this.d[$$3 - 1];
                }
                this.c[0] = $$0;
                this.d[0] = $$2;
            }
            return $$2;
        }
        return null;
    }

    @Nullable
    public ded d(long $$0) {
        return (ded)this.a.remove($$0);
    }

    public void a(long $$0, ded $$1) {
        this.a.put($$0, (Object)$$1);
    }

    public void c() {
        for (int $$0 = 0; $$0 < 2; ++$$0) {
            this.c[$$0] = Long.MAX_VALUE;
            this.d[$$0] = null;
        }
    }

    public void d() {
        this.e = false;
    }
}

