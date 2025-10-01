/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ano {
    public static Map<acp<? extends hr<?>>, a> a(hl<acz> $$02) {
        return hv.b($$02).map($$0 -> Pair.of($$0.a(), (Object)ano.a($$0.b()))).filter($$0 -> !((a)$$0.getSecond()).a()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
    }

    private static <T> a a(hr<T> $$0) {
        HashMap<acq, IntList> $$1 = new HashMap<acq, IntList>();
        $$0.i().forEach($$2 -> {
            hi $$3 = (hi)$$2.getSecond();
            IntArrayList $$4 = new IntArrayList($$3.b());
            for (he $$5 : $$3) {
                if ($$5.f() != he.b.a) {
                    throw new IllegalStateException("Can't serialize unregistered value " + $$5);
                }
                $$4.add($$0.a($$5.a()));
            }
            $$1.put(((anl)$$2.getFirst()).b(), (IntList)$$4);
        });
        return new a($$1);
    }

    public static <T> void a(acp<? extends hr<T>> $$0, hr<T> $$1, a $$2, b<T> $$32) {
        $$2.a.forEach(($$3, $$4) -> {
            anl $$5 = anl.a($$0, $$3);
            List $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
            $$32.accept($$5, $$6);
        });
    }

    public static final class a {
        final Map<acq, IntList> a;

        a(Map<acq, IntList> $$0) {
            this.a = $$0;
        }

        public void a(sf $$0) {
            $$0.a(this.a, sf::a, sf::a);
        }

        public static a b(sf $$0) {
            return new a($$0.a(sf::t, sf::a));
        }

        public boolean a() {
            return this.a.isEmpty();
        }
    }

    @FunctionalInterface
    public static interface b<T> {
        public void accept(anl<T> var1, List<he<T>> var2);
    }
}

