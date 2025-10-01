/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bjk {
    public static bhs<byb> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.c(bpb.c)).apply((Applicative)$$0, $$02 -> ($$0, $$1, $$2) -> {
            byc $$3 = $$1.gj();
            if ($$3.b() != bye.b && $$3.b() != bye.m && $$1.r() == 0 && $$3.c() <= 1) {
                $$1.a($$1.gj().a(bye.b));
                $$1.c($$0);
                return true;
            }
            return false;
        }));
    }
}

