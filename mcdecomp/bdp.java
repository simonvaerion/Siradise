/*
 * Decompiled with CFR 0.152.
 */
public class bdp
implements bdq {
    private final bdq c;
    private final bdq d;

    public bdp(bdq $$0, bdq $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public int b() {
        return this.c.b() + this.d.b();
    }

    @Override
    public boolean ab_() {
        return this.c.ab_() && this.d.ab_();
    }

    public boolean a(bdq $$0) {
        return this.c == $$0 || this.d == $$0;
    }

    @Override
    public cfz a(int $$0) {
        if ($$0 >= this.c.b()) {
            return this.d.a($$0 - this.c.b());
        }
        return this.c.a($$0);
    }

    @Override
    public cfz a(int $$0, int $$1) {
        if ($$0 >= this.c.b()) {
            return this.d.a($$0 - this.c.b(), $$1);
        }
        return this.c.a($$0, $$1);
    }

    @Override
    public cfz b(int $$0) {
        if ($$0 >= this.c.b()) {
            return this.d.b($$0 - this.c.b());
        }
        return this.c.b($$0);
    }

    @Override
    public void a(int $$0, cfz $$1) {
        if ($$0 >= this.c.b()) {
            this.d.a($$0 - this.c.b(), $$1);
        } else {
            this.c.a($$0, $$1);
        }
    }

    @Override
    public int ac_() {
        return this.c.ac_();
    }

    @Override
    public void e() {
        this.c.e();
        this.d.e();
    }

    @Override
    public boolean a(byo $$0) {
        return this.c.a($$0) && this.d.a($$0);
    }

    @Override
    public void d_(byo $$0) {
        this.c.d_($$0);
        this.d.d_($$0);
    }

    @Override
    public void c(byo $$0) {
        this.c.c($$0);
        this.d.c($$0);
    }

    @Override
    public boolean b(int $$0, cfz $$1) {
        if ($$0 >= this.c.b()) {
            return this.d.b($$0 - this.c.b(), $$1);
        }
        return this.c.b($$0, $$1);
    }

    @Override
    public void a() {
        this.c.a();
        this.d.a();
    }
}

