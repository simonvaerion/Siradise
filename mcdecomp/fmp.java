/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.google.common.primitives.Doubles
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.primitives.Doubles;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmp {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 4;
    private static final eio c = eih.j;
    private static final int d = 2;
    private final PriorityBlockingQueue<c.a> e = Queues.newPriorityBlockingQueue();
    private final Queue<c.a> f = Queues.newLinkedBlockingDeque();
    private int g = 2;
    private final Queue<fjk> h;
    private final Queue<Runnable> i = Queues.newConcurrentLinkedQueue();
    private volatile int j;
    private volatile int k;
    final fjk l;
    private final bcq<Runnable> m;
    private final Executor n;
    few o;
    final fjv p;
    private eei q = eei.b;

    public fmp(few $$0, fjv $$1, Executor $$2, boolean $$3, fjk $$4) {
        this.o = $$0;
        this.p = $$1;
        int $$5 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (fkf.G().stream().mapToInt(fkf::H).sum() * 4) - 1);
        int $$6 = Runtime.getRuntime().availableProcessors();
        int $$7 = $$3 ? $$6 : Math.min($$6, 4);
        int $$8 = Math.max(1, Math.min($$7, $$5));
        this.l = $$4;
        ArrayList $$9 = Lists.newArrayListWithExpectedSize((int)$$8);
        try {
            for (int $$10 = 0; $$10 < $$8; ++$$10) {
                $$9.add(new fjk());
            }
        }
        catch (OutOfMemoryError $$11) {
            a.warn("Allocated only {}/{} buffers", (Object)$$9.size(), (Object)$$8);
            int $$12 = Math.min($$9.size() * 2 / 3, $$9.size() - 1);
            for (int $$13 = 0; $$13 < $$12; ++$$13) {
                $$9.remove($$9.size() - 1);
            }
            System.gc();
        }
        this.h = Queues.newArrayDeque((Iterable)$$9);
        this.k = this.h.size();
        this.n = $$2;
        this.m = bcq.a($$2, "Chunk Renderer");
        this.m.a(this::j);
    }

    public void a(few $$0) {
        this.o = $$0;
    }

    private void j() {
        if (this.h.isEmpty()) {
            return;
        }
        c.a $$02 = this.k();
        if ($$02 == null) {
            return;
        }
        fjk $$12 = this.h.poll();
        this.j = this.e.size() + this.f.size();
        this.k = this.h.size();
        ((CompletableFuture)CompletableFuture.supplyAsync(ac.a($$02.b(), () -> $$02.a($$12)), this.n).thenCompose($$0 -> $$0)).whenComplete(($$1, $$2) -> {
            if ($$2 != null) {
                enn.N().a(o.a($$2, "Batching chunks"));
                return;
            }
            this.m.a(() -> {
                if ($$1 == fmp$a.a) {
                    $$12.a();
                } else {
                    $$12.b();
                }
                this.h.add($$12);
                this.k = this.h.size();
                this.j();
            });
        });
    }

    @Nullable
    private c.a k() {
        c.a $$0;
        if (this.g <= 0 && ($$0 = this.f.poll()) != null) {
            this.g = 2;
            return $$0;
        }
        c.a $$1 = this.e.poll();
        if ($$1 != null) {
            --this.g;
            return $$1;
        }
        this.g = 2;
        return this.f.poll();
    }

    public String a() {
        return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.j, this.i.size(), this.k);
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.i.size();
    }

    public int d() {
        return this.k;
    }

    public void a(eei $$0) {
        this.q = $$0;
    }

    public eei e() {
        return this.q;
    }

    public void f() {
        Runnable $$0;
        while (($$0 = this.i.poll()) != null) {
            $$0.run();
        }
    }

    public void a(c $$0, fms $$1) {
        $$0.b($$1);
    }

    public void g() {
        this.l();
    }

    public void a(c.a $$0) {
        this.m.a(() -> {
            if ($$0.c) {
                this.e.offer($$0);
            } else {
                this.f.offer($$0);
            }
            this.j = this.e.size() + this.f.size();
            this.j();
        });
    }

    public CompletableFuture<Void> a(eie.b $$0, eim $$1) {
        return CompletableFuture.runAsync(() -> {
            if ($$1.e()) {
                return;
            }
            $$1.a();
            $$1.a($$0);
            eim.b();
        }, this.i::add);
    }

    private void l() {
        while (!this.e.isEmpty()) {
            c.a $$0 = this.e.poll();
            if ($$0 == null) continue;
            $$0.a();
        }
        while (!this.f.isEmpty()) {
            c.a $$1 = this.f.poll();
            if ($$1 == null) continue;
            $$1.a();
        }
        this.j = 0;
    }

    public boolean h() {
        return this.j == 0 && this.i.isEmpty();
    }

    public void i() {
        this.l();
        this.m.close();
        this.h.clear();
    }

    public class fmp$c {
        public static final int a = 16;
        public final int b;
        public final AtomicReference<fmp$b> c = new AtomicReference<fmp$b>(fmp$b.a);
        final AtomicInteger e = new AtomicInteger(0);
        @Nullable
        private b f;
        @Nullable
        private c g;
        private final Set<czn> h = Sets.newHashSet();
        private final Map<fkf, eim> i = fkf.G().stream().collect(Collectors.toMap($$0 -> $$0, $$0 -> new eim(eim.a.a)));
        private eed j;
        private boolean k = true;
        final gu.a l = new gu.a(-1, -1, -1);
        private final gu.a[] m = ac.a(new gu.a[6], $$0 -> {
            for (int $$1 = 0; $$1 < ((gu.a[])$$0).length; ++$$1) {
                $$0[$$1] = new gu.a();
            }
        });
        private boolean n;

        public fmp$c(int $$1, int $$2, int $$3, int $$4) {
            this.b = $$1;
            this.a($$2, $$3, $$4);
        }

        private boolean a(gu $$0) {
            return fmp.this.o.a(hx.a($$0.u()), hx.a($$0.w()), dec.n, false) != null;
        }

        public boolean a() {
            int $$0 = 24;
            if (this.c() > 576.0) {
                return this.a(this.m[ha.e.ordinal()]) && this.a(this.m[ha.c.ordinal()]) && this.a(this.m[ha.f.ordinal()]) && this.a(this.m[ha.d.ordinal()]);
            }
            return true;
        }

        public eed b() {
            return this.j;
        }

        public eim a(fkf $$0) {
            return this.i.get($$0);
        }

        public void a(int $$0, int $$1, int $$2) {
            this.k();
            this.l.d($$0, $$1, $$2);
            this.j = new eed($$0, $$1, $$2, $$0 + 16, $$1 + 16, $$2 + 16);
            for (ha $$3 : ha.values()) {
                this.m[$$3.ordinal()].g(this.l).c($$3, 16);
            }
        }

        protected double c() {
            emz $$0 = enn.N().j.m();
            double $$1 = this.j.a + 8.0 - $$0.b().c;
            double $$2 = this.j.b + 8.0 - $$0.b().d;
            double $$3 = this.j.c + 8.0 - $$0.b().e;
            return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
        }

        void a(eie $$0) {
            $$0.a(eio.b.h, eih.j);
        }

        public fmp$b d() {
            return this.c.get();
        }

        private void k() {
            this.j();
            this.c.set(fmp$b.a);
            this.k = true;
        }

        public void e() {
            this.k();
            this.i.values().forEach(eim::close);
        }

        public gu f() {
            return this.l;
        }

        public void a(boolean $$0) {
            boolean $$1 = this.k;
            this.k = true;
            this.n = $$0 | ($$1 && this.n);
        }

        public void g() {
            this.k = false;
            this.n = false;
        }

        public boolean h() {
            return this.k;
        }

        public boolean i() {
            return this.k && this.n;
        }

        public gu a(ha $$0) {
            return this.m[$$0.ordinal()];
        }

        public boolean a(fkf $$0, fmp $$1) {
            fmp$b $$2 = this.d();
            if (this.g != null) {
                this.g.a();
            }
            if (!$$2.b.contains($$0)) {
                return false;
            }
            this.g = new c(this.c(), $$2);
            $$1.a(this.g);
            return true;
        }

        protected boolean j() {
            boolean $$0 = false;
            if (this.f != null) {
                this.f.a();
                this.f = null;
                $$0 = true;
            }
            if (this.g != null) {
                this.g.a();
                this.g = null;
            }
            return $$0;
        }

        public a a(fms $$0) {
            boolean $$5;
            boolean $$1 = this.j();
            gu $$2 = this.l.i();
            boolean $$3 = true;
            fmr $$4 = $$0.a(fmp.this.o, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
            boolean bl2 = $$5 = this.c.get() == fmp$b.a;
            if ($$5 && $$1) {
                this.e.incrementAndGet();
            }
            this.f = new b(this.c(), $$4, !$$5 || this.e.get() > 2);
            return this.f;
        }

        public void a(fmp $$0, fms $$1) {
            a $$2 = this.a($$1);
            $$0.a($$2);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        void a(Collection<czn> $$0) {
            void $$3;
            HashSet $$1 = Sets.newHashSet($$0);
            Set<czn> set = this.h;
            synchronized (set) {
                HashSet $$2 = Sets.newHashSet(this.h);
                $$1.removeAll(this.h);
                $$2.removeAll($$0);
                this.h.clear();
                this.h.addAll($$0);
            }
            fmp.this.p.a((Collection<czn>)$$3, $$1);
        }

        public void b(fms $$0) {
            a $$1 = this.a($$0);
            $$1.a(fmp.this.l);
        }

        class c
        extends a {
            private final fmp$b f;

            public c(double $$0, fmp$b $$1) {
                super($$0, true);
                this.f = $$1;
            }

            @Override
            protected String b() {
                return "rend_chk_sort";
            }

            @Override
            public CompletableFuture<fmp$a> a(fjk $$02) {
                if (this.b.get()) {
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                if (!c.this.a()) {
                    this.b.set(true);
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                if (this.b.get()) {
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                eei $$12 = fmp.this.e();
                float $$2 = (float)$$12.c;
                float $$3 = (float)$$12.d;
                float $$4 = (float)$$12.e;
                eie.c $$5 = this.f.e;
                if ($$5 == null || this.f.a(fkf.f())) {
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                eie $$6 = $$02.a(fkf.f());
                c.this.a($$6);
                $$6.a($$5);
                $$6.a(eir.a($$2 - (float)c.this.l.u(), $$3 - (float)c.this.l.v(), $$4 - (float)c.this.l.w()));
                this.f.e = $$6.a();
                eie.b $$7 = $$6.d();
                if (this.b.get()) {
                    $$7.e();
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                CompletionStage $$8 = fmp.this.a($$7, c.this.a(fkf.f())).thenApply($$0 -> fmp$a.b);
                return ((CompletableFuture)$$8).handle(($$0, $$1) -> {
                    if ($$1 != null && !($$1 instanceof CancellationException) && !($$1 instanceof InterruptedException)) {
                        enn.N().a(o.a($$1, "Rendering chunk"));
                    }
                    return this.b.get() ? fmp$a.b : fmp$a.a;
                });
            }

            @Override
            public void a() {
                this.b.set(true);
            }
        }

        abstract class a
        implements Comparable<a> {
            protected final double a;
            protected final AtomicBoolean b = new AtomicBoolean(false);
            protected final boolean c;

            public a(double $$0, boolean $$1) {
                this.a = $$0;
                this.c = $$1;
            }

            public abstract CompletableFuture<fmp$a> a(fjk var1);

            public abstract void a();

            protected abstract String b();

            public int a(a $$0) {
                return Doubles.compare((double)this.a, (double)$$0.a);
            }

            @Override
            public /* synthetic */ int compareTo(Object object) {
                return this.a((a)object);
            }
        }

        class b
        extends fmp$c$a {
            @Nullable
            protected fmr e;

            public b(@Nullable double $$0, fmr $$1, boolean $$2) {
                super($$0, $$2);
                this.e = $$1;
            }

            @Override
            protected String b() {
                return "rend_chk_rebuild";
            }

            @Override
            public CompletableFuture<fmp$a> a(fjk $$0) {
                if (this.b.get()) {
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                if (!c.this.a()) {
                    this.e = null;
                    c.this.a(false);
                    this.b.set(true);
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                if (this.b.get()) {
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                eei $$12 = fmp.this.e();
                float $$22 = (float)$$12.c;
                float $$32 = (float)$$12.d;
                float $$4 = (float)$$12.e;
                a $$5 = this.a($$22, $$32, $$4, $$0);
                c.this.a($$5.a);
                if (this.b.get()) {
                    $$5.c.values().forEach(eie.b::e);
                    return CompletableFuture.completedFuture(fmp$a.b);
                }
                fmp$b $$6 = new fmp$b();
                $$6.d = $$5.d;
                $$6.c.addAll($$5.b);
                $$6.e = $$5.e;
                ArrayList $$7 = Lists.newArrayList();
                $$5.c.forEach(($$2, $$3) -> {
                    $$7.add(fmp.this.a((eie.b)$$3, c.this.a((fkf)$$2)));
                    $$1.b.add((fkf)$$2);
                });
                return ac.c($$7).handle(($$1, $$2) -> {
                    if ($$2 != null && !($$2 instanceof CancellationException) && !($$2 instanceof InterruptedException)) {
                        enn.N().a(o.a($$2, "Rendering chunk"));
                    }
                    if (this.b.get()) {
                        return fmp$a.b;
                    }
                    c.this.c.set($$6);
                    c.this.e.set(0);
                    fmp.this.p.a(c.this);
                    return fmp$a.a;
                });
            }

            private a a(float $$0, float $$1, float $$2, fjk $$3) {
                a $$4 = new a();
                boolean $$5 = true;
                gu $$6 = c.this.l.i();
                gu $$7 = $$6.b(15, 15, 15);
                fmt $$8 = new fmt();
                fmr $$9 = this.e;
                this.e = null;
                eij $$10 = new eij();
                if ($$9 != null) {
                    eie $$23;
                    fkq.a();
                    ReferenceArraySet $$11 = new ReferenceArraySet(fkf.G().size());
                    apf $$12 = apf.a();
                    fko $$13 = enn.N().am();
                    for (gu $$14 : gu.a($$6, $$7)) {
                        dcb $$17;
                        dxe $$18;
                        czn $$16;
                        dcb $$15 = $$9.a_($$14);
                        if ($$15.i($$9, $$14)) {
                            $$8.a($$14);
                        }
                        if ($$15.t() && ($$16 = $$9.c_($$14)) != null) {
                            this.a($$4, $$16);
                        }
                        if (!($$18 = ($$17 = $$9.a_($$14)).u()).c()) {
                            fkf $$19 = fjs.a($$18);
                            eie $$20 = $$3.a($$19);
                            if ($$11.add($$19)) {
                                c.this.a($$20);
                            }
                            $$13.a($$14, $$9, $$20, $$17, $$18);
                        }
                        if ($$15.l() == cvs.a) continue;
                        fkf $$21 = fjs.a($$15);
                        eie $$22 = $$3.a($$21);
                        if ($$11.add($$21)) {
                            c.this.a($$22);
                        }
                        $$10.a();
                        $$10.a($$14.u() & 0xF, $$14.v() & 0xF, $$14.w() & 0xF);
                        $$13.a($$15, $$14, $$9, $$10, $$22, true, $$12);
                        $$10.b();
                    }
                    if ($$11.contains(fkf.f()) && !($$23 = $$3.a(fkf.f())).b()) {
                        $$23.a(eir.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                        $$4.e = $$23.a();
                    }
                    for (fkf $$24 : $$11) {
                        eie.b $$25 = $$3.a($$24).c();
                        if ($$25 == null) continue;
                        $$4.c.put($$24, $$25);
                    }
                    fkq.b();
                }
                $$4.d = $$8.a();
                return $$4;
            }

            private <E extends czn> void a(a $$0, E $$1) {
                flu<E> $$2 = enn.N().ao().a($$1);
                if ($$2 != null) {
                    $$0.b.add($$1);
                    if ($$2.a($$1)) {
                        $$0.a.add($$1);
                    }
                }
            }

            @Override
            public void a() {
                this.e = null;
                if (this.b.compareAndSet(false, true)) {
                    c.this.a(false);
                }
            }

            static final class a {
                public final List<czn> a = new ArrayList<czn>();
                public final List<czn> b = new ArrayList<czn>();
                public final Map<fkf, eie.b> c = new Reference2ObjectArrayMap();
                public fmu d = new fmu();
                @Nullable
                public eie.c e;

                a() {
                }
            }
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = fmp$a.a();
        }
    }

    public static class b {
        public static final b a = new b(){

            @Override
            public boolean a(ha $$0, ha $$1) {
                return false;
            }
        };
        final Set<fkf> b = new ObjectArraySet(fkf.G().size());
        final List<czn> c = Lists.newArrayList();
        fmu d = new fmu();
        @Nullable
        eie.c e;

        public boolean a() {
            return this.b.isEmpty();
        }

        public boolean a(fkf $$0) {
            return !this.b.contains($$0);
        }

        public List<czn> b() {
            return this.c;
        }

        public boolean a(ha $$0, ha $$1) {
            return this.d.a($$0, $$1);
        }
    }
}

