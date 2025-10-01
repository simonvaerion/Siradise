/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.Hash;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class efs<T>
extends Record {
    private final T b;
    private final gu c;
    private final int d;
    private final efx e;
    private static final String f = "i";
    private static final String g = "x";
    private static final String h = "y";
    private static final String i = "z";
    private static final String j = "t";
    private static final String k = "p";
    public static final Hash.Strategy<efs<?>> a = new Hash.Strategy<efs<?>>(){

        public int a(efs<?> $$0) {
            return 31 * $$0.b().hashCode() + $$0.a().hashCode();
        }

        public boolean a(@Nullable efs<?> $$0, @Nullable efs<?> $$1) {
            if ($$0 == $$1) {
                return true;
            }
            if ($$0 == null || $$1 == null) {
                return false;
            }
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((efs)object, (efs)object2);
        }

        public /* synthetic */ int hashCode(Object object) {
            return this.a((efs)object);
        }
    };

    public efs(T $$0, gu $$1, int $$2, efx $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static <T> void a(qx $$0, Function<String, Optional<T>> $$1, clt $$22, Consumer<efs<T>> $$3) {
        long $$4 = $$22.a();
        for (int $$5 = 0; $$5 < $$0.size(); ++$$5) {
            qr $$6 = $$0.a($$5);
            efs.a($$6, $$1).ifPresent($$2 -> {
                if (clt.a($$2.b()) == $$4) {
                    $$3.accept((efs)$$2);
                }
            });
        }
    }

    public static <T> Optional<efs<T>> a(qr $$0, Function<String, Optional<T>> $$12) {
        return $$12.apply($$0.l(f)).map($$1 -> {
            gu $$2 = new gu($$0.h(g), $$0.h(h), $$0.h(i));
            return new efs<Object>($$1, $$2, $$0.h(j), efx.a($$0.h(k)));
        });
    }

    private static qr a(String $$0, gu $$1, int $$2, efx $$3) {
        qr $$4 = new qr();
        $$4.a(f, $$0);
        $$4.a(g, $$1.u());
        $$4.a(h, $$1.v());
        $$4.a(i, $$1.w());
        $$4.a(j, $$2);
        $$4.a(k, $$3.a());
        return $$4;
    }

    public static <T> qr a(eft<T> $$0, Function<T, String> $$1, long $$2) {
        return efs.a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
    }

    public qr a(Function<T, String> $$0) {
        return efs.a($$0.apply(this.b), this.c, this.d, this.e);
    }

    public eft<T> a(long $$0, long $$1) {
        return new eft<T>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
    }

    public static <T> efs<T> a(T $$0, gu $$1) {
        return new efs<T>($$0, $$1, 0, efx.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{efs.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{efs.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{efs.class, "type;pos;delay;priority", "b", "c", "d", "e"}, this, $$0);
    }

    public T a() {
        return this.b;
    }

    public gu b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public efx d() {
        return this.e;
    }
}

