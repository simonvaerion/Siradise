/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface clw
extends cls {
    public dds w_();

    @Nullable
    public cls c(int var1, int var2);

    default public boolean a(@Nullable bfj $$0, efb $$1) {
        return true;
    }

    default public boolean a(dcb $$0, gu $$1, een $$2) {
        efb $$3 = $$0.b((cls)this, $$1, $$2);
        return $$3.b() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
    }

    default public boolean f(bfj $$0) {
        return this.a($$0, eey.a($$0.cE()));
    }

    default public boolean b(eed $$0) {
        return this.a(null, $$0);
    }

    default public boolean g(bfj $$0) {
        return this.a($$0, $$0.cE());
    }

    default public boolean a(@Nullable bfj $$0, eed $$1) {
        for (efb $$2 : this.d($$0, $$1)) {
            if ($$2.b()) continue;
            return false;
        }
        if (!this.b($$0, $$1).isEmpty()) {
            return false;
        }
        if ($$0 != null) {
            efb $$3 = this.g($$0, $$1);
            return $$3 == null || !eey.c($$3, eey.a($$1), eem.i);
        }
        return true;
    }

    public List<efb> b(@Nullable bfj var1, eed var2);

    default public Iterable<efb> c(@Nullable bfj $$0, eed $$1) {
        List<efb> $$2 = this.b($$0, $$1);
        Iterable $$3 = this.d($$0, $$1);
        return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
    }

    default public Iterable<efb> d(@Nullable bfj $$0, eed $$1) {
        return () -> new clq<efb>(this, $$0, $$1, false, ($$0, $$1) -> $$1);
    }

    @Nullable
    private efb g(bfj $$0, eed $$1) {
        dds $$2 = this.w_();
        return $$2.a($$0, $$1) ? $$2.c() : null;
    }

    default public boolean e(@Nullable bfj $$02, eed $$12) {
        clq<efb> $$2 = new clq<efb>(this, $$02, $$12, true, ($$0, $$1) -> $$1);
        while ($$2.hasNext()) {
            if (((efb)$$2.next()).b()) continue;
            return true;
        }
        return false;
    }

    default public Optional<gu> f(bfj $$02, eed $$12) {
        gu $$2 = null;
        double $$3 = Double.MAX_VALUE;
        clq<gu> $$4 = new clq<gu>(this, $$02, $$12, false, ($$0, $$1) -> $$0);
        while ($$4.hasNext()) {
            gu $$5 = (gu)$$4.next();
            double $$6 = $$5.b($$02.dg());
            if (!($$6 < $$3) && ($$6 != $$3 || $$2 != null && $$2.i($$5) >= 0)) continue;
            $$2 = $$5.i();
            $$3 = $$6;
        }
        return Optional.ofNullable($$2);
    }

    default public Optional<eei> a(@Nullable bfj $$02, efb $$1, eei $$2, double $$32, double $$4, double $$5) {
        if ($$1.b()) {
            return Optional.empty();
        }
        eed $$6 = $$1.a().c($$32, $$4, $$5);
        efb $$7 = StreamSupport.stream(this.d($$02, $$6).spliterator(), false).filter($$0 -> this.w_() == null || this.w_().a($$0.a())).flatMap($$0 -> $$0.d().stream()).map($$3 -> $$3.c($$32 / 2.0, $$4 / 2.0, $$5 / 2.0)).map(eey::a).reduce(eey.a(), eey::a);
        efb $$8 = eey.a($$1, $$7, eem.e);
        return $$8.a($$2);
    }
}

