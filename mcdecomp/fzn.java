/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryPropertyContainer
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 */
import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class fzn<T>
extends Record {
    private final String F;
    private final String G;
    private final Codec<T> H;
    private final a<T> I;
    private static final DateTimeFormatter J = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
    public static final fzn<String> a = fzn.b("user_id", "userId");
    public static final fzn<String> b = fzn.b("client_id", "clientId");
    public static final fzn<UUID> c = fzn.e("minecraft_session_id", "deviceSessionId");
    public static final fzn<String> d = fzn.b("game_version", "buildDisplayName");
    public static final fzn<String> e = fzn.b("operating_system", "buildPlatform");
    public static final fzn<String> f = fzn.b("platform", "platform");
    public static final fzn<Boolean> g = fzn.a("client_modded", "clientModded");
    public static final fzn<String> h = fzn.b("launcher_name", "launcherName");
    public static final fzn<UUID> i = fzn.e("world_session_id", "worldSessionId");
    public static final fzn<Boolean> j = fzn.a("server_modded", "serverModded");
    public static final fzn<c> k = fzn.a("server_type", "serverType", fzn$c.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.c()));
    public static final fzn<Boolean> l = fzn.a("opt_in", "isOptional");
    public static final fzn<Instant> m = fzn.a("event_timestamp_utc", "eventTimestampUtc", aoi.m, ($$0, $$1, $$2) -> $$0.addProperty($$1, J.format((TemporalAccessor)$$2)));
    public static final fzn<b> n = fzn.a("game_mode", "playerGameMode", fzn$b.f, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
    public static final fzn<String> o = fzn.b("realms_map_content", "realmsMapContent");
    public static final fzn<Integer> p = fzn.c("seconds_since_load", "secondsSinceLoad");
    public static final fzn<Integer> q = fzn.c("ticks_since_load", "ticksSinceLoad");
    public static final fzn<LongList> r = fzn.g("frame_rate_samples", "serializedFpsSamples");
    public static final fzn<LongList> s = fzn.g("render_time_samples", "serializedRenderTimeSamples");
    public static final fzn<LongList> t = fzn.g("used_memory_samples", "serializedUsedMemoryKbSamples");
    public static final fzn<Integer> u = fzn.c("number_of_samples", "numSamples");
    public static final fzn<Integer> v = fzn.c("render_distance", "renderDistance");
    public static final fzn<Integer> w = fzn.c("dedicated_memory_kb", "dedicatedMemoryKb");
    public static final fzn<Integer> x = fzn.c("world_load_time_ms", "worldLoadTimeMs");
    public static final fzn<Boolean> y = fzn.a("new_world", "newWorld");
    public static final fzn<fzr.a> z = fzn.f("load_time_total_time_ms", "loadTimeTotalTimeMs");
    public static final fzn<fzr.a> A = fzn.f("load_time_pre_window_ms", "loadTimePreWindowMs");
    public static final fzn<fzr.a> B = fzn.f("load_time_bootstrap_ms", "loadTimeBootstrapMs");
    public static final fzn<fzr.a> C = fzn.f("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
    public static final fzn<String> D = fzn.b("advancement_id", "advancementId");
    public static final fzn<Long> E = fzn.d("advancement_game_time", "advancementGameTime");

    public fzn(String $$0, String $$1, Codec<T> $$2, a<T> $$3) {
        this.F = $$0;
        this.G = $$1;
        this.H = $$2;
        this.I = $$3;
    }

    public static <T> fzn<T> a(String $$0, String $$1, Codec<T> $$2, a<T> $$3) {
        return new fzn<T>($$0, $$1, $$2, $$3);
    }

    public static fzn<Boolean> a(String $$0, String $$1) {
        return fzn.a($$0, $$1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
    }

    public static fzn<String> b(String $$0, String $$1) {
        return fzn.a($$0, $$1, Codec.STRING, TelemetryPropertyContainer::addProperty);
    }

    public static fzn<Integer> c(String $$0, String $$1) {
        return fzn.a($$0, $$1, Codec.INT, TelemetryPropertyContainer::addProperty);
    }

    public static fzn<Long> d(String $$0, String $$1) {
        return fzn.a($$0, $$1, Codec.LONG, TelemetryPropertyContainer::addProperty);
    }

    public static fzn<UUID> e(String $$02, String $$12) {
        return fzn.a($$02, $$12, hy.b, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.toString()));
    }

    public static fzn<fzr.a> f(String $$02, String $$12) {
        return fzn.a($$02, $$12, fzr.a.a, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
    }

    public static fzn<LongList> g(String $$02, String $$12) {
        return fzn.a($$02, $$12, Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()), ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";"))));
    }

    public void a(fzo $$0, TelemetryPropertyContainer $$1) {
        Object $$2 = $$0.a(this);
        if ($$2 != null) {
            this.I.apply($$1, this.G, $$2);
        } else {
            $$1.addNullProperty(this.G);
        }
    }

    public tj a() {
        return sw.c("telemetry.property." + this.F + ".title");
    }

    @Override
    public String toString() {
        return "TelemetryProperty[" + this.F + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fzn.class, "id;exportKey;codec;exporter", "F", "G", "H", "I"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fzn.class, "id;exportKey;codec;exporter", "F", "G", "H", "I"}, this, $$0);
    }

    public String b() {
        return this.F;
    }

    public String c() {
        return this.G;
    }

    public Codec<T> d() {
        return this.H;
    }

    public a<T> e() {
        return this.I;
    }

    public static interface a<T> {
        public void apply(TelemetryPropertyContainer var1, String var2, T var3);
    }

    public static final class b
    extends Enum<b>
    implements apr {
        public static final /* enum */ b a = new b("survival", 0);
        public static final /* enum */ b b = new b("creative", 1);
        public static final /* enum */ b c = new b("adventure", 2);
        public static final /* enum */ b d = new b("spectator", 6);
        public static final /* enum */ b e = new b("hardcore", 99);
        public static final Codec<b> f;
        private final String g;
        private final int h;
        private static final /* synthetic */ b[] i;

        public static b[] values() {
            return (b[])i.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.h;
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            i = fzn$b.b();
            f = apr.a(b::values);
        }
    }

    public static final class c
    extends Enum<c>
    implements apr {
        public static final /* enum */ c a = new c("realm");
        public static final /* enum */ c b = new c("local");
        public static final /* enum */ c c = new c("server");
        public static final Codec<c> d;
        private final String e;
        private static final /* synthetic */ c[] f;

        public static c[] values() {
            return (c[])f.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            f = fzn$c.a();
            d = apr.a(c::values);
        }
    }
}

