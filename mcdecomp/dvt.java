/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dvt {
    public static final String a = "palette";
    public static final String b = "palettes";
    public static final String c = "entities";
    public static final String d = "blocks";
    public static final String e = "pos";
    public static final String f = "state";
    public static final String g = "nbt";
    public static final String h = "pos";
    public static final String i = "blockPos";
    public static final String j = "nbt";
    public static final String k = "size";
    private final List<a> l = Lists.newArrayList();
    private final List<d> m = Lists.newArrayList();
    private hz n = hz.g;
    private String o = "?";

    public hz a() {
        return this.n;
    }

    public void a(String $$0) {
        this.o = $$0;
    }

    public String b() {
        return this.o;
    }

    public void a(cmm $$0, gu $$1, hz $$2, boolean $$3, @Nullable cpn $$4) {
        if ($$2.u() < 1 || $$2.v() < 1 || $$2.w() < 1) {
            return;
        }
        gu $$5 = $$1.a($$2).b(-1, -1, -1);
        ArrayList $$6 = Lists.newArrayList();
        ArrayList $$7 = Lists.newArrayList();
        ArrayList $$8 = Lists.newArrayList();
        gu $$9 = new gu(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
        gu $$10 = new gu(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
        this.n = $$2;
        for (gu $$11 : gu.a($$9, $$10)) {
            c $$16;
            gu $$12 = $$11.b($$9);
            dcb $$13 = $$0.a_($$11);
            if ($$4 != null && $$13.a($$4)) continue;
            czn $$14 = $$0.c_($$11);
            if ($$14 != null) {
                c $$15 = new c($$12, $$13, $$14.n());
            } else {
                $$16 = new c($$12, $$13, null);
            }
            dvt.a($$16, $$6, $$7, $$8);
        }
        List<c> $$17 = dvt.a($$6, $$7, $$8);
        this.l.clear();
        this.l.add(new a($$17));
        if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
        } else {
            this.m.clear();
        }
    }

    private static void a(c $$0, List<c> $$1, List<c> $$2, List<c> $$3) {
        if ($$0.c != null) {
            $$2.add($$0);
        } else if (!$$0.b.b().o() && $$0.b.r(cmb.a, gu.b)) {
            $$1.add($$0);
        } else {
            $$3.add($$0);
        }
    }

    private static List<c> a(List<c> $$02, List<c> $$1, List<c> $$2) {
        Comparator<c> $$3 = Comparator.comparingInt($$0 -> $$0.a.v()).thenComparingInt($$0 -> $$0.a.u()).thenComparingInt($$0 -> $$0.a.w());
        $$02.sort($$3);
        $$2.sort($$3);
        $$1.sort($$3);
        ArrayList $$4 = Lists.newArrayList();
        $$4.addAll($$02);
        $$4.addAll($$2);
        $$4.addAll($$1);
        return $$4;
    }

    private void a(cmm $$02, gu $$1, gu $$2) {
        List<bfj> $$3 = $$02.a(bfj.class, new eed($$1, $$2), (? super T $$0) -> !($$0 instanceof byo));
        this.m.clear();
        for (bfj $$4 : $$3) {
            gu $$8;
            eei $$5 = new eei($$4.dn() - (double)$$1.u(), $$4.dp() - (double)$$1.v(), $$4.dt() - (double)$$1.w());
            qr $$6 = new qr();
            $$4.e($$6);
            if ($$4 instanceof bvc) {
                gu $$7 = ((bvc)$$4).y().b($$1);
            } else {
                $$8 = gu.a($$5);
            }
            this.m.add(new d($$5, $$8, $$6.h()));
        }
    }

    public List<c> a(gu $$0, dvp $$1, cpn $$2) {
        return this.a($$0, $$1, $$2, true);
    }

    public ObjectArrayList<c> a(gu $$0, dvp $$1, cpn $$2, boolean $$3) {
        ObjectArrayList $$4 = new ObjectArrayList();
        drs $$5 = $$1.g();
        if (this.l.isEmpty()) {
            return $$4;
        }
        for (c $$6 : $$1.a(this.l, $$0).a($$2)) {
            gu $$7;
            gu gu2 = $$7 = $$3 ? dvt.a($$1, $$6.a).a($$0) : $$6.a;
            if ($$5 != null && !$$5.b($$7)) continue;
            $$4.add((Object)new c($$7, $$6.b.a($$1.d()), $$6.c));
        }
        return $$4;
    }

    public gu a(dvp $$0, gu $$1, dvp $$2, gu $$3) {
        gu $$4 = dvt.a($$0, $$1);
        gu $$5 = dvt.a($$2, $$3);
        return $$4.b($$5);
    }

    public static gu a(dvp $$0, gu $$1) {
        return dvt.a($$1, $$0.c(), $$0.d(), $$0.e());
    }

    public boolean a(cnb $$0, gu $$1, gu $$2, dvp $$3, apf $$4, int $$5) {
        if (this.l.isEmpty()) {
            return false;
        }
        List<c> $$6 = $$3.a(this.l, $$1).a();
        if ($$6.isEmpty() && ($$3.f() || this.m.isEmpty()) || this.n.u() < 1 || this.n.v() < 1 || this.n.w() < 1) {
            return false;
        }
        drs $$7 = $$3.g();
        ArrayList $$8 = Lists.newArrayListWithCapacity((int)($$3.j() ? $$6.size() : 0));
        ArrayList $$9 = Lists.newArrayListWithCapacity((int)($$3.j() ? $$6.size() : 0));
        ArrayList $$10 = Lists.newArrayListWithCapacity((int)$$6.size());
        int $$11 = Integer.MAX_VALUE;
        int $$12 = Integer.MAX_VALUE;
        int $$13 = Integer.MAX_VALUE;
        int $$14 = Integer.MIN_VALUE;
        int $$15 = Integer.MIN_VALUE;
        int $$16 = Integer.MIN_VALUE;
        List<c> $$17 = dvt.a($$0, $$1, $$2, $$3, $$6);
        for (c $$18 : $$17) {
            czn $$23;
            gu $$19 = $$18.a;
            if ($$7 != null && !$$7.b($$19)) continue;
            dxe $$20 = $$3.j() ? $$0.b_($$19) : null;
            dcb $$21 = $$18.b.a($$3.c()).a($$3.d());
            if ($$18.c != null) {
                czn $$22 = $$0.c_($$19);
                bdo.a_($$22);
                $$0.a($$19, cpo.hW.n(), 20);
            }
            if (!$$0.a($$19, $$21, $$5)) continue;
            $$11 = Math.min($$11, $$19.u());
            $$12 = Math.min($$12, $$19.v());
            $$13 = Math.min($$13, $$19.w());
            $$14 = Math.max($$14, $$19.u());
            $$15 = Math.max($$15, $$19.v());
            $$16 = Math.max($$16, $$19.w());
            $$10.add(Pair.of((Object)$$19, (Object)$$18.c));
            if ($$18.c != null && ($$23 = $$0.c_($$19)) != null) {
                if ($$23 instanceof daq) {
                    $$18.c.a("LootTableSeed", $$4.g());
                }
                $$23.a($$18.c);
            }
            if ($$20 == null) continue;
            if ($$21.u().b()) {
                $$9.add($$19);
                continue;
            }
            if (!($$21.b() instanceof cub)) continue;
            ((cub)((Object)$$21.b())).a($$0, $$19, $$21, $$20);
            if ($$20.b()) continue;
            $$8.add($$19);
        }
        boolean $$24 = true;
        ha[] $$25 = new ha[]{ha.b, ha.c, ha.f, ha.d, ha.e};
        while ($$24 && !$$8.isEmpty()) {
            $$24 = false;
            Iterator $$26 = $$8.iterator();
            while ($$26.hasNext()) {
                dcb $$32;
                Object $$33;
                gu $$27 = (gu)$$26.next();
                dxe $$28 = $$0.b_($$27);
                for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); ++$$29) {
                    gu $$30 = $$27.a($$25[$$29]);
                    dxe $$31 = $$0.b_($$30);
                    if (!$$31.b() || $$9.contains($$30)) continue;
                    $$28 = $$31;
                }
                if (!$$28.b() || !(($$33 = ($$32 = $$0.a_($$27)).b()) instanceof cub)) continue;
                ((cub)$$33).a($$0, $$27, $$32, $$28);
                $$24 = true;
                $$26.remove();
            }
        }
        if ($$11 <= $$14) {
            if (!$$3.h()) {
                eel $$34 = new eel($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                int $$35 = $$11;
                int $$36 = $$12;
                int $$37 = $$13;
                for (Pair $$38 : $$10) {
                    gu $$39 = (gu)$$38.getFirst();
                    ((eer)$$34).c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                }
                dvt.a($$0, $$5, $$34, $$35, $$36, $$37);
            }
            for (Pair $$40 : $$10) {
                czn $$44;
                gu $$41 = (gu)$$40.getFirst();
                if (!$$3.h()) {
                    dcb $$43;
                    dcb $$42 = $$0.a_($$41);
                    if ($$42 != ($$43 = cpn.b($$42, $$0, $$41))) {
                        $$0.a($$41, $$43, $$5 & 0xFFFFFFFE | 0x10);
                    }
                    $$0.b($$41, $$43.b());
                }
                if ($$40.getSecond() == null || ($$44 = $$0.c_($$41)) == null) continue;
                $$44.e();
            }
        }
        if (!$$3.f()) {
            this.a($$0, $$1, $$3.c(), $$3.d(), $$3.e(), $$7, $$3.k());
        }
        return true;
    }

    public static void a(cmn $$0, int $$1, eer $$2, int $$3, int $$4, int $$52) {
        $$2.a((ha $$5, int $$6, int $$7, int $$8) -> {
            dcb $$14;
            dcb $$12;
            dcb $$13;
            gu $$9 = new gu($$3 + $$6, $$4 + $$7, $$52 + $$8);
            gu $$10 = $$9.a($$5);
            dcb $$11 = $$0.a_($$9);
            if ($$11 != ($$13 = $$11.a($$5, $$12 = $$0.a_($$10), $$0, $$9, $$10))) {
                $$0.a($$9, $$13, $$1 & 0xFFFFFFFE);
            }
            if ($$12 != ($$14 = $$12.a($$5.g(), $$13, $$0, $$10, $$9))) {
                $$0.a($$10, $$14, $$1 & 0xFFFFFFFE);
            }
        });
    }

    public static List<c> a(cnb $$0, gu $$1, gu $$2, dvp $$3, List<c> $$4) {
        ArrayList<c> $$5 = new ArrayList<c>();
        List<c> $$6 = new ArrayList<c>();
        for (c $$7 : $$4) {
            gu $$8 = dvt.a($$3, $$7.a).a($$1);
            c $$9 = new c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
            Iterator<dvq> $$10 = $$3.i().iterator();
            while ($$9 != null && $$10.hasNext()) {
                $$9 = $$10.next().a((cmp)$$0, $$1, $$2, $$7, $$9, $$3);
            }
            if ($$9 == null) continue;
            $$6.add($$9);
            $$5.add($$7);
        }
        for (dvq $$11 : $$3.i()) {
            $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
        }
        return $$6;
    }

    private void a(cnb $$0, gu $$1, cui $$2, cvz $$3, gu $$4, @Nullable drs $$5, boolean $$62) {
        for (d $$7 : this.m) {
            gu $$8 = dvt.a($$7.b, $$2, $$3, $$4).a($$1);
            if ($$5 != null && !$$5.b($$8)) continue;
            qr $$9 = $$7.c.h();
            eei $$10 = dvt.a($$7.a, $$2, $$3, $$4);
            eei $$11 = $$10.b($$1.u(), $$1.v(), $$1.w());
            qx $$12 = new qx();
            $$12.add(qs.a($$11.c));
            $$12.add(qs.a($$11.d));
            $$12.add(qs.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            dvt.a($$0, $$9).ifPresent($$6 -> {
                float $$7 = $$6.a($$3);
                $$6.b($$2.c, $$2.d, $$2.e, $$7 += $$6.a($$2) - $$6.dy(), $$6.dA());
                if ($$62 && $$6 instanceof bgb) {
                    ((bgb)$$6).a($$0, $$0.d_(gu.a($$11)), bgd.d, null, $$9);
                }
                $$0.a_((bfj)$$6);
            });
        }
    }

    private static Optional<bfj> a(cnb $$0, qr $$1) {
        try {
            return bfn.a($$1, (cmm)$$0.C());
        }
        catch (Exception $$2) {
            return Optional.empty();
        }
    }

    public hz a(cvz $$0) {
        switch ($$0) {
            case d: 
            case b: {
                return new hz(this.n.w(), this.n.v(), this.n.u());
            }
        }
        return this.n;
    }

    public static gu a(gu $$0, cui $$1, cvz $$2, gu $$3) {
        int $$4 = $$0.u();
        int $$5 = $$0.v();
        int $$6 = $$0.w();
        boolean $$7 = true;
        switch ($$1) {
            case b: {
                $$6 = -$$6;
                break;
            }
            case c: {
                $$4 = -$$4;
                break;
            }
            default: {
                $$7 = false;
            }
        }
        int $$8 = $$3.u();
        int $$9 = $$3.w();
        switch ($$2) {
            case c: {
                return new gu($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
            }
            case d: {
                return new gu($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
            }
            case b: {
                return new gu($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
            }
        }
        return $$7 ? new gu($$4, $$5, $$6) : $$0;
    }

    public static eei a(eei $$0, cui $$1, cvz $$2, gu $$3) {
        double $$4 = $$0.c;
        double $$5 = $$0.d;
        double $$6 = $$0.e;
        boolean $$7 = true;
        switch ($$1) {
            case b: {
                $$6 = 1.0 - $$6;
                break;
            }
            case c: {
                $$4 = 1.0 - $$4;
                break;
            }
            default: {
                $$7 = false;
            }
        }
        int $$8 = $$3.u();
        int $$9 = $$3.w();
        switch ($$2) {
            case c: {
                return new eei((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
            }
            case d: {
                return new eei((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
            }
            case b: {
                return new eei((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
            }
        }
        return $$7 ? new eei($$4, $$5, $$6) : $$0;
    }

    public gu a(gu $$0, cui $$1, cvz $$2) {
        return dvt.a($$0, $$1, $$2, this.a().u(), this.a().w());
    }

    public static gu a(gu $$0, cui $$1, cvz $$2, int $$3, int $$4) {
        int $$5 = $$1 == cui.c ? --$$3 : 0;
        int $$6 = $$1 == cui.b ? --$$4 : 0;
        gu $$7 = $$0;
        switch ($$2) {
            case a: {
                $$7 = $$0.b($$5, 0, $$6);
                break;
            }
            case b: {
                $$7 = $$0.b($$4 - $$6, 0, $$5);
                break;
            }
            case c: {
                $$7 = $$0.b($$3 - $$5, 0, $$4 - $$6);
                break;
            }
            case d: {
                $$7 = $$0.b($$6, 0, $$3 - $$5);
            }
        }
        return $$7;
    }

    public drs b(dvp $$0, gu $$1) {
        return this.a($$1, $$0.d(), $$0.e(), $$0.c());
    }

    public drs a(gu $$0, cvz $$1, gu $$2, cui $$3) {
        return dvt.a($$0, $$1, $$2, $$3, this.n);
    }

    @VisibleForTesting
    protected static drs a(gu $$0, cvz $$1, gu $$2, cui $$3, hz $$4) {
        hz $$5 = $$4.c(-1, -1, -1);
        gu $$6 = dvt.a(gu.b, $$3, $$1, $$2);
        gu $$7 = dvt.a(gu.b.a($$5), $$3, $$1, $$2);
        return drs.a($$6, $$7).a((hz)$$0);
    }

    public qr a(qr $$0) {
        if (this.l.isEmpty()) {
            $$0.a(d, new qx());
            $$0.a(a, new qx());
        } else {
            ArrayList $$1 = Lists.newArrayList();
            b $$2 = new b();
            $$1.add($$2);
            for (int $$3 = 1; $$3 < this.l.size(); ++$$3) {
                $$1.add(new b());
            }
            qx $$4 = new qx();
            List<c> $$5 = this.l.get(0).a();
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                c $$7 = $$5.get($$6);
                qr $$8 = new qr();
                $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
                int $$9 = $$2.a($$7.b);
                $$8.a(f, $$9);
                if ($$7.c != null) {
                    $$8.a("nbt", $$7.c);
                }
                $$4.add($$8);
                for (int $$10 = 1; $$10 < this.l.size(); ++$$10) {
                    b $$11 = (b)$$1.get($$10);
                    $$11.a(this.l.get((int)$$10).a().get((int)$$6).b, $$9);
                }
            }
            $$0.a(d, $$4);
            if ($$1.size() == 1) {
                qx $$12 = new qx();
                for (dcb $$13 : $$2) {
                    $$12.add(rd.a($$13));
                }
                $$0.a(a, $$12);
            } else {
                qx $$14 = new qx();
                for (b $$15 : $$1) {
                    qx $$16 = new qx();
                    for (dcb $$17 : $$15) {
                        $$16.add(rd.a($$17));
                    }
                    $$14.add($$16);
                }
                $$0.a(b, $$14);
            }
        }
        qx $$18 = new qx();
        for (d $$19 : this.m) {
            qr $$20 = new qr();
            $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
            $$20.a(i, this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
            if ($$19.c != null) {
                $$20.a("nbt", $$19.c);
            }
            $$18.add($$20);
        }
        $$0.a(c, $$18);
        $$0.a(k, this.a(this.n.u(), this.n.v(), this.n.w()));
        return rd.g($$0);
    }

    public void a(hf<cpn> $$0, qr $$1) {
        this.l.clear();
        this.m.clear();
        qx $$2 = $$1.c(k, 3);
        this.n = new hz($$2.e(0), $$2.e(1), $$2.e(2));
        qx $$3 = $$1.c(d, 10);
        if ($$1.b(b, 9)) {
            qx $$4 = $$1.c(b, 9);
            for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                this.a($$0, $$4.b($$5), $$3);
            }
        } else {
            this.a($$0, $$1.c(a, 10), $$3);
        }
        qx $$6 = $$1.c(c, 10);
        for (int $$7 = 0; $$7 < $$6.size(); ++$$7) {
            qr $$8 = $$6.a($$7);
            qx $$9 = $$8.c("pos", 6);
            eei $$10 = new eei($$9.h(0), $$9.h(1), $$9.h(2));
            qx $$11 = $$8.c(i, 3);
            gu $$12 = new gu($$11.e(0), $$11.e(1), $$11.e(2));
            if (!$$8.e("nbt")) continue;
            qr $$13 = $$8.p("nbt");
            this.m.add(new d($$10, $$12, $$13));
        }
    }

    private void a(hf<cpn> $$0, qx $$1, qx $$2) {
        b $$3 = new b();
        for (int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            $$3.a(rd.a($$0, $$1.a($$4)), $$4);
        }
        ArrayList $$5 = Lists.newArrayList();
        ArrayList $$6 = Lists.newArrayList();
        ArrayList $$7 = Lists.newArrayList();
        for (int $$8 = 0; $$8 < $$2.size(); ++$$8) {
            qr $$14;
            qr $$9 = $$2.a($$8);
            qx $$10 = $$9.c("pos", 3);
            gu $$11 = new gu($$10.e(0), $$10.e(1), $$10.e(2));
            dcb $$12 = $$3.a($$9.h(f));
            if ($$9.e("nbt")) {
                qr $$13 = $$9.p("nbt");
            } else {
                $$14 = null;
            }
            c $$15 = new c($$11, $$12, $$14);
            dvt.a($$15, $$5, $$6, $$7);
        }
        List<c> $$16 = dvt.a($$5, $$6, $$7);
        this.l.add(new a($$16));
    }

    private qx a(int ... $$0) {
        qx $$1 = new qx();
        for (int $$2 : $$0) {
            $$1.add(qw.a($$2));
        }
        return $$1;
    }

    private qx a(double ... $$0) {
        qx $$1 = new qx();
        for (double $$2 : $$0) {
            $$1.add(qs.a($$2));
        }
        return $$1;
    }

    public static final class c
    extends Record {
        final gu a;
        final dcb b;
        @Nullable
        final qr c;

        public c(gu $$0, dcb $$1, @Nullable qr $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public String toString() {
            return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "pos;state;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "pos;state;nbt", "a", "b", "c"}, this, $$0);
        }

        public gu a() {
            return this.a;
        }

        public dcb b() {
            return this.b;
        }

        @Nullable
        public qr c() {
            return this.c;
        }
    }

    public static final class a {
        private final List<c> a;
        private final Map<cpn, List<c>> b = Maps.newHashMap();

        a(List<c> $$0) {
            this.a = $$0;
        }

        public List<c> a() {
            return this.a;
        }

        public List<c> a(cpn $$02) {
            return this.b.computeIfAbsent($$02, $$0 -> this.a.stream().filter($$1 -> $$1.b.a((cpn)$$0)).collect(Collectors.toList()));
        }
    }

    public static class d {
        public final eei a;
        public final gu b;
        public final qr c;

        public d(eei $$0, gu $$1, qr $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    static class b
    implements Iterable<dcb> {
        public static final dcb a = cpo.a.n();
        private final hk<dcb> b = new hk(16);
        private int c;

        b() {
        }

        public int a(dcb $$0) {
            int $$1 = this.b.a($$0);
            if ($$1 == -1) {
                $$1 = this.c++;
                this.b.a($$0, $$1);
            }
            return $$1;
        }

        @Nullable
        public dcb a(int $$0) {
            dcb $$1 = this.b.a($$0);
            return $$1 == null ? a : $$1;
        }

        @Override
        public Iterator<dcb> iterator() {
            return this.b.iterator();
        }

        public void a(dcb $$0, int $$1) {
            this.b.a($$0, $$1);
        }
    }
}

