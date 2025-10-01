/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public class bvb
extends buz {
    public static final double e = 0.375;

    public bvb(bfn<? extends bvb> $$0, cmm $$1) {
        super((bfn<? extends buz>)$$0, $$1);
    }

    public bvb(cmm $$0, gu $$1) {
        super(bfn.ah, $$0, $$1);
        this.e($$1.u(), $$1.v(), $$1.w());
    }

    @Override
    protected void s() {
        this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
        double $$0 = (double)this.ae().k() / 2.0;
        double $$1 = this.ae().l();
        this.a(new eed(this.dn() - $$0, this.dp(), this.dt() - $$0, this.dn() + $$0, this.dp() + $$1, this.dt() + $$0));
    }

    @Override
    public void a(ha $$0) {
    }

    @Override
    public int v() {
        return 9;
    }

    @Override
    public int w() {
        return 9;
    }

    @Override
    protected float a(bgl $$0, bfk $$1) {
        return 0.0625f;
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < 1024.0;
    }

    @Override
    public void a(@Nullable bfj $$0) {
        this.a(amh.mq, 1.0f, 1.0f);
    }

    @Override
    public void b(qr $$0) {
    }

    @Override
    public void a(qr $$0) {
    }

    @Override
    public bdx a(byo $$0, bdw $$1) {
        if (this.dI().B) {
            return bdx.a;
        }
        boolean $$2 = false;
        double $$3 = 7.0;
        List<bgb> $$4 = this.dI().a(bgb.class, new eed(this.dn() - 7.0, this.dp() - 7.0, this.dt() - 7.0, this.dn() + 7.0, this.dp() + 7.0, this.dt() + 7.0));
        for (bgb $$5 : $$4) {
            if ($$5.fP() != $$0) continue;
            $$5.b(this, true);
            $$2 = true;
        }
        boolean $$6 = false;
        if (!$$2) {
            this.ai();
            if ($$0.fO().d) {
                for (bgb $$7 : $$4) {
                    if (!$$7.fO() || $$7.fP() != this) continue;
                    $$7.a(true, false);
                    $$6 = true;
                }
            }
        }
        if ($$2 || $$6) {
            this.a(dgl.b, (bfj)$$0);
        }
        return bdx.b;
    }

    @Override
    public boolean t() {
        return this.dI().a_(this.c).a(amw.S);
    }

    public static bvb b(cmm $$0, gu $$1) {
        int $$2 = $$1.u();
        int $$3 = $$1.v();
        int $$4 = $$1.w();
        List<bvb> $$5 = $$0.a(bvb.class, new eed((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0));
        for (bvb $$6 : $$5) {
            if (!$$6.y().equals($$1)) continue;
            return $$6;
        }
        bvb $$7 = new bvb($$0, $$1);
        $$0.b($$7);
        return $$7;
    }

    @Override
    public void x() {
        this.a(amh.mr, 1.0f, 1.0f);
    }

    @Override
    public uo<ur> S() {
        return new us(this, 0, this.y());
    }

    @Override
    public eei q(float $$0) {
        return this.l($$0).b(0.0, 0.2, 0.0);
    }

    @Override
    public cfz dv() {
        return new cfz(cgc.tQ);
    }
}

