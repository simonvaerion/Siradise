/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class vz
extends Record
implements uo<ur> {
    private final int a;
    private final float b;

    public vz(bfz $$0) {
        this($$0.af(), $$0.eB());
    }

    public vz(sf $$0) {
        this($$0.m(), $$0.readFloat());
    }

    public vz(int $$0, float $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.writeFloat(this.b);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vz.class, "id;yaw", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vz.class, "id;yaw", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vz.class, "id;yaw", "a", "b"}, this, $$0);
    }

    public int a() {
        return this.a;
    }

    public float c() {
        return this.b;
    }
}

