/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class bhn {
    public static bhs<byb> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.d), $$0.a(bpb.c)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
            hd $$6 = (hd)$$0.b($$1);
            if (!$$6.b().a($$4.dg(), 2.0) && !$$4.gi()) {
                return false;
            }
            $$1.b();
            $$2.a($$6);
            $$3.a((bfj)$$4, (byte)14);
            if ($$4.gj().b() != bye.b) {
                return true;
            }
            MinecraftServer $$7 = $$3.n();
            Optional.ofNullable($$7.a($$6.a())).flatMap($$1 -> $$1.w().c($$6.b())).flatMap($$0 -> jb.A.s().filter($$1 -> $$1.b().test((he<brc>)$$0)).findFirst()).ifPresent($$2 -> {
                $$4.a($$4.gj().a((bye)$$2));
                $$4.c($$3);
            });
            return true;
        }));
    }
}

