/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ewd
extends ewg<b> {
    private static final acq w = new acq("textures/gui/container/creative_inventory/tabs.png");
    private static final String x = "textures/gui/container/creative_inventory/tab_";
    private static final String y = "CustomCreativeLock";
    private static final int z = 5;
    private static final int A = 9;
    private static final int C = 26;
    private static final int D = 32;
    private static final int E = 12;
    private static final int F = 15;
    static final bee G = new bee(45);
    private static final sw H = sw.c("inventory.binSlot");
    private static final int I = 0xFFFFFF;
    private static cef J = ceg.b();
    private float K;
    private boolean L;
    private epr M;
    @Nullable
    private List<ccx> N;
    @Nullable
    private ccx O;
    private ewc P;
    private boolean Q;
    private boolean R;
    private final Set<anl<cfu>> S = new HashSet<anl<cfu>>();
    private final boolean T;

    public ewd(byo $$0, caw $$1, boolean $$2) {
        super(new b($$0), $$0.fN(), sv.a);
        $$0.bR = this.p;
        this.k = 136;
        this.c = 195;
        this.T = $$2;
        ceg.a($$1, this.a($$0), $$0.dI().B_());
    }

    private boolean a(byo $$0) {
        return $$0.gk() && this.T;
    }

    private void a(caw $$0, boolean $$1, hg.b $$2) {
        if (ceg.a($$0, $$1, $$2)) {
            for (cef $$3 : ceg.d()) {
                Collection<cfz> $$4 = $$3.l();
                if ($$3 != J) continue;
                if ($$3.k() == cef.h.a && $$4.isEmpty()) {
                    this.a(ceg.b());
                    continue;
                }
                this.a($$4);
            }
        }
    }

    private void a(Collection<cfz> $$0) {
        int $$1 = ((b)this.p).a(this.K);
        ((b)this.p).k.clear();
        if (J.k() == cef.h.d) {
            this.E();
        } else {
            ((b)this.p).k.addAll($$0);
        }
        this.K = ((b)this.p).e($$1);
        ((b)this.p).b(this.K);
    }

    @Override
    public void B() {
        super.B();
        if (this.f == null) {
            return;
        }
        if (this.f.t != null) {
            this.a(this.f.t.cl.t(), this.a(this.f.t), this.f.t.dI().B_());
        }
        if (!this.f.r.g()) {
            this.f.a(new ewo(this.f.t));
        } else {
            this.M.a();
        }
    }

    @Override
    protected void a(@Nullable ccx $$0, int $$1, int $$2, cbo $$3) {
        if (this.a($$0)) {
            this.M.g();
            this.M.p(0);
        }
        boolean $$4 = $$3 == cbo.b;
        cbo cbo2 = $$3 = $$1 == -999 && $$3 == cbo.a ? cbo.e : $$3;
        if ($$0 != null || J.k() == cef.h.b || $$3 == cbo.f) {
            if ($$0 != null && !$$0.a(this.f.t)) {
                return;
            }
            if ($$0 == this.O && $$4) {
                for (int $$5 = 0; $$5 < this.f.t.bQ.c().size(); ++$$5) {
                    this.f.r.a(cfz.b, $$5);
                }
            } else if (J.k() == cef.h.b) {
                if ($$0 == this.O) {
                    ((b)this.p).b(cfz.b);
                } else if ($$3 == cbo.e && $$0 != null && $$0.f()) {
                    cfz $$6 = $$0.a($$2 == 0 ? 1 : $$0.e().g());
                    cfz $$7 = $$0.e();
                    this.f.t.a($$6, true);
                    this.f.r.a($$6);
                    this.f.r.a($$7, ((c)$$0).a.e);
                } else if ($$3 == cbo.e && !((b)this.p).g().b()) {
                    this.f.t.a(((b)this.p).g(), true);
                    this.f.r.a(((b)this.p).g());
                    ((b)this.p).b(cfz.b);
                } else {
                    this.f.t.bQ.a($$0 == null ? $$1 : ((c)$$0).a.e, $$2, $$3, this.f.t);
                    this.f.t.bQ.d();
                }
            } else if ($$3 != cbo.f && $$0.d == G) {
                cfz $$8 = ((b)this.p).g();
                cfz $$9 = $$0.e();
                if ($$3 == cbo.c) {
                    if (!$$9.b()) {
                        this.f.t.fN().a($$2, $$9.c($$9.g()));
                        this.f.t.bQ.d();
                    }
                    return;
                }
                if ($$3 == cbo.d) {
                    if (((b)this.p).g().b() && $$0.f()) {
                        cfz $$10 = $$0.e();
                        ((b)this.p).b($$10.c($$10.g()));
                    }
                    return;
                }
                if ($$3 == cbo.e) {
                    if (!$$9.b()) {
                        cfz $$11 = $$9.c($$2 == 0 ? 1 : $$9.g());
                        this.f.t.a($$11, true);
                        this.f.r.a($$11);
                    }
                    return;
                }
                if (!$$8.b() && !$$9.b() && cfz.c($$8, $$9)) {
                    if ($$2 == 0) {
                        if ($$4) {
                            $$8.f($$8.g());
                        } else if ($$8.L() < $$8.g()) {
                            $$8.g(1);
                        }
                    } else {
                        $$8.h(1);
                    }
                } else if ($$9.b() || !$$8.b()) {
                    if ($$2 == 0) {
                        ((b)this.p).b(cfz.b);
                    } else if (!((b)this.p).g().b()) {
                        ((b)this.p).g().h(1);
                    }
                } else {
                    int $$12 = $$4 ? $$9.g() : $$9.L();
                    ((b)this.p).b($$9.c($$12));
                }
            } else if (this.p != null) {
                cfz $$13 = $$0 == null ? cfz.b : ((b)this.p).b($$0.e).e();
                ((b)this.p).a($$0 == null ? $$1 : $$0.e, $$2, $$3, this.f.t);
                if (cbf.d($$2) == 2) {
                    for (int $$14 = 0; $$14 < 9; ++$$14) {
                        this.f.r.a(((b)this.p).b(45 + $$14).e(), 36 + $$14);
                    }
                } else if ($$0 != null) {
                    cfz $$15 = ((b)this.p).b($$0.e).e();
                    this.f.r.a($$15, $$0.e - ((b)this.p).i.size() + 9 + 36);
                    int $$16 = 45 + $$2;
                    if ($$3 == cbo.c) {
                        this.f.r.a($$13, $$16 - ((b)this.p).i.size() + 9 + 36);
                    } else if ($$3 == cbo.e && !$$13.b()) {
                        cfz $$17 = $$13.c($$2 == 0 ? 1 : $$13.g());
                        this.f.t.a($$17, true);
                        this.f.r.a($$17);
                    }
                    this.f.t.bQ.d();
                }
            }
        } else if (!((b)this.p).g().b() && this.R) {
            if ($$2 == 0) {
                this.f.t.a(((b)this.p).g(), true);
                this.f.r.a(((b)this.p).g());
                ((b)this.p).b(cfz.b);
            }
            if ($$2 == 1) {
                cfz $$18 = ((b)this.p).g().a(1);
                this.f.t.a($$18, true);
                this.f.r.a($$18);
            }
        }
    }

    private boolean a(@Nullable ccx $$0) {
        return $$0 != null && $$0.d == G;
    }

    @Override
    protected void b() {
        if (this.f.r.g()) {
            super.b();
            this.M = new epr(this.i, this.s + 82, this.t + 6, 80, this.i.b, sw.c("itemGroup.search"));
            this.M.m(50);
            this.M.b(false);
            this.M.e(false);
            this.M.n(0xFFFFFF);
            this.e(this.M);
            cef $$0 = J;
            J = ceg.b();
            this.a($$0);
            this.f.t.bQ.b(this.P);
            this.P = new ewc(this.f);
            this.f.t.bQ.a(this.P);
            if (!J.i()) {
                this.a(ceg.b());
            }
        } else {
            this.f.a(new ewo(this.f.t));
        }
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        int $$3 = ((b)this.p).a(this.K);
        String $$4 = this.M.b();
        this.b($$0, $$1, $$2);
        this.M.a($$4);
        if (!this.M.b().isEmpty()) {
            this.E();
        }
        this.K = ((b)this.p).e($$3);
        ((b)this.p).b(this.K);
    }

    @Override
    public void ax_() {
        super.ax_();
        if (this.f.t != null && this.f.t.fN() != null) {
            this.f.t.bQ.b(this.P);
        }
    }

    @Override
    public boolean a(char $$0, int $$1) {
        if (this.Q) {
            return false;
        }
        if (J.k() != cef.h.d) {
            return false;
        }
        String $$2 = this.M.b();
        if (this.M.a($$0, $$1)) {
            if (!Objects.equals($$2, this.M.b())) {
                this.E();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        this.Q = false;
        if (J.k() != cef.h.d) {
            if (this.f.m.K.a($$0, $$1)) {
                this.Q = true;
                this.a(ceg.e());
                return true;
            }
            return super.a($$0, $$1, $$2);
        }
        boolean $$3 = !this.a(this.r) || this.r.f();
        boolean $$4 = ehe.a($$0, $$1).e().isPresent();
        if ($$3 && $$4 && this.a($$0, $$1)) {
            this.Q = true;
            return true;
        }
        String $$5 = this.M.b();
        if (this.M.a($$0, $$1, $$2)) {
            if (!Objects.equals($$5, this.M.b())) {
                this.E();
            }
            return true;
        }
        if (this.M.aB_() && this.M.x() && $$0 != 256) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean b(int $$0, int $$1, int $$2) {
        this.Q = false;
        return super.b($$0, $$1, $$2);
    }

    private void E() {
        ((b)this.p).k.clear();
        this.S.clear();
        String $$0 = this.M.b();
        if ($$0.isEmpty()) {
            ((b)this.p).k.addAll(J.l());
        } else {
            fyl<cfz> $$2;
            if ($$0.startsWith("#")) {
                $$0 = $$0.substring(1);
                fyl<cfz> $$1 = this.f.a(fyk.b);
                this.a($$0);
            } else {
                $$2 = this.f.a(fyk.a);
            }
            ((b)this.p).k.addAll($$2.search($$0.toLowerCase(Locale.ROOT)));
        }
        this.K = 0.0f;
        ((b)this.p).b(0.0f);
    }

    private void a(String $$0) {
        Predicate<acq> $$5;
        int $$12 = $$0.indexOf(58);
        if ($$12 == -1) {
            Predicate<acq> $$22 = $$1 -> $$1.a().contains($$0);
        } else {
            String $$3 = $$0.substring(0, $$12).trim();
            String $$4 = $$0.substring($$12 + 1).trim();
            $$5 = $$2 -> $$2.b().contains($$3) && $$2.a().contains($$4);
        }
        jb.i.j().filter($$1 -> $$5.test($$1.b())).forEach(this.S::add);
    }

    @Override
    protected void b(eox $$0, int $$1, int $$2) {
        if (J.d()) {
            $$0.a(this.i, J.a(), 8, 6, 0x404040, false);
        }
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if ($$2 == 0) {
            double $$3 = $$0 - (double)this.s;
            double $$4 = $$1 - (double)this.t;
            for (cef $$5 : ceg.c()) {
                if (!this.a($$5, $$3, $$4)) continue;
                return true;
            }
            if (J.k() != cef.h.b && this.a($$0, $$1)) {
                this.L = this.G();
                return true;
            }
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean b(double $$0, double $$1, int $$2) {
        if ($$2 == 0) {
            double $$3 = $$0 - (double)this.s;
            double $$4 = $$1 - (double)this.t;
            this.L = false;
            for (cef $$5 : ceg.c()) {
                if (!this.a($$5, $$3, $$4)) continue;
                this.a($$5);
                return true;
            }
        }
        return super.b($$0, $$1, $$2);
    }

    private boolean G() {
        return J.e() && ((b)this.p).m();
    }

    private void a(cef $$0) {
        cef $$1 = J;
        J = $$0;
        this.u.clear();
        ((b)this.p).k.clear();
        this.l();
        if (J.k() == cef.h.c) {
            enj $$2 = this.f.aC();
            for (int $$3 = 0; $$3 < 9; ++$$3) {
                fja $$4 = $$2.a($$3);
                if ($$4.isEmpty()) {
                    for (int $$5 = 0; $$5 < 9; ++$$5) {
                        if ($$5 == $$3) {
                            cfz $$6 = new cfz(cgc.qa);
                            $$6.a(y);
                            sw $$7 = this.f.m.U[$$3].k();
                            sw $$8 = this.f.m.V.k();
                            $$6.a(sw.a("inventory.hotbarInfo", $$8, $$7));
                            ((b)this.p).k.add($$6);
                            continue;
                        }
                        ((b)this.p).k.add(cfz.b);
                    }
                    continue;
                }
                ((b)this.p).k.addAll((Collection<cfz>)((Object)$$4));
            }
        } else if (J.k() == cef.h.a) {
            ((b)this.p).k.addAll(J.l());
        }
        if (J.k() == cef.h.b) {
            cce $$9 = this.f.t.bQ;
            if (this.N == null) {
                this.N = ImmutableList.copyOf((Collection)((b)this.p).i);
            }
            ((b)this.p).i.clear();
            for (int $$10 = 0; $$10 < $$9.i.size(); ++$$10) {
                int $$25;
                int $$23;
                if ($$10 >= 5 && $$10 < 9) {
                    int $$11 = $$10 - 5;
                    int $$12 = $$11 / 2;
                    int $$13 = $$11 % 2;
                    int $$14 = 54 + $$12 * 54;
                    int $$15 = 6 + $$13 * 27;
                } else if ($$10 >= 0 && $$10 < 5) {
                    int $$16 = -2000;
                    int $$17 = -2000;
                } else if ($$10 == 45) {
                    int $$18 = 35;
                    int $$19 = 20;
                } else {
                    int $$20 = $$10 - 9;
                    int $$21 = $$20 % 9;
                    int $$22 = $$20 / 9;
                    $$23 = 9 + $$21 * 18;
                    if ($$10 >= 36) {
                        int $$24 = 112;
                    } else {
                        $$25 = 54 + $$22 * 18;
                    }
                }
                c $$26 = new c($$9.i.get($$10), $$10, $$23, $$25);
                ((b)this.p).i.add($$26);
            }
            this.O = new ccx(G, 0, 173, 112);
            ((b)this.p).i.add(this.O);
        } else if ($$1.k() == cef.h.b) {
            ((b)this.p).i.clear();
            ((b)this.p).i.addAll(this.N);
            this.N = null;
        }
        if (J.k() == cef.h.d) {
            this.M.e(true);
            this.M.d(false);
            this.M.b_(true);
            if ($$1 != $$0) {
                this.M.a("");
            }
            this.E();
        } else {
            this.M.e(false);
            this.M.d(true);
            this.M.b_(false);
            this.M.a("");
        }
        this.K = 0.0f;
        ((b)this.p).b(0.0f);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2) {
        if (!this.G()) {
            return false;
        }
        this.K = ((b)this.p).a(this.K, $$2);
        ((b)this.p).b(this.K);
        return true;
    }

    @Override
    protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
        boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
        this.R = $$5 && !this.a(J, $$0, $$1);
        return this.R;
    }

    protected boolean a(double $$0, double $$1) {
        int $$2 = this.s;
        int $$3 = this.t;
        int $$4 = $$2 + 175;
        int $$5 = $$3 + 18;
        int $$6 = $$4 + 14;
        int $$7 = $$5 + 112;
        return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
        if (this.L) {
            int $$5 = this.t + 18;
            int $$6 = $$5 + 112;
            this.K = ((float)$$1 - (float)$$5 - 7.5f) / ((float)($$6 - $$5) - 15.0f);
            this.K = apa.a(this.K, 0.0f, 1.0f);
            ((b)this.p).b(this.K);
            return true;
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        super.a($$0, $$1, $$2, $$3);
        for (cef $$4 : ceg.c()) {
            if (this.a($$0, $$4, $$1, $$2)) break;
        }
        if (this.O != null && J.k() == cef.h.b && this.a(this.O.f, this.O.g, 16, 16, $$1, $$2)) {
            $$0.a(this.i, H, $$1, $$2);
        }
        this.a($$0, $$1, $$2);
    }

    @Override
    public List<sw> a(cfz $$0) {
        boolean $$1 = this.r != null && this.r instanceof a;
        boolean $$22 = J.k() == cef.h.a;
        boolean $$3 = J.k() == cef.h.d;
        chq.a $$4 = this.f.m.m ? chq.a.b : chq.a.a;
        chq.a $$5 = $$1 ? $$4.c() : $$4;
        List<sw> $$6 = $$0.a(this.f.t, $$5);
        if (!$$22 || !$$1) {
            ArrayList $$7 = Lists.newArrayList($$6);
            if ($$3 && $$1) {
                this.S.forEach($$2 -> {
                    if ($$0.a((anl<cfu>)$$2)) {
                        $$7.add(1, sw.b("#" + $$2.b()).a(n.f));
                    }
                });
            }
            int $$8 = 1;
            for (cef $$9 : ceg.c()) {
                if ($$9.k() == cef.h.d || !$$9.a($$0)) continue;
                $$7.add($$8++, $$9.a().e().a(n.j));
            }
            return $$7;
        }
        return $$6;
    }

    @Override
    protected void a(eox $$0, float $$1, int $$2, int $$3) {
        for (cef $$4 : ceg.c()) {
            if ($$4 == J) continue;
            this.a($$0, $$4);
        }
        $$0.a(new acq(x + J.c()), this.s, this.t, 0, 0, this.c, this.k);
        this.M.a($$0, $$2, $$3, $$1);
        int $$5 = this.s + 175;
        int $$6 = this.t + 18;
        int $$7 = $$6 + 112;
        if (J.e()) {
            $$0.a(w, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.K), 232 + (this.G() ? 0 : 12), 0, 12, 15);
        }
        this.a($$0, J);
        if (J.k() == cef.h.b) {
            ewo.a($$0, this.s + 88, this.t + 45, 20, this.s + 88 - $$2, this.t + 45 - 30 - $$3, (bfz)this.f.t);
        }
    }

    private int b(cef $$0) {
        int $$1 = $$0.f();
        int $$2 = 27;
        int $$3 = 27 * $$1;
        if ($$0.j()) {
            $$3 = this.c - 27 * (7 - $$1) + 1;
        }
        return $$3;
    }

    private int c(cef $$0) {
        int $$1 = 0;
        $$1 = $$0.g() == cef.f.a ? ($$1 -= 32) : ($$1 += this.k);
        return $$1;
    }

    protected boolean a(cef $$0, double $$1, double $$2) {
        int $$3 = this.b($$0);
        int $$4 = this.c($$0);
        return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
    }

    protected boolean a(eox $$0, cef $$1, int $$2, int $$3) {
        int $$5;
        int $$4 = this.b($$1);
        if (this.a($$4 + 3, ($$5 = this.c($$1)) + 3, 21, 27, $$2, $$3)) {
            $$0.a(this.i, $$1.a(), $$2, $$3);
            return true;
        }
        return false;
    }

    protected void a(eox $$0, cef $$1) {
        boolean $$2 = $$1 == J;
        boolean $$3 = $$1.g() == cef.f.a;
        int $$4 = $$1.f();
        int $$5 = $$4 * 26;
        int $$6 = 0;
        int $$7 = this.s + this.b($$1);
        int $$8 = this.t;
        int $$9 = 32;
        if ($$2) {
            $$6 += 32;
        }
        if ($$3) {
            $$8 -= 28;
        } else {
            $$6 += 64;
            $$8 += this.k - 4;
        }
        $$0.a(w, $$7, $$8, $$5, $$6, 26, 32);
        $$0.c().a();
        $$0.c().a(0.0f, 0.0f, 100.0f);
        int n2 = $$3 ? 1 : -1;
        cfz $$10 = $$1.b();
        $$0.a($$10, $$7 += 5, $$8 += 8 + n2);
        $$0.a(this.i, $$10, $$7, $$8);
        $$0.c().b();
    }

    public boolean D() {
        return J.k() == cef.h.b;
    }

    public static void a(enn $$0, int $$1, boolean $$2, boolean $$3) {
        fiy $$4 = $$0.t;
        enj $$5 = $$0.aC();
        fja $$6 = $$5.a($$1);
        if ($$2) {
            for (int $$7 = 0; $$7 < byn.g(); ++$$7) {
                cfz $$8 = (cfz)$$6.get($$7);
                cfz $$9 = $$8.a($$4.dI().G()) ? $$8.p() : cfz.b;
                $$4.fN().a($$7, $$9);
                $$0.r.a($$9, 36 + $$7);
            }
            $$4.bQ.d();
        } else if ($$3) {
            for (int $$10 = 0; $$10 < byn.g(); ++$$10) {
                $$6.set($$10, $$4.fN().a($$10).p());
            }
            sw $$11 = $$0.m.U[$$1].k();
            sw $$12 = $$0.m.W.k();
            tj $$13 = sw.a("inventory.hotbarSaved", $$12, $$11);
            $$0.l.a($$13, false);
            $$0.aU().c($$13);
            $$5.a();
        }
    }

    public static class b
    extends cbf {
        public final hn<cfz> k = hn.a();
        private final cbf l;

        public b(byo $$0) {
            super(null, 0);
            this.l = $$0.bQ;
            byn $$1 = $$0.fN();
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                for (int $$3 = 0; $$3 < 9; ++$$3) {
                    this.a(new a(G, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
                }
            }
            for (int $$4 = 0; $$4 < 9; ++$$4) {
                this.a(new ccx($$1, $$4, 9 + $$4 * 18, 112));
            }
            this.b(0.0f);
        }

        @Override
        public boolean a(byo $$0) {
            return true;
        }

        protected int l() {
            return apa.e(this.k.size(), 9) - 5;
        }

        protected int a(float $$0) {
            return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
        }

        protected float e(int $$0) {
            return apa.a((float)$$0 / (float)this.l(), 0.0f, 1.0f);
        }

        protected float a(float $$0, double $$1) {
            return apa.a($$0 - (float)($$1 / (double)this.l()), 0.0f, 1.0f);
        }

        public void b(float $$0) {
            int $$1 = this.a($$0);
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                for (int $$3 = 0; $$3 < 9; ++$$3) {
                    int $$4 = $$3 + ($$2 + $$1) * 9;
                    if ($$4 >= 0 && $$4 < this.k.size()) {
                        G.a($$3 + $$2 * 9, this.k.get($$4));
                        continue;
                    }
                    G.a($$3 + $$2 * 9, cfz.b);
                }
            }
        }

        public boolean m() {
            return this.k.size() > 45;
        }

        @Override
        public cfz a(byo $$0, int $$1) {
            ccx $$2;
            if ($$1 >= this.i.size() - 9 && $$1 < this.i.size() && ($$2 = (ccx)this.i.get($$1)) != null && $$2.f()) {
                $$2.d(cfz.b);
            }
            return cfz.b;
        }

        @Override
        public boolean a(cfz $$0, ccx $$1) {
            return $$1.d != G;
        }

        @Override
        public boolean b(ccx $$0) {
            return $$0.d != G;
        }

        @Override
        public cfz g() {
            return this.l.g();
        }

        @Override
        public void b(cfz $$0) {
            this.l.b($$0);
        }
    }

    static class c
    extends ccx {
        final ccx a;

        public c(ccx $$0, int $$1, int $$2, int $$3) {
            super($$0.d, $$1, $$2, $$3);
            this.a = $$0;
        }

        @Override
        public void a(byo $$0, cfz $$1) {
            this.a.a($$0, $$1);
        }

        @Override
        public boolean a(cfz $$0) {
            return this.a.a($$0);
        }

        @Override
        public cfz e() {
            return this.a.e();
        }

        @Override
        public boolean f() {
            return this.a.f();
        }

        @Override
        public void d(cfz $$0) {
            this.a.d($$0);
        }

        @Override
        public void e(cfz $$0) {
            this.a.e($$0);
        }

        @Override
        public void d() {
            this.a.d();
        }

        @Override
        public int a() {
            return this.a.a();
        }

        @Override
        public int a_(cfz $$0) {
            return this.a.a_($$0);
        }

        @Override
        @Nullable
        public Pair<acq, acq> c() {
            return this.a.c();
        }

        @Override
        public cfz a(int $$0) {
            return this.a.a($$0);
        }

        @Override
        public boolean b() {
            return this.a.b();
        }

        @Override
        public boolean a(byo $$0) {
            return this.a.a($$0);
        }
    }

    static class a
    extends ccx {
        public a(bdq $$0, int $$1, int $$2, int $$3) {
            super($$0, $$1, $$2, $$3);
        }

        @Override
        public boolean a(byo $$0) {
            cfz $$1 = this.e();
            if (super.a($$0) && !$$1.b()) {
                return $$1.a($$0.dI().G()) && $$1.b(ewd.y) == null;
            }
            return $$1.b();
        }
    }
}

