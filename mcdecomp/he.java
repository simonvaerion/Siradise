/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface he<T> {
    public T a();

    public boolean b();

    public boolean a(acq var1);

    public boolean a(acp<T> var1);

    public boolean a(Predicate<acp<T>> var1);

    public boolean a(anl<T> var1);

    public Stream<anl<T>> c();

    public Either<acp<T>, T> d();

    public Optional<acp<T>> e();

    public b f();

    public boolean a(hh<T> var1);

    public static <T> he<T> a(T $$0) {
        return new a<T>($$0);
    }

    public record a<T>(T a) implements he<T>
    {
        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean a(acq $$0) {
            return false;
        }

        @Override
        public boolean a(acp<T> $$0) {
            return false;
        }

        @Override
        public boolean a(anl<T> $$0) {
            return false;
        }

        @Override
        public boolean a(Predicate<acp<T>> $$0) {
            return false;
        }

        @Override
        public Either<acp<T>, T> d() {
            return Either.right(this.a);
        }

        @Override
        public Optional<acp<T>> e() {
            return Optional.empty();
        }

        @Override
        public b f() {
            return b.b;
        }

        @Override
        public String toString() {
            return "Direct{" + this.a + "}";
        }

        @Override
        public boolean a(hh<T> $$0) {
            return true;
        }

        @Override
        public Stream<anl<T>> c() {
            return Stream.of(new anl[0]);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value", "a"}, this, $$0);
        }
    }

    public static class c<T>
    implements he<T> {
        private final hh<T> a;
        private Set<anl<T>> b = Set.of();
        private final a c;
        @Nullable
        private acp<T> d;
        @Nullable
        private T e;

        private c(a $$0, hh<T> $$1, @Nullable acp<T> $$2, @Nullable T $$3) {
            this.a = $$1;
            this.c = $$0;
            this.d = $$2;
            this.e = $$3;
        }

        public static <T> c<T> a(hh<T> $$0, acp<T> $$1) {
            return new c<Object>(a.a, $$0, $$1, null);
        }

        @Deprecated
        public static <T> c<T> a(hh<T> $$0, @Nullable T $$1) {
            return new c<T>(a.b, $$0, null, $$1);
        }

        public acp<T> g() {
            if (this.d == null) {
                throw new IllegalStateException("Trying to access unbound value '" + this.e + "' from registry " + this.a);
            }
            return this.d;
        }

        @Override
        public T a() {
            if (this.e == null) {
                throw new IllegalStateException("Trying to access unbound value '" + this.d + "' from registry " + this.a);
            }
            return this.e;
        }

        @Override
        public boolean a(acq $$0) {
            return this.g().a().equals($$0);
        }

        @Override
        public boolean a(acp<T> $$0) {
            return this.g() == $$0;
        }

        @Override
        public boolean a(anl<T> $$0) {
            return this.b.contains($$0);
        }

        @Override
        public boolean a(Predicate<acp<T>> $$0) {
            return $$0.test(this.g());
        }

        @Override
        public boolean a(hh<T> $$0) {
            return this.a.a($$0);
        }

        @Override
        public Either<acp<T>, T> d() {
            return Either.left(this.g());
        }

        @Override
        public Optional<acp<T>> e() {
            return Optional.of(this.g());
        }

        @Override
        public b f() {
            return he$b.a;
        }

        @Override
        public boolean b() {
            return this.d != null && this.e != null;
        }

        void b(acp<T> $$0) {
            if (this.d != null && $$0 != this.d) {
                throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
            }
            this.d = $$0;
        }

        void b(T $$0) {
            if (this.c == a.b && this.e != $$0) {
                throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
            }
            this.e = $$0;
        }

        void a(Collection<anl<T>> $$0) {
            this.b = Set.copyOf($$0);
        }

        @Override
        public Stream<anl<T>> c() {
            return this.b.stream();
        }

        public String toString() {
            return "Reference{" + this.d + "=" + this.e + "}";
        }

        static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            private static final /* synthetic */ a[] c;

            public static a[] values() {
                return (a[])c.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                c = he$c$a.a();
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = he$b.a();
        }
    }
}

