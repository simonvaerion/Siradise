/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;

public class bqd
extends bqf<byb> {
    private static final int a = 40;

    public bqd() {
        super(40);
    }

    @Override
    protected void a(aif $$0, byb $$1) {
        acp<cmm> $$2 = $$0.ac();
        gu $$3 = $$1.di();
        ArrayList $$4 = Lists.newArrayList();
        int $$5 = 4;
        for (int $$6 = -4; $$6 <= 4; ++$$6) {
            for (int $$7 = -2; $$7 <= 2; ++$$7) {
                for (int $$8 = -4; $$8 <= 4; ++$$8) {
                    gu $$9 = $$3.b($$6, $$7, $$8);
                    if (!$$1.gj().b().e().contains((Object)$$0.a_($$9).b())) continue;
                    $$4.add(hd.a($$2, $$9));
                }
            }
        }
        bha<byb> $$10 = $$1.dK();
        if (!$$4.isEmpty()) {
            $$10.a(bpb.f, $$4);
        } else {
            $$10.b(bpb.f);
        }
    }

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.f);
    }
}

