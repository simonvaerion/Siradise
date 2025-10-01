/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  joptsimple.ValueConverter
 *  joptsimple.util.PathConverter
 *  joptsimple.util.PathProperties
 *  org.slf4j.Logger
 */
package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import joptsimple.ValueConverter;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;
import net.minecraft.obfuscate.DontObfuscate;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class Main {
    private static final Logger a = LogUtils.getLogger();

    /*
     * WARNING - void declaration
     */
    @DontObfuscate
    public static void main(String[] $$0) {
        aa.a();
        OptionParser $$1 = new OptionParser();
        OptionSpecBuilder $$2 = $$1.accepts("nogui");
        OptionSpecBuilder $$3 = $$1.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
        OptionSpecBuilder $$4 = $$1.accepts("demo");
        OptionSpecBuilder $$5 = $$1.accepts("bonusChest");
        OptionSpecBuilder $$6 = $$1.accepts("forceUpgrade");
        OptionSpecBuilder $$7 = $$1.accepts("eraseCache");
        OptionSpecBuilder $$8 = $$1.accepts("safeMode", "Loads level with vanilla datapack only");
        AbstractOptionSpec $$9 = $$1.accepts("help").forHelp();
        ArgumentAcceptingOptionSpec $$10 = $$1.accepts("singleplayer").withRequiredArg();
        ArgumentAcceptingOptionSpec $$11 = $$1.accepts("universe").withRequiredArg().defaultsTo((Object)".", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$12 = $$1.accepts("world").withRequiredArg();
        ArgumentAcceptingOptionSpec $$13 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)-1, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$14 = $$1.accepts("serverId").withRequiredArg();
        OptionSpecBuilder $$15 = $$1.accepts("jfrProfile");
        ArgumentAcceptingOptionSpec $$16 = $$1.accepts("pidFile").withRequiredArg().withValuesConvertedBy((ValueConverter)new PathConverter(new PathProperties[0]));
        NonOptionArgumentSpec $$17 = $$1.nonOptions();
        try {
            void $$35;
            boolean $$30;
            OptionSet $$18 = $$1.parse($$0);
            if ($$18.has((OptionSpec)$$9)) {
                $$1.printHelpOn((OutputStream)System.err);
                return;
            }
            Path $$19 = (Path)$$18.valueOf((OptionSpec)$$16);
            if ($$19 != null) {
                Main.a($$19);
            }
            o.h();
            if ($$18.has((OptionSpec)$$15)) {
                bat.e.a(bar.b);
            }
            acs.a();
            acs.c();
            ac.l();
            Path $$20 = Paths.get("server.properties", new String[0]);
            ahg $$21 = new ahg($$20);
            $$21.b();
            Path $$22 = Paths.get("eula.txt", new String[0]);
            acw $$23 = new acw($$22);
            if ($$18.has((OptionSpec)$$3)) {
                a.info("Initialized '{}' and '{}'", (Object)$$20.toAbsolutePath(), (Object)$$22.toAbsolutePath());
                return;
            }
            if (!$$23.a()) {
                a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
                return;
            }
            File $$24 = new File((String)$$18.valueOf((OptionSpec)$$11));
            adh $$25 = adh.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
            String $$26 = Optional.ofNullable((String)$$18.valueOf((OptionSpec)$$12)).orElse($$21.a().m);
            dyy $$27 = dyy.b($$24.toPath());
            dyy.c $$28 = $$27.c($$26);
            dyz $$29 = $$28.c();
            if ($$29 != null) {
                if ($$29.d()) {
                    a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
                    return;
                }
                if (!$$29.r()) {
                    a.info("This world was created by an incompatible version.");
                    return;
                }
            }
            if ($$30 = $$18.has((OptionSpec)$$8)) {
                a.warn("Safe mode active, only vanilla datapack will be loaded");
            }
            aki $$31 = akl.a($$28.a(dyw.j));
            try {
                adj.c $$32 = Main.a($$21.a(), $$28, $$30, $$31);
                adk $$33 = (adk)ac.c(arg_0 -> Main.a($$32, $$28, $$18, (OptionSpec)$$4, $$21, (OptionSpec)$$5, arg_0)).get();
            }
            catch (Exception $$34) {
                a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", (Throwable)$$34);
                return;
            }
            hs.b $$36 = $$35.c().a();
            if ($$18.has((OptionSpec)$$6)) {
                Main.a($$28, aqd.a(), $$18.has((OptionSpec)$$7), () -> true, $$36.d(jc.aI));
            }
            dze $$37 = $$35.d();
            $$28.a($$36, $$37);
            final ahe $$38 = MinecraftServer.a(arg_0 -> Main.a($$28, $$31, (adk)$$35, $$21, $$25, $$18, (OptionSpec)$$10, (OptionSpec)$$13, (OptionSpec)$$4, (OptionSpec)$$14, (OptionSpec)$$2, (OptionSpec)$$17, arg_0));
            Thread $$39 = new Thread("Server Shutdown Thread"){

                @Override
                public void run() {
                    $$38.a(true);
                }
            };
            $$39.setUncaughtExceptionHandler(new r(a));
            Runtime.getRuntime().addShutdownHook($$39);
        }
        catch (Exception $$40) {
            a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", (Throwable)$$40);
        }
    }

    private static void a(Path $$0) {
        try {
            long $$1 = ProcessHandle.current().pid();
            Files.writeString($$0, (CharSequence)Long.toString($$1), new OpenOption[0]);
        }
        catch (IOException $$2) {
            throw new UncheckedIOException($$2);
        }
    }

    private static adj.c a(ahf $$0, dyy.c $$1, boolean $$2, aki $$3) {
        cnf $$8;
        boolean $$7;
        cnf $$4 = $$1.d();
        if ($$4 != null) {
            boolean $$5 = false;
            cnf $$6 = $$4;
        } else {
            $$7 = true;
            $$8 = new cnf($$0.T, cay.f);
        }
        adj.d $$9 = new adj.d($$3, $$8, $$2, $$7);
        return new adj.c($$9, dt.a.b, $$0.B);
    }

    private static void a(dyy.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, hr<dfl> $$4) {
        a.info("Forcing world upgrade!");
        bdl $$5 = new bdl($$0, $$1, $$4, $$2);
        sw $$6 = null;
        while (!$$5.b()) {
            int $$8;
            sw $$7 = $$5.h();
            if ($$6 != $$7) {
                $$6 = $$7;
                a.info($$5.h().getString());
            }
            if (($$8 = $$5.e()) > 0) {
                int $$9 = $$5.f() + $$5.g();
                a.info("{}% completed ({} / {} chunks)...", new Object[]{apa.d((float)$$9 / (float)$$8 * 100.0f), $$9, $$8});
            }
            if (!$$3.getAsBoolean()) {
                $$5.a();
                continue;
            }
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private static /* synthetic */ ahe a(dyy.c $$0, aki $$1, adk $$2, ahg $$3, adh $$4, OptionSet $$5, OptionSpec $$6, OptionSpec $$7, OptionSpec $$8, OptionSpec $$9, OptionSpec $$10, OptionSpec $$11, Thread $$12) {
        boolean $$14;
        ahe $$13 = new ahe($$12, $$0, $$1, $$2, $$3, aqd.a(), $$4, aiq::new);
        $$13.b($$5.has($$6) ? new GameProfile(null, (String)$$5.valueOf($$6)) : null);
        $$13.a((Integer)$$5.valueOf($$7));
        $$13.c($$5.has($$8));
        $$13.b((String)$$5.valueOf($$9));
        boolean bl2 = $$14 = !$$5.has($$10) && !$$5.valuesOf($$11).contains("nogui");
        if ($$14 && !GraphicsEnvironment.isHeadless()) {
            $$13.bh();
        }
        return $$13;
    }

    private static /* synthetic */ CompletableFuture a(adj.c $$0, dyy.c $$1, OptionSet $$2, OptionSpec $$3, ahg $$4, OptionSpec $$52, Executor $$6) {
        return adj.a($$0, (adj.a $$5) -> {
            dif $$15;
            dii $$14;
            cmq $$13;
            hr<dfl> $$6 = $$5.d().d(jc.aI);
            aco<rk> $$7 = aco.a(rc.a, $$5.c());
            Pair<dze, dif.b> $$8 = $$1.a($$7, $$5.b(), $$6, $$5.c().d());
            if ($$8 != null) {
                return new adj.b<dze>((dze)$$8.getFirst(), ((dif.b)$$8.getSecond()).b());
            }
            if ($$2.has($$3)) {
                cmq $$9 = MinecraftServer.f;
                dii $$10 = dii.b;
                dif $$11 = drq.a($$5.c());
            } else {
                ahf $$12 = $$4.a();
                $$13 = new cmq($$12.m, $$12.l, $$12.u, $$12.k, false, new cmi(), $$5.b());
                $$14 = $$2.has($$52) ? $$12.X.a(true) : $$12.X;
                $$15 = $$12.a($$5.c());
            }
            dif.b $$16 = $$15.a($$6);
            Lifecycle $$17 = $$16.a().add($$5.c().d());
            return new adj.b<dzc>(new dzc($$13, $$14, $$16.d(), $$17), $$16.b());
        }, adk::new, ac.f(), $$6);
    }
}

