/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ObjectUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class acb {
    private static final Logger a = LogUtils.getLogger();
    private static final Object2IntMap<Class<? extends bfj>> b = new Object2IntOpenHashMap();
    private static final int c = 254;
    private final bfj d;
    private final Int2ObjectMap<a<?>> e = new Int2ObjectOpenHashMap();
    private final ReadWriteLock f = new ReentrantReadWriteLock();
    private boolean g;

    public acb(bfj $$0) {
        this.d = $$0;
    }

    public static <T> aby<T> a(Class<? extends bfj> $$0, abz<T> $$1) {
        int $$6;
        if (a.isDebugEnabled()) {
            try {
                Class<?> $$2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
                if (!$$2.equals($$0)) {
                    a.debug("defineId called for: {} from {}", new Object[]{$$0, $$2, new RuntimeException()});
                }
            }
            catch (ClassNotFoundException $$2) {
                // empty catch block
            }
        }
        if (b.containsKey($$0)) {
            int $$3 = b.getInt($$0) + 1;
        } else {
            int $$4 = 0;
            Class<? extends bfj> $$5 = $$0;
            while ($$5 != bfj.class) {
                if (!b.containsKey($$5 = $$5.getSuperclass())) continue;
                $$4 = b.getInt($$5) + 1;
                break;
            }
            $$6 = $$4;
        }
        if ($$6 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + $$6 + "! (Max is 254)");
        }
        b.put($$0, $$6);
        return $$1.a($$6);
    }

    public <T> void a(aby<T> $$0, T $$1) {
        int $$2 = $$0.a();
        if ($$2 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + $$2 + "! (Max is 254)");
        }
        if (this.e.containsKey($$2)) {
            throw new IllegalArgumentException("Duplicate id value for " + $$2 + "!");
        }
        if (aca.b($$0.b()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + $$0.b() + " for " + $$2 + "!");
        }
        this.c($$0, $$1);
    }

    private <T> void c(aby<T> $$0, T $$1) {
        a<T> $$2 = new a<T>($$0, $$1);
        this.f.writeLock().lock();
        this.e.put($$0.a(), $$2);
        this.f.writeLock().unlock();
    }

    public <T> boolean a(aby<T> $$0) {
        return this.e.containsKey($$0.a());
    }

    /*
     * WARNING - void declaration
     */
    private <T> a<T> c(aby<T> $$0) {
        void $$5;
        this.f.readLock().lock();
        try {
            a $$1 = (a)this.e.get($$0.a());
        }
        catch (Throwable $$2) {
            o $$3 = o.a($$2, "Getting synched entity data");
            p $$4 = $$3.a("Synched entity data");
            $$4.a("Data ID", $$0);
            throw new y($$3);
        }
        finally {
            this.f.readLock().unlock();
        }
        return $$5;
    }

    public <T> T b(aby<T> $$0) {
        return this.c($$0).b();
    }

    public <T> void b(aby<T> $$0, T $$1) {
        this.a($$0, $$1, false);
    }

    public <T> void a(aby<T> $$0, T $$1, boolean $$2) {
        a<T> $$3 = this.c($$0);
        if ($$2 || ObjectUtils.notEqual($$1, $$3.b())) {
            $$3.a($$1);
            this.d.a($$0);
            $$3.a(true);
            this.g = true;
        }
    }

    public boolean a() {
        return this.g;
    }

    @Nullable
    public List<b<?>> b() {
        ArrayList $$0 = null;
        if (this.g) {
            this.f.readLock().lock();
            for (a $$1 : this.e.values()) {
                if (!$$1.c()) continue;
                $$1.a(false);
                if ($$0 == null) {
                    $$0 = new ArrayList();
                }
                $$0.add($$1.e());
            }
            this.f.readLock().unlock();
        }
        this.g = false;
        return $$0;
    }

    @Nullable
    public List<b<?>> c() {
        ArrayList $$0 = null;
        this.f.readLock().lock();
        for (a $$1 : this.e.values()) {
            if ($$1.d()) continue;
            if ($$0 == null) {
                $$0 = new ArrayList();
            }
            $$0.add($$1.e());
        }
        this.f.readLock().unlock();
        return $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(List<b<?>> $$0) {
        this.f.writeLock().lock();
        try {
            for (b<?> $$1 : $$0) {
                a $$2 = (a)this.e.get($$1.a);
                if ($$2 == null) continue;
                this.a($$2, $$1);
                this.d.a($$2.a());
            }
        }
        finally {
            this.f.writeLock().unlock();
        }
        this.d.a($$0);
    }

    private <T> void a(a<T> $$0, b<?> $$1) {
        if (!Objects.equals($$1.b(), $$0.a.b())) {
            throw new IllegalStateException(String.format(Locale.ROOT, "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", $$0.a.a(), this.d, $$0.b, $$0.b.getClass(), $$1.c, $$1.c.getClass()));
        }
        $$0.a($$1.c);
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public static class a<T> {
        final aby<T> a;
        T b;
        private final T c;
        private boolean d;

        public a(aby<T> $$0, T $$1) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$1;
        }

        public aby<T> a() {
            return this.a;
        }

        public void a(T $$0) {
            this.b = $$0;
        }

        public T b() {
            return this.b;
        }

        public boolean c() {
            return this.d;
        }

        public void a(boolean $$0) {
            this.d = $$0;
        }

        public boolean d() {
            return this.c.equals(this.b);
        }

        public b<T> e() {
            return acb$b.a(this.a, this.b);
        }
    }

    public static final class b<T>
    extends Record {
        final int a;
        private final abz<T> b;
        final T c;

        public b(int $$0, abz<T> $$1, T $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public static <T> b<T> a(aby<T> $$0, T $$1) {
            abz<T> $$2 = $$0.b();
            return new b<T>($$0.a(), $$2, $$2.a($$1));
        }

        public void a(sf $$0) {
            int $$1 = aca.b(this.b);
            if ($$1 < 0) {
                throw new EncoderException("Unknown serializer type " + this.b);
            }
            $$0.writeByte(this.a);
            $$0.d($$1);
            this.b.a($$0, this.c);
        }

        public static b<?> a(sf $$0, int $$1) {
            int $$2 = $$0.m();
            abz<?> $$3 = aca.a($$2);
            if ($$3 == null) {
                throw new DecoderException("Unknown serializer type " + $$2);
            }
            return acb$b.a($$0, $$1, $$3);
        }

        private static <T> b<T> a(sf $$0, int $$1, abz<T> $$2) {
            return new b<sf>($$1, $$2, $$2.a($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;serializer;value", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;serializer;value", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;serializer;value", "a", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public abz<T> b() {
            return this.b;
        }

        public T c() {
            return this.c;
        }
    }
}

