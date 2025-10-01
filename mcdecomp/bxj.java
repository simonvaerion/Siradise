/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bxj {
    public static bhs<bfz> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.o), $$0.a(bpb.ag)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
            bfz $$6 = (bfz)$$0.b($$1);
            if ($$6.ae() == bfn.W && $$6.es()) {
                $$2.a(true, bxf.d.a($$4.dI().z));
            }
            return true;
        }));
    }
}

