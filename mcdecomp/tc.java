/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.serialization.Codec
 */
import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public final class tc
extends Record {
    private final List<th> d;
    public static final Codec<tc> a = th.a.listOf().xmap(tc::new, tc::a);
    public static tc b = new tc(List.of());
    public static final int c = 20;

    public tc(List<th> $$0) {
        this.d = $$0;
    }

    public void a(api.a $$0) throws SignatureException {
        $$0.update(Ints.toByteArray((int)this.d.size()));
        for (th $$1 : this.d) {
            $$0.update($$1.b());
        }
    }

    public a a(ti $$0) {
        return new a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tc.class, "entries", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tc.class, "entries", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tc.class, "entries", "d"}, this, $$0);
    }

    public List<th> a() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final List<th.a> b;
        public static final a a = new a(List.of());

        public a(sf $$0) {
            this($$0.a(sf.a(ArrayList::new, 20), th.a::a));
        }

        public a(List<th.a> $$0) {
            this.b = $$0;
        }

        public void a(sf $$0) {
            $$0.a(this.b, th.a::a);
        }

        public Optional<tc> a(ti $$0) {
            ArrayList<th> $$1 = new ArrayList<th>(this.b.size());
            for (th.a $$2 : this.b) {
                Optional<th> $$3 = $$2.a($$0);
                if ($$3.isEmpty()) {
                    return Optional.empty();
                }
                $$1.add($$3.get());
            }
            return Optional.of(new tc($$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entries", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entries", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entries", "b"}, this, $$0);
        }

        public List<th.a> a() {
            return this.b;
        }
    }

    public record b(int a, BitSet b) {
        public b(sf $$0) {
            this($$0.m(), $$0.f(20));
        }

        public void a(sf $$0) {
            $$0.d(this.a);
            $$0.a(this.b, 20);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "offset;acknowledged", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "offset;acknowledged", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "offset;acknowledged", "a", "b"}, this, $$0);
        }
    }
}

