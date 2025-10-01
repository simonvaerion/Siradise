/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Interner
 *  com.google.common.collect.Interners
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record anl<T>(acp<? extends hr<T>> a, acq b) {
    private static final Interner<anl<?>> c = Interners.newWeakInterner();

    public static <T> Codec<anl<T>> a(acp<? extends hr<T>> $$0) {
        return acq.a.xmap($$1 -> anl.a($$0, $$1), anl::b);
    }

    public static <T> Codec<anl<T>> b(acp<? extends hr<T>> $$02) {
        return Codec.STRING.comapFlatMap($$12 -> $$12.startsWith("#") ? acq.b($$12.substring(1)).map($$1 -> anl.a($$02, $$1)) : DataResult.error(() -> "Not a tag id"), $$0 -> "#" + $$0.b);
    }

    public static <T> anl<T> a(acp<? extends hr<T>> $$0, acq $$1) {
        return (anl)c.intern(new anl<T>($$0, $$1));
    }

    public boolean c(acp<? extends hr<?>> $$0) {
        return this.a == $$0;
    }

    public <E> Optional<anl<E>> d(acp<? extends hr<E>> $$0) {
        return this.c($$0) ? Optional.of(this) : Optional.empty();
    }

    @Override
    public String toString() {
        return "TagKey[" + this.a.a() + " / " + this.b + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{anl.class, "registry;location", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{anl.class, "registry;location", "a", "b"}, this, $$0);
    }
}

