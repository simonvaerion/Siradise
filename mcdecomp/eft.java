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
import java.util.Comparator;
import javax.annotation.Nullable;

public final class eft<T>
extends Record {
    private final T d;
    private final gu e;
    private final long f;
    private final efx g;
    private final long h;
    public static final Comparator<eft<?>> a = ($$0, $$1) -> {
        int $$2 = Long.compare($$0.f, $$1.f);
        if ($$2 != 0) {
            return $$2;
        }
        $$2 = $$0.g.compareTo($$1.g);
        if ($$2 != 0) {
            return $$2;
        }
        return Long.compare($$0.h, $$1.h);
    };
    public static final Comparator<eft<?>> b = ($$0, $$1) -> {
        int $$2 = $$0.g.compareTo($$1.g);
        if ($$2 != 0) {
            return $$2;
        }
        return Long.compare($$0.h, $$1.h);
    };
    public static final Hash.Strategy<eft<?>> c = new Hash.Strategy<eft<?>>(){

        public int a(eft<?> $$0) {
            return 31 * $$0.b().hashCode() + $$0.a().hashCode();
        }

        public boolean a(@Nullable eft<?> $$0, @Nullable eft<?> $$1) {
            if ($$0 == $$1) {
                return true;
            }
            if ($$0 == null || $$1 == null) {
                return false;
            }
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((eft)object, (eft)object2);
        }

        public /* synthetic */ int hashCode(Object object) {
            return this.a((eft)object);
        }
    };

    public eft(T $$0, gu $$1, long $$2, long $$3) {
        this($$0, $$1, $$2, efx.d, $$3);
    }

    public eft(T $$0, gu $$1, long $$2, efx $$3, long $$4) {
        $$1 = $$1.i();
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    public static <T> eft<T> a(T $$0, gu $$1) {
        return new eft<T>($$0, $$1, 0L, efx.d, 0L);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eft.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eft.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eft.class, "type;pos;triggerTick;priority;subTickOrder", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public T a() {
        return this.d;
    }

    public gu b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public efx d() {
        return this.g;
    }

    public long e() {
        return this.h;
    }
}

