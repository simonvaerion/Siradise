/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class afi {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.particle.failed"));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("particle").requires($$0 -> $$0.c(2))).then(((RequiredArgumentBuilder)dt.a("name", em.a($$1)).executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), ((ds)$$0.getSource()).d(), eei.b, 0.0f, 0, false, ((ds)$$0.getSource()).l().ac().t()))).then(((RequiredArgumentBuilder)dt.a("pos", fp.a()).executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), eei.b, 0.0f, 0, false, ((ds)$$0.getSource()).l().ac().t()))).then(dt.a("delta", fp.a(false)).then(dt.a("speed", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("count", IntegerArgumentType.integer((int)0)).executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), fp.a((CommandContext<ds>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, ((ds)$$0.getSource()).l().ac().t()))).then(((LiteralArgumentBuilder)dt.a("force").executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), fp.a((CommandContext<ds>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true, ((ds)$$0.getSource()).l().ac().t()))).then(dt.a("viewers", ec.d()).executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), fp.a((CommandContext<ds>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true, ec.f((CommandContext<ds>)$$0, "viewers")))))).then(((LiteralArgumentBuilder)dt.a("normal").executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), fp.a((CommandContext<ds>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, ((ds)$$0.getSource()).l().ac().t()))).then(dt.a("viewers", ec.d()).executes($$0 -> afi.a((ds)$$0.getSource(), em.a((CommandContext<ds>)$$0, "name"), fp.a((CommandContext<ds>)$$0, "pos"), fp.a((CommandContext<ds>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, ec.f((CommandContext<ds>)$$0, "viewers")))))))))));
    }

    private static int a(ds $$0, it $$1, eei $$2, eei $$3, float $$4, int $$5, boolean $$6, Collection<aig> $$7) throws CommandSyntaxException {
        int $$8 = 0;
        for (aig $$9 : $$7) {
            if (!$$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, $$4)) continue;
            ++$$8;
        }
        if ($$8 == 0) {
            throw a.create();
        }
        $$0.a(() -> sw.a("commands.particle.success", new Object[]{jb.k.b($$1.b()).toString()}), true);
        return $$8;
    }
}

