/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicLike
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cmi {
    public static final int a = 3;
    static final Logger U = LogUtils.getLogger();
    private static final Map<e<?>, f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
    public static final e<a> b = cmi.a("doFireTick", cmi$b.e, cmi$a.a(true));
    public static final e<a> c = cmi.a("mobGriefing", cmi$b.b, cmi$a.a(true));
    public static final e<a> d = cmi.a("keepInventory", cmi$b.a, cmi$a.a(false));
    public static final e<a> e = cmi.a("doMobSpawning", cmi$b.c, cmi$a.a(true));
    public static final e<a> f = cmi.a("doMobLoot", cmi$b.d, cmi$a.a(true));
    public static final e<a> g = cmi.a("doTileDrops", cmi$b.d, cmi$a.a(true));
    public static final e<a> h = cmi.a("doEntityDrops", cmi$b.d, cmi$a.a(true));
    public static final e<a> i = cmi.a("commandBlockOutput", cmi$b.f, cmi$a.a(true));
    public static final e<a> j = cmi.a("naturalRegeneration", cmi$b.a, cmi$a.a(true));
    public static final e<a> k = cmi.a("doDaylightCycle", cmi$b.e, cmi$a.a(true));
    public static final e<a> l = cmi.a("logAdminCommands", cmi$b.f, cmi$a.a(true));
    public static final e<a> m = cmi.a("showDeathMessages", cmi$b.f, cmi$a.a(true));
    public static final e<d> n = cmi.a("randomTickSpeed", cmi$b.e, cmi$d.a(3));
    public static final e<a> o = cmi.a("sendCommandFeedback", cmi$b.f, cmi$a.a(true));
    public static final e<a> p = cmi.a("reducedDebugInfo", cmi$b.g, cmi$a.a(false, (MinecraftServer $$0, a $$1) -> {
        byte $$2 = $$1.a() ? (byte)22 : (byte)23;
        for (aig $$3 : $$0.ac().t()) {
            $$3.c.a(new vu($$3, $$2));
        }
    }));
    public static final e<a> q = cmi.a("spectatorsGenerateChunks", cmi$b.a, cmi$a.a(true));
    public static final e<d> r = cmi.a("spawnRadius", cmi$b.a, cmi$d.a(10));
    public static final e<a> s = cmi.a("disableElytraMovementCheck", cmi$b.a, cmi$a.a(false));
    public static final e<d> t = cmi.a("maxEntityCramming", cmi$b.b, cmi$d.a(24));
    public static final e<a> u = cmi.a("doWeatherCycle", cmi$b.e, cmi$a.a(true));
    public static final e<a> v = cmi.a("doLimitedCrafting", cmi$b.a, cmi$a.a(false));
    public static final e<d> w = cmi.a("maxCommandChainLength", cmi$b.g, cmi$d.a(65536));
    public static final e<d> x = cmi.a("commandModificationBlockLimit", cmi$b.g, cmi$d.a(32768));
    public static final e<a> y = cmi.a("announceAdvancements", cmi$b.f, cmi$a.a(true));
    public static final e<a> z = cmi.a("disableRaids", cmi$b.b, cmi$a.a(false));
    public static final e<a> A = cmi.a("doInsomnia", cmi$b.c, cmi$a.a(true));
    public static final e<a> B = cmi.a("doImmediateRespawn", cmi$b.a, cmi$a.a(false, (MinecraftServer $$0, a $$1) -> {
        for (aig $$2 : $$0.ac().t()) {
            $$2.c.a(new vx(vx.l, $$1.a() ? 1.0f : 0.0f));
        }
    }));
    public static final e<a> C = cmi.a("drowningDamage", cmi$b.a, cmi$a.a(true));
    public static final e<a> D = cmi.a("fallDamage", cmi$b.a, cmi$a.a(true));
    public static final e<a> E = cmi.a("fireDamage", cmi$b.a, cmi$a.a(true));
    public static final e<a> F = cmi.a("freezeDamage", cmi$b.a, cmi$a.a(true));
    public static final e<a> G = cmi.a("doPatrolSpawning", cmi$b.c, cmi$a.a(true));
    public static final e<a> H = cmi.a("doTraderSpawning", cmi$b.c, cmi$a.a(true));
    public static final e<a> I = cmi.a("doWardenSpawning", cmi$b.c, cmi$a.a(true));
    public static final e<a> J = cmi.a("forgiveDeadPlayers", cmi$b.b, cmi$a.a(true));
    public static final e<a> K = cmi.a("universalAnger", cmi$b.b, cmi$a.a(false));
    public static final e<d> L = cmi.a("playersSleepingPercentage", cmi$b.a, cmi$d.a(100));
    public static final e<a> M = cmi.a("blockExplosionDropDecay", cmi$b.d, cmi$a.a(true));
    public static final e<a> N = cmi.a("mobExplosionDropDecay", cmi$b.d, cmi$a.a(true));
    public static final e<a> O = cmi.a("tntExplosionDropDecay", cmi$b.d, cmi$a.a(false));
    public static final e<d> P = cmi.a("snowAccumulationHeight", cmi$b.e, cmi$d.a(1));
    public static final e<a> Q = cmi.a("waterSourceConversion", cmi$b.e, cmi$a.a(true));
    public static final e<a> R = cmi.a("lavaSourceConversion", cmi$b.e, cmi$a.a(false));
    public static final e<a> S = cmi.a("globalSoundEvents", cmi$b.g, cmi$a.a(true));
    public static final e<a> T = cmi.a("doVinesSpread", cmi$b.e, cmi$a.a(true));
    private final Map<e<?>, g<?>> W;

    private static <T extends g<T>> e<T> a(String $$0, b $$1, f<T> $$2) {
        e $$3 = new e($$0, $$1);
        f<T> $$4 = V.put($$3, $$2);
        if ($$4 != null) {
            throw new IllegalStateException("Duplicate game rule registration for " + $$0);
        }
        return $$3;
    }

    public cmi(DynamicLike<?> $$0) {
        this();
        this.a($$0);
    }

    public cmi() {
        this.W = (Map)V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> ((f)$$0.getValue()).a()));
    }

    private cmi(Map<e<?>, g<?>> $$0) {
        this.W = $$0;
    }

    public <T extends g<T>> T a(e<T> $$0) {
        return (T)this.W.get($$0);
    }

    public qr a() {
        qr $$0 = new qr();
        this.W.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
        return $$0;
    }

    private void a(DynamicLike<?> $$0) {
        this.W.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
    }

    public cmi b() {
        return new cmi((Map)this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> ((g)$$0.getValue()).f())));
    }

    public static void a(c $$0) {
        V.forEach(($$1, $$2) -> cmi.a($$0, $$1, $$2));
    }

    private static <T extends g<T>> void a(c $$0, e<?> $$1, f<?> $$2) {
        e<?> $$3 = $$1;
        f<?> $$4 = $$2;
        $$0.a($$3, $$4);
        $$4.a($$0, $$3);
    }

    public void a(cmi $$0, @Nullable MinecraftServer $$1) {
        $$0.W.keySet().forEach($$2 -> this.a((e)$$2, $$0, $$1));
    }

    private <T extends g<T>> void a(e<T> $$0, cmi $$1, @Nullable MinecraftServer $$2) {
        T $$3 = $$1.a($$0);
        ((g)this.a($$0)).a($$3, $$2);
    }

    public boolean b(e<a> $$0) {
        return this.a($$0).a();
    }

    public int c(e<d> $$0) {
        return this.a($$0).a();
    }

    public static final class e<T extends g<T>> {
        final String a;
        private final b b;

        public e(String $$0, b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public String toString() {
            return this.a;
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            return $$0 instanceof e && ((e)$$0).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return "gamerule." + this.a;
        }

        public b c() {
            return this.b;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("gamerule.category.player");
        public static final /* enum */ b b = new b("gamerule.category.mobs");
        public static final /* enum */ b c = new b("gamerule.category.spawning");
        public static final /* enum */ b d = new b("gamerule.category.drops");
        public static final /* enum */ b e = new b("gamerule.category.updates");
        public static final /* enum */ b f = new b("gamerule.category.chat");
        public static final /* enum */ b g = new b("gamerule.category.misc");
        private final String h;
        private static final /* synthetic */ b[] i;

        public static b[] values() {
            return (b[])i.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.h = $$0;
        }

        public String a() {
            return this.h;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f, g};
        }

        static {
            i = cmi$b.b();
        }
    }

    public static class f<T extends g<T>> {
        private final Supplier<ArgumentType<?>> a;
        private final Function<f<T>, T> b;
        final BiConsumer<MinecraftServer, T> c;
        private final h<T> d;

        f(Supplier<ArgumentType<?>> $$0, Function<f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, h<T> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public RequiredArgumentBuilder<ds, ?> a(String $$0) {
            return dt.a($$0, this.a.get());
        }

        public T a() {
            return (T)((g)this.b.apply(this));
        }

        public void a(c $$0, e<T> $$1) {
            this.d.call($$0, $$1, this);
        }
    }

    public static abstract class g<T extends g<T>> {
        protected final f<T> a;

        public g(f<T> $$0) {
            this.a = $$0;
        }

        protected abstract void a(CommandContext<ds> var1, String var2);

        public void b(CommandContext<ds> $$0, String $$1) {
            this.a($$0, $$1);
            this.a(((ds)$$0.getSource()).l());
        }

        protected void a(@Nullable MinecraftServer $$0) {
            if ($$0 != null) {
                this.a.c.accept($$0, (MinecraftServer)this.g());
            }
        }

        protected abstract void a(String var1);

        public abstract String b();

        public String toString() {
            return this.b();
        }

        public abstract int c();

        protected abstract T g();

        protected abstract T f();

        public abstract void a(T var1, @Nullable MinecraftServer var2);
    }

    public static interface c {
        default public <T extends g<T>> void a(e<T> $$0, f<T> $$1) {
        }

        default public void b(e<a> $$0, f<a> $$1) {
        }

        default public void c(e<d> $$0, f<d> $$1) {
        }
    }

    public static class a
    extends g<a> {
        private boolean b;

        static f<a> a(boolean $$0, BiConsumer<MinecraftServer, a> $$12) {
            return new f<a>(BoolArgumentType::bool, $$1 -> new a((f<a>)$$1, $$0), $$12, c::b);
        }

        static f<a> a(boolean $$02) {
            return cmi$a.a($$02, (MinecraftServer $$0, a $$1) -> {});
        }

        public a(f<a> $$0, boolean $$1) {
            super($$0);
            this.b = $$1;
        }

        @Override
        protected void a(CommandContext<ds> $$0, String $$1) {
            this.b = BoolArgumentType.getBool($$0, (String)$$1);
        }

        public boolean a() {
            return this.b;
        }

        @Override
        public void a(boolean $$0, @Nullable MinecraftServer $$1) {
            this.b = $$0;
            this.a($$1);
        }

        @Override
        public String b() {
            return Boolean.toString(this.b);
        }

        @Override
        protected void a(String $$0) {
            this.b = Boolean.parseBoolean($$0);
        }

        @Override
        public int c() {
            return this.b ? 1 : 0;
        }

        protected a d() {
            return this;
        }

        protected a e() {
            return new a(this.a, this.b);
        }

        @Override
        public void a(a $$0, @Nullable MinecraftServer $$1) {
            this.b = $$0.b;
            this.a($$1);
        }

        @Override
        protected /* synthetic */ g f() {
            return this.e();
        }

        @Override
        protected /* synthetic */ g g() {
            return this.d();
        }
    }

    public static class d
    extends g<d> {
        private int b;

        private static f<d> a(int $$0, BiConsumer<MinecraftServer, d> $$12) {
            return new f<d>(IntegerArgumentType::integer, $$1 -> new d((f<d>)$$1, $$0), $$12, c::c);
        }

        static f<d> a(int $$02) {
            return cmi$d.a($$02, (MinecraftServer $$0, d $$1) -> {});
        }

        public d(f<d> $$0, int $$1) {
            super($$0);
            this.b = $$1;
        }

        @Override
        protected void a(CommandContext<ds> $$0, String $$1) {
            this.b = IntegerArgumentType.getInteger($$0, (String)$$1);
        }

        public int a() {
            return this.b;
        }

        @Override
        public void a(int $$0, @Nullable MinecraftServer $$1) {
            this.b = $$0;
            this.a($$1);
        }

        @Override
        public String b() {
            return Integer.toString(this.b);
        }

        @Override
        protected void a(String $$0) {
            this.b = cmi$d.c($$0);
        }

        public boolean b(String $$0) {
            try {
                this.b = Integer.parseInt($$0);
                return true;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
        }

        private static int c(String $$0) {
            if (!$$0.isEmpty()) {
                try {
                    return Integer.parseInt($$0);
                }
                catch (NumberFormatException $$1) {
                    U.warn("Failed to parse integer {}", (Object)$$0);
                }
            }
            return 0;
        }

        @Override
        public int c() {
            return this.b;
        }

        protected d d() {
            return this;
        }

        protected d e() {
            return new d(this.a, this.b);
        }

        @Override
        public void a(d $$0, @Nullable MinecraftServer $$1) {
            this.b = $$0.b;
            this.a($$1);
        }

        @Override
        protected /* synthetic */ g f() {
            return this.e();
        }

        @Override
        protected /* synthetic */ g g() {
            return this.d();
        }
    }

    static interface h<T extends g<T>> {
        public void call(c var1, e<T> var2, f<T> var3);
    }
}

