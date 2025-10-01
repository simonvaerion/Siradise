/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface hr<T>
extends Keyable,
hj<T> {
    public acp<? extends hr<T>> c();

    default public Codec<T> q() {
        Codec $$02 = acq.a.flatXmap($$0 -> Optional.ofNullable(this.a((acq)$$0)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0)), $$0 -> this.c($$0).map(acp::a).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0)));
        Codec<Object> $$1 = aoi.a((E $$0) -> this.c($$0).isPresent() ? this.a($$0) : -1, this::a, -1);
        return aoi.a(aoi.b($$02, $$1), this::e, this::e);
    }

    default public Codec<he<T>> r() {
        Codec $$02 = acq.a.flatXmap($$0 -> this.b(acp.a(this.c(), $$0)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0)), $$0 -> $$0.e().map(acp::a).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0)));
        return aoi.a($$02, (E $$0) -> this.e($$0.a()), $$0 -> this.e($$0.a()));
    }

    default public <U> Stream<U> keys(DynamicOps<U> $$0) {
        return this.e().stream().map($$1 -> $$0.createString($$1.toString()));
    }

    @Nullable
    public acq b(T var1);

    public Optional<acp<T>> c(T var1);

    @Override
    public int a(@Nullable T var1);

    @Nullable
    public T a(@Nullable acp<T> var1);

    @Nullable
    public T a(@Nullable acq var1);

    public Lifecycle e(T var1);

    public Lifecycle d();

    default public Optional<T> b(@Nullable acq $$0) {
        return Optional.ofNullable(this.a($$0));
    }

    default public Optional<T> d(@Nullable acp<T> $$0) {
        return Optional.ofNullable(this.a($$0));
    }

    default public T e(acp<T> $$0) {
        T $$1 = this.a($$0);
        if ($$1 == null) {
            throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
        }
        return $$1;
    }

    public Set<acq> e();

    public Set<Map.Entry<acp<T>, T>> g();

    public Set<acp<T>> f();

    public Optional<he.c<T>> a(apf var1);

    default public Stream<T> s() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public boolean c(acq var1);

    public boolean c(acp<T> var1);

    public static <T> T a(hr<? super T> $$0, String $$1, T $$2) {
        return hr.a($$0, new acq($$1), $$2);
    }

    public static <V, T extends V> T a(hr<V> $$0, acq $$1, T $$2) {
        return hr.a($$0, acp.a($$0.c(), $$1), $$2);
    }

    public static <V, T extends V> T a(hr<V> $$0, acp<V> $$1, T $$2) {
        ((ia)$$0).a($$1, $$2, Lifecycle.stable());
        return $$2;
    }

    public static <T> he.c<T> b(hr<T> $$0, acp<T> $$1, T $$2) {
        return ((ia)$$0).a($$1, $$2, Lifecycle.stable());
    }

    public static <T> he.c<T> b(hr<T> $$0, acq $$1, T $$2) {
        return hr.b($$0, acp.a($$0.c(), $$1), $$2);
    }

    public static <V, T extends V> T a(hr<V> $$0, int $$1, String $$2, T $$3) {
        ((ia)$$0).b($$1, acp.a($$0.c(), new acq($$2)), $$3, Lifecycle.stable());
        return $$3;
    }

    public hr<T> l();

    public he.c<T> f(T var1);

    public Optional<he.c<T>> c(int var1);

    public Optional<he.c<T>> b(acp<T> var1);

    public he<T> d(T var1);

    default public he.c<T> f(acp<T> $$0) {
        return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
    }

    public Stream<he.c<T>> h();

    public Optional<hi.c<T>> b(anl<T> var1);

    default public Iterable<he<T>> c(anl<T> $$0) {
        return (Iterable)DataFixUtils.orElse(this.b($$0), List.of());
    }

    public hi.c<T> a(anl<T> var1);

    public Stream<Pair<anl<T>, hi.c<T>>> i();

    public Stream<anl<T>> j();

    public void m();

    public void a(Map<anl<T>, List<he<T>>> var1);

    default public hj<he<T>> t() {
        return new hj<he<T>>(){

            @Override
            public int a(he<T> $$0) {
                return hr.this.a($$0.a());
            }

            @Nullable
            public he<T> c(int $$0) {
                return hr.this.c($$0).orElse(null);
            }

            @Override
            public int b() {
                return hr.this.b();
            }

            @Override
            public Iterator<he<T>> iterator() {
                return hr.this.h().map($$0 -> $$0).iterator();
            }

            @Override
            @Nullable
            public /* synthetic */ Object a(int n2) {
                return this.c(n2);
            }
        };
    }

    public hh<T> o();

    public hg.c<T> p();

    default public hg.c<T> u() {
        return new hg.c.a<T>(){

            @Override
            protected hg.c<T> a() {
                return hr.this.p();
            }

            @Override
            public Optional<hi.c<T>> a(anl<T> $$0) {
                return Optional.of(this.b($$0));
            }

            @Override
            public hi.c<T> b(anl<T> $$0) {
                return hr.this.a($$0);
            }
        };
    }
}

