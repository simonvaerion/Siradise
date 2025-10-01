/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bhm
extends bhr<bgi> {
    private static final int c = 100;
    private static final int d = 120;
    private static final int e = 5;
    private static final int f = 4;
    private static final Predicate<bgi> g = $$0 -> $$0.ed() != null || $$0.dx() || $$0.bL();
    private final float h;
    private final Predicate<bgi> i;

    public bhm(float $$0) {
        this($$0, g);
    }

    public bhm(float $$0, Predicate<bgi> $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.Y, (Object)((Object)bpc.c), bpb.x, (Object)((Object)bpc.a)), 100, 120);
        this.h = $$0;
        this.i = $$1;
    }

    @Override
    protected boolean a(aif $$0, bgi $$1) {
        return this.i.test($$1);
    }

    @Override
    protected boolean a(aif $$0, bgi $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(aif $$0, bgi $$1, long $$2) {
        $$1.dK().a(bpb.Y, true);
        $$1.dK().b(bpb.m);
    }

    @Override
    protected void c(aif $$0, bgi $$1, long $$2) {
        bha<?> $$3 = $$1.dK();
        $$3.b(bpb.Y);
    }

    @Override
    protected void d(aif $$0, bgi $$1, long $$2) {
        eei $$3;
        if ($$1.J().l() && ($$3 = this.a($$1, $$0)) != null) {
            $$1.dK().a(bpb.m, new bpe($$3, this.h, 0));
        }
    }

    @Nullable
    private eei a(bgi $$0, aif $$1) {
        Optional<eei> $$2;
        if ($$0.bL() && ($$2 = this.a((cls)$$1, (bfj)$$0).map(eei::c)).isPresent()) {
            return $$2.get();
        }
        return bqt.a($$0, 5, 4);
    }

    private Optional<gu> a(cls $$0, bfj $$13) {
        Predicate<gu> $$4;
        gu $$2 = $$13.di();
        if (!$$0.a_($$2).k($$0, $$2).b()) {
            return Optional.empty();
        }
        if (apa.f($$13.dd()) == 2) {
            Predicate<gu> $$3 = $$12 -> gu.a($$12).allMatch($$1 -> $$0.b_((gu)$$1).a(anb.a));
        } else {
            $$4 = $$1 -> $$0.b_((gu)$$1).a(anb.a);
        }
        return gu.a($$2, 5, 1, $$4);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bgi)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bgi)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bgi)bfz2, l2);
    }
}

