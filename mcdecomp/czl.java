/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class czl
extends czn {
    private static final int d = 50;
    private static final int e = 60;
    private static final int f = 60;
    private static final int g = 40;
    private static final int h = 5;
    private static final int i = 48;
    private static final int j = 32;
    private static final int k = 48;
    private long l;
    public int a;
    public boolean b;
    public ha c;
    private List<bfz> m;
    private boolean n;
    private int r;

    public czl(gu $$0, dcb $$1) {
        super(czp.E, $$0, $$1);
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.c();
            this.r = 0;
            this.c = ha.a($$1);
            this.a = 0;
            this.b = true;
            return true;
        }
        return super.a_($$0, $$1);
    }

    private static void a(cmm $$0, gu $$1, dcb $$2, czl $$3, a $$4) {
        if ($$3.b) {
            ++$$3.a;
        }
        if ($$3.a >= 50) {
            $$3.b = false;
            $$3.a = 0;
        }
        if ($$3.a >= 5 && $$3.r == 0 && czl.a($$1, $$3.m)) {
            $$3.n = true;
            $$0.a(null, $$1, amh.bL, ami.e, 1.0f, 1.0f);
        }
        if ($$3.n) {
            if ($$3.r < 40) {
                ++$$3.r;
            } else {
                $$4.run($$0, $$1, $$3.m);
                $$3.n = false;
            }
        }
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, czl $$3) {
        czl.a($$0, $$1, $$2, $$3, czl::b);
    }

    public static void b(cmm $$0, gu $$1, dcb $$2, czl $$3) {
        czl.a($$0, $$1, $$2, $$3, czl::a);
    }

    public void a(ha $$0) {
        gu $$1 = this.p();
        this.c = $$0;
        if (this.b) {
            this.a = 0;
        } else {
            this.b = true;
        }
        this.o.a($$1, this.q().b(), 1, $$0.d());
    }

    private void c() {
        gu $$0 = this.p();
        if (this.o.V() > this.l + 60L || this.m == null) {
            this.l = this.o.V();
            eed $$1 = new eed($$0).g(48.0);
            this.m = this.o.a(bfz.class, $$1);
        }
        if (!this.o.B) {
            for (bfz $$2 : this.m) {
                if (!$$2.bs() || $$2.dD() || !$$0.a($$2.dg(), 32.0)) continue;
                $$2.dK().a(bpb.D, Long.valueOf(this.o.V()));
            }
        }
    }

    private static boolean a(gu $$0, List<bfz> $$1) {
        for (bfz $$2 : $$1) {
            if (!$$2.bs() || $$2.dD() || !$$0.a($$2.dg(), 32.0) || !$$2.ae().a(amz.b)) continue;
            return true;
        }
        return false;
    }

    private static void a(cmm $$0, gu $$12, List<bfz> $$2) {
        $$2.stream().filter($$1 -> czl.a($$12, $$1)).forEach(czl::a);
    }

    private static void b(cmm $$0, gu $$12, List<bfz> $$2) {
        MutableInt $$3 = new MutableInt(16700985);
        int $$42 = (int)$$2.stream().filter($$1 -> $$12.a($$1.dg(), 48.0)).count();
        $$2.stream().filter($$1 -> czl.a($$12, $$1)).forEach($$4 -> {
            float $$5 = 1.0f;
            double $$6 = Math.sqrt(($$4.dn() - (double)$$12.u()) * ($$4.dn() - (double)$$12.u()) + ($$4.dt() - (double)$$12.w()) * ($$4.dt() - (double)$$12.w()));
            double $$7 = (double)((float)$$12.u() + 0.5f) + 1.0 / $$6 * ($$4.dn() - (double)$$12.u());
            double $$8 = (double)((float)$$12.w() + 0.5f) + 1.0 / $$6 * ($$4.dt() - (double)$$12.w());
            int $$9 = apa.a(($$42 - 21) / -2, 3, 15);
            for (int $$10 = 0; $$10 < $$9; ++$$10) {
                int $$11 = $$3.addAndGet(5);
                double $$12 = (double)aok.b.b($$11) / 255.0;
                double $$13 = (double)aok.b.c($$11) / 255.0;
                double $$14 = (double)aok.b.d($$11) / 255.0;
                $$0.a(iv.v, $$7, (double)((float)$$12.v() + 0.5f), $$8, $$12, $$13, $$14);
            }
        });
    }

    private static boolean a(gu $$0, bfz $$1) {
        return $$1.bs() && !$$1.dD() && $$0.a($$1.dg(), 48.0) && $$1.ae().a(amz.b);
    }

    private static void a(bfz $$0) {
        $$0.b(new bfa(bfc.x, 60));
    }

    @FunctionalInterface
    static interface a {
        public void run(cmm var1, gu var2, List<bfz> var3);
    }
}

