/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class ddb
extends dde<Integer> {
    private final ImmutableSet<Integer> a;
    private final int b;
    private final int c;

    protected ddb(String $$0, int $$1, int $$2) {
        super($$0, Integer.class);
        if ($$1 < 0) {
            throw new IllegalArgumentException("Min value of " + $$0 + " must be 0 or greater");
        }
        if ($$2 <= $$1) {
            throw new IllegalArgumentException("Max value of " + $$0 + " must be greater than min (" + $$1 + ")");
        }
        this.b = $$1;
        this.c = $$2;
        HashSet $$3 = Sets.newHashSet();
        for (int $$4 = $$1; $$4 <= $$2; ++$$4) {
            $$3.add($$4);
        }
        this.a = ImmutableSet.copyOf((Collection)$$3);
    }

    @Override
    public Collection<Integer> a() {
        return this.a;
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof ddb && super.equals($$0)) {
            ddb $$1 = (ddb)$$0;
            return this.a.equals($$1.a);
        }
        return false;
    }

    @Override
    public int b() {
        return 31 * super.b() + this.a.hashCode();
    }

    public static ddb a(String $$0, int $$1, int $$2) {
        return new ddb($$0, $$1, $$2);
    }

    @Override
    public Optional<Integer> b(String $$0) {
        try {
            Integer $$1 = Integer.valueOf($$0);
            return $$1 >= this.b && $$1 <= this.c ? Optional.of($$1) : Optional.empty();
        }
        catch (NumberFormatException $$2) {
            return Optional.empty();
        }
    }

    @Override
    public String a(Integer $$0) {
        return $$0.toString();
    }
}

