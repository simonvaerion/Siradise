/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Either
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class aid
extends deb {
    private static final List<dec> b = dec.a();
    private final ahx c;
    final aif d;
    final Thread e;
    final aii f;
    private final b g;
    public final ahr a;
    private final dyu h;
    private long i;
    private boolean j = true;
    private boolean k = true;
    private static final int l = 4;
    private final long[] m = new long[4];
    private final dec[] n = new dec[4];
    private final ddx[] o = new ddx[4];
    @Nullable
    @aqa
    private cmx.d p;

    public aid(aif $$0, dyy.c $$1, DataFixer $$2, dvu $$3, Executor $$4, ddy $$5, int $$6, int $$7, boolean $$8, aio $$9, dfr $$10, Supplier<dyu> $$11) {
        this.d = $$0;
        this.g = new b($$0);
        this.e = Thread.currentThread();
        File $$12 = $$1.a($$0.ac()).resolve("data").toFile();
        $$12.mkdirs();
        this.h = new dyu($$12, $$2);
        this.a = new ahr($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
        this.f = this.a.e();
        this.c = this.a.j();
        this.c.b($$7);
        this.r();
    }

    public aii a() {
        return this.f;
    }

    @Nullable
    private ahp b(long $$0) {
        return this.a.b($$0);
    }

    public int b() {
        return this.a.h();
    }

    private void a(long $$0, ddx $$1, dec $$2) {
        for (int $$3 = 3; $$3 > 0; --$$3) {
            this.m[$$3] = this.m[$$3 - 1];
            this.n[$$3] = this.n[$$3 - 1];
            this.o[$$3] = this.o[$$3 - 1];
        }
        this.m[0] = $$0;
        this.n[0] = $$2;
        this.o[0] = $$1;
    }

    @Override
    @Nullable
    public ddx a(int $$02, int $$12, dec $$2, boolean $$3) {
        if (Thread.currentThread() != this.e) {
            return CompletableFuture.supplyAsync(() -> this.a($$02, $$12, $$2, $$3), this.g).join();
        }
        ban $$4 = this.d.ad();
        $$4.d("getChunk");
        long $$5 = clt.c($$02, $$12);
        for (int $$6 = 0; $$6 < 4; ++$$6) {
            ddx $$7;
            if ($$5 != this.m[$$6] || $$2 != this.n[$$6] || ($$7 = this.o[$$6]) == null && $$3) continue;
            return $$7;
        }
        $$4.d("getChunkCacheMiss");
        CompletableFuture<Either<ddx, ahp.a>> $$8 = this.c($$02, $$12, $$2, $$3);
        this.g.c($$8::isDone);
        ddx $$9 = (ddx)$$8.join().map($$0 -> $$0, $$1 -> {
            if ($$3) {
                throw ac.b(new IllegalStateException("Chunk not there when requested: " + $$1));
            }
            return null;
        });
        this.a($$5, $$9, $$2);
        return $$9;
    }

    @Override
    @Nullable
    public dei a(int $$0, int $$1) {
        if (Thread.currentThread() != this.e) {
            return null;
        }
        this.d.ad().d("getChunkNow");
        long $$2 = clt.c($$0, $$1);
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            if ($$2 != this.m[$$3] || this.n[$$3] != dec.n) continue;
            ddx $$4 = this.o[$$3];
            return $$4 instanceof dei ? (dei)$$4 : null;
        }
        ahp $$5 = this.b($$2);
        if ($$5 == null) {
            return null;
        }
        Either $$6 = $$5.b(dec.n).getNow(null);
        if ($$6 == null) {
            return null;
        }
        ddx $$7 = $$6.left().orElse(null);
        if ($$7 != null) {
            this.a($$2, $$7, dec.n);
            if ($$7 instanceof dei) {
                return (dei)$$7;
            }
        }
        return null;
    }

    private void r() {
        Arrays.fill(this.m, clt.a);
        Arrays.fill(this.n, null);
        Arrays.fill(this.o, null);
    }

    public CompletableFuture<Either<ddx, ahp.a>> b(int $$02, int $$1, dec $$2, boolean $$3) {
        CompletionStage $$6;
        boolean $$4;
        boolean bl2 = $$4 = Thread.currentThread() == this.e;
        if ($$4) {
            CompletableFuture<Either<ddx, ahp.a>> $$5 = this.c($$02, $$1, $$2, $$3);
            this.g.c($$5::isDone);
        } else {
            $$6 = CompletableFuture.supplyAsync(() -> this.c($$02, $$1, $$2, $$3), this.g).thenCompose($$0 -> $$0);
        }
        return $$6;
    }

    private CompletableFuture<Either<ddx, ahp.a>> c(int $$0, int $$1, dec $$2, boolean $$3) {
        clt $$4 = new clt($$0, $$1);
        long $$5 = $$4.a();
        int $$6 = ahq.a($$2);
        ahp $$7 = this.b($$5);
        if ($$3) {
            this.c.a(aik.h, $$4, $$6, $$4);
            if (this.a($$7, $$6)) {
                ban $$8 = this.d.ad();
                $$8.a("chunkLoad");
                this.s();
                $$7 = this.b($$5);
                $$8.c();
                if (this.a($$7, $$6)) {
                    throw ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
                }
            }
        }
        if (this.a($$7, $$6)) {
            return ahp.b;
        }
        return $$7.a($$2, this.a);
    }

    private boolean a(@Nullable ahp $$0, int $$1) {
        return $$0 == null || $$0.k() > $$1;
    }

    @Override
    public boolean b(int $$0, int $$1) {
        int $$3;
        ahp $$2 = this.b(new clt($$0, $$1).a());
        return !this.a($$2, $$3 = ahq.a(dec.n));
    }

    @Override
    @Nullable
    public dek c(int $$0, int $$1) {
        long $$2 = clt.c($$0, $$1);
        ahp $$3 = this.b($$2);
        if ($$3 == null) {
            return null;
        }
        int $$4 = b.size() - 1;
        while (true) {
            dec $$5;
            Optional $$6;
            if (($$6 = $$3.a($$5 = b.get($$4)).getNow(ahp.a).left()).isPresent()) {
                return (dek)$$6.get();
            }
            if ($$5 == dec.k.d()) break;
            --$$4;
        }
        return null;
    }

    public cmm c() {
        return this.d;
    }

    public boolean d() {
        return this.g.x();
    }

    boolean s() {
        boolean $$0 = this.c.a(this.a);
        boolean $$1 = this.a.g();
        if ($$0 || $$1) {
            this.r();
            return true;
        }
        return false;
    }

    public boolean a(long $$0) {
        ahp $$1 = this.b($$0);
        if ($$1 == null) {
            return false;
        }
        if (!this.d.a($$0)) {
            return false;
        }
        Either $$2 = $$1.a().getNow(null);
        return $$2 != null && $$2.left().isPresent();
    }

    public void a(boolean $$0) {
        this.s();
        this.a.a($$0);
    }

    @Override
    public void close() throws IOException {
        this.a(true);
        this.f.close();
        this.a.close();
    }

    @Override
    public void a(BooleanSupplier $$0, boolean $$1) {
        this.d.ad().a("purge");
        this.c.a();
        this.s();
        this.d.ad().b("chunks");
        if ($$1) {
            this.t();
        }
        this.d.ad().b("unload");
        this.a.a($$0);
        this.d.ad().c();
        this.r();
    }

    private void t() {
        cmx.d $$8;
        long $$02 = this.d.V();
        long $$1 = $$02 - this.i;
        this.i = $$02;
        boolean $$2 = this.d.af();
        if ($$2) {
            this.a.l();
            return;
        }
        dyv $$3 = this.d.u_();
        ban $$4 = this.d.ad();
        $$4.a("pollingChunks");
        int $$5 = this.d.X().c(cmi.n);
        boolean $$6 = $$3.e() % 400L == 0L;
        $$4.a("naturalSpawnCount");
        int $$7 = this.c.b();
        this.p = $$8 = cmx.a($$7, this.d.y(), this::a, new cmw(this.a));
        $$4.b("filteringLoadedChunks");
        ArrayList $$9 = Lists.newArrayListWithCapacity((int)$$7);
        for (ahp $$10 : this.a.k()) {
            dei $$11 = $$10.d();
            if ($$11 == null) continue;
            $$9.add(new a($$11, $$10));
        }
        $$4.b("spawnAndTick");
        boolean $$12 = this.d.X().b(cmi.e);
        Collections.shuffle($$9);
        for (a $$13 : $$9) {
            dei $$14 = $$13.a;
            clt $$15 = $$14.f();
            if (!this.d.a($$15) || !this.a.c($$15)) continue;
            $$14.a($$1);
            if ($$12 && (this.j || this.k) && this.d.w_().a($$15)) {
                cmx.a(this.d, $$14, $$8, this.k, this.j, $$6);
            }
            if (!this.d.a($$15.a())) continue;
            this.d.a($$14, $$5);
        }
        $$4.b("customSpawners");
        if ($$12) {
            this.d.a(this.j, this.k);
        }
        $$4.b("broadcast");
        $$9.forEach($$0 -> $$0.b.a($$0.a));
        $$4.c();
        $$4.c();
        this.a.l();
    }

    private void a(long $$0, Consumer<dei> $$1) {
        ahp $$2 = this.b($$0);
        if ($$2 != null) {
            $$2.c().getNow(ahp.c).left().ifPresent($$1);
        }
    }

    @Override
    public String e() {
        return Integer.toString(this.j());
    }

    @VisibleForTesting
    public int f() {
        return this.g.bm();
    }

    public ddy g() {
        return this.a.a();
    }

    public ddz h() {
        return this.a.b();
    }

    public dhy i() {
        return this.a.c();
    }

    @Override
    public int j() {
        return this.a.i();
    }

    public void a(gu $$0) {
        int $$2;
        int $$1 = hx.a($$0.u());
        ahp $$3 = this.b(clt.c($$1, $$2 = hx.a($$0.w())));
        if ($$3 != null) {
            $$3.a($$0);
        }
    }

    @Override
    public void a(cmv $$0, hx $$1) {
        this.g.execute(() -> {
            ahp $$2 = this.b($$1.r().a());
            if ($$2 != null) {
                $$2.a($$0, $$1.b());
            }
        });
    }

    public <T> void a(aik<T> $$0, clt $$1, int $$2, T $$3) {
        this.c.c($$0, $$1, $$2, $$3);
    }

    public <T> void b(aik<T> $$0, clt $$1, int $$2, T $$3) {
        this.c.d($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(clt $$0, boolean $$1) {
        this.c.a($$0, $$1);
    }

    public void a(aig $$0) {
        if (!$$0.dD()) {
            this.a.a($$0);
        }
    }

    public void a(bfj $$0) {
        this.a.b($$0);
    }

    public void b(bfj $$0) {
        this.a.a($$0);
    }

    public void a(bfj $$0, uo<?> $$1) {
        this.a.b($$0, $$1);
    }

    public void b(bfj $$0, uo<?> $$1) {
        this.a.a($$0, $$1);
    }

    public void a(int $$0) {
        this.a.a($$0);
    }

    public void b(int $$0) {
        this.c.b($$0);
    }

    @Override
    public void a(boolean $$0, boolean $$1) {
        this.j = $$0;
        this.k = $$1;
    }

    public String a(clt $$0) {
        return this.a.a($$0);
    }

    public dyu k() {
        return this.h;
    }

    public bqz l() {
        return this.a.m();
    }

    public dex m() {
        return this.a.p();
    }

    @Nullable
    @aqa
    public cmx.d n() {
        return this.p;
    }

    public void o() {
        this.c.e();
    }

    @Override
    public /* synthetic */ dwt p() {
        return this.a();
    }

    @Override
    public /* synthetic */ cls q() {
        return this.c();
    }

    final class b
    extends bcn<Runnable> {
        b(cmm $$0) {
            super("Chunk source main thread executor for " + $$0.ac().a());
        }

        @Override
        protected Runnable f(Runnable $$0) {
            return $$0;
        }

        @Override
        protected boolean e(Runnable $$0) {
            return true;
        }

        @Override
        protected boolean at() {
            return true;
        }

        @Override
        protected Thread au() {
            return aid.this.e;
        }

        @Override
        protected void d(Runnable $$0) {
            aid.this.d.ad().d("runTask");
            super.d($$0);
        }

        @Override
        protected boolean x() {
            if (aid.this.s()) {
                return true;
            }
            aid.this.f.b();
            return super.x();
        }
    }

    static final class a
    extends Record {
        final dei a;
        final ahp b;

        a(dei $$0, ahp $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chunk;holder", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chunk;holder", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chunk;holder", "a", "b"}, this, $$0);
        }

        public dei a() {
            return this.a;
        }

        public ahp b() {
            return this.b;
        }
    }
}

