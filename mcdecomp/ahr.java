/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ahr
extends dez
implements ahp.d {
    private static final byte e = -1;
    private static final byte f = 0;
    private static final byte g = 1;
    private static final Logger h = LogUtils.getLogger();
    private static final int i = 200;
    private static final int j = 20;
    private static final int k = 10000;
    private static final int l = 2;
    public static final int a = 32;
    public static final int b = ahq.a(ahy.d);
    private final Long2ObjectLinkedOpenHashMap<ahp> m = new Long2ObjectLinkedOpenHashMap();
    private volatile Long2ObjectLinkedOpenHashMap<ahp> n = this.m.clone();
    private final Long2ObjectLinkedOpenHashMap<ahp> o = new Long2ObjectLinkedOpenHashMap();
    private final LongSet p = new LongOpenHashSet();
    final aif q;
    private final aii r;
    private final bcn<Runnable> s;
    private ddy t;
    private final dhy u;
    private final ddz v;
    private final Supplier<dyu> w;
    private final bqz x;
    final LongSet y = new LongOpenHashSet();
    private boolean z;
    private final aht A;
    private final bcp<aht.a<Runnable>> B;
    private final bcp<aht.a<Runnable>> C;
    private final aio D;
    private final dfr E;
    private final a F;
    private final AtomicInteger G = new AtomicInteger();
    private final dvu H;
    private final String I;
    private final ahz J = new ahz();
    private final Int2ObjectMap<b> K = new Int2ObjectOpenHashMap();
    private final Long2ByteMap L = new Long2ByteOpenHashMap();
    private final Long2LongMap M = new Long2LongOpenHashMap();
    private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
    int O;

    public ahr(aif $$0, dyy.c $$1, DataFixer $$2, dvu $$3, Executor $$4, bcn<Runnable> $$5, del $$6, ddy $$7, aio $$8, dfr $$9, Supplier<dyu> $$10, int $$11, boolean $$12) {
        super($$1.a($$0.ac()).resolve("region"), $$2, $$12);
        this.H = $$3;
        Path $$13 = $$1.a($$0.ac());
        this.I = $$13.getFileName().toString();
        this.q = $$0;
        this.t = $$7;
        hs $$14 = $$0.B_();
        long $$15 = $$0.A();
        if ($$7 instanceof dhn) {
            dhn $$16 = (dhn)$$7;
            this.u = dhy.a($$16.g().a(), $$14.b(jc.ax), $$15);
        } else {
            this.u = dhy.a(dhp.e(), $$14.b(jc.ax), $$15);
        }
        this.v = $$7.a($$14.b(jc.aB), this.u, $$15);
        this.s = $$5;
        bcq<Runnable> $$17 = bcq.a($$4, "worldgen");
        bcp<Runnable> $$18 = bcp.a("main", $$5::i);
        this.D = $$8;
        this.E = $$9;
        bcq<Runnable> $$19 = bcq.a($$4, "light");
        this.A = new aht((List<bcp<?>>)ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
        this.B = this.A.a($$17, false);
        this.C = this.A.a($$18, false);
        this.r = new aii($$6, this, this.q.x_().g(), $$19, this.A.a($$19, false));
        this.F = new a($$4, $$5);
        this.w = $$10;
        this.x = new bqz($$13.resolve("poi"), $$2, $$12, $$14, $$0);
        this.a($$11);
    }

    protected ddy a() {
        return this.t;
    }

    protected ddz b() {
        return this.v;
    }

    protected dhy c() {
        return this.u;
    }

    public void d() {
        DataResult $$02 = ddy.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)this.t);
        DataResult $$1 = $$02.flatMap($$0 -> ddy.a.parse((DynamicOps)JsonOps.INSTANCE, $$0));
        $$1.result().ifPresent($$0 -> {
            this.t = $$0;
        });
    }

    private static double a(clt $$0, bfj $$1) {
        double $$2 = hx.a($$0.e, 8);
        double $$3 = hx.a($$0.f, 8);
        double $$4 = $$2 - $$1.dn();
        double $$5 = $$3 - $$1.dt();
        return $$4 * $$4 + $$5 * $$5;
    }

    public static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        int $$10;
        int $$5 = Math.max(0, Math.abs($$0 - $$2) - 1);
        int $$6 = Math.max(0, Math.abs($$1 - $$3) - 1);
        long $$7 = Math.max(0, Math.max($$5, $$6) - 1);
        long $$8 = Math.min($$5, $$6);
        long $$9 = $$8 * $$8 + $$7 * $$7;
        return $$9 < (long)($$10 = $$4 * $$4);
    }

    private static boolean b(int $$0, int $$1, int $$2, int $$3, int $$4) {
        if (!ahr.a($$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        return !ahr.a($$0 + 1, $$1 + 1, $$2, $$3, $$4) || !ahr.a($$0 - 1, $$1 + 1, $$2, $$3, $$4) || !ahr.a($$0 + 1, $$1 - 1, $$2, $$3, $$4) || !ahr.a($$0 - 1, $$1 - 1, $$2, $$3, $$4);
    }

    protected aii e() {
        return this.r;
    }

    @Nullable
    protected ahp a(long $$0) {
        return (ahp)this.m.get($$0);
    }

    @Nullable
    protected ahp b(long $$0) {
        return (ahp)this.n.get($$0);
    }

    protected IntSupplier c(long $$0) {
        return () -> {
            ahp $$1 = this.b($$0);
            if ($$1 == null) {
                return ahs.a - 1;
            }
            return Math.min($$1.l(), ahs.a - 1);
        };
    }

    public String a(clt $$0) {
        ahp $$1 = this.b($$0.a());
        if ($$1 == null) {
            return "null";
        }
        String $$2 = $$1.k() + "\n";
        dec $$3 = $$1.f();
        ddx $$4 = $$1.g();
        if ($$3 != null) {
            $$2 = $$2 + "St: \u00a7" + $$3.c() + $$3 + "\u00a7r\n";
        }
        if ($$4 != null) {
            $$2 = $$2 + "Ch: \u00a7" + $$4.j().c() + $$4.j() + "\u00a7r\n";
        }
        ahy $$5 = $$1.i();
        $$2 = $$2 + "\u00a7" + $$5.ordinal() + $$5;
        return $$2 + "\u00a7r";
    }

    private CompletableFuture<Either<List<ddx>, ahp.a>> a(ahp $$02, final int $$1, IntFunction<dec> $$2) {
        if ($$1 == 0) {
            dec $$32 = $$2.apply(0);
            return $$02.a($$32, this).thenApply($$0 -> $$0.mapLeft(List::of));
        }
        ArrayList<CompletableFuture<Either<ddx, ahp.a>>> $$4 = new ArrayList<CompletableFuture<Either<ddx, ahp.a>>>();
        ArrayList<ahp> $$5 = new ArrayList<ahp>();
        clt $$6 = $$02.j();
        final int $$7 = $$6.e;
        final int $$8 = $$6.f;
        for (int $$9 = -$$1; $$9 <= $$1; ++$$9) {
            for (int $$10 = -$$1; $$10 <= $$1; ++$$10) {
                int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
                final clt $$12 = new clt($$7 + $$10, $$8 + $$9);
                long $$13 = $$12.a();
                ahp $$14 = this.a($$13);
                if ($$14 == null) {
                    return CompletableFuture.completedFuture(Either.right((Object)new ahp.a(){

                        public String toString() {
                            return "Unloaded " + $$12;
                        }
                    }));
                }
                dec $$15 = $$2.apply($$11);
                CompletableFuture<Either<ddx, ahp.a>> $$16 = $$14.a($$15, this);
                $$5.add($$14);
                $$4.add($$16);
            }
        }
        ArrayList $$17 = ac.b($$4);
        CompletionStage $$18 = ((CompletableFuture)((Object)$$17)).thenApply($$3 -> {
            ArrayList $$4 = Lists.newArrayList();
            int $$5 = 0;
            for (final Either $$6 : $$3) {
                if ($$6 == null) {
                    throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
                }
                Optional $$7 = $$6.left();
                if (!$$7.isPresent()) {
                    final int $$8 = $$5;
                    return Either.right((Object)new ahp.a(){

                        public String toString() {
                            return "Unloaded " + new clt($$7 + $$8 % ($$1 * 2 + 1), $$8 + $$8 / ($$1 * 2 + 1)) + " " + $$6.right().get();
                        }
                    });
                }
                $$4.add((ddx)$$7.get());
                ++$$5;
            }
            return Either.left((Object)$$4);
        });
        for (ahp $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, (CompletableFuture<?>)$$18);
        }
        return $$18;
    }

    public y a(IllegalStateException $$0, String $$12) {
        StringBuilder $$2 = new StringBuilder();
        Consumer<ahp> $$3 = $$1 -> $$1.o().forEach($$2 -> {
            dec $$3 = (dec)$$2.getFirst();
            CompletableFuture $$4 = (CompletableFuture)$$2.getSecond();
            if ($$4 != null && $$4.isDone() && $$4.join() == null) {
                $$2.append($$1.j()).append(" - status: ").append($$3).append(" future: ").append($$4).append(System.lineSeparator());
            }
        });
        $$2.append("Updating:").append(System.lineSeparator());
        this.m.values().forEach($$3);
        $$2.append("Visible:").append(System.lineSeparator());
        this.n.values().forEach($$3);
        o $$4 = o.a($$0, "Chunk loading");
        p $$5 = $$4.a("Chunk loading");
        $$5.a("Details", $$12);
        $$5.a("Futures", $$2);
        return new y($$4);
    }

    public CompletableFuture<Either<dei, ahp.a>> a(ahp $$03) {
        return this.a($$03, 2, (int $$0) -> dec.n).thenApplyAsync($$02 -> $$02.mapLeft($$0 -> (dei)$$0.get($$0.size() / 2)), (Executor)this.s);
    }

    @Nullable
    ahp a(long $$0, int $$1, @Nullable ahp $$2, int $$3) {
        if (!ahq.e($$3) && !ahq.e($$1)) {
            return $$2;
        }
        if ($$2 != null) {
            $$2.a($$1);
        }
        if ($$2 != null) {
            if (!ahq.e($$1)) {
                this.y.add($$0);
            } else {
                this.y.remove($$0);
            }
        }
        if (ahq.e($$1) && $$2 == null) {
            $$2 = (ahp)this.o.remove($$0);
            if ($$2 != null) {
                $$2.a($$1);
            } else {
                $$2 = new ahp(new clt($$0), $$1, this.q, this.r, this.A, this);
            }
            this.m.put($$0, (Object)$$2);
            this.z = true;
        }
        return $$2;
    }

    @Override
    public void close() throws IOException {
        try {
            this.A.close();
            this.x.close();
        }
        finally {
            super.close();
        }
    }

    protected void a(boolean $$02) {
        if ($$02) {
            List $$12 = this.n.values().stream().filter(ahp::m).peek(ahp::n).collect(Collectors.toList());
            MutableBoolean $$2 = new MutableBoolean();
            do {
                $$2.setFalse();
                $$12.stream().map($$0 -> {
                    CompletableFuture<ddx> $$1;
                    do {
                        $$1 = $$0.h();
                        this.s.c($$1::isDone);
                    } while ($$1 != $$0.h());
                    return $$1.join();
                }).filter($$0 -> $$0 instanceof deh || $$0 instanceof dei).filter(this::a).forEach($$1 -> $$2.setTrue());
            } while ($$2.isTrue());
            this.b(() -> true);
            this.o();
        } else {
            this.n.values().forEach(this::e);
        }
    }

    protected void a(BooleanSupplier $$0) {
        ban $$1 = this.q.ad();
        $$1.a("poi");
        this.x.a($$0);
        $$1.b("chunk_unload");
        if (!this.q.r()) {
            this.b($$0);
        }
        $$1.c();
    }

    public boolean f() {
        return this.r.E_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.N.isEmpty() || this.A.a() || this.F.f();
    }

    private void b(BooleanSupplier $$0) {
        Runnable $$6;
        LongIterator $$1 = this.y.iterator();
        int $$2 = 0;
        while ($$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000)) {
            long $$3 = $$1.nextLong();
            ahp $$4 = (ahp)this.m.remove($$3);
            if ($$4 != null) {
                this.o.put($$3, (Object)$$4);
                this.z = true;
                ++$$2;
                this.a($$3, $$4);
            }
            $$1.remove();
        }
        for (int $$5 = Math.max(0, this.N.size() - 2000); ($$0.getAsBoolean() || $$5 > 0) && ($$6 = this.N.poll()) != null; --$$5) {
            $$6.run();
        }
        int $$7 = 0;
        ObjectIterator $$8 = this.n.values().iterator();
        while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
            if (!this.e((ahp)$$8.next())) continue;
            ++$$7;
        }
    }

    private void a(long $$0, ahp $$12) {
        CompletableFuture<ddx> $$22 = $$12.h();
        ((CompletableFuture)$$22.thenAcceptAsync($$3 -> {
            CompletableFuture<ddx> $$4 = $$12.h();
            if ($$4 != $$22) {
                this.a($$0, $$12);
                return;
            }
            if (this.o.remove($$0, (Object)$$12) && $$3 != null) {
                if ($$3 instanceof dei) {
                    ((dei)$$3).c(false);
                }
                this.a((ddx)$$3);
                if (this.p.remove($$0) && $$3 instanceof dei) {
                    dei $$5 = (dei)$$3;
                    this.q.a($$5);
                }
                this.r.a($$3.f());
                this.r.b();
                this.D.a($$3.f(), null);
                this.M.remove($$3.f().a());
            }
        }, this.N::add)).whenComplete(($$1, $$2) -> {
            if ($$2 != null) {
                h.error("Failed to save chunk {}", (Object)$$12.j(), $$2);
            }
        });
    }

    protected boolean g() {
        if (!this.z) {
            return false;
        }
        this.n = this.m.clone();
        this.z = false;
        return true;
    }

    public CompletableFuture<Either<ddx, ahp.a>> a(ahp $$0, dec $$12) {
        Optional $$3;
        clt $$2 = $$0.j();
        if ($$12 == dec.c) {
            return this.f($$2);
        }
        if ($$12 == dec.l) {
            this.F.a(aik.e, $$2, ahq.a(dec.l), $$2);
        }
        if (!$$12.f() && ($$3 = $$0.a($$12.d(), this).getNow(ahp.a).left()).isPresent() && ((ddx)$$3.get()).j().b($$12)) {
            CompletableFuture<Either<ddx, ahp.a>> $$4 = $$12.a(this.q, this.H, this.r, (ddx $$1) -> this.d($$0), (ddx)$$3.get());
            this.D.a($$2, $$12);
            return $$4;
        }
        return this.b($$0, $$12);
    }

    private CompletableFuture<Either<ddx, ahp.a>> f(clt $$0) {
        return ((CompletableFuture)((CompletableFuture)this.j($$0).thenApply($$12 -> $$12.filter($$1 -> {
            boolean $$2 = ahr.b($$1);
            if (!$$2) {
                h.error("Chunk file at {} is missing level data, skipping", (Object)$$0);
            }
            return $$2;
        }))).thenApplyAsync($$1 -> {
            this.q.ad().d("chunkLoad");
            if ($$1.isPresent()) {
                des $$2 = dey.a(this.q, this.x, $$0, (qr)$$1.get());
                this.a($$0, ((ddx)$$2).j().g());
                return Either.left((Object)$$2);
            }
            return Either.left((Object)this.g($$0));
        }, (Executor)this.s)).exceptionallyAsync($$1 -> this.a((Throwable)$$1, $$0), (Executor)this.s);
    }

    private static boolean b(qr $$0) {
        return $$0.b("Status", 8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Either<ddx, ahp.a> a(Throwable $$0, clt $$1) {
        if (!($$0 instanceof y)) {
            if (!($$0 instanceof IOException)) return Either.left((Object)this.g($$1));
            h.error("Couldn't load chunk {}", (Object)$$1, (Object)$$0);
            return Either.left((Object)this.g($$1));
        }
        y $$2 = (y)$$0;
        Throwable $$3 = $$2.getCause();
        if ($$3 instanceof IOException) {
            h.error("Couldn't load chunk {}", (Object)$$1, (Object)$$3);
            return Either.left((Object)this.g($$1));
        }
        this.h($$1);
        throw $$2;
    }

    private ddx g(clt $$0) {
        this.h($$0);
        return new des($$0, dev.a, this.q, this.q.B_().d(jc.ap), null);
    }

    private void h(clt $$0) {
        this.L.put($$0.a(), (byte)-1);
    }

    private byte a(clt $$0, dec.a $$1) {
        return this.L.put($$0.a(), $$1 == dec.a.a ? (byte)-1 : 1);
    }

    private CompletableFuture<Either<ddx, ahp.a>> b(ahp $$0, dec $$12) {
        clt $$2 = $$0.j();
        CompletableFuture<Either<List<ddx>, ahp.a>> $$3 = this.a($$0, $$12.e(), (int $$1) -> this.a($$12, $$1));
        this.q.ad().c(() -> "chunkGenerate " + $$12);
        Executor $$4 = $$1 -> this.B.a(aht.a($$0, $$1));
        return $$3.thenComposeAsync($$42 -> (CompletionStage)$$42.map($$4 -> {
            try {
                CompletableFuture<Either<ddx, ahp.a>> $$7;
                ddx $$5 = (ddx)$$4.get($$4.size() / 2);
                if ($$5.j().b($$12)) {
                    CompletableFuture<Either<ddx, ahp.a>> $$6 = $$12.a(this.q, this.H, this.r, (ddx $$1) -> this.d($$0), $$5);
                } else {
                    $$7 = $$12.a($$4, this.q, this.t, this.H, this.r, $$1 -> this.d($$0), (List<ddx>)$$4);
                }
                this.D.a($$2, $$12);
                return $$7;
            }
            catch (Exception $$8) {
                $$8.getStackTrace();
                o $$9 = o.a($$8, "Exception generating new chunk");
                p $$10 = $$9.a("Chunk to be generated");
                $$10.a("Location", String.format(Locale.ROOT, "%d,%d", $$0.e, $$0.f));
                $$10.a("Position hash", clt.c($$0.e, $$0.f));
                $$10.a("Generator", this.t);
                this.s.execute(() -> {
                    throw new y($$9);
                });
                throw new y($$9);
            }
        }, $$1 -> {
            this.b($$2);
            return CompletableFuture.completedFuture(Either.right((Object)$$1));
        }), $$4);
    }

    protected void b(clt $$0) {
        this.s.i(ac.a(() -> this.F.b(aik.e, $$0, ahq.a(dec.l), $$0), () -> "release light ticket " + $$0));
    }

    private dec a(dec $$0, int $$1) {
        dec $$3;
        if ($$1 == 0) {
            dec $$2 = $$0.d();
        } else {
            $$3 = dec.a(dec.a($$0) + $$1);
        }
        return $$3;
    }

    private static void a(aif $$0, List<qr> $$1) {
        if (!$$1.isEmpty()) {
            $$0.b(bfn.a($$1, (cmm)$$0));
        }
    }

    private CompletableFuture<Either<ddx, ahp.a>> d(ahp $$0) {
        CompletableFuture<Either<ddx, ahp.a>> $$12 = $$0.a(dec.n.d());
        return $$12.thenApplyAsync($$1 -> {
            dec $$2 = ahq.a($$0.k());
            if (!$$2.b(dec.n)) {
                return ahp.a;
            }
            return $$1.mapLeft($$12 -> {
                dei $$5;
                clt $$2 = $$0.j();
                des $$3 = (des)$$12;
                if ($$3 instanceof deh) {
                    dei $$4 = ((deh)$$3).C();
                } else {
                    $$5 = new dei(this.q, $$3, $$1 -> ahr.a(this.q, $$3.E()));
                    $$0.a(new deh($$5, false));
                }
                $$5.b(() -> ahq.b($$0.k()));
                $$5.E();
                if (this.p.add($$2.a())) {
                    $$5.c(true);
                    $$5.J();
                    $$5.a(this.q);
                }
                return $$5;
            });
        }, $$1 -> this.C.a(aht.a($$1, $$0.j().a(), $$0::k)));
    }

    public CompletableFuture<Either<dei, ahp.a>> b(ahp $$03) {
        CompletableFuture<Either<List<ddx>, ahp.a>> $$13 = this.a($$03, 1, (int $$0) -> dec.n);
        CompletionStage $$2 = ((CompletableFuture)$$13.thenApplyAsync($$02 -> $$02.mapLeft($$0 -> (dei)$$0.get($$0.size() / 2)), $$1 -> this.C.a(aht.a($$03, $$1)))).thenApplyAsync($$02 -> $$02.ifLeft($$0 -> {
            $$0.H();
            this.q.b((dei)$$0);
        }), (Executor)this.s);
        ((CompletableFuture)$$2).handle(($$0, $$1) -> {
            this.G.getAndIncrement();
            return null;
        });
        ((CompletableFuture)$$2).thenAcceptAsync($$12 -> $$12.ifLeft($$1 -> {
            MutableObject $$22 = new MutableObject();
            this.a($$03.j(), false).forEach($$2 -> this.a((aig)$$2, (MutableObject<wd>)$$22, (dei)$$1));
        }), $$1 -> this.C.a(aht.a($$03, $$1)));
        return $$2;
    }

    public CompletableFuture<Either<dei, ahp.a>> c(ahp $$0) {
        return this.a($$0, 1, dec::a).thenApplyAsync($$02 -> $$02.mapLeft($$0 -> {
            dei $$1 = (dei)$$0.get($$0.size() / 2);
            return $$1;
        }), $$1 -> this.C.a(aht.a($$0, $$1)));
    }

    public int h() {
        return this.G.get();
    }

    private boolean e(ahp $$0) {
        if (!$$0.m()) {
            return false;
        }
        ddx $$1 = $$0.h().getNow(null);
        if ($$1 instanceof deh || $$1 instanceof dei) {
            long $$2 = $$1.f().a();
            long $$3 = this.M.getOrDefault($$2, -1L);
            long $$4 = System.currentTimeMillis();
            if ($$4 < $$3) {
                return false;
            }
            boolean $$5 = this.a($$1);
            $$0.n();
            if ($$5) {
                this.M.put($$2, $$4 + 10000L);
            }
            return $$5;
        }
        return false;
    }

    private boolean a(ddx $$0) {
        this.x.a($$0.f());
        if (!$$0.i()) {
            return false;
        }
        $$0.a(false);
        clt $$1 = $$0.f();
        try {
            dec $$2 = $$0.j();
            if ($$2.g() != dec.a.b) {
                if (this.i($$1)) {
                    return false;
                }
                if ($$2 == dec.c && $$0.g().values().stream().noneMatch(dsi::b)) {
                    return false;
                }
            }
            this.q.ad().d("chunkSave");
            qr $$3 = dey.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
        }
        catch (Exception $$4) {
            h.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, $$4});
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean i(clt $$0) {
        void $$4;
        byte $$1 = this.L.get($$0.a());
        if ($$1 != 0) {
            return $$1 == 1;
        }
        try {
            qr $$2 = this.j($$0).join().orElse(null);
            if ($$2 == null) {
                this.h($$0);
                return false;
            }
        }
        catch (Exception $$3) {
            h.error("Failed to read chunk {}", (Object)$$0, (Object)$$3);
            this.h($$0);
            return false;
        }
        dec.a $$5 = dey.a((qr)$$4);
        return this.a($$0, $$5) == 1;
    }

    protected void a(int $$0) {
        int $$1 = apa.a($$0, 2, 32);
        if ($$1 != this.O) {
            int $$2 = this.O;
            this.O = $$1;
            this.F.a(this.O);
            for (ahp $$32 : this.m.values()) {
                clt $$4 = $$32.j();
                MutableObject $$5 = new MutableObject();
                this.a($$4, false).forEach($$3 -> {
                    hx $$4 = $$3.R();
                    boolean $$5 = ahr.a($$0.e, $$0.f, $$4.a(), $$4.c(), $$2);
                    boolean $$6 = ahr.a($$0.e, $$0.f, $$4.a(), $$4.c(), this.O);
                    this.a((aig)$$3, $$4, (MutableObject<wd>)$$5, $$5, $$6);
                });
            }
        }
    }

    protected void a(aig $$0, clt $$1, MutableObject<wd> $$2, boolean $$3, boolean $$4) {
        ahp $$5;
        if ($$0.dI() != this.q) {
            return;
        }
        if ($$4 && !$$3 && ($$5 = this.b($$1.a())) != null) {
            dei $$6 = $$5.d();
            if ($$6 != null) {
                this.a($$0, $$2, $$6);
            }
            za.a(this.q, $$1);
        }
        if (!$$4 && $$3) {
            $$0.a($$1);
        }
    }

    public int i() {
        return this.n.size();
    }

    public ahx j() {
        return this.F;
    }

    protected Iterable<ahp> k() {
        return Iterables.unmodifiableIterable((Iterable)this.n.values());
    }

    void a(Writer $$02) throws IOException {
        aob $$1 = aob.a().a("x").a("z").a("level").a("in_memory").a("status").a("full_status").a("accessible_ready").a("ticking_ready").a("entity_ticking_ready").a("ticket").a("spawning").a("block_entity_count").a("ticking_ticket").a("ticking_level").a("block_ticks").a("fluid_ticks").a($$02);
        ail $$2 = this.F.d();
        for (Long2ObjectMap.Entry $$3 : this.n.long2ObjectEntrySet()) {
            long $$4 = $$3.getLongKey();
            clt $$5 = new clt($$4);
            ahp $$6 = (ahp)$$3.getValue();
            Optional<ddx> $$7 = Optional.ofNullable($$6.g());
            Optional<Object> $$8 = $$7.flatMap($$0 -> $$0 instanceof dei ? Optional.of((dei)$$0) : Optional.empty());
            $$1.a($$5.e, $$5.f, $$6.k(), $$7.isPresent(), $$7.map(ddx::j).orElse(null), $$8.map(dei::D).orElse(null), ahr.a($$6.c()), ahr.a($$6.a()), ahr.a($$6.b()), this.F.e($$4), this.c($$5), $$8.map($$0 -> $$0.G().size()).orElse(0), $$2.d($$4), $$2.c($$4), $$8.map($$0 -> $$0.o().a()).orElse(0), $$8.map($$0 -> $$0.p().a()).orElse(0));
        }
    }

    private static String a(CompletableFuture<Either<dei, ahp.a>> $$02) {
        try {
            Either $$1 = $$02.getNow(null);
            if ($$1 != null) {
                return (String)$$1.map($$0 -> "done", $$0 -> "unloaded");
            }
            return "not completed";
        }
        catch (CompletionException $$2) {
            return "failed " + $$2.getCause().getMessage();
        }
        catch (CancellationException $$3) {
            return "cancelled";
        }
    }

    private CompletableFuture<Optional<qr>> j(clt $$02) {
        return this.e($$02).thenApplyAsync($$0 -> $$0.map(this::c), (Executor)ac.f());
    }

    private qr c(qr $$0) {
        return this.a(this.q.ac(), this.w, $$0, this.t.b());
    }

    boolean c(clt $$0) {
        long $$1 = $$0.a();
        if (!this.F.f($$1)) {
            return false;
        }
        for (aig $$2 : this.J.a($$1)) {
            if (!this.a($$2, $$0)) continue;
            return true;
        }
        return false;
    }

    public List<aig> d(clt $$0) {
        long $$1 = $$0.a();
        if (!this.F.f($$1)) {
            return List.of();
        }
        ImmutableList.Builder $$2 = ImmutableList.builder();
        for (aig $$3 : this.J.a($$1)) {
            if (!this.a($$3, $$0)) continue;
            $$2.add((Object)$$3);
        }
        return $$2.build();
    }

    private boolean a(aig $$0, clt $$1) {
        if ($$0.G_()) {
            return false;
        }
        double $$2 = ahr.a($$1, $$0);
        return $$2 < 16384.0;
    }

    private boolean b(aig $$0) {
        return $$0.G_() && !this.q.X().b(cmi.q);
    }

    void a(aig $$0, boolean $$1) {
        boolean $$2 = this.b($$0);
        boolean $$3 = this.J.c($$0);
        int $$4 = hx.a($$0.dm());
        int $$5 = hx.a($$0.ds());
        if ($$1) {
            this.J.a(clt.c($$4, $$5), $$0, $$2);
            this.c($$0);
            if (!$$2) {
                this.F.a(hx.a($$0), $$0);
            }
        } else {
            hx $$6 = $$0.R();
            this.J.a($$6.r().a(), $$0);
            if (!$$3) {
                this.F.b($$6, $$0);
            }
        }
        for (int $$7 = $$4 - this.O - 1; $$7 <= $$4 + this.O + 1; ++$$7) {
            for (int $$8 = $$5 - this.O - 1; $$8 <= $$5 + this.O + 1; ++$$8) {
                if (!ahr.a($$7, $$8, $$4, $$5, this.O)) continue;
                clt $$9 = new clt($$7, $$8);
                this.a($$0, $$9, (MutableObject<wd>)new MutableObject(), !$$1, $$1);
            }
        }
    }

    private hx c(aig $$0) {
        hx $$1 = hx.a($$0);
        $$0.a($$1);
        $$0.c.a(new xs($$1.a(), $$1.c()));
        return $$1;
    }

    public void a(aig $$0) {
        boolean $$10;
        for (b $$1 : this.K.values()) {
            if ($$1.c == $$0) {
                $$1.a(this.q.v());
                continue;
            }
            $$1.b($$0);
        }
        int $$2 = hx.a($$0.dm());
        int $$3 = hx.a($$0.ds());
        hx $$4 = $$0.R();
        hx $$5 = hx.a($$0);
        long $$6 = $$4.r().a();
        long $$7 = $$5.r().a();
        boolean $$8 = this.J.d($$0);
        boolean $$9 = this.b($$0);
        boolean bl2 = $$10 = $$4.s() != $$5.s();
        if ($$10 || $$8 != $$9) {
            this.c($$0);
            if (!$$8) {
                this.F.b($$4, $$0);
            }
            if (!$$9) {
                this.F.a($$5, $$0);
            }
            if (!$$8 && $$9) {
                this.J.a($$0);
            }
            if ($$8 && !$$9) {
                this.J.b($$0);
            }
            if ($$6 != $$7) {
                this.J.a($$6, $$7, $$0);
            }
        }
        int $$11 = $$4.a();
        int $$12 = $$4.c();
        int $$13 = this.O + 1;
        if (Math.abs($$11 - $$2) <= $$13 * 2 && Math.abs($$12 - $$3) <= $$13 * 2) {
            int $$14 = Math.min($$2, $$11) - $$13;
            int $$15 = Math.min($$3, $$12) - $$13;
            int $$16 = Math.max($$2, $$11) + $$13;
            int $$17 = Math.max($$3, $$12) + $$13;
            for (int $$18 = $$14; $$18 <= $$16; ++$$18) {
                for (int $$19 = $$15; $$19 <= $$17; ++$$19) {
                    boolean $$20 = ahr.a($$18, $$19, $$11, $$12, this.O);
                    boolean $$21 = ahr.a($$18, $$19, $$2, $$3, this.O);
                    this.a($$0, new clt($$18, $$19), (MutableObject<wd>)new MutableObject(), $$20, $$21);
                }
            }
        } else {
            for (int $$22 = $$11 - $$13; $$22 <= $$11 + $$13; ++$$22) {
                for (int $$23 = $$12 - $$13; $$23 <= $$12 + $$13; ++$$23) {
                    if (!ahr.a($$22, $$23, $$11, $$12, this.O)) continue;
                    boolean $$24 = true;
                    boolean $$25 = false;
                    this.a($$0, new clt($$22, $$23), (MutableObject<wd>)new MutableObject(), true, false);
                }
            }
            for (int $$26 = $$2 - $$13; $$26 <= $$2 + $$13; ++$$26) {
                for (int $$27 = $$3 - $$13; $$27 <= $$3 + $$13; ++$$27) {
                    if (!ahr.a($$26, $$27, $$2, $$3, this.O)) continue;
                    boolean $$28 = false;
                    boolean $$29 = true;
                    this.a($$0, new clt($$26, $$27), (MutableObject<wd>)new MutableObject(), false, true);
                }
            }
        }
    }

    @Override
    public List<aig> a(clt $$0, boolean $$1) {
        Set<aig> $$2 = this.J.a($$0.a());
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (aig $$4 : $$2) {
            hx $$5 = $$4.R();
            if ((!$$1 || !ahr.b($$0.e, $$0.f, $$5.a(), $$5.c(), this.O)) && ($$1 || !ahr.a($$0.e, $$0.f, $$5.a(), $$5.c(), this.O))) continue;
            $$3.add((Object)$$4);
        }
        return $$3.build();
    }

    protected void a(bfj $$0) {
        if ($$0 instanceof btz) {
            return;
        }
        bfn<?> $$1 = $$0.ae();
        int $$2 = $$1.o() * 16;
        if ($$2 == 0) {
            return;
        }
        int $$3 = $$1.p();
        if (this.K.containsKey($$0.af())) {
            throw ac.b(new IllegalStateException("Entity is already tracked!"));
        }
        b $$4 = new b($$0, $$2, $$3, $$1.q());
        this.K.put($$0.af(), (Object)$$4);
        $$4.a(this.q.v());
        if ($$0 instanceof aig) {
            aig $$5 = (aig)$$0;
            this.a($$5, true);
            for (b $$6 : this.K.values()) {
                if ($$6.c == $$5) continue;
                $$6.b($$5);
            }
        }
    }

    protected void b(bfj $$0) {
        b $$3;
        if ($$0 instanceof aig) {
            aig $$1 = (aig)$$0;
            this.a($$1, false);
            for (b $$2 : this.K.values()) {
                $$2.a($$1);
            }
        }
        if (($$3 = (b)this.K.remove($$0.af())) != null) {
            $$3.a();
        }
    }

    protected void l() {
        ArrayList $$0 = Lists.newArrayList();
        List<aig> $$1 = this.q.v();
        for (b $$2 : this.K.values()) {
            boolean $$5;
            hx $$3 = $$2.e;
            hx $$4 = hx.a($$2.c);
            boolean bl2 = $$5 = !Objects.equals($$3, $$4);
            if ($$5) {
                $$2.a($$1);
                bfj $$6 = $$2.c;
                if ($$6 instanceof aig) {
                    $$0.add((aig)$$6);
                }
                $$2.e = $$4;
            }
            if (!$$5 && !this.F.c($$4.r().a())) continue;
            $$2.b.a();
        }
        if (!$$0.isEmpty()) {
            for (b $$7 : this.K.values()) {
                $$7.a($$0);
            }
        }
    }

    public void a(bfj $$0, uo<?> $$1) {
        b $$2 = (b)this.K.get($$0.af());
        if ($$2 != null) {
            $$2.a($$1);
        }
    }

    protected void b(bfj $$0, uo<?> $$1) {
        b $$2 = (b)this.K.get($$0.af());
        if ($$2 != null) {
            $$2.b($$1);
        }
    }

    public void a(List<ddx> $$02) {
        HashMap<aig, List> $$12 = new HashMap<aig, List>();
        for (ddx $$2 : $$02) {
            dei $$6;
            clt $$3 = $$2.f();
            if ($$2 instanceof dei) {
                dei $$4;
                dei $$5 = $$4 = (dei)$$2;
            } else {
                $$6 = this.q.d($$3.e, $$3.f);
            }
            for (aig $$7 : this.a($$3, false)) {
                $$12.computeIfAbsent($$7, $$0 -> new ArrayList()).add($$6);
            }
        }
        $$12.forEach(($$0, $$1) -> $$0.c.a(vf.a($$1)));
    }

    private void a(aig $$0, MutableObject<wd> $$1, dei $$2) {
        if ($$1.getValue() == null) {
            $$1.setValue((Object)new wd($$2, this.r, null, null));
        }
        $$0.a($$2.f(), (uo)$$1.getValue());
        za.a(this.q, $$2.f());
        ArrayList $$3 = Lists.newArrayList();
        ArrayList $$4 = Lists.newArrayList();
        for (b $$5 : this.K.values()) {
            bfj $$6 = $$5.c;
            if ($$6 == $$0 || !$$6.dk().equals($$2.f())) continue;
            $$5.b($$0);
            if ($$6 instanceof bgb && ((bgb)$$6).fP() != null) {
                $$3.add($$6);
            }
            if ($$6.cN().isEmpty()) continue;
            $$4.add($$6);
        }
        if (!$$3.isEmpty()) {
            for (bfj $$7 : $$3) {
                $$0.c.a(new xx($$7, ((bgb)$$7).fP()));
            }
        }
        if (!$$4.isEmpty()) {
            for (bfj $$8 : $$4) {
                $$0.c.a(new yd($$8));
            }
        }
    }

    protected bqz m() {
        return this.x;
    }

    public String n() {
        return this.I;
    }

    void a(clt $$0, ahy $$1) {
        this.E.onChunkStatusChange($$0, $$1);
    }

    class a
    extends ahx {
        protected a(Executor $$0, Executor $$1) {
            super($$0, $$1);
        }

        @Override
        protected boolean a(long $$0) {
            return ahr.this.y.contains($$0);
        }

        @Override
        @Nullable
        protected ahp b(long $$0) {
            return ahr.this.a($$0);
        }

        @Override
        @Nullable
        protected ahp a(long $$0, int $$1, @Nullable ahp $$2, int $$3) {
            return ahr.this.a($$0, $$1, $$2, $$3);
        }
    }

    class b {
        final aie b;
        final bfj c;
        private final int d;
        hx e;
        private final Set<ajb> f = Sets.newIdentityHashSet();

        public b(bfj $$0, int $$1, int $$2, boolean $$3) {
            this.b = new aie(ahr.this.q, $$0, $$2, $$3, this::a);
            this.c = $$0;
            this.d = $$1;
            this.e = hx.a($$0);
        }

        public boolean equals(Object $$0) {
            if ($$0 instanceof b) {
                return ((b)$$0).c.af() == this.c.af();
            }
            return false;
        }

        public int hashCode() {
            return this.c.af();
        }

        public void a(uo<?> $$0) {
            for (ajb $$1 : this.f) {
                $$1.a($$0);
            }
        }

        public void b(uo<?> $$0) {
            this.a($$0);
            if (this.c instanceof aig) {
                ((aig)this.c).c.a($$0);
            }
        }

        public void a() {
            for (ajb $$0 : this.f) {
                this.b.a($$0.f());
            }
        }

        public void a(aig $$0) {
            if (this.f.remove($$0.c)) {
                this.b.a($$0);
            }
        }

        public void b(aig $$0) {
            boolean $$5;
            if ($$0 == this.c) {
                return;
            }
            eei $$1 = $$0.dg().d(this.c.dg());
            double $$3 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$2 = Math.min(this.b(), ahr.this.O * 16);
            double $$4 = $$2 * $$2;
            boolean bl2 = $$5 = $$3 <= $$4 && this.c.a($$0);
            if ($$5) {
                if (this.f.add($$0.c)) {
                    this.b.b($$0);
                }
            } else if (this.f.remove($$0.c)) {
                this.b.a($$0);
            }
        }

        private int a(int $$0) {
            return ahr.this.q.n().b($$0);
        }

        private int b() {
            int $$0 = this.d;
            for (bfj $$1 : this.c.cR()) {
                int $$2 = $$1.ae().o() * 16;
                if ($$2 <= $$0) continue;
                $$0 = $$2;
            }
            return this.a($$0);
        }

        public void a(List<aig> $$0) {
            for (aig $$1 : $$0) {
                this.b($$1);
            }
        }
    }
}

