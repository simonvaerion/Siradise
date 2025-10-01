/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class ccl
implements bdq {
    private final clj c;
    private final hn<cfz> d = hn.a(3, cfz.b);
    @Nullable
    private clk e;
    private int f;
    private int g;

    public ccl(clj $$0) {
        this.c = $$0;
    }

    @Override
    public int b() {
        return this.d.size();
    }

    @Override
    public boolean ab_() {
        for (cfz $$0 : this.d) {
            if ($$0.b()) continue;
            return false;
        }
        return true;
    }

    @Override
    public cfz a(int $$0) {
        return this.d.get($$0);
    }

    @Override
    public cfz a(int $$0, int $$1) {
        cfz $$2 = this.d.get($$0);
        if ($$0 == 2 && !$$2.b()) {
            return bdr.a(this.d, $$0, $$2.L());
        }
        cfz $$3 = bdr.a(this.d, $$0, $$1);
        if (!$$3.b() && this.d($$0)) {
            this.f();
        }
        return $$3;
    }

    private boolean d(int $$0) {
        return $$0 == 0 || $$0 == 1;
    }

    @Override
    public cfz b(int $$0) {
        return bdr.a(this.d, $$0);
    }

    @Override
    public void a(int $$0, cfz $$1) {
        this.d.set($$0, $$1);
        if (!$$1.b() && $$1.L() > this.ac_()) {
            $$1.f(this.ac_());
        }
        if (this.d($$0)) {
            this.f();
        }
    }

    @Override
    public boolean a(byo $$0) {
        return this.c.fY() == $$0;
    }

    @Override
    public void e() {
        this.f();
    }

    public void f() {
        cfz $$3;
        cfz $$2;
        this.e = null;
        if (this.d.get(0).b()) {
            cfz $$0 = this.d.get(1);
            cfz $$1 = cfz.b;
        } else {
            $$2 = this.d.get(0);
            $$3 = this.d.get(1);
        }
        if ($$2.b()) {
            this.a(2, cfz.b);
            this.g = 0;
            return;
        }
        cll $$4 = this.c.ga();
        if (!$$4.isEmpty()) {
            clk $$5 = $$4.a($$2, $$3, this.f);
            if ($$5 == null || $$5.p()) {
                this.e = $$5;
                $$5 = $$4.a($$3, $$2, this.f);
            }
            if ($$5 != null && !$$5.p()) {
                this.e = $$5;
                this.a(2, $$5.f());
                this.g = $$5.o();
            } else {
                this.a(2, cfz.b);
                this.g = 0;
            }
        }
        this.c.l(this.a(2));
    }

    @Nullable
    public clk g() {
        return this.e;
    }

    public void c(int $$0) {
        this.f = $$0;
        this.f();
    }

    @Override
    public void a() {
        this.d.clear();
    }

    public int h() {
        return this.g;
    }
}

