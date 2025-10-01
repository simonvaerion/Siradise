/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bjf<E extends bgi>
extends bhr<E> {
    public static final int c = 160;
    private final ToIntFunction<E> d;
    private final int e;
    private final int f;
    private final float g;
    private final bqm h;
    private final int i;
    private final Function<E, amg> j;
    private Optional<Long> k = Optional.empty();
    private Optional<a> l = Optional.empty();

    public bjf(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, bqm $$4, int $$5, Function<E, amg> $$6) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.c), bpb.U, (Object)((Object)bpc.b), bpb.h, (Object)((Object)bpc.a), bpb.V, (Object)((Object)bpc.b)), 160);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
    }

    protected void a(aif $$0, bgi $$13, long $$2) {
        bha<?> $$3 = $$13.dK();
        $$3.c(bpb.h).flatMap($$12 -> $$12.a($$1 -> this.h.a($$13, (bfz)$$1))).ifPresent($$1 -> this.b($$13, (bfz)$$1));
    }

    @Override
    protected void b(aif $$0, E $$1, long $$2) {
        bha<eei> $$3 = ((bfz)$$1).dK();
        if (!$$3.a(bpb.V)) {
            $$0.a((bfj)$$1, (byte)59);
            $$3.a(bpb.U, Integer.valueOf(this.d.applyAsInt($$1)));
        }
    }

    protected boolean c(aif $$0, bgi $$1, long $$2) {
        return this.l.isPresent() && this.l.get().c().bs();
    }

    @Override
    protected void d(aif $$0, E $$1, long $$2) {
        boolean $$3;
        if (this.l.isEmpty()) {
            return;
        }
        ((bfz)$$1).dK().a(bpb.m, new bpe(this.l.get().a(), this.g, 0));
        ((bfz)$$1).dK().a(bpb.n, new bic(this.l.get().c(), true));
        boolean bl2 = $$3 = !this.l.get().c().di().equals(this.l.get().b());
        if ($$3) {
            $$0.a((bfj)$$1, (byte)59);
            ((bgb)$$1).J().n();
            this.b((bgi)$$1, this.l.get().c);
        } else {
            gu $$4 = ((bfj)$$1).di();
            if ($$4.equals(this.l.get().a())) {
                $$0.a((bfj)$$1, (byte)58);
                if (this.k.isEmpty()) {
                    this.k = Optional.of($$2);
                }
                if ($$2 - this.k.get() >= (long)this.i) {
                    ((bfz)$$1).dK().a(bpb.V, this.a($$4, this.l.get().b()));
                    $$0.a(null, (bfj)$$1, this.j.apply($$1), ami.g, 1.0f, ((bfz)$$1).eS());
                    this.l = Optional.empty();
                }
            }
        }
    }

    private eei a(gu $$0, gu $$1) {
        double $$2 = 0.5;
        double $$3 = 0.5 * (double)apa.j((double)($$1.u() - $$0.u()));
        double $$4 = 0.5 * (double)apa.j((double)($$1.w() - $$0.w()));
        return eei.c($$1).b($$3, 0.0, $$4);
    }

    private Optional<gu> a(bgi $$0, bfz $$12) {
        gu $$2 = $$12.di();
        if (!this.a($$0, $$2)) {
            return Optional.empty();
        }
        ArrayList $$3 = Lists.newArrayList();
        gu.a $$4 = $$2.j();
        for (ha $$5 : ha.c.a) {
            $$4.g($$2);
            for (int $$6 = 0; $$6 < this.f; ++$$6) {
                if (this.a($$0, (gu)$$4.c($$5))) continue;
                $$4.c($$5.g());
                break;
            }
            if ($$4.k($$2) < this.e) continue;
            $$3.add($$4.i());
        }
        bpj $$7 = $$0.J();
        return $$3.stream().sorted(Comparator.comparingDouble($$0.di()::j)).filter($$1 -> {
            dxt $$2 = $$7.a((gu)$$1, 0);
            return $$2 != null && $$2.j();
        }).findFirst();
    }

    private boolean a(bgi $$0, gu $$1) {
        return $$0.J().a($$1) && $$0.a(dxy.a((cls)$$0.dI(), $$1.j())) == 0.0f;
    }

    private void b(bgi $$0, bfz $$12) {
        this.k = Optional.empty();
        this.l = this.a($$0, $$12).map($$1 -> new a((gu)$$1, $$12.di(), $$12));
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.c(aif2, (bgi)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (E)((bgi)bfz2), l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (bgi)bfz2, l2);
    }

    public static class a {
        private final gu a;
        private final gu b;
        final bfz c;

        public a(gu $$0, gu $$1, bfz $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public gu a() {
            return this.a;
        }

        public gu b() {
            return this.b;
        }

        public bfz c() {
            return this.c;
        }
    }
}

