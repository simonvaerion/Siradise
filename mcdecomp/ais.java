/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ais
implements aio {
    private final aiq a;
    private final Long2ObjectOpenHashMap<dec> b;
    private clt c = new clt(0, 0);
    private final int d;
    private final int e;
    private final int f;
    private boolean g;

    public ais(int $$0) {
        this.a = new aiq($$0);
        this.d = $$0 * 2 + 1;
        this.e = $$0 + dec.b();
        this.f = this.e * 2 + 1;
        this.b = new Long2ObjectOpenHashMap();
    }

    @Override
    public void a(clt $$0) {
        if (!this.g) {
            return;
        }
        this.a.a($$0);
        this.c = $$0;
    }

    @Override
    public void a(clt $$0, @Nullable dec $$1) {
        if (!this.g) {
            return;
        }
        this.a.a($$0, $$1);
        if ($$1 == null) {
            this.b.remove($$0.a());
        } else {
            this.b.put($$0.a(), (Object)$$1);
        }
    }

    @Override
    public void a() {
        this.g = true;
        this.b.clear();
        this.a.a();
    }

    @Override
    public void b() {
        this.g = false;
        this.a.b();
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.a.c();
    }

    @Nullable
    public dec a(int $$0, int $$1) {
        return (dec)this.b.get(clt.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
    }
}

