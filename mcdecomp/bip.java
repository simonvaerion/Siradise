/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.OptionalBox;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class bip {
    private static final int a = 20;
    private static final double b = 3.0;
    private static final double c = 2.0;

    public static bhs<bfz> a() {
        MutableObject $$0 = new MutableObject(null);
        MutableInt $$1 = new MutableInt(0);
        return bld.a((bld.b<E> $$2) -> $$2.group($$2.b(bpb.t), $$2.a(bpb.v), $$2.a(bpb.g)).apply((Applicative)$$2, ($$3, $$4, $$5) -> ($$62, $$7, $$8) -> {
            crp $$18;
            gu $$16;
            dcb $$17;
            dxt $$9 = (dxt)$$2.b($$3);
            Optional<Set<hd>> $$10 = $$2.a($$4);
            if ($$9.b() || $$9.c()) {
                return false;
            }
            if (Objects.equals($$0.getValue(), $$9.h())) {
                $$1.setValue(20);
            } else if ($$1.decrementAndGet() > 0) {
                return false;
            }
            $$0.setValue((Object)$$9.h());
            dxr $$11 = $$9.i();
            dxr $$12 = $$9.h();
            gu $$13 = $$11.a();
            dcb $$14 = $$62.a_($$13);
            if ($$14.a(amw.h, $$0 -> $$0.b() instanceof crp)) {
                crp $$15 = (crp)$$14.b();
                if (!$$15.h($$14)) {
                    $$15.a($$7, (cmm)$$62, $$14, $$13, true);
                }
                $$10 = bip.a($$4, $$10, $$62, $$13);
            }
            if (($$17 = $$62.a_($$16 = $$12.a())).a(amw.h, $$0 -> $$0.b() instanceof crp) && !($$18 = (crp)$$17.b()).h($$17)) {
                $$18.a($$7, (cmm)$$62, $$17, $$16, true);
                $$10 = bip.a($$4, $$10, $$62, $$16);
            }
            $$10.ifPresent($$6 -> bip.a($$62, $$7, $$11, $$12, $$6, $$2.a($$5)));
            return true;
        }));
    }

    public static void a(aif $$02, bfz $$1, @Nullable dxr $$2, @Nullable dxr $$3, Set<hd> $$4, Optional<List<bfz>> $$5) {
        Iterator<hd> $$6 = $$4.iterator();
        while ($$6.hasNext()) {
            hd $$7 = $$6.next();
            gu $$8 = $$7.b();
            if ($$2 != null && $$2.a().equals($$8) || $$3 != null && $$3.a().equals($$8)) continue;
            if (bip.a($$02, $$1, $$7)) {
                $$6.remove();
                continue;
            }
            dcb $$9 = $$02.a_($$8);
            if (!$$9.a(amw.h, $$0 -> $$0.b() instanceof crp)) {
                $$6.remove();
                continue;
            }
            crp $$10 = (crp)$$9.b();
            if (!$$10.h($$9)) {
                $$6.remove();
                continue;
            }
            if (bip.a($$1, $$8, $$5)) {
                $$6.remove();
                continue;
            }
            $$10.a($$1, (cmm)$$02, $$9, $$8, false);
            $$6.remove();
        }
    }

    private static boolean a(bfz $$0, gu $$12, Optional<List<bfz>> $$2) {
        if ($$2.isEmpty()) {
            return false;
        }
        return $$2.get().stream().filter($$1 -> $$1.ae() == $$0.ae()).filter($$1 -> $$12.a($$1.dg(), 2.0)).anyMatch($$1 -> bip.a($$1.dK(), $$12));
    }

    private static boolean a(bha<?> $$0, gu $$1) {
        if (!$$0.a(bpb.t)) {
            return false;
        }
        dxt $$2 = $$0.c(bpb.t).get();
        if ($$2.c()) {
            return false;
        }
        dxr $$3 = $$2.i();
        if ($$3 == null) {
            return false;
        }
        dxr $$4 = $$2.h();
        return $$1.equals($$3.a()) || $$1.equals($$4.a());
    }

    private static boolean a(aif $$0, bfz $$1, hd $$2) {
        return $$2.a() != $$0.ac() || !$$2.b().a($$1.dg(), 3.0);
    }

    private static Optional<Set<hd>> a(ble<OptionalBox.Mu, Set<hd>> $$0, Optional<Set<hd>> $$12, aif $$2, gu $$3) {
        hd $$4 = hd.a($$2.ac(), $$3);
        return Optional.of($$12.map($$1 -> {
            $$1.add($$4);
            return $$1;
        }).orElseGet(() -> {
            HashSet $$2 = Sets.newHashSet((Object[])new hd[]{$$4});
            $$0.a($$2);
            return $$2;
        }));
    }
}

