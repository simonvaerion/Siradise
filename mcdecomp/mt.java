/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mt<T>
extends my<T> {
    private final Function<T, acp<T>> d;

    public mt(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, Function<T, acp<T>> $$3) {
        super($$0, $$1, $$2);
        this.d = $$3;
    }

    public mt(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<my.c<T>> $$3, Function<T, acp<T>> $$4) {
        super($$0, $$1, $$2, $$3);
        this.d = $$4;
    }

    protected a<T> a(anl<T> $$0) {
        ani $$1 = this.c($$0);
        return new a<T>($$1, this.d);
    }

    @Override
    protected /* synthetic */ my.b b(anl anl2) {
        return this.a(anl2);
    }

    protected static class a<T>
    extends my.b<T> {
        private final Function<T, acp<T>> a;

        a(ani $$0, Function<T, acp<T>> $$1) {
            super($$0);
            this.a = $$1;
        }

        @Override
        public a<T> a(anl<T> $$0) {
            super.b($$0);
            return this;
        }

        public final a<T> a(T $$0) {
            ((my.b)this).a(this.a.apply($$0));
            return this;
        }

        @SafeVarargs
        public final a<T> a(T ... $$0) {
            Stream.of($$0).map(this.a).forEach(this::a);
            return this;
        }

        @Override
        public /* synthetic */ my.b b(anl anl2) {
            return this.a((T)anl2);
        }
    }
}

