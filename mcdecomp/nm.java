/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.Lifecycle;

public interface nm<T> {
    public he.c<T> a(acp<T> var1, T var2, Lifecycle var3);

    default public he.c<T> a(acp<T> $$0, T $$1) {
        return this.a($$0, $$1, Lifecycle.stable());
    }

    public <S> hf<S> a(acp<? extends hr<? extends S>> var1);
}

