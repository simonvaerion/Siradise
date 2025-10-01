/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;

public class bkd {
    public static bhs<bfz> a(int $$0, BiPredicate<bfz, bfz> $$1) {
        return bld.a($$2 -> $$2.group($$2.b(bpb.o), $$2.a(bpb.aa), $$2.c(bpb.ah), $$2.a(bpb.ai)).apply((Applicative)$$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
            bfz $$10 = (bfz)$$2.b($$3);
            if (!$$10.es()) {
                return false;
            }
            if ($$1.test($$8, $$10)) {
                $$6.a(true, $$0);
            }
            $$5.a($$10.di(), $$0);
            if ($$10.ae() != bfn.bt || $$7.X().b(cmi.J)) {
                $$3.b();
                $$4.b();
            }
            return true;
        }));
    }
}

