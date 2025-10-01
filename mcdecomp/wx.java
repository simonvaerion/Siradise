/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.UUID;

public record wx(List<UUID> a) implements uo<ur>
{
    public wx(sf $$0) {
        this($$0.a(sf::o));
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
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wx.class, "profileIds", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wx.class, "profileIds", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wx.class, "profileIds", "a"}, this, $$0);
    }
}

