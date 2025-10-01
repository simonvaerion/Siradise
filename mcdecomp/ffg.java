/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ffg {
    private final enn a;
    private final Deque<a> b = Queues.newArrayDeque();
    private long c;
    private long d;

    public ffg(enn $$0) {
        this.a = $$0;
    }

    public void a() {
        if (this.c == 0L) {
            return;
        }
        if (ac.b() >= this.d + this.c) {
            a $$0 = this.b.poll();
            while ($$0 != null && !$$0.a()) {
                $$0 = this.b.poll();
            }
        }
    }

    public void a(double $$0) {
        long $$1 = (long)($$0 * 1000.0);
        if ($$1 == 0L && this.c > 0L) {
            this.b.forEach(a::a);
            this.b.clear();
        }
        this.c = $$1;
    }

    public void b() {
        this.b.remove().a();
    }

    public long c() {
        return this.b.size();
    }

    public void d() {
        this.b.forEach(a::a);
        this.b.clear();
    }

    public boolean a(th $$0) {
        return this.b.removeIf($$1 -> $$0.equals($$1.b()));
    }

    private boolean e() {
        return this.c > 0L && ac.b() < this.d + this.c;
    }

    private void a(@Nullable th $$0, BooleanSupplier $$1) {
        if (this.e()) {
            this.b.add(new a($$0, $$1));
        } else {
            $$1.getAsBoolean();
        }
    }

    public void a(tl $$0, GameProfile $$1, ss.a $$2) {
        boolean $$3 = this.a.m.ab().c();
        tl $$4 = $$3 ? $$0.a() : $$0;
        sw $$5 = $$2.a($$4.c());
        Instant $$6 = Instant.now();
        this.a($$0.k(), () -> {
            boolean $$6 = this.a($$2, $$0, $$5, $$1, $$3, $$6);
            fex $$7 = this.a.I();
            if ($$7 != null) {
                $$7.a($$0, $$6);
            }
            return $$6;
        });
    }

    public void a(sw $$0, ss.a $$1) {
        Instant $$2 = Instant.now();
        this.a(null, () -> {
            sw $$3 = $$1.a($$0);
            this.a.l.d().a($$3);
            this.a($$1, $$0);
            this.a($$3, $$2);
            this.d = ac.b();
            return true;
        });
    }

    private boolean a(ss.a $$0, tl $$1, sw $$2, GameProfile $$3, boolean $$4, Instant $$5) {
        ffi $$6 = this.a($$1, $$2, $$5);
        if ($$4 && $$6.a()) {
            return false;
        }
        if (this.a.a($$1.f()) || $$1.i()) {
            return false;
        }
        eni $$7 = $$6.a($$1);
        th $$8 = $$1.k();
        sz $$9 = $$1.n();
        if ($$9.a()) {
            this.a.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
        } else {
            sw $$10 = $$9.b($$1.b());
            if ($$10 != null) {
                this.a.l.d().a($$0.a($$10), $$8, $$7);
                this.a($$0, $$10);
            }
        }
        this.a($$1, $$0, $$3, $$6);
        this.d = ac.b();
        return true;
    }

    private void a(ss.a $$0, sw $$1) {
        this.a.aU().a($$0.b($$1));
    }

    private ffi a(tl $$0, sw $$1, Instant $$2) {
        if (this.a($$0.f())) {
            return ffi.a;
        }
        return ffi.a($$0, $$1, $$2);
    }

    private void a(tl $$0, ss.a $$1, GameProfile $$2, ffi $$3) {
        ffh $$4 = this.a.aW().b();
        $$4.a(ffk.a($$2, $$0, $$3));
    }

    private void a(sw $$0, Instant $$1) {
        ffh $$2 = this.a.aW().b();
        $$2.a(ffk.a($$0, $$1));
    }

    public void a(sw $$0, boolean $$1) {
        if (this.a.m.Z().c().booleanValue() && this.a.a(this.a($$0))) {
            return;
        }
        if ($$1) {
            this.a.l.a($$0, false);
        } else {
            this.a.l.d().a($$0);
            this.a($$0, Instant.now());
        }
        this.a.aU().b($$0);
    }

    private UUID a(sw $$0) {
        String $$1 = apq.a($$0);
        String $$2 = StringUtils.substringBetween((String)$$1, (String)"<", (String)">");
        if ($$2 == null) {
            return ac.c;
        }
        return this.a.aK().a($$2);
    }

    private boolean a(UUID $$0) {
        if (this.a.Q() && this.a.t != null) {
            UUID $$1 = this.a.t.fM().getId();
            return $$1.equals($$0);
        }
        return false;
    }

    record a(@Nullable th a, BooleanSupplier b) {
        @Nullable
        private final th a;
        private final BooleanSupplier b;

        public boolean a() {
            return this.b.getAsBoolean();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this, $$0);
        }

        @Nullable
        public th b() {
            return this.a;
        }

        public BooleanSupplier c() {
            return this.b;
        }
    }
}

