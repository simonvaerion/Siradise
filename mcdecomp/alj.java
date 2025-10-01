/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alj {
    static final Logger e = LogUtils.getLogger();
    public static final File a = new File("banned-ips.txt");
    public static final File b = new File("banned-players.txt");
    public static final File c = new File("ops.txt");
    public static final File d = new File("white-list.txt");

    static List<String> a(File $$0, Map<String, String[]> $$1) throws IOException {
        List $$2 = Files.readLines((File)$$0, (Charset)StandardCharsets.UTF_8);
        for (String $$3 : $$2) {
            if (($$3 = $$3.trim()).startsWith("#") || $$3.length() < 1) continue;
            String[] $$4 = $$3.split("\\|");
            $$1.put($$4[0].toLowerCase(Locale.ROOT), $$4);
        }
        return $$2;
    }

    private static void a(MinecraftServer $$02, Collection<String> $$1, ProfileLookupCallback $$2) {
        String[] $$3 = (String[])$$1.stream().filter($$0 -> !aps.b($$0)).toArray(String[]::new);
        if ($$02.U()) {
            $$02.ao().findProfilesByNames($$3, Agent.MINECRAFT, $$2);
        } else {
            for (String $$4 : $$3) {
                UUID $$5 = hy.a(new GameProfile(null, $$4));
                GameProfile $$6 = new GameProfile($$5, $$4);
                $$2.onProfileLookupSucceeded($$6);
            }
        }
    }

    public static boolean a(final MinecraftServer $$0) {
        final alq $$1 = new alq(alk.b);
        if (b.exists() && b.isFile()) {
            if ($$1.b().exists()) {
                try {
                    $$1.f();
                }
                catch (IOException $$2) {
                    e.warn("Could not load existing file {}", (Object)$$1.b().getName(), (Object)$$2);
                }
            }
            try {
                final HashMap $$3 = Maps.newHashMap();
                alj.a(b, $$3);
                ProfileLookupCallback $$4 = new ProfileLookupCallback(){

                    public void onProfileLookupSucceeded(GameProfile $$02) {
                        $$0.ap().a($$02);
                        String[] $$12 = (String[])$$3.get($$02.getName().toLowerCase(Locale.ROOT));
                        if ($$12 == null) {
                            e.warn("Could not convert user banlist entry for {}", (Object)$$02.getName());
                            throw new a("Profile not in the conversionlist");
                        }
                        Date $$2 = $$12.length > 1 ? alj.a($$12[1], null) : null;
                        String $$32 = $$12.length > 2 ? $$12[2] : null;
                        Date $$4 = $$12.length > 3 ? alj.a($$12[3], null) : null;
                        String $$5 = $$12.length > 4 ? $$12[4] : null;
                        $$1.a(new alr($$02, $$2, $$32, $$4, $$5));
                    }

                    public void onProfileLookupFailed(GameProfile $$02, Exception $$12) {
                        e.warn("Could not lookup user banlist entry for {}", (Object)$$02.getName(), (Object)$$12);
                        if (!($$12 instanceof ProfileNotFoundException)) {
                            throw new a("Could not request user " + $$02.getName() + " from backend systems", $$12);
                        }
                    }
                };
                alj.a($$0, $$3.keySet(), $$4);
                $$1.e();
                alj.b(b);
            }
            catch (IOException $$5) {
                e.warn("Could not read old user banlist to convert it!", (Throwable)$$5);
                return false;
            }
            catch (a $$6) {
                e.error("Conversion failed, please try again later", (Throwable)$$6);
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean b(MinecraftServer $$0) {
        alh $$1 = new alh(alk.c);
        if (a.exists() && a.isFile()) {
            if ($$1.b().exists()) {
                try {
                    $$1.f();
                }
                catch (IOException $$2) {
                    e.warn("Could not load existing file {}", (Object)$$1.b().getName(), (Object)$$2);
                }
            }
            try {
                HashMap $$3 = Maps.newHashMap();
                alj.a(a, $$3);
                for (String $$4 : $$3.keySet()) {
                    String[] $$5 = (String[])$$3.get($$4);
                    Date $$6 = $$5.length > 1 ? alj.a($$5[1], null) : null;
                    String $$7 = $$5.length > 2 ? $$5[2] : null;
                    Date $$8 = $$5.length > 3 ? alj.a($$5[3], null) : null;
                    String $$9 = $$5.length > 4 ? $$5[4] : null;
                    $$1.a(new ali($$4, $$6, $$7, $$8, $$9));
                }
                $$1.e();
                alj.b(a);
            }
            catch (IOException $$10) {
                e.warn("Could not parse old ip banlist to convert it!", (Throwable)$$10);
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean c(final MinecraftServer $$0) {
        final all $$1 = new all(alk.d);
        if (c.exists() && c.isFile()) {
            if ($$1.b().exists()) {
                try {
                    $$1.f();
                }
                catch (IOException $$2) {
                    e.warn("Could not load existing file {}", (Object)$$1.b().getName(), (Object)$$2);
                }
            }
            try {
                List $$3 = Files.readLines((File)c, (Charset)StandardCharsets.UTF_8);
                ProfileLookupCallback $$4 = new ProfileLookupCallback(){

                    public void onProfileLookupSucceeded(GameProfile $$02) {
                        $$0.ap().a($$02);
                        $$1.a(new alm($$02, $$0.i(), false));
                    }

                    public void onProfileLookupFailed(GameProfile $$02, Exception $$12) {
                        e.warn("Could not lookup oplist entry for {}", (Object)$$02.getName(), (Object)$$12);
                        if (!($$12 instanceof ProfileNotFoundException)) {
                            throw new a("Could not request user " + $$02.getName() + " from backend systems", $$12);
                        }
                    }
                };
                alj.a($$0, $$3, $$4);
                $$1.e();
                alj.b(c);
            }
            catch (IOException $$5) {
                e.warn("Could not read old oplist to convert it!", (Throwable)$$5);
                return false;
            }
            catch (a $$6) {
                e.error("Conversion failed, please try again later", (Throwable)$$6);
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean d(final MinecraftServer $$0) {
        final als $$1 = new als(alk.e);
        if (d.exists() && d.isFile()) {
            if ($$1.b().exists()) {
                try {
                    $$1.f();
                }
                catch (IOException $$2) {
                    e.warn("Could not load existing file {}", (Object)$$1.b().getName(), (Object)$$2);
                }
            }
            try {
                List $$3 = Files.readLines((File)d, (Charset)StandardCharsets.UTF_8);
                ProfileLookupCallback $$4 = new ProfileLookupCallback(){

                    public void onProfileLookupSucceeded(GameProfile $$02) {
                        $$0.ap().a($$02);
                        $$1.a(new alt($$02));
                    }

                    public void onProfileLookupFailed(GameProfile $$02, Exception $$12) {
                        e.warn("Could not lookup user whitelist entry for {}", (Object)$$02.getName(), (Object)$$12);
                        if (!($$12 instanceof ProfileNotFoundException)) {
                            throw new a("Could not request user " + $$02.getName() + " from backend systems", $$12);
                        }
                    }
                };
                alj.a($$0, $$3, $$4);
                $$1.e();
                alj.b(d);
            }
            catch (IOException $$5) {
                e.warn("Could not read old whitelist to convert it!", (Throwable)$$5);
                return false;
            }
            catch (a $$6) {
                e.error("Conversion failed, please try again later", (Throwable)$$6);
                return false;
            }
            return true;
        }
        return true;
    }

    @Nullable
    public static UUID a(final MinecraftServer $$0, String $$1) {
        if (aps.b($$1) || $$1.length() > 16) {
            try {
                return UUID.fromString($$1);
            }
            catch (IllegalArgumentException $$2) {
                return null;
            }
        }
        Optional<UUID> $$3 = $$0.ap().a($$1).map(GameProfile::getId);
        if ($$3.isPresent()) {
            return $$3.get();
        }
        if ($$0.O() || !$$0.U()) {
            return hy.a(new GameProfile(null, $$1));
        }
        final ArrayList $$4 = Lists.newArrayList();
        ProfileLookupCallback $$5 = new ProfileLookupCallback(){

            public void onProfileLookupSucceeded(GameProfile $$02) {
                $$0.ap().a($$02);
                $$4.add($$02);
            }

            public void onProfileLookupFailed(GameProfile $$02, Exception $$1) {
                e.warn("Could not lookup user whitelist entry for {}", (Object)$$02.getName(), (Object)$$1);
            }
        };
        alj.a($$0, Lists.newArrayList((Object[])new String[]{$$1}), $$5);
        if (!$$4.isEmpty() && ((GameProfile)$$4.get(0)).getId() != null) {
            return ((GameProfile)$$4.get(0)).getId();
        }
        return null;
    }

    public static boolean a(final ahe $$0) {
        final File $$1 = alj.g($$0);
        final File $$2 = new File($$1.getParentFile(), "playerdata");
        final File $$3 = new File($$1.getParentFile(), "unknownplayers");
        if (!$$1.exists() || !$$1.isDirectory()) {
            return true;
        }
        File[] $$4 = $$1.listFiles();
        ArrayList $$5 = Lists.newArrayList();
        for (File $$6 : $$4) {
            String $$8;
            String $$7 = $$6.getName();
            if (!$$7.toLowerCase(Locale.ROOT).endsWith(".dat") || ($$8 = $$7.substring(0, $$7.length() - ".dat".length())).isEmpty()) continue;
            $$5.add($$8);
        }
        try {
            Object[] $$9 = $$5.toArray(new String[$$5.size()]);
            ProfileLookupCallback $$10 = new ProfileLookupCallback(){
                final /* synthetic */ String[] e;
                {
                    this.e = stringArray;
                }

                public void onProfileLookupSucceeded(GameProfile $$02) {
                    $$0.ap().a($$02);
                    UUID $$12 = $$02.getId();
                    if ($$12 == null) {
                        throw new a("Missing UUID for user profile " + $$02.getName());
                    }
                    this.a($$2, this.a($$02), $$12.toString());
                }

                public void onProfileLookupFailed(GameProfile $$02, Exception $$12) {
                    e.warn("Could not lookup user uuid for {}", (Object)$$02.getName(), (Object)$$12);
                    if (!($$12 instanceof ProfileNotFoundException)) {
                        throw new a("Could not request user " + $$02.getName() + " from backend systems", $$12);
                    }
                    String $$22 = this.a($$02);
                    this.a($$3, $$22, $$22);
                }

                private void a(File $$02, String $$12, String $$22) {
                    File $$32 = new File($$1, $$12 + ".dat");
                    File $$4 = new File($$02, $$22 + ".dat");
                    alj.a($$02);
                    if (!$$32.renameTo($$4)) {
                        throw new a("Could not convert file for " + $$12);
                    }
                }

                private String a(GameProfile $$02) {
                    String $$12 = null;
                    for (String $$22 : this.e) {
                        if ($$22 == null || !$$22.equalsIgnoreCase($$02.getName())) continue;
                        $$12 = $$22;
                        break;
                    }
                    if ($$12 == null) {
                        throw new a("Could not find the filename for " + $$02.getName() + " anymore");
                    }
                    return $$12;
                }
            };
            alj.a($$0, Lists.newArrayList((Object[])$$9), $$10);
        }
        catch (a $$11) {
            e.error("Conversion failed, please try again later", (Throwable)$$11);
            return false;
        }
        return true;
    }

    static void a(File $$0) {
        if ($$0.exists()) {
            if ($$0.isDirectory()) {
                return;
            }
            throw new a("Can't create directory " + $$0.getName() + " in world save directory.");
        }
        if (!$$0.mkdirs()) {
            throw new a("Can't create directory " + $$0.getName() + " in world save directory.");
        }
    }

    public static boolean e(MinecraftServer $$0) {
        boolean $$1 = alj.a();
        $$1 = $$1 && alj.f($$0);
        return $$1;
    }

    private static boolean a() {
        boolean $$0 = false;
        if (b.exists() && b.isFile()) {
            $$0 = true;
        }
        boolean $$1 = false;
        if (a.exists() && a.isFile()) {
            $$1 = true;
        }
        boolean $$2 = false;
        if (c.exists() && c.isFile()) {
            $$2 = true;
        }
        boolean $$3 = false;
        if (d.exists() && d.isFile()) {
            $$3 = true;
        }
        if ($$0 || $$1 || $$2 || $$3) {
            e.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
            e.warn("** please remove the following files and restart the server:");
            if ($$0) {
                e.warn("* {}", (Object)b.getName());
            }
            if ($$1) {
                e.warn("* {}", (Object)a.getName());
            }
            if ($$2) {
                e.warn("* {}", (Object)c.getName());
            }
            if ($$3) {
                e.warn("* {}", (Object)d.getName());
            }
            return false;
        }
        return true;
    }

    private static boolean f(MinecraftServer $$0) {
        File $$1 = alj.g($$0);
        if ($$1.exists() && $$1.isDirectory() && ($$1.list().length > 0 || !$$1.delete())) {
            e.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
            e.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
            e.warn("** please restart the server and if the problem persists, remove the directory '{}'", (Object)$$1.getPath());
            return false;
        }
        return true;
    }

    private static File g(MinecraftServer $$0) {
        return $$0.a(dyw.d).toFile();
    }

    private static void b(File $$0) {
        File $$1 = new File($$0.getName() + ".converted");
        $$0.renameTo($$1);
    }

    static Date a(String $$0, Date $$1) {
        Date $$4;
        try {
            Date $$2 = alf.a.parse($$0);
        }
        catch (ParseException $$3) {
            $$4 = $$1;
        }
        return $$4;
    }

    static class a
    extends RuntimeException {
        a(String $$0, Throwable $$1) {
            super($$0, $$1);
        }

        a(String $$0) {
            super($$0);
        }
    }
}

