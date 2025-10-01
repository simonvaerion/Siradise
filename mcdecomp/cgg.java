/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.LinkedHashMultiset
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cgg
extends cee {
    public static final int a = 128;
    public static final int b = 128;
    private static final int e = -12173266;
    private static final String f = "map";
    public static final String c = "map_scale_direction";
    public static final String d = "map_to_lock";

    public cgg(cfu.a $$0) {
        super($$0);
    }

    public static cfz a(cmm $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
        cfz $$6 = new cfz(cgc.rf);
        cgg.a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ac());
        return $$6;
    }

    @Nullable
    public static dyo a(@Nullable Integer $$0, cmm $$1) {
        return $$0 == null ? null : $$1.a(cgg.a($$0));
    }

    @Nullable
    public static dyo a(cfz $$0, cmm $$1) {
        Integer $$2 = cgg.d($$0);
        return cgg.a($$2, $$1);
    }

    @Nullable
    public static Integer d(cfz $$0) {
        qr $$1 = $$0.v();
        return $$1 != null && $$1.b(f, 99) ? Integer.valueOf($$1.h(f)) : null;
    }

    private static int a(cmm $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, acp<cmm> $$6) {
        dyo $$7 = dyo.a($$1, $$2, (byte)$$3, $$4, $$5, $$6);
        int $$8 = $$0.t();
        $$0.a(cgg.a($$8), $$7);
        return $$8;
    }

    private static void a(cfz $$0, int $$1) {
        $$0.w().a(f, $$1);
    }

    private static void a(cfz $$0, cmm $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, acp<cmm> $$7) {
        int $$8 = cgg.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        cgg.a($$0, $$8);
    }

    public static String a(int $$0) {
        return "map_" + $$0;
    }

    public void a(cmm $$0, bfj $$1, dyo $$2) {
        if ($$0.ac() != $$2.e || !($$1 instanceof byo)) {
            return;
        }
        int $$3 = 1 << $$2.f;
        int $$4 = $$2.c;
        int $$5 = $$2.d;
        int $$6 = apa.a($$1.dn() - (double)$$4) / $$3 + 64;
        int $$7 = apa.a($$1.dt() - (double)$$5) / $$3 + 64;
        int $$8 = 128 / $$3;
        if ($$0.x_().h()) {
            $$8 /= 2;
        }
        dyo.a $$9 = $$2.a((byo)$$1);
        ++$$9.b;
        gu.a $$10 = new gu.a();
        gu.a $$11 = new gu.a();
        boolean $$12 = false;
        for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; ++$$13) {
            if (($$13 & 0xF) != ($$9.b & 0xF) && !$$12) continue;
            $$12 = false;
            double $$14 = 0.0;
            for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; ++$$15) {
                dxi.a $$40;
                if ($$13 < 0 || $$15 < -1 || $$13 >= 128 || $$15 >= 128) continue;
                int $$16 = apa.h($$13 - $$6) + apa.h($$15 - $$7);
                boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                LinkedHashMultiset $$20 = LinkedHashMultiset.create();
                dei $$21 = $$0.d(hx.a($$18), hx.a($$19));
                if ($$21.C()) continue;
                int $$22 = 0;
                double $$23 = 0.0;
                if ($$0.x_().h()) {
                    int $$24 = $$18 + $$19 * 231871;
                    if ((($$24 = $$24 * $$24 * 31287121 + $$24 * 11) >> 20 & 1) == 0) {
                        $$20.add((Object)cpo.j.n().d($$0, gu.b), 10);
                    } else {
                        $$20.add((Object)cpo.b.n().d($$0, gu.b), 100);
                    }
                    $$23 = 100.0;
                } else {
                    for (int $$25 = 0; $$25 < $$3; ++$$25) {
                        for (int $$26 = 0; $$26 < $$3; ++$$26) {
                            dcb $$31;
                            $$10.d($$18 + $$25, 0, $$19 + $$26);
                            int $$27 = $$21.a(dhk.a.b, $$10.u(), $$10.w()) + 1;
                            if ($$27 > $$0.C_() + 1) {
                                dcb $$28;
                                do {
                                    $$10.q(--$$27);
                                } while (($$28 = $$21.a_($$10)).d($$0, $$10) == dxi.a && $$27 > $$0.C_());
                                if ($$27 > $$0.C_() && !$$28.u().c()) {
                                    dcb $$30;
                                    int $$29 = $$27 - 1;
                                    $$11.g($$10);
                                    do {
                                        $$11.q($$29--);
                                        $$30 = $$21.a_($$11);
                                        ++$$22;
                                    } while ($$29 > $$0.C_() && !$$30.u().c());
                                    $$28 = this.a($$0, $$28, $$10);
                                }
                            } else {
                                $$31 = cpo.F.n();
                            }
                            $$2.a($$0, $$10.u(), $$10.w());
                            $$23 += (double)$$27 / (double)($$3 * $$3);
                            $$20.add((Object)$$31.d($$0, $$10));
                        }
                    }
                }
                $$22 /= $$3 * $$3;
                dxi $$32 = (dxi)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)$$20), (Object)dxi.a);
                if ($$32 == dxi.m) {
                    double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                    if ($$33 < 0.5) {
                        dxi.a $$34 = dxi.a.c;
                    } else if ($$33 > 0.9) {
                        dxi.a $$35 = dxi.a.a;
                    } else {
                        dxi.a $$36 = dxi.a.b;
                    }
                } else {
                    double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                    if ($$37 > 0.6) {
                        dxi.a $$38 = dxi.a.c;
                    } else if ($$37 < -0.6) {
                        dxi.a $$39 = dxi.a.a;
                    } else {
                        $$40 = dxi.a.b;
                    }
                }
                $$14 = $$23;
                if ($$15 < 0 || $$16 >= $$8 * $$8 || $$17 && ($$13 + $$15 & 1) == 0) continue;
                $$12 |= $$2.a($$13, $$15, $$32.b($$40));
            }
        }
    }

    private dcb a(cmm $$0, dcb $$1, gu $$2) {
        dxe $$3 = $$1.u();
        if (!$$3.c() && !$$1.d($$0, $$2, ha.b)) {
            return $$3.g();
        }
        return $$1;
    }

    private static boolean a(boolean[] $$0, int $$1, int $$2) {
        return $$0[$$2 * 128 + $$1];
    }

    public static void a(aif $$0, cfz $$1) {
        dyo $$2 = cgg.a($$1, (cmm)$$0);
        if ($$2 == null) {
            return;
        }
        if ($$0.ac() != $$2.e) {
            return;
        }
        int $$3 = 1 << $$2.f;
        int $$4 = $$2.c;
        int $$5 = $$2.d;
        boolean[] $$6 = new boolean[16384];
        int $$7 = $$4 / $$3 - 64;
        int $$8 = $$5 / $$3 - 64;
        gu.a $$9 = new gu.a();
        for (int $$10 = 0; $$10 < 128; ++$$10) {
            for (int $$11 = 0; $$11 < 128; ++$$11) {
                he<cnk> $$12 = $$0.s($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                $$6[$$10 * 128 + $$11] = $$12.a(amv.aa);
            }
        }
        for (int $$13 = 1; $$13 < 127; ++$$13) {
            for (int $$14 = 1; $$14 < 127; ++$$14) {
                int $$15 = 0;
                for (int $$16 = -1; $$16 < 2; ++$$16) {
                    for (int $$17 = -1; $$17 < 2; ++$$17) {
                        if ($$16 == 0 && $$17 == 0 || !cgg.a($$6, $$13 + $$16, $$14 + $$17)) continue;
                        ++$$15;
                    }
                }
                dxi.a $$18 = dxi.a.d;
                dxi $$19 = dxi.a;
                if (cgg.a($$6, $$13, $$14)) {
                    $$19 = dxi.p;
                    if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(apa.a((float)$$14 + 0.0f) * 7.0f)) / 8 % 5) {
                            case 0: 
                            case 4: {
                                $$18 = dxi.a.a;
                                break;
                            }
                            case 1: 
                            case 3: {
                                $$18 = dxi.a.b;
                                break;
                            }
                            case 2: {
                                $$18 = dxi.a.c;
                            }
                        }
                    } else if ($$15 > 7) {
                        $$19 = dxi.a;
                    } else if ($$15 > 5) {
                        $$18 = dxi.a.b;
                    } else if ($$15 > 3) {
                        $$18 = dxi.a.a;
                    } else if ($$15 > 1) {
                        $$18 = dxi.a.a;
                    }
                } else if ($$15 > 0) {
                    $$19 = dxi.A;
                    $$18 = $$15 > 3 ? dxi.a.b : dxi.a.d;
                }
                if ($$19 == dxi.a) continue;
                $$2.b($$13, $$14, $$19.b($$18));
            }
        }
    }

    @Override
    public void a(cfz $$0, cmm $$1, bfj $$2, int $$3, boolean $$4) {
        if ($$1.B) {
            return;
        }
        dyo $$5 = cgg.a($$0, $$1);
        if ($$5 == null) {
            return;
        }
        if ($$2 instanceof byo) {
            byo $$6 = (byo)$$2;
            $$5.a($$6, $$0);
        }
        if (!$$5.h && ($$4 || $$2 instanceof byo && ((byo)$$2).eP() == $$0)) {
            this.a($$1, $$2, $$5);
        }
    }

    @Override
    @Nullable
    public uo<?> a(cfz $$0, cmm $$1, byo $$2) {
        Integer $$3 = cgg.d($$0);
        dyo $$4 = cgg.a($$3, $$1);
        if ($$4 != null) {
            return $$4.a((int)$$3, $$2);
        }
        return null;
    }

    @Override
    public void b(cfz $$0, cmm $$1, byo $$2) {
        qr $$3 = $$0.v();
        if ($$3 != null && $$3.b(c, 99)) {
            cgg.a($$0, $$1, $$3.h(c));
            $$3.r(c);
        } else if ($$3 != null && $$3.b(d, 1) && $$3.q(d)) {
            cgg.a($$1, $$0);
            $$3.r(d);
        }
    }

    private static void a(cfz $$0, cmm $$1, int $$2) {
        dyo $$3 = cgg.a($$0, $$1);
        if ($$3 != null) {
            int $$4 = $$1.t();
            $$1.a(cgg.a($$4), $$3.a($$2));
            cgg.a($$0, $$4);
        }
    }

    public static void a(cmm $$0, cfz $$1) {
        dyo $$2 = cgg.a($$1, $$0);
        if ($$2 != null) {
            int $$3 = $$0.t();
            String $$4 = cgg.a($$3);
            dyo $$5 = $$2.a();
            $$0.a($$4, $$5);
            cgg.a($$1, $$3);
        }
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        byte $$10;
        boolean $$9;
        Integer $$4 = cgg.d($$0);
        dyo $$5 = $$1 == null ? null : cgg.a($$4, $$1);
        qr $$6 = $$0.v();
        if ($$6 != null) {
            boolean $$7 = $$6.q(d);
            byte $$8 = $$6.f(c);
        } else {
            $$9 = false;
            $$10 = 0;
        }
        if ($$5 != null && ($$5.h || $$9)) {
            $$2.add(sw.a("filled_map.locked", $$4).a(n.h));
        }
        if ($$3.a()) {
            if ($$5 != null) {
                if (!$$9 && $$10 == 0) {
                    $$2.add(sw.a("filled_map.id", $$4).a(n.h));
                }
                int $$11 = Math.min($$5.f + $$10, 4);
                $$2.add(sw.a("filled_map.scale", 1 << $$11).a(n.h));
                $$2.add(sw.a("filled_map.level", $$11, 4).a(n.h));
            } else {
                $$2.add(sw.c("filled_map.unknown").a(n.h));
            }
        }
    }

    public static int k(cfz $$0) {
        qr $$1 = $$0.b("display");
        if ($$1 != null && $$1.b("MapColor", 99)) {
            int $$2 = $$1.h("MapColor");
            return 0xFF000000 | $$2 & 0xFFFFFF;
        }
        return -12173266;
    }

    @Override
    public bdx a(cij $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        if ($$1.a(amw.G)) {
            dyo $$2;
            if (!$$0.q().B && ($$2 = cgg.a($$0.n(), $$0.q())) != null && !$$2.a($$0.q(), $$0.a())) {
                return bdx.e;
            }
            return bdx.a($$0.q().B);
        }
        return super.a($$0);
    }
}

