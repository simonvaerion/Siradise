/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fwq
implements AutoCloseable {
    private final Map<acq, a> a;

    public fwq(Map<acq, acq> $$0, fuw $$12) {
        this.a = $$0.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$1 -> {
            fuu $$2 = new fuu((acq)$$1.getKey());
            $$12.a((acq)$$1.getKey(), $$2);
            return new a($$2, (acq)$$1.getValue());
        }));
    }

    public fuu a(acq $$0) {
        return this.a.get($$0).a();
    }

    @Override
    public void close() {
        this.a.values().forEach(a::close);
        this.a.clear();
    }

    public Map<acq, CompletableFuture<b>> a(akx $$0, int $$1, Executor $$2) {
        return this.a.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$3 -> {
            a $$4 = (a)$$3.getValue();
            return fuq.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1 -> new b($$0.a, (fuq.a)$$1));
        }));
    }

    static final class a
    extends Record
    implements AutoCloseable {
        final fuu a;
        final acq b;

        a(fuu $$0, acq $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void close() {
            this.a.f();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "atlas;atlasInfoLocation", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "atlas;atlasInfoLocation", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "atlas;atlasInfoLocation", "a", "b"}, this, $$0);
        }

        public fuu a() {
            return this.a;
        }

        public acq b() {
            return this.b;
        }
    }

    public static class b {
        private final fuu a;
        private final fuq.a b;

        public b(fuu $$0, fuq.a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Nullable
        public fuv a(acq $$0) {
            return this.b.f().get($$0);
        }

        public fuv a() {
            return this.b.e();
        }

        public CompletableFuture<Void> b() {
            return this.b.g();
        }

        public void c() {
            this.a.a(this.b);
        }
    }
}

