/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongConsumer
 */
import it.unimi.dsi.fastutil.longs.LongConsumer;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class hx
extends hz {
    public static final int a = 4;
    public static final int b = 16;
    public static final int c = 15;
    public static final int d = 8;
    public static final int e = 15;
    private static final int h = 22;
    private static final int i = 20;
    private static final int j = 22;
    private static final long k = 0x3FFFFFL;
    private static final long l = 1048575L;
    private static final long m = 0x3FFFFFL;
    private static final int n = 0;
    private static final int o = 20;
    private static final int p = 42;
    private static final int q = 8;
    private static final int r = 0;
    private static final int s = 4;

    hx(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    public static hx a(int $$0, int $$1, int $$2) {
        return new hx($$0, $$1, $$2);
    }

    public static hx a(gu $$0) {
        return new hx(hx.a($$0.u()), hx.a($$0.v()), hx.a($$0.w()));
    }

    public static hx a(clt $$0, int $$1) {
        return new hx($$0.e, $$1, $$0.f);
    }

    public static hx a(dfs $$0) {
        return hx.a($$0.di());
    }

    public static hx a(ho $$0) {
        return new hx(hx.b($$0.a()), hx.b($$0.b()), hx.b($$0.c()));
    }

    public static hx a(long $$0) {
        return new hx(hx.b($$0), hx.c($$0), hx.d($$0));
    }

    public static hx a(ddx $$0) {
        return hx.a($$0.f(), $$0.al());
    }

    public static long a(long $$0, ha $$1) {
        return hx.a($$0, $$1.j(), $$1.k(), $$1.l());
    }

    public static long a(long $$0, int $$1, int $$2, int $$3) {
        return hx.b(hx.b($$0) + $$1, hx.c($$0) + $$2, hx.d($$0) + $$3);
    }

    public static int a(double $$0) {
        return hx.a(apa.a($$0));
    }

    public static int a(int $$0) {
        return $$0 >> 4;
    }

    public static int b(double $$0) {
        return apa.a($$0) >> 4;
    }

    public static int b(int $$0) {
        return $$0 & 0xF;
    }

    public static short b(gu $$0) {
        int $$1 = hx.b($$0.u());
        int $$2 = hx.b($$0.v());
        int $$3 = hx.b($$0.w());
        return (short)($$1 << 8 | $$3 << 4 | $$2 << 0);
    }

    public static int a(short $$0) {
        return $$0 >>> 8 & 0xF;
    }

    public static int b(short $$0) {
        return $$0 >>> 0 & 0xF;
    }

    public static int c(short $$0) {
        return $$0 >>> 4 & 0xF;
    }

    public int d(short $$0) {
        return this.d() + hx.a($$0);
    }

    public int e(short $$0) {
        return this.e() + hx.b($$0);
    }

    public int f(short $$0) {
        return this.f() + hx.c($$0);
    }

    public gu g(short $$0) {
        return new gu(this.d($$0), this.e($$0), this.f($$0));
    }

    public static int c(int $$0) {
        return $$0 << 4;
    }

    public static int a(int $$0, int $$1) {
        return hx.c($$0) + $$1;
    }

    public static int b(long $$0) {
        return (int)($$0 << 0 >> 42);
    }

    public static int c(long $$0) {
        return (int)($$0 << 44 >> 44);
    }

    public static int d(long $$0) {
        return (int)($$0 << 22 >> 42);
    }

    public int a() {
        return this.u();
    }

    public int b() {
        return this.v();
    }

    public int c() {
        return this.w();
    }

    public int d() {
        return hx.c(this.a());
    }

    public int e() {
        return hx.c(this.b());
    }

    public int f() {
        return hx.c(this.c());
    }

    public int g() {
        return hx.a(this.a(), 15);
    }

    public int h() {
        return hx.a(this.b(), 15);
    }

    public int i() {
        return hx.a(this.c(), 15);
    }

    public static long e(long $$0) {
        return hx.b(hx.a(gu.a($$0)), hx.a(gu.b($$0)), hx.a(gu.c($$0)));
    }

    public static long b(int $$0, int $$1) {
        return hx.f(hx.b($$0, 0, $$1));
    }

    public static long f(long $$0) {
        return $$0 & 0xFFFFFFFFFFF00000L;
    }

    public gu j() {
        return new gu(hx.c(this.a()), hx.c(this.b()), hx.c(this.c()));
    }

    public gu q() {
        int $$0 = 8;
        return this.j().b(8, 8, 8);
    }

    public clt r() {
        return new clt(this.a(), this.c());
    }

    public static long c(gu $$0) {
        return hx.b(hx.a($$0.u()), hx.a($$0.v()), hx.a($$0.w()));
    }

    public static long b(int $$0, int $$1, int $$2) {
        long $$3 = 0L;
        $$3 |= ((long)$$0 & 0x3FFFFFL) << 42;
        $$3 |= ((long)$$1 & 0xFFFFFL) << 0;
        return $$3 |= ((long)$$2 & 0x3FFFFFL) << 20;
    }

    public long s() {
        return hx.b(this.a(), this.b(), this.c());
    }

    public hx d(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new hx(this.a() + $$0, this.b() + $$1, this.c() + $$2);
    }

    public Stream<gu> t() {
        return gu.a(this.d(), this.e(), this.f(), this.g(), this.h(), this.i());
    }

    public static Stream<hx> a(hx $$0, int $$1) {
        int $$2 = $$0.a();
        int $$3 = $$0.b();
        int $$4 = $$0.c();
        return hx.a($$2 - $$1, $$3 - $$1, $$4 - $$1, $$2 + $$1, $$3 + $$1, $$4 + $$1);
    }

    public static Stream<hx> a(clt $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$0.e;
        int $$5 = $$0.f;
        return hx.a($$4 - $$1, $$2, $$5 - $$1, $$4 + $$1, $$3 - 1, $$5 + $$1);
    }

    public static Stream<hx> a(final int $$0, final int $$1, final int $$2, final int $$3, final int $$4, final int $$5) {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<hx>((long)(($$3 - $$0 + 1) * ($$4 - $$1 + 1) * ($$5 - $$2 + 1)), 64){
            final gx a;
            {
                super($$02, $$12);
                this.a = new gx($$0, $$1, $$2, $$3, $$4, $$5);
            }

            @Override
            public boolean tryAdvance(Consumer<? super hx> $$02) {
                if (this.a.a()) {
                    $$02.accept(new hx(this.a.b(), this.a.c(), this.a.d()));
                    return true;
                }
                return false;
            }
        }, false);
    }

    public static void a(gu $$0, LongConsumer $$1) {
        hx.a($$0.u(), $$0.v(), $$0.w(), $$1);
    }

    public static void a(long $$0, LongConsumer $$1) {
        hx.a(gu.a($$0), gu.b($$0), gu.c($$0), $$1);
    }

    public static void a(int $$0, int $$1, int $$2, LongConsumer $$3) {
        int $$4 = hx.a($$0 - 1);
        int $$5 = hx.a($$0 + 1);
        int $$6 = hx.a($$1 - 1);
        int $$7 = hx.a($$1 + 1);
        int $$8 = hx.a($$2 - 1);
        int $$9 = hx.a($$2 + 1);
        if ($$4 == $$5 && $$6 == $$7 && $$8 == $$9) {
            $$3.accept(hx.b($$4, $$6, $$8));
        } else {
            for (int $$10 = $$4; $$10 <= $$5; ++$$10) {
                for (int $$11 = $$6; $$11 <= $$7; ++$$11) {
                    for (int $$12 = $$8; $$12 <= $$9; ++$$12) {
                        $$3.accept(hx.b($$10, $$11, $$12));
                    }
                }
            }
        }
    }

    @Override
    public /* synthetic */ hz c(int n2, int n3, int n4) {
        return this.d(n2, n3, n4);
    }
}

