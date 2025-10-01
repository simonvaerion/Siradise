/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cmd {
    public List<bfj> a(@Nullable bfj var1, eed var2, Predicate<? super bfj> var3);

    public <T extends bfj> List<T> a(dfz<bfj, T> var1, eed var2, Predicate<? super T> var3);

    default public <T extends bfj> List<T> a(Class<T> $$0, eed $$1, Predicate<? super T> $$2) {
        return this.a((dfz<bfj, T>)dfz.a($$0), $$1, $$2);
    }

    public List<? extends byo> v();

    default public List<bfj> a_(@Nullable bfj $$0, eed $$1) {
        return this.a($$0, $$1, bfm.f);
    }

    default public boolean a(@Nullable bfj $$0, efb $$1) {
        if ($$1.b()) {
            return true;
        }
        for (bfj $$2 : this.a_($$0, $$1.a())) {
            if ($$2.dD() || !$$2.H || $$0 != null && $$2.v($$0) || !eey.c($$1, eey.a($$2.cE()), eem.i)) continue;
            return false;
        }
        return true;
    }

    default public <T extends bfj> List<T> a(Class<T> $$0, eed $$1) {
        return this.a($$0, $$1, bfm.f);
    }

    default public List<efb> b(@Nullable bfj $$0, eed $$1) {
        if ($$1.a() < 1.0E-7) {
            return List.of();
        }
        Predicate<bfj> $$2 = $$0 == null ? bfm.g : bfm.f.and($$0::h);
        List<bfj> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
        if ($$3.isEmpty()) {
            return List.of();
        }
        ImmutableList.Builder $$4 = ImmutableList.builderWithExpectedSize((int)$$3.size());
        for (bfj $$5 : $$3) {
            $$4.add((Object)eey.a($$5.cE()));
        }
        return $$4.build();
    }

    @Nullable
    default public byo a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bfj> $$4) {
        double $$5 = -1.0;
        byo $$6 = null;
        for (byo byo2 : this.v()) {
            if ($$4 != null && !$$4.test(byo2)) continue;
            double $$8 = byo2.i($$0, $$1, $$2);
            if (!($$3 < 0.0) && !($$8 < $$3 * $$3) || $$5 != -1.0 && !($$8 < $$5)) continue;
            $$5 = $$8;
            $$6 = byo2;
        }
        return $$6;
    }

    @Nullable
    default public byo a(bfj $$0, double $$1) {
        return this.a($$0.dn(), $$0.dp(), $$0.dt(), $$1, false);
    }

    @Nullable
    default public byo a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
        Predicate<bfj> $$5 = $$4 ? bfm.e : bfm.f;
        return this.a($$0, $$1, $$2, $$3, $$5);
    }

    default public boolean a(double $$0, double $$1, double $$2, double $$3) {
        for (byo byo2 : this.v()) {
            if (!bfm.f.test(byo2) || !bfm.b.test(byo2)) continue;
            double $$5 = byo2.i($$0, $$1, $$2);
            if (!($$3 < 0.0) && !($$5 < $$3 * $$3)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    default public byo a(bqm $$0, bfz $$1) {
        return this.a(this.v(), $$0, $$1, $$1.dn(), $$1.dp(), $$1.dt());
    }

    @Nullable
    default public byo a(bqm $$0, bfz $$1, double $$2, double $$3, double $$4) {
        return this.a(this.v(), $$0, $$1, $$2, $$3, $$4);
    }

    @Nullable
    default public byo a(bqm $$0, double $$1, double $$2, double $$3) {
        return this.a(this.v(), $$0, null, $$1, $$2, $$3);
    }

    @Nullable
    default public <T extends bfz> T a(Class<? extends T> $$02, bqm $$1, @Nullable bfz $$2, double $$3, double $$4, double $$5, eed $$6) {
        return (T)this.a(this.a($$02, $$6, (? super T $$0) -> true), $$1, $$2, $$3, $$4, $$5);
    }

    @Nullable
    default public <T extends bfz> T a(List<? extends T> $$0, bqm $$1, @Nullable bfz $$2, double $$3, double $$4, double $$5) {
        double $$6 = -1.0;
        bfz $$7 = null;
        for (bfz $$8 : $$0) {
            if (!$$1.a($$2, $$8)) continue;
            double $$9 = $$8.i($$3, $$4, $$5);
            if ($$6 != -1.0 && !($$9 < $$6)) continue;
            $$6 = $$9;
            $$7 = $$8;
        }
        return (T)$$7;
    }

    default public List<byo> a(bqm $$0, bfz $$1, eed $$2) {
        ArrayList $$3 = Lists.newArrayList();
        for (byo byo2 : this.v()) {
            if (!$$2.e(byo2.dn(), byo2.dp(), byo2.dt()) || !$$0.a($$1, byo2)) continue;
            $$3.add(byo2);
        }
        return $$3;
    }

    default public <T extends bfz> List<T> a(Class<T> $$02, bqm $$1, bfz $$2, eed $$3) {
        List<bfz> $$4 = this.a($$02, $$3, (? super T $$0) -> true);
        ArrayList $$5 = Lists.newArrayList();
        for (bfz $$6 : $$4) {
            if (!$$1.a($$2, $$6)) continue;
            $$5.add($$6);
        }
        return $$5;
    }

    @Nullable
    default public byo b(UUID $$0) {
        for (int $$1 = 0; $$1 < this.v().size(); ++$$1) {
            byo $$2 = this.v().get($$1);
            if (!$$0.equals($$2.ct())) continue;
            return $$2;
        }
        return null;
    }
}

