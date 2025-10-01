/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class dtp {
    private static final int a = 8;
    static final b b = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(dvu $$0, int $$1, a $$2, gu $$3, List<dse> $$4, apf $$5) {
            if ($$1 > 8) {
                return false;
            }
            cvz $$6 = $$2.e().d();
            a $$7 = dtp.a($$4, dtp.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 0, -1), "second_floor_2", $$6, false));
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 8, -1), "second_roof", $$6, false));
                dtp.a($$0, d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 0, -1), "second_floor_2", $$6, false));
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 4, -1), "third_floor_2", $$6, false));
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 8, -1), "third_roof", $$6, true));
                dtp.a($$0, d, $$1 + 1, $$7, null, $$4, $$5);
            }
            return true;
        }
    };
    static final List<apy<cvz, gu>> c = Lists.newArrayList((Object[])new apy[]{new apy<cvz, gu>(cvz.a, new gu(1, -1, 0)), new apy<cvz, gu>(cvz.b, new gu(6, -1, 1)), new apy<cvz, gu>(cvz.d, new gu(0, -1, 5)), new apy<cvz, gu>(cvz.c, new gu(5, -1, 6))});
    static final b d = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(dvu $$0, int $$1, a $$2, gu $$3, List<dse> $$4, apf $$5) {
            cvz $$6 = $$2.e().d();
            a $$7 = $$2;
            $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
            $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(0, 7, 0), "tower_piece", $$6, true));
            a $$8 = $$5.a(3) == 0 ? $$7 : null;
            int $$9 = 1 + $$5.a(3);
            for (int $$10 = 0; $$10 < $$9; ++$$10) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(0, 4, 0), "tower_piece", $$6, true));
                if ($$10 >= $$9 - 1 || !$$5.h()) continue;
                $$8 = $$7;
            }
            if ($$8 != null) {
                for (apy<cvz, gu> $$11 : c) {
                    if (!$$5.h()) continue;
                    a $$12 = dtp.a($$4, dtp.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                    dtp.a($$0, e, $$1 + 1, $$12, null, $$4, $$5);
                }
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 4, -1), "tower_top", $$6, true));
            } else if ($$1 == 7) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-1, 4, -1), "tower_top", $$6, true));
            } else {
                return dtp.a($$0, g, $$1 + 1, $$7, null, $$4, $$5);
            }
            return true;
        }
    };
    static final b e = new b(){
        public boolean a;

        @Override
        public void a() {
            this.a = false;
        }

        @Override
        public boolean a(dvu $$0, int $$1, a $$2, gu $$3, List<dse> $$4, apf $$5) {
            cvz $$6 = $$2.e().d();
            int $$7 = $$5.a(4) + 1;
            a $$8 = dtp.a($$4, dtp.a($$0, $$2, new gu(0, 0, -4), "bridge_piece", $$6, true));
            $$8.a(-1);
            int $$9 = 0;
            for (int $$10 = 0; $$10 < $$7; ++$$10) {
                if ($$5.h()) {
                    $$8 = dtp.a($$4, dtp.a($$0, $$8, new gu(0, $$9, -4), "bridge_piece", $$6, true));
                    $$9 = 0;
                    continue;
                }
                $$8 = $$5.h() ? dtp.a($$4, dtp.a($$0, $$8, new gu(0, $$9, -4), "bridge_steep_stairs", $$6, true)) : dtp.a($$4, dtp.a($$0, $$8, new gu(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
                $$9 = 4;
            }
            if (this.a || $$5.a(10 - $$1) != 0) {
                if (!dtp.a($$0, b, $$1 + 1, $$8, new gu(-3, $$9 + 1, -11), $$4, $$5)) {
                    return false;
                }
            } else {
                dtp.a($$4, dtp.a($$0, $$8, new gu(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
                this.a = true;
            }
            $$8 = dtp.a($$4, dtp.a($$0, $$8, new gu(4, $$9, 0), "bridge_end", $$6.a(cvz.c), true));
            $$8.a(-1);
            return true;
        }
    };
    static final List<apy<cvz, gu>> f = Lists.newArrayList((Object[])new apy[]{new apy<cvz, gu>(cvz.a, new gu(4, -1, 0)), new apy<cvz, gu>(cvz.b, new gu(12, -1, 4)), new apy<cvz, gu>(cvz.d, new gu(0, -1, 8)), new apy<cvz, gu>(cvz.c, new gu(8, -1, 12))});
    static final b g = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(dvu $$0, int $$1, a $$2, gu $$3, List<dse> $$4, apf $$5) {
            cvz $$6 = $$2.e().d();
            a $$7 = dtp.a($$4, dtp.a($$0, $$2, new gu(-3, 4, -3), "fat_tower_base", $$6, true));
            $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(0, 4, 0), "fat_tower_middle", $$6, true));
            for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; ++$$8) {
                $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(0, 8, 0), "fat_tower_middle", $$6, true));
                for (apy<cvz, gu> $$9 : f) {
                    if (!$$5.h()) continue;
                    a $$10 = dtp.a($$4, dtp.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                    dtp.a($$0, e, $$1 + 1, $$10, null, $$4, $$5);
                }
            }
            $$7 = dtp.a($$4, dtp.a($$0, $$7, new gu(-2, 8, -2), "fat_tower_top", $$6, true));
            return true;
        }
    };

    static a a(dvu $$0, a $$1, gu $$2, String $$3, cvz $$4, boolean $$5) {
        a $$6 = new a($$0, $$3, $$1.d(), $$4, $$5);
        gu $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gu.b);
        $$6.a($$7.u(), $$7.v(), $$7.w());
        return $$6;
    }

    public static void a(dvu $$0, gu $$1, cvz $$2, List<dse> $$3, apf $$4) {
        g.a();
        b.a();
        e.a();
        d.a();
        a $$5 = dtp.a($$3, new a($$0, "base_floor", $$1, $$2, true));
        $$5 = dtp.a($$3, dtp.a($$0, $$5, new gu(-1, 0, -1), "second_floor_1", $$2, false));
        $$5 = dtp.a($$3, dtp.a($$0, $$5, new gu(-1, 4, -1), "third_floor_1", $$2, false));
        $$5 = dtp.a($$3, dtp.a($$0, $$5, new gu(-1, 8, -1), "third_roof", $$2, true));
        dtp.a($$0, d, 1, $$5, null, $$3, $$4);
    }

    static a a(List<dse> $$0, a $$1) {
        $$0.add($$1);
        return $$1;
    }

    static boolean a(dvu $$0, b $$1, int $$2, a $$3, gu $$4, List<dse> $$5, apf $$6) {
        if ($$2 > 8) {
            return false;
        }
        ArrayList $$7 = Lists.newArrayList();
        if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();
            for (dse $$10 : $$7) {
                $$10.a($$9);
                dse $$11 = dse.a($$5, $$10.f());
                if ($$11 == null || $$11.g() == $$3.g()) continue;
                $$8 = true;
                break;
            }
            if (!$$8) {
                $$5.addAll($$7);
                return true;
            }
        }
        return false;
    }

    public static class a
    extends dsk {
        public a(dvu $$0, String $$1, gu $$2, cvz $$3, boolean $$4) {
            super(dsr.Y, 0, $$0, dtp$a.a($$1), $$1, dtp$a.a($$4, $$3), $$2);
        }

        public a(dvu $$0, qr $$12) {
            super(dsr.Y, $$12, $$0, $$1 -> dtp$a.a($$12.q("OW"), cvz.valueOf($$12.l("Rot"))));
        }

        private static dvp a(boolean $$0, cvz $$1) {
            duv $$2 = $$0 ? duv.b : duv.d;
            return new dvp().a(true).a($$2).a($$1);
        }

        @Override
        protected acq b() {
            return dtp$a.a(this.a);
        }

        private static acq a(String $$0) {
            return new acq("end_city/" + $$0);
        }

        @Override
        protected void a(dsq $$0, qr $$1) {
            super.a($$0, $$1);
            $$1.a("Rot", this.c.d().name());
            $$1.a("OW", this.c.i().get(0) == duv.b);
        }

        @Override
        protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
            if ($$0.startsWith("Chest")) {
                gu $$5 = $$1.d();
                if ($$4.b($$5)) {
                    daq.a($$2, $$3, $$5, dzg.c);
                }
            } else if ($$4.b($$1) && cmm.k($$1)) {
                if ($$0.startsWith("Sentry")) {
                    bwi $$6 = bfn.aG.a($$2.C());
                    if ($$6 != null) {
                        $$6.e((double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5);
                        $$2.b($$6);
                    }
                } else if ($$0.startsWith("Elytra")) {
                    bva $$7 = new bva($$2.C(), $$1, this.c.d().a(ha.d));
                    $$7.a(new cfz(cgc.nh), false);
                    $$2.b($$7);
                }
            }
        }
    }

    static interface b {
        public void a();

        public boolean a(dvu var1, int var2, a var3, gu var4, List<dse> var5, apf var6);
    }
}

