/*
 * Decompiled with CFR 0.152.
 */
public class bmj
extends bni {
    private final bro g;

    public bmj(bro $$0, double $$1) {
        super($$0, $$1, 8);
        this.g = $$0;
    }

    @Override
    public boolean a() {
        return this.g.q() && !this.g.fY() && super.a();
    }

    @Override
    public void c() {
        super.c();
        this.g.y(false);
    }

    @Override
    public void d() {
        super.d();
        this.g.y(false);
    }

    @Override
    public void e() {
        super.e();
        this.g.y(this.m());
    }

    @Override
    protected boolean a(cmp $$0, gu $$1) {
        if (!$$0.t($$1.c())) {
            return false;
        }
        dcb $$2 = $$0.a_($$1);
        if ($$2.a(cpo.cv)) {
            return czu.a($$0, $$1) < 1;
        }
        if ($$2.a(cpo.cD) && $$2.c(csq.b).booleanValue()) {
            return true;
        }
        return $$2.a(amw.R, (dca.a $$02) -> $$02.d(cpg.a).map($$0 -> $$0 != dco.a).orElse(true));
    }
}

