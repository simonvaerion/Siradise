/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hl<T> {
    private final List<T> a;
    private final List<hs.b> b;
    private final hs.b c;

    public hl(List<T> $$0) {
        this($$0, ac.a(() -> {
            Object[] $$1 = new hs.b[$$0.size()];
            Arrays.fill($$1, hs.b);
            return Arrays.asList($$1);
        }));
    }

    private hl(List<T> $$0, List<hs.b> $$1) {
        this.a = List.copyOf($$0);
        this.b = List.copyOf($$1);
        this.c = new hs.c(hl.a($$1.stream())).c();
    }

    private int d(T $$0) {
        int $$1 = this.a.indexOf($$0);
        if ($$1 == -1) {
            throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
        }
        return $$1;
    }

    public hs.b a(T $$0) {
        int $$1 = this.d($$0);
        return this.b.get($$1);
    }

    public hs.b b(T $$0) {
        int $$1 = this.d($$0);
        return this.a(0, $$1);
    }

    public hs.b c(T $$0) {
        int $$1 = this.d($$0);
        return this.a($$1, this.b.size());
    }

    private hs.b a(int $$0, int $$1) {
        return new hs.c(hl.a(this.b.subList($$0, $$1).stream())).c();
    }

    public hl<T> a(T $$0, hs.b ... $$1) {
        return this.a($$0, Arrays.asList($$1));
    }

    public hl<T> a(T $$0, List<hs.b> $$1) {
        int $$2 = this.d($$0);
        if ($$1.size() > this.b.size() - $$2) {
            throw new IllegalStateException("Too many values to replace");
        }
        ArrayList<hs.b> $$3 = new ArrayList<hs.b>();
        for (int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3.add(this.b.get($$4));
        }
        $$3.addAll($$1);
        while ($$3.size() < this.b.size()) {
            $$3.add(hs.b);
        }
        return new hl<T>(this.a, $$3);
    }

    public hs.b a() {
        return this.c;
    }

    private static Map<acp<? extends hr<?>>, hr<?>> a(Stream<? extends hs> $$0) {
        HashMap $$1 = new HashMap();
        $$0.forEach($$12 -> $$12.b().forEach($$1 -> {
            if ($$1.put($$1.a(), $$1.b()) != null) {
                throw new IllegalStateException("Duplicated registry " + $$1.a());
            }
        }));
        return $$1;
    }
}

