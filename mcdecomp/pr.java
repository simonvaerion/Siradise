/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 */
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class pr {
    private final qi a;
    @Nullable
    private gu b;
    private final aif c;
    private final Collection<ps> d = Lists.newArrayList();
    private final int e;
    private final Collection<pv> f = Lists.newCopyOnWriteArrayList();
    private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
    private long h;
    private long i;
    private boolean j;
    private final Stopwatch k = Stopwatch.createUnstarted();
    private boolean l;
    private final cvz m;
    @Nullable
    private Throwable n;
    @Nullable
    private dba o;

    public pr(qi $$0, cvz $$1, aif $$2) {
        this.a = $$0;
        this.c = $$2;
        this.e = $$0.c();
        this.m = $$0.g().a($$1);
    }

    void a(gu $$0) {
        this.b = $$0;
    }

    void a() {
        this.h = this.c.V() + 1L + this.a.f();
        this.k.start();
    }

    public void b() {
        if (this.k()) {
            return;
        }
        this.A();
        if (this.k()) {
            if (this.n != null) {
                this.d.forEach($$0 -> $$0.c(this));
            } else {
                this.d.forEach($$0 -> $$0.b(this));
            }
        }
    }

    private void A() {
        this.i = this.c.V() - this.h;
        if (this.i < 0L) {
            return;
        }
        if (this.i == 0L) {
            this.B();
        }
        ObjectIterator $$02 = this.g.object2LongEntrySet().iterator();
        while ($$02.hasNext()) {
            Object2LongMap.Entry $$1 = (Object2LongMap.Entry)$$02.next();
            if ($$1.getLongValue() > this.i) continue;
            try {
                ((Runnable)$$1.getKey()).run();
            }
            catch (Exception $$2) {
                this.a($$2);
            }
            $$02.remove();
        }
        if (this.i > (long)this.e) {
            if (this.f.isEmpty()) {
                this.a(new py("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
                this.f.forEach($$0 -> $$0.b(this.i));
                if (this.n == null) {
                    this.a(new py("No sequences finished"));
                }
            }
        } else {
            this.f.forEach($$0 -> $$0.a(this.i));
        }
    }

    private void B() {
        if (this.j) {
            throw new IllegalStateException("Test already started");
        }
        this.j = true;
        try {
            this.a.a(new pq(this));
        }
        catch (Exception $$0) {
            this.a($$0);
        }
    }

    public void a(long $$0, Runnable $$1) {
        this.g.put((Object)$$1, $$0);
    }

    public String c() {
        return this.a.a();
    }

    public gu d() {
        return this.b;
    }

    @Nullable
    public hz e() {
        dba $$0 = this.C();
        if ($$0 == null) {
            return null;
        }
        return $$0.j();
    }

    @Nullable
    public eed f() {
        dba $$0 = this.C();
        if ($$0 == null) {
            return null;
        }
        return qe.a($$0);
    }

    @Nullable
    private dba C() {
        return (dba)this.c.c_(this.b);
    }

    public aif g() {
        return this.c;
    }

    public boolean h() {
        return this.l && this.n == null;
    }

    public boolean i() {
        return this.n != null;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.l;
    }

    public long l() {
        return this.k.elapsed(TimeUnit.MILLISECONDS);
    }

    private void D() {
        if (!this.l) {
            this.l = true;
            this.k.stop();
        }
    }

    public void m() {
        if (this.n == null) {
            this.D();
        }
    }

    public void a(Throwable $$0) {
        this.n = $$0;
        this.D();
    }

    @Nullable
    public Throwable n() {
        return this.n;
    }

    public String toString() {
        return this.c();
    }

    public void a(ps $$0) {
        this.d.add($$0);
    }

    public void a(gu $$02, int $$1) {
        this.o = qe.a(this.t(), $$02, this.u(), $$1, this.c, false);
        this.b = this.o.p();
        this.o.a(this.c());
        qe.a(this.b, new gu(1, 0, -1), this.u(), this.c);
        this.d.forEach($$0 -> $$0.a(this));
    }

    public void o() {
        if (this.o == null) {
            throw new IllegalStateException("Expected structure to be initialized, but it was null");
        }
        drs $$0 = qe.b(this.o);
        qe.a($$0, this.b.v(), this.c);
    }

    long p() {
        return this.i;
    }

    pv q() {
        pv $$0 = new pv(this);
        this.f.add($$0);
        return $$0;
    }

    public boolean r() {
        return this.a.d();
    }

    public boolean s() {
        return !this.a.d();
    }

    public String t() {
        return this.a.b();
    }

    public cvz u() {
        return this.m;
    }

    public qi v() {
        return this.a;
    }

    public int w() {
        return this.e;
    }

    public boolean x() {
        return this.a.h();
    }

    public int y() {
        return this.a.i();
    }

    public int z() {
        return this.a.j();
    }
}

