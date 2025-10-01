/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class cdx
extends cgp
implements cht {
    public static final int a = 20;
    public static final int b = 15;

    public cdx(cfu.a $$0) {
        super($$0);
    }

    @Override
    public void a(cfz $$0, cmm $$12, bfz $$2, int $$3) {
        boolean $$9;
        int $$7;
        float $$8;
        if (!($$2 instanceof byo)) {
            return;
        }
        byo $$4 = (byo)$$2;
        boolean $$5 = $$4.fO().d || cki.a(ckk.B, $$0) > 0;
        cfz $$6 = $$4.g($$0);
        if ($$6.b() && !$$5) {
            return;
        }
        if ($$6.b()) {
            $$6 = new cfz(cgc.nH);
        }
        if ((double)($$8 = cdx.a($$7 = this.b($$0) - $$3)) < 0.1) {
            return;
        }
        boolean bl2 = $$9 = $$5 && $$6.a(cgc.nH);
        if (!$$12.B) {
            int $$13;
            int $$122;
            cdn $$10 = (cdn)($$6.d() instanceof cdn ? $$6.d() : cgc.nH);
            byu $$11 = $$10.a($$12, $$6, (bfz)$$4);
            $$11.a($$4, $$4.dA(), $$4.dy(), 0.0f, $$8 * 3.0f, 1.0f);
            if ($$8 == 1.0f) {
                $$11.a(true);
            }
            if (($$122 = cki.a(ckk.y, $$0)) > 0) {
                $$11.h($$11.q() + (double)$$122 * 0.5 + 0.5);
            }
            if (($$13 = cki.a(ckk.z, $$0)) > 0) {
                $$11.b($$13);
            }
            if (cki.a(ckk.A, $$0) > 0) {
                $$11.g(100);
            }
            $$0.a(1, $$4, (T $$1) -> $$1.d($$4.fj()));
            if ($$9 || $$4.fO().d && ($$6.a(cgc.uv) || $$6.a(cgc.uw))) {
                $$11.d = byu.a.c;
            }
            $$12.b($$11);
        }
        $$12.a(null, $$4.dn(), $$4.dp(), $$4.dt(), amh.ar, ami.h, 1.0f, 1.0f / ($$12.y_().i() * 0.4f + 1.2f) + $$8 * 0.5f);
        if (!$$9 && !$$4.fO().d) {
            $$6.h(1);
            if ($$6.b()) {
                $$4.fN().g($$6);
            }
        }
        $$4.b(amr.c.b(this));
    }

    public static float a(int $$0) {
        float $$1 = (float)$$0 / 20.0f;
        if (($$1 = ($$1 * $$1 + $$1 * 2.0f) / 3.0f) > 1.0f) {
            $$1 = 1.0f;
        }
        return $$1;
    }

    @Override
    public int b(cfz $$0) {
        return 72000;
    }

    @Override
    public chs c(cfz $$0) {
        return chs.e;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        boolean $$4;
        cfz $$3 = $$1.b($$2);
        boolean bl2 = $$4 = !$$1.g($$3).b();
        if ($$1.fO().d || $$4) {
            $$1.c($$2);
            return bdy.b($$3);
        }
        return bdy.d($$3);
    }

    @Override
    public Predicate<cfz> b() {
        return c;
    }

    @Override
    public int d() {
        return 15;
    }
}

