/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.properties.PropertyMap$Serializer
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  org.slf4j.Logger
 */
package net.minecraft.client.main;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public class Main {
    static final Logger a = LogUtils.getLogger();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @DontObfuscate
    public static void main(String[] $$0) {
        Thread $$74;
        void $$72;
        Stopwatch $$1 = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
        Stopwatch $$2 = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
        fzr.a.a(fzn.z, $$1);
        fzr.a.a(fzn.A, $$2);
        aa.a();
        aa.d();
        OptionParser $$3 = new OptionParser();
        $$3.allowsUnrecognizedOptions();
        $$3.accepts("demo");
        $$3.accepts("disableMultiplayer");
        $$3.accepts("disableChat");
        $$3.accepts("fullscreen");
        $$3.accepts("checkGlErrors");
        OptionSpecBuilder $$4 = $$3.accepts("jfrProfile");
        ArgumentAcceptingOptionSpec $$5 = $$3.accepts("quickPlayPath").withRequiredArg();
        ArgumentAcceptingOptionSpec $$6 = $$3.accepts("quickPlaySingleplayer").withRequiredArg();
        ArgumentAcceptingOptionSpec $$7 = $$3.accepts("quickPlayMultiplayer").withRequiredArg();
        ArgumentAcceptingOptionSpec $$8 = $$3.accepts("quickPlayRealms").withRequiredArg();
        ArgumentAcceptingOptionSpec $$9 = $$3.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        ArgumentAcceptingOptionSpec $$10 = $$3.accepts("assetsDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec $$11 = $$3.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec $$12 = $$3.accepts("proxyHost").withRequiredArg();
        ArgumentAcceptingOptionSpec $$13 = $$3.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$14 = $$3.accepts("proxyUser").withRequiredArg();
        ArgumentAcceptingOptionSpec $$15 = $$3.accepts("proxyPass").withRequiredArg();
        ArgumentAcceptingOptionSpec $$16 = $$3.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + ac.b() % 1000L), (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$17 = $$3.accepts("uuid").withRequiredArg();
        ArgumentAcceptingOptionSpec $$18 = $$3.accepts("xuid").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$19 = $$3.accepts("clientId").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$20 = $$3.accepts("accessToken").withRequiredArg().required();
        ArgumentAcceptingOptionSpec $$21 = $$3.accepts("version").withRequiredArg().required();
        ArgumentAcceptingOptionSpec $$22 = $$3.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$23 = $$3.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$24 = $$3.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$25 = $$3.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$26 = $$3.accepts("userProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$27 = $$3.accepts("profileProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$28 = $$3.accepts("assetIndex").withRequiredArg();
        ArgumentAcceptingOptionSpec $$29 = $$3.accepts("userType").withRequiredArg().defaultsTo((Object)eoc.a.a.a(), (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$30 = $$3.accepts("versionType").withRequiredArg().defaultsTo((Object)"release", (Object[])new String[0]);
        NonOptionArgumentSpec $$31 = $$3.nonOptions();
        OptionSet $$32 = $$3.parse($$0);
        List $$33 = $$32.valuesOf((OptionSpec)$$31);
        if (!$$33.isEmpty()) {
            System.out.println("Completely ignored arguments: " + $$33);
        }
        String $$34 = (String)Main.a($$32, $$12);
        Proxy $$35 = Proxy.NO_PROXY;
        if ($$34 != null) {
            try {
                $$35 = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress($$34, (int)((Integer)Main.a($$32, $$13))));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        final String $$36 = (String)Main.a($$32, $$14);
        final String $$37 = (String)Main.a($$32, $$15);
        if (!$$35.equals(Proxy.NO_PROXY) && Main.b($$36) && Main.b($$37)) {
            Authenticator.setDefault(new Authenticator(){

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication($$36, $$37.toCharArray());
                }
            });
        }
        int $$38 = (Integer)Main.a($$32, $$22);
        int $$39 = (Integer)Main.a($$32, $$23);
        OptionalInt $$40 = Main.a((Integer)Main.a($$32, $$24));
        OptionalInt $$41 = Main.a((Integer)Main.a($$32, $$25));
        boolean $$42 = $$32.has("fullscreen");
        boolean $$43 = $$32.has("demo");
        boolean $$44 = $$32.has("disableMultiplayer");
        boolean $$45 = $$32.has("disableChat");
        String $$46 = (String)Main.a($$32, $$21);
        Gson $$47 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, (Object)new PropertyMap.Serializer()).create();
        PropertyMap $$48 = aor.a($$47, (String)Main.a($$32, $$26), PropertyMap.class);
        PropertyMap $$49 = aor.a($$47, (String)Main.a($$32, $$27), PropertyMap.class);
        String $$50 = (String)Main.a($$32, $$30);
        File $$51 = (File)Main.a($$32, $$9);
        File $$52 = $$32.has((OptionSpec)$$10) ? (File)Main.a($$32, $$10) : new File($$51, "assets/");
        File $$53 = $$32.has((OptionSpec)$$11) ? (File)Main.a($$32, $$11) : new File($$51, "resourcepacks/");
        String $$54 = $$32.has((OptionSpec)$$17) ? (String)$$17.value($$32) : hy.a((String)$$16.value($$32)).toString();
        String $$55 = $$32.has((OptionSpec)$$28) ? (String)$$28.value($$32) : null;
        String $$56 = (String)$$32.valueOf((OptionSpec)$$18);
        String $$57 = (String)$$32.valueOf((OptionSpec)$$19);
        String $$58 = (String)Main.a($$32, $$5);
        String $$59 = (String)Main.a($$32, $$6);
        String $$60 = (String)Main.a($$32, $$7);
        String $$61 = (String)Main.a($$32, $$8);
        if ($$32.has((OptionSpec)$$4)) {
            bat.e.a(bar.a);
        }
        o.h();
        acs.a();
        fzr.a.a(acs.b.get());
        acs.c();
        ac.l();
        String $$62 = (String)$$29.value($$32);
        eoc.a $$63 = eoc.a.a($$62);
        if ($$63 == null) {
            a.warn("Unrecognized user type: {}", (Object)$$62);
        }
        eoc $$64 = new eoc((String)$$16.value($$32), $$54, (String)$$20.value($$32), Main.a($$56), Main.a($$57), $$63);
        ezy $$65 = new ezy(new ezy.d($$64, $$48, $$49, $$35), new eha($$38, $$39, $$40, $$41, $$42), new ezy.a($$51, $$53, $$52, $$55), new ezy.b($$43, $$46, $$50, $$44, $$45), new ezy.c($$58, $$59, $$60, $$61));
        Thread $$66 = new Thread("Client Shutdown Thread"){

            @Override
            public void run() {
                enn $$0 = enn.N();
                if ($$0 == null) {
                    return;
                }
                fyp $$1 = $$0.S();
                if ($$1 != null) {
                    $$1.a(true);
                }
            }
        };
        $$66.setUncaughtExceptionHandler(new r(a));
        Runtime.getRuntime().addShutdownHook($$66);
        try {
            Thread.currentThread().setName("Render thread");
            RenderSystem.initRenderThread();
            RenderSystem.beginInitialization();
            enn $$67 = new enn($$65);
            RenderSystem.finishInitialization();
        }
        catch (ezz $$68) {
            a.warn("Failed to create window: ", (Throwable)$$68);
            return;
        }
        catch (Throwable $$69) {
            o $$70 = o.a($$69, "Initializing game");
            p $$71 = $$70.a("Initialization");
            apb.a($$71);
            enn.a(null, null, $$65.d.b, null, $$70);
            enn.c($$70);
            return;
        }
        if ($$72.aL()) {
            Thread $$73 = new Thread("Game thread", (enn)$$72){
                final /* synthetic */ enn a;
                {
                    this.a = enn2;
                    super($$0);
                }

                @Override
                public void run() {
                    try {
                        RenderSystem.initGameThread(true);
                        this.a.e();
                    }
                    catch (Throwable $$0) {
                        a.error("Exception in client thread", $$0);
                    }
                }
            };
            $$73.start();
            while ($$72.q()) {
            }
        } else {
            $$74 = null;
            try {
                RenderSystem.initGameThread(false);
                $$72.e();
            }
            catch (Throwable $$75) {
                a.error("Unhandled game exception", $$75);
            }
        }
        eif.a();
        try {
            $$72.p();
            if ($$74 != null) {
                $$74.join();
            }
        }
        catch (InterruptedException $$76) {
            a.error("Exception during client thread shutdown", (Throwable)$$76);
        }
        finally {
            $$72.l();
        }
    }

    private static Optional<String> a(String $$0) {
        return $$0.isEmpty() ? Optional.empty() : Optional.of($$0);
    }

    private static OptionalInt a(@Nullable Integer $$0) {
        return $$0 != null ? OptionalInt.of($$0) : OptionalInt.empty();
    }

    @Nullable
    private static <T> T a(OptionSet $$0, OptionSpec<T> $$1) {
        try {
            return (T)$$0.valueOf($$1);
        }
        catch (Throwable $$2) {
            ArgumentAcceptingOptionSpec $$3;
            List $$4;
            if ($$1 instanceof ArgumentAcceptingOptionSpec && !($$4 = ($$3 = (ArgumentAcceptingOptionSpec)$$1).defaultValues()).isEmpty()) {
                return (T)$$4.get(0);
            }
            throw $$2;
        }
    }

    private static boolean b(@Nullable String $$0) {
        return $$0 != null && !$$0.isEmpty();
    }

    static {
        System.setProperty("java.awt.headless", "true");
    }
}

