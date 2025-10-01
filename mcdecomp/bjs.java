/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class bjs {
    public static bhs<bfz> a(bfn<?> $$0, int $$1) {
        int $$22 = $$1 * $$1;
        return bld.a($$2 -> $$2.group($$2.a(bpb.n), $$2.c(bpb.q), $$2.b(bpb.h)).apply((Applicative)$$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            Optional<bfz> $$9 = ((bpd)$$2.b($$5)).a($$3 -> $$3.f($$7) <= (double)$$22 && $$0.equals($$3.ae()));
            if ($$9.isEmpty()) {
                return false;
            }
            bfz $$10 = $$9.get();
            $$4.a($$10);
            $$3.a(new bic($$10, true));
            return true;
        }));
    }
}

