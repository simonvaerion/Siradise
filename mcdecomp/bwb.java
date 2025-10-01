/*
 * Decompiled with CFR 0.152.
 */
public class bwb
extends bwl {
    public bwb(bfn<? extends bwb> $$0, cmm $$1) {
        super((bfn<? extends bwl>)$$0, $$1);
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.d, 0.2f);
    }

    public static boolean b(bfn<bwb> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.ai() != bdu.a;
    }

    @Override
    public boolean a(cmp $$0) {
        return $$0.f(this) && !$$0.d(this.cE());
    }

    @Override
    public void a(int $$0, boolean $$1) {
        super.a($$0, $$1);
        this.a(bhg.i).a($$0 * 3);
    }

    @Override
    public float bj() {
        return 1.0f;
    }

    @Override
    protected it r() {
        return iv.C;
    }

    @Override
    public boolean bL() {
        return false;
    }

    @Override
    protected int w() {
        return super.w() * 4;
    }

    @Override
    protected void fV() {
        this.d *= 0.9f;
    }

    @Override
    protected void eW() {
        eei $$0 = this.dl();
        float $$1 = (float)this.ga() * 0.1f;
        this.o($$0.c, this.eU() + $$1, $$0.e);
        this.at = true;
    }

    @Override
    protected void c(anl<dxd> $$0) {
        if ($$0 == anb.b) {
            eei $$1 = this.dl();
            this.o($$1.c, 0.22f + (float)this.ga() * 0.05f, $$1.e);
            this.at = true;
        } else {
            super.c($$0);
        }
    }

    @Override
    protected boolean fW() {
        return this.cV();
    }

    @Override
    protected float fX() {
        return super.fX() + 2.0f;
    }

    @Override
    protected amg d(ben $$0) {
        if (this.gb()) {
            return amh.mO;
        }
        return amh.mN;
    }

    @Override
    protected amg g_() {
        if (this.gb()) {
            return amh.mF;
        }
        return amh.mM;
    }

    @Override
    protected amg fY() {
        if (this.gb()) {
            return amh.mR;
        }
        return amh.mQ;
    }

    @Override
    protected amg fZ() {
        return amh.mP;
    }
}

