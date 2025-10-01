/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  javax.annotation.concurrent.Immutable
 *  org.apache.commons.lang3.Validate
 *  org.apache.commons.lang3.tuple.Pair
 *  org.slf4j.Logger
 */
import com.google.common.collect.AbstractIterator;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

@Immutable
public class gu
extends hz {
    public static final Codec<gu> a = Codec.INT_STREAM.comapFlatMap($$02 -> ac.a($$02, 3).map($$0 -> new gu($$0[0], $$0[1], $$0[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w())).stable();
    private static final Logger d = LogUtils.getLogger();
    public static final gu b = new gu(0, 0, 0);
    private static final int e;
    private static final int h;
    public static final int c;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final int l = 0;
    private static final int m;
    private static final int n;

    public gu(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    public gu(hz $$0) {
        this($$0.u(), $$0.v(), $$0.w());
    }

    public static long a(long $$0, ha $$1) {
        return gu.a($$0, $$1.j(), $$1.k(), $$1.l());
    }

    public static long a(long $$0, int $$1, int $$2, int $$3) {
        return gu.a(gu.a($$0) + $$1, gu.b($$0) + $$2, gu.c($$0) + $$3);
    }

    public static int a(long $$0) {
        return (int)($$0 << 64 - n - e >> 64 - e);
    }

    public static int b(long $$0) {
        return (int)($$0 << 64 - c >> 64 - c);
    }

    public static int c(long $$0) {
        return (int)($$0 << 64 - m - h >> 64 - h);
    }

    public static gu d(long $$0) {
        return new gu(gu.a($$0), gu.b($$0), gu.c($$0));
    }

    public static gu a(double $$0, double $$1, double $$2) {
        return new gu(apa.a($$0), apa.a($$1), apa.a($$2));
    }

    public static gu a(ho $$0) {
        return gu.a($$0.a(), $$0.b(), $$0.c());
    }

    public long a() {
        return gu.a(this.u(), this.v(), this.w());
    }

    public static long a(int $$0, int $$1, int $$2) {
        long $$3 = 0L;
        $$3 |= ((long)$$0 & i) << n;
        $$3 |= ((long)$$1 & j) << 0;
        return $$3 |= ((long)$$2 & k) << m;
    }

    public static long e(long $$0) {
        return $$0 & 0xFFFFFFFFFFFFFFF0L;
    }

    public gu b(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new gu(this.u() + $$0, this.v() + $$1, this.w() + $$2);
    }

    public eei b() {
        return eei.b(this);
    }

    public gu a(hz $$0) {
        return this.b($$0.u(), $$0.v(), $$0.w());
    }

    public gu b(hz $$0) {
        return this.b(-$$0.u(), -$$0.v(), -$$0.w());
    }

    public gu a(int $$0) {
        if ($$0 == 1) {
            return this;
        }
        if ($$0 == 0) {
            return b;
        }
        return new gu(this.u() * $$0, this.v() * $$0, this.w() * $$0);
    }

    public gu c() {
        return this.a(ha.b);
    }

    public gu b(int $$0) {
        return this.a(ha.b, $$0);
    }

    public gu d() {
        return this.a(ha.a);
    }

    public gu c(int $$0) {
        return this.a(ha.a, $$0);
    }

    public gu e() {
        return this.a(ha.c);
    }

    public gu d(int $$0) {
        return this.a(ha.c, $$0);
    }

    public gu f() {
        return this.a(ha.d);
    }

    public gu e(int $$0) {
        return this.a(ha.d, $$0);
    }

    public gu g() {
        return this.a(ha.e);
    }

    public gu f(int $$0) {
        return this.a(ha.e, $$0);
    }

    public gu h() {
        return this.a(ha.f);
    }

    public gu g(int $$0) {
        return this.a(ha.f, $$0);
    }

    public gu a(ha $$0) {
        return new gu(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
    }

    public gu a(ha $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        return new gu(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
    }

    public gu a(ha.a $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        int $$2 = $$0 == ha.a.a ? $$1 : 0;
        int $$3 = $$0 == ha.a.b ? $$1 : 0;
        int $$4 = $$0 == ha.a.c ? $$1 : 0;
        return new gu(this.u() + $$2, this.v() + $$3, this.w() + $$4);
    }

    public gu a(cvz $$0) {
        switch ($$0) {
            default: {
                return this;
            }
            case b: {
                return new gu(-this.w(), this.v(), this.u());
            }
            case c: {
                return new gu(-this.u(), this.v(), -this.w());
            }
            case d: 
        }
        return new gu(this.w(), this.v(), -this.u());
    }

    public gu c(hz $$0) {
        return new gu(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
    }

    public gu h(int $$0) {
        return new gu(this.u(), $$0, this.w());
    }

    public gu i() {
        return this;
    }

    public a j() {
        return new a(this.u(), this.v(), this.w());
    }

    public static Iterable<gu> a(apf $$0, int $$1, gu $$2, int $$3) {
        return gu.a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
    }

    @Deprecated
    public static Stream<gu> a(gu $$0) {
        return Stream.of($$0, $$0.f(), $$0.h(), $$0.f().h());
    }

    public static Iterable<gu> a(final apf $$0, final int $$1, final int $$2, final int $$3, final int $$4, int $$5, int $$6, int $$7) {
        final int $$8 = $$5 - $$2 + 1;
        final int $$9 = $$6 - $$3 + 1;
        final int $$10 = $$7 - $$4 + 1;
        return () -> new AbstractIterator<gu>(){
            final a a = new a();
            int b = $$1;

            protected gu a() {
                if (this.b <= 0) {
                    return (gu)this.endOfData();
                }
                a $$02 = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
                --this.b;
                return $$02;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Iterable<gu> a(gu $$0, final int $$1, final int $$2, final int $$3) {
        final int $$4 = $$1 + $$2 + $$3;
        final int $$5 = $$0.u();
        final int $$6 = $$0.v();
        final int $$7 = $$0.w();
        return () -> new AbstractIterator<gu>(){
            private final a h = new a();
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private boolean n;

            protected gu a() {
                if (this.n) {
                    this.n = false;
                    this.h.r($$7 - (this.h.w() - $$7));
                    return this.h;
                }
                a $$0 = null;
                while ($$0 == null) {
                    if (this.m > this.k) {
                        ++this.l;
                        if (this.l > this.j) {
                            ++this.i;
                            if (this.i > $$4) {
                                return (gu)this.endOfData();
                            }
                            this.j = Math.min($$1, this.i);
                            this.l = -this.j;
                        }
                        this.k = Math.min($$2, this.i - Math.abs(this.l));
                        this.m = -this.k;
                    }
                    int $$12 = this.l;
                    int $$22 = this.m;
                    int $$32 = this.i - Math.abs($$12) - Math.abs($$22);
                    if ($$32 <= $$3) {
                        this.n = $$32 != 0;
                        $$0 = this.h.d($$5 + $$12, $$6 + $$22, $$7 + $$32);
                    }
                    ++this.m;
                }
                return $$0;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Optional<gu> a(gu $$0, int $$1, int $$2, Predicate<gu> $$3) {
        for (gu $$4 : gu.a($$0, $$1, $$2, $$1)) {
            if (!$$3.test($$4)) continue;
            return Optional.of($$4);
        }
        return Optional.empty();
    }

    public static Stream<gu> b(gu $$0, int $$1, int $$2, int $$3) {
        return StreamSupport.stream(gu.a($$0, $$1, $$2, $$3).spliterator(), false);
    }

    public static Iterable<gu> a(gu $$0, gu $$1) {
        return gu.b(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()), Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
    }

    public static Stream<gu> b(gu $$0, gu $$1) {
        return StreamSupport.stream(gu.a($$0, $$1).spliterator(), false);
    }

    public static Stream<gu> a(drs $$0) {
        return gu.a(Math.min($$0.g(), $$0.j()), Math.min($$0.h(), $$0.k()), Math.min($$0.i(), $$0.l()), Math.max($$0.g(), $$0.j()), Math.max($$0.h(), $$0.k()), Math.max($$0.i(), $$0.l()));
    }

    public static Stream<gu> a(eed $$0) {
        return gu.a(apa.a($$0.a), apa.a($$0.b), apa.a($$0.c), apa.a($$0.d), apa.a($$0.e), apa.a($$0.f));
    }

    public static Stream<gu> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        return StreamSupport.stream(gu.b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
    }

    public static Iterable<gu> b(final int $$0, final int $$1, final int $$2, int $$3, int $$4, int $$5) {
        final int $$6 = $$3 - $$0 + 1;
        final int $$7 = $$4 - $$1 + 1;
        int $$8 = $$5 - $$2 + 1;
        final int $$9 = $$6 * $$7 * $$8;
        return () -> new AbstractIterator<gu>(){
            private final a g = new a();
            private int h;

            protected gu a() {
                if (this.h == $$9) {
                    return (gu)this.endOfData();
                }
                int $$02 = this.h % $$6;
                int $$12 = this.h / $$6;
                int $$22 = $$12 % $$7;
                int $$3 = $$12 / $$7;
                ++this.h;
                return this.g.d($$0 + $$02, $$1 + $$22, $$2 + $$3);
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static Iterable<a> a(final gu $$0, final int $$1, final ha $$2, final ha $$3) {
        Validate.validState(($$2.o() != $$3.o() ? 1 : 0) != 0, (String)"The two directions cannot be on the same axis", (Object[])new Object[0]);
        return () -> new AbstractIterator<a>(){
            private final ha[] e;
            private final a f;
            private final int g;
            private int h;
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            {
                this.e = new ha[]{$$2, $$3, $$2.g(), $$3.g()};
                this.f = $$0.j().c($$3);
                this.g = 4 * $$1;
                this.h = -1;
                this.k = this.f.u();
                this.l = this.f.v();
                this.m = this.f.w();
            }

            protected a a() {
                this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
                this.k = this.f.u();
                this.l = this.f.v();
                this.m = this.f.w();
                if (this.j >= this.i) {
                    if (this.h >= this.g) {
                        return (a)this.endOfData();
                    }
                    ++this.h;
                    this.j = 0;
                    this.i = this.h / 2 + 1;
                }
                ++this.j;
                return this.f;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }

    public static int a(gu $$0, int $$1, int $$22, BiConsumer<gu, Consumer<gu>> $$3, Predicate<gu> $$4) {
        ArrayDeque<Pair> $$5 = new ArrayDeque<Pair>();
        LongOpenHashSet $$6 = new LongOpenHashSet();
        $$5.add(Pair.of((Object)$$0, (Object)0));
        int $$7 = 0;
        while (!$$5.isEmpty()) {
            Pair $$8 = (Pair)$$5.poll();
            gu $$9 = (gu)$$8.getLeft();
            int $$10 = (Integer)$$8.getRight();
            long $$11 = $$9.a();
            if (!$$6.add($$11) || !$$4.test($$9)) continue;
            if (++$$7 >= $$22) {
                return $$7;
            }
            if ($$10 >= $$1) continue;
            $$3.accept($$9, $$2 -> $$5.add(Pair.of((Object)$$2, (Object)($$10 + 1))));
        }
        return $$7;
    }

    @Override
    public /* synthetic */ hz d(hz hz2) {
        return this.c(hz2);
    }

    @Override
    public /* synthetic */ hz b(ha.a a2, int n2) {
        return this.a(a2, n2);
    }

    @Override
    public /* synthetic */ hz b(ha ha2, int n2) {
        return this.a(ha2, n2);
    }

    @Override
    public /* synthetic */ hz b(ha ha2) {
        return this.a(ha2);
    }

    @Override
    public /* synthetic */ hz i(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ hz k() {
        return this.h();
    }

    @Override
    public /* synthetic */ hz j(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ hz l() {
        return this.g();
    }

    @Override
    public /* synthetic */ hz k(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ hz m() {
        return this.f();
    }

    @Override
    public /* synthetic */ hz l(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ hz n() {
        return this.e();
    }

    @Override
    public /* synthetic */ hz m(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ hz o() {
        return this.d();
    }

    @Override
    public /* synthetic */ hz n(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ hz p() {
        return this.c();
    }

    @Override
    public /* synthetic */ hz o(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ hz e(hz hz2) {
        return this.b(hz2);
    }

    @Override
    public /* synthetic */ hz f(hz hz2) {
        return this.a(hz2);
    }

    @Override
    public /* synthetic */ hz c(int n2, int n3, int n4) {
        return this.b(n2, n3, n4);
    }

    static {
        h = e = 1 + apa.f(apa.c(30000000));
        c = 64 - e - h;
        i = (1L << e) - 1L;
        j = (1L << c) - 1L;
        k = (1L << h) - 1L;
        m = c;
        n = c + h;
    }

    public static class a
    extends gu {
        public a() {
            this(0, 0, 0);
        }

        public a(int $$0, int $$1, int $$2) {
            super($$0, $$1, $$2);
        }

        public a(double $$0, double $$1, double $$2) {
            this(apa.a($$0), apa.a($$1), apa.a($$2));
        }

        @Override
        public gu b(int $$0, int $$1, int $$2) {
            return super.b($$0, $$1, $$2).i();
        }

        @Override
        public gu a(int $$0) {
            return super.a($$0).i();
        }

        @Override
        public gu a(ha $$0, int $$1) {
            return super.a($$0, $$1).i();
        }

        @Override
        public gu a(ha.a $$0, int $$1) {
            return super.a($$0, $$1).i();
        }

        @Override
        public gu a(cvz $$0) {
            return super.a($$0).i();
        }

        public a d(int $$0, int $$1, int $$2) {
            this.p($$0);
            this.q($$1);
            this.r($$2);
            return this;
        }

        public a b(double $$0, double $$1, double $$2) {
            return this.d(apa.a($$0), apa.a($$1), apa.a($$2));
        }

        public a g(hz $$0) {
            return this.d($$0.u(), $$0.v(), $$0.w());
        }

        public a f(long $$0) {
            return this.d(gu$a.a($$0), gu$a.b($$0), gu$a.c($$0));
        }

        public a a(gs $$0, int $$1, int $$2, int $$3) {
            return this.d($$0.a($$1, $$2, $$3, ha.a.a), $$0.a($$1, $$2, $$3, ha.a.b), $$0.a($$1, $$2, $$3, ha.a.c));
        }

        public a a(hz $$0, ha $$1) {
            return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
        }

        public a a(hz $$0, int $$1, int $$2, int $$3) {
            return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
        }

        public a a(hz $$0, hz $$1) {
            return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
        }

        public a c(ha $$0) {
            return this.c($$0, 1);
        }

        public a c(ha $$0, int $$1) {
            return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
        }

        public a e(int $$0, int $$1, int $$2) {
            return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
        }

        public a h(hz $$0) {
            return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
        }

        public a a(ha.a $$0, int $$1, int $$2) {
            switch ($$0) {
                case a: {
                    return this.d(apa.a(this.u(), $$1, $$2), this.v(), this.w());
                }
                case b: {
                    return this.d(this.u(), apa.a(this.v(), $$1, $$2), this.w());
                }
                case c: {
                    return this.d(this.u(), this.v(), apa.a(this.w(), $$1, $$2));
                }
            }
            throw new IllegalStateException("Unable to clamp axis " + $$0);
        }

        public a p(int $$0) {
            super.u($$0);
            return this;
        }

        public a q(int $$0) {
            super.t($$0);
            return this;
        }

        public a r(int $$0) {
            super.s($$0);
            return this;
        }

        @Override
        public gu i() {
            return new gu(this);
        }

        @Override
        public /* synthetic */ hz d(hz hz2) {
            return super.c(hz2);
        }

        @Override
        public /* synthetic */ hz b(ha.a a2, int n2) {
            return this.a(a2, n2);
        }

        @Override
        public /* synthetic */ hz b(ha ha2, int n2) {
            return this.a(ha2, n2);
        }

        @Override
        public /* synthetic */ hz b(ha ha2) {
            return super.a(ha2);
        }

        @Override
        public /* synthetic */ hz i(int n2) {
            return super.g(n2);
        }

        @Override
        public /* synthetic */ hz k() {
            return super.h();
        }

        @Override
        public /* synthetic */ hz j(int n2) {
            return super.f(n2);
        }

        @Override
        public /* synthetic */ hz l() {
            return super.g();
        }

        @Override
        public /* synthetic */ hz k(int n2) {
            return super.e(n2);
        }

        @Override
        public /* synthetic */ hz m() {
            return super.f();
        }

        @Override
        public /* synthetic */ hz l(int n2) {
            return super.d(n2);
        }

        @Override
        public /* synthetic */ hz n() {
            return super.e();
        }

        @Override
        public /* synthetic */ hz m(int n2) {
            return super.c(n2);
        }

        @Override
        public /* synthetic */ hz o() {
            return super.d();
        }

        @Override
        public /* synthetic */ hz n(int n2) {
            return super.b(n2);
        }

        @Override
        public /* synthetic */ hz p() {
            return super.c();
        }

        @Override
        public /* synthetic */ hz o(int n2) {
            return this.a(n2);
        }

        @Override
        public /* synthetic */ hz e(hz hz2) {
            return super.b(hz2);
        }

        @Override
        public /* synthetic */ hz f(hz hz2) {
            return super.a(hz2);
        }

        @Override
        public /* synthetic */ hz c(int n2, int n3, int n4) {
            return this.b(n2, n3, n4);
        }

        @Override
        public /* synthetic */ hz s(int n2) {
            return this.r(n2);
        }

        @Override
        public /* synthetic */ hz t(int n2) {
            return this.q(n2);
        }

        @Override
        public /* synthetic */ hz u(int n2) {
            return this.p(n2);
        }
    }
}

