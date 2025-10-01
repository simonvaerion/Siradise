/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahf
extends ahi<ahf> {
    static final Logger Z = LogUtils.getLogger();
    private static final Pattern aa = Pattern.compile("^[a-fA-F0-9]{40}$");
    private static final Splitter ab = Splitter.on((char)',').trimResults();
    public final boolean a = this.a("online-mode", true);
    public final boolean b = this.a("prevent-proxy-connections", false);
    public final String c = this.a("server-ip", "");
    public final boolean d = this.a("spawn-animals", true);
    public final boolean e = this.a("spawn-npcs", true);
    public final boolean f = this.a("pvp", true);
    public final boolean g = this.a("allow-flight", false);
    public final String h = this.a("motd", "A Minecraft Server");
    public final boolean i = this.a("force-gamemode", false);
    public final boolean j = this.a("enforce-whitelist", false);
    public final bdu k = this.a("difficulty", ahf.a(bdu::a, bdu::a), bdu::e, bdu.b);
    public final cmj l = this.a("gamemode", ahf.a(cmj::a, cmj::a), cmj::b, cmj.a);
    public final String m = this.a("level-name", "world");
    public final int n = this.a("server-port", 25565);
    @Nullable
    public final Boolean o = this.b("announce-player-achievements");
    public final boolean p = this.a("enable-query", false);
    public final int q = this.a("query.port", 25565);
    public final boolean r = this.a("enable-rcon", false);
    public final int s = this.a("rcon.port", 25575);
    public final String t = this.a("rcon.password", "");
    public final boolean u = this.a("hardcore", false);
    public final boolean v = this.a("allow-nether", true);
    public final boolean w = this.a("spawn-monsters", true);
    public final boolean x = this.a("use-native-transport", true);
    public final boolean y = this.a("enable-command-block", false);
    public final int z = this.a("spawn-protection", 16);
    public final int A = this.a("op-permission-level", 4);
    public final int B = this.a("function-permission-level", 2);
    public final long C = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
    public final int D = this.a("max-chained-neighbor-updates", 1000000);
    public final int E = this.a("rate-limit", 0);
    public final int F = this.a("view-distance", 10);
    public final int G = this.a("simulation-distance", 10);
    public final int H = this.a("max-players", 20);
    public final int I = this.a("network-compression-threshold", 256);
    public final boolean J = this.a("broadcast-rcon-to-ops", true);
    public final boolean K = this.a("broadcast-console-to-ops", true);
    public final int L = this.a("max-world-size", $$0 -> apa.a((int)$$0, 1, 29999984), 29999984);
    public final boolean M = this.a("sync-chunk-writes", true);
    public final boolean N = this.a("enable-jmx-monitoring", false);
    public final boolean O = this.a("enable-status", true);
    public final boolean P = this.a("hide-online-players", false);
    public final int Q = this.a("entity-broadcast-range-percentage", $$0 -> apa.a((int)$$0, 10, 1000), 100);
    public final String R = this.a("text-filtering-config", "");
    public final Optional<MinecraftServer.b> S;
    public final cma T;
    public final ahi.a<Integer> U = this.b("player-idle-timeout", 0);
    public final ahi.a<Boolean> V = this.b("white-list", false);
    public final boolean W = this.a("enforce-secure-profile", true);
    private final a ac;
    public final dii X;

    public ahf(Properties $$02) {
        super($$02);
        String $$1 = this.a("level-seed", "");
        boolean $$2 = this.a("generate-structures", true);
        long $$3 = dii.a($$1).orElse(dii.f());
        this.X = new dii($$3, $$2, false);
        this.ac = new a(this.a("generator-settings", (String $$0) -> aor.a(!$$0.isEmpty() ? $$0 : "{}"), new JsonObject()), this.a("level-type", (String $$0) -> $$0.toLowerCase(Locale.ROOT), drq.a.a().toString()));
        this.S = ahf.a(this.a("resource-pack", ""), this.a("resource-pack-sha1", ""), this.a("resource-pack-hash"), this.a("require-resource-pack", false), this.a("resource-pack-prompt", ""));
        this.T = ahf.b(this.a("initial-enabled-packs", String.join((CharSequence)",", cnf.c.a().a())), this.a("initial-disabled-packs", String.join((CharSequence)",", cnf.c.a().b())));
    }

    public static ahf a(Path $$0) {
        return new ahf(ahf.b($$0));
    }

    protected ahf a(hs $$0, Properties $$1) {
        return new ahf($$1);
    }

    @Nullable
    private static sw c(String $$0) {
        if (!Strings.isNullOrEmpty((String)$$0)) {
            try {
                return sw.a.a($$0);
            }
            catch (Exception $$1) {
                Z.warn("Failed to parse resource pack prompt '{}'", (Object)$$0, (Object)$$1);
            }
        }
        return null;
    }

    private static Optional<MinecraftServer.b> a(String $$0, String $$1, @Nullable String $$2, boolean $$3, String $$4) {
        String $$7;
        if ($$0.isEmpty()) {
            return Optional.empty();
        }
        if (!$$1.isEmpty()) {
            String $$5 = $$1;
            if (!Strings.isNullOrEmpty((String)$$2)) {
                Z.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
        } else if (!Strings.isNullOrEmpty((String)$$2)) {
            Z.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            String $$6 = $$2;
        } else {
            $$7 = "";
        }
        if ($$7.isEmpty()) {
            Z.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
        } else if (!aa.matcher($$7).matches()) {
            Z.warn("Invalid sha1 for resource-pack-sha1");
        }
        sw $$8 = ahf.c($$4);
        return Optional.of(new MinecraftServer.b($$0, $$7, $$3, $$8));
    }

    private static cma b(String $$0, String $$1) {
        List $$2 = ab.splitToList((CharSequence)$$0);
        List $$3 = ab.splitToList((CharSequence)$$1);
        return new cma($$2, $$3);
    }

    private static caw d(String $$02) {
        return cay.c.a((Iterable<acq>)ab.splitToStream((CharSequence)$$02).mapMulti(($$0, $$1) -> {
            acq $$2 = acq.a($$0);
            if ($$2 == null) {
                Z.warn("Invalid resource location {}, ignoring", $$0);
            } else {
                $$1.accept($$2);
            }
        }).collect(Collectors.toList()));
    }

    public dif a(hs $$0) {
        return this.ac.a($$0);
    }

    @Override
    protected /* synthetic */ ahi b(hs hs2, Properties properties) {
        return this.a(hs2, properties);
    }

    record a(JsonObject a, String b) {
        private static final Map<String, acp<drp>> c = Map.of("default", drq.a, "largebiomes", drq.c);

        public dif a(hs $$02) {
            hr<drp> $$1 = $$02.d(jc.aF);
            he.c<drp> $$2 = $$1.b(drq.a).or(() -> $$1.h().findAny()).orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
            he $$3 = Optional.ofNullable(acq.a(this.b)).map($$0 -> acp.a(jc.aF, $$0)).or(() -> Optional.ofNullable(c.get(this.b))).flatMap($$1::b).orElseGet(() -> {
                Z.warn("Failed to parse level-type {}, defaulting to {}", (Object)this.b, (Object)$$2.g().a());
                return $$2;
            });
            dif $$4 = ((drp)$$3.a()).a();
            if ($$3.a(drq.b)) {
                aco $$5 = aco.a(JsonOps.INSTANCE, $$02);
                Optional $$6 = dqd.a.parse(new Dynamic($$5, (Object)this.a())).resultOrPartial(arg_0 -> ((Logger)Z).error(arg_0));
                if ($$6.isPresent()) {
                    return $$4.a($$02, new dhf((dqd)$$6.get()));
                }
            }
            return $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this, $$0);
        }
    }
}

