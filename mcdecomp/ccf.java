/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public abstract class ccf
extends cbf {
    private static final int k = 9;
    private static final int l = 3;
    protected final cbq o;
    protected final byo p;
    protected final bdq q;
    private final List<Integer> m;
    protected final ccs r = new ccs();
    private final int n;

    protected abstract boolean a(byo var1, boolean var2);

    protected abstract void a(byo var1, cfz var2);

    protected abstract boolean a(dcb var1);

    public ccf(@Nullable cck<?> $$0, int $$1, byn $$2, cbq $$3) {
        super($$0, $$1);
        this.o = $$3;
        this.p = $$2.m;
        ccg $$4 = this.l();
        this.q = this.e($$4.d());
        this.m = $$4.f();
        this.n = $$4.e();
        this.a($$4);
        this.b($$4);
        this.a($$2);
    }

    private void a(ccg $$0) {
        for (final ccg.b $$1 : $$0.c()) {
            this.a(new ccx(this.q, $$1.a(), $$1.b(), $$1.c()){

                @Override
                public boolean a(cfz $$0) {
                    return $$1.d().test($$0);
                }
            });
        }
    }

    private void b(ccg $$0) {
        this.a(new ccx(this.r, $$0.b().a(), $$0.b().b(), $$0.b().c()){

            @Override
            public boolean a(cfz $$0) {
                return false;
            }

            @Override
            public boolean a(byo $$0) {
                return ccf.this.a($$0, this.f());
            }

            @Override
            public void a(byo $$0, cfz $$1) {
                ccf.this.a($$0, $$1);
            }
        });
    }

    private void a(byn $$0) {
        for (int $$1 = 0; $$1 < 3; ++$$1) {
            for (int $$2 = 0; $$2 < 9; ++$$2) {
                this.a(new ccx($$0, $$2 + $$1 * 9 + 9, 8 + $$2 * 18, 84 + $$1 * 18));
            }
        }
        for (int $$3 = 0; $$3 < 9; ++$$3) {
            this.a(new ccx($$0, $$3, 8 + $$3 * 18, 142));
        }
    }

    public abstract void m();

    protected abstract ccg l();

    private bee e(int $$0) {
        return new bee($$0){

            @Override
            public void e() {
                super.e();
                ccf.this.a(this);
            }
        };
    }

    @Override
    public void a(bdq $$0) {
        super.a($$0);
        if ($$0 == this.q) {
            this.m();
        }
    }

    @Override
    public void b(byo $$0) {
        super.b($$0);
        this.o.a((cmm $$1, gu $$2) -> this.a($$0, this.q));
    }

    @Override
    public boolean a(byo $$0) {
        return this.o.a((cmm $$1, gu $$2) -> {
            if (!this.a($$1.a_((gu)$$2))) {
                return false;
            }
            return $$0.i((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0;
        }, true);
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        cfz $$2 = cfz.b;
        ccx $$3 = (ccx)this.i.get($$1);
        if ($$3 != null && $$3.f()) {
            int $$7;
            cfz $$4 = $$3.e();
            $$2 = $$4.p();
            int $$5 = this.n();
            int $$6 = this.r();
            if ($$1 == this.o()) {
                if (!this.a($$4, $$5, $$6, true)) {
                    return cfz.b;
                }
                $$3.a($$4, $$2);
            } else if (this.m.contains($$1) ? !this.a($$4, $$5, $$6, false) : (this.c($$4) && $$1 >= this.n() && $$1 < this.r() ? !this.a($$4, $$7 = this.d($$2), this.o(), false) : ($$1 >= this.n() && $$1 < this.p() ? !this.a($$4, this.q(), this.r(), false) : $$1 >= this.q() && $$1 < this.r() && !this.a($$4, this.n(), this.p(), false)))) {
                return cfz.b;
            }
            if ($$4.b()) {
                $$3.d(cfz.b);
            } else {
                $$3.d();
            }
            if ($$4.L() == $$2.L()) {
                return cfz.b;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }

    protected boolean c(cfz $$0) {
        return true;
    }

    public int d(cfz $$0) {
        return this.q.ab_() ? 0 : this.m.get(0);
    }

    public int o() {
        return this.n;
    }

    private int n() {
        return this.o() + 1;
    }

    private int p() {
        return this.n() + 27;
    }

    private int q() {
        return this.p();
    }

    private int r() {
        return this.q() + 9;
    }
}

