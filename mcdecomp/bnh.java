/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bnh
extends bmv {
    protected final bgi a;
    private final double b;
    @Nullable
    private dxt c;
    private gu d;
    private final boolean e;
    private final List<gu> f = Lists.newArrayList();
    private final int g;
    private final BooleanSupplier h;

    public bnh(bgi $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
        this.a = $$0;
        this.b = $$1;
        this.e = $$2;
        this.g = $$3;
        this.h = $$4;
        this.a(EnumSet.of(bmv.a.a));
        if (!bqr.a($$0)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    @Override
    public boolean a() {
        gu $$1;
        if (!bqr.a(this.a)) {
            return false;
        }
        this.h();
        if (this.e && this.a.dI().N()) {
            return false;
        }
        aif $$02 = (aif)this.a.dI();
        if (!$$02.a($$1 = this.a.di(), 6)) {
            return false;
        }
        eei $$22 = bqt.a(this.a, 15, 7, $$2 -> {
            if (!$$02.b((gu)$$2)) {
                return Double.NEGATIVE_INFINITY;
            }
            Optional<gu> $$3 = $$02.w().d($$0 -> $$0.a(ang.b), this::a, (gu)$$2, 10, bqz.b.b);
            return $$3.map($$1 -> -$$1.j($$1)).orElse(Double.NEGATIVE_INFINITY);
        });
        if ($$22 == null) {
            return false;
        }
        Optional<gu> $$3 = $$02.w().d($$0 -> $$0.a(ang.b), this::a, gu.a($$22), 10, bqz.b.b);
        if ($$3.isEmpty()) {
            return false;
        }
        this.d = $$3.get().i();
        bpi $$4 = (bpi)this.a.J();
        boolean $$5 = $$4.f();
        $$4.b(this.h.getAsBoolean());
        this.c = $$4.a(this.d, 0);
        $$4.b($$5);
        if (this.c == null) {
            eei $$6 = bqq.a(this.a, 10, 7, eei.c(this.d), 1.5707963705062866);
            if ($$6 == null) {
                return false;
            }
            $$4.b(this.h.getAsBoolean());
            this.c = this.a.J().a($$6.c, $$6.d, $$6.e, 0);
            $$4.b($$5);
            if (this.c == null) {
                return false;
            }
        }
        for (int $$7 = 0; $$7 < this.c.e(); ++$$7) {
            dxr $$8 = this.c.a($$7);
            gu $$9 = new gu($$8.a, $$8.b + 1, $$8.c);
            if (!crp.a(this.a.dI(), $$9)) continue;
            this.c = this.a.J().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
            break;
        }
        return this.c != null;
    }

    @Override
    public boolean b() {
        if (this.a.J().l()) {
            return false;
        }
        return !this.d.a(this.a.dg(), (double)(this.a.dd() + (float)this.g));
    }

    @Override
    public void c() {
        this.a.J().a(this.c, this.b);
    }

    @Override
    public void d() {
        if (this.a.J().l() || this.d.a(this.a.dg(), (double)this.g)) {
            this.f.add(this.d);
        }
    }

    private boolean a(gu $$0) {
        for (gu $$1 : this.f) {
            if (!Objects.equals($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    private void h() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}

