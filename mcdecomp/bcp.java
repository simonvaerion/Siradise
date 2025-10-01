/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface bcp<Msg>
extends AutoCloseable {
    public String bn();

    public void a(Msg var1);

    @Override
    default public void close() {
    }

    default public <Source> CompletableFuture<Source> b(Function<? super bcp<Source>, ? extends Msg> $$0) {
        CompletableFuture $$1 = new CompletableFuture();
        Msg $$2 = $$0.apply(bcp.a("ask future procesor handle", $$1::complete));
        this.a($$2);
        return $$1;
    }

    default public <Source> CompletableFuture<Source> c(Function<? super bcp<Either<Source, Exception>>, ? extends Msg> $$0) {
        CompletableFuture $$12 = new CompletableFuture();
        Msg $$2 = $$0.apply(bcp.a("ask future procesor handle", (Msg $$1) -> {
            $$1.ifLeft($$12::complete);
            $$1.ifRight($$12::completeExceptionally);
        }));
        this.a($$2);
        return $$12;
    }

    public static <Msg> bcp<Msg> a(final String $$0, final Consumer<Msg> $$1) {
        return new bcp<Msg>(){

            @Override
            public String bn() {
                return $$0;
            }

            @Override
            public void a(Msg $$02) {
                $$1.accept($$02);
            }

            public String toString() {
                return $$0;
            }
        };
    }
}

