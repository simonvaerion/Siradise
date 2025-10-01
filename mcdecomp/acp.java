/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class acp<T> {
    private static final ConcurrentMap<a, acp<?>> a = new MapMaker().weakValues().makeMap();
    private final acq b;
    private final acq c;

    public static <T> Codec<acp<T>> a(acp<? extends hr<T>> $$0) {
        return acq.a.xmap($$1 -> acp.a($$0, $$1), acp::a);
    }

    public static <T> acp<T> a(acp<? extends hr<T>> $$0, acq $$1) {
        return acp.a($$0.c, $$1);
    }

    public static <T> acp<hr<T>> a(acq $$0) {
        return acp.a(jb.a, $$0);
    }

    private static <T> acp<T> a(acq $$02, acq $$1) {
        return a.computeIfAbsent(new a($$02, $$1), $$0 -> new acp($$0.a, $$0.b));
    }

    private acp(acq $$0, acq $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public String toString() {
        return "ResourceKey[" + this.b + " / " + this.c + "]";
    }

    public boolean b(acp<? extends hr<?>> $$0) {
        return this.b.equals($$0.a());
    }

    public <E> Optional<acp<E>> c(acp<? extends hr<E>> $$0) {
        return this.b($$0) ? Optional.of(this) : Optional.empty();
    }

    public acq a() {
        return this.c;
    }

    public acq b() {
        return this.b;
    }

    static final class a
    extends Record {
        final acq a;
        final acq b;

        a(acq $$0, acq $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "registry;location", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "registry;location", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "registry;location", "a", "b"}, this, $$0);
        }

        public acq a() {
            return this.a;
        }

        public acq b() {
            return this.b;
        }
    }
}

