/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class exu {
    private final aki a;
    final List<akg> b;
    final List<akg> c;
    final Function<akg, acq> d;
    final Runnable e;
    private final Consumer<aki> f;

    public exu(Runnable $$0, Function<akg, acq> $$1, aki $$2, Consumer<aki> $$3) {
        this.e = $$0;
        this.d = $$1;
        this.a = $$2;
        this.b = Lists.newArrayList($$2.f());
        Collections.reverse(this.b);
        this.c = Lists.newArrayList($$2.c());
        this.c.removeAll(this.b);
        this.f = $$3;
    }

    public Stream<a> a() {
        return this.c.stream().map($$0 -> new d((akg)$$0));
    }

    public Stream<a> b() {
        return this.b.stream().map($$0 -> new c((akg)$$0));
    }

    void e() {
        this.a.a((Collection)Lists.reverse(this.b).stream().map(akg::f).collect(ImmutableList.toImmutableList()));
    }

    public void c() {
        this.e();
        this.f.accept(this.a);
    }

    public void d() {
        this.a.a();
        this.b.retainAll(this.a.c());
        this.c.clear();
        this.c.addAll(this.a.c());
        this.c.removeAll(this.b);
    }

    class c
    extends b {
        public c(akg $$0) {
            super($$0);
        }

        @Override
        protected List<akg> s() {
            return exu.this.b;
        }

        @Override
        protected List<akg> t() {
            return exu.this.c;
        }

        @Override
        public boolean n() {
            return true;
        }

        @Override
        public void j() {
        }

        @Override
        public void k() {
            this.u();
        }
    }

    class d
    extends b {
        public d(akg $$0) {
            super($$0);
        }

        @Override
        protected List<akg> s() {
            return exu.this.c;
        }

        @Override
        protected List<akg> t() {
            return exu.this.b;
        }

        @Override
        public boolean n() {
            return false;
        }

        @Override
        public void j() {
            this.u();
        }

        @Override
        public void k() {
        }
    }

    abstract class b
    implements a {
        private final akg b;

        public b(akg $$0) {
            this.b = $$0;
        }

        protected abstract List<akg> s();

        protected abstract List<akg> t();

        @Override
        public acq a() {
            return exu.this.d.apply(this.b);
        }

        @Override
        public akh b() {
            return this.b.c();
        }

        @Override
        public String c() {
            return this.b.f();
        }

        @Override
        public sw d() {
            return this.b.a();
        }

        @Override
        public sw e() {
            return this.b.b();
        }

        @Override
        public akj f() {
            return this.b.j();
        }

        @Override
        public boolean h() {
            return this.b.h();
        }

        @Override
        public boolean i() {
            return this.b.g();
        }

        protected void u() {
            this.s().remove(this.b);
            this.b.i().a(this.t(), this.b, Function.identity(), true);
            exu.this.e.run();
            exu.this.e();
            this.v();
        }

        private void v() {
            if (this.b.f().equals("high_contrast")) {
                enq<Boolean> $$0;
                $$0.a(($$0 = enn.N().m.q()).c() == false);
            }
        }

        protected void a(int $$0) {
            List<akg> $$1 = this.s();
            int $$2 = $$1.indexOf(this.b);
            $$1.remove($$2);
            $$1.add($$2 + $$0, this.b);
            exu.this.e.run();
        }

        @Override
        public boolean q() {
            List<akg> $$0 = this.s();
            int $$1 = $$0.indexOf(this.b);
            return $$1 > 0 && !$$0.get($$1 - 1).h();
        }

        @Override
        public void l() {
            this.a(-1);
        }

        @Override
        public boolean r() {
            List<akg> $$0 = this.s();
            int $$1 = $$0.indexOf(this.b);
            return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).h();
        }

        @Override
        public void m() {
            this.a(1);
        }
    }

    public static interface a {
        public acq a();

        public akh b();

        public String c();

        public sw d();

        public sw e();

        public akj f();

        default public sw g() {
            return this.f().a(this.e());
        }

        public boolean h();

        public boolean i();

        public void j();

        public void k();

        public void l();

        public void m();

        public boolean n();

        default public boolean o() {
            return !this.n();
        }

        default public boolean p() {
            return this.n() && !this.i();
        }

        public boolean q();

        public boolean r();
    }
}

