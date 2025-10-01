/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public class dhr {
    public static final float a = -0.50375f;
    private static final float n = 0.08f;
    private static final double o = 1.5;
    private static final double p = 1.5;
    private static final double q = 1.5625;
    private static final double r = -0.703125;
    public static final int b = 64;
    public static final long c = 4096L;
    private static final dhd s = dhe.a(10.0);
    private static final dhd t = dhe.a();
    private static final acp<dhd> u = dhr.a("zero");
    private static final acp<dhd> v = dhr.a("y");
    private static final acp<dhd> w = dhr.a("shift_x");
    private static final acp<dhd> x = dhr.a("shift_z");
    private static final acp<dhd> y = dhr.a("overworld/base_3d_noise");
    private static final acp<dhd> z = dhr.a("nether/base_3d_noise");
    private static final acp<dhd> A = dhr.a("end/base_3d_noise");
    public static final acp<dhd> d = dhr.a("overworld/continents");
    public static final acp<dhd> e = dhr.a("overworld/erosion");
    public static final acp<dhd> f = dhr.a("overworld/ridges");
    public static final acp<dhd> g = dhr.a("overworld/ridges_folded");
    public static final acp<dhd> h = dhr.a("overworld/offset");
    public static final acp<dhd> i = dhr.a("overworld/factor");
    public static final acp<dhd> j = dhr.a("overworld/jaggedness");
    public static final acp<dhd> k = dhr.a("overworld/depth");
    private static final acp<dhd> B = dhr.a("overworld/sloped_cheese");
    public static final acp<dhd> l = dhr.a("overworld_large_biomes/continents");
    public static final acp<dhd> m = dhr.a("overworld_large_biomes/erosion");
    private static final acp<dhd> C = dhr.a("overworld_large_biomes/offset");
    private static final acp<dhd> D = dhr.a("overworld_large_biomes/factor");
    private static final acp<dhd> E = dhr.a("overworld_large_biomes/jaggedness");
    private static final acp<dhd> F = dhr.a("overworld_large_biomes/depth");
    private static final acp<dhd> G = dhr.a("overworld_large_biomes/sloped_cheese");
    private static final acp<dhd> H = dhr.a("overworld_amplified/offset");
    private static final acp<dhd> I = dhr.a("overworld_amplified/factor");
    private static final acp<dhd> J = dhr.a("overworld_amplified/jaggedness");
    private static final acp<dhd> K = dhr.a("overworld_amplified/depth");
    private static final acp<dhd> L = dhr.a("overworld_amplified/sloped_cheese");
    private static final acp<dhd> M = dhr.a("end/sloped_cheese");
    private static final acp<dhd> N = dhr.a("overworld/caves/spaghetti_roughness_function");
    private static final acp<dhd> O = dhr.a("overworld/caves/entrances");
    private static final acp<dhd> P = dhr.a("overworld/caves/noodle");
    private static final acp<dhd> Q = dhr.a("overworld/caves/pillars");
    private static final acp<dhd> R = dhr.a("overworld/caves/spaghetti_2d_thickness_modulator");
    private static final acp<dhd> S = dhr.a("overworld/caves/spaghetti_2d");

    private static acp<dhd> a(String $$0) {
        return acp.a(jc.at, new acq($$0));
    }

    public static he<? extends dhd> a(nm<dhd> $$0) {
        hf<dwh.a> $$1 = $$0.a(jc.ax);
        hf<dhd> $$2 = $$0.a(jc.at);
        $$0.a(u, dhe.a());
        int $$3 = dfk.e * 2;
        int $$4 = dfk.d * 2;
        $$0.a(v, dhe.a($$3, $$4, (double)$$3, (double)$$4));
        dhd $$5 = dhr.a($$0, w, dhe.b(dhe.c(dhe.b($$1.b(dht.j)))));
        dhd $$6 = dhr.a($$0, x, dhe.b(dhe.c(dhe.c($$1.b(dht.j)))));
        $$0.a(y, dwe.a(0.25, 0.125, 80.0, 160.0, 8.0));
        $$0.a(z, dwe.a(0.25, 0.375, 80.0, 60.0, 8.0));
        $$0.a(A, dwe.a(0.25, 0.25, 80.0, 160.0, 4.0));
        he.c<dhd> $$7 = $$0.a(d, dhe.b(dhe.a($$5, $$6, 0.25, $$1.b(dht.c))));
        he.c<dhd> $$8 = $$0.a(e, dhe.b(dhe.a($$5, $$6, 0.25, $$1.b(dht.d))));
        dhd $$9 = dhr.a($$0, f, dhe.b(dhe.a($$5, $$6, 0.25, $$1.b(dht.i))));
        $$0.a(g, dhr.a($$9));
        dhd $$10 = dhe.b($$1.b(dht.M), 1500.0, 0.0);
        dhr.a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
        he.c<dhd> $$11 = $$0.a(l, dhe.b(dhe.a($$5, $$6, 0.25, $$1.b(dht.g))));
        he.c<dhd> $$12 = $$0.a(m, dhe.b(dhe.a($$5, $$6, 0.25, $$1.b(dht.h))));
        dhr.a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
        dhr.a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
        $$0.a(M, dhe.a(dhe.a(0L), dhr.a($$2, A)));
        $$0.a(N, dhr.b($$1));
        $$0.a(R, dhe.d(dhe.a($$1.b(dht.u), 2.0, 1.0, -0.6, -1.3)));
        $$0.a(S, dhr.f($$2, $$1));
        $$0.a(O, dhr.d($$2, $$1));
        $$0.a(P, dhr.e($$2, $$1));
        return $$0.a(Q, dhr.c($$1));
    }

    private static void a(nm<dhd> $$0, hf<dhd> $$1, dhd $$2, he<dhd> $$3, he<dhd> $$4, acp<dhd> $$5, acp<dhd> $$6, acp<dhd> $$7, acp<dhd> $$8, acp<dhd> $$9, boolean $$10) {
        dhe.w.a $$11 = new dhe.w.a($$3);
        dhe.w.a $$12 = new dhe.w.a($$4);
        dhe.w.a $$13 = new dhe.w.a($$1.b(f));
        dhe.w.a $$14 = new dhe.w.a($$1.b(g));
        dhd $$15 = dhr.a($$0, $$5, dhr.a(dhe.a(dhe.a(-0.50375f), dhe.a(ob.a($$11, $$12, $$14, $$10))), dhe.c()));
        dhd $$16 = dhr.a($$0, $$6, dhr.a(dhe.a(ob.a($$11, $$12, $$13, $$14, $$10)), s));
        dhd $$17 = dhr.a($$0, $$8, dhe.a(dhe.a(-64, 320, 1.5, -1.5), $$15));
        dhd $$18 = dhr.a($$0, $$7, dhr.a(dhe.a(ob.b($$11, $$12, $$13, $$14, $$10)), t));
        dhd $$19 = dhe.b($$18, $$2.g());
        dhd $$20 = dhr.b($$16, dhe.a($$17, $$19));
        $$0.a($$9, dhe.a($$20, dhr.a($$1, y)));
    }

    private static dhd a(nm<dhd> $$0, acp<dhd> $$1, dhd $$2) {
        return new dhe.j($$0.a($$1, $$2));
    }

    private static dhd a(hf<dhd> $$0, acp<dhd> $$1) {
        return new dhe.j($$0.b($$1));
    }

    private static dhd a(dhd $$0) {
        return dhe.b(dhe.a(dhe.a($$0.d(), dhe.a(-0.6666666666666666)).d(), dhe.a(-0.3333333333333333)), dhe.a(-3.0));
    }

    public static float a(float $$0) {
        return -(Math.abs(Math.abs($$0) - 0.6666667f) - 0.33333334f) * 3.0f;
    }

    private static dhd b(hf<dwh.a> $$0) {
        dhd $$1 = dhe.a($$0.b(dht.z));
        dhd $$2 = dhe.a($$0.b(dht.A), 0.0, -0.1);
        return dhe.d(dhe.b($$2, dhe.a($$1.d(), dhe.a(-0.4))));
    }

    private static dhd d(hf<dhd> $$0, hf<dwh.a> $$1) {
        dhd $$2 = dhe.d(dhe.b($$1.b(dht.x), 2.0, 1.0));
        dhd $$3 = dhe.a($$1.b(dht.y), -0.065, -0.088);
        dhd $$4 = dhe.a($$2, $$1.b(dht.v), dhe.z.a.a);
        dhd $$5 = dhe.a($$2, $$1.b(dht.w), dhe.z.a.a);
        dhd $$6 = dhe.a(dhe.d($$4, $$5), $$3).a(-1.0, 1.0);
        dhd $$7 = dhr.a($$0, N);
        dhd $$8 = dhe.b($$1.b(dht.B), 0.75, 0.5);
        dhd $$9 = dhe.a(dhe.a($$8, dhe.a(0.37)), dhe.a(-10, 30, 0.3, 0.0));
        return dhe.d(dhe.c($$9, dhe.a($$7, $$6)));
    }

    private static dhd e(hf<dhd> $$0, hf<dwh.a> $$1) {
        dhd $$2 = dhr.a($$0, v);
        int $$3 = -64;
        int $$4 = -60;
        int $$5 = 320;
        dhd $$6 = dhr.a($$2, dhe.b($$1.b(dht.I), 1.0, 1.0), -60, 320, -1);
        dhd $$7 = dhr.a($$2, dhe.a($$1.b(dht.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
        double $$8 = 2.6666666666666665;
        dhd $$9 = dhr.a($$2, dhe.b($$1.b(dht.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        dhd $$10 = dhr.a($$2, dhe.b($$1.b(dht.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        dhd $$11 = dhe.b(dhe.a(1.5), dhe.d($$9.d(), $$10.d()));
        return dhe.a($$6, -1000000.0, 0.0, dhe.a(64.0), dhe.a($$7, $$11));
    }

    private static dhd c(hf<dwh.a> $$0) {
        double $$1 = 25.0;
        double $$2 = 0.3;
        dhd $$3 = dhe.b($$0.b(dht.o), 25.0, 0.3);
        dhd $$4 = dhe.a($$0.b(dht.p), 0.0, -2.0);
        dhd $$5 = dhe.a($$0.b(dht.q), 0.0, 1.1);
        dhd $$6 = dhe.a(dhe.b($$3, dhe.a(2.0)), $$4);
        return dhe.d(dhe.b($$6, $$5.f()));
    }

    private static dhd f(hf<dhd> $$0, hf<dwh.a> $$1) {
        dhd $$2 = dhe.b($$1.b(dht.t), 2.0, 1.0);
        dhd $$3 = dhe.a($$2, $$1.b(dht.r), dhe.z.a.b);
        dhd $$4 = dhe.a($$1.b(dht.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
        dhd $$5 = dhr.a($$0, R);
        dhd $$6 = dhe.a($$4, dhe.a(-64, 320, 8.0, -40.0)).d();
        dhd $$7 = dhe.a($$6, $$5).f();
        double $$8 = 0.083;
        dhd $$9 = dhe.a($$3, dhe.b(dhe.a(0.083), $$5));
        return dhe.d($$9, $$7).a(-1.0, 1.0);
    }

    private static dhd a(hf<dhd> $$0, hf<dwh.a> $$1, dhd $$2) {
        dhd $$3 = dhr.a($$0, S);
        dhd $$4 = dhr.a($$0, N);
        dhd $$5 = dhe.a($$1.b(dht.C), 8.0);
        dhd $$6 = dhe.b(dhe.a(4.0), $$5.e());
        dhd $$7 = dhe.a($$1.b(dht.D), 0.6666666666666666);
        dhd $$8 = dhe.a(dhe.a(dhe.a(0.27), $$7).a(-1.0, 1.0), dhe.a(dhe.a(1.5), dhe.b(dhe.a(-0.64), $$2)).a(0.0, 0.5));
        dhd $$9 = dhe.a($$6, $$8);
        dhd $$10 = dhe.c(dhe.c($$9, dhr.a($$0, O)), dhe.a($$3, $$4));
        dhd $$11 = dhr.a($$0, Q);
        dhd $$12 = dhe.a($$11, -1000000.0, 0.03, dhe.a(-1000000.0), $$11);
        return dhe.d($$10, $$12);
    }

    private static dhd b(dhd $$0) {
        dhd $$1 = dhe.f($$0);
        return dhe.b(dhe.a($$1), dhe.a(0.64)).i();
    }

    protected static dhq a(hf<dhd> $$02, hf<dwh.a> $$1, boolean $$2, boolean $$3) {
        dhd $$4 = dhe.a($$1.b(dht.k), 0.5);
        dhd $$5 = dhe.a($$1.b(dht.l), 0.67);
        dhd $$6 = dhe.a($$1.b(dht.n), 0.7142857142857143);
        dhd $$7 = dhe.a($$1.b(dht.m));
        dhd $$8 = dhr.a($$02, w);
        dhd $$9 = dhr.a($$02, x);
        dhd $$10 = dhe.a($$8, $$9, 0.25, $$1.b($$2 ? dht.e : dht.a));
        dhd $$11 = dhe.a($$8, $$9, 0.25, $$1.b($$2 ? dht.f : dht.b));
        dhd $$12 = dhr.a($$02, $$2 ? D : ($$3 ? I : i));
        dhd $$13 = dhr.a($$02, $$2 ? F : ($$3 ? K : k));
        dhd $$14 = dhr.b(dhe.c($$12), $$13);
        dhd $$15 = dhr.a($$02, $$2 ? G : ($$3 ? L : B));
        dhd $$16 = dhe.c($$15, dhe.b(dhe.a(5.0), dhr.a($$02, O)));
        dhd $$17 = dhe.a($$15, -1000000.0, 1.5625, $$16, dhr.a($$02, $$1, $$15));
        dhd $$18 = dhe.c(dhr.b(dhr.a($$3, $$17)), dhr.a($$02, P));
        dhd $$19 = dhr.a($$02, v);
        int $$20 = Stream.of(dhu.a.values()).mapToInt($$0 -> $$0.c).min().orElse(-dfk.e * 2);
        int $$21 = Stream.of(dhu.a.values()).mapToInt($$0 -> $$0.d).max().orElse(-dfk.e * 2);
        dhd $$22 = dhr.a($$19, dhe.b($$1.b(dht.E), 1.5, 1.5), $$20, $$21, 0);
        float $$23 = 4.0f;
        dhd $$24 = dhr.a($$19, dhe.b($$1.b(dht.F), 4.0, 4.0), $$20, $$21, 0).d();
        dhd $$25 = dhr.a($$19, dhe.b($$1.b(dht.G), 4.0, 4.0), $$20, $$21, 0).d();
        dhd $$26 = dhe.a(dhe.a(-0.08f), dhe.d($$24, $$25));
        dhd $$27 = dhe.a($$1.b(dht.H));
        return new dhq($$4, $$5, $$6, $$7, $$10, $$11, dhr.a($$02, $$2 ? l : d), dhr.a($$02, $$2 ? m : e), $$13, dhr.a($$02, f), dhr.a($$3, dhe.a($$14, dhe.a(-0.703125)).a(-64.0, 64.0)), $$18, $$22, $$26, $$27);
    }

    private static dhq b(hf<dhd> $$0, hf<dwh.a> $$1, dhd $$2) {
        dhd $$3 = dhr.a($$0, w);
        dhd $$4 = dhr.a($$0, x);
        dhd $$5 = dhe.a($$3, $$4, 0.25, $$1.b(dht.a));
        dhd $$6 = dhe.a($$3, $$4, 0.25, $$1.b(dht.b));
        dhd $$7 = dhr.b($$2);
        return new dhq(dhe.a(), dhe.a(), dhe.a(), dhe.a(), $$5, $$6, dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), $$7, dhe.a(), dhe.a(), dhe.a());
    }

    private static dhd a(boolean $$0, dhd $$1) {
        return dhr.a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
    }

    private static dhd a(hf<dhd> $$0, int $$1, int $$2) {
        return dhr.a(dhr.a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
    }

    private static dhd a(dhd $$0, int $$1, int $$2) {
        return dhr.a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
    }

    protected static dhq a(hf<dhd> $$0, hf<dwh.a> $$1) {
        return dhr.b($$0, $$1, dhr.a($$0, 0, 128));
    }

    protected static dhq b(hf<dhd> $$0, hf<dwh.a> $$1) {
        return dhr.b($$0, $$1, dhr.a($$0, -64, 192));
    }

    protected static dhq c(hf<dhd> $$0, hf<dwh.a> $$1) {
        return dhr.b($$0, $$1, dhr.a(dhr.a($$0, A), 0, 256));
    }

    private static dhd c(dhd $$0) {
        return dhr.a($$0, 0, 128);
    }

    protected static dhq a(hf<dhd> $$0) {
        dhd $$1 = dhe.c(dhe.a(0L));
        dhd $$2 = dhr.b(dhr.c(dhr.a($$0, M)));
        return new dhq(dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), $$1, dhe.a(), dhe.a(), dhr.c(dhe.a($$1, dhe.a(-0.703125))), $$2, dhe.a(), dhe.a(), dhe.a());
    }

    protected static dhq a() {
        return new dhq(dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a(), dhe.a());
    }

    private static dhd a(dhd $$0, dhd $$1) {
        dhd $$2 = dhe.a(dhe.b(), $$1, $$0);
        return dhe.b(dhe.c($$2));
    }

    private static dhd b(dhd $$0, dhd $$1) {
        dhd $$2 = dhe.b($$1, $$0);
        return dhe.b(dhe.a(4.0), $$2.h());
    }

    private static dhd a(dhd $$0, dhd $$1, int $$2, int $$3, int $$4) {
        return dhe.a(dhe.a($$0, (double)$$2, (double)($$3 + 1), $$1, dhe.a((double)$$4)));
    }

    private static dhd a(dhd $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
        dhd $$9 = $$0;
        dhd $$10 = dhe.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
        $$9 = dhe.a($$10, $$5, $$9);
        dhd $$11 = dhe.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
        $$9 = dhe.a($$11, $$8, $$9);
        return $$9;
    }

    protected static final class a {
        protected a() {
        }

        protected static double a(double $$0) {
            if ($$0 < -0.75) {
                return 0.5;
            }
            if ($$0 < -0.5) {
                return 0.75;
            }
            if ($$0 < 0.5) {
                return 1.0;
            }
            if ($$0 < 0.75) {
                return 2.0;
            }
            return 3.0;
        }

        protected static double b(double $$0) {
            if ($$0 < -0.5) {
                return 0.75;
            }
            if ($$0 < 0.0) {
                return 1.0;
            }
            if ($$0 < 0.5) {
                return 1.5;
            }
            return 2.0;
        }
    }
}

