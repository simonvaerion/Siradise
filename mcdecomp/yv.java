/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;

public record yv(Set<acq> a) implements uo<ur>
{
    public yv(sf $$0) {
        this($$0.a(HashSet::new, sf::t));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a, sf::a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yv.class, "features", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yv.class, "features", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yv.class, "features", "a"}, this, $$0);
    }
}

