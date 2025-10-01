/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;

public class bjd {
    public static bhs<byb> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.c), $$0.b(bpb.g)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$42, $$5) -> {
            hd $$6 = (hd)$$0.b($$1);
            $$3.w().c($$6.b()).ifPresent($$4 -> ((List)$$0.b($$2)).stream().filter($$1 -> $$1 instanceof byb && $$1 != $$42).map($$0 -> (byb)$$0).filter(bfz::bs).filter($$2 -> bjd.a($$6, $$4, $$2)).reduce((byb)$$42, bjd::a));
            return true;
        }));
    }

    private static byb a(byb $$0, byb $$1) {
        byb $$5;
        byb $$4;
        if ($$0.r() > $$1.r()) {
            byb $$2 = $$0;
            byb $$3 = $$1;
        } else {
            $$4 = $$1;
            $$5 = $$0;
        }
        $$5.dK().b(bpb.c);
        return $$4;
    }

    private static boolean a(hd $$0, he<brc> $$1, byb $$2) {
        Optional<hd> $$3 = $$2.dK().c(bpb.c);
        return $$3.isPresent() && $$0.equals($$3.get()) && bjd.a($$1, $$2.gj().b());
    }

    private static boolean a(he<brc> $$0, bye $$1) {
        return $$1.b().test($$0);
    }
}

