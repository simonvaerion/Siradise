/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class brs
extends brl {
    public brs(bfn<? extends brs> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
    }

    @Override
    protected void x() {
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new bno(this, 2.0));
        this.bO.a(2, new bmh(this, 1.0));
        this.bO.a(3, new bod(this, 1.25, ciz.a(cgc.oI), false));
        this.bO.a(4, new bmu(this, 1.25));
        this.bO.a(5, new boi(this, 1.0));
        this.bO.a(6, new bnd(this, byo.class, 6.0f));
        this.bO.a(7, new bnq(this));
    }

    public static bhf.a q() {
        return bgb.y().a(bhg.a, 10.0).a(bhg.d, 0.2f);
    }

    @Override
    protected amg s() {
        return amh.eZ;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.fb;
    }

    @Override
    protected amg g_() {
        return amh.fa;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.fd, 0.15f, 1.0f);
    }

    @Override
    protected float eR() {
        return 0.4f;
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if ($$2.a(cgc.pK) && !this.h_()) {
            $$0.a(amh.fc, 1.0f, 1.0f);
            cfz $$3 = cgb.a($$2, $$0, cgc.pQ.ae_());
            $$0.a($$1, $$3);
            return bdx.a(this.dI().B);
        }
        return super.b($$0, $$1);
    }

    @Nullable
    public brs b(aif $$0, bfe $$1) {
        return bfn.t.a($$0);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        if (this.h_()) {
            return $$1.b * 0.95f;
        }
        return 1.3f;
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }
}

