/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import javax.annotation.Nullable;

public record dqo(List<dho.c> a) implements dho.c
{
    @Override
    @Nullable
    public dcb calculate(dhd.b $$0) {
        for (dho.c $$1 : this.a) {
            dcb $$2 = $$1.calculate($$0);
            if ($$2 == null) continue;
            return $$2;
        }
        return null;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dqo.class, "materialRuleList", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dqo.class, "materialRuleList", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dqo.class, "materialRuleList", "a"}, this, $$0);
    }
}

