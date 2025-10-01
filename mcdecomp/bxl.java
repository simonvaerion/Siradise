/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bxl {
    public static bjb<bxe> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.aj), $$0.c(bpb.aa), $$0.c(bpb.ag), $$0.a(bpb.an)).apply((Applicative)$$0, ($$1, $$2, $$32, $$42) -> ($$3, $$4, $$5) -> {
            if ($$4.h_() || $$0.a($$42).map($$0 -> $$0.stream().anyMatch(bxl::a)).isPresent()) {
                return false;
            }
            bwy $$6 = (bwy)$$0.b($$1);
            bxf.c((bxd)$$4, (bfz)$$6);
            bxf.c((bxd)$$4);
            bxf.b((bxd)$$4, (bfz)$$6);
            $$0.a($$42).ifPresent($$0 -> $$0.forEach(bxf::c));
            return true;
        }));
    }

    private static boolean a(bxd $$0) {
        return $$0.dK().a(bpb.ag);
    }
}

