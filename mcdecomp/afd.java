/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afd {
    public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
        dzn $$2 = ((ds)$$0.getSource()).l().aH();
        return du.a($$2.a(dzp.c), $$1);
    };
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.drop.no_held_items", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.drop.no_loot_table", $$0));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register(afd.a((LiteralArgumentBuilder)dt.a("loot").requires($$0 -> $$0.c(2)), (ArgumentBuilder<ds, ?> $$12, b $$2) -> $$12.then(dt.a("fish").then(dt.a("loot_table", eq.a()).suggests(a).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$1 -> afd.a((CommandContext<ds>)$$1, eq.e((CommandContext<ds>)$$1, "loot_table"), fi.a((CommandContext<ds>)$$1, "pos"), cfz.b, $$2))).then(dt.a("tool", fu.a($$1)).executes($$1 -> afd.a((CommandContext<ds>)$$1, eq.e((CommandContext<ds>)$$1, "loot_table"), fi.a((CommandContext<ds>)$$1, "pos"), fu.a($$1, "tool").a(1, false), $$2)))).then(dt.a("mainhand").executes($$1 -> afd.a((CommandContext<ds>)$$1, eq.e((CommandContext<ds>)$$1, "loot_table"), fi.a((CommandContext<ds>)$$1, "pos"), afd.a((ds)$$1.getSource(), bfo.a), $$2)))).then(dt.a("offhand").executes($$1 -> afd.a((CommandContext<ds>)$$1, eq.e((CommandContext<ds>)$$1, "loot_table"), fi.a((CommandContext<ds>)$$1, "pos"), afd.a((ds)$$1.getSource(), bfo.b), $$2)))))).then(dt.a("loot").then(dt.a("loot_table", eq.a()).suggests(a).executes($$1 -> afd.a((CommandContext<ds>)$$1, eq.e((CommandContext<ds>)$$1, "loot_table"), $$2)))).then(dt.a("kill").then(dt.a("target", ec.a()).executes($$1 -> afd.a((CommandContext<ds>)$$1, ec.a((CommandContext<ds>)$$1, "target"), $$2)))).then(dt.a("mine").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$1 -> afd.a((CommandContext<ds>)$$1, fi.a((CommandContext<ds>)$$1, "pos"), cfz.b, $$2))).then(dt.a("tool", fu.a($$1)).executes($$1 -> afd.a((CommandContext<ds>)$$1, fi.a((CommandContext<ds>)$$1, "pos"), fu.a($$1, "tool").a(1, false), $$2)))).then(dt.a("mainhand").executes($$1 -> afd.a((CommandContext<ds>)$$1, fi.a((CommandContext<ds>)$$1, "pos"), afd.a((ds)$$1.getSource(), bfo.a), $$2)))).then(dt.a("offhand").executes($$1 -> afd.a((CommandContext<ds>)$$1, fi.a((CommandContext<ds>)$$1, "pos"), afd.a((ds)$$1.getSource(), bfo.b), $$2)))))));
    }

    private static <T extends ArgumentBuilder<ds, T>> T a(T $$02, c $$12) {
        return (T)$$02.then(((LiteralArgumentBuilder)dt.a("replace").then(dt.a("entity").then(dt.a("entities", ec.b()).then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("slot", ew.a()), ($$0, $$1, $$2) -> afd.a(ec.b((CommandContext<ds>)$$0, "entities"), ew.a((CommandContext<ds>)$$0, "slot"), $$1.size(), $$1, $$2)).then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("count", IntegerArgumentType.integer((int)0)), ($$0, $$1, $$2) -> afd.a(ec.b((CommandContext<ds>)$$0, "entities"), ew.a((CommandContext<ds>)$$0, "slot"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), $$1, $$2))))))).then(dt.a("block").then(dt.a("targetPos", fi.a()).then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("slot", ew.a()), ($$0, $$1, $$2) -> afd.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "targetPos"), ew.a((CommandContext<ds>)$$0, "slot"), $$1.size(), $$1, $$2)).then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("count", IntegerArgumentType.integer((int)0)), ($$0, $$1, $$2) -> afd.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "targetPos"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"slot"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), $$1, $$2))))))).then(dt.a("insert").then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("targetPos", fi.a()), ($$0, $$1, $$2) -> afd.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "targetPos"), (List<cfz>)$$1, $$2)))).then(dt.a("give").then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("players", ec.d()), ($$0, $$1, $$2) -> afd.a(ec.f((CommandContext<ds>)$$0, "players"), (List<cfz>)$$1, $$2)))).then(dt.a("spawn").then($$12.construct((ArgumentBuilder<ds, ?>)dt.a("targetPos", fp.a()), ($$0, $$1, $$2) -> afd.a((ds)$$0.getSource(), fp.a((CommandContext<ds>)$$0, "targetPos"), (List<cfz>)$$1, $$2))));
    }

    private static bdq a(ds $$0, gu $$1) throws CommandSyntaxException {
        czn $$2 = $$0.e().c_($$1);
        if (!($$2 instanceof bdq)) {
            throw aex.a.create((Object)$$1.u(), (Object)$$1.v(), (Object)$$1.w());
        }
        return (bdq)((Object)$$2);
    }

    private static int a(ds $$0, gu $$1, List<cfz> $$2, a $$3) throws CommandSyntaxException {
        bdq $$4 = afd.a($$0, $$1);
        ArrayList $$5 = Lists.newArrayListWithCapacity((int)$$2.size());
        for (cfz $$6 : $$2) {
            if (!afd.a($$4, $$6.p())) continue;
            $$4.e();
            $$5.add($$6);
        }
        $$3.accept($$5);
        return $$5.size();
    }

    private static boolean a(bdq $$0, cfz $$1) {
        boolean $$2 = false;
        for (int $$3 = 0; $$3 < $$0.b() && !$$1.b(); ++$$3) {
            cfz $$4 = $$0.a($$3);
            if (!$$0.b($$3, $$1)) continue;
            if ($$4.b()) {
                $$0.a($$3, $$1);
                $$2 = true;
                break;
            }
            if (!afd.a($$4, $$1)) continue;
            int $$5 = $$1.g() - $$4.L();
            int $$6 = Math.min($$1.L(), $$5);
            $$1.h($$6);
            $$4.g($$6);
            $$2 = true;
        }
        return $$2;
    }

    private static int a(ds $$0, gu $$1, int $$2, int $$3, List<cfz> $$4, a $$5) throws CommandSyntaxException {
        bdq $$6 = afd.a($$0, $$1);
        int $$7 = $$6.b();
        if ($$2 < 0 || $$2 >= $$7) {
            throw aex.b.create((Object)$$2);
        }
        ArrayList $$8 = Lists.newArrayListWithCapacity((int)$$4.size());
        for (int $$9 = 0; $$9 < $$3; ++$$9) {
            cfz $$11;
            int $$10 = $$2 + $$9;
            cfz cfz2 = $$11 = $$9 < $$4.size() ? $$4.get($$9) : cfz.b;
            if (!$$6.b($$10, $$11)) continue;
            $$6.a($$10, $$11);
            $$8.add($$11);
        }
        $$5.accept($$8);
        return $$8.size();
    }

    private static boolean a(cfz $$0, cfz $$1) {
        return $$0.L() <= $$0.g() && cfz.c($$0, $$1);
    }

    private static int a(Collection<aig> $$0, List<cfz> $$1, a $$2) throws CommandSyntaxException {
        ArrayList $$3 = Lists.newArrayListWithCapacity((int)$$1.size());
        for (cfz $$4 : $$1) {
            for (aig $$5 : $$0) {
                if (!$$5.fN().e($$4.p())) continue;
                $$3.add($$4);
            }
        }
        $$2.accept($$3);
        return $$3.size();
    }

    private static void a(bfj $$0, List<cfz> $$1, int $$2, int $$3, List<cfz> $$4) {
        for (int $$5 = 0; $$5 < $$3; ++$$5) {
            cfz $$6 = $$5 < $$1.size() ? $$1.get($$5) : cfz.b;
            bgs $$7 = $$0.a_($$2 + $$5);
            if ($$7 == bgs.b || !$$7.a($$6.p())) continue;
            $$4.add($$6);
        }
    }

    private static int a(Collection<? extends bfj> $$0, int $$1, int $$2, List<cfz> $$3, a $$4) throws CommandSyntaxException {
        ArrayList $$5 = Lists.newArrayListWithCapacity((int)$$3.size());
        for (bfj bfj2 : $$0) {
            if (bfj2 instanceof aig) {
                aig $$7 = (aig)bfj2;
                afd.a(bfj2, $$3, $$1, $$2, $$5);
                $$7.bR.d();
                continue;
            }
            afd.a(bfj2, $$3, $$1, $$2, $$5);
        }
        $$4.accept($$5);
        return $$5.size();
    }

    private static int a(ds $$0, eei $$1, List<cfz> $$22, a $$3) throws CommandSyntaxException {
        aif $$4 = $$0.e();
        $$22.forEach($$2 -> {
            bvh $$3 = new bvh($$4, $$1.c, $$1.d, $$1.e, $$2.p());
            $$3.o();
            $$4.b($$3);
        });
        $$3.accept($$22);
        return $$22.size();
    }

    private static void a(ds $$0, List<cfz> $$1) {
        if ($$1.size() == 1) {
            cfz $$2 = $$1.get(0);
            $$0.a(() -> sw.a("commands.drop.success.single", $$2.L(), $$2.J()), false);
        } else {
            $$0.a(() -> sw.a("commands.drop.success.multiple", $$1.size()), false);
        }
    }

    private static void a(ds $$0, List<cfz> $$1, acq $$2) {
        if ($$1.size() == 1) {
            cfz $$3 = $$1.get(0);
            $$0.a(() -> sw.a("commands.drop.success.single_with_table", $$3.L(), $$3.J(), $$2), false);
        } else {
            $$0.a(() -> sw.a("commands.drop.success.multiple_with_table", $$1.size(), $$2), false);
        }
    }

    private static cfz a(ds $$0, bfo $$1) throws CommandSyntaxException {
        bfj $$2 = $$0.g();
        if ($$2 instanceof bfz) {
            return ((bfz)$$2).c($$1);
        }
        throw b.create((Object)$$2.H_());
    }

    private static int a(CommandContext<ds> $$0, gu $$1, cfz $$22, b $$3) throws CommandSyntaxException {
        ds $$4 = (ds)$$0.getSource();
        aif $$5 = $$4.e();
        dcb $$6 = $$5.a_($$1);
        czn $$7 = $$5.c_($$1);
        dzq.a $$8 = new dzq.a($$5).a(ebw.f, eei.b($$1)).a(ebw.g, $$6).b(ebw.h, $$7).b(ebw.a, $$4.f()).a(ebw.i, $$22);
        List<cfz> $$9 = $$6.a($$8);
        return $$3.accept($$0, $$9, $$2 -> afd.a($$4, (List<cfz>)$$2, $$6.b().r()));
    }

    private static int a(CommandContext<ds> $$0, bfj $$1, b $$22) throws CommandSyntaxException {
        if (!($$1 instanceof bfz)) {
            throw c.create((Object)$$1.H_());
        }
        acq $$3 = ((bfz)$$1).ew();
        ds $$4 = (ds)$$0.getSource();
        dzq.a $$5 = new dzq.a($$4.e());
        bfj $$6 = $$4.f();
        if ($$6 instanceof byo) {
            byo $$7 = (byo)$$6;
            $$5.a(ebw.b, $$7);
        }
        $$5.a(ebw.c, $$1.dJ().o());
        $$5.b(ebw.e, $$6);
        $$5.b(ebw.d, $$6);
        $$5.a(ebw.a, $$1);
        $$5.a(ebw.f, $$4.d());
        dzq $$8 = $$5.a(ebv.f);
        dzs $$9 = $$4.l().aH().getLootTable($$3);
        ObjectArrayList<cfz> $$10 = $$9.a($$8);
        return $$22.accept($$0, (List<cfz>)$$10, $$2 -> afd.a($$4, (List<cfz>)$$2, $$3));
    }

    private static int a(CommandContext<ds> $$0, acq $$1, b $$2) throws CommandSyntaxException {
        ds $$3 = (ds)$$0.getSource();
        dzq $$4 = new dzq.a($$3.e()).b(ebw.a, $$3.f()).a(ebw.f, $$3.d()).a(ebv.b);
        return afd.a($$0, $$1, $$4, $$2);
    }

    private static int a(CommandContext<ds> $$0, acq $$1, gu $$2, cfz $$3, b $$4) throws CommandSyntaxException {
        ds $$5 = (ds)$$0.getSource();
        dzq $$6 = new dzq.a($$5.e()).a(ebw.f, eei.b($$2)).a(ebw.i, $$3).b(ebw.a, $$5.f()).a(ebv.e);
        return afd.a($$0, $$1, $$6, $$4);
    }

    private static int a(CommandContext<ds> $$0, acq $$12, dzq $$2, b $$3) throws CommandSyntaxException {
        ds $$4 = (ds)$$0.getSource();
        dzs $$5 = $$4.l().aH().getLootTable($$12);
        ObjectArrayList<cfz> $$6 = $$5.a($$2);
        return $$3.accept($$0, (List<cfz>)$$6, $$1 -> afd.a($$4, $$1));
    }

    @FunctionalInterface
    static interface c {
        public ArgumentBuilder<ds, ?> construct(ArgumentBuilder<ds, ?> var1, b var2);
    }

    @FunctionalInterface
    static interface b {
        public int accept(CommandContext<ds> var1, List<cfz> var2, a var3) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public void accept(List<cfz> var1) throws CommandSyntaxException;
    }
}

