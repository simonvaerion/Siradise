/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableDouble
 */
import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;

public interface dgw {
    public static dgw a(dho $$0, clt $$1, dhq $$2, dhx $$3, int $$4, int $$5, a $$6) {
        return new c($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public static dgw a(final a $$0) {
        return new dgw(){

            @Override
            @Nullable
            public dcb a(dhd.b $$02, double $$1) {
                if ($$1 > 0.0) {
                    return null;
                }
                return $$0.computeFluid($$02.a(), $$02.b(), $$02.c()).a($$02.b());
            }

            @Override
            public boolean a() {
                return false;
            }
        };
    }

    @Nullable
    public dcb a(dhd.b var1, double var2);

    public boolean a();

    public static class c
    implements dgw {
        private static final int a = 10;
        private static final int b = 9;
        private static final int c = 10;
        private static final int d = 6;
        private static final int e = 3;
        private static final int f = 6;
        private static final int g = 16;
        private static final int h = 12;
        private static final int i = 16;
        private static final int j = 11;
        private static final double k = dgw$c.a(apa.h(10), apa.h(12));
        private final dho l;
        private final dhd m;
        private final dhd n;
        private final dhd o;
        private final dhd p;
        private final dhx q;
        private final b[] r;
        private final long[] s;
        private final a t;
        private final dhd u;
        private final dhd v;
        private boolean w;
        private final int x;
        private final int y;
        private final int z;
        private final int A;
        private final int B;
        private static final int[][] C = new int[][]{{0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}};

        c(dho $$0, clt $$1, dhq $$2, dhx $$3, int $$4, int $$5, a $$6) {
            this.l = $$0;
            this.m = $$2.a();
            this.n = $$2.b();
            this.o = $$2.c();
            this.p = $$2.d();
            this.u = $$2.h();
            this.v = $$2.i();
            this.q = $$3;
            this.x = this.a($$1.d()) - 1;
            this.t = $$6;
            int $$7 = this.a($$1.f()) + 1;
            this.A = $$7 - this.x + 1;
            this.y = this.b($$4) - 1;
            int $$8 = this.b($$4 + $$5) + 1;
            int $$9 = $$8 - this.y + 1;
            this.z = this.c($$1.e()) - 1;
            int $$10 = this.c($$1.g()) + 1;
            this.B = $$10 - this.z + 1;
            int $$11 = this.A * $$9 * this.B;
            this.r = new b[$$11];
            this.s = new long[$$11];
            Arrays.fill(this.s, Long.MAX_VALUE);
        }

        private int a(int $$0, int $$1, int $$2) {
            int $$3 = $$0 - this.x;
            int $$4 = $$1 - this.y;
            int $$5 = $$2 - this.z;
            return ($$4 * this.B + $$5) * this.A + $$3;
        }

        @Override
        @Nullable
        public dcb a(dhd.b $$0, double $$1) {
            double $$41;
            double $$39;
            dcb $$32;
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            int $$4 = $$0.c();
            if ($$1 > 0.0) {
                this.w = false;
                return null;
            }
            b $$5 = this.t.computeFluid($$2, $$3, $$4);
            if ($$5.a($$3).a(cpo.H)) {
                this.w = false;
                return cpo.H.n();
            }
            int $$6 = Math.floorDiv($$2 - 5, 16);
            int $$7 = Math.floorDiv($$3 + 1, 12);
            int $$8 = Math.floorDiv($$4 - 5, 16);
            int $$9 = Integer.MAX_VALUE;
            int $$10 = Integer.MAX_VALUE;
            int $$11 = Integer.MAX_VALUE;
            long $$12 = 0L;
            long $$13 = 0L;
            long $$14 = 0L;
            for (int $$15 = 0; $$15 <= 1; ++$$15) {
                for (int $$16 = -1; $$16 <= 1; ++$$16) {
                    for (int $$17 = 0; $$17 <= 1; ++$$17) {
                        long $$25;
                        int $$18 = $$6 + $$15;
                        int $$19 = $$7 + $$16;
                        int $$20 = $$8 + $$17;
                        int $$21 = this.a($$18, $$19, $$20);
                        long $$22 = this.s[$$21];
                        if ($$22 != Long.MAX_VALUE) {
                            long $$23 = $$22;
                        } else {
                            apf $$24 = this.q.a($$18, $$19, $$20);
                            this.s[$$21] = $$25 = gu.a($$18 * 16 + $$24.a(10), $$19 * 12 + $$24.a(9), $$20 * 16 + $$24.a(10));
                        }
                        int $$26 = gu.a($$25) - $$2;
                        int $$27 = gu.b($$25) - $$3;
                        int $$28 = gu.c($$25) - $$4;
                        int $$29 = $$26 * $$26 + $$27 * $$27 + $$28 * $$28;
                        if ($$9 >= $$29) {
                            $$14 = $$13;
                            $$13 = $$12;
                            $$12 = $$25;
                            $$11 = $$10;
                            $$10 = $$9;
                            $$9 = $$29;
                            continue;
                        }
                        if ($$10 >= $$29) {
                            $$14 = $$13;
                            $$13 = $$25;
                            $$11 = $$10;
                            $$10 = $$29;
                            continue;
                        }
                        if ($$11 < $$29) continue;
                        $$14 = $$25;
                        $$11 = $$29;
                    }
                }
            }
            b $$30 = this.a($$12);
            double $$31 = dgw$c.a($$9, $$10);
            dcb $$33 = $$32 = $$30.a($$3);
            if ($$31 <= 0.0) {
                this.w = $$31 >= k;
                return $$33;
            }
            if ($$32.a(cpo.G) && this.t.computeFluid($$2, $$3 - 1, $$4).a($$3 - 1).a(cpo.H)) {
                this.w = true;
                return $$33;
            }
            MutableDouble $$34 = new MutableDouble(Double.NaN);
            b $$35 = this.a($$13);
            double $$36 = $$31 * this.a($$0, $$34, $$30, $$35);
            if ($$1 + $$36 > 0.0) {
                this.w = false;
                return null;
            }
            b $$37 = this.a($$14);
            double $$38 = dgw$c.a($$9, $$11);
            if ($$38 > 0.0 && $$1 + ($$39 = $$31 * $$38 * this.a($$0, $$34, $$30, $$37)) > 0.0) {
                this.w = false;
                return null;
            }
            double $$40 = dgw$c.a($$10, $$11);
            if ($$40 > 0.0 && $$1 + ($$41 = $$31 * $$40 * this.a($$0, $$34, $$35, $$37)) > 0.0) {
                this.w = false;
                return null;
            }
            this.w = true;
            return $$33;
        }

        @Override
        public boolean a() {
            return this.w;
        }

        private static double a(int $$0, int $$1) {
            double $$2 = 25.0;
            return 1.0 - (double)Math.abs($$1 - $$0) / 25.0;
        }

        private double a(dhd.b $$0, MutableDouble $$1, b $$2, b $$3) {
            double $$29;
            double $$23;
            int $$4 = $$0.b();
            dcb $$5 = $$2.a($$4);
            dcb $$6 = $$3.a($$4);
            if ($$5.a(cpo.H) && $$6.a(cpo.G) || $$5.a(cpo.G) && $$6.a(cpo.H)) {
                return 2.0;
            }
            int $$7 = Math.abs($$2.a - $$3.a);
            if ($$7 == 0) {
                return 0.0;
            }
            double $$8 = 0.5 * (double)($$2.a + $$3.a);
            double $$9 = (double)$$4 + 0.5 - $$8;
            double $$10 = (double)$$7 / 2.0;
            double $$11 = 0.0;
            double $$12 = 2.5;
            double $$13 = 1.5;
            double $$14 = 3.0;
            double $$15 = 10.0;
            double $$16 = 3.0;
            double $$17 = $$10 - Math.abs($$9);
            if ($$9 > 0.0) {
                double $$18 = 0.0 + $$17;
                if ($$18 > 0.0) {
                    double $$19 = $$18 / 1.5;
                } else {
                    double $$20 = $$18 / 2.5;
                }
            } else {
                double $$21 = 3.0 + $$17;
                if ($$21 > 0.0) {
                    double $$22 = $$21 / 3.0;
                } else {
                    $$23 = $$21 / 10.0;
                }
            }
            double $$24 = 2.0;
            if ($$23 < -2.0 || $$23 > 2.0) {
                double $$25 = 0.0;
            } else {
                double $$26 = $$1.getValue();
                if (Double.isNaN($$26)) {
                    double $$27 = this.m.a($$0);
                    $$1.setValue($$27);
                    double $$28 = $$27;
                } else {
                    $$29 = $$26;
                }
            }
            return 2.0 * ($$29 + $$23);
        }

        private int a(int $$0) {
            return Math.floorDiv($$0, 16);
        }

        private int b(int $$0) {
            return Math.floorDiv($$0, 12);
        }

        private int c(int $$0) {
            return Math.floorDiv($$0, 16);
        }

        private b a(long $$0) {
            b $$9;
            int $$6;
            int $$5;
            int $$1 = gu.a($$0);
            int $$2 = gu.b($$0);
            int $$3 = gu.c($$0);
            int $$4 = this.a($$1);
            int $$7 = this.a($$4, $$5 = this.b($$2), $$6 = this.c($$3));
            b $$8 = this.r[$$7];
            if ($$8 != null) {
                return $$8;
            }
            this.r[$$7] = $$9 = this.b($$1, $$2, $$3);
            return $$9;
        }

        private b b(int $$0, int $$1, int $$2) {
            b $$3 = this.t.computeFluid($$0, $$1, $$2);
            int $$4 = Integer.MAX_VALUE;
            int $$5 = $$1 + 12;
            int $$6 = $$1 - 12;
            boolean $$7 = false;
            for (int[] $$8 : C) {
                b $$15;
                boolean $$14;
                boolean $$13;
                int $$9 = $$0 + hx.c($$8[0]);
                int $$10 = $$2 + hx.c($$8[1]);
                int $$11 = this.l.a($$9, $$10);
                int $$12 = $$11 + 8;
                boolean bl2 = $$13 = $$8[0] == 0 && $$8[1] == 0;
                if ($$13 && $$6 > $$12) {
                    return $$3;
                }
                boolean bl3 = $$14 = $$5 > $$12;
                if (($$14 || $$13) && !($$15 = this.t.computeFluid($$9, $$12, $$10)).a($$12).i()) {
                    if ($$13) {
                        $$7 = true;
                    }
                    if ($$14) {
                        return $$15;
                    }
                }
                $$4 = Math.min($$4, $$11);
            }
            int $$16 = this.a($$0, $$1, $$2, $$3, $$4, $$7);
            return new b($$16, this.a($$0, $$1, $$2, $$3, $$16));
        }

        private int a(int $$0, int $$1, int $$2, b $$3, int $$4, boolean $$5) {
            int $$19;
            double $$16;
            double $$15;
            dhd.e $$6 = new dhd.e($$0, $$1, $$2);
            if (coa.a(this.u, this.v, $$6)) {
                double $$7 = -1.0;
                double $$8 = -1.0;
            } else {
                int $$9 = $$4 + 8 - $$1;
                int $$10 = 64;
                double $$11 = $$5 ? apa.a((double)$$9, 0.0, 64.0, 1.0, 0.0) : 0.0;
                double $$12 = apa.a(this.n.a($$6), -1.0, 1.0);
                double $$13 = apa.b($$11, 1.0, 0.0, -0.3, 0.8);
                double $$14 = apa.b($$11, 1.0, 0.0, -0.8, 0.4);
                $$15 = $$12 - $$14;
                $$16 = $$12 - $$13;
            }
            if ($$16 > 0.0) {
                int $$17 = $$3.a;
            } else if ($$15 > 0.0) {
                int $$18 = this.a($$0, $$1, $$2, $$4);
            } else {
                $$19 = dfk.g;
            }
            return $$19;
        }

        private int a(int $$0, int $$1, int $$2, int $$3) {
            int $$4 = 16;
            int $$5 = 40;
            int $$6 = Math.floorDiv($$0, 16);
            int $$7 = Math.floorDiv($$1, 40);
            int $$8 = Math.floorDiv($$2, 16);
            int $$9 = $$7 * 40 + 20;
            int $$10 = 10;
            double $$11 = this.o.a(new dhd.e($$6, $$7, $$8)) * 10.0;
            int $$12 = apa.a($$11, 3);
            int $$13 = $$9 + $$12;
            return Math.min($$3, $$13);
        }

        private dcb a(int $$0, int $$1, int $$2, b $$3, int $$4) {
            dcb $$5 = $$3.b;
            if ($$4 <= -10 && $$4 != dfk.g && $$3.b != cpo.H.n()) {
                int $$10;
                int $$9;
                int $$6 = 64;
                int $$7 = 40;
                int $$8 = Math.floorDiv($$0, 64);
                double $$11 = this.p.a(new dhd.e($$8, $$9 = Math.floorDiv($$1, 40), $$10 = Math.floorDiv($$2, 64)));
                if (Math.abs($$11) > 0.3) {
                    $$5 = cpo.H.n();
                }
            }
            return $$5;
        }
    }

    public static interface a {
        public b computeFluid(int var1, int var2, int var3);
    }

    public static final class b {
        final int a;
        final dcb b;

        public b(int $$0, dcb $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public dcb a(int $$0) {
            return $$0 < this.a ? this.b : cpo.a.n();
        }
    }
}

