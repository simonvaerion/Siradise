/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cqq
extends cpa {
    private static final int c = 6;
    public static final int a = 3;
    public static final List<dcs> b = List.of(dcr.bp, dcr.bq, dcr.br, dcr.bs, dcr.bt, dcr.bu);

    public cqq(dca.d $$0) {
        super($$0);
        dcb $$1 = (dcb)((dcb)this.C.b()).a(ctg.aC, ha.c);
        for (dcs $$2 : b) {
            $$1 = (dcb)$$1.a($$2, false);
        }
        this.k($$1);
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        void $$7;
        czn czn2 = $$1.c_($$2);
        if (!(czn2 instanceof czw)) {
            return bdx.d;
        }
        czw $$6 = (czw)czn2;
        Optional<eeh> $$8 = cqq.a($$5, $$0.c(ctg.aC));
        if ($$8.isEmpty()) {
            return bdx.d;
        }
        int $$9 = cqq.a($$8.get());
        if (((Boolean)$$0.c(b.get($$9))).booleanValue()) {
            cqq.a($$1, $$2, $$3, (czw)$$7, $$9);
            return bdx.a($$1.B);
        }
        cfz $$10 = $$3.b($$4);
        if ($$10.a(ane.av)) {
            cqq.a($$1, $$2, $$3, (czw)$$7, $$10, $$9);
            return bdx.a($$1.B);
        }
        return bdx.b;
    }

    private static Optional<eeh> a(eee $$0, ha $$1) {
        ha $$2 = $$0.b();
        if ($$1 != $$2) {
            return Optional.empty();
        }
        gu $$3 = $$0.a().a($$2);
        eei $$4 = $$0.e().a($$3.u(), $$3.v(), $$3.w());
        double $$5 = $$4.a();
        double $$6 = $$4.b();
        double $$7 = $$4.c();
        return switch ($$2) {
            default -> throw new IncompatibleClassChangeError();
            case ha.c -> Optional.of(new eeh((float)(1.0 - $$5), (float)$$6));
            case ha.d -> Optional.of(new eeh((float)$$5, (float)$$6));
            case ha.e -> Optional.of(new eeh((float)$$7, (float)$$6));
            case ha.f -> Optional.of(new eeh((float)(1.0 - $$7), (float)$$6));
            case ha.a, ha.b -> Optional.empty();
        };
    }

    private static int a(eeh $$0) {
        int $$1 = $$0.j >= 0.5f ? 0 : 1;
        int $$2 = cqq.a($$0.i);
        return $$2 + $$1 * 3;
    }

    private static int a(float $$0) {
        float $$1 = 0.0625f;
        float $$2 = 0.375f;
        if ($$0 < 0.375f) {
            return 0;
        }
        float $$3 = 0.6875f;
        if ($$0 < 0.6875f) {
            return 1;
        }
        return 2;
    }

    private static void a(cmm $$0, gu $$1, byo $$2, czw $$3, cfz $$4, int $$5) {
        if ($$0.B) {
            return;
        }
        $$2.b(amr.c.b($$4.d()));
        amg $$6 = $$4.a(cgc.tC) ? amh.et : amh.es;
        $$3.a($$5, $$4.a(1));
        $$0.a(null, $$1, $$6, ami.e, 1.0f, 1.0f);
        if ($$2.f()) {
            $$4.g(1);
        }
        $$0.a((bfj)$$2, dgl.c, $$1);
    }

    private static void a(cmm $$0, gu $$1, byo $$2, czw $$3, int $$4) {
        if ($$0.B) {
            return;
        }
        cfz $$5 = $$3.a($$4, 1);
        amg $$6 = $$5.a(cgc.tC) ? amh.ew : amh.ev;
        $$0.a(null, $$1, $$6, ami.e, 1.0f, 1.0f);
        if (!$$2.fN().e($$5)) {
            $$2.a($$5, false);
        }
        $$0.a((bfj)$$2, dgl.c, $$1);
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new czw($$0, $$1);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{ctg.aC});
        b.forEach($$1 -> $$0.a(new dde[]{$$1}));
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        czw $$6;
        if ($$0.a($$3.b())) {
            return;
        }
        czn $$5 = $$1.c_($$2);
        if ($$5 instanceof czw && !($$6 = (czw)$$5).ab_()) {
            for (int $$7 = 0; $$7 < 6; ++$$7) {
                cfz $$8 = $$6.a($$7);
                if ($$8.b()) continue;
                bdt.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
            }
            $$6.a();
            $$1.c($$2, this);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(ctg.aC, $$0.g().g());
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(ctg.aC, $$1.a($$0.c(ctg.aC)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(ctg.aC)));
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$0, cmm $$1, gu $$2) {
        if ($$1.r_()) {
            return 0;
        }
        czn czn2 = $$1.c_($$2);
        if (czn2 instanceof czw) {
            czw $$3 = (czw)czn2;
            return $$3.g() + 1;
        }
        return 0;
    }
}

