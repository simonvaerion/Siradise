/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class byn
implements bdq,
beb {
    public static final int c = 5;
    public static final int d = 36;
    private static final int n = 9;
    public static final int e = 40;
    public static final int f = -1;
    public static final int[] g = new int[]{0, 1, 2, 3};
    public static final int[] h = new int[]{3};
    public final hn<cfz> i = hn.a(36, cfz.b);
    public final hn<cfz> j = hn.a(4, cfz.b);
    public final hn<cfz> k = hn.a(1, cfz.b);
    private final List<hn<cfz>> o = ImmutableList.of(this.i, this.j, this.k);
    public int l;
    public final byo m;
    private int p;

    public byn(byo $$0) {
        this.m = $$0;
    }

    public cfz f() {
        if (byn.d(this.l)) {
            return this.i.get(this.l);
        }
        return cfz.b;
    }

    public static int g() {
        return 9;
    }

    private boolean a(cfz $$0, cfz $$1) {
        return !$$0.b() && cfz.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ac_();
    }

    public int h() {
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            if (!this.i.get($$0).b()) continue;
            return $$0;
        }
        return -1;
    }

    public void a(cfz $$0) {
        int $$1 = this.b($$0);
        if (byn.d($$1)) {
            this.l = $$1;
            return;
        }
        if ($$1 == -1) {
            int $$2;
            this.l = this.i();
            if (!this.i.get(this.l).b() && ($$2 = this.h()) != -1) {
                this.i.set($$2, this.i.get(this.l));
            }
            this.i.set(this.l, $$0);
        } else {
            this.c($$1);
        }
    }

    public void c(int $$0) {
        this.l = this.i();
        cfz $$1 = this.i.get(this.l);
        this.i.set(this.l, this.i.get($$0));
        this.i.set($$0, $$1);
    }

    public static boolean d(int $$0) {
        return $$0 >= 0 && $$0 < 9;
    }

    public int b(cfz $$0) {
        for (int $$1 = 0; $$1 < this.i.size(); ++$$1) {
            if (this.i.get($$1).b() || !cfz.c($$0, this.i.get($$1))) continue;
            return $$1;
        }
        return -1;
    }

    public int c(cfz $$0) {
        for (int $$1 = 0; $$1 < this.i.size(); ++$$1) {
            cfz $$2 = this.i.get($$1);
            if (this.i.get($$1).b() || !cfz.c($$0, this.i.get($$1)) || this.i.get($$1).j() || $$2.E() || $$2.A()) continue;
            return $$1;
        }
        return -1;
    }

    public int i() {
        for (int $$0 = 0; $$0 < 9; ++$$0) {
            int $$1 = (this.l + $$0) % 9;
            if (!this.i.get($$1).b()) continue;
            return $$1;
        }
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            int $$3 = (this.l + $$2) % 9;
            if (this.i.get($$3).E()) continue;
            return $$3;
        }
        return this.l;
    }

    public void a(double $$0) {
        int $$1 = (int)Math.signum($$0);
        this.l -= $$1;
        while (this.l < 0) {
            this.l += 9;
        }
        while (this.l >= 9) {
            this.l -= 9;
        }
    }

    public int a(Predicate<cfz> $$0, int $$1, bdq $$2) {
        int $$3 = 0;
        boolean $$4 = $$1 == 0;
        $$3 += bdr.a(this, $$0, $$1 - $$3, $$4);
        $$3 += bdr.a($$2, $$0, $$1 - $$3, $$4);
        cfz $$5 = this.m.bR.g();
        $$3 += bdr.a($$5, $$0, $$1 - $$3, $$4);
        if ($$5.b()) {
            this.m.bR.b(cfz.b);
        }
        return $$3;
    }

    private int i(cfz $$0) {
        int $$1 = this.d($$0);
        if ($$1 == -1) {
            $$1 = this.h();
        }
        if ($$1 == -1) {
            return $$0.L();
        }
        return this.d($$1, $$0);
    }

    private int d(int $$0, cfz $$1) {
        int $$5;
        cfu $$2 = $$1.d();
        int $$3 = $$1.L();
        cfz $$4 = this.a($$0);
        if ($$4.b()) {
            $$4 = new cfz($$2, 0);
            if ($$1.u()) {
                $$4.c($$1.v().h());
            }
            this.a($$0, $$4);
        }
        if (($$5 = $$3) > $$4.g() - $$4.L()) {
            $$5 = $$4.g() - $$4.L();
        }
        if ($$5 > this.ac_() - $$4.L()) {
            $$5 = this.ac_() - $$4.L();
        }
        if ($$5 == 0) {
            return $$3;
        }
        $$4.g($$5);
        $$4.e(5);
        return $$3 -= $$5;
    }

    public int d(cfz $$0) {
        if (this.a(this.a(this.l), $$0)) {
            return this.l;
        }
        if (this.a(this.a(40), $$0)) {
            return 40;
        }
        for (int $$1 = 0; $$1 < this.i.size(); ++$$1) {
            if (!this.a(this.i.get($$1), $$0)) continue;
            return $$1;
        }
        return -1;
    }

    public void j() {
        for (hn<cfz> $$0 : this.o) {
            for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
                if ($$0.get($$1).b()) continue;
                $$0.get($$1).a(this.m.dI(), this.m, $$1, this.l == $$1);
            }
        }
    }

    public boolean e(cfz $$0) {
        return this.c(-1, $$0);
    }

    public boolean c(int $$0, cfz $$1) {
        if ($$1.b()) {
            return false;
        }
        try {
            if (!$$1.j()) {
                int $$2;
                do {
                    $$2 = $$1.L();
                    if ($$0 == -1) {
                        $$1.f(this.i($$1));
                        continue;
                    }
                    $$1.f(this.d($$0, $$1));
                } while (!$$1.b() && $$1.L() < $$2);
                if ($$1.L() == $$2 && this.m.fO().d) {
                    $$1.f(0);
                    return true;
                }
                return $$1.L() < $$2;
            }
            if ($$0 == -1) {
                $$0 = this.h();
            }
            if ($$0 >= 0) {
                this.i.set($$0, $$1.c());
                this.i.get($$0).e(5);
                return true;
            }
            if (this.m.fO().d) {
                $$1.f(0);
                return true;
            }
            return false;
        }
        catch (Throwable $$3) {
            o $$4 = o.a($$3, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cfu.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
        }
    }

    public void f(cfz $$0) {
        this.a($$0, true);
    }

    public void a(cfz $$0, boolean $$1) {
        while (!$$0.b()) {
            int $$2 = this.d($$0);
            if ($$2 == -1) {
                $$2 = this.h();
            }
            if ($$2 == -1) {
                this.m.a($$0, false);
                break;
            }
            int $$3 = $$0.g() - this.a($$2).L();
            if (!this.c($$2, $$0.a($$3)) || !$$1 || !(this.m instanceof aig)) continue;
            ((aig)this.m).c.a(new vm(-2, 0, $$2, this.a($$2)));
        }
    }

    @Override
    public cfz a(int $$0, int $$1) {
        hn<cfz> $$2 = null;
        for (hn<cfz> $$3 : this.o) {
            if ($$0 < $$3.size()) {
                $$2 = $$3;
                break;
            }
            $$0 -= $$3.size();
        }
        if ($$2 != null && !((cfz)$$2.get($$0)).b()) {
            return bdr.a($$2, $$0, $$1);
        }
        return cfz.b;
    }

    public void g(cfz $$0) {
        block0: for (hn<cfz> $$1 : this.o) {
            for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
                if ($$1.get($$2) != $$0) continue;
                $$1.set($$2, cfz.b);
                continue block0;
            }
        }
    }

    @Override
    public cfz b(int $$0) {
        hn<cfz> $$1 = null;
        for (hn<cfz> $$2 : this.o) {
            if ($$0 < $$2.size()) {
                $$1 = $$2;
                break;
            }
            $$0 -= $$2.size();
        }
        if ($$1 != null && !((cfz)$$1.get($$0)).b()) {
            cfz $$3 = $$1.get($$0);
            $$1.set($$0, cfz.b);
            return $$3;
        }
        return cfz.b;
    }

    @Override
    public void a(int $$0, cfz $$1) {
        hn<cfz> $$2 = null;
        for (hn<cfz> $$3 : this.o) {
            if ($$0 < $$3.size()) {
                $$2 = $$3;
                break;
            }
            $$0 -= $$3.size();
        }
        if ($$2 != null) {
            $$2.set($$0, $$1);
        }
    }

    public float a(dcb $$0) {
        return this.i.get(this.l).a($$0);
    }

    public qx a(qx $$0) {
        for (int $$1 = 0; $$1 < this.i.size(); ++$$1) {
            if (this.i.get($$1).b()) continue;
            qr $$2 = new qr();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
        }
        for (int $$3 = 0; $$3 < this.j.size(); ++$$3) {
            if (this.j.get($$3).b()) continue;
            qr $$4 = new qr();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
        }
        for (int $$5 = 0; $$5 < this.k.size(); ++$$5) {
            if (this.k.get($$5).b()) continue;
            qr $$6 = new qr();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
        }
        return $$0;
    }

    public void b(qx $$0) {
        this.i.clear();
        this.j.clear();
        this.k.clear();
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            qr $$2 = $$0.a($$1);
            int $$3 = $$2.f("Slot") & 0xFF;
            cfz $$4 = cfz.a($$2);
            if ($$4.b()) continue;
            if ($$3 >= 0 && $$3 < this.i.size()) {
                this.i.set($$3, $$4);
                continue;
            }
            if ($$3 >= 100 && $$3 < this.j.size() + 100) {
                this.j.set($$3 - 100, $$4);
                continue;
            }
            if ($$3 < 150 || $$3 >= this.k.size() + 150) continue;
            this.k.set($$3 - 150, $$4);
        }
    }

    @Override
    public int b() {
        return this.i.size() + this.j.size() + this.k.size();
    }

    @Override
    public boolean ab_() {
        for (cfz $$0 : this.i) {
            if ($$0.b()) continue;
            return false;
        }
        for (cfz $$1 : this.j) {
            if ($$1.b()) continue;
            return false;
        }
        for (cfz $$2 : this.k) {
            if ($$2.b()) continue;
            return false;
        }
        return true;
    }

    @Override
    public cfz a(int $$0) {
        hn<cfz> $$1 = null;
        for (hn<cfz> $$2 : this.o) {
            if ($$0 < $$2.size()) {
                $$1 = $$2;
                break;
            }
            $$0 -= $$2.size();
        }
        return $$1 == null ? cfz.b : (cfz)$$1.get($$0);
    }

    @Override
    public sw Z() {
        return sw.c("container.inventory");
    }

    public cfz e(int $$0) {
        return this.j.get($$0);
    }

    public void a(ben $$0, float $$12, int[] $$2) {
        if ($$12 <= 0.0f) {
            return;
        }
        if (($$12 /= 4.0f) < 1.0f) {
            $$12 = 1.0f;
        }
        for (int $$3 : $$2) {
            cfz $$4 = this.j.get($$3);
            if ($$0.a(amy.i) && $$4.d().w() || !($$4.d() instanceof cdj)) continue;
            $$4.a((int)$$12, this.m, (T $$1) -> $$1.d(bfo.a(bfo.a.b, $$3)));
        }
    }

    public void k() {
        for (List list : this.o) {
            for (int $$1 = 0; $$1 < list.size(); ++$$1) {
                cfz $$2 = (cfz)list.get($$1);
                if ($$2.b()) continue;
                this.m.a($$2, true, false);
                list.set($$1, cfz.b);
            }
        }
    }

    @Override
    public void e() {
        ++this.p;
    }

    public int l() {
        return this.p;
    }

    @Override
    public boolean a(byo $$0) {
        if (this.m.dD()) {
            return false;
        }
        return !($$0.f((bfj)this.m) > 64.0);
    }

    public boolean h(cfz $$0) {
        for (List list : this.o) {
            for (cfz $$2 : list) {
                if ($$2.b() || !cfz.c($$2, $$0)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean a(anl<cfu> $$0) {
        for (List list : this.o) {
            for (cfz $$2 : list) {
                if ($$2.b() || !$$2.a($$0)) continue;
                return true;
            }
        }
        return false;
    }

    public void a(byn $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            this.a($$1, $$0.a($$1));
        }
        this.l = $$0.l;
    }

    @Override
    public void a() {
        for (List list : this.o) {
            list.clear();
        }
    }

    public void a(bys $$0) {
        for (cfz $$1 : this.i) {
            $$0.a($$1);
        }
    }

    public cfz a(boolean $$0) {
        cfz $$1 = this.f();
        if ($$1.b()) {
            return cfz.b;
        }
        return this.a(this.l, $$0 ? $$1.L() : 1);
    }
}

