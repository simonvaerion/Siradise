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

public class aff {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.op.failed"));

    public static void a(CommandDispatcher<ds> $$03) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("op").requires($$0 -> $$0.c(3))).then(dt.a("targets", ee.a()).suggests(($$02, $$12) -> {
            alk $$2 = ((ds)$$02.getSource()).l().ac();
            return du.b($$2.t().stream().filter($$1 -> !$$2.f($$1.fM())).map($$0 -> $$0.fM().getName()), $$12);
        }).executes($$0 -> aff.a((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets")))));
    }

    private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
        alk $$2 = $$0.l().ac();
        int $$3 = 0;
        for (GameProfile $$4 : $$1) {
            if ($$2.f($$4)) continue;
            $$2.a($$4);
            ++$$3;
            $$0.a(() -> sw.a("commands.op.success", new Object[]{((GameProfile)$$1.iterator().next()).getName()}), true);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        return $$3;
    }
}

