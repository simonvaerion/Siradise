/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.PropertyMap
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class ezy {
    public final d a;
    public final eha b;
    public final a c;
    public final b d;
    public final c e;

    public ezy(d $$0, eha $$1, a $$2, b $$3, c $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public static class d {
        public final eoc a;
        public final PropertyMap b;
        public final PropertyMap c;
        public final Proxy d;

        public d(eoc $$0, PropertyMap $$1, PropertyMap $$2, Proxy $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }
    }

    public static class a {
        public final File a;
        public final File b;
        public final File c;
        @Nullable
        public final String d;

        public a(File $$0, File $$1, File $$2, @Nullable String $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public Path a() {
            return this.d == null ? this.c.toPath() : fvq.a(this.c.toPath(), this.d);
        }
    }

    public static class b {
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public b(boolean $$0, String $$1, String $$2, boolean $$3, boolean $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }
    }

    public record c(@Nullable String a, @Nullable String b, @Nullable String c, @Nullable String d) {
        @Nullable
        private final String a;
        @Nullable
        private final String b;
        @Nullable
        private final String c;
        @Nullable
        private final String d;

        public boolean a() {
            return !ac.b(this.b) || !ac.b(this.c) || !ac.b(this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "path;singleplayer;multiplayer;realms", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "path;singleplayer;multiplayer;realms", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "path;singleplayer;multiplayer;realms", "a", "b", "c", "d"}, this, $$0);
        }

        @Nullable
        public String b() {
            return this.a;
        }

        @Nullable
        public String c() {
            return this.b;
        }

        @Nullable
        public String d() {
            return this.c;
        }

        @Nullable
        public String e() {
            return this.d;
        }
    }
}

