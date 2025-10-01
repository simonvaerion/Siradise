/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bir {
    public static bjb<bfz> a(int $$0, float $$1, int $$2) {
        return bld.a((bld.b<E> $$3) -> $$3.group($$3.c(bpb.m), $$3.a(bpb.b), $$3.a(bpb.C), $$3.a(bpb.t), $$3.a(bpb.n), $$3.a(bpb.r), $$3.a(bpb.q)).apply((Applicative)$$3, ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
            $$11.w().d($$0 -> $$0.a(brd.n), $$0 -> true, $$12.di(), $$2 + 1, bqz.b.c).filter($$2 -> $$2.a($$12.dg(), (double)$$2)).or(() -> $$11.w().a($$0 -> $$0.a(brd.n), $$0 -> true, bqz.b.c, $$12.di(), $$0, $$12.ec())).or(() -> $$3.a($$5).map(hd::b)).ifPresent($$10 -> {
                $$7.b();
                $$8.b();
                $$9.b();
                $$10.b();
                $$6.a(hd.a($$11.ac(), $$10));
                if (!$$10.a($$12.dg(), (double)$$2)) {
                    $$4.a(new bpe((gu)$$10, $$1, $$2));
                }
            });
            return true;
        }));
    }
}

