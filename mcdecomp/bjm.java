/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bjm {
    private static final float b = 0.95f;
    public static final int a = 3;

    public static bhs<bfz> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.e)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
            dcb $$6;
            if ($$2.z.i() <= 0.95f) {
                return false;
            }
            gu $$5 = ((hd)$$0.b($$1)).b();
            if ($$5.a($$3.di(), 3.0) && ($$6 = $$2.a_($$5)).a(cpo.od)) {
                cpj $$7 = (cpj)$$6.b();
                $$7.a($$3, (cmm)$$2, $$5, null);
            }
            return true;
        }));
    }
}

