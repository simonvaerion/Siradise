/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bhp {
    public static bjb<bgb> a(int $$0, float $$1) {
        return bld.a($$2 -> $$2.group($$2.c(bpb.m), $$2.a(bpb.n), $$2.b(bpb.o), $$2.b(bpb.h)).apply((Applicative)$$2, ($$3, $$4, $$5, $$62) -> ($$6, $$7, $$8) -> {
            bfz $$9 = (bfz)$$2.b($$5);
            if ($$9.a((bfj)$$7, (double)$$0) && ((bpd)$$2.b($$62)).a($$9)) {
                $$4.a(new bic($$9, true));
                $$7.G().a(-$$1, 0.0f);
                $$7.a_(apa.c($$7.dy(), $$7.aX, 0.0f));
                return true;
            }
            return false;
        }));
    }
}

