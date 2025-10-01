/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface dzo {
    @Nullable
    public <T> T getElement(dzm<T> var1);

    @Nullable
    default public <T> T getElement(dzp<T> $$0, acq $$1) {
        return this.getElement(new dzm<T>($$0, $$1));
    }

    default public <T> Optional<T> getElementOptional(dzm<T> $$0) {
        return Optional.ofNullable(this.getElement($$0));
    }

    default public <T> Optional<T> getElementOptional(dzp<T> $$0, acq $$1) {
        return this.getElementOptional(new dzm<T>($$0, $$1));
    }

    default public dzs getLootTable(acq $$0) {
        return this.getElementOptional(dzp.c, $$0).orElse(dzs.a);
    }
}

