/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface der<T> {
    public T a(int var1, int var2, int var3);

    public void a(Consumer<T> var1);

    public void b(sf var1);

    public int c();

    public boolean a(Predicate<T> var1);

    public void a(deq.b<T> var1);

    public deq<T> e();

    public a<T> a(hj<T> var1, deq.d var2);

    public static interface b<T, C extends der<T>> {
        public DataResult<C> read(hj<T> var1, deq.d var2, a<T> var3);
    }

    public record a<T>(List<T> a, Optional<LongStream> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "paletteEntries;storage", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "paletteEntries;storage", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "paletteEntries;storage", "a", "b"}, this, $$0);
        }
    }
}

