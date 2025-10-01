/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class esr<T> {
    private final T b;
    private final BiConsumer<Consumer<String>, T> c;
    public static final esr<?> a = new esr<apz>(apz.a, ($$0, $$1) -> {});

    private esr(T $$0, BiConsumer<Consumer<String>, T> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static esr<?> a(String $$0) {
        return new esr<String>($$0, Consumer::accept);
    }

    public static esr<?> a(sw $$02) {
        return new esr<sw>($$02, ($$0, $$1) -> $$0.accept($$1.getString()));
    }

    public static esr<?> a(List<sw> $$0) {
        return new esr<List>($$0, ($$1, $$2) -> $$0.stream().map(sw::getString).forEach((Consumer<String>)$$1));
    }

    public void a(Consumer<String> $$0) {
        this.c.accept($$0, (Consumer<String>)this.b);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof esr) {
            esr $$1 = (esr)$$0;
            return $$1.c == this.c && $$1.b.equals(this.b);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.b.hashCode();
        $$0 = 31 * $$0 + this.c.hashCode();
        return $$0;
    }
}

