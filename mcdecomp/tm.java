/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.UUID;

public record tm(UUID a, byr b) {
    private final UUID a;
    private final byr b;

    public tr a() {
        return new tr.a(this.b.a());
    }

    public tp.b a(UUID $$0) {
        return new tp($$0, this.a).a(this.b);
    }

    public a b() {
        return new a(this.a, this.b.b());
    }

    public boolean c() {
        return this.b.b().a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tm.class, "sessionId;profilePublicKey", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tm.class, "sessionId;profilePublicKey", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tm.class, "sessionId;profilePublicKey", "a", "b"}, this, $$0);
    }

    public UUID d() {
        return this.a;
    }

    public byr e() {
        return this.b;
    }

    public record a(UUID a, byr.a b) {
        public static a a(sf $$0) {
            return new a($$0.o(), new byr.a($$0));
        }

        public static void a(sf $$0, a $$1) {
            $$0.a($$1.a);
            $$1.b.a($$0);
        }

        public tm a(GameProfile $$0, apj $$1, Duration $$2) throws byr.b {
            return new tm(this.a, byr.a($$1, $$0.getId(), this.b, $$2));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sessionId;profilePublicKey", "a", "b"}, this, $$0);
        }
    }
}

