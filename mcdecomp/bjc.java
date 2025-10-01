/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bjc {
    private static final int a = 20;
    private static final int b = 8;
    private static final float c = 0.6f;
    private static final float d = 0.6f;
    private static final int e = 5;
    private static final int f = 10;

    public static bhs<bgi> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.b(bpb.i), $$0.c(bpb.m), $$0.a(bpb.n), $$0.a(bpb.q)).apply((Applicative)$$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
            if ($$5.y_().a(10) != 0) {
                return false;
            }
            List $$8 = (List)$$0.b($$1);
            Optional<bfz> $$9 = $$8.stream().filter($$1 -> bjc.a($$6, $$1)).findAny();
            if ($$9.isPresent()) {
                for (int $$10 = 0; $$10 < 10; ++$$10) {
                    eei $$11 = bqt.a($$6, 20, 8);
                    if ($$11 == null || !$$5.b(gu.a($$11))) continue;
                    $$2.a(new bpe($$11, 0.6f, 0));
                    break;
                }
                return true;
            }
            Optional<bfz> $$122 = bjc.a($$8);
            if ($$122.isPresent()) {
                bjc.a($$4, $$3, $$2, $$122.get());
                return true;
            }
            $$8.stream().findAny().ifPresent($$3 -> bjc.a($$4, $$3, $$2, $$3));
            return true;
        }));
    }

    private static void a(ble<?, bfz> $$0, ble<?, bje> $$1, ble<?, bpe> $$2, bfz $$3) {
        $$0.a($$3);
        $$1.a(new bic($$3, true));
        $$2.a(new bpe(new bic($$3, false), 0.6f, 1));
    }

    private static Optional<bfz> a(List<bfz> $$02) {
        Map<bfz, Integer> $$1 = bjc.b($$02);
        return $$1.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).filter($$0 -> (Integer)$$0.getValue() > 0 && (Integer)$$0.getValue() <= 5).map(Map.Entry::getKey).findFirst();
    }

    private static Map<bfz, Integer> b(List<bfz> $$0) {
        HashMap $$1 = Maps.newHashMap();
        $$0.stream().filter(bjc::b).forEach($$12 -> $$1.compute(bjc.a($$12), ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1));
        return $$1;
    }

    private static bfz a(bfz $$0) {
        return $$0.dK().c(bpb.q).get();
    }

    private static boolean b(bfz $$0) {
        return $$0.dK().c(bpb.q).isPresent();
    }

    private static boolean a(bfz $$0, bfz $$12) {
        return $$12.dK().c(bpb.q).filter($$1 -> $$1 == $$0).isPresent();
    }
}

