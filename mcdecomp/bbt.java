/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bbt {
    public static final bbt a = new bbt();
    private final WeakHashMap<bbv, Void> b = new WeakHashMap();

    private bbt() {
    }

    public void a(bbv $$0) {
        this.b.put($$0, null);
    }

    public List<bbs> a() {
        Map<String, List<bbs>> $$02 = this.b.keySet().stream().flatMap($$0 -> $$0.bk().stream()).collect(Collectors.groupingBy(bbs::d));
        return bbt.a($$02);
    }

    private static List<bbs> a(Map<String, List<bbs>> $$02) {
        return $$02.entrySet().stream().map($$0 -> {
            String $$1 = (String)$$0.getKey();
            List $$2 = (List)$$0.getValue();
            return $$2.size() > 1 ? new a($$1, $$2) : (bbs)$$2.get(0);
        }).collect(Collectors.toList());
    }

    static class a
    extends bbs {
        private final List<bbs> b;

        a(String $$0, List<bbs> $$1) {
            super($$0, $$1.get(0).e(), () -> bbt$a.c($$1), () -> bbt$a.b($$1), bbt$a.a($$1));
            this.b = $$1;
        }

        private static bbs.c a(List<bbs> $$0) {
            return $$12 -> $$0.stream().anyMatch($$1 -> {
                if ($$1.a != null) {
                    return $$1.a.test($$12);
                }
                return false;
            });
        }

        private static void b(List<bbs> $$0) {
            for (bbs $$1 : $$0) {
                $$1.a();
            }
        }

        private static double c(List<bbs> $$0) {
            double $$1 = 0.0;
            for (bbs $$2 : $$0) {
                $$1 += $$2.c().getAsDouble();
            }
            return $$1 / (double)$$0.size();
        }

        @Override
        public boolean equals(@Nullable Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            if (!super.equals($$0)) {
                return false;
            }
            a $$1 = (a)$$0;
            return this.b.equals($$1.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), this.b);
        }
    }
}

