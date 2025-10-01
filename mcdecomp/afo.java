/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class afo {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.recipe.give.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.recipe.take.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("recipe").requires($$0 -> $$0.c(2))).then(dt.a("give").then(((RequiredArgumentBuilder)dt.a("targets", ec.d()).then(dt.a("recipe", eq.a()).suggests(gk.b).executes($$0 -> afo.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), Collections.singleton(eq.b((CommandContext<ds>)$$0, "recipe")))))).then(dt.a("*").executes($$0 -> afo.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).l().aE().b())))))).then(dt.a("take").then(((RequiredArgumentBuilder)dt.a("targets", ec.d()).then(dt.a("recipe", eq.a()).suggests(gk.b).executes($$0 -> afo.b((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), Collections.singleton(eq.b((CommandContext<ds>)$$0, "recipe")))))).then(dt.a("*").executes($$0 -> afo.b((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).l().aE().b()))))));
    }

    private static int a(ds $$0, Collection<aig> $$1, Collection<cjc<?>> $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (aig $$4 : $$1) {
            $$3 += $$4.a($$2);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.recipe.give.success.single", $$2.size(), ((aig)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
        }
        return $$3;
    }

    private static int b(ds $$0, Collection<aig> $$1, Collection<cjc<?>> $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (aig $$4 : $$1) {
            $$3 += $$4.b($$2);
        }
        if ($$3 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.recipe.take.success.single", $$2.size(), ((aig)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
        }
        return $$3;
    }
}

