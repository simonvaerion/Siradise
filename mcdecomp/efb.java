/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.math.DoubleMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class efb {
    protected final eer a;
    @Nullable
    private efb[] b;

    efb(eer $$0) {
        this.a = $$0;
    }

    public double b(ha.a $$0) {
        int $$1 = this.a.a($$0);
        if ($$1 >= this.a.c($$0)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.a($$0, $$1);
    }

    public double c(ha.a $$0) {
        int $$1 = this.a.b($$0);
        if ($$1 <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.a($$0, $$1);
    }

    public eed a() {
        if (this.b()) {
            throw ac.b(new UnsupportedOperationException("No bounds for empty shape."));
        }
        return new eed(this.b(ha.a.a), this.b(ha.a.b), this.b(ha.a.c), this.c(ha.a.a), this.c(ha.a.b), this.c(ha.a.c));
    }

    protected double a(ha.a $$0, int $$1) {
        return this.a($$0).getDouble($$1);
    }

    protected abstract DoubleList a(ha.a var1);

    public boolean b() {
        return this.a.a();
    }

    public efb a(double $$0, double $$1, double $$2) {
        if (this.b()) {
            return eey.a();
        }
        return new eek(this.a, (DoubleList)new eex(this.a(ha.a.a), $$0), (DoubleList)new eex(this.a(ha.a.b), $$1), (DoubleList)new eex(this.a(ha.a.c), $$2));
    }

    public efb c() {
        efb[] $$0 = new efb[]{eey.a()};
        this.b((double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) -> {
            $$0[0] = eey.b($$0[0], eey.a($$1, $$2, $$3, $$4, $$5, $$6), eem.o);
        });
        return $$0[0];
    }

    public void a(eey.a $$0) {
        this.a.a((int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) -> $$0.consume(this.a(ha.a.a, $$1), this.a(ha.a.b, $$2), this.a(ha.a.c, $$3), this.a(ha.a.a, $$4), this.a(ha.a.b, $$5), this.a(ha.a.c, $$6)), true);
    }

    public void b(eey.a $$0) {
        DoubleList $$1 = this.a(ha.a.a);
        DoubleList $$2 = this.a(ha.a.b);
        DoubleList $$3 = this.a(ha.a.c);
        this.a.b(($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume($$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)), true);
    }

    public List<eed> d() {
        ArrayList $$0 = Lists.newArrayList();
        this.b((double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) -> $$0.add(new eed($$1, $$2, $$3, $$4, $$5, $$6)));
        return $$0;
    }

    public double a(ha.a $$0, double $$1, double $$2) {
        int $$6;
        ha.a $$3 = gs.b.a($$0);
        ha.a $$4 = gs.c.a($$0);
        int $$5 = this.a($$3, $$1);
        int $$7 = this.a.a($$0, $$5, $$6 = this.a($$4, $$2));
        if ($$7 >= this.a.c($$0)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.a($$0, $$7);
    }

    public double b(ha.a $$0, double $$1, double $$2) {
        int $$6;
        ha.a $$3 = gs.b.a($$0);
        ha.a $$4 = gs.c.a($$0);
        int $$5 = this.a($$3, $$1);
        int $$7 = this.a.b($$0, $$5, $$6 = this.a($$4, $$2));
        if ($$7 <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.a($$0, $$7);
    }

    protected int a(ha.a $$0, double $$1) {
        return apa.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
    }

    @Nullable
    public eee a(eei $$0, eei $$1, gu $$2) {
        if (this.b()) {
            return null;
        }
        eei $$3 = $$1.d($$0);
        if ($$3.g() < 1.0E-7) {
            return null;
        }
        eei $$4 = $$0.e($$3.a(0.001));
        if (this.a.d(this.a(ha.a.a, $$4.c - (double)$$2.u()), this.a(ha.a.b, $$4.d - (double)$$2.v()), this.a(ha.a.c, $$4.e - (double)$$2.w()))) {
            return new eee($$4, ha.a($$3.c, $$3.d, $$3.e).g(), $$2, true);
        }
        return eed.a(this.d(), $$0, $$1, $$2);
    }

    public Optional<eei> a(eei $$0) {
        if (this.b()) {
            return Optional.empty();
        }
        eei[] $$1 = new eei[1];
        this.b((double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) -> {
            double $$8 = apa.a($$0.a(), $$2, $$5);
            double $$9 = apa.a($$0.b(), $$3, $$6);
            double $$10 = apa.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
                $$1[0] = new eei($$8, $$9, $$10);
            }
        });
        return Optional.of($$1[0]);
    }

    public efb a(ha $$0) {
        efb $$2;
        if (this.b() || this == eey.b()) {
            return this;
        }
        if (this.b != null) {
            efb $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
                return $$1;
            }
        } else {
            this.b = new efb[6];
        }
        this.b[$$0.ordinal()] = $$2 = this.b($$0);
        return $$2;
    }

    private efb b(ha $$0) {
        ha.a $$1 = $$0.o();
        DoubleList $$2 = this.a($$1);
        if ($$2.size() == 2 && DoubleMath.fuzzyEquals((double)$$2.getDouble(0), (double)0.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)$$2.getDouble(1), (double)1.0, (double)1.0E-7)) {
            return this;
        }
        ha.b $$3 = $$0.f();
        int $$4 = this.a($$1, $$3 == ha.b.a ? 0.9999999 : 1.0E-7);
        return new eez(this, $$1, $$4);
    }

    public double a(ha.a $$0, eed $$1, double $$2) {
        return this.a(gs.a($$0, ha.a.a), $$1, $$2);
    }

    protected double a(gs $$0, eed $$1, double $$2) {
        block11: {
            int $$14;
            int $$12;
            double $$8;
            ha.a $$4;
            gs $$3;
            block10: {
                if (this.b()) {
                    return $$2;
                }
                if (Math.abs($$2) < 1.0E-7) {
                    return 0.0;
                }
                $$3 = $$0.a();
                $$4 = $$3.a(ha.a.a);
                ha.a $$5 = $$3.a(ha.a.b);
                ha.a $$6 = $$3.a(ha.a.c);
                double $$7 = $$1.b($$4);
                $$8 = $$1.a($$4);
                int $$9 = this.a($$4, $$8 + 1.0E-7);
                int $$10 = this.a($$4, $$7 - 1.0E-7);
                int $$11 = Math.max(0, this.a($$5, $$1.a($$5) + 1.0E-7));
                $$12 = Math.min(this.a.c($$5), this.a($$5, $$1.b($$5) - 1.0E-7) + 1);
                int $$13 = Math.max(0, this.a($$6, $$1.a($$6) + 1.0E-7));
                $$14 = Math.min(this.a.c($$6), this.a($$6, $$1.b($$6) - 1.0E-7) + 1);
                int $$15 = this.a.c($$4);
                if (!($$2 > 0.0)) break block10;
                for (int $$16 = $$10 + 1; $$16 < $$15; ++$$16) {
                    for (int $$17 = $$11; $$17 < $$12; ++$$17) {
                        for (int $$18 = $$13; $$18 < $$14; ++$$18) {
                            if (!this.a.a($$3, $$16, $$17, $$18)) continue;
                            double $$19 = this.a($$4, $$16) - $$7;
                            if ($$19 >= -1.0E-7) {
                                $$2 = Math.min($$2, $$19);
                            }
                            return $$2;
                        }
                    }
                }
                break block11;
            }
            if (!($$2 < 0.0)) break block11;
            for (int $$20 = $$9 - 1; $$20 >= 0; --$$20) {
                for (int $$21 = $$11; $$21 < $$12; ++$$21) {
                    for (int $$22 = $$13; $$22 < $$14; ++$$22) {
                        if (!this.a.a($$3, $$20, $$21, $$22)) continue;
                        double $$23 = this.a($$4, $$20 + 1) - $$8;
                        if ($$23 <= 1.0E-7) {
                            $$2 = Math.max($$2, $$23);
                        }
                        return $$2;
                    }
                }
            }
        }
        return $$2;
    }

    public String toString() {
        return this.b() ? "EMPTY" : "VoxelShape[" + this.a() + "]";
    }
}

