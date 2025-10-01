/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public record tg(UUID a, byq b) {
    private final UUID a;
    private final byq b;

    public static tg a(byq $$0) {
        return new tg(UUID.randomUUID(), $$0);
    }

    public tp.c a(UUID $$0) {
        return new tp($$0, this.a).a(apk.a(this.b.b(), "SHA256withRSA"));
    }

    public tm a() {
        return new tm(this.a, this.b.c());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tg.class, "sessionId;keyPair", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tg.class, "sessionId;keyPair", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tg.class, "sessionId;keyPair", "a", "b"}, this, $$0);
    }

    public UUID b() {
        return this.a;
    }

    public byq c() {
        return this.b;
    }
}

