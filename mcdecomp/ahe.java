/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahe
extends MinecraftServer
implements adf {
    static final Logger n = LogUtils.getLogger();
    private static final int o = 5000;
    private static final int p = 2;
    private final List<acu> q = Collections.synchronizedList(Lists.newArrayList());
    @Nullable
    private ama r;
    private final alx s;
    @Nullable
    private amc t;
    private final ahg u;
    @Nullable
    private ahk v;
    @Nullable
    private final aje w;

    public ahe(Thread $$0, dyy.c $$1, aki $$2, adk $$3, ahg $$4, DataFixer $$5, adh $$6, aip $$7) {
        super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
        this.u = $$4;
        this.s = new alx(this);
        this.w = aje.a($$4.a().R);
    }

    @Override
    public boolean e() throws IOException {
        Thread $$0 = new Thread("Server console handler"){

            @Override
            public void run() {
                BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
                try {
                    String $$1;
                    while (!ahe.this.ab() && ahe.this.v() && ($$1 = $$0.readLine()) != null) {
                        ahe.this.a($$1, ahe.this.aD());
                    }
                }
                catch (IOException $$2) {
                    n.error("Exception handling console input", (Throwable)$$2);
                }
            }
        };
        $$0.setDaemon(true);
        $$0.setUncaughtExceptionHandler(new r(n));
        $$0.start();
        n.info("Starting minecraft server version {}", (Object)aa.b().c());
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            n.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        n.info("Loading properties");
        ahf $$1 = this.u.a();
        if (this.O()) {
            this.a_("127.0.0.1");
        } else {
            this.d($$1.a);
            this.e($$1.b);
            this.a_($$1.c);
        }
        this.f($$1.f);
        this.g($$1.g);
        this.d($$1.h);
        super.c($$1.U.get());
        this.h($$1.j);
        this.m.a($$1.l);
        n.info("Default game type: {}", (Object)$$1.l);
        InetAddress $$2 = null;
        if (!this.u().isEmpty()) {
            $$2 = InetAddress.getByName(this.u());
        }
        if (this.M() < 0) {
            this.a($$1.n);
        }
        this.P();
        n.info("Starting Minecraft server on {}:{}", (Object)(this.u().isEmpty() ? "*" : this.u()), (Object)this.M());
        try {
            this.ad().a($$2, this.M());
        }
        catch (IOException $$3) {
            n.warn("**** FAILED TO BIND TO PORT!");
            n.warn("The exception was: {}", (Object)$$3.toString());
            n.warn("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.U()) {
            n.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            n.warn("The server will make no attempt to authenticate usernames. Beware.");
            n.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            n.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        if (this.bi()) {
            this.ap().c();
        }
        if (!alj.e(this)) {
            return false;
        }
        this.a(new ahd(this, this.aW(), this.i));
        long $$4 = ac.c();
        dax.a(this.l, this);
        alg.a(this.U());
        n.info("Preparing level \"{}\"", (Object)this.q());
        this.n_();
        long $$5 = ac.c() - $$4;
        String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
        n.info("Done ({})! For help, type \"help\"", (Object)$$6);
        if ($$1.o != null) {
            this.aI().a(cmi.y).a($$1.o, (MinecraftServer)this);
        }
        if ($$1.p) {
            n.info("Starting GS4 status listener");
            this.r = ama.a(this);
        }
        if ($$1.r) {
            n.info("Starting remote control listener");
            this.t = amc.a(this);
        }
        if (this.bj() > 0L) {
            Thread $$7 = new Thread(new ahh(this));
            $$7.setUncaughtExceptionHandler(new s(n));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
        }
        if ($$1.N) {
            bad.a(this);
            n.info("JMX monitoring enabled");
        }
        return true;
    }

    @Override
    public boolean W() {
        return this.a().d && super.W();
    }

    @Override
    public boolean Q() {
        return this.u.a().w && super.Q();
    }

    @Override
    public boolean X() {
        return this.u.a().e && super.X();
    }

    @Override
    public ahf a() {
        return this.u.a();
    }

    @Override
    public void r() {
        this.a(this.a().k, true);
    }

    @Override
    public boolean h() {
        return this.a().u;
    }

    @Override
    public ab a(ab $$0) {
        $$0.a("Is Modded", () -> this.K().b());
        $$0.a("Type", () -> "Dedicated Server (map_server.txt)");
        return $$0;
    }

    @Override
    public void a(Path $$0) throws IOException {
        ahf $$1 = this.a();
        try (BufferedWriter $$2 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.M));
            $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.l));
            $$2.write(String.format(Locale.ROOT, "spawn-monsters=%s%n", $$1.w));
            $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.Q));
            $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.L));
            $$2.write(String.format(Locale.ROOT, "spawn-npcs=%s%n", $$1.e));
            $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.F));
            $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.G));
            $$2.write(String.format(Locale.ROOT, "spawn-animals=%s%n", $$1.d));
            $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.X.c()));
            $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.x));
            $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.E));
        }
    }

    @Override
    public void g() {
        if (this.w != null) {
            this.w.close();
        }
        if (this.v != null) {
            this.v.b();
        }
        if (this.t != null) {
            this.t.b();
        }
        if (this.r != null) {
            this.r.b();
        }
    }

    @Override
    public void b(BooleanSupplier $$0) {
        super.b($$0);
        this.bf();
    }

    @Override
    public boolean B() {
        return this.a().v;
    }

    public void a(String $$0, ds $$1) {
        this.q.add(new acu($$0, $$1));
    }

    public void bf() {
        while (!this.q.isEmpty()) {
            acu $$0 = this.q.remove(0);
            this.aC().a($$0.b, $$0.a);
        }
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public int m() {
        return this.a().E;
    }

    @Override
    public boolean n() {
        return this.a().x;
    }

    public ahd bg() {
        return (ahd)super.ac();
    }

    @Override
    public boolean p() {
        return true;
    }

    @Override
    public String b() {
        return this.u();
    }

    @Override
    public int d() {
        return this.M();
    }

    @Override
    public String f() {
        return this.aa();
    }

    public void bh() {
        if (this.v == null) {
            this.v = ahk.a(this);
        }
    }

    @Override
    public boolean af() {
        return this.v != null;
    }

    @Override
    public boolean o() {
        return this.a().y;
    }

    @Override
    public int ah() {
        return this.a().z;
    }

    @Override
    public boolean a(aif $$0, gu $$1, byo $$2) {
        int $$5;
        if ($$0.ac() != cmm.h) {
            return false;
        }
        if (this.bg().k().c()) {
            return false;
        }
        if (this.bg().f($$2.fM())) {
            return false;
        }
        if (this.ah() <= 0) {
            return false;
        }
        gu $$3 = $$0.R();
        int $$4 = apa.a($$1.u() - $$3.u());
        int $$6 = Math.max($$4, $$5 = apa.a($$1.w() - $$3.w()));
        return $$6 <= this.ah();
    }

    @Override
    public boolean ai() {
        return this.a().O;
    }

    @Override
    public boolean aj() {
        return this.a().P;
    }

    @Override
    public int i() {
        return this.a().A;
    }

    @Override
    public int j() {
        return this.a().B;
    }

    @Override
    public void c(int $$0) {
        super.c($$0);
        this.u.a($$1 -> (ahf)$$1.U.a(this.aV(), $$0));
    }

    @Override
    public boolean k() {
        return this.a().J;
    }

    @Override
    public boolean N_() {
        return this.a().K;
    }

    @Override
    public int as() {
        return this.a().L;
    }

    @Override
    public int av() {
        return this.a().I;
    }

    @Override
    public boolean aw() {
        ahf $$0 = this.a();
        return $$0.W && $$0.a && this.l.a() != null;
    }

    protected boolean bi() {
        int $$1;
        boolean $$0 = false;
        for ($$1 = 0; !$$0 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                n.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
                this.bs();
            }
            $$0 = alj.a((MinecraftServer)this);
        }
        boolean $$2 = false;
        for ($$1 = 0; !$$2 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                n.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
                this.bs();
            }
            $$2 = alj.b(this);
        }
        boolean $$3 = false;
        for ($$1 = 0; !$$3 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                n.warn("Encountered a problem while converting the op list, retrying in a few seconds");
                this.bs();
            }
            $$3 = alj.c(this);
        }
        boolean $$4 = false;
        for ($$1 = 0; !$$4 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                n.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
                this.bs();
            }
            $$4 = alj.d(this);
        }
        boolean $$5 = false;
        for ($$1 = 0; !$$5 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                n.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
                this.bs();
            }
            $$5 = alj.a(this);
        }
        return $$0 || $$2 || $$3 || $$4 || $$5;
    }

    private void bs() {
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException $$0) {
            return;
        }
    }

    public long bj() {
        return this.a().C;
    }

    @Override
    public int bd() {
        return this.a().D;
    }

    @Override
    public String s() {
        return "";
    }

    @Override
    public String a(String $$0) {
        this.s.e();
        this.h(() -> this.aC().a(this.s.g(), $$0));
        return this.s.f();
    }

    @Override
    public void i(boolean $$0) {
        this.u.a($$1 -> (ahf)$$1.V.a(this.aV(), $$0));
    }

    @Override
    public void t() {
        super.t();
        ac.h();
        dax.c();
    }

    @Override
    public boolean a(GameProfile $$0) {
        return false;
    }

    @Override
    public int b(int $$0) {
        return this.a().Q * $$0 / 100;
    }

    @Override
    public String q() {
        return this.h.a();
    }

    @Override
    public boolean aS() {
        return this.u.a().M;
    }

    @Override
    public ajd a(aig $$0) {
        if (this.w != null) {
            return this.w.a($$0.fM());
        }
        return ajd.a;
    }

    @Override
    @Nullable
    public cmj aX() {
        return this.u.a().i ? this.m.m() : null;
    }

    @Override
    public Optional<MinecraftServer.b> S() {
        return this.u.a().S;
    }

    @Override
    public /* synthetic */ alk ac() {
        return this.bg();
    }
}

