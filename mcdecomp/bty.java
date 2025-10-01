/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;

public class bty {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 6;
    static final List<bqg<? extends bqf<? super btx>>> a = ImmutableList.of(bqg.c, bqg.f, bqg.d, bqg.w);
    static final List<bpb<?>> b = ImmutableList.of(bpb.n, bpb.m, bpb.E, bpb.t, bpb.Y, bpb.aQ, bpb.aR, bpb.aS, bpb.aF, bpb.aP, bpb.h, bpb.r, (Object[])new bpb[]{bpb.N, bpb.O, bpb.Q});
    private static final int e = 9600;
    private static final float f = 1.0f;
    private static final float g = 2.0f;
    private static final float h = 1.25f;
    private static final float i = 1.25f;

    public static ciz a() {
        return ciz.a(cgc.uo);
    }

    protected static bha<?> a(bha<btx> $$0) {
        bty.b($$0);
        bty.e($$0);
        bty.c($$0);
        bty.d($$0);
        $$0.a(Set.of(bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    static btx b(btx $$0) {
        $$0.dK().b(bpb.aR);
        $$0.dK().b(bpb.aQ);
        return $$0.a(btx.a.a);
    }

    private static void b(bha<btx> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<btx>>)ImmutableList.of((Object)new bkk(0.8f), (Object)new bhm(2.0f){

            @Override
            protected void b(aif $$0, bgi $$1, long $$2) {
                bty.b((btx)$$1);
                super.b($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
                this.b(aif2, (bgi)bfz2, l2);
            }
        }, (Object)new bja(10000, 15000), (Object)new bhx(bpb.O)));
    }

    private static void c(bha<btx> $$0) {
        $$0.a(bzz.v, (ImmutableList<Pair<Integer, bhs<btx>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new e())), Set.of(Pair.of(bpb.Y, (Object)((Object)bpc.b)), Pair.of(bpb.aQ, (Object)((Object)bpc.a)), Pair.of(bpb.m, (Object)((Object)bpc.a))));
    }

    private static void d(bha<btx> $$0) {
        $$0.a(bzz.z, (ImmutableList<Pair<Integer, bhs<btx>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new a(160, 180)), (Object)Pair.of((Object)0, (Object)new c(40))), Set.of(Pair.of(bpb.Y, (Object)((Object)bpc.b)), Pair.of(bpb.m, (Object)((Object)bpc.b)), Pair.of(bpb.aR, (Object)((Object)bpc.a))));
    }

    private static void e(bha<btx> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<btx>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bhl(bfn.aN, 1.0f){

            @Override
            protected void a(aif $$0, brl $$1, long $$2) {
                bty.b((btx)$$1);
                super.a($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
                this.a(aif2, (brl)bfz2, l2);
            }
        }), (Object)Pair.of((Object)1, (Object)new bie($$0 -> Float.valueOf(1.25f), $$0 -> $$0.h_() ? 2.5 : 3.5){

            @Override
            protected void b(aif $$0, bgi $$1, long $$2) {
                bty.b((btx)$$1);
                super.b($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
                this.b(aif2, (bgi)bfz2, l2);
            }
        }), (Object)Pair.of((Object)2, (Object)new biw(45, 90)), (Object)Pair.of((Object)3, (Object)new b(40, 100)), (Object)Pair.of((Object)4, new bjn(ImmutableList.of((Object)Pair.of(bjx.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new d(40, 80), (Object)1), (Object)Pair.of((Object)new f(40, 80), (Object)1), (Object)Pair.of(bjp.a(bfn.bt, 6.0f), (Object)1), (Object)Pair.of(bji.a(1.0f), (Object)1), (Object)Pair.of((Object)new bib(5, 20), (Object)2))))), Set.of(Pair.of(bpb.aR, (Object)((Object)bpc.b))));
    }

    static void a(btx $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.z, (Object)bzz.v, (Object)bzz.b));
    }

    static class e
    extends bhr<btx> {
        e() {
            super(Map.of(bpb.m, bpc.a, bpb.Y, bpc.b, bpb.aQ, bpc.a), 600);
        }

        @Override
        protected boolean a(aif $$0, btx $$1) {
            return $$1.ge();
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            if (!$$1.ge()) {
                $$1.a(btx.a.a);
                return false;
            }
            Optional<gu> $$3 = $$1.dK().c(bpb.m).map(bpe::a).map(bje::b);
            Optional<gu> $$4 = $$1.dK().c(bpb.aQ);
            if ($$3.isEmpty() || $$4.isEmpty()) {
                return false;
            }
            return $$4.get().equals($$3.get());
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.e);
        }

        @Override
        protected void c(aif $$0, btx $$1, long $$2) {
            if ($$1.gh() && $$1.ge()) {
                $$1.dK().a(bpb.aR, true);
            }
            $$1.dK().b(bpb.m);
            $$1.dK().b(bpb.aQ);
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }

    static class a
    extends bhr<btx> {
        a(int $$0, int $$1) {
            super(Map.of(bpb.Y, bpc.b, bpb.m, bpc.b, bpb.aR, bpc.a, bpb.aF, bpc.b), $$0, $$1);
        }

        @Override
        protected boolean a(aif $$0, btx $$1) {
            return $$1.ge();
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            return $$1.dK().c(bpb.aR).isPresent() && $$1.gh() && !$$1.gc();
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.f);
        }

        @Override
        protected void c(aif $$0, btx $$1, long $$2) {
            boolean $$3 = this.a($$2);
            if ($$3) {
                $$1.dK().a(bpb.aF, apz.a, 9600L);
            } else {
                bty.b($$1);
            }
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }

    static class c
    extends bhr<btx> {
        c(int $$0) {
            super(Map.of(bpb.Y, bpc.b, bpb.m, bpc.b, bpb.aR, bpc.a, bpb.aF, bpc.a), $$0, $$0);
        }

        @Override
        protected boolean a(aif $$0, btx $$1) {
            return true;
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            return $$1.dK().c(bpb.aR).isPresent();
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.g);
        }

        @Override
        protected void c(aif $$0, btx $$1, long $$2) {
            boolean $$3 = this.a($$2);
            $$1.a(btx.a.a).w($$3);
            $$1.dK().b(bpb.aR);
            $$1.dK().a(bpb.aS, true);
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }

    static class b
    extends bhr<btx> {
        b(int $$0, int $$1) {
            super(Map.of(bpb.aS, bpc.a), $$0, $$1);
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            return true;
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.b);
        }

        @Override
        protected void c(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.a);
            $$1.dK().b(bpb.aS);
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }

    static class d
    extends bhr<btx> {
        d(int $$0, int $$1) {
            super(Map.of(bpb.Y, bpc.b, bpb.aR, bpc.b, bpb.aQ, bpc.b, bpb.aS, bpc.b, bpb.r, bpc.b), $$0, $$1);
        }

        @Override
        protected boolean a(aif $$0, btx $$1) {
            return !$$1.fY();
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            return true;
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.c);
        }

        @Override
        protected void c(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.a);
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }

    static class f
    extends bhr<btx> {
        f(int $$0, int $$1) {
            super(Map.of(bpb.m, bpc.b, bpb.aQ, bpc.b, bpb.aF, bpc.b), $$0, $$1);
        }

        @Override
        protected boolean a(aif $$0, btx $$1) {
            return !$$1.h_() && $$1.ge();
        }

        @Override
        protected boolean a(aif $$0, btx $$1, long $$2) {
            return $$1.ge();
        }

        @Override
        protected void b(aif $$0, btx $$1, long $$2) {
            $$1.a(btx.a.d);
        }

        @Override
        protected void c(aif $$0, btx $$12, long $$2) {
            boolean $$3 = this.a($$2);
            $$12.a(btx.a.a);
            if ($$3) {
                $$12.gg().ifPresent($$1 -> {
                    $$12.dK().a(bpb.aQ, $$1);
                    $$12.dK().a(bpb.m, new bpe((gu)$$1, 1.25f, 0));
                });
            }
        }

        @Override
        protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
            this.c(aif2, (btx)bfz2, l2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (btx)bfz2, l2);
        }
    }
}

