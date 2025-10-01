/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dwy
extends dws<a> {
    protected dwy(del $$0) {
        super(cmv.a, $$0, new a((Long2ObjectOpenHashMap<ded>)new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
    }

    @Override
    protected int a(long $$0) {
        return this.e($$0, false);
    }

    protected int e(long $$0, boolean $$1) {
        long $$2 = hx.e($$0);
        int $$3 = hx.c($$2);
        a $$4 = $$1 ? (a)this.d : (a)this.c;
        int $$5 = $$4.c.get(hx.f($$2));
        if ($$5 == $$4.b || $$3 >= $$5) {
            if ($$1 && !this.j($$2)) {
                return 0;
            }
            return 15;
        }
        ded $$6 = this.a($$4, $$2);
        if ($$6 == null) {
            $$0 = gu.e($$0);
            while ($$6 == null) {
                if (++$$3 >= $$5) {
                    return 15;
                }
                $$2 = hx.a($$2, ha.b);
                $$6 = this.a($$4, $$2);
            }
        }
        return $$6.a(hx.b(gu.a($$0)), hx.b(gu.b($$0)), hx.b(gu.c($$0)));
    }

    @Override
    protected void h(long $$0) {
        long $$2;
        int $$3;
        int $$1 = hx.c($$0);
        if (((a)this.d).b > $$1) {
            ((a)this.d).b = $$1;
            ((a)this.d).c.defaultReturnValue(((a)this.d).b);
        }
        if (($$3 = ((a)this.d).c.get($$2 = hx.f($$0))) < $$1 + 1) {
            ((a)this.d).c.put($$2, $$1 + 1);
        }
    }

    @Override
    protected void i(long $$0) {
        long $$1 = hx.f($$0);
        int $$2 = hx.c($$0);
        if (((a)this.d).c.get($$1) == $$2 + 1) {
            long $$3 = $$0;
            while (!this.b($$3) && this.a($$2)) {
                --$$2;
                $$3 = hx.a($$3, ha.a);
            }
            if (this.b($$3)) {
                ((a)this.d).c.put($$1, $$2 + 1);
            } else {
                ((a)this.d).c.remove($$1);
            }
        }
    }

    @Override
    protected ded g(long $$0) {
        ded $$4;
        ded $$1 = (ded)this.g.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        int $$2 = ((a)this.d).c.get(hx.f($$0));
        if ($$2 == ((a)this.d).b || hx.c($$0) >= $$2) {
            if (this.j($$0)) {
                return new ded(15);
            }
            return new ded();
        }
        long $$3 = hx.a($$0, ha.b);
        while (($$4 = this.a($$3, true)) == null) {
            $$3 = hx.a($$3, ha.b);
        }
        return dwy.a($$4);
    }

    private static ded a(ded $$0) {
        if ($$0.c()) {
            return $$0.b();
        }
        byte[] $$1 = $$0.a();
        byte[] $$2 = new byte[2048];
        for (int $$3 = 0; $$3 < 16; ++$$3) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
        }
        return new ded($$2);
    }

    protected boolean a(int $$0) {
        return $$0 >= ((a)this.d).b;
    }

    protected boolean l(long $$0) {
        long $$1 = hx.f($$0);
        int $$2 = ((a)this.d).c.get($$1);
        return $$2 == ((a)this.d).b || hx.c($$0) >= $$2;
    }

    protected int m(long $$0) {
        return ((a)this.d).c.get($$0);
    }

    protected int c() {
        return ((a)this.d).b;
    }

    protected static final class a
    extends dwp<a> {
        int b;
        final Long2IntOpenHashMap c;

        public a(Long2ObjectOpenHashMap<ded> $$0, Long2IntOpenHashMap $$1, int $$2) {
            super($$0);
            this.c = $$1;
            $$1.defaultReturnValue($$2);
            this.b = $$2;
        }

        public a a() {
            return new a((Long2ObjectOpenHashMap<ded>)this.a.clone(), this.c.clone(), this.b);
        }

        @Override
        public /* synthetic */ dwp b() {
            return this.a();
        }
    }
}

