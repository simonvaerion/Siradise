/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class aen {
    private static final int a = 32768;
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.execute.blocks.toobig", $$0, $$1));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.execute.conditional.fail"));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.execute.conditional.fail_count", $$0));
    private static final BinaryOperator<ResultConsumer<ds>> e = ($$0, $$1) -> ($$2, $$3, $$4) -> {
        $$0.onCommandComplete($$2, $$3, $$4);
        $$1.onCommandComplete($$2, $$3, $$4);
    };
    private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
        dzn $$2 = ((ds)$$0.getSource()).l().aH();
        return du.a($$2.a(dzp.a), $$1);
    };

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        LiteralCommandNode $$2 = $$02.register((LiteralArgumentBuilder)dt.a("execute").requires($$0 -> $$0.c(2)));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("execute").requires($$0 -> $$0.c(2))).then(dt.a("run").redirect((CommandNode)$$02.getRoot()))).then(aen.a((CommandNode<ds>)$$2, dt.a("if"), true, $$1))).then(aen.a((CommandNode<ds>)$$2, dt.a("unless"), false, $$1))).then(dt.a("as").then(dt.a("targets", ec.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (bfj bfj2 : ec.c((CommandContext<ds>)$$0, "targets")) {
                $$1.add(((ds)$$0.getSource()).a(bfj2));
            }
            return $$1;
        })))).then(dt.a("at").then(dt.a("targets", ec.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (bfj bfj2 : ec.c((CommandContext<ds>)$$0, "targets")) {
                $$1.add(((ds)$$0.getSource()).a((aif)bfj2.dI()).a(bfj2.dg()).a(bfj2.bE()));
            }
            return $$1;
        })))).then(((LiteralArgumentBuilder)dt.a("store").then(aen.a((LiteralCommandNode<ds>)$$2, dt.a("result"), true))).then(aen.a((LiteralCommandNode<ds>)$$2, dt.a("success"), false)))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("positioned").then(dt.a("pos", fp.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).a(fp.a((CommandContext<ds>)$$0, "pos")).a(eb.a.a)))).then(dt.a("as").then(dt.a("targets", ec.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (bfj bfj2 : ec.c((CommandContext<ds>)$$0, "targets")) {
                $$1.add(((ds)$$0.getSource()).a(bfj2.dg()));
            }
            return $$1;
        })))).then(dt.a("over").then(dt.a("heightmap", ef.a()).redirect((CommandNode)$$2, $$0 -> {
            eei $$1 = ((ds)$$0.getSource()).d();
            aif $$2 = ((ds)$$0.getSource()).e();
            double $$3 = $$1.a();
            double $$4 = $$1.c();
            if (!$$2.b(hx.b($$3), hx.b($$4))) {
                throw fi.a.create();
            }
            int $$5 = $$2.a(ef.a((CommandContext<ds>)$$0, "heightmap"), apa.a($$3), apa.a($$4));
            return ((ds)$$0.getSource()).a(new eei($$3, $$5, $$4));
        }))))).then(((LiteralArgumentBuilder)dt.a("rotated").then(dt.a("rot", fm.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).a(fm.a((CommandContext<ds>)$$0, "rot").b((ds)$$0.getSource()))))).then(dt.a("as").then(dt.a("targets", ec.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (bfj bfj2 : ec.c((CommandContext<ds>)$$0, "targets")) {
                $$1.add(((ds)$$0.getSource()).a(bfj2.bE()));
            }
            return $$1;
        }))))).then(((LiteralArgumentBuilder)dt.a("facing").then(dt.a("entity").then(dt.a("targets", ec.b()).then(dt.a("anchor", eb.a()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            eb.a $$2 = eb.a((CommandContext<ds>)$$0, "anchor");
            for (bfj bfj2 : ec.c((CommandContext<ds>)$$0, "targets")) {
                $$1.add(((ds)$$0.getSource()).a(bfj2, $$2));
            }
            return $$1;
        }))))).then(dt.a("pos", fp.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).b(fp.a((CommandContext<ds>)$$0, "pos")))))).then(dt.a("align").then(dt.a("axes", fn.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).a(((ds)$$0.getSource()).d().a(fn.a((CommandContext<ds>)$$0, "axes"))))))).then(dt.a("anchored").then(dt.a("anchor", eb.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).a(eb.a((CommandContext<ds>)$$0, "anchor")))))).then(dt.a("in").then(dt.a("dimension", ea.a()).redirect((CommandNode)$$2, $$0 -> ((ds)$$0.getSource()).a(ea.a((CommandContext<ds>)$$0, "dimension")))))).then(dt.a("summon").then(dt.a("entity", eo.a($$1, jc.s)).suggests(gk.d).redirect((CommandNode)$$2, $$0 -> aen.a((ds)$$0.getSource(), eo.e((CommandContext<ds>)$$0, "entity")))))).then(aen.a((CommandNode<ds>)$$2, dt.a("on"))));
    }

    private static ArgumentBuilder<ds, ?> a(LiteralCommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$12, boolean $$2) {
        $$12.then(dt.a("score").then(dt.a("targets", et.b()).suggests(et.a).then(dt.a("objective", ej.a()).redirect($$0, $$1 -> aen.a((ds)$$1.getSource(), et.c((CommandContext<ds>)$$1, "targets"), ej.a((CommandContext<ds>)$$1, "objective"), $$2)))));
        $$12.then(dt.a("bossbar").then(((RequiredArgumentBuilder)dt.a("id", eq.a()).suggests(ady.a).then(dt.a("value").redirect($$0, $$1 -> aen.a((ds)$$1.getSource(), ady.a((CommandContext<ds>)$$1), true, $$2)))).then(dt.a("max").redirect($$0, $$1 -> aen.a((ds)$$1.getSource(), ady.a((CommandContext<ds>)$$1), false, $$2)))));
        for (agy.c $$32 : agy.b) {
            $$32.a((ArgumentBuilder<ds, ?>)$$12, $$3 -> $$3.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("path", eh.a()).then(dt.a("int").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> qw.a((int)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(dt.a("float").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> qu.a((float)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(dt.a("short").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> rf.a((short)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(dt.a("long").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> qz.a((long)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(dt.a("double").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> qs.a((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale")), $$2))))).then(dt.a("byte").then(dt.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aen.a((ds)$$2.getSource(), $$32.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path"), (int $$1) -> qp.a((byte)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))));
        }
        return $$12;
    }

    private static ds a(ds $$0, Collection<String> $$1, efd $$2, boolean $$3) {
        adg $$42 = $$0.l().aF();
        return $$0.a((ResultConsumer<ds>)((ResultConsumer)($$4, $$5, $$6) -> {
            for (String $$7 : $$1) {
                eff $$8 = $$42.c($$7, $$2);
                int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
                $$8.b($$9);
            }
        }), e);
    }

    private static ds a(ds $$0, adn $$1, boolean $$2, boolean $$32) {
        return $$0.a((ResultConsumer<ds>)((ResultConsumer)($$3, $$4, $$5) -> {
            int $$6;
            int n2 = $$32 ? $$5 : ($$6 = $$4 ? 1 : 0);
            if ($$2) {
                $$1.a($$6);
            } else {
                $$1.b($$6);
            }
        }), e);
    }

    private static ds a(ds $$0, agx $$1, eh.g $$2, IntFunction<rk> $$3, boolean $$42) {
        return $$0.a((ResultConsumer<ds>)((ResultConsumer)($$4, $$5, $$6) -> {
            try {
                qr $$7 = $$1.a();
                int $$8 = $$42 ? $$6 : ($$5 ? 1 : 0);
                $$2.a((rk)$$7, (rk)$$3.apply($$8));
                $$1.a($$7);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }), e);
    }

    private static boolean a(aif $$0, gu $$1) {
        clt $$2 = new clt($$1);
        dei $$3 = $$0.k().a($$2.e, $$2.f);
        if ($$3 != null) {
            return $$3.D() == ahy.d && $$0.c($$2.a());
        }
        return false;
    }

    private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$03, LiteralArgumentBuilder<ds> $$12, boolean $$2, dm $$32) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$12.then(dt.a("block").then(dt.a("pos", fi.a()).then(aen.a($$03, dt.a("block", fe.a($$32)), $$2, (CommandContext<ds> $$0) -> fe.a((CommandContext<ds>)$$0, "block").test(new dcf(((ds)$$0.getSource()).e(), fi.a((CommandContext<ds>)$$0, "pos"), true))))))).then(dt.a("biome").then(dt.a("pos", fi.a()).then(aen.a($$03, dt.a("biome", er.a($$32, jc.ap)), $$2, (CommandContext<ds> $$0) -> er.a((CommandContext<ds>)$$0, "biome", jc.ap).test(((ds)$$0.getSource()).e().s(fi.a((CommandContext<ds>)$$0, "pos")))))))).then(dt.a("loaded").then(aen.a($$03, dt.a("pos", fi.a()), $$2, (CommandContext<ds> $$0) -> aen.a(((ds)$$0.getSource()).e(), fi.b((CommandContext<ds>)$$0, "pos")))))).then(dt.a("dimension").then(aen.a($$03, dt.a("dimension", ea.a()), $$2, (CommandContext<ds> $$0) -> ea.a((CommandContext<ds>)$$0, "dimension") == ((ds)$$0.getSource()).e())))).then(dt.a("score").then(dt.a("target", et.a()).suggests(et.a).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targetObjective", ej.a()).then(dt.a("=").then(dt.a("source", et.a()).suggests(et.a).then(aen.a($$03, dt.a("sourceObjective", ej.a()), $$2, (CommandContext<ds> $$0) -> aen.a((CommandContext<ds>)$$0, Integer::equals)))))).then(dt.a("<").then(dt.a("source", et.a()).suggests(et.a).then(aen.a($$03, dt.a("sourceObjective", ej.a()), $$2, (CommandContext<ds> $$02) -> aen.a((CommandContext<ds>)$$02, (Integer $$0, Integer $$1) -> $$0 < $$1)))))).then(dt.a("<=").then(dt.a("source", et.a()).suggests(et.a).then(aen.a($$03, dt.a("sourceObjective", ej.a()), $$2, (CommandContext<ds> $$02) -> aen.a((CommandContext<ds>)$$02, (Integer $$0, Integer $$1) -> $$0 <= $$1)))))).then(dt.a(">").then(dt.a("source", et.a()).suggests(et.a).then(aen.a($$03, dt.a("sourceObjective", ej.a()), $$2, (CommandContext<ds> $$02) -> aen.a((CommandContext<ds>)$$02, (Integer $$0, Integer $$1) -> $$0 > $$1)))))).then(dt.a(">=").then(dt.a("source", et.a()).suggests(et.a).then(aen.a($$03, dt.a("sourceObjective", ej.a()), $$2, (CommandContext<ds> $$02) -> aen.a((CommandContext<ds>)$$02, (Integer $$0, Integer $$1) -> $$0 >= $$1)))))).then(dt.a("matches").then(aen.a($$03, dt.a("range", en.a()), $$2, (CommandContext<ds> $$0) -> aen.a((CommandContext<ds>)$$0, en.b.a((CommandContext<ds>)$$0, "range"))))))))).then(dt.a("blocks").then(dt.a("start", fi.a()).then(dt.a("end", fi.a()).then(((RequiredArgumentBuilder)dt.a("destination", fi.a()).then(aen.a($$03, dt.a("all"), $$2, false))).then(aen.a($$03, dt.a("masked"), $$2, true))))))).then(dt.a("entity").then(((RequiredArgumentBuilder)dt.a("entities", ec.b()).fork($$03, $$1 -> aen.a((CommandContext<ds>)$$1, $$2, !ec.c((CommandContext<ds>)$$1, "entities").isEmpty()))).executes(aen.a($$2, (CommandContext<ds> $$0) -> ec.c((CommandContext<ds>)$$0, "entities").size()))))).then(dt.a("predicate").then(aen.a($$03, dt.a("predicate", eq.a()).suggests(f), $$2, (CommandContext<ds> $$0) -> aen.a((ds)$$0.getSource(), eq.c((CommandContext<ds>)$$0, "predicate")))));
        for (agy.c $$4 : agy.c) {
            $$12.then($$4.a((ArgumentBuilder<ds, ?>)dt.a("data"), $$3 -> $$3.then(((RequiredArgumentBuilder)dt.a("path", eh.a()).fork($$03, $$2 -> aen.a((CommandContext<ds>)$$2, $$2, aen.a($$4.a((CommandContext<ds>)$$2), eh.a((CommandContext<ds>)$$2, "path")) > 0))).executes(aen.a($$2, (CommandContext<ds> $$1) -> aen.a($$4.a((CommandContext<ds>)$$1), eh.a((CommandContext<ds>)$$1, "path")))))));
        }
        return $$12;
    }

    private static Command<ds> a(boolean $$0, a $$12) {
        if ($$0) {
            return $$1 -> {
                int $$2 = $$12.test((CommandContext<ds>)$$1);
                if ($$2 > 0) {
                    ((ds)$$1.getSource()).a(() -> sw.a("commands.execute.conditional.pass_count", $$2), false);
                    return $$2;
                }
                throw c.create();
            };
        }
        return $$1 -> {
            int $$2 = $$12.test((CommandContext<ds>)$$1);
            if ($$2 == 0) {
                ((ds)$$1.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw d.create((Object)$$2);
        };
    }

    private static int a(agx $$0, eh.g $$1) throws CommandSyntaxException {
        return $$1.b($$0.a());
    }

    private static boolean a(CommandContext<ds> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
        String $$2 = et.a($$0, "target");
        efd $$3 = ej.a($$0, "targetObjective");
        String $$4 = et.a($$0, "source");
        efd $$5 = ej.a($$0, "sourceObjective");
        adg $$6 = ((ds)$$0.getSource()).l().aF();
        if (!$$6.b($$2, $$3) || !$$6.b($$4, $$5)) {
            return false;
        }
        eff $$7 = $$6.c($$2, $$3);
        eff $$8 = $$6.c($$4, $$5);
        return $$1.test($$7.b(), $$8.b());
    }

    private static boolean a(CommandContext<ds> $$0, cj.d $$1) throws CommandSyntaxException {
        String $$2 = et.a($$0, "target");
        efd $$3 = ej.a($$0, "targetObjective");
        adg $$4 = ((ds)$$0.getSource()).l().aF();
        if (!$$4.b($$2, $$3)) {
            return false;
        }
        return $$1.d($$4.c($$2, $$3).b());
    }

    private static boolean a(ds $$0, eck $$1) {
        aif $$2 = $$0.e();
        dzq $$3 = new dzq.a($$2).a(ebw.f, $$0.d()).b(ebw.a, $$0.f()).a(ebv.c);
        dzk $$4 = new dzk.a($$3).a(null);
        $$4.b(dzk.a($$1));
        return $$1.test($$4);
    }

    private static Collection<ds> a(CommandContext<ds> $$0, boolean $$1, boolean $$2) {
        if ($$2 == $$1) {
            return Collections.singleton((ds)$$0.getSource());
        }
        return Collections.emptyList();
    }

    private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$22, b $$3) {
        return $$1.fork($$0, $$2 -> aen.a((CommandContext<ds>)$$2, $$22, $$3.test((CommandContext<ds>)$$2))).executes($$2 -> {
            if ($$22 == $$3.test((CommandContext<ds>)$$2)) {
                ((ds)$$2.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw c.create();
        });
    }

    private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$12, boolean $$22, boolean $$3) {
        return $$12.fork($$0, $$2 -> aen.a((CommandContext<ds>)$$2, $$22, aen.c((CommandContext<ds>)$$2, $$3).isPresent())).executes($$22 ? $$1 -> aen.a((CommandContext<ds>)$$1, $$3) : $$1 -> aen.b((CommandContext<ds>)$$1, $$3));
    }

    private static int a(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
        OptionalInt $$2 = aen.c($$0, $$1);
        if ($$2.isPresent()) {
            ((ds)$$0.getSource()).a(() -> sw.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
            return $$2.getAsInt();
        }
        throw c.create();
    }

    private static int b(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
        OptionalInt $$2 = aen.c($$0, $$1);
        if ($$2.isPresent()) {
            throw d.create((Object)$$2.getAsInt());
        }
        ((ds)$$0.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
        return 1;
    }

    private static OptionalInt c(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
        return aen.a(((ds)$$0.getSource()).e(), fi.a($$0, "start"), fi.a($$0, "end"), fi.a($$0, "destination"), $$1);
    }

    private static OptionalInt a(aif $$0, gu $$1, gu $$2, gu $$3, boolean $$4) throws CommandSyntaxException {
        drs $$5 = drs.a($$1, $$2);
        drs $$6 = drs.a($$3, $$3.a($$5.b()));
        gu $$7 = new gu($$6.g() - $$5.g(), $$6.h() - $$5.h(), $$6.i() - $$5.i());
        int $$8 = $$5.c() * $$5.d() * $$5.e();
        if ($$8 > 32768) {
            throw b.create((Object)32768, (Object)$$8);
        }
        int $$9 = 0;
        for (int $$10 = $$5.i(); $$10 <= $$5.l(); ++$$10) {
            for (int $$11 = $$5.h(); $$11 <= $$5.k(); ++$$11) {
                for (int $$12 = $$5.g(); $$12 <= $$5.j(); ++$$12) {
                    gu $$13 = new gu($$12, $$11, $$10);
                    gu $$14 = $$13.a($$7);
                    dcb $$15 = $$0.a_($$13);
                    if ($$4 && $$15.a(cpo.a)) continue;
                    if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                    }
                    czn $$16 = $$0.c_($$13);
                    czn $$17 = $$0.c_($$14);
                    if ($$16 != null) {
                        qr $$19;
                        if ($$17 == null) {
                            return OptionalInt.empty();
                        }
                        if ($$17.u() != $$16.u()) {
                            return OptionalInt.empty();
                        }
                        qr $$18 = $$16.o();
                        if (!$$18.equals($$19 = $$17.o())) {
                            return OptionalInt.empty();
                        }
                    }
                    ++$$9;
                }
            }
        }
        return OptionalInt.of($$9);
    }

    private static RedirectModifier<ds> a(Function<bfj, Optional<bfj>> $$0) {
        return $$12 -> {
            ds $$2 = (ds)$$12.getSource();
            bfj $$3 = $$2.f();
            if ($$3 == null) {
                return List.of();
            }
            return ((Optional)$$0.apply($$3)).filter($$0 -> !$$0.dD()).map($$1 -> List.of($$2.a((bfj)$$1))).orElse(List.of());
        };
    }

    private static RedirectModifier<ds> b(Function<bfj, Stream<bfj>> $$0) {
        return $$1 -> {
            ds $$2 = (ds)$$1.getSource();
            bfj $$3 = $$2.f();
            if ($$3 == null) {
                return List.of();
            }
            return ((Stream)$$0.apply($$3)).filter($$0 -> !$$0.dD()).map($$2::a).toList();
        };
    }

    private static LiteralArgumentBuilder<ds> a(CommandNode<ds> $$02, LiteralArgumentBuilder<ds> $$1) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(dt.a("owner").fork($$02, aen.a((bfj $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof bgh) {
                bgh $$1 = (bgh)((Object)$$0);
                optional = Optional.ofNullable($$1.I_());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(dt.a("leasher").fork($$02, aen.a((bfj $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof bgb) {
                bgb $$1 = (bgb)$$0;
                optional = Optional.ofNullable($$1.fP());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(dt.a("target").fork($$02, aen.a((bfj $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof bgw) {
                bgw $$1 = (bgw)((Object)$$0);
                optional = Optional.ofNullable($$1.j());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(dt.a("attacker").fork($$02, aen.a((bfj $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof bfh) {
                bfh $$1 = (bfh)((Object)$$0);
                optional = Optional.ofNullable($$1.M_());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(dt.a("vehicle").fork($$02, aen.a((bfj $$0) -> Optional.ofNullable($$0.cW()))))).then(dt.a("controller").fork($$02, aen.a((bfj $$0) -> Optional.ofNullable($$0.cL()))))).then(dt.a("origin").fork($$02, aen.a((bfj $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof bgx) {
                bgx $$1 = (bgx)((Object)$$0);
                optional = Optional.ofNullable($$1.v());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(dt.a("passengers").fork($$02, aen.b((bfj $$0) -> $$0.cN().stream())));
    }

    private static ds a(ds $$0, he.c<bfn<?>> $$1) throws CommandSyntaxException {
        bfj $$2 = agj.a($$0, $$1, $$0.d(), new qr(), true);
        return $$0.a($$2);
    }

    @FunctionalInterface
    static interface b {
        public boolean test(CommandContext<ds> var1) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public int test(CommandContext<ds> var1) throws CommandSyntaxException;
    }
}

