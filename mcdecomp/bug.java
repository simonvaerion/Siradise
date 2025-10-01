/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bug
extends bud {
    @Nullable
    private eei b;
    private int c;

    public bug(bub $$0) {
        super($$0);
    }

    @Override
    public void b() {
        if (this.c++ % 10 == 0) {
            float $$0 = (this.a.ec().i() - 0.5f) * 8.0f;
            float $$1 = (this.a.ec().i() - 0.5f) * 4.0f;
            float $$2 = (this.a.ec().i() - 0.5f) * 8.0f;
            this.a.dI().a(iv.w, this.a.dn() + (double)$$0, this.a.dp() + 2.0 + (double)$$1, this.a.dt() + (double)$$2, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void c() {
        double $$1;
        ++this.c;
        if (this.b == null) {
            gu $$0 = this.a.dI().a(dhk.a.e, dkn.a(this.a.q()));
            this.b = eei.c($$0);
        }
        if (($$1 = this.b.c(this.a.dn(), this.a.dp(), this.a.dt())) < 100.0 || $$1 > 22500.0 || this.a.O || this.a.P) {
            this.a.t(0.0f);
        } else {
            this.a.t(1.0f);
        }
    }

    @Override
    public void d() {
        this.b = null;
        this.c = 0;
    }

    @Override
    public float f() {
        return 3.0f;
    }

    @Override
    @Nullable
    public eei g() {
        return this.b;
    }

    public bur<bug> i() {
        return bur.j;
    }
}

