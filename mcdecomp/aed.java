/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class aed {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.datapack.unknown", $$0));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.datapack.enable.failed", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.datapack.disable.failed", $$0));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.datapack.enable.failed.no_flags", $$0, $$1));
    private static final SuggestionProvider<ds> e = ($$0, $$1) -> du.b(((ds)$$0.getSource()).l().aB().d().stream().map(StringArgumentType::escapeIfRequired), $$1);
    private static final SuggestionProvider<ds> f = ($$0, $$12) -> {
        aki $$2 = ((ds)$$0.getSource()).l().aB();
        Collection<String> $$3 = $$2.d();
        caw $$4 = ((ds)$$0.getSource()).w();
        return du.b($$2.c().stream().filter($$1 -> $$1.d().a($$4)).map(akg::f).filter($$1 -> !$$3.contains($$1)).map(StringArgumentType::escapeIfRequired), $$12);
    };

    public static void a(CommandDispatcher<ds> $$03) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("datapack").requires($$0 -> $$0.c(2))).then(dt.a("enable").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("name", StringArgumentType.string()).suggests(f).executes($$0 -> aed.a((ds)$$0.getSource(), aed.a((CommandContext<ds>)$$0, "name", true), (List<akg> $$02, akg $$1) -> $$1.i().a($$02, $$1, $$0 -> $$0, false)))).then(dt.a("after").then(dt.a("existing", StringArgumentType.string()).suggests(e).executes($$0 -> aed.a((ds)$$0.getSource(), aed.a((CommandContext<ds>)$$0, "name", true), (List<akg> $$1, akg $$2) -> $$1.add($$1.indexOf(aed.a((CommandContext<ds>)$$0, "existing", false)) + 1, $$2)))))).then(dt.a("before").then(dt.a("existing", StringArgumentType.string()).suggests(e).executes($$0 -> aed.a((ds)$$0.getSource(), aed.a((CommandContext<ds>)$$0, "name", true), (List<akg> $$1, akg $$2) -> $$1.add($$1.indexOf(aed.a((CommandContext<ds>)$$0, "existing", false)), $$2)))))).then(dt.a("last").executes($$0 -> aed.a((ds)$$0.getSource(), aed.a((CommandContext<ds>)$$0, "name", true), List::add)))).then(dt.a("first").executes($$02 -> aed.a((ds)$$02.getSource(), aed.a((CommandContext<ds>)$$02, "name", true), (List<akg> $$0, akg $$1) -> $$0.add(0, $$1))))))).then(dt.a("disable").then(dt.a("name", StringArgumentType.string()).suggests(e).executes($$0 -> aed.a((ds)$$0.getSource(), aed.a((CommandContext<ds>)$$0, "name", false)))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0 -> aed.a((ds)$$0.getSource()))).then(dt.a("available").executes($$0 -> aed.b((ds)$$0.getSource())))).then(dt.a("enabled").executes($$0 -> aed.c((ds)$$0.getSource())))));
    }

    private static int a(ds $$0, akg $$1, a $$2) throws CommandSyntaxException {
        aki $$3 = $$0.l().aB();
        ArrayList $$4 = Lists.newArrayList($$3.f());
        $$2.apply($$4, $$1);
        $$0.a(() -> sw.a("commands.datapack.modify.enable", $$1.a(true)), true);
        afp.a($$4.stream().map(akg::f).collect(Collectors.toList()), $$0);
        return $$4.size();
    }

    private static int a(ds $$0, akg $$1) {
        aki $$2 = $$0.l().aB();
        ArrayList $$3 = Lists.newArrayList($$2.f());
        $$3.remove($$1);
        $$0.a(() -> sw.a("commands.datapack.modify.disable", $$1.a(true)), true);
        afp.a($$3.stream().map(akg::f).collect(Collectors.toList()), $$0);
        return $$3.size();
    }

    private static int a(ds $$0) {
        return aed.c($$0) + aed.b($$0);
    }

    private static int b(ds $$0) {
        aki $$1 = $$0.l().aB();
        $$1.a();
        Collection<akg> $$22 = $$1.f();
        Collection<akg> $$3 = $$1.c();
        caw $$4 = $$0.w();
        List<akg> $$5 = $$3.stream().filter($$2 -> !$$22.contains($$2) && $$2.d().a($$4)).toList();
        if ($$5.isEmpty()) {
            $$0.a(() -> sw.c("commands.datapack.list.available.none"), false);
        } else {
            $$0.a(() -> sw.a("commands.datapack.list.available.success", $$5.size(), sy.b($$5, (T $$0) -> $$0.a(false))), false);
        }
        return $$5.size();
    }

    private static int c(ds $$0) {
        aki $$1 = $$0.l().aB();
        $$1.a();
        Collection<akg> $$2 = $$1.f();
        if ($$2.isEmpty()) {
            $$0.a(() -> sw.c("commands.datapack.list.enabled.none"), false);
        } else {
            $$0.a(() -> sw.a("commands.datapack.list.enabled.success", $$2.size(), sy.b($$2, (T $$0) -> $$0.a(true))), false);
        }
        return $$2.size();
    }

    private static akg a(CommandContext<ds> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
        String $$3 = StringArgumentType.getString($$0, (String)$$1);
        aki $$4 = ((ds)$$0.getSource()).l().aB();
        akg $$5 = $$4.c($$3);
        if ($$5 == null) {
            throw a.create((Object)$$3);
        }
        boolean $$6 = $$4.f().contains($$5);
        if ($$2 && $$6) {
            throw b.create((Object)$$3);
        }
        if (!$$2 && !$$6) {
            throw c.create((Object)$$3);
        }
        caw $$7 = ((ds)$$0.getSource()).w();
        caw $$8 = $$5.d();
        if (!$$8.a($$7)) {
            throw d.create((Object)$$3, (Object)cay.a($$7, $$8));
        }
        return $$5;
    }

    static interface a {
        public void apply(List<akg> var1, akg var2) throws CommandSyntaxException;
    }
}

