/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aie {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 1;
    private final aif c;
    private final bfj d;
    private final int e;
    private final boolean f;
    private final Consumer<uo<?>> g;
    private final aaz h = new aaz();
    private int i;
    private int j;
    private int k;
    private eei l = eei.b;
    private int m;
    private int n;
    private List<bfj> o = Collections.emptyList();
    private boolean p;
    private boolean q;
    @Nullable
    private List<acb.b<?>> r;

    public aie(aif $$0, bfj $$1, int $$2, boolean $$3, Consumer<uo<?>> $$4) {
        this.c = $$0;
        this.g = $$4;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.h.e($$1.dh());
        this.i = apa.d($$1.dy() * 256.0f / 360.0f);
        this.j = apa.d($$1.dA() * 256.0f / 360.0f);
        this.k = apa.d($$1.cm() * 256.0f / 360.0f);
        this.q = $$1.ay();
        this.r = $$1.aj().c();
    }

    public void a() {
        bfj bfj2;
        List<bfj> $$02 = this.d.cN();
        if (!$$02.equals(this.o)) {
            this.g.accept(new yd(this.d));
            aie.a($$02, this.o).forEach($$0 -> {
                if ($$0 instanceof aig) {
                    aig $$1 = (aig)$$0;
                    $$1.c.a($$1.dn(), $$1.dp(), $$1.dt(), $$1.dy(), $$1.dA());
                }
            });
            this.o = $$02;
        }
        if ((bfj2 = this.d) instanceof bva) {
            bva $$1 = (bva)bfj2;
            if (this.m % 10 == 0) {
                Integer $$3;
                dyo $$4;
                cfz $$2 = $$1.z();
                if ($$2.d() instanceof cgg && ($$4 = cgg.a($$3 = cgg.d($$2), (cmm)this.c)) != null) {
                    for (aig $$5 : this.c.v()) {
                        $$4.a($$5, $$2);
                        uo<?> $$6 = $$4.a((int)$$3, $$5);
                        if ($$6 == null) continue;
                        $$5.c.a($$6);
                    }
                }
                this.b();
            }
        }
        if (this.m % this.e == 0 || this.d.at || this.d.aj().a()) {
            if (this.d.bM()) {
                boolean $$9;
                int $$7 = apa.d(this.d.dy() * 256.0f / 360.0f);
                int $$8 = apa.d(this.d.dA() * 256.0f / 360.0f);
                boolean bl2 = $$9 = Math.abs($$7 - this.i) >= 1 || Math.abs($$8 - this.j) >= 1;
                if ($$9) {
                    this.g.accept(new wl.c(this.d.af(), (byte)$$7, (byte)$$8, this.d.ay()));
                    this.i = $$7;
                    this.j = $$8;
                }
                this.h.e(this.d.dh());
                this.b();
                this.p = true;
            } else {
                eei $$23;
                double $$24;
                ++this.n;
                int $$10 = apa.d(this.d.dy() * 256.0f / 360.0f);
                int $$11 = apa.d(this.d.dA() * 256.0f / 360.0f);
                eei $$12 = this.d.dh();
                boolean $$13 = this.h.d($$12).g() >= 7.62939453125E-6;
                uo<ur> $$14 = null;
                boolean $$15 = $$13 || this.m % 60 == 0;
                boolean $$16 = Math.abs($$10 - this.i) >= 1 || Math.abs($$11 - this.j) >= 1;
                boolean $$17 = false;
                boolean $$18 = false;
                if (this.m > 0 || this.d instanceof byu) {
                    boolean $$22;
                    long $$19 = this.h.a($$12);
                    long $$20 = this.h.b($$12);
                    long $$21 = this.h.c($$12);
                    boolean bl3 = $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
                    if ($$22 || this.n > 400 || this.p || this.q != this.d.ay()) {
                        this.q = this.d.ay();
                        this.n = 0;
                        $$14 = new ys(this.d);
                        $$17 = true;
                        $$18 = true;
                    } else if ($$15 && $$16 || this.d instanceof byu) {
                        $$14 = new wl.b(this.d.af(), (short)$$19, (short)$$20, (short)$$21, (byte)$$10, (byte)$$11, this.d.ay());
                        $$17 = true;
                        $$18 = true;
                    } else if ($$15) {
                        $$14 = new wl.a(this.d.af(), (short)$$19, (short)$$20, (short)$$21, this.d.ay());
                        $$17 = true;
                    } else if ($$16) {
                        $$14 = new wl.c(this.d.af(), (byte)$$10, (byte)$$11, this.d.ay());
                        $$18 = true;
                    }
                }
                if ((this.f || this.d.at || this.d instanceof bfz && ((bfz)this.d).fr()) && this.m > 0 && (($$24 = ($$23 = this.d.dl()).g(this.l)) > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0)) {
                    this.l = $$23;
                    this.g.accept(new xy(this.d.af(), this.l));
                }
                if ($$14 != null) {
                    this.g.accept($$14);
                }
                this.b();
                if ($$17) {
                    this.h.e($$12);
                }
                if ($$18) {
                    this.i = $$10;
                    this.j = $$11;
                }
                this.p = false;
            }
            int $$25 = apa.d(this.d.cm() * 256.0f / 360.0f);
            if (Math.abs($$25 - this.k) >= 1) {
                this.g.accept(new xg(this.d, (byte)$$25));
                this.k = $$25;
            }
            this.d.at = false;
        }
        ++this.m;
        if (this.d.S) {
            this.a(new xy(this.d));
            this.d.S = false;
        }
    }

    private static Stream<bfj> a(List<bfj> $$0, List<bfj> $$12) {
        return $$12.stream().filter($$1 -> !$$0.contains($$1));
    }

    public void a(aig $$0) {
        this.d.d($$0);
        $$0.c.a(new xc(this.d.af()));
    }

    public void b(aig $$0) {
        ArrayList<uo<ur>> $$1 = new ArrayList<uo<ur>>();
        this.a($$0, $$1::add);
        $$0.c.a(new vd((Iterable<uo<ur>>)$$1));
        this.d.c($$0);
    }

    public void a(aig $$0, Consumer<uo<ur>> $$1) {
        bgb $$8;
        if (this.d.dD()) {
            a.warn("Fetching packet for removed entity {}", (Object)this.d);
        }
        uo<ur> $$2 = this.d.S();
        this.k = apa.d(this.d.cm() * 256.0f / 360.0f);
        $$1.accept($$2);
        if (this.r != null) {
            $$1.accept(new xw(this.d.af(), this.r));
        }
        boolean $$3 = this.f;
        if (this.d instanceof bfz) {
            Collection<bhc> $$4 = ((bfz)this.d).eM().b();
            if (!$$4.isEmpty()) {
                $$1.accept(new yu(this.d.af(), $$4));
            }
            if (((bfz)this.d).fr()) {
                $$3 = true;
            }
        }
        this.l = this.d.dl();
        if ($$3 && !(this.d instanceof bfz)) {
            $$1.accept(new xy(this.d.af(), this.l));
        }
        if (this.d instanceof bfz) {
            ArrayList $$5 = Lists.newArrayList();
            for (bfo $$6 : bfo.values()) {
                cfz $$7 = ((bfz)this.d).c($$6);
                if ($$7.b()) continue;
                $$5.add(Pair.of((Object)((Object)$$6), (Object)$$7.p()));
            }
            if (!$$5.isEmpty()) {
                $$1.accept(new xz(this.d.af(), $$5));
            }
        }
        if (!this.d.cN().isEmpty()) {
            $$1.accept(new yd(this.d));
        }
        if (this.d.bM()) {
            $$1.accept(new yd(this.d.cW()));
        }
        if (this.d instanceof bgb && ($$8 = (bgb)this.d).fO()) {
            $$1.accept(new xx($$8, $$8.fP()));
        }
    }

    private void b() {
        acb $$0 = this.d.aj();
        List<acb.b<?>> $$1 = $$0.b();
        if ($$1 != null) {
            this.r = $$0.c();
            this.a(new xw(this.d.af(), $$1));
        }
        if (this.d instanceof bfz) {
            Set<bhc> $$2 = ((bfz)this.d).eM().a();
            if (!$$2.isEmpty()) {
                this.a(new yu(this.d.af(), $$2));
            }
            $$2.clear();
        }
    }

    private void a(uo<?> $$0) {
        this.g.accept($$0);
        if (this.d instanceof aig) {
            ((aig)this.d).c.a($$0);
        }
    }
}

