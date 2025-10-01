/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bpk
extends bpi {
    @Nullable
    private gu p;

    public bpk(bgb $$0, cmm $$1) {
        super($$0, $$1);
    }

    @Override
    public dxt a(gu $$0, int $$1) {
        this.p = $$0;
        return super.a($$0, $$1);
    }

    @Override
    public dxt a(bfj $$0, int $$1) {
        this.p = $$0.di();
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(bfj $$0, double $$1) {
        dxt $$2 = this.a($$0, 0);
        if ($$2 != null) {
            return this.a($$2, $$1);
        }
        this.p = $$0.di();
        this.d = $$1;
        return true;
    }

    @Override
    public void c() {
        if (this.l()) {
            if (this.p != null) {
                if (this.p.a(this.a.dg(), (double)this.a.dd()) || this.a.dp() > (double)this.p.v() && gu.a((double)this.p.u(), this.a.dp(), (double)this.p.w()).a(this.a.dg(), (double)this.a.dd())) {
                    this.p = null;
                } else {
                    this.a.G().a(this.p.u(), this.p.v(), this.p.w(), this.d);
                }
            }
            return;
        }
        super.c();
    }
}

