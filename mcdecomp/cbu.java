/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cbu
extends ccp<cbt> {
    public static final int k = 0;
    private static final int l = 1;
    private static final int m = 10;
    private static final int n = 10;
    private static final int o = 37;
    private static final int p = 37;
    private static final int q = 46;
    private final cbt r = new cdc(this, 3, 3);
    private final ccs s = new ccs();
    private final cbq t;
    private final byo u;

    public cbu(int $$0, byn $$1) {
        this($$0, $$1, cbq.a);
    }

    public cbu(int $$0, byn $$1, cbq $$2) {
        super(cck.l, $$0);
        this.t = $$2;
        this.u = $$1.m;
        this.a(new cct($$1.m, this.r, this.s, 0, 124, 35));
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            for (int $$4 = 0; $$4 < 3; ++$$4) {
                this.a(new ccx(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
            }
        }
        for (int $$5 = 0; $$5 < 3; ++$$5) {
            for (int $$6 = 0; $$6 < 9; ++$$6) {
                this.a(new ccx($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
            }
        }
        for (int $$7 = 0; $$7 < 9; ++$$7) {
            this.a(new ccx($$1, $$7, 8 + $$7 * 18, 142));
        }
    }

    protected static void a(cbf $$0, cmm $$1, byo $$2, cbt $$3, ccs $$4) {
        cfz $$9;
        cit $$8;
        if ($$1.B) {
            return;
        }
        aig $$5 = (aig)$$2;
        cfz $$6 = cfz.b;
        Optional<cit> $$7 = $$1.n().aE().a(cjf.a, $$3, $$1);
        if ($$7.isPresent() && $$4.a($$1, $$5, $$8 = $$7.get()) && ($$9 = $$8.a($$3, $$1.B_())).a($$1.G())) {
            $$6 = $$9;
        }
        $$4.a(0, $$6);
        $$0.a(0, $$6);
        $$5.c.a(new vm($$0.j, $$0.k(), 0, $$6));
    }

    @Override
    public void a(bdq $$02) {
        this.t.a((cmm $$0, gu $$1) -> cbu.a(this, $$0, this.u, this.r, this.s));
    }

    @Override
    public void a(bys $$0) {
        this.r.a($$0);
    }

    @Override
    public void l() {
        this.r.a();
        this.s.a();
    }

    @Override
    public boolean a(cjc<? super cbt> $$0) {
        return $$0.a(this.r, this.u.dI());
    }

    @Override
    public void b(byo $$0) {
        super.b($$0);
        this.t.a((cmm $$1, gu $$2) -> this.a($$0, this.r));
    }

    @Override
    public boolean a(byo $$0) {
        return cbu.a(this.t, $$0, cpo.cA);
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        cfz $$22 = cfz.b;
        ccx $$32 = (ccx)this.i.get($$1);
        if ($$32 != null && $$32.f()) {
            cfz $$4 = $$32.e();
            $$22 = $$4.p();
            if ($$1 == 0) {
                this.t.a((cmm $$2, gu $$3) -> $$4.d().b($$4, (cmm)$$2, $$0));
                if (!this.a($$4, 10, 46, true)) {
                    return cfz.b;
                }
                $$32.a($$4, $$22);
            } else if ($$1 >= 10 && $$1 < 46 ? !this.a($$4, 1, 10, false) && ($$1 < 37 ? !this.a($$4, 37, 46, false) : !this.a($$4, 10, 37, false)) : !this.a($$4, 10, 46, false)) {
                return cfz.b;
            }
            if ($$4.b()) {
                $$32.d(cfz.b);
            } else {
                $$32.d();
            }
            if ($$4.L() == $$22.L()) {
                return cfz.b;
            }
            $$32.a($$0, $$4);
            if ($$1 == 0) {
                $$0.a($$4, false);
            }
        }
        return $$22;
    }

    @Override
    public boolean a(cfz $$0, ccx $$1) {
        return $$1.d != this.s && super.a($$0, $$1);
    }

    @Override
    public int m() {
        return 0;
    }

    @Override
    public int n() {
        return this.r.f();
    }

    @Override
    public int o() {
        return this.r.g();
    }

    @Override
    public int p() {
        return 10;
    }

    @Override
    public ccq t() {
        return ccq.a;
    }

    @Override
    public boolean e(int $$0) {
        return $$0 != this.m();
    }
}

