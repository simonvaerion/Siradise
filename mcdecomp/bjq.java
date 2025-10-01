/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

@Deprecated
public class bjq {
    public static bhs<bfz> a(float $$02, bdi $$1) {
        return bjq.a($$02, $$1, (bfz $$0) -> true);
    }

    public static bhs<bfz> a(bfn<?> $$0, float $$12, bdi $$2) {
        return bjq.a($$12, $$2, (bfz $$1) -> $$0.equals($$1.ae()));
    }

    private static bhs<bfz> a(float $$0, bdi $$1, Predicate<bfz> $$2) {
        float $$32 = $$0 * $$0;
        a $$4 = new a($$1);
        return bld.a((bld.b<E> $$3) -> $$3.group($$3.c(bpb.n), $$3.b(bpb.h)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            Optional<bfz> $$9 = ((bpd)$$3.b($$5)).a($$2.and($$2 -> $$2.f($$7) <= (double)$$32));
            if ($$9.isEmpty()) {
                return false;
            }
            if (!$$4.a($$6.z)) {
                return false;
            }
            $$4.a(new bic($$9.get(), true));
            return true;
        }));
    }

    public static final class a {
        private final bdi a;
        private int b;

        public a(bdi $$0) {
            if ($$0.a() <= 1) {
                throw new IllegalArgumentException();
            }
            this.a = $$0;
        }

        public boolean a(apf $$0) {
            if (this.b == 0) {
                this.b = this.a.a($$0) - 1;
                return false;
            }
            return --this.b == 0;
        }
    }
}

