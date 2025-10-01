/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class blo {
    public static bhs<bfz> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.a(bpb.n), $$0.a(bpb.ay), $$0.a(bpb.ax), $$0.c(bpb.o)).apply((Applicative)$$0, ($$1, $$2, $$3, $$42) -> ($$4, $$5, $$6) -> {
            Optional<gu> $$7 = $$0.a($$3).map(bfj::di).or(() -> $$0.a($$2));
            if ($$7.isEmpty()) {
                return false;
            }
            $$1.a(new bhu($$7.get()));
            return true;
        }));
    }
}

