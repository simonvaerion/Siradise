/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.List;

public class bkm {
    public static <E extends bfz> bjb<E> a(List<Pair<? extends blg<? super E>, Integer>> $$0) {
        return bkm.a($$0, bif.a.b, bif.b.a);
    }

    public static <E extends bfz> bjb<E> a(List<Pair<? extends blg<? super E>, Integer>> $$0, bif.a $$12, bif.b $$2) {
        bjz $$3 = new bjz();
        $$0.forEach($$1 -> $$3.a((blg)$$1.getFirst(), (Integer)$$1.getSecond()));
        return bld.a((bld.b<E> $$32) -> $$32.a(($$3, $$4, $$5) -> {
            blg $$6;
            if ($$12 == bif.a.b) {
                $$3.a();
            }
            Iterator iterator = $$3.iterator();
            while (iterator.hasNext() && (!($$6 = (blg)iterator.next()).trigger($$3, $$4, $$5) || $$2 != bif.b.a)) {
            }
            return true;
        }));
    }
}

