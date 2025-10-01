/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cuu
extends cpn {
    public static final dcz<ddc> a = dcr.bf;
    public static final dcs b = dcr.w;
    public static final ddb c = dcr.aR;
    public static final int d = 3;

    public cuu(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ddc.a)).a(c, 0)).a(b, false));
    }

    private dcb b(cmn $$0, gu $$1, dcb $$2) {
        ddc $$3 = $$0.a_($$1.c()).A();
        if ($$3.e()) {
            return (dcb)$$2.a(a, $$3);
        }
        ddc $$4 = $$0.a_($$1.d()).A();
        ddc $$5 = $$4.e() ? ddc.a : $$4;
        return (dcb)$$2.a(a, $$5);
    }

    @Override
    public dcb a(cih $$0) {
        return this.b($$0.q(), $$0.a(), this.n());
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        boolean $$6;
        boolean bl2 = $$6 = $$1.o() == ha.a.b;
        if ($$6) {
            return this.b($$3, $$4, $$0);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        boolean $$6 = $$1.B($$2);
        if ($$6 != $$0.c(b)) {
            if ($$6) {
                this.a(null, $$0, $$1, $$2);
            }
            $$1.a($$2, (dcb)$$0.a(b, $$6), 3);
        }
    }

    private void a(@Nullable bfj $$0, dcb $$1, cmm $$2, gu $$3) {
        if ($$1.c(a).e() || $$2.a_($$3.c()).i()) {
            $$2.a($$3, (cpn)this, 0, 0);
            $$2.a($$0, dgl.I, $$3);
        }
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cfz $$6 = $$3.b($$4);
        if ($$6.a(ane.aG) && $$5.b() == ha.b) {
            return bdx.d;
        }
        if ($$1.B) {
            return bdx.a;
        }
        $$0 = (dcb)$$0.a(c);
        $$1.a($$2, $$0, 3);
        this.a($$3, $$0, $$1, $$2);
        $$3.a(amr.ag);
        return bdx.b;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
        if ($$1.B) {
            return;
        }
        this.a($$3, $$0, $$1, $$2);
        $$3.a(amr.af);
    }

    public static float b(int $$0) {
        return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
    }

    @Override
    public boolean a(dcb $$0, cmm $$1, gu $$2, int $$3, int $$4) {
        he<amg> $$11;
        float $$8;
        ddc $$5 = $$0.c(a);
        if ($$5.b()) {
            int $$6 = $$0.c(c);
            float $$7 = cuu.b($$6);
            $$1.a(iv.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
        } else {
            $$8 = 1.0f;
        }
        if ($$5.d()) {
            acq $$9 = this.a($$1, $$2);
            if ($$9 == null) {
                return false;
            }
            he<amg> $$10 = he.a(amg.a($$9));
        } else {
            $$11 = $$5.a();
        }
        $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$11, ami.c, 3.0f, $$8, $$1.z.g());
        return true;
    }

    @Nullable
    private acq a(cmm $$0, gu $$1) {
        czn czn2 = $$0.c_($$1.c());
        if (czn2 instanceof dax) {
            dax $$2 = (dax)czn2;
            return $$2.f();
        }
        return null;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c);
    }
}

