/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public interface hi<T>
extends Iterable<he<T>> {
    public Stream<he<T>> a();

    public int b();

    public Either<anl<T>, List<he<T>>> c();

    public Optional<he<T>> a(apf var1);

    public he<T> a(int var1);

    public boolean a(he<T> var1);

    public boolean a(hh<T> var1);

    public Optional<anl<T>> d();

    @Deprecated
    @VisibleForTesting
    public static <T> c<T> a(hh<T> $$0, anl<T> $$1) {
        return new c<T>($$0, $$1);
    }

    @SafeVarargs
    public static <T> a<T> a(he<T> ... $$0) {
        return new a<T>(List.of($$0));
    }

    public static <T> a<T> a(List<? extends he<T>> $$0) {
        return new a(List.copyOf($$0));
    }

    @SafeVarargs
    public static <E, T> a<T> a(Function<E, he<T>> $$0, E ... $$1) {
        return hi.a(Stream.of($$1).map($$0).toList());
    }

    public static <E, T> a<T> a(Function<E, he<T>> $$0, List<E> $$1) {
        return hi.a($$1.stream().map($$0).toList());
    }

    public static class c<T>
    extends b<T> {
        private final hh<T> a;
        private final anl<T> b;
        private List<he<T>> c = List.of();

        c(hh<T> $$0, anl<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        void b(List<he<T>> $$0) {
            this.c = List.copyOf($$0);
        }

        public anl<T> f() {
            return this.b;
        }

        @Override
        protected List<he<T>> e() {
            return this.c;
        }

        @Override
        public Either<anl<T>, List<he<T>>> c() {
            return Either.left(this.b);
        }

        @Override
        public Optional<anl<T>> d() {
            return Optional.of(this.b);
        }

        @Override
        public boolean a(he<T> $$0) {
            return $$0.a(this.b);
        }

        public String toString() {
            return "NamedSet(" + this.b + ")[" + this.c + "]";
        }

        @Override
        public boolean a(hh<T> $$0) {
            return this.a.a($$0);
        }
    }

    public static class a<T>
    extends b<T> {
        private final List<he<T>> a;
        @Nullable
        private Set<he<T>> b;

        a(List<he<T>> $$0) {
            this.a = $$0;
        }

        @Override
        protected List<he<T>> e() {
            return this.a;
        }

        @Override
        public Either<anl<T>, List<he<T>>> c() {
            return Either.right(this.a);
        }

        @Override
        public Optional<anl<T>> d() {
            return Optional.empty();
        }

        @Override
        public boolean a(he<T> $$0) {
            if (this.b == null) {
                this.b = Set.copyOf(this.a);
            }
            return this.b.contains($$0);
        }

        public String toString() {
            return "DirectSet[" + this.a + "]";
        }
    }

    public static abstract class b<T>
    implements hi<T> {
        protected abstract List<he<T>> e();

        @Override
        public int b() {
            return this.e().size();
        }

        @Override
        public Spliterator<he<T>> spliterator() {
            return this.e().spliterator();
        }

        @Override
        public Iterator<he<T>> iterator() {
            return this.e().iterator();
        }

        @Override
        public Stream<he<T>> a() {
            return this.e().stream();
        }

        @Override
        public Optional<he<T>> a(apf $$0) {
            return ac.b(this.e(), $$0);
        }

        @Override
        public he<T> a(int $$0) {
            return this.e().get($$0);
        }

        @Override
        public boolean a(hh<T> $$0) {
            return true;
        }
    }
}

