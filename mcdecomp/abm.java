/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;

public final class abm
extends Record
implements uo<abk> {
    private final String a;
    private final Optional<UUID> b;

    public abm(sf $$0) {
        this($$0.e(16), $$0.b(sf::o));
    }

    public abm(String $$0, Optional<UUID> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a, 16);
        $$0.a(this.b, sf::a);
    }

    @Override
    public void a(abk $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abm.class, "name;profileId", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abm.class, "name;profileId", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abm.class, "name;profileId", "a", "b"}, this, $$0);
    }

    public String a() {
        return this.a;
    }

    public Optional<UUID> c() {
        return this.b;
    }
}

