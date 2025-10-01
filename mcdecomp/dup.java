/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.LinkedList;
import java.util.Optional;

public class dup
extends dsa {
    public static final Codec<dup> d = dup.a(dup::new);

    public dup(dsa.c $$0) {
        super($$0);
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        cvz $$1 = cvz.a($$0.f());
        gu $$2 = this.a($$0, $$1);
        if ($$2.v() < 60) {
            return Optional.empty();
        }
        return Optional.of(new dsa.b($$2, $$3 -> this.a((dss)$$3, $$0, $$2, $$1)));
    }

    private void a(dss $$0, dsa.a $$1, gu $$2, cvz $$3) {
        LinkedList $$4 = Lists.newLinkedList();
        duo.a($$1.e(), $$2, $$3, $$4, $$1.f());
        $$4.forEach($$0::a);
    }

    @Override
    public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, dsp $$6) {
        gu.a $$7 = new gu.a();
        int $$8 = $$0.C_();
        drs $$9 = $$6.b();
        int $$10 = $$9.h();
        for (int $$11 = $$4.g(); $$11 <= $$4.j(); ++$$11) {
            block1: for (int $$12 = $$4.i(); $$12 <= $$4.l(); ++$$12) {
                $$7.d($$11, $$10, $$12);
                if ($$0.t($$7) || !$$9.b($$7) || !$$6.a($$7)) continue;
                for (int $$13 = $$10 - 1; $$13 > $$8; --$$13) {
                    $$7.q($$13);
                    if (!$$0.t($$7) && !$$0.a_($$7).k()) continue block1;
                    $$0.a((gu)$$7, cpo.m.n(), 2);
                }
            }
        }
    }

    @Override
    public dsj<?> e() {
        return dsj.p;
    }
}

