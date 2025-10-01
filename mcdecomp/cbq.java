/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cbq {
    public static final cbq a = new cbq(){

        @Override
        public <T> Optional<T> a(BiFunction<cmm, gu, T> $$0) {
            return Optional.empty();
        }
    };

    public static cbq a(final cmm $$0, final gu $$1) {
        return new cbq(){

            @Override
            public <T> Optional<T> a(BiFunction<cmm, gu, T> $$02) {
                return Optional.of($$02.apply($$0, $$1));
            }
        };
    }

    public <T> Optional<T> a(BiFunction<cmm, gu, T> var1);

    default public <T> T a(BiFunction<cmm, gu, T> $$0, T $$1) {
        return this.a($$0).orElse($$1);
    }

    default public void a(BiConsumer<cmm, gu> $$0) {
        this.a((cmm $$1, gu $$2) -> {
            $$0.accept((cmm)$$1, (gu)$$2);
            return Optional.empty();
        });
    }
}

