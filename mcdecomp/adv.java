/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class adv {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.banip.invalid"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.banip.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ban-ip").requires($$0 -> $$0.c(3))).then(((RequiredArgumentBuilder)dt.a("target", StringArgumentType.word()).executes($$0 -> adv.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target"), null))).then(dt.a("reason", eg.a()).executes($$0 -> adv.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target"), eg.a((CommandContext<ds>)$$0, "reason"))))));
    }

    private static int a(ds $$0, String $$1, @Nullable sw $$2) throws CommandSyntaxException {
        if (InetAddresses.isInetAddress((String)$$1)) {
            return adv.b($$0, $$1, $$2);
        }
        aig $$3 = $$0.l().ac().a($$1);
        if ($$3 != null) {
            return adv.b($$0, $$3.y(), $$2);
        }
        throw a.create();
    }

    private static int b(ds $$0, String $$1, @Nullable sw $$2) throws CommandSyntaxException {
        alh $$3 = $$0.l().ac().g();
        if ($$3.a($$1)) {
            throw b.create();
        }
        List<aig> $$4 = $$0.l().ac().b($$1);
        ali $$5 = new ali($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
        $$3.a($$5);
        $$0.a(() -> sw.a("commands.banip.success", new Object[]{$$1, $$5.d()}), true);
        if (!$$4.isEmpty()) {
            $$0.a(() -> sw.a("commands.banip.info", $$4.size(), ga.a($$4)), true);
        }
        for (aig $$6 : $$4) {
            $$6.c.b(sw.c("multiplayer.disconnect.ip_banned"));
        }
        return $$4.size();
    }
}

