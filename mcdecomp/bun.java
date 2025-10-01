/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bun
extends bue {
    private static final int b = 200;
    private static final int c = 4;
    private static final int d = 10;
    private int e;
    private int f;
    @Nullable
    private bfg g;

    public bun(bub $$0) {
        super($$0);
    }

    @Override
    public void b() {
        ++this.e;
        if (this.e % 2 == 0 && this.e < 10) {
            eei $$0 = this.a.C(1.0f).d();
            $$0.b(-0.7853982f);
            double $$1 = this.a.e.dn();
            double $$2 = this.a.e.e(0.5);
            double $$3 = this.a.e.dt();
            for (int $$4 = 0; $$4 < 8; ++$$4) {
                double $$5 = $$1 + this.a.ec().k() / 2.0;
                double $$6 = $$2 + this.a.ec().k() / 2.0;
                double $$7 = $$3 + this.a.ec().k() / 2.0;
                for (int $$8 = 0; $$8 < 6; ++$$8) {
                    this.a.dI().a(iv.i, $$5, $$6, $$7, -$$0.c * (double)0.08f * (double)$$8, -$$0.d * (double)0.6f, -$$0.e * (double)0.08f * (double)$$8);
                }
                $$0.b(0.19634955f);
            }
        }
    }

    @Override
    public void c() {
        ++this.e;
        if (this.e >= 200) {
            if (this.f >= 4) {
                this.a.fW().a(bur.e);
            } else {
                this.a.fW().a(bur.g);
            }
        } else if (this.e == 10) {
            double $$4;
            eei $$0 = new eei(this.a.e.dn() - this.a.dn(), 0.0, this.a.e.dt() - this.a.dt()).d();
            float $$1 = 5.0f;
            double $$2 = this.a.e.dn() + $$0.c * 5.0 / 2.0;
            double $$3 = this.a.e.dt() + $$0.e * 5.0 / 2.0;
            double $$5 = $$4 = this.a.e.e(0.5);
            gu.a $$6 = new gu.a($$2, $$5, $$3);
            while (this.a.dI().t($$6)) {
                if (($$5 -= 1.0) < 0.0) {
                    $$5 = $$4;
                    break;
                }
                $$6.b($$2, $$5, $$3);
            }
            $$5 = apa.a($$5) + 1;
            this.g = new bfg(this.a.dI(), $$2, $$5, $$3);
            this.g.a(this.a);
            this.g.a(5.0f);
            this.g.b(200);
            this.g.a(iv.i);
            this.g.a(new bfa(bfc.g));
            this.a.dI().b(this.g);
        }
    }

    @Override
    public void d() {
        this.e = 0;
        ++this.f;
    }

    @Override
    public void e() {
        if (this.g != null) {
            this.g.ai();
            this.g = null;
        }
    }

    public bur<bun> i() {
        return bur.f;
    }

    public void j() {
        this.f = 0;
    }
}

