/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class cki {
    private static final String a = "id";
    private static final String b = "lvl";
    private static final float c = 0.15f;

    public static qr a(@Nullable acq $$0, int $$1) {
        qr $$2 = new qr();
        $$2.a(a, String.valueOf($$0));
        $$2.a(b, (short)$$1);
        return $$2;
    }

    public static void a(qr $$0, int $$1) {
        $$0.a(b, (short)$$1);
    }

    public static int a(qr $$0) {
        return apa.a($$0.h(b), 0, 255);
    }

    @Nullable
    public static acq b(qr $$0) {
        return acq.a($$0.l(a));
    }

    @Nullable
    public static acq a(ckg $$0) {
        return jb.g.b($$0);
    }

    public static int a(ckg $$0, cfz $$1) {
        if ($$1.b()) {
            return 0;
        }
        acq $$2 = cki.a($$0);
        qx $$3 = $$1.x();
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            qr $$5 = $$3.a($$4);
            acq $$6 = cki.b($$5);
            if ($$6 == null || !$$6.equals($$2)) continue;
            return cki.a($$5);
        }
        return 0;
    }

    public static Map<ckg, Integer> a(cfz $$0) {
        qx $$1 = $$0.a(cgc.tC) ? cev.d($$0) : $$0.x();
        return cki.a($$1);
    }

    public static Map<ckg, Integer> a(qx $$0) {
        LinkedHashMap $$1 = Maps.newLinkedHashMap();
        for (int $$22 = 0; $$22 < $$0.size(); ++$$22) {
            qr $$3 = $$0.a($$22);
            jb.g.b(cki.b($$3)).ifPresent($$2 -> $$1.put($$2, cki.a($$3)));
        }
        return $$1;
    }

    public static void a(Map<ckg, Integer> $$0, cfz $$1) {
        qx $$2 = new qx();
        for (Map.Entry<ckg, Integer> $$3 : $$0.entrySet()) {
            ckg $$4 = $$3.getKey();
            if ($$4 == null) continue;
            int $$5 = $$3.getValue();
            $$2.add(cki.a(cki.a($$4), $$5));
            if (!$$1.a(cgc.tC)) continue;
            cev.a($$1, new ckj($$4, $$5));
        }
        if ($$2.isEmpty()) {
            $$1.c("Enchantments");
        } else if (!$$1.a(cgc.tC)) {
            $$1.a("Enchantments", $$2);
        }
    }

    private static void a(a $$0, cfz $$1) {
        if ($$1.b()) {
            return;
        }
        qx $$22 = $$1.x();
        for (int $$3 = 0; $$3 < $$22.size(); ++$$3) {
            qr $$4 = $$22.a($$3);
            jb.g.b(cki.b($$4)).ifPresent($$2 -> $$0.accept((ckg)$$2, cki.a($$4)));
        }
    }

    private static void a(a $$0, Iterable<cfz> $$1) {
        for (cfz $$2 : $$1) {
            cki.a($$0, $$2);
        }
    }

    public static int a(Iterable<cfz> $$0, ben $$1) {
        MutableInt $$22 = new MutableInt();
        cki.a((ckg $$2, int $$3) -> $$22.add($$2.a($$3, $$1)), $$0);
        return $$22.intValue();
    }

    public static float a(cfz $$0, bge $$1) {
        MutableFloat $$22 = new MutableFloat();
        cki.a((ckg $$2, int $$3) -> $$22.add($$2.a($$3, $$1)), $$0);
        return $$22.floatValue();
    }

    public static float a(bfz $$0) {
        int $$1 = cki.a(ckk.t, $$0);
        if ($$1 > 0) {
            return ckw.e($$1);
        }
        return 0.0f;
    }

    public static void a(bfz $$0, bfj $$1) {
        a $$22 = ($$2, $$3) -> $$2.b($$0, $$1, $$3);
        if ($$0 != null) {
            cki.a($$22, $$0.bK());
        }
        if ($$1 instanceof byo) {
            cki.a($$22, $$0.eO());
        }
    }

    public static void b(bfz $$0, bfj $$1) {
        a $$22 = ($$2, $$3) -> $$2.a($$0, $$1, $$3);
        if ($$0 != null) {
            cki.a($$22, $$0.bK());
        }
        if ($$0 instanceof byo) {
            cki.a($$22, $$0.eO());
        }
    }

    public static int a(ckg $$0, bfz $$1) {
        Collection<cfz> $$2 = $$0.a($$1).values();
        if ($$2 == null) {
            return 0;
        }
        int $$3 = 0;
        for (cfz $$4 : $$2) {
            int $$5 = cki.a($$0, $$4);
            if ($$5 <= $$3) continue;
            $$3 = $$5;
        }
        return $$3;
    }

    public static float b(bfz $$0) {
        return (float)cki.a(ckk.m, $$0) * 0.15f;
    }

    public static int c(bfz $$0) {
        return cki.a(ckk.q, $$0);
    }

    public static int d(bfz $$0) {
        return cki.a(ckk.r, $$0);
    }

    public static int e(bfz $$0) {
        return cki.a(ckk.f, $$0);
    }

    public static int f(bfz $$0) {
        return cki.a(ckk.i, $$0);
    }

    public static int g(bfz $$0) {
        return cki.a(ckk.u, $$0);
    }

    public static int b(cfz $$0) {
        return cki.a(ckk.C, $$0);
    }

    public static int c(cfz $$0) {
        return cki.a(ckk.D, $$0);
    }

    public static int h(bfz $$0) {
        return cki.a(ckk.s, $$0);
    }

    public static boolean i(bfz $$0) {
        return cki.a(ckk.g, $$0) > 0;
    }

    public static boolean j(bfz $$0) {
        return cki.a(ckk.j, $$0) > 0;
    }

    public static boolean k(bfz $$0) {
        return cki.a(ckk.l, $$0) > 0;
    }

    public static boolean d(cfz $$0) {
        return cki.a(ckk.k, $$0) > 0;
    }

    public static boolean e(cfz $$0) {
        return cki.a(ckk.M, $$0) > 0;
    }

    public static boolean f(cfz $$0) {
        return cki.a(ckk.v, $$0) > 0;
    }

    public static int g(cfz $$0) {
        return cki.a(ckk.E, $$0);
    }

    public static int h(cfz $$0) {
        return cki.a(ckk.G, $$0);
    }

    public static boolean i(cfz $$0) {
        return cki.a(ckk.H, $$0) > 0;
    }

    @Nullable
    public static Map.Entry<bfo, cfz> b(ckg $$02, bfz $$1) {
        return cki.a($$02, $$1, (cfz $$0) -> true);
    }

    @Nullable
    public static Map.Entry<bfo, cfz> a(ckg $$0, bfz $$1, Predicate<cfz> $$2) {
        Map<bfo, cfz> $$3 = $$0.a($$1);
        if ($$3.isEmpty()) {
            return null;
        }
        ArrayList $$4 = Lists.newArrayList();
        for (Map.Entry<bfo, cfz> $$5 : $$3.entrySet()) {
            cfz $$6 = $$5.getValue();
            if ($$6.b() || cki.a($$0, $$6) <= 0 || !$$2.test($$6)) continue;
            $$4.add($$5);
        }
        return $$4.isEmpty() ? null : (Map.Entry)$$4.get($$1.ec().a($$4.size()));
    }

    public static int a(apf $$0, int $$1, int $$2, cfz $$3) {
        cfu $$4 = $$3.d();
        int $$5 = $$4.c();
        if ($$5 <= 0) {
            return 0;
        }
        if ($$2 > 15) {
            $$2 = 15;
        }
        int $$6 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
        if ($$1 == 0) {
            return Math.max($$6 / 3, 1);
        }
        if ($$1 == 1) {
            return $$6 * 2 / 3 + 1;
        }
        return Math.max($$6, $$2 * 2);
    }

    public static cfz a(apf $$0, cfz $$1, int $$2, boolean $$3) {
        List<ckj> $$4 = cki.b($$0, $$1, $$2, $$3);
        boolean $$5 = $$1.a(cgc.qb);
        if ($$5) {
            $$1 = new cfz(cgc.tC);
        }
        for (ckj $$6 : $$4) {
            if ($$5) {
                cev.a($$1, $$6);
                continue;
            }
            $$1.a($$6.a, $$6.b);
        }
        return $$1;
    }

    public static List<ckj> b(apf $$0, cfz $$1, int $$2, boolean $$3) {
        ArrayList $$4 = Lists.newArrayList();
        cfu $$5 = $$1.d();
        int $$6 = $$5.c();
        if ($$6 <= 0) {
            return $$4;
        }
        $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
        float $$7 = ($$0.i() + $$0.i() - 1.0f) * 0.15f;
        List<ckj> $$8 = cki.a($$2 = apa.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE), $$1, $$3);
        if (!$$8.isEmpty()) {
            bck.a($$0, $$8).ifPresent($$4::add);
            while ($$0.a(50) <= $$2) {
                if (!$$4.isEmpty()) {
                    cki.a($$8, (ckj)ac.a($$4));
                }
                if ($$8.isEmpty()) break;
                bck.a($$0, $$8).ifPresent($$4::add);
                $$2 /= 2;
            }
        }
        return $$4;
    }

    public static void a(List<ckj> $$0, ckj $$1) {
        Iterator<ckj> $$2 = $$0.iterator();
        while ($$2.hasNext()) {
            if ($$1.a.b($$2.next().a)) continue;
            $$2.remove();
        }
    }

    public static boolean a(Collection<ckg> $$0, ckg $$1) {
        for (ckg $$2 : $$0) {
            if ($$2.b($$1)) continue;
            return false;
        }
        return true;
    }

    public static List<ckj> a(int $$0, cfz $$1, boolean $$2) {
        ArrayList $$3 = Lists.newArrayList();
        cfu $$4 = $$1.d();
        boolean $$5 = $$1.a(cgc.qb);
        block0: for (ckg $$6 : jb.g) {
            if ($$6.b() && !$$2 || !$$6.i() || !$$6.e.a($$4) && !$$5) continue;
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; --$$7) {
                if ($$0 < $$6.a($$7) || $$0 > $$6.b($$7)) continue;
                $$3.add(new ckj($$6, $$7));
                continue block0;
            }
        }
        return $$3;
    }

    @FunctionalInterface
    static interface a {
        public void accept(ckg var1, int var2);
    }
}

