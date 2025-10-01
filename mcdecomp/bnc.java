/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.List;

public class bnc
extends bmv {
    public final btn a;
    private double b;
    private static final int c = 8;
    private int d;

    public bnc(btn $$0, double $$1) {
        this.a = $$0;
        this.b = $$1;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        if (this.a.fO() || this.a.gM()) {
            return false;
        }
        List<bfj> $$02 = this.a.dI().a((bfj)this.a, this.a.cE().c(9.0, 4.0, 9.0), $$0 -> {
            bfn<?> $$1 = $$0.ae();
            return $$1 == bfn.aj || $$1 == bfn.ba;
        });
        bgb $$1 = null;
        double $$2 = Double.MAX_VALUE;
        for (bfj $$3 : $$02) {
            double $$5;
            btn $$4 = (btn)$$3;
            if (!$$4.gM() || $$4.gL() || ($$5 = this.a.f((bfj)$$4)) > $$2) continue;
            $$2 = $$5;
            $$1 = $$4;
        }
        if ($$1 == null) {
            for (bfj $$6 : $$02) {
                double $$8;
                btn $$7 = (btn)$$6;
                if (!$$7.fO() || $$7.gL() || ($$8 = this.a.f((bfj)$$7)) > $$2) continue;
                $$2 = $$8;
                $$1 = $$7;
            }
        }
        if ($$1 == null) {
            return false;
        }
        if ($$2 < 4.0) {
            return false;
        }
        if (!$$1.fO() && !this.a((btn)$$1, 1)) {
            return false;
        }
        this.a.a((btn)$$1);
        return true;
    }

    @Override
    public boolean b() {
        if (!(this.a.gM() && this.a.gN().bs() && this.a(this.a, 0))) {
            return false;
        }
        double $$0 = this.a.f((bfj)this.a.gN());
        if ($$0 > 676.0) {
            if (this.b <= 3.0) {
                this.b *= 1.2;
                this.d = bnc.b(40);
                return true;
            }
            if (this.d == 0) {
                return false;
            }
        }
        if (this.d > 0) {
            --this.d;
        }
        return true;
    }

    @Override
    public void d() {
        this.a.gK();
        this.b = 2.1;
    }

    @Override
    public void e() {
        if (!this.a.gM()) {
            return;
        }
        if (this.a.fP() instanceof bvb) {
            return;
        }
        btn $$0 = this.a.gN();
        double $$1 = this.a.e((bfj)$$0);
        float $$2 = 2.0f;
        eei $$3 = new eei($$0.dn() - this.a.dn(), $$0.dp() - this.a.dp(), $$0.dt() - this.a.dt()).d().a(Math.max($$1 - 2.0, 0.0));
        this.a.J().a(this.a.dn() + $$3.c, this.a.dp() + $$3.d, this.a.dt() + $$3.e, this.b);
    }

    private boolean a(btn $$0, int $$1) {
        if ($$1 > 8) {
            return false;
        }
        if ($$0.gM()) {
            if ($$0.gN().fO()) {
                return true;
            }
            return this.a($$0.gN(), ++$$1);
        }
        return false;
    }
}

