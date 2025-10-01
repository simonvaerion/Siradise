/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ccg {
    private final List<b> a;
    private final b b;

    ccg(List<b> $$0, b $$1) {
        if ($$0.isEmpty() || $$1.equals(ccg$b.e)) {
            throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
        }
        this.a = $$0;
        this.b = $$1;
    }

    public static a a() {
        return new a();
    }

    public boolean a(int $$0) {
        return this.a.size() >= $$0;
    }

    public b b(int $$0) {
        return this.a.get($$0);
    }

    public b b() {
        return this.b;
    }

    public List<b> c() {
        return this.a;
    }

    public int d() {
        return this.a.size();
    }

    public int e() {
        return this.d();
    }

    public List<Integer> f() {
        return this.a.stream().map(b::a).collect(Collectors.toList());
    }

    public record b(int a, int b, int c, Predicate<cfz> d) {
        static final b e = new b(0, 0, 0, $$0 -> true);

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public static class a {
        private final List<b> a = new ArrayList<b>();
        private b b = ccg$b.e;

        public a a(int $$0, int $$1, int $$2, Predicate<cfz> $$3) {
            this.a.add(new b($$0, $$1, $$2, $$3));
            return this;
        }

        public a a(int $$02, int $$1, int $$2) {
            this.b = new b($$02, $$1, $$2, $$0 -> false);
            return this;
        }

        public ccg a() {
            return new ccg(this.a, this.b);
        }
    }
}

