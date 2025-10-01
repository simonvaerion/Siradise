/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class aex {
    static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> sw.a("commands.item.target.not_a_container", $$0, $$1, $$2));
    private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> sw.a("commands.item.source.not_a_container", $$0, $$1, $$2));
    static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.target.no_such_slot", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.source.no_such_slot", $$0));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.target.no_changes", $$0));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.item.target.no_changed.known_item", $$0, $$1));
    private static final SuggestionProvider<ds> g = ($$0, $$1) -> {
        dzn $$2 = ((ds)$$0.getSource()).l().aH();
        return du.a($$2.a(dzp.b), $$1);
    };

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("item").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)dt.a("replace").then(dt.a("block").then(dt.a("pos", fi.a()).then(((RequiredArgumentBuilder)dt.a("slot", ew.a()).then(dt.a("with").then(((RequiredArgumentBuilder)dt.a("item", fu.a($$1)).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot"), fu.a($$0, "item").a(1, false)))).then(dt.a("count", IntegerArgumentType.integer((int)1, (int)64)).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot"), fu.a($$0, "item").a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true))))))).then(((LiteralArgumentBuilder)dt.a("from").then(dt.a("block").then(dt.a("source", fi.a()).then(((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a()).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot")))).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier")))))))).then(dt.a("entity").then(dt.a("source", ec.a()).then(((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a()).executes($$0 -> aex.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot")))).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier")))))))))))).then(dt.a("entity").then(dt.a("targets", ec.b()).then(((RequiredArgumentBuilder)dt.a("slot", ew.a()).then(dt.a("with").then(((RequiredArgumentBuilder)dt.a("item", fu.a($$1)).executes($$0 -> aex.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot"), fu.a($$0, "item").a(1, false)))).then(dt.a("count", IntegerArgumentType.integer((int)1, (int)64)).executes($$0 -> aex.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot"), fu.a($$0, "item").a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true))))))).then(((LiteralArgumentBuilder)dt.a("from").then(dt.a("block").then(dt.a("source", fi.a()).then(((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a()).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot")))).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier")))))))).then(dt.a("entity").then(dt.a("source", ec.a()).then(((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a()).executes($$0 -> aex.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot")))).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "source"), ew.a((CommandContext<ds>)$$0, "sourceSlot"), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier"))))))))))))).then(((LiteralArgumentBuilder)dt.a("modify").then(dt.a("block").then(dt.a("pos", fi.a()).then(dt.a("slot", ew.a()).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier")))))))).then(dt.a("entity").then(dt.a("targets", ec.b()).then(dt.a("slot", ew.a()).then(dt.a("modifier", eq.a()).suggests(g).executes($$0 -> aex.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ew.a((CommandContext<ds>)$$0, "slot"), eq.d((CommandContext<ds>)$$0, "modifier")))))))));
    }

    private static int a(ds $$0, gu $$1, int $$2, eaz $$3) throws CommandSyntaxException {
        bdq $$4 = aex.a($$0, $$1, a);
        if ($$2 < 0 || $$2 >= $$4.b()) {
            throw b.create((Object)$$2);
        }
        cfz $$5 = aex.a($$0, $$3, $$4.a($$2));
        $$4.a($$2, $$5);
        $$0.a(() -> sw.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
        return 1;
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, int $$2, eaz $$3) throws CommandSyntaxException {
        HashMap $$4 = Maps.newHashMapWithExpectedSize((int)$$1.size());
        for (bfj bfj2 : $$1) {
            cfz $$7;
            bgs $$6 = bfj2.a_($$2);
            if ($$6 == bgs.b || !$$6.a($$7 = aex.a($$0, $$3, $$6.a().p()))) continue;
            $$4.put(bfj2, $$7);
            if (!(bfj2 instanceof aig)) continue;
            ((aig)bfj2).bR.d();
        }
        if ($$4.isEmpty()) {
            throw e.create((Object)$$2);
        }
        if ($$4.size() == 1) {
            Map.Entry $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> sw.a("commands.item.entity.set.success.single", ((bfj)$$8.getKey()).H_(), ((cfz)$$8.getValue()).J()), true);
        } else {
            $$0.a(() -> sw.a("commands.item.entity.set.success.multiple", $$4.size()), true);
        }
        return $$4.size();
    }

    private static int a(ds $$0, gu $$1, int $$2, cfz $$3) throws CommandSyntaxException {
        bdq $$4 = aex.a($$0, $$1, a);
        if ($$2 < 0 || $$2 >= $$4.b()) {
            throw b.create((Object)$$2);
        }
        $$4.a($$2, $$3);
        $$0.a(() -> sw.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
        return 1;
    }

    private static bdq a(ds $$0, gu $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
        czn $$3 = $$0.e().c_($$1);
        if (!($$3 instanceof bdq)) {
            throw $$2.create((Object)$$1.u(), (Object)$$1.v(), (Object)$$1.w());
        }
        return (bdq)((Object)$$3);
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, int $$2, cfz $$3) throws CommandSyntaxException {
        ArrayList $$4 = Lists.newArrayListWithCapacity((int)$$1.size());
        for (bfj bfj2 : $$1) {
            bgs $$6 = bfj2.a_($$2);
            if ($$6 == bgs.b || !$$6.a($$3.p())) continue;
            $$4.add(bfj2);
            if (!(bfj2 instanceof aig)) continue;
            ((aig)bfj2).bR.d();
        }
        if ($$4.isEmpty()) {
            throw f.create((Object)$$3.J(), (Object)$$2);
        }
        if ($$4.size() == 1) {
            $$0.a(() -> sw.a("commands.item.entity.set.success.single", ((bfj)$$4.iterator().next()).H_(), $$3.J()), true);
        } else {
            $$0.a(() -> sw.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
        }
        return $$4.size();
    }

    private static int a(ds $$0, gu $$1, int $$2, Collection<? extends bfj> $$3, int $$4) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$1, $$2));
    }

    private static int a(ds $$0, gu $$1, int $$2, Collection<? extends bfj> $$3, int $$4, eaz $$5) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$5, aex.a($$0, $$1, $$2)));
    }

    private static int a(ds $$0, gu $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$1, $$2));
    }

    private static int a(ds $$0, gu $$1, int $$2, gu $$3, int $$4, eaz $$5) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$5, aex.a($$0, $$1, $$2)));
    }

    private static int a(ds $$0, bfj $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$1, $$2));
    }

    private static int a(ds $$0, bfj $$1, int $$2, gu $$3, int $$4, eaz $$5) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$5, aex.a($$1, $$2)));
    }

    private static int a(ds $$0, bfj $$1, int $$2, Collection<? extends bfj> $$3, int $$4) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$1, $$2));
    }

    private static int a(ds $$0, bfj $$1, int $$2, Collection<? extends bfj> $$3, int $$4, eaz $$5) throws CommandSyntaxException {
        return aex.a($$0, $$3, $$4, aex.a($$0, $$5, aex.a($$1, $$2)));
    }

    private static cfz a(ds $$0, eaz $$1, cfz $$2) {
        aif $$3 = $$0.e();
        dzq $$4 = new dzq.a($$3).a(ebw.f, $$0.d()).b(ebw.a, $$0.f()).a(ebv.c);
        dzk $$5 = new dzk.a($$4).a(null);
        $$5.b(dzk.a($$1));
        return (cfz)$$1.apply($$2, $$5);
    }

    private static cfz a(bfj $$0, int $$1) throws CommandSyntaxException {
        bgs $$2 = $$0.a_($$1);
        if ($$2 == bgs.b) {
            throw d.create((Object)$$1);
        }
        return $$2.a().p();
    }

    private static cfz a(ds $$0, gu $$1, int $$2) throws CommandSyntaxException {
        bdq $$3 = aex.a($$0, $$1, c);
        if ($$2 < 0 || $$2 >= $$3.b()) {
            throw d.create((Object)$$2);
        }
        return $$3.a($$2).p();
    }
}

