/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.function.Predicate;

public final class brc
extends Record {
    private final Set<dcb> b;
    private final int c;
    private final int d;
    public static final Predicate<he<brc>> a = $$0 -> false;

    public brc(Set<dcb> $$0, int $$1, int $$2) {
        $$0 = Set.copyOf($$0);
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public boolean a(dcb $$0) {
        return this.b.contains($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{brc.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{brc.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{brc.class, "matchingStates;maxTickets;validRange", "b", "c", "d"}, this, $$0);
    }

    public Set<dcb> a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }
}

