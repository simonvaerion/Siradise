/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class bxn {
    public static bhs<bfz> a(int $$0, int $$1) {
        return bld.a($$2 -> $$2.group($$2.b(bpb.ac), $$2.b(bpb.K), $$2.a(bpb.ad), $$2.a(bpb.ae)).apply((Applicative)$$2, ($$3, $$4, $$5, $$62) -> ($$6, $$7, $$8) -> {
            if (!$$7.eP().b()) {
                return false;
            }
            Optional $$9 = $$2.a($$5);
            if ($$9.isEmpty()) {
                $$5.a(0);
            } else {
                int $$10 = (Integer)$$9.get();
                if ($$10 > $$0) {
                    $$3.b();
                    $$5.b();
                    $$62.a(true, $$1);
                } else {
                    $$5.a($$10 + 1);
                }
            }
            return true;
        }));
    }
}

