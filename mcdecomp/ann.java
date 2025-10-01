/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class ann
implements akr {
    private static final Map<acp<? extends hr<?>>, String> a = Map.of(jc.e, "tags/blocks", jc.s, "tags/entity_types", jc.w, "tags/fluids", jc.z, "tags/game_events", jc.D, "tags/items");
    private final hs b;
    private List<a<?>> c = List.of();

    public ann(hs $$0) {
        this.b = $$0;
    }

    public List<a<?>> a() {
        return this.c;
    }

    public static String a(acp<? extends hr<?>> $$0) {
        String $$1 = a.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        return "tags/" + $$0.a().a();
    }

    @Override
    public CompletableFuture<Void> a(akr.a $$0, akx $$12, ban $$22, ban $$3, Executor $$4, Executor $$5) {
        List<CompletableFuture> $$6 = this.b.b().map($$2 -> this.a($$12, $$4, (hs.d)$$2)).toList();
        return ((CompletableFuture)CompletableFuture.allOf((CompletableFuture[])$$6.toArray(CompletableFuture[]::new)).thenCompose($$0::a)).thenAcceptAsync($$1 -> {
            this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList());
        }, $$5);
    }

    private <T> CompletableFuture<a<T>> a(akx $$0, Executor $$1, hs.d<T> $$22) {
        acp $$3 = $$22.a();
        hr $$4 = $$22.b();
        anm $$5 = new anm($$2 -> $$4.b(acp.a($$3, $$2)), ann.a($$3));
        return CompletableFuture.supplyAsync(() -> new a($$3, $$5.b($$0)), $$1);
    }

    public record a<T>(acp<? extends hr<T>> a, Map<acq, Collection<he<T>>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "key;tags", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "key;tags", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "key;tags", "a", "b"}, this, $$0);
        }
    }
}

