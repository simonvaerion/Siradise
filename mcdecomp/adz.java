/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.IOException;
import javax.annotation.Nullable;

public class adz {
    private static final String b = "localhost";
    private static final String c = "0.0.0.0";
    private static final int d = 10000;
    private static final int e = 100;
    public static BiMap<String, acp<cmm>> a = ImmutableBiMap.of((Object)"o", cmm.h, (Object)"n", cmm.i, (Object)"e", cmm.j);
    @Nullable
    private static adr f;
    @Nullable
    private static adq g;

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("chase").then(((LiteralArgumentBuilder)dt.a("follow").then(((RequiredArgumentBuilder)dt.a("host", StringArgumentType.string()).executes($$0 -> adz.b((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"host"), 10000))).then(dt.a("port", IntegerArgumentType.integer((int)1, (int)65535)).executes($$0 -> adz.b((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"host"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port")))))).executes($$0 -> adz.b((ds)$$0.getSource(), b, 10000)))).then(((LiteralArgumentBuilder)dt.a("lead").then(((RequiredArgumentBuilder)dt.a("bind_address", StringArgumentType.string()).executes($$0 -> adz.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"bind_address"), 10000))).then(dt.a("port", IntegerArgumentType.integer((int)1024, (int)65535)).executes($$0 -> adz.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"bind_address"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port")))))).executes($$0 -> adz.a((ds)$$0.getSource(), c, 10000)))).then(dt.a("stop").executes($$0 -> adz.a((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) {
        if (g != null) {
            g.b();
            $$0.a(() -> sw.b("You have now stopped chasing"), false);
            g = null;
        }
        if (f != null) {
            f.b();
            $$0.a(() -> sw.b("You are no longer being chased"), false);
            f = null;
        }
        return 0;
    }

    private static boolean b(ds $$0) {
        if (f != null) {
            $$0.b(sw.b("Chase server is already running. Stop it using /chase stop"));
            return true;
        }
        if (g != null) {
            $$0.b(sw.b("You are already chasing someone. Stop it using /chase stop"));
            return true;
        }
        return false;
    }

    private static int a(ds $$0, String $$1, int $$2) {
        if (adz.b($$0)) {
            return 0;
        }
        f = new adr($$1, $$2, $$0.l().ac(), 100);
        try {
            f.a();
            $$0.a(() -> sw.b("Chase server is now running on port " + $$2 + ". Clients can follow you using /chase follow <ip> <port>"), false);
        }
        catch (IOException $$3) {
            $$3.printStackTrace();
            $$0.b(sw.b("Failed to start chase server on port " + $$2));
            f = null;
        }
        return 0;
    }

    private static int b(ds $$0, String $$1, int $$2) {
        if (adz.b($$0)) {
            return 0;
        }
        g = new adq($$1, $$2, $$0.l());
        g.a();
        $$0.a(() -> sw.b("You are now chasing " + $$1 + ":" + $$2 + ". If that server does '/chase lead' then you will automatically go to the same position. Use '/chase stop' to stop chasing."), false);
        return 0;
    }
}

