/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bkq {
    public static bhs<bfz> a(cpn $$0) {
        return bld.a((bld.b<E> $$12) -> $$12.group($$12.c(bpb.o), $$12.b(bpb.m), $$12.b(bpb.X)).apply((Applicative)$$12, ($$1, $$22, $$32) -> ($$2, $$3, $$4) -> {
            if ($$3.aV() || !$$3.ay()) {
                return false;
            }
            gu $$5 = $$3.di().d();
            for (ha $$6 : ha.c.a) {
                gu $$8;
                gu $$7 = $$5.a($$6);
                if (!$$2.a_($$7).k($$2, $$7).a(ha.b).b() || !$$2.b_($$7).b(dxf.c) || !$$2.a_($$8 = $$7.c()).i()) continue;
                dcb $$9 = $$0.n();
                $$2.a($$8, $$9, 3);
                $$2.a(dgl.i, $$8, dgl.a.a($$3, $$9));
                $$2.a(null, $$3, amh.iI, ami.e, 1.0f, 1.0f);
                $$32.b();
                return true;
            }
            return true;
        }));
    }
}

