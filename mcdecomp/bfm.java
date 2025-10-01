/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  javax.annotation.Nullable
 */
import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bfm {
    public static final Predicate<bfj> a = bfj::bs;
    public static final Predicate<bfj> b = $$0 -> $$0.bs() && $$0 instanceof bfz;
    public static final Predicate<bfj> c = $$0 -> $$0.bs() && !$$0.bN() && !$$0.bM();
    public static final Predicate<bfj> d = $$0 -> $$0 instanceof bdq && $$0.bs();
    public static final Predicate<bfj> e = $$0 -> !($$0 instanceof byo) || !$$0.G_() && !((byo)$$0).f();
    public static final Predicate<bfj> f = $$0 -> !$$0.G_();
    public static final Predicate<bfj> g = f.and(bfj::bu);

    private bfm() {
    }

    public static Predicate<bfj> a(double $$0, double $$1, double $$2, double $$3) {
        double $$42 = $$3 * $$3;
        return $$4 -> $$4 != null && $$4.i($$0, $$1, $$2) <= $$42;
    }

    public static Predicate<bfj> a(bfj $$0) {
        efi.a $$2;
        efi $$1 = $$0.cd();
        efi.a a2 = $$2 = $$1 == null ? efi.a.a : $$1.l();
        if ($$2 == efi.a.b) {
            return Predicates.alwaysFalse();
        }
        return f.and($$3 -> {
            boolean $$6;
            efi.a $$5;
            if (!$$3.bp()) {
                return false;
            }
            if (!(!$$0.dI().B || $$3 instanceof byo && ((byo)$$3).g())) {
                return false;
            }
            efi $$4 = $$3.cd();
            efi.a a2 = $$5 = $$4 == null ? efi.a.a : $$4.l();
            if ($$5 == efi.a.b) {
                return false;
            }
            boolean bl2 = $$6 = $$1 != null && $$1.a($$4);
            if (($$2 == efi.a.d || $$5 == efi.a.d) && $$6) {
                return false;
            }
            return $$2 != efi.a.c && $$5 != efi.a.c || $$6;
        });
    }

    public static Predicate<bfj> b(bfj $$0) {
        return $$1 -> {
            while ($$1.bM()) {
                if (($$1 = $$1.cW()) != $$0) continue;
                return false;
            }
            return true;
        };
    }

    public static class a
    implements Predicate<bfj> {
        private final cfz a;

        public a(cfz $$0) {
            this.a = $$0;
        }

        public boolean a(@Nullable bfj $$0) {
            if (!$$0.bs()) {
                return false;
            }
            if (!($$0 instanceof bfz)) {
                return false;
            }
            bfz $$1 = (bfz)$$0;
            return $$1.f(this.a);
        }

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((bfj)object);
        }
    }
}

