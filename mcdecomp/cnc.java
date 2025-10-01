/*
 * Decompiled with CFR 0.152.
 */
public interface cnc
extends cls {
    public static final ha[] C = ha.values();

    default public int a(gu $$0, ha $$1) {
        return this.a_($$0).c((cls)this, $$0, $$1);
    }

    default public int e_(gu $$0) {
        int $$1 = 0;
        if (($$1 = Math.max($$1, this.a($$0.d(), ha.a))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.c(), ha.b))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.e(), ha.c))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.f(), ha.d))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.g(), ha.e))) >= 15) {
            return $$1;
        }
        if (($$1 = Math.max($$1, this.a($$0.h(), ha.f))) >= 15) {
            return $$1;
        }
        return $$1;
    }

    default public int a(gu $$0, ha $$1, boolean $$2) {
        dcb $$3 = this.a_($$0);
        if ($$2) {
            return crl.h($$3) ? this.a($$0, $$1) : 0;
        }
        if ($$3.a(cpo.ha)) {
            return 15;
        }
        if ($$3.a(cpo.cw)) {
            return $$3.c(cvo.e);
        }
        if ($$3.m()) {
            return this.a($$0, $$1);
        }
        return 0;
    }

    default public boolean b(gu $$0, ha $$1) {
        return this.c($$0, $$1) > 0;
    }

    default public int c(gu $$0, ha $$1) {
        dcb $$2 = this.a_($$0);
        int $$3 = $$2.b((cls)this, $$0, $$1);
        if ($$2.g(this, $$0)) {
            return Math.max($$3, this.e_($$0));
        }
        return $$3;
    }

    default public boolean B(gu $$0) {
        if (this.c($$0.d(), ha.a) > 0) {
            return true;
        }
        if (this.c($$0.c(), ha.b) > 0) {
            return true;
        }
        if (this.c($$0.e(), ha.c) > 0) {
            return true;
        }
        if (this.c($$0.f(), ha.d) > 0) {
            return true;
        }
        if (this.c($$0.g(), ha.e) > 0) {
            return true;
        }
        return this.c($$0.h(), ha.f) > 0;
    }

    default public int C(gu $$0) {
        int $$1 = 0;
        for (ha $$2 : C) {
            int $$3 = this.c($$0.a($$2), $$2);
            if ($$3 >= 15) {
                return 15;
            }
            if ($$3 <= $$1) continue;
            $$1 = $$3;
        }
        return $$1;
    }
}

