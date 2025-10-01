/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;

public class blc {
    public static bhs<byb> a(float $$0) {
        return bld.a((bld.b<E> $$1) -> $$1.group($$1.b(bpb.d), $$1.c(bpb.c), $$1.b(bpb.g), $$1.a(bpb.m), $$1.a(bpb.n)).apply((Applicative)$$1, ($$2, $$3, $$4, $$5, $$6) -> ($$62, $$7, $$8) -> {
            if ($$7.h_()) {
                return false;
            }
            if ($$7.gj().b() != bye.b) {
                return false;
            }
            gu $$9 = ((hd)$$1.b($$2)).b();
            Optional<he<brc>> $$10 = $$62.w().c($$9);
            if ($$10.isEmpty()) {
                return true;
            }
            ((List)$$1.b($$4)).stream().filter($$1 -> $$1 instanceof byb && $$1 != $$7).map($$0 -> (byb)$$0).filter(bfz::bs).filter($$2 -> blc.a((he)$$10.get(), $$2, $$9)).findFirst().ifPresent($$6 -> {
                $$5.b();
                $$6.b();
                $$2.b();
                if ($$6.dK().c(bpb.c).isEmpty()) {
                    bht.a((bfz)$$6, $$9, $$0, 1);
                    $$6.dK().a(bpb.d, hd.a($$62.ac(), $$9));
                    za.c($$62, $$9);
                }
            });
            return true;
        }));
    }

    private static boolean a(he<brc> $$0, byb $$1, gu $$2) {
        boolean $$3 = $$1.dK().c(bpb.d).isPresent();
        if ($$3) {
            return false;
        }
        Optional<hd> $$4 = $$1.dK().c(bpb.c);
        bye $$5 = $$1.gj().b();
        if ($$5.b().test($$0)) {
            if ($$4.isEmpty()) {
                return blc.a($$1, $$2, $$0.a());
            }
            return $$4.get().b().equals($$2);
        }
        return false;
    }

    private static boolean a(bgi $$0, gu $$1, brc $$2) {
        dxt $$3 = $$0.J().a($$1, $$2.c());
        return $$3 != null && $$3.j();
    }
}

