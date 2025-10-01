/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfb
implements dex,
AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final AtomicBoolean b = new AtomicBoolean();
    private final bcq<bcs.b> c;
    private final dfe d;
    private final Map<clt, a> e = Maps.newLinkedHashMap();
    private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> f = new Long2ObjectLinkedOpenHashMap();
    private static final int g = 1024;

    protected dfb(Path $$0, boolean $$1, String $$2) {
        this.d = new dfe($$0, $$1);
        this.c = new bcq<bcs.b>(new bcs.a(dfb$b.values().length), ac.g(), "IOWorker-" + $$2);
    }

    public boolean a(clt $$0, int $$1) {
        clt $$2 = new clt($$0.e - $$1, $$0.f - $$1);
        clt $$3 = new clt($$0.e + $$1, $$0.f + $$1);
        for (int $$4 = $$2.h(); $$4 <= $$3.h(); ++$$4) {
            for (int $$5 = $$2.i(); $$5 <= $$3.i(); ++$$5) {
                BitSet $$6 = this.a($$4, $$5).join();
                if ($$6.isEmpty()) continue;
                clt $$7 = clt.a($$4, $$5);
                int $$8 = Math.max($$2.e - $$7.e, 0);
                int $$9 = Math.max($$2.f - $$7.f, 0);
                int $$10 = Math.min($$3.e - $$7.e, 31);
                int $$11 = Math.min($$3.f - $$7.f, 31);
                for (int $$12 = $$8; $$12 <= $$10; ++$$12) {
                    for (int $$13 = $$9; $$13 <= $$11; ++$$13) {
                        int $$14 = $$13 * 32 + $$12;
                        if (!$$6.get($$14)) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private CompletableFuture<BitSet> a(int $$0, int $$1) {
        long $$2 = clt.c($$0, $$1);
        Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> long2ObjectLinkedOpenHashMap = this.f;
        synchronized (long2ObjectLinkedOpenHashMap) {
            CompletableFuture<BitSet> $$3 = (CompletableFuture<BitSet>)this.f.getAndMoveToFirst($$2);
            if ($$3 == null) {
                $$3 = this.b($$0, $$1);
                this.f.putAndMoveToFirst($$2, $$3);
                if (this.f.size() > 1024) {
                    this.f.removeLast();
                }
            }
            return $$3;
        }
    }

    private CompletableFuture<BitSet> b(int $$0, int $$1) {
        return CompletableFuture.supplyAsync(() -> {
            clt $$2 = clt.a($$0, $$1);
            clt $$3 = clt.b($$0, $$1);
            BitSet $$4 = new BitSet();
            clt.a($$2, $$3).forEach($$1 -> {
                qr $$5;
                rr $$2 = new rr(new rt(qw.a, "DataVersion"), new rt(qr.b, "blending_data"));
                try {
                    this.a((clt)$$1, $$2).join();
                }
                catch (Exception $$3) {
                    a.warn("Failed to scan chunk {}", $$1, (Object)$$3);
                    return;
                }
                rk $$4 = $$2.d();
                if ($$4 instanceof qr && this.a($$5 = (qr)$$4)) {
                    int $$6 = $$1.k() * 32 + $$1.j();
                    $$4.set($$6);
                }
            });
            return $$4;
        }, ac.f());
    }

    private boolean a(qr $$0) {
        if (!$$0.b("DataVersion", 99) || $$0.h("DataVersion") < 3441) {
            return true;
        }
        return $$0.b("blending_data", 10);
    }

    public CompletableFuture<Void> a(clt $$0, @Nullable qr $$1) {
        return this.a(() -> {
            a $$2 = this.e.computeIfAbsent($$0, $$1 -> new a($$1));
            $$2.a = $$1;
            return Either.left($$2.b);
        }).thenCompose(Function.identity());
    }

    public CompletableFuture<Optional<qr>> a(clt $$0) {
        return this.a(() -> {
            a $$1 = this.e.get($$0);
            if ($$1 != null) {
                return Either.left(Optional.ofNullable($$1.a));
            }
            try {
                qr $$2 = this.d.a($$0);
                return Either.left(Optional.ofNullable($$2));
            }
            catch (Exception $$3) {
                a.warn("Failed to read chunk {}", (Object)$$0, (Object)$$3);
                return Either.right((Object)$$3);
            }
        });
    }

    public CompletableFuture<Void> a(boolean $$02) {
        CompletionStage $$1 = this.a(() -> Either.left(CompletableFuture.allOf((CompletableFuture[])this.e.values().stream().map($$0 -> $$0.b).toArray(CompletableFuture[]::new)))).thenCompose(Function.identity());
        if ($$02) {
            return ((CompletableFuture)$$1).thenCompose($$0 -> this.a(() -> {
                try {
                    this.d.a();
                    return Either.left(null);
                }
                catch (Exception $$0) {
                    a.warn("Failed to synchronize chunks", (Throwable)$$0);
                    return Either.right((Object)$$0);
                }
            }));
        }
        return ((CompletableFuture)$$1).thenCompose($$0 -> this.a(() -> Either.left(null)));
    }

    @Override
    public CompletableFuture<Void> a(clt $$0, rh $$1) {
        return this.a(() -> {
            try {
                a $$2 = this.e.get($$0);
                if ($$2 != null) {
                    if ($$2.a != null) {
                        $$2.a.b($$1);
                    }
                } else {
                    this.d.a($$0, $$1);
                }
                return Either.left(null);
            }
            catch (Exception $$3) {
                a.warn("Failed to bulk scan chunk {}", (Object)$$0, (Object)$$3);
                return Either.right((Object)$$3);
            }
        });
    }

    private <T> CompletableFuture<T> a(Supplier<Either<T, Exception>> $$0) {
        return this.c.c($$1 -> new bcs.b(dfb$b.a.ordinal(), () -> this.a($$1, (Supplier)$$0)));
    }

    private void a() {
        if (this.e.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<clt, a>> $$0 = this.e.entrySet().iterator();
        Map.Entry<clt, a> $$1 = $$0.next();
        $$0.remove();
        this.a($$1.getKey(), $$1.getValue());
        this.b();
    }

    private void b() {
        this.c.a(new bcs.b(dfb$b.b.ordinal(), this::a));
    }

    private void a(clt $$0, a $$1) {
        try {
            this.d.a($$0, $$1.a);
            $$1.b.complete(null);
        }
        catch (Exception $$2) {
            a.error("Failed to store chunk {}", (Object)$$0, (Object)$$2);
            $$1.b.completeExceptionally($$2);
        }
    }

    @Override
    public void close() throws IOException {
        if (!this.b.compareAndSet(false, true)) {
            return;
        }
        this.c.b((? super bcp<Source> $$0) -> new bcs.b(dfb$b.c.ordinal(), () -> $$0.a(apz.a))).join();
        this.c.close();
        try {
            this.d.close();
        }
        catch (Exception $$02) {
            a.error("Failed to close storage", (Throwable)$$02);
        }
    }

    private /* synthetic */ void a(bcp $$0, Supplier $$1) {
        if (!this.b.get()) {
            $$0.a((Either)$$1.get());
        }
        this.b();
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = dfb$b.a();
        }
    }

    static class a {
        @Nullable
        qr a;
        final CompletableFuture<Void> b = new CompletableFuture();

        public a(@Nullable qr $$0) {
            this.a = $$0;
        }
    }
}

