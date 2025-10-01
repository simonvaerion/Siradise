/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import jdk.jfr.consumer.RecordedEvent;

public record bbh(double a, double b, double c) {
    public static bbh a(RecordedEvent $$0) {
        return new bbh($$0.getFloat("jvmSystem"), $$0.getFloat("jvmUser"), $$0.getFloat("machineTotal"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbh.class, "jvm;userJvm;system", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbh.class, "jvm;userJvm;system", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbh.class, "jvm;userJvm;system", "a", "b", "c"}, this, $$0);
    }
}

