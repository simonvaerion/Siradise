/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.shorts.ShortOpenHashSet
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

public class ahp {
    public static final Either<ddx, a> a = Either.right((Object)ahp$a.b);
    public static final CompletableFuture<Either<ddx, a>> b = CompletableFuture.completedFuture(a);
    public static final Either<dei, a> c = Either.right((Object)ahp$a.b);
    private static final Either<ddx, a> d = Either.right((Object)ahp$a.b);
    private static final CompletableFuture<Either<dei, a>> e = CompletableFuture.completedFuture(c);
    private static final List<dec> f = dec.a();
    private final AtomicReferenceArray<CompletableFuture<Either<ddx, a>>> g = new AtomicReferenceArray(f.size());
    private final cmo h;
    private volatile CompletableFuture<Either<dei, a>> i = e;
    private volatile CompletableFuture<Either<dei, a>> j = e;
    private volatile CompletableFuture<Either<dei, a>> k = e;
    private CompletableFuture<ddx> l = CompletableFuture.completedFuture(null);
    @Nullable
    private final aoe<b> m = null;
    private int n;
    private int o;
    private int p;
    final clt q;
    private boolean r;
    private final ShortSet[] s;
    private final BitSet t = new BitSet();
    private final BitSet u = new BitSet();
    private final dwt v;
    private final c w;
    private final d x;
    private boolean y;
    private CompletableFuture<Void> z = CompletableFuture.completedFuture(null);

    public ahp(clt $$0, int $$1, cmo $$2, dwt $$3, c $$4, d $$5) {
        this.q = $$0;
        this.h = $$2;
        this.v = $$3;
        this.w = $$4;
        this.x = $$5;
        this.o = this.n = ahq.a + 1;
        this.p = this.n;
        this.a($$1);
        this.s = new ShortSet[$$2.ak()];
    }

    public CompletableFuture<Either<ddx, a>> a(dec $$0) {
        CompletableFuture<Either<ddx, a>> $$1 = this.g.get($$0.c());
        return $$1 == null ? b : $$1;
    }

    public CompletableFuture<Either<ddx, a>> b(dec $$0) {
        if (ahq.a(this.o).b($$0)) {
            return this.a($$0);
        }
        return b;
    }

    public CompletableFuture<Either<dei, a>> a() {
        return this.j;
    }

    public CompletableFuture<Either<dei, a>> b() {
        return this.k;
    }

    public CompletableFuture<Either<dei, a>> c() {
        return this.i;
    }

    @Nullable
    public dei d() {
        CompletableFuture<Either<dei, a>> $$0 = this.a();
        Either $$1 = $$0.getNow(null);
        if ($$1 == null) {
            return null;
        }
        return $$1.left().orElse(null);
    }

    @Nullable
    public dei e() {
        CompletableFuture<Either<dei, a>> $$0 = this.c();
        Either $$1 = $$0.getNow(null);
        if ($$1 == null) {
            return null;
        }
        return $$1.left().orElse(null);
    }

    @Nullable
    public dec f() {
        for (int $$0 = f.size() - 1; $$0 >= 0; --$$0) {
            dec $$1 = f.get($$0);
            CompletableFuture<Either<ddx, a>> $$2 = this.a($$1);
            if (!$$2.getNow(a).left().isPresent()) continue;
            return $$1;
        }
        return null;
    }

    @Nullable
    public ddx g() {
        for (int $$0 = f.size() - 1; $$0 >= 0; --$$0) {
            Optional $$3;
            dec $$1 = f.get($$0);
            CompletableFuture<Either<ddx, a>> $$2 = this.a($$1);
            if ($$2.isCompletedExceptionally() || !($$3 = $$2.getNow(a).left()).isPresent()) continue;
            return (ddx)$$3.get();
        }
        return null;
    }

    public CompletableFuture<ddx> h() {
        return this.l;
    }

    public void a(gu $$0) {
        dei $$1 = this.d();
        if ($$1 == null) {
            return;
        }
        int $$2 = this.h.e($$0.v());
        if (this.s[$$2] == null) {
            this.r = true;
            this.s[$$2] = new ShortOpenHashSet();
        }
        this.s[$$2].add(hx.b($$0));
    }

    public void a(cmv $$0, int $$1) {
        Either $$2 = this.b(dec.k).getNow(null);
        if ($$2 == null) {
            return;
        }
        ddx $$3 = $$2.left().orElse(null);
        if ($$3 == null) {
            return;
        }
        $$3.a(true);
        dei $$4 = this.d();
        if ($$4 == null) {
            return;
        }
        int $$5 = this.v.d();
        int $$6 = this.v.e();
        if ($$1 < $$5 || $$1 > $$6) {
            return;
        }
        int $$7 = $$1 - $$5;
        if ($$0 == cmv.a) {
            this.u.set($$7);
        } else {
            this.t.set($$7);
        }
    }

    public void a(dei $$0) {
        if (!this.r && this.u.isEmpty() && this.t.isEmpty()) {
            return;
        }
        cmm $$1 = $$0.F();
        if (!this.u.isEmpty() || !this.t.isEmpty()) {
            List<aig> $$22 = this.x.a(this.q, true);
            if (!$$22.isEmpty()) {
                wg $$32 = new wg($$0.f(), this.v, this.u, this.t);
                this.a($$22, $$32);
            }
            this.u.clear();
            this.t.clear();
        }
        if (!this.r) {
            return;
        }
        List<aig> $$4 = this.x.a(this.q, false);
        for (int $$5 = 0; $$5 < this.s.length; ++$$5) {
            ShortSet $$6 = this.s[$$5];
            if ($$6 == null) continue;
            this.s[$$5] = null;
            if ($$4.isEmpty()) continue;
            int $$7 = this.h.g($$5);
            hx $$8 = hx.a($$0.f(), $$7);
            if ($$6.size() == 1) {
                gu $$9 = $$8.g($$6.iterator().nextShort());
                dcb $$10 = $$1.a_($$9);
                this.a($$4, new vb($$9, $$10));
                this.a($$4, $$1, $$9, $$10);
                continue;
            }
            dej $$11 = $$0.b($$5);
            xh $$12 = new xh($$8, $$6, $$11);
            this.a($$4, $$12);
            $$12.a((gu $$2, dcb $$3) -> this.a($$4, $$1, (gu)$$2, (dcb)$$3));
        }
        this.r = false;
    }

    private void a(List<aig> $$0, cmm $$1, gu $$2, dcb $$3) {
        if ($$3.t()) {
            this.a($$0, $$1, $$2);
        }
    }

    private void a(List<aig> $$0, cmm $$1, gu $$2) {
        uo<ur> $$4;
        czn $$3 = $$1.c_($$2);
        if ($$3 != null && ($$4 = $$3.h()) != null) {
            this.a($$0, $$4);
        }
    }

    private void a(List<aig> $$0, uo<?> $$12) {
        $$0.forEach($$1 -> $$1.c.a($$12));
    }

    public CompletableFuture<Either<ddx, a>> a(dec $$0, ahr $$1) {
        int $$2 = $$0.c();
        CompletableFuture<Either<ddx, a>> $$3 = this.g.get($$2);
        if ($$3 != null) {
            Either<ddx, a> $$4 = $$3.getNow(d);
            if ($$4 == null) {
                String $$5 = "value in future for status: " + $$0 + " was incorrectly set to null at chunk: " + this.q;
                throw $$1.a(new IllegalStateException("null value previously set for chunk status"), $$5);
            }
            if ($$4 == d || $$4.right().isEmpty()) {
                return $$3;
            }
        }
        if (ahq.a(this.o).b($$0)) {
            CompletableFuture<Either<ddx, a>> $$6 = $$1.a(this, $$0);
            this.a($$6, "schedule " + $$0);
            this.g.set($$2, $$6);
            return $$6;
        }
        return $$3 == null ? b : $$3;
    }

    protected void a(String $$02, CompletableFuture<?> $$12) {
        if (this.m != null) {
            this.m.a(new b(Thread.currentThread(), $$12, $$02));
        }
        this.l = this.l.thenCombine($$12, ($$0, $$1) -> $$0);
    }

    private void a(CompletableFuture<? extends Either<? extends ddx, a>> $$0, String $$1) {
        if (this.m != null) {
            this.m.a(new b(Thread.currentThread(), $$0, $$1));
        }
        this.l = this.l.thenCombine($$0, ($$02, $$12) -> (ddx)$$12.map($$0 -> $$0, $$1 -> $$02));
    }

    public ahy i() {
        return ahq.b(this.o);
    }

    public clt j() {
        return this.q;
    }

    public int k() {
        return this.o;
    }

    public int l() {
        return this.p;
    }

    private void b(int $$0) {
        this.p = $$0;
    }

    public void a(int $$0) {
        this.o = $$0;
    }

    private void a(ahr $$0, CompletableFuture<Either<dei, a>> $$1, Executor $$2, ahy $$3) {
        this.z.cancel(false);
        CompletableFuture $$4 = new CompletableFuture();
        $$4.thenRunAsync(() -> $$0.a(this.q, $$3), $$2);
        this.z = $$4;
        $$1.thenAccept($$12 -> $$12.ifLeft($$1 -> $$4.complete(null)));
    }

    private void a(ahr $$0, ahy $$1) {
        this.z.cancel(false);
        $$0.a(this.q, $$1);
    }

    protected void a(ahr $$0, Executor $$1) {
        dec $$2 = ahq.a(this.n);
        dec $$3 = ahq.a(this.o);
        boolean $$4 = ahq.e(this.n);
        boolean $$5 = ahq.e(this.o);
        ahy $$6 = ahq.b(this.n);
        ahy $$7 = ahq.b(this.o);
        if ($$4) {
            int $$9;
            Either $$8 = Either.right((Object)new a(){

                public String toString() {
                    return "Unloaded ticket level " + ahp.this.q;
                }
            });
            int n2 = $$9 = $$5 ? $$3.c() + 1 : 0;
            while ($$9 <= $$2.c()) {
                CompletableFuture<Either<ddx, a>> $$10 = this.g.get($$9);
                if ($$10 == null) {
                    this.g.set($$9, CompletableFuture.completedFuture($$8));
                }
                ++$$9;
            }
        }
        boolean $$11 = $$6.a(ahy.b);
        boolean $$12 = $$7.a(ahy.b);
        this.y |= $$12;
        if (!$$11 && $$12) {
            this.i = $$0.c(this);
            this.a($$0, this.i, $$1, ahy.b);
            this.a(this.i, "full");
        }
        if ($$11 && !$$12) {
            this.i.complete(c);
            this.i = e;
        }
        boolean $$13 = $$6.a(ahy.c);
        boolean $$14 = $$7.a(ahy.c);
        if (!$$13 && $$14) {
            this.j = $$0.b(this);
            this.a($$0, this.j, $$1, ahy.c);
            this.a(this.j, "ticking");
        }
        if ($$13 && !$$14) {
            this.j.complete(c);
            this.j = e;
        }
        boolean $$15 = $$6.a(ahy.d);
        boolean $$16 = $$7.a(ahy.d);
        if (!$$15 && $$16) {
            if (this.k != e) {
                throw ac.b(new IllegalStateException());
            }
            this.k = $$0.a(this);
            this.a($$0, this.k, $$1, ahy.d);
            this.a(this.k, "entity ticking");
        }
        if ($$15 && !$$16) {
            this.k.complete(c);
            this.k = e;
        }
        if (!$$7.a($$6)) {
            this.a($$0, $$7);
        }
        this.w.onLevelChange(this.q, this::l, this.o, this::b);
        this.n = this.o;
    }

    public boolean m() {
        return this.y;
    }

    public void n() {
        this.y = ahq.b(this.o).a(ahy.b);
    }

    public void a(deh $$0) {
        for (int $$1 = 0; $$1 < this.g.length(); ++$$1) {
            Optional $$3;
            CompletableFuture<Either<ddx, a>> $$2 = this.g.get($$1);
            if ($$2 == null || ($$3 = $$2.getNow(a).left()).isEmpty() || !($$3.get() instanceof des)) continue;
            this.g.set($$1, CompletableFuture.completedFuture(Either.left((Object)$$0)));
        }
        this.a(CompletableFuture.completedFuture(Either.left((Object)$$0.C())), "replaceProto");
    }

    public List<Pair<dec, CompletableFuture<Either<ddx, a>>>> o() {
        ArrayList<Pair<dec, CompletableFuture<Either<ddx, a>>>> $$0 = new ArrayList<Pair<dec, CompletableFuture<Either<ddx, a>>>>();
        for (int $$1 = 0; $$1 < f.size(); ++$$1) {
            $$0.add((Pair<dec, CompletableFuture<Either<ddx, a>>>)Pair.of((Object)f.get($$1), this.g.get($$1)));
        }
        return $$0;
    }

    @FunctionalInterface
    public static interface c {
        public void onLevelChange(clt var1, IntSupplier var2, int var3, IntConsumer var4);
    }

    public static interface d {
        public List<aig> a(clt var1, boolean var2);
    }

    static final class b {
        private final Thread a;
        private final CompletableFuture<?> b;
        private final String c;

        b(Thread $$0, CompletableFuture<?> $$1, String $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    public static interface a {
        public static final a b = new a(){

            public String toString() {
                return "UNLOADED";
            }
        };
    }
}

