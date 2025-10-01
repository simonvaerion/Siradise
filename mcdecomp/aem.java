/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aem {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.entity", $$0));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.itemless", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.incompatible", $$0));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.enchant.failed.level", $$0, $$1));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.enchant.failed"));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("enchant").requires($$0 -> $$0.c(2))).then(dt.a("targets", ec.b()).then(((RequiredArgumentBuilder)dt.a("enchantment", eo.a($$1, jc.r)).executes($$0 -> aem.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.g((CommandContext<ds>)$$0, "enchantment"), 1))).then(dt.a("level", IntegerArgumentType.integer((int)0)).executes($$0 -> aem.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.g((CommandContext<ds>)$$0, "enchantment"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"level")))))));
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, he<ckg> $$2, int $$3) throws CommandSyntaxException {
        ckg $$4 = $$2.a();
        if ($$3 > $$4.a()) {
            throw d.create((Object)$$3, (Object)$$4.a());
        }
        int $$5 = 0;
        for (bfj bfj2 : $$1) {
            if (bfj2 instanceof bfz) {
                bfz $$7 = (bfz)bfj2;
                cfz $$8 = $$7.eO();
                if (!$$8.b()) {
                    if ($$4.a($$8) && cki.a(cki.a($$8).keySet(), $$4)) {
                        $$8.a($$4, $$3);
                        ++$$5;
                        continue;
                    }
                    if ($$1.size() != 1) continue;
                    throw c.create((Object)$$8.d().m($$8).getString());
                }
                if ($$1.size() != 1) continue;
                throw b.create((Object)$$7.Z().getString());
            }
            if ($$1.size() != 1) continue;
            throw a.create((Object)bfj2.Z().getString());
        }
        if ($$5 == 0) {
            throw e.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.enchant.success.single", $$4.d($$3), ((bfj)$$3.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.enchant.success.multiple", $$4.d($$3), $$3.size()), true);
        }
        return $$5;
    }
}

