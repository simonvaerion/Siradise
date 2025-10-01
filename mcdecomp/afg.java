/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class afg {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.pardon.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("pardon").requires($$0 -> $$0.c(3))).then(dt.a("targets", ee.a()).suggests(($$0, $$1) -> du.a(((ds)$$0.getSource()).l().ac().f().a(), $$1)).executes($$0 -> afg.a((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets")))));
    }

    private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
        alq $$2 = $$0.l().ac().f();
        int $$3 = 0;
        for (GameProfile $$4 : $$1) {
            if (!$$2.a($$4)) continue;
            $$2.c($$4);
            ++$$3;
            $$0.a(() -> sw.a("commands.pardon.success", sy.a($$4)), true);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        return $$3;
    }
}

