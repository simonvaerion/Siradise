/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class chx {
    public static final int a = 20;
    private static final List<a<chw>> b = Lists.newArrayList();
    private static final List<a<cfu>> c = Lists.newArrayList();
    private static final List<ciz> d = Lists.newArrayList();
    private static final Predicate<cfz> e = $$0 -> {
        for (ciz $$1 : d) {
            if (!$$1.a((cfz)$$0)) continue;
            return true;
        }
        return false;
    };

    public static boolean a(cfz $$0) {
        return chx.b($$0) || chx.c($$0);
    }

    protected static boolean b(cfz $$0) {
        int $$2 = c.size();
        for (int $$1 = 0; $$1 < $$2; ++$$1) {
            if (!chx.c.get((int)$$1).b.a($$0)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(cfz $$0) {
        int $$2 = b.size();
        for (int $$1 = 0; $$1 < $$2; ++$$1) {
            if (!chx.b.get((int)$$1).b.a($$0)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(chw $$0) {
        int $$2 = b.size();
        for (int $$1 = 0; $$1 < $$2; ++$$1) {
            if (chx.b.get((int)$$1).c != $$0) continue;
            return true;
        }
        return false;
    }

    public static boolean a(cfz $$0, cfz $$1) {
        if (!e.test($$0)) {
            return false;
        }
        return chx.b($$0, $$1) || chx.c($$0, $$1);
    }

    protected static boolean b(cfz $$0, cfz $$1) {
        cfu $$2 = $$0.d();
        int $$4 = c.size();
        for (int $$3 = 0; $$3 < $$4; ++$$3) {
            a<cfu> $$5 = c.get($$3);
            if ($$5.a != $$2 || !$$5.b.a($$1)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(cfz $$0, cfz $$1) {
        chw $$2 = chy.d($$0);
        int $$4 = b.size();
        for (int $$3 = 0; $$3 < $$4; ++$$3) {
            a<chw> $$5 = b.get($$3);
            if ($$5.a != $$2 || !$$5.b.a($$1)) continue;
            return true;
        }
        return false;
    }

    public static cfz d(cfz $$0, cfz $$1) {
        if (!$$1.b()) {
            chw $$2 = chy.d($$1);
            cfu $$3 = $$1.d();
            int $$5 = c.size();
            for (int $$4 = 0; $$4 < $$5; ++$$4) {
                a<cfu> $$6 = c.get($$4);
                if ($$6.a != $$3 || !$$6.b.a($$0)) continue;
                return chy.a(new cfz((cml)$$6.c), $$2);
            }
            int $$8 = b.size();
            for (int $$7 = 0; $$7 < $$8; ++$$7) {
                a<chw> $$9 = b.get($$7);
                if ($$9.a != $$2 || !$$9.b.a($$0)) continue;
                return chy.a(new cfz($$3), (chw)$$9.c);
            }
        }
        return $$1;
    }

    public static void a() {
        chx.a(cgc.rv);
        chx.a(cgc.uu);
        chx.a(cgc.ux);
        chx.a(cgc.rv, cgc.oG, cgc.uu);
        chx.a(cgc.uu, cgc.ut, cgc.ux);
        chx.a(chz.c, cgc.rE, chz.d);
        chx.a(chz.c, cgc.rs, chz.d);
        chx.a(chz.c, cgc.tJ, chz.d);
        chx.a(chz.c, cgc.rz, chz.d);
        chx.a(chz.c, cgc.rx, chz.d);
        chx.a(chz.c, cgc.qM, chz.d);
        chx.a(chz.c, cgc.rA, chz.d);
        chx.a(chz.c, cgc.qk, chz.e);
        chx.a(chz.c, cgc.ll, chz.d);
        chx.a(chz.c, cgc.ru, chz.f);
        chx.a(chz.f, cgc.tq, chz.g);
        chx.a(chz.g, cgc.ll, chz.h);
        chx.a(chz.g, cgc.ry, chz.i);
        chx.a(chz.h, cgc.ry, chz.j);
        chx.a(chz.i, cgc.ll, chz.j);
        chx.a(chz.f, cgc.rA, chz.n);
        chx.a(chz.n, cgc.ll, chz.o);
        chx.a(chz.f, cgc.tJ, chz.k);
        chx.a(chz.k, cgc.ll, chz.l);
        chx.a(chz.k, cgc.qk, chz.m);
        chx.a(chz.k, cgc.ry, chz.s);
        chx.a(chz.l, cgc.ry, chz.t);
        chx.a(chz.s, cgc.ll, chz.t);
        chx.a(chz.s, cgc.qk, chz.u);
        chx.a(chz.f, cgc.nC, chz.v);
        chx.a(chz.v, cgc.ll, chz.w);
        chx.a(chz.v, cgc.qk, chz.x);
        chx.a(chz.p, cgc.ry, chz.s);
        chx.a(chz.q, cgc.ry, chz.t);
        chx.a(chz.f, cgc.qM, chz.p);
        chx.a(chz.p, cgc.ll, chz.q);
        chx.a(chz.p, cgc.qk, chz.r);
        chx.a(chz.f, cgc.qo, chz.y);
        chx.a(chz.y, cgc.ll, chz.z);
        chx.a(chz.f, cgc.rE, chz.A);
        chx.a(chz.A, cgc.qk, chz.B);
        chx.a(chz.A, cgc.ry, chz.C);
        chx.a(chz.B, cgc.ry, chz.D);
        chx.a(chz.C, cgc.qk, chz.D);
        chx.a(chz.E, cgc.ry, chz.C);
        chx.a(chz.F, cgc.ry, chz.C);
        chx.a(chz.G, cgc.ry, chz.D);
        chx.a(chz.f, cgc.rx, chz.E);
        chx.a(chz.E, cgc.ll, chz.F);
        chx.a(chz.E, cgc.qk, chz.G);
        chx.a(chz.f, cgc.rs, chz.H);
        chx.a(chz.H, cgc.ll, chz.I);
        chx.a(chz.H, cgc.qk, chz.J);
        chx.a(chz.f, cgc.rz, chz.K);
        chx.a(chz.K, cgc.ll, chz.L);
        chx.a(chz.K, cgc.qk, chz.M);
        chx.a(chz.c, cgc.ry, chz.N);
        chx.a(chz.N, cgc.ll, chz.O);
        chx.a(chz.f, cgc.uW, chz.Q);
        chx.a(chz.Q, cgc.ll, chz.R);
    }

    private static void a(cfu $$0, cfu $$1, cfu $$2) {
        if (!($$0 instanceof cgo)) {
            throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
        }
        if (!($$2 instanceof cgo)) {
            throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$2));
        }
        c.add(new a<cfu>($$0, ciz.a($$1), $$2));
    }

    private static void a(cfu $$0) {
        if (!($$0 instanceof cgo)) {
            throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
        }
        d.add(ciz.a($$0));
    }

    private static void a(chw $$0, cfu $$1, chw $$2) {
        b.add(new a<chw>($$0, ciz.a($$1), $$2));
    }

    static class a<T> {
        final T a;
        final ciz b;
        final T c;

        public a(T $$0, ciz $$1, T $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

