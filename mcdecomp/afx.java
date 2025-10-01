/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import net.minecraft.server.MinecraftServer;

public class afx {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.schedule.same_tick"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.schedule.cleared.failure", $$0));
    private static final SuggestionProvider<ds> c = ($$0, $$1) -> du.b(((ds)$$0.getSource()).l().aU().K().u().a(), $$1);

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("schedule").requires($$0 -> $$0.c(2))).then(dt.a("function").then(dt.a("function", ft.a()).suggests(aes.a).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("time", fb.a()).executes($$0 -> afx.a((ds)$$0.getSource(), ft.b((CommandContext<ds>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), true))).then(dt.a("append").executes($$0 -> afx.a((ds)$$0.getSource(), ft.b((CommandContext<ds>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), false)))).then(dt.a("replace").executes($$0 -> afx.a((ds)$$0.getSource(), ft.b((CommandContext<ds>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), true))))))).then(dt.a("clear").then(dt.a("function", StringArgumentType.greedyString()).suggests(c).executes($$0 -> afx.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"function"))))));
    }

    private static int a(ds $$0, Pair<acq, Either<dn, Collection<dn>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
        if ($$2 == 0) {
            throw a.create();
        }
        long $$4 = $$0.e().V() + (long)$$2;
        acq $$5 = (acq)$$1.getFirst();
        edv<MinecraftServer> $$62 = $$0.l().aU().K().u();
        ((Either)$$1.getSecond()).ifLeft($$6 -> {
            String $$7 = $$5.toString();
            if ($$3) {
                $$62.a($$7);
            }
            $$62.a($$7, $$4, new edr($$5));
            $$0.a(() -> sw.a("commands.schedule.created.function", $$5, $$2, $$4), true);
        }).ifRight($$6 -> {
            String $$7 = "#" + $$5;
            if ($$3) {
                $$62.a($$7);
            }
            $$62.a($$7, $$4, new eds($$5));
            $$0.a(() -> sw.a("commands.schedule.created.tag", $$5, $$2, $$4), true);
        });
        return Math.floorMod($$4, Integer.MAX_VALUE);
    }

    private static int a(ds $$0, String $$1) throws CommandSyntaxException {
        int $$2 = $$0.l().aU().K().u().a($$1);
        if ($$2 == 0) {
            throw b.create((Object)$$1);
        }
        $$0.a(() -> sw.a("commands.schedule.cleared.success", $$2, $$1), true);
        return $$2;
    }
}

