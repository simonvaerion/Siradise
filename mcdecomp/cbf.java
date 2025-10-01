/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cbf {
    private static final Logger k = LogUtils.getLogger();
    public static final int a = -999;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = Integer.MAX_VALUE;
    private final hn<cfz> l = hn.a();
    public final hn<ccx> i = hn.a();
    private final List<cbv> m = Lists.newArrayList();
    private cfz n = cfz.b;
    private final hn<cfz> o = hn.a();
    private final IntList p = new IntArrayList();
    private cfz q = cfz.b;
    private int r;
    @Nullable
    private final cck<?> s;
    public final int j;
    private int t = -1;
    private int u;
    private final Set<ccx> v = Sets.newHashSet();
    private final List<cbr> w = Lists.newArrayList();
    @Nullable
    private cbs x;
    private boolean y;

    protected cbf(@Nullable cck<?> $$0, int $$1) {
        this.s = $$0;
        this.j = $$1;
    }

    protected static boolean a(cbq $$0, byo $$1, cpn $$22) {
        return $$0.a((cmm $$2, gu $$3) -> {
            if (!$$2.a_((gu)$$3).a($$22)) {
                return false;
            }
            return $$1.i((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0;
        }, true);
    }

    public cck<?> a() {
        if (this.s == null) {
            throw new UnsupportedOperationException("Unable to construct this menu by type");
        }
        return this.s;
    }

    protected static void a(bdq $$0, int $$1) {
        int $$2 = $$0.b();
        if ($$2 < $$1) {
            throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
        }
    }

    protected static void a(cbp $$0, int $$1) {
        int $$2 = $$0.a();
        if ($$2 < $$1) {
            throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
        }
    }

    public boolean a(int $$0) {
        return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
    }

    protected ccx a(ccx $$0) {
        $$0.e = this.i.size();
        this.i.add($$0);
        this.l.add(cfz.b);
        this.o.add(cfz.b);
        return $$0;
    }

    protected cbv a(cbv $$0) {
        this.m.add($$0);
        this.p.add(0);
        return $$0;
    }

    protected void a(cbp $$0) {
        for (int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            this.a(cbv.a($$0, $$1));
        }
    }

    public void a(cbr $$0) {
        if (this.w.contains($$0)) {
            return;
        }
        this.w.add($$0);
        this.d();
    }

    public void a(cbs $$0) {
        this.x = $$0;
        this.b();
    }

    public void b() {
        int $$1 = this.i.size();
        for (int $$0 = 0; $$0 < $$1; ++$$0) {
            this.o.set($$0, this.i.get($$0).e().p());
        }
        this.q = this.g().p();
        int $$3 = this.m.size();
        for (int $$2 = 0; $$2 < $$3; ++$$2) {
            this.p.set($$2, this.m.get($$2).b());
        }
        if (this.x != null) {
            this.x.a(this, this.o, this.q, this.p.toIntArray());
        }
    }

    public void b(cbr $$0) {
        this.w.remove($$0);
    }

    public hn<cfz> c() {
        hn<cfz> $$0 = hn.a();
        for (ccx $$1 : this.i) {
            $$0.add($$1.e());
        }
        return $$0;
    }

    public void d() {
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            cfz $$1 = this.i.get($$0).e();
            com.google.common.base.Supplier $$2 = Suppliers.memoize($$1::p);
            this.a($$0, $$1, (Supplier<cfz>)$$2);
            this.b($$0, $$1, (Supplier<cfz>)$$2);
        }
        this.l();
        for (int $$3 = 0; $$3 < this.m.size(); ++$$3) {
            cbv $$4 = this.m.get($$3);
            int $$5 = $$4.b();
            if ($$4.c()) {
                this.c($$3, $$5);
            }
            this.d($$3, $$5);
        }
    }

    public void e() {
        for (int $$0 = 0; $$0 < this.i.size(); ++$$0) {
            cfz $$1 = this.i.get($$0).e();
            this.a($$0, $$1, $$1::p);
        }
        for (int $$2 = 0; $$2 < this.m.size(); ++$$2) {
            cbv $$3 = this.m.get($$2);
            if (!$$3.c()) continue;
            this.c($$2, $$3.b());
        }
        this.b();
    }

    private void c(int $$0, int $$1) {
        for (cbr $$2 : this.w) {
            $$2.a(this, $$0, $$1);
        }
    }

    private void a(int $$0, cfz $$1, Supplier<cfz> $$2) {
        cfz $$3 = this.l.get($$0);
        if (!cfz.a($$3, $$1)) {
            cfz $$4 = $$2.get();
            this.l.set($$0, $$4);
            for (cbr $$5 : this.w) {
                $$5.a(this, $$0, $$4);
            }
        }
    }

    private void b(int $$0, cfz $$1, Supplier<cfz> $$2) {
        if (this.y) {
            return;
        }
        cfz $$3 = this.o.get($$0);
        if (!cfz.a($$3, $$1)) {
            cfz $$4 = $$2.get();
            this.o.set($$0, $$4);
            if (this.x != null) {
                this.x.a(this, $$0, $$4);
            }
        }
    }

    private void d(int $$0, int $$1) {
        if (this.y) {
            return;
        }
        int $$2 = this.p.getInt($$0);
        if ($$2 != $$1) {
            this.p.set($$0, $$1);
            if (this.x != null) {
                this.x.a(this, $$0, $$1);
            }
        }
    }

    private void l() {
        if (this.y) {
            return;
        }
        if (!cfz.a(this.g(), this.q)) {
            this.q = this.g().p();
            if (this.x != null) {
                this.x.a(this, this.q);
            }
        }
    }

    public void a(int $$0, cfz $$1) {
        this.o.set($$0, $$1.p());
    }

    public void b(int $$0, cfz $$1) {
        if ($$0 < 0 || $$0 >= this.o.size()) {
            k.debug("Incorrect slot index: {} available slots: {}", (Object)$$0, (Object)this.o.size());
            return;
        }
        this.o.set($$0, $$1);
    }

    public void a(cfz $$0) {
        this.q = $$0.p();
    }

    public boolean b(byo $$0, int $$1) {
        return false;
    }

    public ccx b(int $$0) {
        return this.i.get($$0);
    }

    public abstract cfz a(byo var1, int var2);

    public void a(int $$0, int $$1, cbo $$2, byo $$3) {
        try {
            this.b($$0, $$1, $$2, $$3);
        }
        catch (Exception $$4) {
            o $$5 = o.a($$4, "Container click");
            p $$6 = $$5.a("Click info");
            $$6.a("Menu Type", () -> this.s != null ? jb.s.b(this.s).toString() : "<no type>");
            $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
            $$6.a("Slot Count", this.i.size());
            $$6.a("Slot", $$0);
            $$6.a("Button", $$1);
            $$6.a("Type", (Object)$$2);
            throw new y($$5);
        }
    }

    private void b(int $$0, int $$1, cbo $$22, byo $$32) {
        block39: {
            block50: {
                block46: {
                    cfz $$29;
                    cfz $$28;
                    ccx $$27;
                    byn $$4;
                    block49: {
                        block48: {
                            block47: {
                                block44: {
                                    cbn $$16;
                                    block45: {
                                        block43: {
                                            block37: {
                                                block42: {
                                                    cfz $$7;
                                                    block41: {
                                                        block40: {
                                                            block38: {
                                                                $$4 = $$32.fN();
                                                                if ($$22 != cbo.f) break block37;
                                                                int $$5 = this.u;
                                                                this.u = cbf.d($$1);
                                                                if ($$5 == 1 && this.u == 2 || $$5 == this.u) break block38;
                                                                this.f();
                                                                break block39;
                                                            }
                                                            if (!this.g().b()) break block40;
                                                            this.f();
                                                            break block39;
                                                        }
                                                        if (this.u != 0) break block41;
                                                        this.t = cbf.c($$1);
                                                        if (cbf.a(this.t, $$32)) {
                                                            this.u = 1;
                                                            this.v.clear();
                                                        } else {
                                                            this.f();
                                                        }
                                                        break block39;
                                                    }
                                                    if (this.u != 1) break block42;
                                                    ccx $$6 = this.i.get($$0);
                                                    if (!cbf.a($$6, $$7 = this.g(), true) || !$$6.a($$7) || this.t != 2 && $$7.L() <= this.v.size() || !this.b($$6)) break block39;
                                                    this.v.add($$6);
                                                    break block39;
                                                }
                                                if (this.u == 2) {
                                                    if (!this.v.isEmpty()) {
                                                        if (this.v.size() == 1) {
                                                            int $$8 = this.v.iterator().next().e;
                                                            this.f();
                                                            this.b($$8, this.t, cbo.a, $$32);
                                                            return;
                                                        }
                                                        cfz $$9 = this.g().p();
                                                        if ($$9.b()) {
                                                            this.f();
                                                            return;
                                                        }
                                                        int $$10 = this.g().L();
                                                        for (ccx $$11 : this.v) {
                                                            cfz $$12 = this.g();
                                                            if ($$11 == null || !cbf.a($$11, $$12, true) || !$$11.a($$12) || this.t != 2 && $$12.L() < this.v.size() || !this.b($$11)) continue;
                                                            int $$13 = $$11.f() ? $$11.e().L() : 0;
                                                            int $$14 = Math.min($$9.g(), $$11.a_($$9));
                                                            int $$15 = Math.min(cbf.a(this.v, this.t, $$9) + $$13, $$14);
                                                            $$10 -= $$15 - $$13;
                                                            $$11.d($$9.c($$15));
                                                        }
                                                        $$9.f($$10);
                                                        this.b($$9);
                                                    }
                                                    this.f();
                                                } else {
                                                    this.f();
                                                }
                                                break block39;
                                            }
                                            if (this.u == 0) break block43;
                                            this.f();
                                            break block39;
                                        }
                                        if ($$22 != cbo.a && $$22 != cbo.b || $$1 != 0 && $$1 != 1) break block44;
                                        cbn cbn2 = $$16 = $$1 == 0 ? cbn.a : cbn.b;
                                        if ($$0 != -999) break block45;
                                        if (this.g().b()) break block39;
                                        if ($$16 == cbn.a) {
                                            $$32.a(this.g(), true);
                                            this.b(cfz.b);
                                        } else {
                                            $$32.a(this.g().a(1), true);
                                        }
                                        break block39;
                                    }
                                    if ($$22 == cbo.b) {
                                        if ($$0 < 0) {
                                            return;
                                        }
                                        ccx $$17 = this.i.get($$0);
                                        if (!$$17.a($$32)) {
                                            return;
                                        }
                                        cfz $$18 = this.a($$32, $$0);
                                        while (!$$18.b() && cfz.b($$17.e(), $$18)) {
                                            $$18 = this.a($$32, $$0);
                                        }
                                    } else {
                                        if ($$0 < 0) {
                                            return;
                                        }
                                        ccx $$19 = this.i.get($$0);
                                        cfz $$20 = $$19.e();
                                        cfz $$21 = this.g();
                                        $$32.a($$21, $$19.e(), $$16);
                                        if (!this.a($$32, $$16, $$19, $$20, $$21)) {
                                            if ($$20.b()) {
                                                if (!$$21.b()) {
                                                    int $$222 = $$16 == cbn.a ? $$21.L() : 1;
                                                    this.b($$19.b($$21, $$222));
                                                }
                                            } else if ($$19.a($$32)) {
                                                if ($$21.b()) {
                                                    int $$23 = $$16 == cbn.a ? $$20.L() : ($$20.L() + 1) / 2;
                                                    Optional<cfz> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$32);
                                                    $$24.ifPresent($$2 -> {
                                                        this.b((cfz)$$2);
                                                        $$19.a($$32, (cfz)$$2);
                                                    });
                                                } else if ($$19.a($$21)) {
                                                    if (cfz.c($$20, $$21)) {
                                                        int $$25 = $$16 == cbn.a ? $$21.L() : 1;
                                                        this.b($$19.b($$21, $$25));
                                                    } else if ($$21.L() <= $$19.a_($$21)) {
                                                        this.b($$20);
                                                        $$19.d($$21);
                                                    }
                                                } else if (cfz.c($$20, $$21)) {
                                                    Optional<cfz> $$26 = $$19.a($$20.L(), $$21.g() - $$21.L(), $$32);
                                                    $$26.ifPresent($$3 -> {
                                                        $$21.g($$3.L());
                                                        $$19.a($$32, (cfz)$$3);
                                                    });
                                                }
                                            }
                                        }
                                        $$19.d();
                                    }
                                    break block39;
                                }
                                if ($$22 != cbo.c) break block46;
                                $$27 = this.i.get($$0);
                                $$28 = $$4.a($$1);
                                $$29 = $$27.e();
                                if ($$28.b() && $$29.b()) break block39;
                                if (!$$28.b()) break block47;
                                if (!$$27.a($$32)) break block39;
                                $$4.a($$1, $$29);
                                $$27.b($$29.L());
                                $$27.d(cfz.b);
                                $$27.a($$32, $$29);
                                break block39;
                            }
                            if (!$$29.b()) break block48;
                            if (!$$27.a($$28)) break block39;
                            int $$30 = $$27.a_($$28);
                            if ($$28.L() > $$30) {
                                $$27.d($$28.a($$30));
                            } else {
                                $$4.a($$1, cfz.b);
                                $$27.d($$28);
                            }
                            break block39;
                        }
                        if (!$$27.a($$32) || !$$27.a($$28)) break block39;
                        int $$31 = $$27.a_($$28);
                        if ($$28.L() <= $$31) break block49;
                        $$27.d($$28.a($$31));
                        $$27.a($$32, $$29);
                        if ($$4.e($$29)) break block39;
                        $$32.a($$29, true);
                        break block39;
                    }
                    $$4.a($$1, $$29);
                    $$27.d($$28);
                    $$27.a($$32, $$29);
                    break block39;
                }
                if ($$22 != cbo.d || !$$32.fO().d || !this.g().b() || $$0 < 0) break block50;
                ccx $$322 = this.i.get($$0);
                if (!$$322.f()) break block39;
                cfz $$33 = $$322.e();
                this.b($$33.c($$33.g()));
                break block39;
            }
            if ($$22 == cbo.e && this.g().b() && $$0 >= 0) {
                ccx $$34 = this.i.get($$0);
                int $$35 = $$1 == 0 ? 1 : $$34.e().L();
                cfz $$36 = $$34.b($$35, Integer.MAX_VALUE, $$32);
                $$32.a($$36, true);
            } else if ($$22 == cbo.g && $$0 >= 0) {
                ccx $$37 = this.i.get($$0);
                cfz $$38 = this.g();
                if (!($$38.b() || $$37.f() && $$37.a($$32))) {
                    int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
                    int $$40 = $$1 == 0 ? 1 : -1;
                    for (int $$41 = 0; $$41 < 2; ++$$41) {
                        for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.L() < $$38.g(); $$42 += $$40) {
                            ccx $$43 = this.i.get($$42);
                            if (!$$43.f() || !cbf.a($$43, $$38, true) || !$$43.a($$32) || !this.a($$38, $$43)) continue;
                            cfz $$44 = $$43.e();
                            if ($$41 == 0 && $$44.L() == $$44.g()) continue;
                            cfz $$45 = $$43.b($$44.L(), $$38.g() - $$38.L(), $$32);
                            $$38.g($$45.L());
                        }
                    }
                }
            }
        }
    }

    private boolean a(byo $$0, cbn $$1, ccx $$2, cfz $$3, cfz $$4) {
        caw $$5 = $$0.dI().G();
        if ($$4.a($$5) && $$4.a($$2, $$1, $$0)) {
            return true;
        }
        return $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
    }

    private bgs m() {
        return new bgs(){

            @Override
            public cfz a() {
                return cbf.this.g();
            }

            @Override
            public boolean a(cfz $$0) {
                cbf.this.b($$0);
                return true;
            }
        };
    }

    public boolean a(cfz $$0, ccx $$1) {
        return true;
    }

    public void b(byo $$0) {
        cfz $$1;
        if ($$0 instanceof aig && !($$1 = this.g()).b()) {
            if (!$$0.bs() || ((aig)$$0).t()) {
                $$0.a($$1, false);
            } else {
                $$0.fN().f($$1);
            }
            this.b(cfz.b);
        }
    }

    protected void a(byo $$0, bdq $$1) {
        if (!$$0.bs() || $$0 instanceof aig && ((aig)$$0).t()) {
            for (int $$2 = 0; $$2 < $$1.b(); ++$$2) {
                $$0.a($$1.b($$2), false);
            }
            return;
        }
        for (int $$3 = 0; $$3 < $$1.b(); ++$$3) {
            byn $$4 = $$0.fN();
            if (!($$4.m instanceof aig)) continue;
            $$4.f($$1.b($$3));
        }
    }

    public void a(bdq $$0) {
        this.d();
    }

    public void a(int $$0, int $$1, cfz $$2) {
        this.b($$0).e($$2);
        this.r = $$1;
    }

    public void a(int $$0, List<cfz> $$1, cfz $$2) {
        for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
            this.b($$3).e($$1.get($$3));
        }
        this.n = $$2;
        this.r = $$0;
    }

    public void a(int $$0, int $$1) {
        this.m.get($$0).a($$1);
    }

    public abstract boolean a(byo var1);

    protected boolean a(cfz $$0, int $$1, int $$2, boolean $$3) {
        boolean $$4 = false;
        int $$5 = $$1;
        if ($$3) {
            $$5 = $$2 - 1;
        }
        if ($$0.h()) {
            while (!$$0.b() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
                ccx $$6 = this.i.get($$5);
                cfz $$7 = $$6.e();
                if (!$$7.b() && cfz.c($$0, $$7)) {
                    int $$8 = $$7.L() + $$0.L();
                    if ($$8 <= $$0.g()) {
                        $$0.f(0);
                        $$7.f($$8);
                        $$6.d();
                        $$4 = true;
                    } else if ($$7.L() < $$0.g()) {
                        $$0.h($$0.g() - $$7.L());
                        $$7.f($$0.g());
                        $$6.d();
                        $$4 = true;
                    }
                }
                if ($$3) {
                    --$$5;
                    continue;
                }
                ++$$5;
            }
        }
        if (!$$0.b()) {
            $$5 = $$3 ? $$2 - 1 : $$1;
            while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
                ccx $$9 = this.i.get($$5);
                cfz $$10 = $$9.e();
                if ($$10.b() && $$9.a($$0)) {
                    if ($$0.L() > $$9.a()) {
                        $$9.d($$0.a($$9.a()));
                    } else {
                        $$9.d($$0.a($$0.L()));
                    }
                    $$9.d();
                    $$4 = true;
                    break;
                }
                if ($$3) {
                    --$$5;
                    continue;
                }
                ++$$5;
            }
        }
        return $$4;
    }

    public static int c(int $$0) {
        return $$0 >> 2 & 3;
    }

    public static int d(int $$0) {
        return $$0 & 3;
    }

    public static int b(int $$0, int $$1) {
        return $$0 & 3 | ($$1 & 3) << 2;
    }

    public static boolean a(int $$0, byo $$1) {
        if ($$0 == 0) {
            return true;
        }
        if ($$0 == 1) {
            return true;
        }
        return $$0 == 2 && $$1.fO().d;
    }

    protected void f() {
        this.u = 0;
        this.v.clear();
    }

    public static boolean a(@Nullable ccx $$0, cfz $$1, boolean $$2) {
        boolean $$3;
        boolean bl2 = $$3 = $$0 == null || !$$0.f();
        if (!$$3 && cfz.c($$1, $$0.e())) {
            return $$0.e().L() + ($$2 ? 0 : $$1.L()) <= $$1.g();
        }
        return $$3;
    }

    public static int a(Set<ccx> $$0, int $$1, cfz $$2) {
        return switch ($$1) {
            case 0 -> apa.d((float)$$2.L() / (float)$$0.size());
            case 1 -> 1;
            case 2 -> $$2.d().l();
            default -> $$2.L();
        };
    }

    public boolean b(ccx $$0) {
        return true;
    }

    public static int a(@Nullable czn $$0) {
        if ($$0 instanceof bdq) {
            return cbf.b((bdq)((Object)$$0));
        }
        return 0;
    }

    public static int b(@Nullable bdq $$0) {
        if ($$0 == null) {
            return 0;
        }
        int $$1 = 0;
        float $$2 = 0.0f;
        for (int $$3 = 0; $$3 < $$0.b(); ++$$3) {
            cfz $$4 = $$0.a($$3);
            if ($$4.b()) continue;
            $$2 += (float)$$4.L() / (float)Math.min($$0.ac_(), $$4.g());
            ++$$1;
        }
        return apa.d(($$2 /= (float)$$0.b()) * 14.0f) + ($$1 > 0 ? 1 : 0);
    }

    public void b(cfz $$0) {
        this.n = $$0;
    }

    public cfz g() {
        return this.n;
    }

    public void h() {
        this.y = true;
    }

    public void i() {
        this.y = false;
    }

    public void a(cbf $$0) {
        HashBasedTable $$1 = HashBasedTable.create();
        for (int $$2 = 0; $$2 < $$0.i.size(); ++$$2) {
            ccx $$3 = $$0.i.get($$2);
            $$1.put((Object)$$3.d, (Object)$$3.g(), (Object)$$2);
        }
        for (int $$4 = 0; $$4 < this.i.size(); ++$$4) {
            ccx $$5 = this.i.get($$4);
            Integer $$6 = (Integer)$$1.get((Object)$$5.d, (Object)$$5.g());
            if ($$6 == null) continue;
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
        }
    }

    public OptionalInt b(bdq $$0, int $$1) {
        for (int $$2 = 0; $$2 < this.i.size(); ++$$2) {
            ccx $$3 = this.i.get($$2);
            if ($$3.d != $$0 || $$1 != $$3.g()) continue;
            return OptionalInt.of($$2);
        }
        return OptionalInt.empty();
    }

    public int j() {
        return this.r;
    }

    public int k() {
        this.r = this.r + 1 & Short.MAX_VALUE;
        return this.r;
    }
}

