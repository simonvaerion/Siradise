/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqb
extends bqf<bfz> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.h, bpb.g, bpb.L, bpb.al, bpb.at, bpb.aj, (Object[])new bpb[]{bpb.ak, bpb.an, bpb.am, bpb.ar, bpb.as, bpb.av});
    }

    @Override
    protected void a(aif $$02, bfz $$1) {
        bha<?> $$2 = $$1.dK();
        $$2.a(bpb.av, bqb.c($$02, $$1));
        Optional<Object> $$3 = Optional.empty();
        Optional<Object> $$4 = Optional.empty();
        Optional<Object> $$5 = Optional.empty();
        Optional<Object> $$6 = Optional.empty();
        Optional<Object> $$7 = Optional.empty();
        Optional<Object> $$8 = Optional.empty();
        Optional<Object> $$9 = Optional.empty();
        int $$10 = 0;
        ArrayList $$11 = Lists.newArrayList();
        ArrayList $$12 = Lists.newArrayList();
        bpd $$13 = $$2.c(bpb.h).orElse(bpd.a());
        for (bfz $$14 : $$13.b($$0 -> true)) {
            if ($$14 instanceof bwy) {
                bwy $$15 = (bwy)$$14;
                if ($$15.h_() && $$5.isEmpty()) {
                    $$5 = Optional.of($$15);
                    continue;
                }
                if (!$$15.r()) continue;
                ++$$10;
                if (!$$4.isEmpty() || !$$15.ge()) continue;
                $$4 = Optional.of($$15);
                continue;
            }
            if ($$14 instanceof bxh) {
                bxh $$16 = (bxh)$$14;
                $$11.add($$16);
                continue;
            }
            if ($$14 instanceof bxe) {
                bxe $$17 = (bxe)$$14;
                if ($$17.h_() && $$6.isEmpty()) {
                    $$6 = Optional.of($$17);
                    continue;
                }
                if (!$$17.fZ()) continue;
                $$11.add($$17);
                continue;
            }
            if ($$14 instanceof byo) {
                byo $$18 = (byo)$$14;
                if ($$8.isEmpty() && !bxf.a($$18) && $$1.c($$14)) {
                    $$8 = Optional.of($$18);
                }
                if (!$$9.isEmpty() || $$18.G_() || !bxf.b($$18)) continue;
                $$9 = Optional.of($$18);
                continue;
            }
            if ($$3.isEmpty() && ($$14 instanceof bwt || $$14 instanceof buv)) {
                $$3 = Optional.of((bgb)$$14);
                continue;
            }
            if (!$$7.isEmpty() || !bxf.a($$14.ae())) continue;
            $$7 = Optional.of($$14);
        }
        List<bfz> $$19 = $$2.c(bpb.g).orElse((List<bfz>)ImmutableList.of());
        for (bfz $$20 : $$19) {
            bxd $$21;
            if (!($$20 instanceof bxd) || !($$21 = (bxd)$$20).fZ()) continue;
            $$12.add($$21);
        }
        $$2.a(bpb.L, $$3);
        $$2.a(bpb.aj, $$4);
        $$2.a(bpb.ak, $$5);
        $$2.a(bpb.aq, $$7);
        $$2.a(bpb.al, $$8);
        $$2.a(bpb.at, $$9);
        $$2.a(bpb.am, $$12);
        $$2.a(bpb.an, $$11);
        $$2.a(bpb.ar, Integer.valueOf($$11.size()));
        $$2.a(bpb.as, Integer.valueOf($$10));
    }

    private static Optional<gu> c(aif $$0, bfz $$12) {
        return gu.a($$12.di(), 8, 4, $$1 -> bqb.a($$0, $$1));
    }

    private static boolean a(aif $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        boolean $$3 = $$2.a(amw.V);
        if ($$3 && $$2.a(cpo.oh)) {
            return cqa.g($$2);
        }
        return $$3;
    }
}

