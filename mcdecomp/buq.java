/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class buq
extends bud {
    private boolean b;
    @Nullable
    private dxt c;
    @Nullable
    private eei d;

    public buq(bub $$0) {
        super($$0);
    }

    @Override
    public void c() {
        if (this.b || this.c == null) {
            this.b = false;
            this.j();
        } else {
            gu $$0 = this.a.dI().a(dhk.a.f, dkn.a(this.a.q()));
            if (!$$0.a(this.a.dg(), 10.0)) {
                this.a.fW().a(bur.a);
            }
        }
    }

    @Override
    public void d() {
        this.b = true;
        this.c = null;
        this.d = null;
    }

    private void j() {
        int $$0 = this.a.w();
        eei $$1 = this.a.C(1.0f);
        int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
        if (this.a.fX() == null || this.a.fX().e() <= 0) {
            $$2 -= 12;
            $$2 &= 7;
            $$2 += 12;
        } else if (($$2 %= 12) < 0) {
            $$2 += 12;
        }
        this.c = this.a.a($$0, $$2, (dxr)null);
        this.k();
    }

    private void k() {
        if (this.c != null) {
            this.c.a();
            if (!this.c.c()) {
                double $$1;
                gu $$0 = this.c.g();
                this.c.a();
                while (($$1 = (double)((float)$$0.v() + this.a.ec().i() * 20.0f)) < (double)$$0.v()) {
                }
                this.d = new eei($$0.u(), $$1, $$0.w());
            }
        }
    }

    @Override
    @Nullable
    public eei g() {
        return this.d;
    }

    public bur<buq> i() {
        return bur.e;
    }
}

