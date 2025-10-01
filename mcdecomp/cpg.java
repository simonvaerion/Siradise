/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cpg
extends ctg
implements csb {
    public static final dcz<dco> a = dcr.bb;
    public static final dcs b = dcr.t;
    protected static final int c = 9;
    protected static final efb d = cpn.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
    private static final int m = 3;
    protected static final efb e = cpn.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
    protected static final efb f = cpn.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
    protected static final efb g = cpn.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
    protected static final efb h = cpn.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
    protected static final efb i = eey.a(d, e, g);
    protected static final efb j = eey.a(d, f, h);
    protected static final efb k = eey.a(d, e, f);
    protected static final efb l = eey.a(d, g, h);
    private final cen n;

    public cpg(cen $$0, dca.d $$1) {
        super($$1);
        this.n = $$0;
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, dco.b)).a(b, false));
    }

    @Nullable
    public static ha a(cls $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        return $$2.b() instanceof cpg ? $$2.c(aC) : null;
    }

    @Override
    public bdx a(dcb $$0, cmm $$12, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$12.B) {
            return bdx.b;
        }
        if ($$0.c(a) != dco.a && !($$0 = $$12.a_($$2 = $$2.a($$0.c(aC)))).a(this)) {
            return bdx.b;
        }
        if (!cpg.a($$12)) {
            $$12.a($$2, false);
            gu $$6 = $$2.a($$0.c(aC).g());
            if ($$12.a_($$6).a(this)) {
                $$12.a($$6, false);
            }
            eei $$7 = $$2.b();
            $$12.a(null, $$12.ag().a($$7), null, $$7, 5.0f, true, cmm.a.b);
            return bdx.a;
        }
        if ($$0.c(b).booleanValue()) {
            if (!this.a($$12, $$2)) {
                $$3.a(sw.c("block.minecraft.bed.occupied"), true);
            }
            return bdx.a;
        }
        $$3.a($$2).ifLeft($$1 -> {
            if ($$1.a() != null) {
                $$3.a($$1.a(), true);
            }
        });
        return bdx.a;
    }

    public static boolean a(cmm $$0) {
        return $$0.x_().l();
    }

    private boolean a(cmm $$0, gu $$1) {
        List<byb> $$2 = $$0.a(byb.class, new eed($$1), bfz::fy);
        if ($$2.isEmpty()) {
            return false;
        }
        $$2.get(0).fz();
        return true;
    }

    @Override
    public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4 * 0.5f);
    }

    @Override
    public void a(cls $$0, bfj $$1) {
        if ($$1.bR()) {
            super.a($$0, $$1);
        } else {
            this.a($$1);
        }
    }

    private void a(bfj $$0) {
        eei $$1 = $$0.dl();
        if ($$1.d < 0.0) {
            double $$2 = $$0 instanceof bfz ? 1.0 : 0.8;
            $$0.o($$1.c, -$$1.d * (double)0.66f * $$2, $$1.e);
        }
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == cpg.a($$0.c(a), $$0.c(aC))) {
            if ($$2.a(this) && $$2.c(a) != $$0.c(a)) {
                return (dcb)$$0.a(b, $$2.c(b));
            }
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private static ha a(dco $$0, ha $$1) {
        return $$0 == dco.b ? $$1 : $$1.g();
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        gu $$5;
        dcb $$6;
        dco $$4;
        if (!$$0.B && $$3.f() && ($$4 = $$2.c(a)) == dco.b && ($$6 = $$0.a_($$5 = $$1.a(cpg.a($$4, $$2.c(aC))))).a(this) && $$6.c(a) == dco.a) {
            $$0.a($$5, cpo.a.n(), 35);
            $$0.a($$3, 2001, $$5, cpn.i($$6));
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha $$1 = $$0.g();
        gu $$2 = $$0.a();
        gu $$3 = $$2.a($$1);
        cmm $$4 = $$0.q();
        if ($$4.a_($$3).a($$0) && $$4.w_().a($$3)) {
            return (dcb)this.n().a(aC, $$1);
        }
        return null;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        ha $$4 = cpg.g($$0).g();
        switch ($$4) {
            case c: {
                return i;
            }
            case d: {
                return j;
            }
            case e: {
                return k;
            }
        }
        return l;
    }

    public static ha g(dcb $$0) {
        ha $$1 = $$0.c(aC);
        return $$0.c(a) == dco.a ? $$1.g() : $$1;
    }

    public static crq.a h(dcb $$0) {
        dco $$1 = $$0.c(a);
        if ($$1 == dco.a) {
            return crq.a.b;
        }
        return crq.a.c;
    }

    private static boolean b(cls $$0, gu $$1) {
        return $$0.a_($$1.d()).b() instanceof cpg;
    }

    public static Optional<eei> a(bfn<?> $$0, clw $$1, gu $$2, ha $$3, float $$4) {
        ha $$6;
        ha $$5 = $$3.h();
        ha ha2 = $$6 = $$5.a($$4) ? $$5.g() : $$5;
        if (cpg.b($$1, $$2)) {
            return cpg.a($$0, $$1, $$2, $$3, $$6);
        }
        int[][] $$7 = cpg.a($$3, $$6);
        Optional<eei> $$8 = cpg.a($$0, $$1, $$2, $$7, true);
        if ($$8.isPresent()) {
            return $$8;
        }
        return cpg.a($$0, $$1, $$2, $$7, false);
    }

    private static Optional<eei> a(bfn<?> $$0, clw $$1, gu $$2, ha $$3, ha $$4) {
        int[][] $$5 = cpg.b($$3, $$4);
        Optional<eei> $$6 = cpg.a($$0, $$1, $$2, $$5, true);
        if ($$6.isPresent()) {
            return $$6;
        }
        gu $$7 = $$2.d();
        Optional<eei> $$8 = cpg.a($$0, $$1, $$7, $$5, true);
        if ($$8.isPresent()) {
            return $$8;
        }
        int[][] $$9 = cpg.a($$3);
        Optional<eei> $$10 = cpg.a($$0, $$1, $$2, $$9, true);
        if ($$10.isPresent()) {
            return $$10;
        }
        Optional<eei> $$11 = cpg.a($$0, $$1, $$2, $$5, false);
        if ($$11.isPresent()) {
            return $$11;
        }
        Optional<eei> $$12 = cpg.a($$0, $$1, $$7, $$5, false);
        if ($$12.isPresent()) {
            return $$12;
        }
        return cpg.a($$0, $$1, $$2, $$9, false);
    }

    private static Optional<eei> a(bfn<?> $$0, clw $$1, gu $$2, int[][] $$3, boolean $$4) {
        gu.a $$5 = new gu.a();
        for (int[] $$6 : $$3) {
            $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
            eei $$7 = cak.a($$0, $$1, $$5, $$4);
            if ($$7 == null) continue;
            return Optional.of($$7);
        }
        return Optional.empty();
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.b;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(aC, a, b);
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new czj($$0, $$1, this.n);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if (!$$0.B) {
            gu $$5 = $$1.a($$2.c(aC));
            $$0.a($$5, (dcb)$$2.a(a, dco.a), 3);
            $$0.b($$1, cpo.a);
            $$2.a((cmn)$$0, $$1, 3);
        }
    }

    public cen a() {
        return this.n;
    }

    @Override
    public long a(dcb $$0, gu $$1) {
        gu $$2 = $$1.a($$0.c(aC), $$0.c(a) == dco.a ? 0 : 1);
        return apa.b($$2.u(), $$1.v(), $$2.w());
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    private static int[][] a(ha $$0, ha $$1) {
        return (int[][])ArrayUtils.addAll((Object[])cpg.b($$0, $$1), (Object[])cpg.a($$0));
    }

    private static int[][] b(ha $$0, ha $$1) {
        return new int[][]{{$$1.j(), $$1.l()}, {$$1.j() - $$0.j(), $$1.l() - $$0.l()}, {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2}, {-$$0.j() * 2, -$$0.l() * 2}, {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2}, {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()}, {-$$1.j(), -$$1.l()}, {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()}, {$$0.j(), $$0.l()}, {$$1.j() + $$0.j(), $$1.l() + $$0.l()}};
    }

    private static int[][] a(ha $$0) {
        return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
    }
}

