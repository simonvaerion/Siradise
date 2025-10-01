/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public abstract class coe
extends cpn {
    public static final int a = 3;
    public static final dcs b = dcr.r;

    protected coe(dca.d $$0) {
        super($$0);
    }

    protected abstract Iterable<eei> b(dcb var1);

    public static boolean c(dcb $$0) {
        return $$0.b(b) && ($$0.a(amw.ae) || $$0.a(amw.bi)) && $$0.c(b) != false;
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        if (!$$0.B && $$3.bL() && this.d($$1)) {
            coe.a((cmn)$$0, $$1, $$2.a(), true);
        }
    }

    protected boolean d(dcb $$0) {
        return $$0.c(b) == false;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$32) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        this.b($$0).forEach($$3 -> coe.a($$1, $$3.b($$2.u(), $$2.v(), $$2.w()), $$32));
    }

    private static void a(cmm $$0, eei $$1, apf $$2) {
        float $$3 = $$2.i();
        if ($$3 < 0.3f) {
            $$0.a(iv.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
            if ($$3 < 0.17f) {
                $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, amh.dc, ami.e, 1.0f + $$2.i(), $$2.i() * 0.7f + 0.3f, false);
            }
        }
        $$0.a(iv.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
    }

    public static void a(@Nullable byo $$0, dcb $$1, cmn $$22, gu $$3) {
        coe.a($$22, $$1, $$3, false);
        if ($$1.b() instanceof coe) {
            ((coe)$$1.b()).b($$1).forEach($$2 -> $$22.a(iv.Z, (double)$$3.u() + $$2.a(), (double)$$3.v() + $$2.b(), (double)$$3.w() + $$2.c(), 0.0, (double)0.1f, 0.0));
        }
        $$22.a(null, $$3, amh.de, ami.e, 1.0f, 1.0f);
        $$22.a((bfj)$$0, dgl.c, $$3);
    }

    private static void a(cmn $$0, dcb $$1, gu $$2, boolean $$3) {
        $$0.a($$2, (dcb)$$1.a(b, $$3), 11);
    }
}

