/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public class cph
extends cpa {
    public static final dcv a = ctg.aC;
    public static final ddb b = dcr.aN;
    public static final int c = 5;
    private static final int d = 3;

    public cph(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(b, 0)).a(a, ha.c));
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$0, cmm $$1, gu $$2) {
        return $$0.c(b);
    }

    @Override
    public void a(cmm $$0, byo $$1, gu $$2, dcb $$3, @Nullable czn $$4, cfz $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (!$$0.B && $$4 instanceof czk) {
            czk $$6 = (czk)$$4;
            if (cki.a(ckk.v, $$5) == 0) {
                $$6.a($$1, $$3, czk.b.c);
                $$0.c($$2, this);
                this.b($$0, $$2);
            }
            ai.K.a((aig)$$1, $$3, $$5, $$6.g());
        }
    }

    private void b(cmm $$0, gu $$1) {
        List<brm> $$2 = $$0.a(brm.class, new eed($$1).c(8.0, 6.0, 8.0));
        if (!$$2.isEmpty()) {
            List<byo> $$3 = $$0.a(byo.class, new eed($$1).c(8.0, 6.0, 8.0));
            int $$4 = $$3.size();
            for (brm $$5 : $$2) {
                if ($$5.j() != null) continue;
                $$5.h($$3.get($$0.z.a($$4)));
            }
        }
    }

    public static void a(cmm $$0, gu $$1) {
        cph.a($$0, $$1, new cfz(cgc.vA, 3));
    }

    @Override
    public bdx a(dcb $$0, cmm $$12, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cfz $$6 = $$3.b($$4);
        int $$7 = $$0.c(b);
        boolean $$8 = false;
        if ($$7 >= 5) {
            cfu $$9 = $$6.d();
            if ($$6.a(cgc.rg)) {
                $$12.a($$3, $$3.dn(), $$3.dp(), $$3.dt(), amh.bI, ami.e, 1.0f, 1.0f);
                cph.a($$12, $$2);
                $$6.a(1, $$3, (T $$1) -> $$1.d($$4));
                $$8 = true;
                $$12.a((bfj)$$3, dgl.N, $$2);
            } else if ($$6.a(cgc.rw)) {
                $$6.h(1);
                $$12.a($$3, $$3.dn(), $$3.dp(), $$3.dt(), amh.ci, ami.e, 1.0f, 1.0f);
                if ($$6.b()) {
                    $$3.a($$4, new cfz(cgc.vD));
                } else if (!$$3.fN().e(new cfz(cgc.vD))) {
                    $$3.a(new cfz(cgc.vD), false);
                }
                $$8 = true;
                $$12.a((bfj)$$3, dgl.z, $$2);
            }
            if (!$$12.r_() && $$8) {
                $$3.b(amr.c.b($$9));
            }
        }
        if ($$8) {
            if (!cqa.a($$12, $$2)) {
                if (this.c($$12, $$2)) {
                    this.b($$12, $$2);
                }
                this.a($$12, $$0, $$2, $$3, czk.b.c);
            } else {
                this.a($$12, $$0, $$2);
            }
            return bdx.a($$12.B);
        }
        return super.a($$0, $$12, $$2, $$3, $$4, $$5);
    }

    private boolean c(cmm $$0, gu $$1) {
        czn $$2 = $$0.c_($$1);
        if ($$2 instanceof czk) {
            czk $$3 = (czk)$$2;
            return !$$3.d();
        }
        return false;
    }

    public void a(cmm $$0, dcb $$1, gu $$2, @Nullable byo $$3, czk.b $$4) {
        this.a($$0, $$1, $$2);
        czn $$5 = $$0.c_($$2);
        if ($$5 instanceof czk) {
            czk $$6 = (czk)$$5;
            $$6.a($$3, $$1, $$4);
        }
    }

    public void a(cmm $$0, dcb $$1, gu $$2) {
        $$0.a($$2, (dcb)$$1.a(b, 0), 3);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if ($$0.c(b) >= 5) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; ++$$4) {
                this.a($$1, $$2, $$0);
            }
        }
    }

    private void a(cmm $$0, gu $$1, dcb $$2) {
        if (!$$2.u().c() || $$0.z.i() < 0.3f) {
            return;
        }
        efb $$3 = $$2.k($$0, $$1);
        double $$4 = $$3.c(ha.a.b);
        if ($$4 >= 1.0 && !$$2.a(amw.am)) {
            double $$5 = $$3.b(ha.a.b);
            if ($$5 > 0.0) {
                this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
                gu $$6 = $$1.d();
                dcb $$7 = $$0.a_($$6);
                efb $$8 = $$7.k($$0, $$6);
                double $$9 = $$8.c(ha.a.b);
                if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                    this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
                }
            }
        }
    }

    private void a(cmm $$0, gu $$1, efb $$2, double $$3) {
        this.a($$0, (double)$$1.u() + $$2.b(ha.a.a), (double)$$1.u() + $$2.c(ha.a.a), (double)$$1.w() + $$2.b(ha.a.c), (double)$$1.w() + $$2.c(ha.a.c), $$3);
    }

    private void a(cmm $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        $$0.a(iv.ap, apa.d($$0.z.j(), $$1, $$2), $$5, apa.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, $$0.g().g());
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(b, a);
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new czk($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return $$0.B ? null : cph.a($$2, czp.H, czk::a);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        czn $$4;
        if (!$$0.B && $$3.f() && $$0.X().b(cmi.g) && ($$4 = $$0.c_($$1)) instanceof czk) {
            boolean $$8;
            czk $$5 = (czk)$$4;
            cfz $$6 = new cfz(this);
            int $$7 = $$2.c(b);
            boolean bl2 = $$8 = !$$5.d();
            if ($$8 || $$7 > 0) {
                if ($$8) {
                    qr $$9 = new qr();
                    $$9.a("Bees", $$5.j());
                    cds.a($$6, czp.H, $$9);
                }
                qr $$10 = new qr();
                $$10.a("honey_level", $$7);
                $$6.a("BlockStateTag", $$10);
                bvh $$11 = new bvh($$0, $$1.u(), $$1.v(), $$1.w(), $$6);
                $$11.o();
                $$0.b($$11);
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public List<cfz> a(dcb $$0, dzq.a $$1) {
        czn $$3;
        bfj $$2 = $$1.b(ebw.a);
        if (($$2 instanceof bvi || $$2 instanceof bvo || $$2 instanceof bzt || $$2 instanceof buv || $$2 instanceof car) && ($$3 = $$1.b(ebw.h)) instanceof czk) {
            czk $$4 = (czk)$$3;
            $$4.a(null, $$0, czk.b.c);
        }
        return super.a($$0, $$1);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        czn $$6;
        if ($$3.a_($$5).b() instanceof csj && ($$6 = $$3.c_($$4)) instanceof czk) {
            czk $$7 = (czk)$$6;
            $$7.a(null, $$0, czk.b.c);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }
}

