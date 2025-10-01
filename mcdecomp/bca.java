/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bca {
    private final Set<String> a = new ObjectOpenHashSet();

    public Set<bbs> a(Supplier<bal> $$02) {
        Set<bbs> $$12 = $$02.get().e().stream().filter($$0 -> !this.a.contains($$0.getLeft())).map($$1 -> bca.a($$02, (String)$$1.getLeft(), (bbr)((Object)((Object)$$1.getRight())))).collect(Collectors.toSet());
        for (bbs $$2 : $$12) {
            this.a.add($$2.d());
        }
        return $$12;
    }

    private static bbs a(Supplier<bal> $$0, String $$1, bbr $$2) {
        return bbs.a($$1, $$2, () -> {
            bag.a $$2 = ((bal)$$0.get()).c($$1);
            return $$2 == null ? 0.0 : (double)$$2.b() / (double)apw.b;
        });
    }
}

