/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class bsy {
    private static final float a = 4.0f;
    private static final float b = 2.0f;
    private static final float c = 2.5f;
    private static final float d = 2.5f;
    private static final float e = 1.0f;
    private static final bdi f = bdi.a(5, 16);
    private static final ImmutableList<bqg<? extends bqf<? super bsx>>> g = ImmutableList.of(bqg.c, bqg.f, bqg.s, bqg.n);
    private static final ImmutableList<bpb<?>> h = ImmutableList.of(bpb.Y, bpb.x, bpb.y, bpb.m, bpb.n, bpb.E, bpb.t, bpb.h, bpb.N, bpb.O, bpb.P, bpb.Q, (Object[])new bpb[]{bpb.r, bpb.J});

    protected static void a(bsx $$0, apf $$1) {
    }

    public static bha.b<bsx> a() {
        return bha.a(h, g);
    }

    protected static bha<?> a(bha<bsx> $$0) {
        bsy.b($$0);
        bsy.c($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<bsx> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bsx>>)ImmutableList.of((Object)new bkk(0.8f), (Object)new a(4.0f), (Object)new biw(45, 90), (Object)new bja(), (Object)new bhx(bpb.O), (Object)new bhx(bpb.P)));
    }

    private static void c(bha<bsx> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<bsx>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)1, (Object)new bhl(bfn.l, 1.0f)), (Object)Pair.of((Object)2, (Object)new bie($$0 -> Float.valueOf(2.5f))), (Object)Pair.of((Object)3, bld.a(Predicate.not(bsx::r), bho.a(f, 2.5f))), (Object)Pair.of((Object)4, (Object)new bjh(bdi.a(150, 250), 30.0f, 0.0f, 0.0f)), (Object)Pair.of((Object)5, new bjn((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), ImmutableList.of((Object)Pair.of(bld.a(Predicate.not(bsx::r), bji.a(2.0f)), (Object)1), (Object)Pair.of(bld.a(Predicate.not(bsx::r), bjx.a(2.0f, 3)), (Object)1), (Object)Pair.of((Object)new b(20), (Object)1), (Object)Pair.of((Object)new bib(30, 60), (Object)1))))));
    }

    public static void a(bsx $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.b));
    }

    public static ciz b() {
        return bsx.bT;
    }

    public static class a
    extends bhm {
        public a(float $$0) {
            super($$0);
        }

        @Override
        protected void b(aif $$0, bgi $$1, long $$2) {
            if ($$1 instanceof bsx) {
                bsx $$3 = (bsx)$$1;
                $$3.gl();
            }
            super.b($$0, $$1, $$2);
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.b(aif2, (bgi)bfz2, l2);
        }
    }

    public static class b
    extends bhr<bsx> {
        private final int c;

        public b(int $$0) {
            super((Map<bpb<?>, bpc>)ImmutableMap.of());
            this.c = $$0 * 20;
        }

        @Override
        protected boolean a(aif $$0, bsx $$1) {
            return !$$1.aV() && $$1.gm() >= (long)this.c && !$$1.fO() && $$1.ay() && !$$1.cM();
        }

        protected void a(aif $$0, bsx $$1, long $$2) {
            if ($$1.gg()) {
                $$1.gk();
            } else if (!$$1.fY()) {
                $$1.gj();
            }
        }

        @Override
        protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
            this.a(aif2, (bsx)bfz2, l2);
        }
    }
}

