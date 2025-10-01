/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class dzk {
    private final dzq a;
    private final apf b;
    private final dzo c;
    private final Set<c<?>> d = Sets.newLinkedHashSet();

    dzk(dzq $$0, apf $$1, dzo $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean a(ebt<?> $$0) {
        return this.a.a($$0);
    }

    public <T> T b(ebt<T> $$0) {
        return this.a.b($$0);
    }

    public void a(acq $$0, Consumer<cfz> $$1) {
        this.a.a($$0, $$1);
    }

    @Nullable
    public <T> T c(ebt<T> $$0) {
        return this.a.d($$0);
    }

    public boolean a(c<?> $$0) {
        return this.d.contains($$0);
    }

    public boolean b(c<?> $$0) {
        return this.d.add($$0);
    }

    public void c(c<?> $$0) {
        this.d.remove($$0);
    }

    public dzo a() {
        return this.c;
    }

    public apf b() {
        return this.b;
    }

    public float c() {
        return this.a.b();
    }

    public aif d() {
        return this.a.a();
    }

    public static c<dzs> a(dzs $$0) {
        return new c<dzs>(dzp.c, $$0);
    }

    public static c<eck> a(eck $$0) {
        return new c<eck>(dzp.a, $$0);
    }

    public static c<eaz> a(eaz $$0) {
        return new c<eaz>(dzp.b, $$0);
    }

    public record c<T>(dzp<T> a, T b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "type;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "type;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "type;value", "a", "b"}, this, $$0);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("this", ebw.a);
        public static final /* enum */ b b = new b("killer", ebw.d);
        public static final /* enum */ b c = new b("direct_killer", ebw.e);
        public static final /* enum */ b d = new b("killer_player", ebw.b);
        final String e;
        private final ebt<? extends bfj> f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, ebt<? extends bfj> $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public ebt<? extends bfj> a() {
            return this.f;
        }

        public static b a(String $$0) {
            for (b $$1 : dzk$b.values()) {
                if (!$$1.e.equals($$0)) continue;
                return $$1;
            }
            throw new IllegalArgumentException("Invalid entity target " + $$0);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d};
        }

        static {
            g = dzk$b.b();
        }

        public static class a
        extends TypeAdapter<b> {
            public void a(JsonWriter $$0, b $$1) throws IOException {
                $$0.value($$1.e);
            }

            public b a(JsonReader $$0) throws IOException {
                return dzk$b.a($$0.nextString());
            }

            public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
                return this.a(jsonReader);
            }

            public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
                this.a(jsonWriter, (b)((Object)object));
            }
        }
    }

    public static class a {
        private final dzq a;
        @Nullable
        private apf b;

        public a(dzq $$0) {
            this.a = $$0;
        }

        public a a(long $$0) {
            if ($$0 != 0L) {
                this.b = apf.a($$0);
            }
            return this;
        }

        public aif a() {
            return this.a.a();
        }

        public dzk a(@Nullable acq $$0) {
            apf $$5;
            aif $$1 = this.a();
            MinecraftServer $$2 = $$1.n();
            if (this.b != null) {
                apf $$3 = this.b;
            } else if ($$0 != null) {
                apf $$4 = $$1.a($$0);
            } else {
                $$5 = $$1.y_();
            }
            return new dzk(this.a, $$5, $$2.aH());
        }
    }
}

