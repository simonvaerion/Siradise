/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bhq {
    public static bhs<bfz> a(bpb<?> $$0, int $$1) {
        return bld.a((bld.b<E> $$22) -> $$22.group($$22.a(bpb.o), $$22.c(bpb.aw), $$22.b($$0)).apply((Applicative)$$22, $$22.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1, $$2, $$32) -> ($$3, $$4, $$5) -> {
            $$2.a(true, $$1);
            $$1.b();
            return true;
        })));
    }
}

