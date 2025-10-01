/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface cyp
extends cqn<a> {
    public static final Supplier<BiMap<cpn, cpn>> u_ = Suppliers.memoize(() -> ImmutableBiMap.builder().put((Object)cpo.qM, (Object)cpo.qL).put((Object)cpo.qL, (Object)cpo.qK).put((Object)cpo.qK, (Object)cpo.qJ).put((Object)cpo.qS, (Object)cpo.qR).put((Object)cpo.qR, (Object)cpo.qQ).put((Object)cpo.qQ, (Object)cpo.qP).put((Object)cpo.ra, (Object)cpo.qZ).put((Object)cpo.qZ, (Object)cpo.qY).put((Object)cpo.qY, (Object)cpo.qX).put((Object)cpo.qW, (Object)cpo.qV).put((Object)cpo.qV, (Object)cpo.qU).put((Object)cpo.qU, (Object)cpo.qT).build());
    public static final Supplier<BiMap<cpn, cpn>> v_ = Suppliers.memoize(() -> u_.get().inverse());

    public static Optional<cpn> a(cpn $$0) {
        return Optional.ofNullable((cpn)v_.get().get((Object)$$0));
    }

    public static cpn b(cpn $$0) {
        cpn $$1 = $$0;
        cpn $$2 = (cpn)v_.get().get((Object)$$1);
        while ($$2 != null) {
            $$1 = $$2;
            $$2 = (cpn)v_.get().get((Object)$$1);
        }
        return $$1;
    }

    public static Optional<dcb> b(dcb $$0) {
        return cyp.a($$0.b()).map($$1 -> $$1.l($$0));
    }

    public static Optional<cpn> c(cpn $$0) {
        return Optional.ofNullable((cpn)u_.get().get((Object)$$0));
    }

    public static dcb c(dcb $$0) {
        return cyp.b($$0.b()).l($$0);
    }

    @Override
    default public Optional<dcb> i_(dcb $$0) {
        return cyp.c($$0.b()).map($$1 -> $$1.l($$0));
    }

    @Override
    default public float a() {
        if (this.b() == a.a) {
            return 0.75f;
        }
        return 1.0f;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cyp$a.a();
        }
    }
}

