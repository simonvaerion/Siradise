/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public final class dw
extends Record {
    private final List<a> b;
    public static final dw a = new dw(List.of());
    private static final int c = 8;
    private static final int d = 16;

    public dw(sf $$0) {
        this($$0.a(sf.a(ArrayList::new, 8), a::new));
    }

    public dw(List<a> $$0) {
        this.b = $$0;
    }

    @Nullable
    public th a(String $$0) {
        for (a $$1 : this.b) {
            if (!$$1.a.equals($$0)) continue;
            return $$1.b;
        }
        return null;
    }

    public void a(sf $$02) {
        $$02.a(this.b, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    public static dw a(tn<?> $$0, b $$12) {
        List<a> $$2 = $$0.a().stream().map($$1 -> {
            th $$2 = $$12.sign($$1.c());
            if ($$2 != null) {
                return new a($$1.a(), $$2);
            }
            return null;
        }).filter(Objects::nonNull).toList();
        return new dw($$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dw.class, "entries", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dw.class, "entries", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dw.class, "entries", "b"}, this, $$0);
    }

    public List<a> a() {
        return this.b;
    }

    public static final class a
    extends Record {
        final String a;
        final th b;

        public a(sf $$0) {
            this($$0.e(16), th.a($$0));
        }

        public a(String $$0, th $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public void a(sf $$0) {
            $$0.a(this.a, 16);
            th.a($$0, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public th b() {
            return this.b;
        }
    }

    @FunctionalInterface
    public static interface b {
        @Nullable
        public th sign(String var1);
    }
}

