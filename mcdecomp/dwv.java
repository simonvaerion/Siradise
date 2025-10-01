/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class dwv<M extends dwp<M>, S extends dws<M>>
implements dwr {
    public static final int a = 15;
    protected static final int b = 1;
    protected static final long c = dwv$a.a(1);
    private static final int g = 512;
    protected static final ha[] d = ha.values();
    protected final del e;
    protected final S f;
    private final LongOpenHashSet h = new LongOpenHashSet(512, 0.5f);
    private final LongArrayFIFOQueue i = new LongArrayFIFOQueue();
    private final LongArrayFIFOQueue j = new LongArrayFIFOQueue();
    private final gu.a k = new gu.a();
    private static final int l = 2;
    private final long[] m = new long[2];
    private final dek[] n = new dek[2];

    protected dwv(del $$0, S $$1) {
        this.e = $$0;
        this.f = $$1;
        this.c();
    }

    public static boolean a(cls $$0, gu $$1, dcb $$2, dcb $$3) {
        if ($$3 == $$2) {
            return false;
        }
        return $$3.b($$0, $$1) != $$2.b($$0, $$1) || $$3.h() != $$2.h() || $$3.g() || $$2.g();
    }

    public static int a(cls $$0, dcb $$1, gu $$2, dcb $$3, gu $$4, ha $$5, int $$6) {
        efb $$10;
        boolean $$7 = dwv.a($$1);
        boolean $$8 = dwv.a($$3);
        if ($$7 && $$8) {
            return $$6;
        }
        efb $$9 = $$7 ? eey.a() : $$1.c($$0, $$2);
        efb efb2 = $$10 = $$8 ? eey.a() : $$3.c($$0, $$4);
        if (eey.b($$9, $$10, $$5)) {
            return 16;
        }
        return $$6;
    }

    public static efb a(cls $$0, gu $$1, dcb $$2, ha $$3) {
        return dwv.a($$2) ? eey.a() : $$2.a($$0, $$1, $$3);
    }

    protected static boolean a(dcb $$0) {
        return !$$0.p() || !$$0.g();
    }

    protected dcb c(gu $$0) {
        int $$2;
        int $$1 = hx.a($$0.u());
        dek $$3 = this.a($$1, $$2 = hx.a($$0.w()));
        if ($$3 == null) {
            return cpo.F.n();
        }
        return $$3.a_($$0);
    }

    protected int a(dcb $$0, gu $$1) {
        return Math.max(1, $$0.b(this.e.q(), $$1));
    }

    protected boolean a(long $$0, dcb $$1, long $$2, dcb $$3, ha $$4) {
        efb $$5 = this.a($$1, $$0, $$4);
        efb $$6 = this.a($$3, $$2, $$4.g());
        return eey.b($$5, $$6);
    }

    protected efb a(dcb $$0, long $$1, ha $$2) {
        return dwv.a(this.e.q(), (gu)this.k.f($$1), $$0, $$2);
    }

    @Nullable
    protected dek a(int $$0, int $$1) {
        long $$2 = clt.c($$0, $$1);
        for (int $$3 = 0; $$3 < 2; ++$$3) {
            if ($$2 != this.m[$$3]) continue;
            return this.n[$$3];
        }
        dek $$4 = this.e.c($$0, $$1);
        for (int $$5 = 1; $$5 > 0; --$$5) {
            this.m[$$5] = this.m[$$5 - 1];
            this.n[$$5] = this.n[$$5 - 1];
        }
        this.m[0] = $$2;
        this.n[0] = $$4;
        return $$4;
    }

    private void c() {
        Arrays.fill(this.m, clt.a);
        Arrays.fill(this.n, null);
    }

    @Override
    public void a(gu $$0) {
        this.h.add($$0.a());
    }

    public void a(long $$0, @Nullable ded $$1) {
        ((dws)this.f).a($$0, $$1);
    }

    public void b(clt $$0, boolean $$1) {
        ((dws)this.f).c(hx.b($$0.e, $$0.f), $$1);
    }

    @Override
    public void a(hx $$0, boolean $$1) {
        ((dws)this.f).d($$0.s(), $$1);
    }

    @Override
    public void a(clt $$0, boolean $$1) {
        ((dws)this.f).b(hx.b($$0.e, $$0.f), $$1);
    }

    @Override
    public int a() {
        LongIterator $$0 = this.h.iterator();
        while ($$0.hasNext()) {
            this.a($$0.nextLong());
        }
        this.h.clear();
        this.h.trim(512);
        int $$1 = 0;
        $$1 += this.e();
        this.c();
        ((dws)this.f).a(this);
        ((dws)this.f).b();
        return $$1 += this.d();
    }

    private int d() {
        int $$0 = 0;
        while (!this.j.isEmpty()) {
            long $$1 = this.j.dequeueLong();
            long $$2 = this.j.dequeueLong();
            int $$3 = ((dws)this.f).e($$1);
            int $$4 = dwv$a.a($$2);
            if (dwv$a.c($$2) && $$3 < $$4) {
                ((dws)this.f).a($$1, $$4);
                $$3 = $$4;
            }
            if ($$3 == $$4) {
                this.a($$1, $$2, $$3);
            }
            ++$$0;
        }
        return $$0;
    }

    private int e() {
        int $$0 = 0;
        while (!this.i.isEmpty()) {
            long $$1 = this.i.dequeueLong();
            long $$2 = this.i.dequeueLong();
            this.a($$1, $$2);
            ++$$0;
        }
        return $$0;
    }

    protected void b(long $$0, long $$1) {
        this.i.enqueue($$0);
        this.i.enqueue($$1);
    }

    protected void c(long $$0, long $$1) {
        this.j.enqueue($$0);
        this.j.enqueue($$1);
    }

    @Override
    public boolean E_() {
        return ((dws)this.f).a() || !this.h.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty();
    }

    @Override
    @Nullable
    public ded a(hx $$0) {
        return ((dws)this.f).d($$0.s());
    }

    @Override
    public int b(gu $$0) {
        return ((dws)this.f).a($$0.a());
    }

    public String b(long $$0) {
        return this.c($$0).a();
    }

    public dws.b c(long $$0) {
        return ((dws)this.f).k($$0);
    }

    protected abstract void a(long var1);

    protected abstract void a(long var1, long var3, int var5);

    protected abstract void a(long var1, long var3);

    public static class a {
        private static final int a = 4;
        private static final int b = 6;
        private static final long c = 15L;
        private static final long d = 1008L;
        private static final long e = 1024L;
        private static final long f = 2048L;

        public static long a(int $$0, ha $$1) {
            long $$2 = dwv$a.c(1008L, $$1);
            return dwv$a.a($$2, $$0);
        }

        public static long a(int $$0) {
            return dwv$a.a(1008L, $$0);
        }

        public static long a(int $$0, boolean $$1) {
            long $$2 = 1008L;
            $$2 |= 0x800L;
            if ($$1) {
                $$2 |= 0x400L;
            }
            return dwv$a.a($$2, $$0);
        }

        public static long a(int $$0, boolean $$1, ha $$2) {
            long $$3 = dwv$a.c(1008L, $$2);
            if ($$1) {
                $$3 |= 0x400L;
            }
            return dwv$a.a($$3, $$0);
        }

        public static long b(int $$0, boolean $$1, ha $$2) {
            long $$3 = 0L;
            if ($$1) {
                $$3 |= 0x400L;
            }
            $$3 = dwv$a.b($$3, $$2);
            return dwv$a.a($$3, $$0);
        }

        public static long a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
            long $$5 = dwv$a.a(0L, 15);
            if ($$0) {
                $$5 = dwv$a.b($$5, ha.a);
            }
            if ($$1) {
                $$5 = dwv$a.b($$5, ha.c);
            }
            if ($$2) {
                $$5 = dwv$a.b($$5, ha.d);
            }
            if ($$3) {
                $$5 = dwv$a.b($$5, ha.e);
            }
            if ($$4) {
                $$5 = dwv$a.b($$5, ha.f);
            }
            return $$5;
        }

        public static int a(long $$0) {
            return (int)($$0 & 0xFL);
        }

        public static boolean b(long $$0) {
            return ($$0 & 0x400L) != 0L;
        }

        public static boolean c(long $$0) {
            return ($$0 & 0x800L) != 0L;
        }

        public static boolean a(long $$0, ha $$1) {
            return ($$0 & 1L << $$1.ordinal() + 4) != 0L;
        }

        private static long a(long $$0, int $$1) {
            return $$0 & 0xFFFFFFFFFFFFFFF0L | (long)$$1 & 0xFL;
        }

        private static long b(long $$0, ha $$1) {
            return $$0 | 1L << $$1.ordinal() + 4;
        }

        private static long c(long $$0, ha $$1) {
            return $$0 & (1L << $$1.ordinal() + 4 ^ 0xFFFFFFFFFFFFFFFFL);
        }
    }
}

