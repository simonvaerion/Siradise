/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class afh {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.pardonip.invalid"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.pardonip.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("pardon-ip").requires($$0 -> $$0.c(3))).then(dt.a("target", StringArgumentType.word()).suggests(($$0, $$1) -> du.a(((ds)$$0.getSource()).l().ac().g().a(), $$1)).executes($$0 -> afh.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target")))));
    }

    private static int a(ds $$0, String $$1) throws CommandSyntaxException {
        if (!InetAddresses.isInetAddress((String)$$1)) {
            throw a.create();
        }
        alh $$2 = $$0.l().ac().g();
        if (!$$2.a($$1)) {
            throw b.create();
        }
        $$2.c($$1);
        $$0.a(() -> sw.a("commands.pardonip.success", new Object[]{$$1}), true);
        return 1;
    }
}

