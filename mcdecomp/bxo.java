/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bxo {
    public static bhs<bxe> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.c(bpb.ac)).apply((Applicative)$$0, $$02 -> ($$0, $$1, $$2) -> {
            if ($$1.eP().b() || $$1.eP().a(cgc.uy)) {
                return false;
            }
            bxf.a($$1, true);
            return true;
        }));
    }
}

