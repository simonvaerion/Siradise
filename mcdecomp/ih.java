/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ih {
    public static final Logger a = LogUtils.getLogger();
    public static final ih b = ($$0, $$1) -> $$1;

    public cfz dispense(gv var1, cfz var2);

    public static void c() {
        cro.a(cgc.nH, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$1, cfz $$2) {
                byw $$3 = new byw($$0, $$1.a(), $$1.b(), $$1.c());
                $$3.d = byu.a.b;
                return $$3;
            }
        });
        cro.a(cgc.uw, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$1, cfz $$2) {
                byw $$3 = new byw($$0, $$1.a(), $$1.b(), $$1.c());
                $$3.a($$2);
                $$3.d = byu.a.b;
                return $$3;
            }
        });
        cro.a(cgc.uv, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$1, cfz $$2) {
                bzl $$3 = new bzl($$0, $$1.a(), $$1.b(), $$1.c());
                $$3.d = byu.a.b;
                return $$3;
            }
        });
        cro.a(cgc.qd, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$12, cfz $$2) {
                return ac.a(new bzo($$0, $$12.a(), $$12.b(), $$12.c()), (T $$1) -> $$1.a($$2));
            }
        });
        cro.a(cgc.pO, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$12, cfz $$2) {
                return ac.a(new bzk($$0, $$12.a(), $$12.b(), $$12.c()), (T $$1) -> $$1.a($$2));
            }
        });
        cro.a(cgc.te, new id(){

            @Override
            protected bzg a(cmm $$0, ho $$12, cfz $$2) {
                return ac.a(new bzq($$0, $$12.a(), $$12.b(), $$12.c()), (T $$1) -> $$1.a($$2));
            }

            @Override
            protected float a() {
                return super.a() * 0.5f;
            }

            @Override
            protected float b() {
                return super.b() * 1.25f;
            }
        });
        cro.a(cgc.uu, new ih(){

            @Override
            public cfz dispense(gv $$0, cfz $$1) {
                return new id(){

                    @Override
                    protected bzg a(cmm $$0, ho $$12, cfz $$2) {
                        return ac.a(new bzr($$0, $$12.a(), $$12.b(), $$12.c()), (T $$1) -> $$1.a($$2));
                    }

                    @Override
                    protected float a() {
                        return super.a() * 0.5f;
                    }

                    @Override
                    protected float b() {
                        return super.b() * 1.25f;
                    }
                }.dispense($$0, $$1);
            }
        });
        cro.a(cgc.ux, new ih(){

            @Override
            public cfz dispense(gv $$0, cfz $$1) {
                return new id(){

                    @Override
                    protected bzg a(cmm $$0, ho $$12, cfz $$2) {
                        return ac.a(new bzr($$0, $$12.a(), $$12.b(), $$12.c()), (T $$1) -> $$1.a($$2));
                    }

                    @Override
                    protected float a() {
                        return super.a() * 0.5f;
                    }

                    @Override
                    protected float b() {
                        return super.b() * 1.25f;
                    }
                }.dispense($$0, $$1);
            }
        });
        ig $$0 = new ig(){

            @Override
            public cfz a(gv $$0, cfz $$1) {
                ha $$2 = $$0.e().c(cro.a);
                bfn<?> $$3 = ((che)$$1.d()).a($$1.v());
                try {
                    $$3.a($$0.g(), $$1, null, $$0.d().a($$2), bgd.o, $$2 != ha.b, false);
                }
                catch (Exception $$4) {
                    a.error("Error while dispensing spawn egg from dispenser at {}", (Object)$$0.d(), (Object)$$4);
                    return cfz.b;
                }
                $$1.h(1);
                $$0.g().a(null, dgl.t, $$0.d());
                return $$1;
            }
        };
        for (che $$1 : che.h()) {
            cro.a($$1, $$0);
        }
        cro.a(cgc.tL, new ig(){

            @Override
            public cfz a(gv $$0, cfz $$12) {
                ha $$2 = $$0.e().c(cro.a);
                gu $$3 = $$0.d().a($$2);
                aif $$4 = $$0.g();
                Consumer<bux> $$5 = bfn.a($$1 -> $$1.a_($$2.p()), $$4, $$12, null);
                bux $$6 = bfn.d.a($$4, $$12.v(), $$5, $$3, bgd.o, false, false);
                if ($$6 != null) {
                    $$12.h(1);
                }
                return $$12;
            }
        });
        cro.a(cgc.mZ, new ii(){

            @Override
            public cfz a(gv $$02, cfz $$1) {
                gu $$2 = $$02.d().a($$02.e().c(cro.a));
                List<bfz> $$3 = $$02.g().a(bfz.class, new eed($$2), $$0 -> {
                    if ($$0 instanceof bgq) {
                        bgq $$1 = (bgq)((Object)$$0);
                        return !$$1.i() && $$1.g();
                    }
                    return false;
                });
                if (!$$3.isEmpty()) {
                    ((bgq)((Object)$$3.get(0))).a(ami.e);
                    $$1.h(1);
                    this.a(true);
                    return $$1;
                }
                return super.a($$02, $$1);
            }
        });
        ii $$2 = new ii(){

            @Override
            protected cfz a(gv $$02, cfz $$1) {
                gu $$2 = $$02.d().a($$02.e().c(cro.a));
                List<btk> $$3 = $$02.g().a(btk.class, new eed($$2), $$0 -> $$0.bs() && $$0.gH());
                for (btk $$4 : $$3) {
                    if (!$$4.l($$1) || $$4.gI() || !$$4.gn()) continue;
                    $$4.a_(401).a($$1.a(1));
                    this.a(true);
                    return $$1;
                }
                return super.a($$02, $$1);
            }
        };
        cro.a(cgc.tP, $$2);
        cro.a(cgc.tM, $$2);
        cro.a(cgc.tN, $$2);
        cro.a(cgc.tO, $$2);
        cro.a(cgc.hi, $$2);
        cro.a(cgc.hj, $$2);
        cro.a(cgc.hr, $$2);
        cro.a(cgc.ht, $$2);
        cro.a(cgc.hu, $$2);
        cro.a(cgc.hx, $$2);
        cro.a(cgc.hp, $$2);
        cro.a(cgc.hv, $$2);
        cro.a(cgc.hl, $$2);
        cro.a(cgc.hq, $$2);
        cro.a(cgc.hn, $$2);
        cro.a(cgc.hk, $$2);
        cro.a(cgc.ho, $$2);
        cro.a(cgc.hs, $$2);
        cro.a(cgc.hw, $$2);
        cro.a(cgc.hm, $$2);
        cro.a(cgc.er, new ii(){

            @Override
            public cfz a(gv $$02, cfz $$1) {
                gu $$2 = $$02.d().a($$02.e().c(cro.a));
                List<btj> $$3 = $$02.g().a(btj.class, new eed($$2), $$0 -> $$0.bs() && !$$0.r());
                for (btj $$4 : $$3) {
                    if (!$$4.gn() || !$$4.a_(499).a($$1)) continue;
                    $$1.h(1);
                    this.a(true);
                    return $$1;
                }
                return super.a($$02, $$1);
            }
        });
        cro.a(cgc.tA, new ig(){

            @Override
            public cfz a(gv $$0, cfz $$1) {
                ha $$2 = $$0.e().c(cro.a);
                bzb $$3 = new bzb((cmm)$$0.g(), $$1, $$0.a(), $$0.b(), $$0.a(), true);
                ih.a($$0, $$3, $$2);
                $$3.c($$2.j(), $$2.k(), $$2.l(), 0.5f, 1.0f);
                $$0.g().b($$3);
                $$1.h(1);
                return $$1;
            }

            @Override
            protected void a(gv $$0) {
                $$0.g().c(1004, $$0.d(), 0);
            }
        });
        cro.a(cgc.tf, new ig(){

            @Override
            public cfz a(gv $$0, cfz $$12) {
                ha $$2 = $$0.e().c(cro.a);
                ho $$3 = cro.a($$0);
                double $$4 = $$3.a() + (double)((float)$$2.j() * 0.3f);
                double $$5 = $$3.b() + (double)((float)$$2.k() * 0.3f);
                double $$6 = $$3.c() + (double)((float)$$2.l() * 0.3f);
                aif $$7 = $$0.g();
                apf $$8 = $$7.z;
                double $$9 = $$8.a((double)$$2.j(), 0.11485000000000001);
                double $$10 = $$8.a((double)$$2.k(), 0.11485000000000001);
                double $$11 = $$8.a((double)$$2.l(), 0.11485000000000001);
                bzj $$122 = new bzj($$7, $$4, $$5, $$6, $$9, $$10, $$11);
                $$7.b(ac.a($$122, (T $$1) -> $$1.a($$12)));
                $$12.h(1);
                return $$12;
            }

            @Override
            protected void a(gv $$0) {
                $$0.g().c(1018, $$0.d(), 0);
            }
        });
        cro.a(cgc.ni, new ie(cah.b.a));
        cro.a(cgc.nk, new ie(cah.b.b));
        cro.a(cgc.nm, new ie(cah.b.c));
        cro.a(cgc.no, new ie(cah.b.d));
        cro.a(cgc.nu, new ie(cah.b.g));
        cro.a(cgc.nq, new ie(cah.b.e));
        cro.a(cgc.ns, new ie(cah.b.f));
        cro.a(cgc.nw, new ie(cah.b.h));
        cro.a(cgc.ny, new ie(cah.b.i));
        cro.a(cgc.nj, new ie(cah.b.a, true));
        cro.a(cgc.nl, new ie(cah.b.b, true));
        cro.a(cgc.nn, new ie(cah.b.c, true));
        cro.a(cgc.np, new ie(cah.b.d, true));
        cro.a(cgc.nv, new ie(cah.b.g, true));
        cro.a(cgc.nr, new ie(cah.b.e, true));
        cro.a(cgc.nt, new ie(cah.b.f, true));
        cro.a(cgc.nx, new ie(cah.b.h, true));
        cro.a(cgc.nz, new ie(cah.b.i, true));
        ig $$3 = new ig(){
            private final ig c = new ig();

            @Override
            public cfz a(gv $$0, cfz $$1) {
                cel $$2 = (cel)((Object)$$1.d());
                gu $$3 = $$0.d().a($$0.e().c(cro.a));
                aif $$4 = $$0.g();
                if ($$2.a(null, (cmm)$$4, $$3, null)) {
                    $$2.a(null, (cmm)$$4, $$1, $$3);
                    return new cfz(cgc.pK);
                }
                return this.c.dispense($$0, $$1);
            }
        };
        cro.a(cgc.pM, $$3);
        cro.a(cgc.pL, $$3);
        cro.a(cgc.pN, $$3);
        cro.a(cgc.pS, $$3);
        cro.a(cgc.pT, $$3);
        cro.a(cgc.pR, $$3);
        cro.a(cgc.pU, $$3);
        cro.a(cgc.pV, $$3);
        cro.a(cgc.pW, $$3);
        cro.a(cgc.pK, new ig(){
            private final ig c = new ig();

            /*
             * WARNING - void declaration
             */
            @Override
            public cfz a(gv $$0, cfz $$1) {
                void $$8;
                cfz $$6;
                gu $$3;
                aif $$2 = $$0.g();
                dcb $$4 = $$2.a_($$3 = $$0.d().a($$0.e().c(cro.a)));
                cpn $$5 = $$4.b();
                if ($$5 instanceof cpt) {
                    $$6 = ((cpt)((Object)$$5)).c($$2, $$3, $$4);
                    if ($$6.b()) {
                        return super.a($$0, $$1);
                    }
                } else {
                    return super.a($$0, $$1);
                }
                $$2.a(null, dgl.z, $$3);
                cfu $$7 = $$6.d();
                $$1.h(1);
                if ($$1.b()) {
                    return new cfz((cml)$$8);
                }
                if (((dae)$$0.f()).a(new cfz((cml)$$8)) < 0) {
                    this.c.dispense($$0, new cfz((cml)$$8));
                }
                return $$1;
            }
        });
        cro.a(cgc.nE, new ii(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                aif $$2 = $$0.g();
                this.a(true);
                ha $$3 = $$0.e().c(cro.a);
                gu $$4 = $$0.d().a($$3);
                dcb $$5 = $$2.a_($$4);
                if (cpb.a((cmm)$$2, $$4, $$3)) {
                    $$2.b($$4, cpb.a($$2, $$4));
                    $$2.a(null, dgl.i, $$4);
                } else if (cqa.h($$5) || cqb.g($$5) || cqc.g($$5)) {
                    $$2.b($$4, (dcb)$$5.a(dcr.r, true));
                    $$2.a(null, dgl.c, $$4);
                } else if ($$5.b() instanceof cxx) {
                    cxx.a($$2, $$4);
                    $$2.a($$4, false);
                } else {
                    this.a(false);
                }
                if (this.a() && $$1.a(1, $$2.z, null)) {
                    $$1.f(0);
                }
                return $$1;
            }
        });
        cro.a(cgc.qK, new ii(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                this.a(true);
                aif $$2 = $$0.g();
                gu $$3 = $$0.d().a($$0.e().c(cro.a));
                if (cdu.a($$1, $$2, $$3) || cdu.a($$1, $$2, $$3, null)) {
                    if (!$$2.B) {
                        $$2.c(1505, $$3, 0);
                    }
                } else {
                    this.a(false);
                }
                return $$1;
            }
        });
        cro.a(cpo.ck, new ig(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                aif $$2 = $$0.g();
                gu $$3 = $$0.d().a($$0.e().c(cro.a));
                bvi $$4 = new bvi($$2, (double)$$3.u() + 0.5, $$3.v(), (double)$$3.w() + 0.5, null);
                $$2.b($$4);
                $$2.a(null, $$4.dn(), $$4.dp(), $$4.dt(), amh.xF, ami.e, 1.0f, 1.0f);
                $$2.a(null, dgl.t, $$3);
                $$1.h(1);
                return $$1;
            }
        });
        ii $$4 = new ii(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                this.a(cdj.a($$0, $$1));
                return $$1;
            }
        };
        cro.a(cgc.tv, $$4);
        cro.a(cgc.tu, $$4);
        cro.a(cgc.tw, $$4);
        cro.a(cgc.tr, $$4);
        cro.a(cgc.tx, $$4);
        cro.a(cgc.tt, $$4);
        cro.a(cgc.ts, new ii(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                aif $$2 = $$0.g();
                ha $$3 = $$0.e().c(cro.a);
                gu $$4 = $$0.d().a($$3);
                if ($$2.t($$4) && cyz.b($$2, $$4, $$1)) {
                    $$2.a($$4, (dcb)cpo.gG.n().a(cwp.b, ddh.a($$3)), 3);
                    $$2.a(null, dgl.i, $$4);
                    czn $$5 = $$2.c_($$4);
                    if ($$5 instanceof dax) {
                        cyz.a((cmm)$$2, $$4, (dax)$$5);
                    }
                    $$1.h(1);
                    this.a(true);
                } else {
                    this.a(cdj.a($$0, $$1));
                }
                return $$1;
            }
        });
        cro.a(cpo.ef, new ii(){

            @Override
            protected cfz a(gv $$0, cfz $$1) {
                aif $$2 = $$0.g();
                gu $$3 = $$0.d().a($$0.e().c(cro.a));
                cqg $$4 = (cqg)cpo.ef;
                if ($$2.t($$3) && $$4.a((cmp)$$2, $$3)) {
                    if (!$$2.B) {
                        $$2.a($$3, $$4.n(), 3);
                        $$2.a(null, dgl.i, $$3);
                    }
                    $$1.h(1);
                    this.a(true);
                } else {
                    this.a(cdj.a($$0, $$1));
                }
                return $$1;
            }
        });
        cro.a(cpo.kP.k(), new ik());
        for (cen $$5 : cen.values()) {
            cro.a(cwm.a($$5).k(), new ik());
        }
        cro.a(cgc.rw.k(), new ii(){
            private final ig c = new ig();

            private cfz a(gv $$0, cfz $$1, cfz $$2) {
                $$1.h(1);
                if ($$1.b()) {
                    $$0.g().a(null, dgl.z, $$0.d());
                    return $$2.p();
                }
                if (((dae)$$0.f()).a($$2.p()) < 0) {
                    this.c.dispense($$0, $$2.p());
                }
                return $$1;
            }

            @Override
            public cfz a(gv $$02, cfz $$1) {
                this.a(false);
                aif $$2 = $$02.g();
                gu $$3 = $$02.d().a($$02.e().c(cro.a));
                dcb $$4 = $$2.a_($$3);
                if ($$4.a(amw.aE, (dca.a $$0) -> $$0.b(cph.b) && $$0.b() instanceof cph) && $$4.c(cph.b) >= 5) {
                    ((cph)$$4.b()).a((cmm)$$2, $$4, $$3, null, czk.b.b);
                    this.a(true);
                    return this.a($$02, $$1, new cfz(cgc.vD));
                }
                if ($$2.b_($$3).a(anb.a)) {
                    this.a(true);
                    return this.a($$02, $$1, chy.a(new cfz(cgc.rv), chz.c));
                }
                return super.a($$02, $$1);
            }
        });
        cro.a(cgc.eY, new ii(){

            @Override
            public cfz a(gv $$0, cfz $$1) {
                ha $$2 = $$0.e().c(cro.a);
                gu $$3 = $$0.d().a($$2);
                aif $$4 = $$0.g();
                dcb $$5 = $$4.a_($$3);
                this.a(true);
                if ($$5.a(cpo.pl)) {
                    if ($$5.c(cvu.c) != 4) {
                        cvu.a(null, (cmm)$$4, $$3, $$5);
                        $$1.h(1);
                    } else {
                        this.a(false);
                    }
                    return $$1;
                }
                return super.a($$0, $$1);
            }
        });
        cro.a(cgc.rg.k(), new ij());
        cro.a(cgc.vA, new ii(){

            @Override
            public cfz a(gv $$0, cfz $$1) {
                gu $$2 = $$0.d().a($$0.e().c(cro.a));
                aif $$3 = $$0.g();
                dcb $$4 = $$3.a_($$2);
                Optional<dcb> $$5 = cfo.b($$4);
                if ($$5.isPresent()) {
                    $$3.b($$2, $$5.get());
                    $$3.c(3003, $$2, 0);
                    $$1.h(1);
                    this.a(true);
                    return $$1;
                }
                return super.a($$0, $$1);
            }
        });
        cro.a(cgc.rv, new ig(){
            private final ig c = new ig();

            @Override
            public cfz a(gv $$0, cfz $$1) {
                if (chy.d($$1) != chz.c) {
                    return this.c.dispense($$0, $$1);
                }
                aif $$2 = $$0.g();
                gu $$3 = $$0.d();
                gu $$4 = $$0.d().a($$0.e().c(cro.a));
                if ($$2.a_($$4).a(amw.bY)) {
                    if (!$$2.B) {
                        for (int $$5 = 0; $$5 < 5; ++$$5) {
                            $$2.a(iv.ag, (double)$$3.u() + $$2.z.j(), (double)($$3.v() + 1), (double)$$3.w() + $$2.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
                        }
                    }
                    $$2.a(null, $$3, amh.ch, ami.e, 1.0f, 1.0f);
                    $$2.a(null, dgl.A, $$3);
                    $$2.b($$4, cpo.rH.n());
                    return new cfz(cgc.rw);
                }
                return this.c.dispense($$0, $$1);
            }
        });
    }

    public static void a(gv $$0, bfj $$1, ha $$2) {
        $$1.e($$0.a() + (double)$$2.j() * (0.5000099999997474 - (double)$$1.dd() / 2.0), $$0.b() + (double)$$2.k() * (0.5000099999997474 - (double)$$1.de() / 2.0) - (double)$$1.de() / 2.0, $$0.c() + (double)$$2.l() * (0.5000099999997474 - (double)$$1.dd() / 2.0));
    }
}

