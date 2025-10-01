/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 */
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class ebu {
    private final Set<ebt<?>> a;
    private final Set<ebt<?>> b;

    ebu(Set<ebt<?>> $$0, Set<ebt<?>> $$1) {
        this.a = ImmutableSet.copyOf($$0);
        this.b = ImmutableSet.copyOf((Collection)Sets.union($$0, $$1));
    }

    public boolean a(ebt<?> $$0) {
        return this.b.contains($$0);
    }

    public Set<ebt<?>> a() {
        return this.a;
    }

    public Set<ebt<?>> b() {
        return this.b;
    }

    public String toString() {
        return "[" + Joiner.on((String)", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
    }

    public void a(dzv $$0, dzl $$1) {
        Set<ebt<?>> $$2 = $$1.a();
        Sets.SetView $$3 = Sets.difference($$2, this.b);
        if (!$$3.isEmpty()) {
            $$0.a("Parameters " + (Set)$$3 + " are not provided in this context");
        }
    }

    public static a c() {
        return new a();
    }

    public static class a {
        private final Set<ebt<?>> a = Sets.newIdentityHashSet();
        private final Set<ebt<?>> b = Sets.newIdentityHashSet();

        public a a(ebt<?> $$0) {
            if (this.b.contains($$0)) {
                throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
            }
            this.a.add($$0);
            return this;
        }

        public a b(ebt<?> $$0) {
            if (this.a.contains($$0)) {
                throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
            }
            this.b.add($$0);
            return this;
        }

        public ebu a() {
            return new ebu(this.a, this.b);
        }
    }
}

