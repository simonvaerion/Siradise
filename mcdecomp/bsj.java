/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bsj
extends brj
implements bgr,
bwg {
    private static final aby<Byte> b = acb.a(bsj.class, aca.a);
    private static final byte c = 16;
    private static final float d = 1.7f;

    public bsj(bfn<? extends bsj> $$0, cmm $$1) {
        super((bfn<? extends brj>)$$0, $$1);
    }

    @Override
    protected void x() {
        this.bO.a(1, new bnu(this, 1.25, 20, 10.0f));
        this.bO.a(2, new boi((bgi)this, 1.0, 1.0000001E-5f));
        this.bO.a(3, new bnd(this, byo.class, 6.0f));
        this.bO.a(4, new bnq(this));
        this.bP.a(1, new boo<bgb>(this, bgb.class, 10, true, false, $$0 -> $$0 instanceof bvu));
    }

    public static bhf.a q() {
        return bgb.y().a(bhg.a, 4.0).a(bhg.d, 0.2f);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(b, (byte)16);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Pumpkin", this.r());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.e("Pumpkin")) {
            this.w($$0.q("Pumpkin"));
        }
    }

    @Override
    public boolean fb() {
        return true;
    }

    @Override
    public void b_() {
        super.b_();
        if (!this.dI().B) {
            if (this.dI().s(this.di()).a(amv.ad)) {
                this.a(this.dJ().c(), 1.0f);
            }
            if (!this.dI().X().b(cmi.c)) {
                return;
            }
            dcb $$0 = cpo.dN.n();
            for (int $$1 = 0; $$1 < 4; ++$$1) {
                int $$2 = apa.a(this.dn() + (double)((float)($$1 % 2 * 2 - 1) * 0.25f));
                int $$3 = apa.a(this.dp());
                int $$4 = apa.a(this.dt() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25f));
                gu $$5 = new gu($$2, $$3, $$4);
                if (!this.dI().a_($$5).i() || !$$0.a((cmp)this.dI(), $$5)) continue;
                this.dI().b($$5, $$0);
                this.dI().a(dgl.i, $$5, dgl.a.a(this, $$0));
            }
        }
    }

    @Override
    public void a(bfz $$0, float $$1) {
        bzk $$2 = new bzk(this.dI(), this);
        double $$3 = $$0.dr() - (double)1.1f;
        double $$4 = $$0.dn() - this.dn();
        double $$5 = $$3 - $$2.dp();
        double $$6 = $$0.dt() - this.dt();
        double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * (double)0.2f;
        $$2.c($$4, $$5 + $$7, $$6, 1.6f, 12.0f);
        this.a(amh.wT, 1.0f, 0.4f / (this.ec().i() * 0.4f + 0.8f));
        this.dI().b($$2);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 1.7f;
    }

    @Override
    protected bdx b(byo $$0, bdw $$12) {
        cfz $$2 = $$0.b($$12);
        if ($$2.a(cgc.rg) && this.a()) {
            this.a(ami.h);
            this.a(dgl.N, (bfj)$$0);
            if (!this.dI().B) {
                $$2.a(1, $$0, (T $$1) -> $$1.d($$12));
            }
            return bdx.a(this.dI().B);
        }
        return bdx.d;
    }

    @Override
    public void a(ami $$0) {
        this.dI().a(null, this, amh.wU, $$0, 1.0f, 1.0f);
        if (!this.dI().r_()) {
            this.w(false);
            this.a(new cfz(cgc.eP), 1.7f);
        }
    }

    @Override
    public boolean a() {
        return this.bs() && this.r();
    }

    public boolean r() {
        return (this.am.b(b) & 0x10) != 0;
    }

    public void w(boolean $$0) {
        byte $$1 = this.am.b(b);
        if ($$0) {
            this.am.b(b, (byte)($$1 | 0x10));
        } else {
            this.am.b(b, (byte)($$1 & 0xFFFFFFEF));
        }
    }

    @Override
    @Nullable
    protected amg s() {
        return amh.wQ;
    }

    @Override
    @Nullable
    protected amg d(ben $$0) {
        return amh.wS;
    }

    @Override
    @Nullable
    protected amg g_() {
        return amh.wR;
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.75f * this.cF(), this.dd() * 0.4f);
    }
}

