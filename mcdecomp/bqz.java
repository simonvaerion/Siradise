/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class bqz
extends dfg<brb> {
    public static final int a = 6;
    public static final int b = 1;
    private final a d;
    private final LongSet e = new LongOpenHashSet();

    public bqz(Path $$0, DataFixer $$1, boolean $$2, hs $$3, cmo $$4) {
        super($$0, brb::a, brb::new, $$1, aqc.j, $$2, $$3, $$4);
        this.d = new a();
    }

    public void a(gu $$0, he<brc> $$1) {
        ((brb)this.f(hx.c($$0))).a($$0, $$1);
    }

    public void a(gu $$0) {
        this.d(hx.c($$0)).ifPresent($$1 -> $$1.a($$0));
    }

    public long a(Predicate<he<brc>> $$0, gu $$1, int $$2, b $$3) {
        return this.c($$0, $$1, $$2, $$3).count();
    }

    public boolean a(acp<brc> $$0, gu $$12) {
        return this.a($$12, (he<brc> $$1) -> $$1.a($$0));
    }

    public Stream<bra> b(Predicate<he<brc>> $$0, gu $$1, int $$22, b $$3) {
        int $$4 = Math.floorDiv($$22, 16) + 1;
        return clt.a(new clt($$1), $$4).flatMap($$2 -> this.a($$0, (clt)$$2, $$3)).filter($$2 -> {
            gu $$3 = $$2.f();
            return Math.abs($$3.u() - $$1.u()) <= $$22 && Math.abs($$3.w() - $$1.w()) <= $$22;
        });
    }

    public Stream<bra> c(Predicate<he<brc>> $$0, gu $$1, int $$22, b $$3) {
        int $$4 = $$22 * $$22;
        return this.b($$0, $$1, $$22, $$3).filter($$2 -> $$2.f().j($$1) <= (double)$$4);
    }

    @aqa
    public Stream<bra> a(Predicate<he<brc>> $$0, clt $$12, b $$22) {
        return IntStream.range(this.c.al(), this.c.am()).boxed().map($$1 -> this.d(hx.a($$12, (int)$$1).s())).filter(Optional::isPresent).flatMap($$2 -> ((brb)$$2.get()).a($$0, $$22));
    }

    public Stream<gu> a(Predicate<he<brc>> $$0, Predicate<gu> $$1, gu $$2, int $$3, b $$4) {
        return this.c($$0, $$2, $$3, $$4).map(bra::f).filter($$1);
    }

    public Stream<Pair<he<brc>, gu>> b(Predicate<he<brc>> $$02, Predicate<gu> $$12, gu $$2, int $$3, b $$4) {
        return this.c($$02, $$2, $$3, $$4).filter($$1 -> $$12.test($$1.f())).map($$0 -> Pair.of($$0.g(), (Object)$$0.f()));
    }

    public Stream<Pair<he<brc>, gu>> c(Predicate<he<brc>> $$0, Predicate<gu> $$12, gu $$2, int $$3, b $$4) {
        return this.b($$0, $$12, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1 -> ((gu)$$1.getSecond()).j($$2)));
    }

    public Optional<gu> d(Predicate<he<brc>> $$0, Predicate<gu> $$1, gu $$2, int $$3, b $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
    }

    public Optional<gu> d(Predicate<he<brc>> $$0, gu $$12, int $$2, b $$3) {
        return this.c($$0, $$12, $$2, $$3).map(bra::f).min(Comparator.comparingDouble($$1 -> $$1.j($$12)));
    }

    public Optional<Pair<he<brc>, gu>> e(Predicate<he<brc>> $$02, gu $$12, int $$2, b $$3) {
        return this.c($$02, $$12, $$2, $$3).min(Comparator.comparingDouble($$1 -> $$1.f().j($$12))).map($$0 -> Pair.of($$0.g(), (Object)$$0.f()));
    }

    public Optional<gu> e(Predicate<he<brc>> $$0, Predicate<gu> $$12, gu $$2, int $$3, b $$4) {
        return this.c($$0, $$2, $$3, $$4).map(bra::f).filter($$12).min(Comparator.comparingDouble($$1 -> $$1.j($$2)));
    }

    public Optional<gu> a(Predicate<he<brc>> $$02, BiPredicate<he<brc>, gu> $$12, gu $$2, int $$3) {
        return this.c($$02, $$2, $$3, bqz$b.a).filter($$1 -> $$12.test($$1.g(), $$1.f())).findFirst().map($$0 -> {
            $$0.b();
            return $$0.f();
        });
    }

    public Optional<gu> a(Predicate<he<brc>> $$0, Predicate<gu> $$12, b $$2, gu $$3, int $$4, apf $$5) {
        List<bra> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
        return $$6.stream().filter($$1 -> $$12.test($$1.f())).findFirst().map(bra::f);
    }

    public boolean b(gu $$0) {
        return this.d(hx.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
    }

    public boolean a(gu $$0, Predicate<he<brc>> $$1) {
        return this.d(hx.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
    }

    public Optional<he<brc>> c(gu $$0) {
        return this.d(hx.c($$0)).flatMap($$1 -> $$1.d($$0));
    }

    @Deprecated
    @aqa
    public int d(gu $$0) {
        return this.d(hx.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
    }

    public int a(hx $$0) {
        this.d.a();
        return this.d.c($$0.s());
    }

    boolean g(long $$0) {
        Optional $$1 = this.c($$0);
        if ($$1 == null) {
            return false;
        }
        return $$1.map($$02 -> $$02.a((he<brc> $$0) -> $$0.a(ang.b), bqz$b.b).findAny().isPresent()).orElse(false);
    }

    @Override
    public void a(BooleanSupplier $$0) {
        super.a($$0);
        this.d.a();
    }

    @Override
    protected void a(long $$0) {
        super.a($$0);
        this.d.b($$0, this.d.b($$0), false);
    }

    @Override
    protected void b(long $$0) {
        this.d.b($$0, this.d.b($$0), false);
    }

    public void a(hx $$0, dej $$1) {
        ac.a(this.d($$0.s()), (T $$22) -> $$22.a((BiConsumer<gu, he<brc>> $$2) -> {
            if (bqz.a($$1)) {
                this.a($$1, $$0, (BiConsumer<gu, he<brc>>)$$2);
            }
        }), () -> {
            if (bqz.a($$1)) {
                brb $$2 = (brb)this.f($$0.s());
                this.a($$1, $$0, $$2::a);
            }
        });
    }

    private static boolean a(dej $$0) {
        return $$0.a(brd::b);
    }

    private void a(dej $$0, hx $$1, BiConsumer<gu, he<brc>> $$2) {
        $$1.t().forEach($$22 -> {
            dcb $$3 = $$0.a(hx.b($$22.u()), hx.b($$22.v()), hx.b($$22.w()));
            brd.a($$3).ifPresent($$2 -> $$2.accept((gu)$$22, (he<brc>)$$2));
        });
    }

    public void a(cmp $$02, gu $$12, int $$2) {
        hx.a(new clt($$12), Math.floorDiv($$2, 16), this.c.al(), this.c.am()).map($$0 -> Pair.of((Object)$$0, this.d($$0.s()))).filter($$0 -> ((Optional)$$0.getSecond()).map(brb::a).orElse(false) == false).map($$0 -> ((hx)$$0.getFirst()).r()).filter($$0 -> this.e.add($$0.a())).forEach($$1 -> $$02.a($$1.e, $$1.f, dec.c));
    }

    final class a
    extends aib {
        private final Long2ByteMap b;

        protected a() {
            super(7, 16, 256);
            this.b = new Long2ByteOpenHashMap();
            this.b.defaultReturnValue((byte)7);
        }

        @Override
        protected int b(long $$0) {
            return bqz.this.g($$0) ? 0 : 7;
        }

        @Override
        protected int c(long $$0) {
            return this.b.get($$0);
        }

        @Override
        protected void a(long $$0, int $$1) {
            if ($$1 > 6) {
                this.b.remove($$0);
            } else {
                this.b.put($$0, (byte)$$1);
            }
        }

        public void a() {
            super.b(Integer.MAX_VALUE);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(bra::d);
        public static final /* enum */ b b = new b(bra::e);
        public static final /* enum */ b c = new b($$0 -> true);
        private final Predicate<? super bra> d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Predicate<? super bra> $$0) {
            this.d = $$0;
        }

        public Predicate<? super bra> a() {
            return this.d;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c};
        }

        static {
            e = bqz$b.b();
        }
    }
}

