/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bjg
extends bhr<btg> {
    public static final int c = 200;
    public static final float d = 1.65f;
    private final Function<btg, bdi> e;
    private final bqm f;
    private final float g;
    private final ToDoubleFunction<btg> h;
    private eei i;
    private final Function<btg, amg> j;
    private final Function<btg, amg> k;

    public bjg(Function<btg, bdi> $$0, bqm $$1, float $$2, ToDoubleFunction<btg> $$3, Function<btg, amg> $$4, Function<btg, amg> $$5) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.U, (Object)((Object)bpc.b), bpb.V, (Object)((Object)bpc.a)), 200);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.j = $$4;
        this.k = $$5;
        this.i = eei.b;
    }

    @Override
    protected boolean a(aif $$0, btg $$1) {
        return $$1.dK().a(bpb.V);
    }

    @Override
    protected boolean a(aif $$0, btg $$1, long $$2) {
        return $$1.dK().a(bpb.V);
    }

    @Override
    protected void b(aif $$0, btg $$1, long $$2) {
        gu $$3 = $$1.di();
        bha<btg> $$4 = $$1.dK();
        eei $$5 = $$4.c(bpb.V).get();
        this.i = new eei((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
        $$4.a(bpb.m, new bpe($$5, this.g, 0));
    }

    @Override
    protected void c(aif $$0, btg $$1, long $$2) {
        List<bfz> $$3 = $$0.a(bfz.class, this.f, $$1, $$1.cE());
        bha<btg> $$4 = $$1.dK();
        if (!$$3.isEmpty()) {
            bfz $$5 = $$3.get(0);
            $$5.a($$0.ag().c($$1), (float)$$1.b(bhg.f));
            int $$6 = $$1.a(bfc.a) ? $$1.b(bfc.a).e() + 1 : 0;
            int $$7 = $$1.a(bfc.b) ? $$1.b(bfc.b).e() + 1 : 0;
            float $$8 = 0.25f * (float)($$6 - $$7);
            float $$9 = apa.a($$1.fa() * 1.65f, 0.2f, 3.0f) + $$8;
            float $$10 = $$5.f($$0.ag().b($$1)) ? 0.5f : 1.0f;
            $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
            this.b($$0, $$1);
            $$0.a(null, $$1, this.j.apply($$1), ami.g, 1.0f, 1.0f);
        } else if (this.c($$0, $$1)) {
            $$0.a(null, $$1, this.j.apply($$1), ami.g, 1.0f, 1.0f);
            boolean $$11 = $$1.gf();
            if ($$11) {
                $$0.a(null, $$1, this.k.apply($$1), ami.g, 1.0f, 1.0f);
            }
            this.b($$0, $$1);
        } else {
            boolean $$14;
            Optional<bpe> $$12 = $$4.c(bpb.m);
            Optional<eei> $$13 = $$4.c(bpb.V);
            boolean bl2 = $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a((ho)$$13.get(), 0.25);
            if ($$14) {
                this.b($$0, $$1);
            }
        }
    }

    private boolean c(aif $$0, btg $$1) {
        eei $$2 = $$1.dl().d(1.0, 0.0, 1.0).d();
        gu $$3 = gu.a($$1.dg().e($$2));
        return $$0.a_($$3).a(amw.cc) || $$0.a_($$3.c()).a(amw.cc);
    }

    protected void b(aif $$0, btg $$1) {
        $$0.a((bfj)$$1, (byte)59);
        $$1.dK().a(bpb.U, Integer.valueOf(this.e.apply($$1).a($$0.z)));
        $$1.dK().b(bpb.V);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (btg)bfz2, l2);
    }
}

