/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.server.MinecraftServer;

public record dsq(akx a, hs b, dvu c) {
    public static dsq a(aif $$0) {
        MinecraftServer $$1 = $$0.n();
        return new dsq($$1.aY(), $$1.aV(), $$1.aT());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsq.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsq.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsq.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this, $$0);
    }
}

