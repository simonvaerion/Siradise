/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class bxm<E extends bxe> {
    public static bhs<bfz> a(int $$0) {
        return bld.a($$1 -> $$1.group($$1.b(bpb.ac), $$1.a(bpb.K)).apply((Applicative)$$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
            if (!$$5.eP().b()) {
                return false;
            }
            Optional $$7 = $$1.a($$3);
            if ($$7.isPresent() && ((bvh)$$7.get()).a((bfj)$$5, (double)$$0)) {
                return false;
            }
            $$2.b();
            return true;
        }));
    }
}

