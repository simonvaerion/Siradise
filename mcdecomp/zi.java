/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import javax.annotation.Nullable;

public final class zi
extends Record
implements uo<zb> {
    private final String a;
    private final Instant b;
    private final long c;
    @Nullable
    private final th d;
    private final tc.b e;

    public zi(sf $$0) {
        this($$0.e(256), $$0.v(), $$0.readLong(), (th)$$0.c(th::a), new tc.b($$0));
    }

    public zi(String $$0, Instant $$1, long $$2, @Nullable th $$3, tc.b $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a, 256);
        $$0.a(this.b);
        $$0.writeLong(this.c);
        $$0.a(this.d, th::a);
        this.e.a($$0);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zi.class, "message;timeStamp;salt;signature;lastSeenMessages", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zi.class, "message;timeStamp;salt;signature;lastSeenMessages", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zi.class, "message;timeStamp;salt;signature;lastSeenMessages", "a", "b", "c", "d", "e"}, this, $$0);
    }

    public String a() {
        return this.a;
    }

    public Instant c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    @Nullable
    public th e() {
        return this.d;
    }

    public tc.b f() {
        return this.e;
    }
}

