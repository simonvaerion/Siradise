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
import javax.annotation.Nullable;

public class bja
extends bhr<bgb> {
    private static final int c = 40;
    private int d;
    @Nullable
    private dxt e;
    @Nullable
    private gu f;
    private float g;

    public bja() {
        this(150, 250);
    }

    public bja(int $$0, int $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.E, (Object)((Object)bpc.c), bpb.t, (Object)((Object)bpc.b), bpb.m, (Object)((Object)bpc.a)), $$0, $$1);
    }

    @Override
    protected boolean a(aif $$0, bgb $$1) {
        if (this.d > 0) {
            --this.d;
            return false;
        }
        bha<?> $$2 = $$1.dK();
        bpe $$3 = $$2.c(bpb.m).get();
        boolean $$4 = this.a($$1, $$3);
        if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
        }
        $$2.b(bpb.m);
        if ($$4) {
            $$2.b(bpb.E);
        }
        return false;
    }

    @Override
    protected boolean a(aif $$0, bgb $$1, long $$2) {
        if (this.e == null || this.f == null) {
            return false;
        }
        Optional<bpe> $$3 = $$1.dK().c(bpb.m);
        boolean $$4 = $$3.map(bja::a).orElse(false);
        bpj $$5 = $$1.J();
        return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
    }

    @Override
    protected void b(aif $$0, bgb $$1, long $$2) {
        if ($$1.dK().a(bpb.m) && !this.a($$1, $$1.dK().c(bpb.m).get()) && $$1.J().s()) {
            this.d = $$0.y_().a(40);
        }
        $$1.J().n();
        $$1.dK().b(bpb.m);
        $$1.dK().b(bpb.t);
        this.e = null;
    }

    @Override
    protected void c(aif $$0, bgb $$1, long $$2) {
        $$1.dK().a(bpb.t, this.e);
        $$1.J().a(this.e, (double)this.g);
    }

    @Override
    protected void d(aif $$0, bgb $$1, long $$2) {
        dxt $$3 = $$1.J().j();
        bha<?> $$4 = $$1.dK();
        if (this.e != $$3) {
            this.e = $$3;
            $$4.a(bpb.t, $$3);
        }
        if ($$3 == null || this.f == null) {
            return;
        }
        bpe $$5 = $$4.c(bpb.m).get();
        if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
        }
    }

    private boolean a(bgb $$0, bpe $$1, long $$2) {
        gu $$3 = $$1.a().b();
        this.e = $$0.J().a($$3, 0);
        this.g = $$1.b();
        bha<Long> $$4 = $$0.dK();
        if (this.a($$0, $$1)) {
            $$4.b(bpb.E);
        } else {
            boolean $$5;
            boolean bl2 = $$5 = this.e != null && this.e.j();
            if ($$5) {
                $$4.b(bpb.E);
            } else if (!$$4.a(bpb.E)) {
                $$4.a(bpb.E, Long.valueOf($$2));
            }
            if (this.e != null) {
                return true;
            }
            eei $$6 = bqq.a((bgi)$$0, 10, 7, eei.c($$3), 1.5707963705062866);
            if ($$6 != null) {
                this.e = $$0.J().a($$6.c, $$6.d, $$6.e, 0);
                return this.e != null;
            }
        }
        return false;
    }

    private boolean a(bgb $$0, bpe $$1) {
        return $$1.a().b().k($$0.di()) <= $$1.c();
    }

    private static boolean a(bpe $$0) {
        bje $$1 = $$0.a();
        if ($$1 instanceof bic) {
            bic $$2 = (bic)$$1;
            return $$2.c().G_();
        }
        return false;
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bgb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bgb)bfz2, l2);
    }
}

