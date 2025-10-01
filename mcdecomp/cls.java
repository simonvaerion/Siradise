/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cls
extends cmo {
    @Nullable
    public czn c_(gu var1);

    default public <T extends czn> Optional<T> a(gu $$0, czp<T> $$1) {
        czn $$2 = this.c_($$0);
        if ($$2 == null || $$2.u() != $$1) {
            return Optional.empty();
        }
        return Optional.of($$2);
    }

    public dcb a_(gu var1);

    public dxe b_(gu var1);

    default public int h(gu $$0) {
        return this.a_($$0).h();
    }

    default public int M() {
        return 15;
    }

    default public Stream<dcb> a(eed $$0) {
        return gu.a($$0).map(this::a_);
    }

    default public eee a(clu $$02) {
        return cls.a($$02.b(), $$02.a(), $$02, ($$0, $$1) -> {
            dcb $$2 = this.a_((gu)$$1);
            eei $$3 = $$0.b().d($$0.a());
            return $$0.c().test($$2) ? new eee($$0.a(), ha.a($$3.c, $$3.d, $$3.e), gu.a($$0.a()), false) : null;
        }, $$0 -> {
            eei $$1 = $$0.b().d($$0.a());
            return eee.a($$0.a(), ha.a($$1.c, $$1.d, $$1.e), gu.a($$0.a()));
        });
    }

    default public eee a(clv $$02) {
        return cls.a($$02.b(), $$02.a(), $$02, ($$0, $$1) -> {
            dcb $$2 = this.a_((gu)$$1);
            dxe $$3 = this.b_((gu)$$1);
            eei $$4 = $$0.b();
            eei $$5 = $$0.a();
            efb $$6 = $$0.a($$2, this, (gu)$$1);
            eee $$7 = this.a($$4, $$5, (gu)$$1, $$6, $$2);
            efb $$8 = $$0.a($$3, this, (gu)$$1);
            eee $$9 = $$8.a($$4, $$5, (gu)$$1);
            double $$10 = $$7 == null ? Double.MAX_VALUE : $$0.b().g($$7.e());
            double $$11 = $$9 == null ? Double.MAX_VALUE : $$0.b().g($$9.e());
            return $$10 <= $$11 ? $$7 : $$9;
        }, $$0 -> {
            eei $$1 = $$0.b().d($$0.a());
            return eee.a($$0.a(), ha.a($$1.c, $$1.d, $$1.e), gu.a($$0.a()));
        });
    }

    @Nullable
    default public eee a(eei $$0, eei $$1, gu $$2, efb $$3, dcb $$4) {
        eee $$6;
        eee $$5 = $$3.a($$0, $$1, $$2);
        if ($$5 != null && ($$6 = $$4.m(this, $$2).a($$0, $$1, $$2)) != null && $$6.e().d($$0).g() < $$5.e().d($$0).g()) {
            return $$5.a($$6.b());
        }
        return $$5;
    }

    default public double a(efb $$0, Supplier<efb> $$1) {
        if (!$$0.b()) {
            return $$0.c(ha.a.b);
        }
        double $$2 = $$1.get().c(ha.a.b);
        if ($$2 >= 1.0) {
            return $$2 - 1.0;
        }
        return Double.NEGATIVE_INFINITY;
    }

    default public double i(gu $$0) {
        return this.a(this.a_($$0).k(this, $$0), () -> {
            gu $$1 = $$0.d();
            return this.a_($$1).k(this, $$1);
        });
    }

    public static <T, C> T a(eei $$0, eei $$1, C $$2, BiFunction<C, gu, T> $$3, Function<C, T> $$4) {
        int $$13;
        int $$12;
        if ($$0.equals($$1)) {
            return $$4.apply($$2);
        }
        double $$5 = apa.d(-1.0E-7, $$1.c, $$0.c);
        double $$6 = apa.d(-1.0E-7, $$1.d, $$0.d);
        double $$7 = apa.d(-1.0E-7, $$1.e, $$0.e);
        double $$8 = apa.d(-1.0E-7, $$0.c, $$1.c);
        double $$9 = apa.d(-1.0E-7, $$0.d, $$1.d);
        double $$10 = apa.d(-1.0E-7, $$0.e, $$1.e);
        int $$11 = apa.a($$8);
        gu.a $$14 = new gu.a($$11, $$12 = apa.a($$9), $$13 = apa.a($$10));
        T $$15 = $$3.apply($$2, $$14);
        if ($$15 != null) {
            return $$15;
        }
        double $$16 = $$5 - $$8;
        double $$17 = $$6 - $$9;
        double $$18 = $$7 - $$10;
        int $$19 = apa.j($$16);
        int $$20 = apa.j($$17);
        int $$21 = apa.j($$18);
        double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
        double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
        double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
        double $$25 = $$22 * ($$19 > 0 ? 1.0 - apa.e($$8) : apa.e($$8));
        double $$26 = $$23 * ($$20 > 0 ? 1.0 - apa.e($$9) : apa.e($$9));
        double $$27 = $$24 * ($$21 > 0 ? 1.0 - apa.e($$10) : apa.e($$10));
        while ($$25 <= 1.0 || $$26 <= 1.0 || $$27 <= 1.0) {
            T $$28;
            if ($$25 < $$26) {
                if ($$25 < $$27) {
                    $$11 += $$19;
                    $$25 += $$22;
                } else {
                    $$13 += $$21;
                    $$27 += $$24;
                }
            } else if ($$26 < $$27) {
                $$12 += $$20;
                $$26 += $$23;
            } else {
                $$13 += $$21;
                $$27 += $$24;
            }
            if (($$28 = $$3.apply($$2, $$14.d($$11, $$12, $$13))) == null) continue;
            return $$28;
        }
        return $$4.apply($$2);
    }
}

