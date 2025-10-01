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
import java.util.Optional;
import java.util.Set;

public class bpt
extends bqf<bwy> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.h, bpb.av, bpb.ap, bpb.ao, bpb.ar, bpb.as, (Object[])new bpb[0]);
    }

    @Override
    protected void a(aif $$02, bwy $$1) {
        bha<bwy> $$2 = $$1.dK();
        $$2.a(bpb.av, this.b($$02, $$1));
        Optional<Object> $$3 = Optional.empty();
        int $$4 = 0;
        ArrayList $$5 = Lists.newArrayList();
        bpd $$6 = $$2.c(bpb.h).orElse(bpd.a());
        for (bfz $$7 : $$6.b($$0 -> !$$0.h_() && ($$0 instanceof bxe || $$0 instanceof bwy))) {
            if ($$7 instanceof bxe) {
                bxe $$8 = (bxe)$$7;
                ++$$4;
                if ($$3.isEmpty()) {
                    $$3 = Optional.of($$8);
                }
            }
            if (!($$7 instanceof bwy)) continue;
            bwy $$9 = (bwy)$$7;
            $$5.add($$9);
        }
        $$2.a(bpb.ap, $$3);
        $$2.a(bpb.ao, $$5);
        $$2.a(bpb.ar, Integer.valueOf($$4));
        $$2.a(bpb.as, Integer.valueOf($$5.size()));
    }

    private Optional<gu> b(aif $$0, bwy $$12) {
        return gu.a($$12.di(), 8, 4, $$1 -> $$0.a_((gu)$$1).a(amw.aQ));
    }
}

