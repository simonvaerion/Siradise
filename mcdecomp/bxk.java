/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bxk {
    public static bhs<bfz> a(int $$0) {
        return bld.a($$1 -> $$1.group($$1.b(bpb.K), $$1.c(bpb.ac), $$1.c(bpb.af), $$1.c(bpb.ae)).apply((Applicative)$$1, ($$2, $$3, $$42, $$52) -> ($$4, $$5, $$6) -> {
            bvh $$7 = (bvh)$$1.b($$2);
            if (!bxf.a($$7.j())) {
                return false;
            }
            $$3.a(true, $$0);
            return true;
        }));
    }
}

