/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class adx {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.ban.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ban").requires($$0 -> $$0.c(3))).then(((RequiredArgumentBuilder)dt.a("targets", ee.a()).executes($$0 -> adx.a((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets"), null))).then(dt.a("reason", eg.a()).executes($$0 -> adx.a((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets"), eg.a((CommandContext<ds>)$$0, "reason"))))));
    }

    private static int a(ds $$0, Collection<GameProfile> $$1, @Nullable sw $$2) throws CommandSyntaxException {
        alq $$3 = $$0.l().ac().f();
        int $$4 = 0;
        for (GameProfile $$5 : $$1) {
            if ($$3.a($$5)) continue;
            alr $$6 = new alr($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            ++$$4;
            $$0.a(() -> sw.a("commands.ban.success", sy.a($$5), $$6.d()), true);
            aig $$7 = $$0.l().ac().a($$5.getId());
            if ($$7 == null) continue;
            $$7.c.b(sw.c("multiplayer.disconnect.banned"));
        }
        if ($$4 == 0) {
            throw a.create();
        }
        return $$4;
    }
}

