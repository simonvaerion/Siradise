/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class agr {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.trigger.failed.unprimed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.trigger.failed.invalid"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)dt.a("trigger").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("objective", ej.a()).suggests(($$0, $$1) -> agr.a((ds)$$0.getSource(), $$1)).executes($$0 -> agr.a((ds)$$0.getSource(), agr.a(((ds)$$0.getSource()).h(), ej.a((CommandContext<ds>)$$0, "objective"))))).then(dt.a("add").then(dt.a("value", IntegerArgumentType.integer()).executes($$0 -> agr.a((ds)$$0.getSource(), agr.a(((ds)$$0.getSource()).h(), ej.a((CommandContext<ds>)$$0, "objective")), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))))).then(dt.a("set").then(dt.a("value", IntegerArgumentType.integer()).executes($$0 -> agr.b((ds)$$0.getSource(), agr.a(((ds)$$0.getSource()).h(), ej.a((CommandContext<ds>)$$0, "objective")), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))))));
    }

    public static CompletableFuture<Suggestions> a(ds $$0, SuggestionsBuilder $$1) {
        bfj $$2 = $$0.f();
        ArrayList $$3 = Lists.newArrayList();
        if ($$2 != null) {
            adg $$4 = $$0.l().aF();
            String $$5 = $$2.cv();
            for (efd $$6 : $$4.c()) {
                eff $$7;
                if ($$6.c() != efj.b || !$$4.b($$5, $$6) || ($$7 = $$4.c($$5, $$6)).g()) continue;
                $$3.add($$6.b());
            }
        }
        return du.b($$3, $$1);
    }

    private static int a(ds $$0, eff $$1, int $$2) {
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.trigger.add.success", $$1.d().e(), $$2), true);
        return $$1.b();
    }

    private static int b(ds $$0, eff $$1, int $$2) {
        $$1.b($$2);
        $$0.a(() -> sw.a("commands.trigger.set.success", $$1.d().e(), $$2), true);
        return $$2;
    }

    private static int a(ds $$0, eff $$1) {
        $$1.a(1);
        $$0.a(() -> sw.a("commands.trigger.simple.success", $$1.d().e()), true);
        return $$1.b();
    }

    private static eff a(aig $$0, efd $$1) throws CommandSyntaxException {
        String $$3;
        if ($$1.c() != efj.b) {
            throw b.create();
        }
        efg $$2 = $$0.gc();
        if (!$$2.b($$3 = $$0.cv(), $$1)) {
            throw a.create();
        }
        eff $$4 = $$2.c($$3, $$1);
        if ($$4.g()) {
            throw a.create();
        }
        $$4.a(true);
        return $$4;
    }
}

