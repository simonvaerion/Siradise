/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elx {
    static final Logger a = LogUtils.getLogger();
    final Executor b;
    final TimeUnit c;
    final apv d;

    public elx(Executor $$0, TimeUnit $$1, apv $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public <T> e<T> a(String $$0, Callable<T> $$1, Duration $$2, ely $$3) {
        long $$4 = this.c.convert($$2);
        if ($$4 == 0L) {
            throw new IllegalArgumentException("Period of " + $$2 + " too short for selected resolution of " + this.c);
        }
        return new e<T>($$0, $$1, $$4, $$3);
    }

    public c a() {
        return new c();
    }

    public class e<T> {
        private final String b;
        private final Callable<T> c;
        private final long d;
        private final ely e;
        @Nullable
        private CompletableFuture<a<T>> f;
        @Nullable
        d<T> g;
        private long h = -1L;

        e(String $$1, Callable<T> $$2, long $$3, ely $$4) {
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        void a(long $$0) {
            if (this.f != null) {
                a $$12 = this.f.getNow(null);
                if ($$12 == null) {
                    return;
                }
                this.f = null;
                long $$2 = $$12.b;
                $$12.a().ifLeft($$1 -> {
                    this.g = new d<Object>($$1, $$2);
                    this.h = $$2 + this.d * this.e.a();
                }).ifRight($$1 -> {
                    long $$2 = this.e.b();
                    a.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.b, $$2, $$1});
                    this.h = $$2 + this.d * $$2;
                });
            }
            if (this.h <= $$0) {
                this.f = CompletableFuture.supplyAsync(() -> {
                    try {
                        T $$0 = this.c.call();
                        long $$1 = elx.this.d.get(elx.this.c);
                        return new a(Either.left($$0), $$1);
                    }
                    catch (Exception $$2) {
                        long $$3 = elx.this.d.get(elx.this.c);
                        return new a(Either.right((Object)$$2), $$3);
                    }
                }, elx.this.b);
            }
        }

        public void a() {
            this.f = null;
            this.g = null;
            this.h = -1L;
        }
    }

    public class c {
        private final List<b<?>> b = new ArrayList();

        public <T> void a(e<T> $$0, Consumer<T> $$1) {
            b<T> $$2 = new b<T>($$0, $$1);
            this.b.add($$2);
            $$2.a();
        }

        public void a() {
            for (b<?> $$0 : this.b) {
                $$0.b();
            }
        }

        public void b() {
            for (b<?> $$0 : this.b) {
                $$0.a(elx.this.d.get(elx.this.c));
            }
        }

        public void c() {
            for (b<?> $$0 : this.b) {
                $$0.c();
            }
        }
    }

    class b<T> {
        private final e<T> b;
        private final Consumer<T> c;
        private long d = -1L;

        b(e<T> $$0, Consumer<T> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        void a(long $$0) {
            this.b.a($$0);
            this.a();
        }

        void a() {
            d $$0 = this.b.g;
            if ($$0 != null && this.d < $$0.b) {
                this.c.accept($$0.a);
                this.d = $$0.b;
            }
        }

        void b() {
            d $$0 = this.b.g;
            if ($$0 != null) {
                this.c.accept($$0.a);
                this.d = $$0.b;
            }
        }

        void c() {
            this.b.a();
            this.d = -1L;
        }
    }

    static final class d<T>
    extends Record {
        final T a;
        final long b;

        d(T $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "value;time", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "value;time", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "value;time", "a", "b"}, this, $$0);
        }

        public T a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }

    static final class a<T>
    extends Record {
        private final Either<T, Exception> a;
        final long b;

        a(Either<T, Exception> $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "value;time", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value;time", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value;time", "a", "b"}, this, $$0);
        }

        public Either<T, Exception> a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }
}

