/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ffk
extends ffj {
    public static a a(GameProfile $$0, tl $$1, ffi $$2) {
        return new a($$0, $$1, $$2);
    }

    public static b a(sw $$0, Instant $$1) {
        return new b($$0, $$1);
    }

    public sw b();

    default public sw c() {
        return this.b();
    }

    public boolean a(UUID var1);

    public record a(GameProfile c, tl d, ffi e) implements ffk
    {
        private final GameProfile c;
        private final tl d;
        private final ffi e;
        public static final Codec<a> b = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.t.fieldOf("profile").forGetter(a::f), (App)tl.a.forGetter(a::g), (App)ffi.d.optionalFieldOf("trust_level", (Object)ffi.a).forGetter(a::h)).apply((Applicative)$$0, a::new));
        private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        @Override
        public sw b() {
            if (!this.d.n().a()) {
                sw $$0 = this.d.n().b(this.d.b());
                return $$0 != null ? $$0 : sw.h();
            }
            return this.d.c();
        }

        @Override
        public sw c() {
            sw $$0 = this.b();
            sw $$1 = this.i();
            return sw.a("gui.chatSelection.message.narrate", new Object[]{this.c.getName(), $$0, $$1});
        }

        public sw d() {
            sw $$0 = this.i();
            return sw.a("gui.chatSelection.heading", new Object[]{this.c.getName(), $$0});
        }

        private sw i() {
            LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
            return sw.b($$0.format(f)).a(n.u, n.h);
        }

        @Override
        public boolean a(UUID $$0) {
            return this.d.a($$0);
        }

        public UUID e() {
            return this.c.getId();
        }

        @Override
        public ffj.a a() {
            return ffj.a.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this, $$0);
        }

        public GameProfile f() {
            return this.c;
        }

        public tl g() {
            return this.d;
        }

        public ffi h() {
            return this.e;
        }
    }

    public static final class b
    extends Record
    implements ffk {
        private final sw c;
        private final Instant d;
        public static final Codec<b> b = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.b.fieldOf("message").forGetter(b::d), (App)aoi.m.fieldOf("time_stamp").forGetter(b::e)).apply((Applicative)$$0, b::new));

        public b(sw $$0, Instant $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public sw b() {
            return this.c;
        }

        @Override
        public boolean a(UUID $$0) {
            return false;
        }

        @Override
        public ffj.a a() {
            return ffj.a.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this, $$0);
        }

        public sw d() {
            return this.c;
        }

        public Instant e() {
            return this.d;
        }
    }
}

