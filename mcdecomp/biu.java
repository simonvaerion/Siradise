/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class biu<E extends bgb>
extends bhr<E> {
    protected static final int c = 20;
    private static final int m = 40;
    protected static final int d = 8;
    private static final int n = 200;
    private static final List<Integer> o = Lists.newArrayList((Object[])new Integer[]{65, 70, 75, 80});
    private final bdi p;
    protected final int e;
    protected final int f;
    protected final float g;
    protected List<a> h = Lists.newArrayList();
    protected Optional<eei> i = Optional.empty();
    @Nullable
    protected eei j;
    protected int k;
    protected long l;
    private final Function<E, amg> q;
    private final BiPredicate<E, gu> r;

    public biu(bdi $$0, int $$1, int $$2, float $$3, Function<E, amg> $$4) {
        this($$0, $$1, $$2, $$3, $$4, biu::a);
    }

    public static <E extends bgb> boolean a(E $$0, gu $$1) {
        gu $$3;
        cmm $$2 = $$0.dI();
        return $$2.a_($$3 = $$1.d()).i($$2, $$3) && $$0.a(dxy.a((cls)$$2, $$1.j())) == 0.0f;
    }

    public biu(bdi $$0, int $$1, int $$2, float $$3, Function<E, amg> $$4, BiPredicate<E, gu> $$5) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.c), bpb.R, (Object)((Object)bpc.b), bpb.S, (Object)((Object)bpc.b)), 200);
        this.p = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.q = $$4;
        this.r = $$5;
    }

    @Override
    protected boolean a(aif $$0, bgb $$1) {
        boolean $$2;
        boolean bl2 = $$2 = $$1.ay() && !$$1.aV() && !$$1.bi() && !$$0.a_($$1.di()).a(cpo.pg);
        if (!$$2) {
            $$1.dK().a(bpb.R, Integer.valueOf(this.p.a($$0.z) / 2));
        }
        return $$2;
    }

    protected boolean b(aif $$0, bgb $$1, long $$2) {
        boolean $$3;
        boolean bl2 = $$3 = this.i.isPresent() && this.i.get().equals($$1.dg()) && this.k > 0 && !$$1.aY() && (this.j != null || !this.h.isEmpty());
        if (!$$3 && $$1.dK().c(bpb.S).isEmpty()) {
            $$1.dK().a(bpb.R, Integer.valueOf(this.p.a($$0.z) / 2));
            $$1.dK().b(bpb.n);
        }
        return $$3;
    }

    protected void a(aif $$0, E $$12, long $$2) {
        this.j = null;
        this.k = 20;
        this.i = Optional.of(((bfj)$$12).dg());
        gu $$3 = ((bfj)$$12).di();
        int $$4 = $$3.u();
        int $$5 = $$3.v();
        int $$6 = $$3.w();
        this.h = gu.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f).filter($$1 -> !$$1.equals($$3)).map($$1 -> new a($$1.i(), apa.c($$3.j((hz)$$1)))).collect(Collectors.toCollection(Lists::newArrayList));
    }

    @Override
    protected void c(aif $$0, E $$1, long $$2) {
        if (this.j != null) {
            if ($$2 - this.l >= 40L) {
                ((bfj)$$1).a_(((bgb)$$1).aV);
                ((bfz)$$1).p(true);
                double $$3 = this.j.f();
                double $$4 = $$3 + (double)((bfz)$$1).eV();
                ((bfj)$$1).f(this.j.a($$4 / $$3));
                ((bfz)$$1).dK().a(bpb.S, true);
                $$0.a(null, (bfj)$$1, this.q.apply($$1), ami.g, 1.0f, 1.0f);
            }
        } else {
            --this.k;
            this.d($$0, $$1, $$2);
        }
    }

    @Override
    protected void d(aif $$0, E $$1, long $$2) {
        while (!this.h.isEmpty()) {
            eei $$6;
            eei $$7;
            a $$4;
            gu $$5;
            Optional<a> $$3 = this.a($$0);
            if ($$3.isEmpty() || !this.a($$0, $$1, $$5 = ($$4 = $$3.get()).b()) || ($$7 = this.a((bgb)$$1, $$6 = eei.b($$5))) == null) continue;
            ((bfz)$$1).dK().a(bpb.n, new bhu($$5));
            bpj $$8 = ((bgb)$$1).J();
            dxt $$9 = $$8.a($$5, 0, 8);
            if ($$9 != null && $$9.j()) continue;
            this.j = $$7;
            this.l = $$2;
            return;
        }
    }

    protected Optional<a> a(aif $$0) {
        Optional<a> $$1 = bck.a($$0.z, this.h);
        $$1.ifPresent(this.h::remove);
        return $$1;
    }

    private boolean a(aif $$0, E $$1, gu $$2) {
        gu $$3 = ((bfj)$$1).di();
        int $$4 = $$3.u();
        int $$5 = $$3.w();
        if ($$4 == $$2.u() && $$5 == $$2.w()) {
            return false;
        }
        return this.r.test($$1, $$2);
    }

    @Nullable
    protected eei a(bgb $$0, eei $$1) {
        ArrayList $$2 = Lists.newArrayList(o);
        Collections.shuffle($$2);
        Iterator iterator = $$2.iterator();
        while (iterator.hasNext()) {
            int $$3 = (Integer)iterator.next();
            eei $$4 = this.a($$0, $$1, $$3);
            if ($$4 == null) continue;
            return $$4;
        }
        return null;
    }

    @Nullable
    private eei a(bgb $$0, eei $$1, int $$2) {
        eei $$3 = $$0.dg();
        eei $$4 = new eei($$1.c - $$3.c, 0.0, $$1.e - $$3.e).d().a(0.5);
        $$1 = $$1.d($$4);
        eei $$5 = $$1.d($$3);
        float $$6 = (float)$$2 * (float)Math.PI / 180.0f;
        double $$7 = Math.atan2($$5.e, $$5.c);
        double $$8 = $$5.a(0.0, $$5.d, 0.0).g();
        double $$9 = Math.sqrt($$8);
        double $$10 = $$5.d;
        double $$11 = Math.sin(2.0f * $$6);
        double $$12 = 0.08;
        double $$13 = Math.pow(Math.cos($$6), 2.0);
        double $$14 = Math.sin($$6);
        double $$15 = Math.cos($$6);
        double $$16 = Math.sin($$7);
        double $$17 = Math.cos($$7);
        double $$18 = $$8 * 0.08 / ($$9 * $$11 - 2.0 * $$10 * $$13);
        if ($$18 < 0.0) {
            return null;
        }
        double $$19 = Math.sqrt($$18);
        if ($$19 > (double)this.g) {
            return null;
        }
        double $$20 = $$19 * $$15;
        double $$21 = $$19 * $$14;
        int $$22 = apa.c($$9 / $$20) * 2;
        double $$23 = 0.0;
        eei $$24 = null;
        bfk $$25 = $$0.a(bgl.g);
        for (int $$26 = 0; $$26 < $$22 - 1; ++$$26) {
            double $$27 = $$14 / $$15 * ($$23 += $$9 / (double)$$22) - Math.pow($$23, 2.0) * 0.08 / (2.0 * $$18 * Math.pow($$15, 2.0));
            double $$28 = $$23 * $$17;
            double $$29 = $$23 * $$16;
            eei $$30 = new eei($$3.c + $$28, $$3.d + $$27, $$3.e + $$29);
            if ($$24 != null && !this.a($$0, $$25, $$24, $$30)) {
                return null;
            }
            $$24 = $$30;
        }
        return new eei($$20 * $$17, $$21, $$20 * $$16).a((double)0.95f);
    }

    private boolean a(bgb $$0, bfk $$1, eei $$2, eei $$3) {
        eei $$4 = $$3.d($$2);
        double $$5 = Math.min($$1.a, $$1.b);
        int $$6 = apa.c($$4.f() / $$5);
        eei $$7 = $$4.d();
        eei $$8 = $$2;
        for (int $$9 = 0; $$9 < $$6; ++$$9) {
            eei eei2 = $$8 = $$9 == $$6 - 1 ? $$3 : $$8.e($$7.a($$5 * (double)0.9f));
            if ($$0.dI().a((bfj)$$0, $$1.a($$8))) continue;
            return false;
        }
        return true;
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.b(aif2, (bgb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (E)((bgb)bfz2), l2);
    }

    public static class a
    extends bcj.a {
        private final gu a;

        public a(gu $$0, int $$1) {
            super($$1);
            this.a = $$0;
        }

        public gu b() {
            return this.a;
        }
    }
}

