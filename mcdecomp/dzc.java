/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dzc
implements dzd,
dze {
    private static final Logger e = LogUtils.getLogger();
    protected static final String a = "Player";
    protected static final String b = "WorldGenSettings";
    private cmq f;
    private final dii g;
    private final a h;
    private final Lifecycle i;
    private int j;
    private int k;
    private int l;
    private float m;
    private long n;
    private long o;
    @Nullable
    private final DataFixer p;
    private final int q;
    private boolean r;
    @Nullable
    private qr s;
    private final int t;
    private int u;
    private boolean v;
    private int w;
    private boolean x;
    private int y;
    private boolean z;
    private boolean A;
    private dds.c B;
    private dfn.a C;
    @Nullable
    private qr D;
    private int E;
    private int F;
    @Nullable
    private UUID G;
    private final Set<String> H;
    private boolean I;
    private final Set<String> J;
    private final edv<MinecraftServer> K;

    private dzc(@Nullable DataFixer $$0, int $$1, @Nullable qr $$2, boolean $$3, int $$4, int $$5, int $$6, float $$7, long $$8, long $$9, int $$10, int $$11, int $$12, boolean $$13, int $$14, boolean $$15, boolean $$16, boolean $$17, dds.c $$18, int $$19, int $$20, @Nullable UUID $$21, Set<String> $$22, Set<String> $$23, edv<MinecraftServer> $$24, @Nullable qr $$25, dfn.a $$26, cmq $$27, dii $$28, a $$29, Lifecycle $$30) {
        this.p = $$0;
        this.I = $$3;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.m = $$7;
        this.n = $$8;
        this.o = $$9;
        this.t = $$10;
        this.u = $$11;
        this.w = $$12;
        this.v = $$13;
        this.y = $$14;
        this.x = $$15;
        this.z = $$16;
        this.A = $$17;
        this.B = $$18;
        this.E = $$19;
        this.F = $$20;
        this.G = $$21;
        this.H = $$22;
        this.J = $$23;
        this.s = $$2;
        this.q = $$1;
        this.K = $$24;
        this.D = $$25;
        this.C = $$26;
        this.f = $$27;
        this.g = $$28;
        this.h = $$29;
        this.i = $$30;
    }

    public dzc(cmq $$0, dii $$1, a $$2, Lifecycle $$3) {
        this(null, aa.b().d().c(), null, false, 0, 0, 0, 0.0f, 0L, 0L, 19133, 0, 0, false, 0, false, false, false, dds.e, 0, 0, null, Sets.newLinkedHashSet(), new HashSet<String>(), new edv<MinecraftServer>(edu.a), null, dfn.a.b, $$0.h(), $$1, $$2, $$3);
    }

    public static <T> dzc a(Dynamic<T> $$02, DataFixer $$1, int $$2, @Nullable qr $$3, cmq $$4, dza $$5, a $$6, dii $$7, Lifecycle $$8) {
        long $$9 = $$02.get("Time").asLong(0L);
        return new dzc($$1, $$2, $$3, $$02.get("WasModded").asBoolean(false), $$02.get("SpawnX").asInt(0), $$02.get("SpawnY").asInt(0), $$02.get("SpawnZ").asInt(0), $$02.get("SpawnAngle").asFloat(0.0f), $$9, $$02.get("DayTime").asLong($$9), $$5.a(), $$02.get("clearWeatherTime").asInt(0), $$02.get("rainTime").asInt(0), $$02.get("raining").asBoolean(false), $$02.get("thunderTime").asInt(0), $$02.get("thundering").asBoolean(false), $$02.get("initialized").asBoolean(true), $$02.get("DifficultyLocked").asBoolean(false), dds.c.a($$02, dds.e), $$02.get("WanderingTraderSpawnDelay").asInt(0), $$02.get("WanderingTraderSpawnChance").asInt(0), $$02.get("WanderingTraderId").read(hy.a).result().orElse(null), $$02.get("ServerBrands").asStream().flatMap($$0 -> $$0.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)), $$02.get("removed_features").asStream().flatMap($$0 -> $$0.asString().result().stream()).collect(Collectors.toSet()), new edv<MinecraftServer>(edu.a, $$02.get("ScheduledEvents").asStream()), (qr)$$02.get("CustomBossEvents").orElseEmptyMap().getValue(), $$02.get("DragonFight").read(dfn.a.a).resultOrPartial(arg_0 -> ((Logger)e).error(arg_0)).orElse(dfn.a.b), $$4, $$7, $$6, $$8);
    }

    @Override
    public qr a(hs $$0, @Nullable qr $$1) {
        this.N();
        if ($$1 == null) {
            $$1 = this.s;
        }
        qr $$2 = new qr();
        this.a($$0, $$2, $$1);
        return $$2;
    }

    private void a(hs $$02, qr $$12, @Nullable qr $$2) {
        $$12.a("ServerBrands", dzc.a(this.H));
        $$12.a("WasModded", this.I);
        if (!this.J.isEmpty()) {
            $$12.a("removed_features", dzc.a(this.J));
        }
        qr $$3 = new qr();
        $$3.a("Name", aa.b().c());
        $$3.a("Id", aa.b().d().c());
        $$3.a("Snapshot", !aa.b().g());
        $$3.a("Series", aa.b().d().b());
        $$12.a("Version", $$3);
        rd.g($$12);
        aco<rk> $$4 = aco.a(rc.a, $$02);
        dig.a($$4, this.g, $$02).resultOrPartial(ac.a("WorldGenSettings: ", arg_0 -> ((Logger)e).error(arg_0))).ifPresent($$1 -> $$12.a(b, (rk)$$1));
        $$12.a("GameType", this.f.b().a());
        $$12.a("SpawnX", this.j);
        $$12.a("SpawnY", this.k);
        $$12.a("SpawnZ", this.l);
        $$12.a("SpawnAngle", this.m);
        $$12.a("Time", this.n);
        $$12.a("DayTime", this.o);
        $$12.a("LastPlayed", ac.d());
        $$12.a("LevelName", this.f.a());
        $$12.a("version", 19133);
        $$12.a("clearWeatherTime", this.u);
        $$12.a("rainTime", this.w);
        $$12.a("raining", this.v);
        $$12.a("thunderTime", this.y);
        $$12.a("thundering", this.x);
        $$12.a("hardcore", this.f.c());
        $$12.a("allowCommands", this.f.e());
        $$12.a("initialized", this.z);
        this.B.a($$12);
        $$12.a("Difficulty", (byte)this.f.d().a());
        $$12.a("DifficultyLocked", this.A);
        $$12.a("GameRules", this.f.f().a());
        $$12.a("DragonFight", (rk)ac.a(dfn.a.a.encodeStart((DynamicOps)rc.a, (Object)this.C), IllegalStateException::new));
        if ($$2 != null) {
            $$12.a(a, $$2);
        }
        DataResult $$5 = cnf.b.encodeStart((DynamicOps)rc.a, (Object)this.f.g());
        $$5.get().ifLeft($$1 -> $$12.a((qr)$$1)).ifRight($$0 -> e.warn("Failed to encode configuration {}", (Object)$$0.message()));
        if (this.D != null) {
            $$12.a("CustomBossEvents", this.D);
        }
        $$12.a("ScheduledEvents", this.K.b());
        $$12.a("WanderingTraderSpawnDelay", this.E);
        $$12.a("WanderingTraderSpawnChance", this.F);
        if (this.G != null) {
            $$12.a("WanderingTraderId", this.G);
        }
    }

    private static qx a(Set<String> $$0) {
        qx $$1 = new qx();
        $$0.stream().map(ri::a).forEach($$1::add);
        return $$1;
    }

    @Override
    public int a() {
        return this.j;
    }

    @Override
    public int b() {
        return this.k;
    }

    @Override
    public int c() {
        return this.l;
    }

    @Override
    public float d() {
        return this.m;
    }

    @Override
    public long e() {
        return this.n;
    }

    @Override
    public long f() {
        return this.o;
    }

    private void N() {
        if (this.r || this.s == null) {
            return;
        }
        if (this.q < aa.b().d().c()) {
            if (this.p == null) {
                throw ac.b(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
            }
            this.s = aqc.b.a(this.p, this.s, this.q);
        }
        this.r = true;
    }

    @Override
    public qr y() {
        this.N();
        return this.s;
    }

    @Override
    public void b(int $$0) {
        this.j = $$0;
    }

    @Override
    public void c(int $$0) {
        this.k = $$0;
    }

    @Override
    public void d(int $$0) {
        this.l = $$0;
    }

    @Override
    public void a(float $$0) {
        this.m = $$0;
    }

    @Override
    public void a(long $$0) {
        this.n = $$0;
    }

    @Override
    public void b(long $$0) {
        this.o = $$0;
    }

    @Override
    public void a(gu $$0, float $$1) {
        this.j = $$0.u();
        this.k = $$0.v();
        this.l = $$0.w();
        this.m = $$1;
    }

    @Override
    public String g() {
        return this.f.a();
    }

    @Override
    public int z() {
        return this.t;
    }

    @Override
    public int h() {
        return this.u;
    }

    @Override
    public void a(int $$0) {
        this.u = $$0;
    }

    @Override
    public boolean i() {
        return this.x;
    }

    @Override
    public void a(boolean $$0) {
        this.x = $$0;
    }

    @Override
    public int j() {
        return this.y;
    }

    @Override
    public void e(int $$0) {
        this.y = $$0;
    }

    @Override
    public boolean k() {
        return this.v;
    }

    @Override
    public void b(boolean $$0) {
        this.v = $$0;
    }

    @Override
    public int l() {
        return this.w;
    }

    @Override
    public void f(int $$0) {
        this.w = $$0;
    }

    @Override
    public cmj m() {
        return this.f.b();
    }

    @Override
    public void a(cmj $$0) {
        this.f = this.f.a($$0);
    }

    @Override
    public boolean n() {
        return this.f.c();
    }

    @Override
    public boolean o() {
        return this.f.e();
    }

    @Override
    public boolean p() {
        return this.z;
    }

    @Override
    public void c(boolean $$0) {
        this.z = $$0;
    }

    @Override
    public cmi q() {
        return this.f.f();
    }

    @Override
    public dds.c r() {
        return this.B;
    }

    @Override
    public void a(dds.c $$0) {
        this.B = $$0;
    }

    @Override
    public bdu s() {
        return this.f.d();
    }

    @Override
    public void a(bdu $$0) {
        this.f = this.f.a($$0);
    }

    @Override
    public boolean t() {
        return this.A;
    }

    @Override
    public void d(boolean $$0) {
        this.A = $$0;
    }

    @Override
    public edv<MinecraftServer> u() {
        return this.K;
    }

    @Override
    public void a(p $$0, cmo $$1) {
        dzd.super.a($$0, $$1);
        dze.super.a($$0);
    }

    @Override
    public dii A() {
        return this.g;
    }

    @Override
    public boolean B() {
        return this.h == dzc$a.b;
    }

    @Override
    public boolean C() {
        return this.h == dzc$a.c;
    }

    @Override
    public Lifecycle D() {
        return this.i;
    }

    @Override
    public dfn.a E() {
        return this.C;
    }

    @Override
    public void a(dfn.a $$0) {
        this.C = $$0;
    }

    @Override
    public cnf F() {
        return this.f.g();
    }

    @Override
    public void a(cnf $$0) {
        this.f = this.f.a($$0);
    }

    @Override
    @Nullable
    public qr G() {
        return this.D;
    }

    @Override
    public void a(@Nullable qr $$0) {
        this.D = $$0;
    }

    @Override
    public int v() {
        return this.E;
    }

    @Override
    public void g(int $$0) {
        this.E = $$0;
    }

    @Override
    public int w() {
        return this.F;
    }

    @Override
    public void h(int $$0) {
        this.F = $$0;
    }

    @Override
    @Nullable
    public UUID x() {
        return this.G;
    }

    @Override
    public void a(UUID $$0) {
        this.G = $$0;
    }

    @Override
    public void a(String $$0, boolean $$1) {
        this.H.add($$0);
        this.I |= $$1;
    }

    @Override
    public boolean H() {
        return this.I;
    }

    @Override
    public Set<String> I() {
        return ImmutableSet.copyOf(this.H);
    }

    @Override
    public Set<String> J() {
        return Set.copyOf(this.J);
    }

    @Override
    public dzd K() {
        return this;
    }

    @Override
    public cmq L() {
        return this.f.h();
    }

    @Deprecated
    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = dzc$a.a();
        }
    }
}

