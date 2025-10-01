/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class dxn
extends dxy {
    private final boolean l;
    private float m;
    private float n;

    public dxn(boolean $$0) {
        this.l = $$0;
    }

    @Override
    public void a(cmz $$0, bgb $$1) {
        super.a($$0, $$1);
        $$1.a(dxp.j, 0.0f);
        this.m = $$1.a(dxp.c);
        $$1.a(dxp.c, 6.0f);
        this.n = $$1.a(dxp.k);
        $$1.a(dxp.k, 4.0f);
    }

    @Override
    public void b() {
        this.b.a(dxp.c, this.m);
        this.b.a(dxp.k, this.n);
        super.b();
    }

    @Override
    public dxr a() {
        if (!this.b.aV()) {
            return super.a();
        }
        return this.c(new gu(apa.a(this.b.cE().a), apa.a(this.b.cE().b + 0.5), apa.a(this.b.cE().c)));
    }

    @Override
    public dxx a(double $$0, double $$1, double $$2) {
        return this.a(this.b(apa.a($$0), apa.a($$1 + 0.5), apa.a($$2)));
    }

    @Override
    public int a(dxr[] $$0, dxr $$1) {
        int $$6;
        int $$2 = super.a($$0, $$1);
        dxp $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
        dxp $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
        if (this.b.a($$3) >= 0.0f && $$4 != dxp.w) {
            int $$5 = apa.d(Math.max(1.0f, this.b.dC()));
        } else {
            $$6 = 0;
        }
        double $$7 = this.d(new gu($$1.a, $$1.b, $$1.c));
        dxr $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$6 - 1), $$7, ha.b, $$4);
        dxr $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$6, $$7, ha.a, $$4);
        if (this.b($$8, $$1)) {
            $$0[$$2++] = $$8;
        }
        if (this.b($$9, $$1) && $$4 != dxp.e) {
            $$0[$$2++] = $$9;
        }
        for (int $$10 = 0; $$10 < $$2; ++$$10) {
            dxr $$11 = $$0[$$10];
            if ($$11.l != dxp.j || !this.l || $$11.b >= this.b.dI().t_() - 10) continue;
            $$11.k += 1.0f;
        }
        return $$2;
    }

    private boolean b(@Nullable dxr $$0, dxr $$1) {
        return this.a($$0, $$1) && $$0.l == dxp.j;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public dxp a(cls $$0, int $$1, int $$2, int $$3) {
        gu.a $$4 = new gu.a();
        dxp $$5 = dxn.b($$0, $$4.d($$1, $$2, $$3));
        if ($$5 == dxp.j) {
            for (ha $$6 : ha.values()) {
                dxp $$7 = dxn.b($$0, $$4.d($$1, $$2, $$3).c($$6));
                if ($$7 != dxp.a) continue;
                return dxp.k;
            }
            return dxp.j;
        }
        return dxn.a($$0, $$4);
    }
}

