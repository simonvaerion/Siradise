/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbh
extends ccf {
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    private static final Logger s = LogUtils.getLogger();
    private static final boolean t = false;
    public static final int n = 50;
    private int u;
    @Nullable
    private String v;
    private final cbv w = cbv.a();
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 1;
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 1;
    private static final int D = 1;
    private static final int E = 27;
    private static final int F = 76;
    private static final int G = 134;
    private static final int H = 47;

    public cbh(int $$0, byn $$1) {
        this($$0, $$1, cbq.a);
    }

    public cbh(int $$0, byn $$1, cbq $$2) {
        super(cck.h, $$0, $$1, $$2);
        this.a(this.w);
    }

    @Override
    protected ccg l() {
        return ccg.a().a(0, 27, 47, (cfz $$0) -> true).a(1, 76, 47, (cfz $$0) -> true).a(2, 134, 47).a();
    }

    @Override
    protected boolean a(dcb $$0) {
        return $$0.a(amw.M);
    }

    @Override
    protected boolean a(byo $$0, boolean $$1) {
        return ($$0.fO().d || $$0.ce >= this.w.b()) && this.w.b() > 0;
    }

    @Override
    protected void a(byo $$0, cfz $$12) {
        if (!$$0.fO().d) {
            $$0.c(-this.w.b());
        }
        this.q.a(0, cfz.b);
        if (this.u > 0) {
            cfz $$22 = this.q.a(1);
            if (!$$22.b() && $$22.L() > this.u) {
                $$22.h(this.u);
                this.q.a(1, $$22);
            } else {
                this.q.a(1, cfz.b);
            }
        } else {
            this.q.a(1, cfz.b);
        }
        this.w.a(0);
        this.o.a((cmm $$1, gu $$2) -> {
            dcb $$3 = $$1.a_((gu)$$2);
            if (!$$0.fO().d && $$3.a(amw.M) && $$0.ec().i() < 0.12f) {
                dcb $$4 = coo.e($$3);
                if ($$4 == null) {
                    $$1.a((gu)$$2, false);
                    $$1.c(1029, (gu)$$2, 0);
                } else {
                    $$1.a((gu)$$2, $$4, 2);
                    $$1.c(1030, (gu)$$2, 0);
                }
            } else {
                $$1.c(1030, (gu)$$2, 0);
            }
        });
    }

    @Override
    public void m() {
        cfz $$0 = this.q.a(0);
        this.w.a(1);
        int $$1 = 0;
        int $$2 = 0;
        int $$3 = 0;
        if ($$0.b()) {
            this.r.a(0, cfz.b);
            this.w.a(0);
            return;
        }
        cfz $$4 = $$0.p();
        cfz $$5 = this.q.a(1);
        Map<ckg, Integer> $$6 = cki.a($$4);
        $$2 += $$0.I() + ($$5.b() ? 0 : $$5.I());
        this.u = 0;
        if (!$$5.b()) {
            boolean $$7;
            boolean bl2 = $$7 = $$5.a(cgc.tC) && !cev.d($$5).isEmpty();
            if ($$4.i() && $$4.d().a($$0, $$5)) {
                int $$9;
                int $$8 = Math.min($$4.k(), $$4.l() / 4);
                if ($$8 <= 0) {
                    this.r.a(0, cfz.b);
                    this.w.a(0);
                    return;
                }
                for ($$9 = 0; $$8 > 0 && $$9 < $$5.L(); ++$$9) {
                    int $$10 = $$4.k() - $$8;
                    $$4.b($$10);
                    ++$$1;
                    $$8 = Math.min($$4.k(), $$4.l() / 4);
                }
                this.u = $$9;
            } else {
                if (!($$7 || $$4.a($$5.d()) && $$4.i())) {
                    this.r.a(0, cfz.b);
                    this.w.a(0);
                    return;
                }
                if ($$4.i() && !$$7) {
                    int $$11 = $$0.l() - $$0.k();
                    int $$12 = $$5.l() - $$5.k();
                    int $$13 = $$12 + $$4.l() * 12 / 100;
                    int $$14 = $$11 + $$13;
                    int $$15 = $$4.l() - $$14;
                    if ($$15 < 0) {
                        $$15 = 0;
                    }
                    if ($$15 < $$4.k()) {
                        $$4.b($$15);
                        $$1 += 2;
                    }
                }
                Map<ckg, Integer> $$16 = cki.a($$5);
                boolean $$17 = false;
                boolean $$18 = false;
                for (ckg $$19 : $$16.keySet()) {
                    int $$21;
                    if ($$19 == null) continue;
                    int $$20 = $$6.getOrDefault($$19, 0);
                    $$21 = $$20 == ($$21 = $$16.get($$19).intValue()) ? $$21 + 1 : Math.max($$21, $$20);
                    boolean $$22 = $$19.a($$0);
                    if (this.p.fO().d || $$0.a(cgc.tC)) {
                        $$22 = true;
                    }
                    for (ckg $$23 : $$6.keySet()) {
                        if ($$23 == $$19 || $$19.b($$23)) continue;
                        $$22 = false;
                        ++$$1;
                    }
                    if (!$$22) {
                        $$18 = true;
                        continue;
                    }
                    $$17 = true;
                    if ($$21 > $$19.a()) {
                        $$21 = $$19.a();
                    }
                    $$6.put($$19, $$21);
                    int $$24 = 0;
                    switch ($$19.d()) {
                        case a: {
                            $$24 = 1;
                            break;
                        }
                        case b: {
                            $$24 = 2;
                            break;
                        }
                        case c: {
                            $$24 = 4;
                            break;
                        }
                        case d: {
                            $$24 = 8;
                        }
                    }
                    if ($$7) {
                        $$24 = Math.max(1, $$24 / 2);
                    }
                    $$1 += $$24 * $$21;
                    if ($$0.L() <= 1) continue;
                    $$1 = 40;
                }
                if ($$18 && !$$17) {
                    this.r.a(0, cfz.b);
                    this.w.a(0);
                    return;
                }
            }
        }
        if (this.v == null || ac.b(this.v)) {
            if ($$0.A()) {
                $$3 = 1;
                $$1 += $$3;
                $$4.z();
            }
        } else if (!this.v.equals($$0.y().getString())) {
            $$3 = 1;
            $$1 += $$3;
            $$4.a(sw.b(this.v));
        }
        this.w.a($$2 + $$1);
        if ($$1 <= 0) {
            $$4 = cfz.b;
        }
        if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
        }
        if (this.w.b() >= 40 && !this.p.fO().d) {
            $$4 = cfz.b;
        }
        if (!$$4.b()) {
            int $$25 = $$4.I();
            if (!$$5.b() && $$25 < $$5.I()) {
                $$25 = $$5.I();
            }
            if ($$3 != $$1 || $$3 == 0) {
                $$25 = cbh.e($$25);
            }
            $$4.d($$25);
            cki.a($$6, $$4);
        }
        this.r.a(0, $$4);
        this.d();
    }

    public static int e(int $$0) {
        return $$0 * 2 + 1;
    }

    public boolean a(String $$0) {
        String $$1 = cbh.b($$0);
        if ($$1 == null || $$1.equals(this.v)) {
            return false;
        }
        this.v = $$1;
        if (this.b(2).f()) {
            cfz $$2 = this.b(2).e();
            if (ac.b($$1)) {
                $$2.z();
            } else {
                $$2.a(sw.b($$1));
            }
        }
        this.m();
        return true;
    }

    @Nullable
    private static String b(String $$0) {
        String $$1 = aa.a($$0);
        if ($$1.length() <= 50) {
            return $$1;
        }
        return null;
    }

    public int n() {
        return this.w.b();
    }
}

