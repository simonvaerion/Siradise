/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dge<T extends dfs> {
    static final Logger a = LogUtils.getLogger();
    final dga<T> b;
    final dfu<T> c;
    final dfx<T> d;
    private final LongSet e = new LongOpenHashSet();
    private final dgb<T> f;

    public dge(Class<T> $$02, dga<T> $$1) {
        this.c = new dfu();
        this.d = new dfx<T>($$02, (Long2ObjectFunction<dgf>)((Long2ObjectFunction)$$0 -> this.e.contains($$0) ? dgf.c : dgf.b));
        this.b = $$1;
        this.f = new dgc<T>(this.c, this.d);
    }

    public void a(clt $$0) {
        long $$1 = $$0.a();
        this.e.add($$1);
        this.d.b($$1).forEach($$02 -> {
            dgf $$1 = $$02.a(dgf.c);
            if (!$$1.a()) {
                $$02.b().filter($$0 -> !$$0.dH()).forEach(this.b::e);
            }
        });
    }

    public void b(clt $$0) {
        long $$1 = $$0.a();
        this.e.remove($$1);
        this.d.b($$1).forEach($$02 -> {
            dgf $$1 = $$02.a(dgf.b);
            if ($$1.a()) {
                $$02.b().filter($$0 -> !$$0.dH()).forEach(this.b::d);
            }
        });
    }

    public dgb<T> a() {
        return this.f;
    }

    public void a(T $$0) {
        this.c.a($$0);
        long $$1 = hx.c($$0.di());
        dfw<T> $$2 = this.d.c($$1);
        $$2.a($$0);
        $$0.a(new a(this, $$0, $$1, $$2));
        this.b.g($$0);
        this.b.c($$0);
        if ($$0.dH() || $$2.c().a()) {
            this.b.e($$0);
        }
    }

    @aqa
    public int b() {
        return this.c.b();
    }

    void a(long $$0, dfw<T> $$1) {
        if ($$1.a()) {
            this.d.e($$0);
        }
    }

    @aqa
    public String c() {
        return this.c.b() + "," + this.d.b() + "," + this.e.size();
    }

    class a
    implements dft {
        private final T c;
        private long d;
        private dfw<T> e;
        final /* synthetic */ dge b;

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        a(T t2, long $$2, dfw<T> dfw2) {
            void var3_3;
            void $$0;
            this.b = (dge)l2;
            this.c = $$0;
            this.d = var3_3;
            this.e = (dfw)$$2;
        }

        @Override
        public void a() {
            gu $$0 = this.c.di();
            long $$1 = hx.c($$0);
            if ($$1 != this.d) {
                dgf $$2 = this.e.c();
                if (!this.e.b(this.c)) {
                    a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hx.a(this.d), $$1});
                }
                this.b.a(this.d, this.e);
                dfw $$3 = this.b.d.c($$1);
                $$3.a(this.c);
                this.e = $$3;
                this.d = $$1;
                this.b.b.a(this.c);
                if (!this.c.dH()) {
                    boolean $$4 = $$2.a();
                    boolean $$5 = $$3.c().a();
                    if ($$4 && !$$5) {
                        this.b.b.d(this.c);
                    } else if (!$$4 && $$5) {
                        this.b.b.e(this.c);
                    }
                }
            }
        }

        @Override
        public void a(bfj.c $$0) {
            dgf $$1;
            if (!this.e.b(this.c)) {
                a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hx.a(this.d), $$0});
            }
            if (($$1 = this.e.c()).a() || this.c.dH()) {
                this.b.b.d(this.c);
            }
            this.b.b.b(this.c);
            this.b.b.f(this.c);
            this.b.c.b(this.c);
            this.c.a(a);
            this.b.a(this.d, this.e);
        }
    }
}

