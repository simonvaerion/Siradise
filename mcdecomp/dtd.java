/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dtd {
    static final Logger a = LogUtils.getLogger();

    public static Optional<dsa.b> a(dsa.a $$02, he<dtj> $$1, Optional<acq> $$2, int $$3, gu $$4, boolean $$5, Optional<dhk.a> $$6, int $$7) {
        int $$28;
        gu $$20;
        hs $$8 = $$02.a();
        ddy $$9 = $$02.b();
        dvu $$10 = $$02.e();
        cmo $$11 = $$02.i();
        dij $$12 = $$02.f();
        hr<dtj> $$13 = $$8.d(jc.aC);
        cvz $$142 = cvz.a($$12);
        dtj $$15 = $$1.a();
        dth $$16 = $$15.a($$12);
        if ($$16 == dta.b) {
            return Optional.empty();
        }
        if ($$2.isPresent()) {
            acq $$17 = $$2.get();
            Optional<gu> $$18 = dtd.a($$16, $$17, $$4, $$142, $$10, $$12);
            if ($$18.isEmpty()) {
                a.error("No starting jigsaw {} found in start pool {}", (Object)$$17, (Object)$$1.e().map($$0 -> $$0.a().toString()).orElse("<unregistered>"));
                return Optional.empty();
            }
            gu $$19 = $$18.get();
        } else {
            $$20 = $$4;
        }
        gu $$21 = $$20.b($$4);
        gu $$22 = $$4.b($$21);
        drw $$23 = new drw($$10, $$16, $$22, $$16.f(), $$142, $$16.a($$10, $$22, $$142));
        drs $$24 = $$23.f();
        int $$25 = ($$24.j() + $$24.g()) / 2;
        int $$26 = ($$24.l() + $$24.i()) / 2;
        if ($$6.isPresent()) {
            int $$27 = $$4.v() + $$9.b($$25, $$26, $$6.get(), $$11, $$02.d());
        } else {
            $$28 = $$22.v();
        }
        int $$29 = $$24.h() + $$23.d();
        $$23.a(0, $$28 - $$29, 0);
        int $$30 = $$28 + $$21.v();
        return Optional.of(new dsa.b(new gu($$25, $$30, $$26), $$14 -> {
            ArrayList $$15 = Lists.newArrayList();
            $$15.add($$23);
            if ($$3 <= 0) {
                return;
            }
            eed $$16 = new eed($$25 - $$7, $$30 - $$7, $$26 - $$7, $$25 + $$7 + 1, $$30 + $$7 + 1, $$26 + $$7 + 1);
            efb $$17 = eey.a(eey.a($$16), eey.a(eed.a($$24)), eem.e);
            dtd.a($$02.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15, $$17);
            $$15.forEach($$14::a);
        }));
    }

    private static Optional<gu> a(dth $$0, acq $$1, gu $$2, cvz $$3, dvu $$4, dij $$5) {
        List<dvt.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
        Optional<gu> $$7 = Optional.empty();
        for (dvt.c $$8 : $$6) {
            acq $$9 = acq.a($$8.c().l("name"));
            if (!$$1.equals($$9)) continue;
            $$7 = Optional.of($$8.a());
            break;
        }
        return $$7;
    }

    private static void a(dhy $$0, int $$1, boolean $$2, ddy $$3, dvu $$4, cmo $$5, apf $$6, hr<dtj> $$7, drw $$8, List<drw> $$9, efb $$10) {
        b $$11 = new b($$7, $$1, $$3, $$4, $$9, $$6);
        $$11.g.addLast(new a($$8, (MutableObject<efb>)new MutableObject((Object)$$10), 0));
        while (!$$11.g.isEmpty()) {
            a $$12 = $$11.g.removeFirst();
            $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
        }
    }

    public static boolean a(aif $$02, he<dtj> $$1, acq $$2, int $$3, gu $$4, boolean $$5) {
        ddy $$6 = $$02.k().g();
        dvu $$7 = $$02.p();
        cne $$8 = $$02.a();
        apf $$9 = $$02.y_();
        dsa.a $$10 = new dsa.a($$02.B_(), $$6, $$6.c(), $$02.k().i(), $$7, $$02.A(), new clt($$4), $$02, $$0 -> true);
        Optional<dsa.b> $$11 = dtd.a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
        if ($$11.isPresent()) {
            dss $$12 = $$11.get().a();
            for (dse $$13 : $$12.a().c()) {
                if (!($$13 instanceof drw)) continue;
                drw $$14 = (drw)$$13;
                $$14.a((cng)$$02, $$8, $$6, $$9, drs.a(), $$4, $$5);
            }
            return true;
        }
        return false;
    }

    static final class b {
        private final hr<dtj> a;
        private final int b;
        private final ddy c;
        private final dvu d;
        private final List<? super drw> e;
        private final apf f;
        final Deque<a> g = Queues.newArrayDeque();

        b(hr<dtj> $$0, int $$1, ddy $$2, dvu $$3, List<? super drw> $$4, apf $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        void a(drw $$02, MutableObject<efb> $$12, int $$2, boolean $$3, cmo $$4, dhy $$5) {
            dth $$6 = $$02.b();
            gu $$7 = $$02.c();
            cvz $$8 = $$02.a();
            dtj.a $$9 = $$6.e();
            boolean $$10 = $$9 == dtj.a.b;
            MutableObject $$11 = new MutableObject();
            drs $$122 = $$02.f();
            int $$13 = $$122.h();
            block0: for (dvt.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
                dth $$28;
                MutableObject<efb> $$26;
                ha $$15 = ctm.h($$14.b());
                gu $$16 = $$14.a();
                gu $$17 = $$16.a($$15);
                int $$18 = $$16.v() - $$13;
                int $$19 = -1;
                acp<dtj> $$20 = dtd$b.a($$14);
                Optional<he.c<dtj>> $$21 = this.a.b($$20);
                if ($$21.isEmpty()) {
                    a.warn("Empty or non-existent pool: {}", (Object)$$20.a());
                    continue;
                }
                he $$22 = $$21.get();
                if (((dtj)$$22.a()).b() == 0 && !$$22.a(nt.a)) {
                    a.warn("Empty or non-existent pool: {}", (Object)$$20.a());
                    continue;
                }
                he<dtj> $$23 = ((dtj)$$22.a()).a();
                if ($$23.a().b() == 0 && !$$23.a(nt.a)) {
                    a.warn("Empty or non-existent fallback pool: {}", (Object)$$23.e().map($$0 -> $$0.a().toString()).orElse("<unregistered>"));
                    continue;
                }
                boolean $$24 = $$122.b($$17);
                if ($$24) {
                    MutableObject $$25 = $$11;
                    if ($$11.getValue() == null) {
                        $$11.setValue((Object)eey.a(eed.a($$122)));
                    }
                } else {
                    $$26 = $$12;
                }
                ArrayList $$27 = Lists.newArrayList();
                if ($$2 != this.b) {
                    $$27.addAll(((dtj)$$22.a()).b(this.f));
                }
                $$27.addAll($$23.a().b(this.f));
                Iterator iterator = $$27.iterator();
                while (iterator.hasNext() && ($$28 = (dth)iterator.next()) != dta.b) {
                    for (cvz $$29 : cvz.b(this.f)) {
                        int $$33;
                        List<dvt.c> $$30 = $$28.a(this.d, gu.b, $$29, this.f);
                        drs $$31 = $$28.a(this.d, gu.b, $$29);
                        if (!$$3 || $$31.d() > 16) {
                            boolean $$32 = false;
                        } else {
                            $$33 = $$30.stream().mapToInt($$1 -> {
                                if (!$$31.b($$1.a().a(ctm.h($$1.b())))) {
                                    return 0;
                                }
                                acp<dtj> $$2 = dtd$b.a($$1);
                                Optional<he.c<dtj>> $$3 = this.a.b($$2);
                                Optional<he> $$4 = $$3.map($$0 -> ((dtj)$$0.a()).a());
                                int $$5 = $$3.map($$0 -> ((dtj)$$0.a()).a(this.d)).orElse(0);
                                int $$6 = $$4.map($$0 -> ((dtj)$$0.a()).a(this.d)).orElse(0);
                                return Math.max($$5, $$6);
                            }).max().orElse(0);
                        }
                        for (dvt.c $$34 : $$30) {
                            int $$55;
                            int $$51;
                            int $$44;
                            if (!ctm.a($$14, $$34)) continue;
                            gu $$35 = $$34.a();
                            gu $$36 = $$17.b($$35);
                            drs $$37 = $$28.a(this.d, $$36, $$29);
                            int $$38 = $$37.h();
                            dtj.a $$39 = $$28.e();
                            boolean $$40 = $$39 == dtj.a.b;
                            int $$41 = $$35.v();
                            int $$42 = $$18 - $$41 + ctm.h($$14.b()).k();
                            if ($$10 && $$40) {
                                int $$43 = $$13 + $$42;
                            } else {
                                if ($$19 == -1) {
                                    $$19 = this.c.b($$16.u(), $$16.w(), dhk.a.a, $$4, $$5);
                                }
                                $$44 = $$19 - $$41;
                            }
                            int $$45 = $$44 - $$38;
                            drs $$46 = $$37.b(0, $$45, 0);
                            gu $$47 = $$36.b(0, $$45, 0);
                            if ($$33 > 0) {
                                int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                $$46.a(new gu($$46.g(), $$46.h() + $$48, $$46.i()));
                            }
                            if (eey.c((efb)$$26.getValue(), eey.a(eed.a($$46).h(0.25)), eem.c)) continue;
                            $$26.setValue((Object)eey.b((efb)$$26.getValue(), eey.a(eed.a($$46)), eem.e));
                            int $$49 = $$02.d();
                            if ($$40) {
                                int $$50 = $$49 - $$42;
                            } else {
                                $$51 = $$28.f();
                            }
                            drw $$52 = new drw(this.d, $$28, $$47, $$51, $$29, $$46);
                            if ($$10) {
                                int $$53 = $$13 + $$18;
                            } else if ($$40) {
                                int $$54 = $$44 + $$41;
                            } else {
                                if ($$19 == -1) {
                                    $$19 = this.c.b($$16.u(), $$16.w(), dhk.a.a, $$4, $$5);
                                }
                                $$55 = $$19 + $$42 / 2;
                            }
                            $$02.a(new dtc($$17.u(), (int)($$55 - $$18 + $$49), $$17.w(), $$42, $$39));
                            $$52.a(new dtc($$16.u(), $$55 - $$41 + $$51, $$16.w(), -$$42, $$9));
                            this.e.add($$52);
                            if ($$2 + 1 > this.b) continue block0;
                            this.g.addLast(new a($$52, $$26, $$2 + 1));
                            continue block0;
                        }
                    }
                }
            }
        }

        private static acp<dtj> a(dvt.c $$0) {
            return acp.a(jc.aC, new acq($$0.c().l("pool")));
        }
    }

    static final class a {
        final drw a;
        final MutableObject<efb> b;
        final int c;

        a(drw $$0, MutableObject<efb> $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

