/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ald<S>
implements akt {
    private static final int c = 2;
    private static final int d = 2;
    private static final int e = 1;
    protected final CompletableFuture<apz> a = new CompletableFuture();
    protected CompletableFuture<List<S>> b;
    final Set<akr> f;
    private final int g;
    private int h;
    private int i;
    private final AtomicInteger j = new AtomicInteger();
    private final AtomicInteger k = new AtomicInteger();

    public static ald<Void> a(akx $$0, List<akr> $$12, Executor $$22, Executor $$32, CompletableFuture<apz> $$42) {
        return new ald<Void>($$22, $$32, $$0, $$12, ($$1, $$2, $$3, $$4, $$5) -> $$3.a($$1, $$2, bak.a, bak.a, $$22, $$5), $$42);
    }

    protected ald(Executor $$0, final Executor $$12, akx $$2, List<akr> $$3, a<S> $$4, CompletableFuture<apz> $$5) {
        this.g = $$3.size();
        this.j.incrementAndGet();
        $$5.thenRun(this.k::incrementAndGet);
        ArrayList $$6 = Lists.newArrayList();
        CompletableFuture<apz> $$7 = $$5;
        this.f = Sets.newHashSet($$3);
        for (final akr $$8 : $$3) {
            final CompletableFuture<apz> $$9 = $$7;
            CompletableFuture<S> $$10 = $$4.create(new akr.a(){

                @Override
                public <T> CompletableFuture<T> a(T $$0) {
                    $$12.execute(() -> {
                        ald.this.f.remove($$8);
                        if (ald.this.f.isEmpty()) {
                            ald.this.a.complete(apz.a);
                        }
                    });
                    return ald.this.a.thenCombine((CompletionStage)$$9, ($$1, $$2) -> $$0);
                }
            }, $$2, $$8, $$1 -> {
                this.j.incrementAndGet();
                $$0.execute(() -> {
                    $$1.run();
                    this.k.incrementAndGet();
                });
            }, $$1 -> {
                ++this.h;
                $$12.execute(() -> {
                    $$1.run();
                    ++this.i;
                });
            });
            $$6.add($$10);
            $$7 = $$10;
        }
        this.b = ac.c($$6);
    }

    @Override
    public CompletableFuture<?> a() {
        return this.b;
    }

    @Override
    public float b() {
        int $$0 = this.g - this.f.size();
        float $$1 = this.k.get() * 2 + this.i * 2 + $$0 * 1;
        float $$2 = this.j.get() * 2 + this.h * 2 + this.g * 1;
        return $$1 / $$2;
    }

    public static akt a(akx $$0, List<akr> $$1, Executor $$2, Executor $$3, CompletableFuture<apz> $$4, boolean $$5) {
        if ($$5) {
            return new aks($$0, $$1, $$2, $$3, $$4);
        }
        return ald.a($$0, $$1, $$2, $$3, $$4);
    }

    protected static interface a<S> {
        public CompletableFuture<S> create(akr.a var1, akx var2, akr var3, Executor var4, Executor var5);
    }
}

