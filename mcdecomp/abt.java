/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public final class abt
extends Record {
    private final sw b;
    private final Optional<b> c;
    private final Optional<c> d;
    private final Optional<a> e;
    private final boolean f;
    public static final Codec<abt> a = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.b.optionalFieldOf("description", (Object)sv.a).forGetter(abt::a), (App)abt$b.a.optionalFieldOf("players").forGetter(abt::b), (App)abt$c.a.optionalFieldOf("version").forGetter(abt::c), (App)abt$a.a.optionalFieldOf("favicon").forGetter(abt::d), (App)Codec.BOOL.optionalFieldOf("enforcesSecureChat", (Object)false).forGetter(abt::e)).apply((Applicative)$$0, abt::new));

    public abt(sw $$0, Optional<b> $$1, Optional<c> $$2, Optional<a> $$3, boolean $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abt.class, "description;players;version;favicon;enforcesSecureChat", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abt.class, "description;players;version;favicon;enforcesSecureChat", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abt.class, "description;players;version;favicon;enforcesSecureChat", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public sw a() {
        return this.b;
    }

    public Optional<b> b() {
        return this.c;
    }

    public Optional<c> c() {
        return this.d;
    }

    public Optional<a> d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public static final class b
    extends Record {
        private final int b;
        private final int c;
        private final List<GameProfile> d;
        private static final Codec<GameProfile> e = RecordCodecBuilder.create($$0 -> $$0.group((App)hy.b.fieldOf("id").forGetter(GameProfile::getId), (App)Codec.STRING.fieldOf("name").forGetter(GameProfile::getName)).apply((Applicative)$$0, GameProfile::new));
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("max").forGetter(b::a), (App)Codec.INT.fieldOf("online").forGetter(b::b), (App)e.listOf().optionalFieldOf("sample", List.of()).forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(int $$0, int $$1, List<GameProfile> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "max;online;sample", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "max;online;sample", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "max;online;sample", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public List<GameProfile> c() {
            return this.d;
        }
    }

    public record c(String b, int c) {
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("name").forGetter(c::b), (App)Codec.INT.fieldOf("protocol").forGetter(c::c)).apply((Applicative)$$0, c::new));

        public static c a() {
            ad $$0 = aa.b();
            return new c($$0.c(), $$0.e());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;protocol", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;protocol", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;protocol", "b", "c"}, this, $$0);
        }
    }

    public static final class a
    extends Record {
        private final byte[] b;
        private static final String c = "data:image/png;base64,";
        public static final Codec<a> a = Codec.STRING.comapFlatMap($$0 -> {
            if (!$$0.startsWith(c)) {
                return DataResult.error(() -> "Unknown format");
            }
            try {
                String $$1 = $$0.substring(c.length()).replaceAll("\n", "");
                byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
                return DataResult.success((Object)new a($$2));
            }
            catch (IllegalArgumentException $$3) {
                return DataResult.error(() -> "Malformed base64 server icon");
            }
        }, $$0 -> c + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

        public a(byte[] $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "iconBytes", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "iconBytes", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "iconBytes", "b"}, this, $$0);
        }

        public byte[] a() {
            return this.b;
        }
    }
}

