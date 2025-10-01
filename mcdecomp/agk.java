/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;

public class agk {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.tag.add.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.tag.remove.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tag").requires($$0 -> $$0.c(2))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.b()).then(dt.a("add").then(dt.a("name", StringArgumentType.word()).executes($$0 -> agk.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), StringArgumentType.getString((CommandContext)$$0, (String)"name")))))).then(dt.a("remove").then(dt.a("name", StringArgumentType.word()).suggests(($$0, $$1) -> du.b(agk.a(ec.b((CommandContext<ds>)$$0, "targets")), $$1)).executes($$0 -> agk.b((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), StringArgumentType.getString((CommandContext)$$0, (String)"name")))))).then(dt.a("list").executes($$0 -> agk.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"))))));
    }

    private static Collection<String> a(Collection<? extends bfj> $$0) {
        HashSet $$1 = Sets.newHashSet();
        for (bfj bfj2 : $$0) {
            $$1.addAll(bfj2.ag());
        }
        return $$1;
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, String $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (bfj bfj2 : $$1) {
            if (!bfj2.a($$2)) continue;
            ++$$3;
        }
        if ($$3 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.tag.add.success.single", new Object[]{$$2, ((bfj)$$1.iterator().next()).H_()}), true);
        } else {
            $$0.a(() -> sw.a("commands.tag.add.success.multiple", new Object[]{$$2, $$1.size()}), true);
        }
        return $$3;
    }

    private static int b(ds $$0, Collection<? extends bfj> $$1, String $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (bfj bfj2 : $$1) {
            if (!bfj2.b($$2)) continue;
            ++$$3;
        }
        if ($$3 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.tag.remove.success.single", new Object[]{$$2, ((bfj)$$1.iterator().next()).H_()}), true);
        } else {
            $$0.a(() -> sw.a("commands.tag.remove.success.multiple", new Object[]{$$2, $$1.size()}), true);
        }
        return $$3;
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1) {
        HashSet $$2 = Sets.newHashSet();
        for (bfj bfj2 : $$1) {
            $$2.addAll(bfj2.ag());
        }
        if ($$1.size() == 1) {
            bfj $$4 = $$1.iterator().next();
            if ($$2.isEmpty()) {
                $$0.a(() -> sw.a("commands.tag.list.single.empty", $$4.H_()), false);
            } else {
                $$0.a(() -> sw.a("commands.tag.list.single.success", $$4.H_(), $$2.size(), sy.a($$2)), false);
            }
        } else if ($$2.isEmpty()) {
            $$0.a(() -> sw.a("commands.tag.list.multiple.empty", $$1.size()), false);
        } else {
            $$0.a(() -> sw.a("commands.tag.list.multiple.success", $$2.size(), $$2.size(), sy.a($$2)), false);
        }
        return $$2.size();
    }
}

