/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aec {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.damage.invulnerable"));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("damage").requires($$0 -> $$0.c(2))).then(dt.a("target", ec.a()).then(((RequiredArgumentBuilder)dt.a("amount", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> aec.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), ((ds)$$0.getSource()).e().ag().n()))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("damageType", eo.a($$1, jc.p)).executes($$0 -> aec.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new ben(eo.a((CommandContext<ds>)$$0, "damageType", jc.p))))).then(dt.a("at").then(dt.a("location", fp.a()).executes($$0 -> aec.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new ben(eo.a((CommandContext<ds>)$$0, "damageType", jc.p), fp.a((CommandContext<ds>)$$0, "location"))))))).then(dt.a("by").then(((RequiredArgumentBuilder)dt.a("entity", ec.a()).executes($$0 -> aec.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new ben(eo.a((CommandContext<ds>)$$0, "damageType", jc.p), ec.a((CommandContext<ds>)$$0, "entity"))))).then(dt.a("from").then(dt.a("cause", ec.a()).executes($$0 -> aec.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new ben(eo.a((CommandContext<ds>)$$0, "damageType", jc.p), ec.a((CommandContext<ds>)$$0, "entity"), ec.a((CommandContext<ds>)$$0, "cause"))))))))))));
    }

    private static int a(ds $$0, bfj $$1, float $$2, ben $$3) throws CommandSyntaxException {
        if ($$1.a($$3, $$2)) {
            $$0.a(() -> sw.a("commands.damage.success", Float.valueOf($$2), $$1.H_()), true);
            return 1;
        }
        throw a.create();
    }
}

