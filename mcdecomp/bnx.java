/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bnx
extends bni {
    private final cpn g;
    private final bgb h;
    private int i;
    private static final int j = 20;

    public bnx(cpn $$0, bgi $$1, double $$2, int $$3) {
        super($$1, $$2, 24, $$3);
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public boolean a() {
        if (!this.h.dI().X().b(cmi.c)) {
            return false;
        }
        if (this.c > 0) {
            --this.c;
            return false;
        }
        if (this.n()) {
            this.c = bnx.b(20);
            return true;
        }
        this.c = this.a(this.a);
        return false;
    }

    @Override
    public void d() {
        super.d();
        this.h.aa = 1.0f;
    }

    @Override
    public void c() {
        super.c();
        this.i = 0;
    }

    public void a(cmn $$0, gu $$1) {
    }

    public void a(cmm $$0, gu $$1) {
    }

    @Override
    public void e() {
        super.e();
        cmm $$0 = this.h.dI();
        gu $$1 = this.h.di();
        gu $$2 = this.a($$1, $$0);
        apf $$3 = this.h.ec();
        if (this.m() && $$2 != null) {
            if (this.i > 0) {
                eei $$4 = this.h.dl();
                this.h.o($$4.c, 0.3, $$4.e);
                if (!$$0.B) {
                    double $$5 = 0.08;
                    ((aif)$$0).a(new ir(iv.O, new cfz(cgc.qd)), (double)$$2.u() + 0.5, (double)$$2.v() + 0.7, (double)$$2.w() + 0.5, 3, ((double)$$3.i() - 0.5) * 0.08, ((double)$$3.i() - 0.5) * 0.08, ((double)$$3.i() - 0.5) * 0.08, 0.15f);
                }
            }
            if (this.i % 2 == 0) {
                eei $$6 = this.h.dl();
                this.h.o($$6.c, -0.3, $$6.e);
                if (this.i % 6 == 0) {
                    this.a((cmn)$$0, this.e);
                }
            }
            if (this.i > 60) {
                $$0.a($$2, false);
                if (!$$0.B) {
                    for (int $$7 = 0; $$7 < 20; ++$$7) {
                        double $$8 = $$3.k() * 0.02;
                        double $$9 = $$3.k() * 0.02;
                        double $$10 = $$3.k() * 0.02;
                        ((aif)$$0).a(iv.W, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15f);
                    }
                    this.a($$0, $$2);
                }
            }
            ++this.i;
        }
    }

    @Nullable
    private gu a(gu $$0, cls $$1) {
        gu[] $$2;
        if ($$1.a_($$0).a(this.g)) {
            return $$0;
        }
        for (gu $$3 : $$2 = new gu[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()}) {
            if (!$$1.a_($$3).a(this.g)) continue;
            return $$3;
        }
        return null;
    }

    @Override
    protected boolean a(cmp $$0, gu $$1) {
        ddx $$2 = $$0.a(hx.a($$1.u()), hx.a($$1.w()), dec.n, false);
        if ($$2 != null) {
            return $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
        }
        return false;
    }
}

