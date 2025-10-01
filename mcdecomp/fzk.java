/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

@FunctionalInterface
public interface fzk {
    public static final fzk a = ($$0, $$1) -> {};

    default public fzk decorate(Consumer<fzo.a> $$0) {
        return ($$1, $$22) -> this.send($$1, $$2 -> {
            $$22.accept($$2);
            $$0.accept((fzo.a)$$2);
        });
    }

    public void send(fzl var1, Consumer<fzo.a> var2);
}

