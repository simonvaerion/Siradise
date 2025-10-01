/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class bkt {
    private static final int a = 16;

    public static bhs<bfz> a(Predicate<he<brc>> $$0, bpb<hd> $$1) {
        return bld.a($$22 -> $$22.group($$22.b($$1)).apply((Applicative)$$22, $$2 -> ($$3, $$4, $$5) -> {
            hd $$6 = (hd)$$22.b($$2);
            gu $$7 = $$6.b();
            if ($$3.ac() != $$6.a() || !$$7.a($$4.dg(), 16.0)) {
                return false;
            }
            aif $$8 = $$3.n().a($$6.a());
            if ($$8 == null || !$$8.w().a($$7, $$0)) {
                $$2.b();
            } else if (bkt.a($$8, $$7, $$4)) {
                $$2.b();
                $$3.w().b($$7);
                za.c($$3, $$7);
            }
            return true;
        }));
    }

    private static boolean a(aif $$0, gu $$1, bfz $$2) {
        dcb $$3 = $$0.a_($$1);
        return $$3.a(amw.R) && $$3.c(cpg.b) != false && !$$2.fy();
    }
}

