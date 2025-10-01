/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.UUID;

public class bkg {
    public static bhs<bfz> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.aa)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
            Optional.ofNullable($$2.a((UUID)$$0.b($$1))).map($$0 -> {
                bfz $$1;
                return $$0 instanceof bfz ? ($$1 = (bfz)$$0) : null;
            }).filter(bfz::es).filter($$1 -> $$1.ae() != bfn.bt || $$2.X().b(cmi.J)).ifPresent($$1 -> $$1.b());
            return true;
        }));
    }
}

