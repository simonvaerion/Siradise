/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class afy {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.scoreboard.objectives.add.duplicate"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.scoreboard.objectives.display.alreadyEmpty"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.scoreboard.objectives.display.alreadySet"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.scoreboard.players.enable.failed"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.scoreboard.players.enable.invalid"));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.scoreboard.players.get.null", $$0, $$1));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("scoreboard").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("objectives").then(dt.a("list").executes($$0 -> afy.b((ds)$$0.getSource())))).then(dt.a("add").then(dt.a("objective", StringArgumentType.word()).then(((RequiredArgumentBuilder)dt.a("criteria", ek.a()).executes($$0 -> afy.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"objective"), ek.a((CommandContext<ds>)$$0, "criteria"), sw.b(StringArgumentType.getString((CommandContext)$$0, (String)"objective"))))).then(dt.a("displayName", dy.a()).executes($$0 -> afy.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"objective"), ek.a((CommandContext<ds>)$$0, "criteria"), dy.a((CommandContext<ds>)$$0, "displayName")))))))).then(dt.a("modify").then(((RequiredArgumentBuilder)dt.a("objective", ej.a()).then(dt.a("displayname").then(dt.a("displayName", dy.a()).executes($$0 -> afy.a((ds)$$0.getSource(), ej.a((CommandContext<ds>)$$0, "objective"), dy.a((CommandContext<ds>)$$0, "displayName")))))).then(afy.a())))).then(dt.a("remove").then(dt.a("objective", ej.a()).executes($$0 -> afy.a((ds)$$0.getSource(), ej.a((CommandContext<ds>)$$0, "objective")))))).then(dt.a("setdisplay").then(((RequiredArgumentBuilder)dt.a("slot", eu.a()).executes($$0 -> afy.a((ds)$$0.getSource(), eu.a((CommandContext<ds>)$$0, "slot")))).then(dt.a("objective", ej.a()).executes($$0 -> afy.a((ds)$$0.getSource(), eu.a((CommandContext<ds>)$$0, "slot"), ej.a((CommandContext<ds>)$$0, "objective")))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("players").then(((LiteralArgumentBuilder)dt.a("list").executes($$0 -> afy.a((ds)$$0.getSource()))).then(dt.a("target", et.a()).suggests(et.a).executes($$0 -> afy.a((ds)$$0.getSource(), et.a((CommandContext<ds>)$$0, "target")))))).then(dt.a("set").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("objective", ej.a()).then(dt.a("score", IntegerArgumentType.integer()).executes($$0 -> afy.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.b((CommandContext<ds>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(dt.a("get").then(dt.a("target", et.a()).suggests(et.a).then(dt.a("objective", ej.a()).executes($$0 -> afy.a((ds)$$0.getSource(), et.a((CommandContext<ds>)$$0, "target"), ej.a((CommandContext<ds>)$$0, "objective"))))))).then(dt.a("add").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("objective", ej.a()).then(dt.a("score", IntegerArgumentType.integer((int)0)).executes($$0 -> afy.b((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.b((CommandContext<ds>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(dt.a("remove").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("objective", ej.a()).then(dt.a("score", IntegerArgumentType.integer((int)0)).executes($$0 -> afy.c((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.b((CommandContext<ds>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(dt.a("reset").then(((RequiredArgumentBuilder)dt.a("targets", et.b()).suggests(et.a).executes($$0 -> afy.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets")))).then(dt.a("objective", ej.a()).executes($$0 -> afy.b((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.a((CommandContext<ds>)$$0, "objective"))))))).then(dt.a("enable").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("objective", ej.a()).suggests(($$0, $$1) -> afy.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), $$1)).executes($$0 -> afy.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.a((CommandContext<ds>)$$0, "objective"))))))).then(dt.a("operation").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("targetObjective", ej.a()).then(dt.a("operation", el.a()).then(dt.a("source", et.b()).suggests(et.a).then(dt.a("sourceObjective", ej.a()).executes($$0 -> afy.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "targets"), ej.b((CommandContext<ds>)$$0, "targetObjective"), el.a((CommandContext<ds>)$$0, "operation"), et.c((CommandContext<ds>)$$0, "source"), ej.a((CommandContext<ds>)$$0, "sourceObjective")))))))))));
    }

    private static LiteralArgumentBuilder<ds> a() {
        LiteralArgumentBuilder<ds> $$0 = dt.a("rendertype");
        for (efj.a $$12 : efj.a.values()) {
            $$0.then(dt.a($$12.a()).executes($$1 -> afy.a((ds)$$1.getSource(), ej.a((CommandContext<ds>)$$1, "objective"), $$12)));
        }
        return $$0;
    }

    private static CompletableFuture<Suggestions> a(ds $$0, Collection<String> $$1, SuggestionsBuilder $$2) {
        ArrayList $$3 = Lists.newArrayList();
        adg $$4 = $$0.l().aF();
        for (efd $$5 : $$4.c()) {
            if ($$5.c() != efj.b) continue;
            boolean $$6 = false;
            for (String $$7 : $$1) {
                if ($$4.b($$7, $$5) && !$$4.c($$7, $$5).g()) continue;
                $$6 = true;
                break;
            }
            if (!$$6) continue;
            $$3.add($$5.b());
        }
        return du.b($$3, $$2);
    }

    private static int a(ds $$0, String $$1, efd $$2) throws CommandSyntaxException {
        adg $$3 = $$0.l().aF();
        if (!$$3.b($$1, $$2)) {
            throw f.create((Object)$$2.b(), (Object)$$1);
        }
        eff $$4 = $$3.c($$1, $$2);
        $$0.a(() -> sw.a("commands.scoreboard.players.get.success", new Object[]{$$1, $$4.b(), $$2.e()}), false);
        return $$4.b();
    }

    private static int a(ds $$0, Collection<String> $$1, efd $$2, el.a $$3, Collection<String> $$4, efd $$5) throws CommandSyntaxException {
        adg $$6 = $$0.l().aF();
        int $$7 = 0;
        for (String $$8 : $$1) {
            eff $$9 = $$6.c($$8, $$2);
            for (String $$10 : $$4) {
                eff $$11 = $$6.c($$10, $$5);
                $$3.apply($$9, $$11);
            }
            $$7 += $$9.b();
        }
        if ($$1.size() == 1) {
            int $$12 = $$7;
            $$0.a(() -> sw.a("commands.scoreboard.players.operation.success.single", $$2.e(), $$1.iterator().next(), $$12), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.operation.success.multiple", $$2.e(), $$1.size()), true);
        }
        return $$7;
    }

    private static int a(ds $$0, Collection<String> $$1, efd $$2) throws CommandSyntaxException {
        if ($$2.c() != efj.b) {
            throw e.create();
        }
        adg $$3 = $$0.l().aF();
        int $$4 = 0;
        for (String $$5 : $$1) {
            eff $$6 = $$3.c($$5, $$2);
            if (!$$6.g()) continue;
            $$6.a(false);
            ++$$4;
        }
        if ($$4 == 0) {
            throw d.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.scoreboard.players.enable.success.single", $$2.e(), $$1.iterator().next()), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.enable.success.multiple", $$2.e(), $$1.size()), true);
        }
        return $$4;
    }

    private static int a(ds $$0, Collection<String> $$1) {
        adg $$2 = $$0.l().aF();
        for (String $$3 : $$1) {
            $$2.d($$3, null);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.scoreboard.players.reset.all.single", $$1.iterator().next()), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int b(ds $$0, Collection<String> $$1, efd $$2) {
        adg $$3 = $$0.l().aF();
        for (String $$4 : $$1) {
            $$3.d($$4, $$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.scoreboard.players.reset.specific.single", $$2.e(), $$1.iterator().next()), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.reset.specific.multiple", $$2.e(), $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ds $$0, Collection<String> $$1, efd $$2, int $$3) {
        adg $$4 = $$0.l().aF();
        for (String $$5 : $$1) {
            eff $$6 = $$4.c($$5, $$2);
            $$6.b($$3);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.scoreboard.players.set.success.single", $$2.e(), $$1.iterator().next(), $$3), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.set.success.multiple", $$2.e(), $$1.size(), $$3), true);
        }
        return $$3 * $$1.size();
    }

    private static int b(ds $$0, Collection<String> $$1, efd $$2, int $$3) {
        adg $$4 = $$0.l().aF();
        int $$5 = 0;
        for (String $$6 : $$1) {
            eff $$7 = $$4.c($$6, $$2);
            $$7.b($$7.b() + $$3);
            $$5 += $$7.b();
        }
        if ($$1.size() == 1) {
            int $$8 = $$5;
            $$0.a(() -> sw.a("commands.scoreboard.players.add.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.e(), $$1.size()), true);
        }
        return $$5;
    }

    private static int c(ds $$0, Collection<String> $$1, efd $$2, int $$3) {
        adg $$4 = $$0.l().aF();
        int $$5 = 0;
        for (String $$6 : $$1) {
            eff $$7 = $$4.c($$6, $$2);
            $$7.b($$7.b() - $$3);
            $$5 += $$7.b();
        }
        if ($$1.size() == 1) {
            int $$8 = $$5;
            $$0.a(() -> sw.a("commands.scoreboard.players.remove.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.e(), $$1.size()), true);
        }
        return $$5;
    }

    private static int a(ds $$0) {
        Collection<String> $$1 = $$0.l().aF().e();
        if ($$1.isEmpty()) {
            $$0.a(() -> sw.c("commands.scoreboard.players.list.empty"), false);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.list.success", $$1.size(), sy.a($$1)), false);
        }
        return $$1.size();
    }

    private static int a(ds $$0, String $$1) {
        Map<efd, eff> $$2 = $$0.l().aF().e($$1);
        if ($$2.isEmpty()) {
            $$0.a(() -> sw.a("commands.scoreboard.players.list.entity.empty", new Object[]{$$1}), false);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.players.list.entity.success", new Object[]{$$1, $$2.size()}), false);
            for (Map.Entry<efd, eff> $$3 : $$2.entrySet()) {
                $$0.a(() -> sw.a("commands.scoreboard.players.list.entity.entry", ((efd)$$3.getKey()).e(), ((eff)$$3.getValue()).b()), false);
            }
        }
        return $$2.size();
    }

    private static int a(ds $$0, int $$1) throws CommandSyntaxException {
        adg $$2 = $$0.l().aF();
        if ($$2.a($$1) == null) {
            throw b.create();
        }
        ((efg)$$2).a($$1, null);
        $$0.a(() -> sw.a("commands.scoreboard.objectives.display.cleared", new Object[]{efg.h()[$$1]}), true);
        return 0;
    }

    private static int a(ds $$0, int $$1, efd $$2) throws CommandSyntaxException {
        adg $$3 = $$0.l().aF();
        if ($$3.a($$1) == $$2) {
            throw c.create();
        }
        ((efg)$$3).a($$1, $$2);
        $$0.a(() -> sw.a("commands.scoreboard.objectives.display.set", new Object[]{efg.h()[$$1], $$2.d()}), true);
        return 0;
    }

    private static int a(ds $$0, efd $$1, sw $$2) {
        if (!$$1.d().equals($$2)) {
            $$1.a($$2);
            $$0.a(() -> sw.a("commands.scoreboard.objectives.modify.displayname", new Object[]{$$1.b(), $$1.e()}), true);
        }
        return 0;
    }

    private static int a(ds $$0, efd $$1, efj.a $$2) {
        if ($$1.f() != $$2) {
            $$1.a($$2);
            $$0.a(() -> sw.a("commands.scoreboard.objectives.modify.rendertype", $$1.e()), true);
        }
        return 0;
    }

    private static int a(ds $$0, efd $$1) {
        adg $$2 = $$0.l().aF();
        $$2.j($$1);
        $$0.a(() -> sw.a("commands.scoreboard.objectives.remove.success", $$1.e()), true);
        return $$2.c().size();
    }

    private static int a(ds $$0, String $$1, efj $$2, sw $$3) throws CommandSyntaxException {
        adg $$4 = $$0.l().aF();
        if ($$4.d($$1) != null) {
            throw a.create();
        }
        $$4.a($$1, $$2, $$3, $$2.f());
        efd $$5 = $$4.d($$1);
        $$0.a(() -> sw.a("commands.scoreboard.objectives.add.success", $$5.e()), true);
        return $$4.c().size();
    }

    private static int b(ds $$0) {
        Collection<efd> $$1 = $$0.l().aF().c();
        if ($$1.isEmpty()) {
            $$0.a(() -> sw.c("commands.scoreboard.objectives.list.empty"), false);
        } else {
            $$0.a(() -> sw.a("commands.scoreboard.objectives.list.success", $$1.size(), sy.b($$1, efd::e)), false);
        }
        return $$1.size();
    }
}

