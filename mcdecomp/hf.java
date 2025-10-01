/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface hf<T> {
    public Optional<he.c<T>> a(acp<T> var1);

    default public he.c<T> b(acp<T> $$0) {
        return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
    }

    public Optional<hi.c<T>> a(anl<T> var1);

    default public hi.c<T> b(anl<T> $$0) {
        return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
    }

    public static interface a {
        public <T> Optional<hf<T>> a(acp<? extends hr<? extends T>> var1);

        default public <T> hf<T> b(acp<? extends hr<? extends T>> $$0) {
            return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
        }
    }
}

