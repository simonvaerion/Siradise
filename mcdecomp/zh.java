/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;

public final class zh
extends Record
implements uo<zb> {
    private final String a;
    private final Instant b;
    private final long c;
    private final dw d;
    private final tc.b e;

    public zh(sf $$0) {
        this($$0.e(256), $$0.v(), $$0.readLong(), new dw($$0), new tc.b($$0));
    }

    public zh(String $$0, Instant $$1, long $$2, dw $$3, tc.b $$4) {
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
        this.d.a($$0);
        this.e.a($$0);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zh.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zh.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zh.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "a", "b", "c", "d", "e"}, this, $$0);
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

    public dw e() {
        return this.d;
    }

    public tc.b f() {
        return this.e;
    }
}

