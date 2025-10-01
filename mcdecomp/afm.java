/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class afm {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.publish.failed"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.publish.alreadyPublished", $$0));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("publish").requires($$0 -> $$0.c(4))).executes($$0 -> afm.a((ds)$$0.getSource(), aos.a(), false, null))).then(((RequiredArgumentBuilder)dt.a("allowCommands", BoolArgumentType.bool()).executes($$0 -> afm.a((ds)$$0.getSource(), aos.a(), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), null))).then(((RequiredArgumentBuilder)dt.a("gamemode", ed.a()).executes($$0 -> afm.a((ds)$$0.getSource(), aos.a(), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), ed.a((CommandContext<ds>)$$0, "gamemode")))).then(dt.a("port", IntegerArgumentType.integer((int)0, (int)65535)).executes($$0 -> afm.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), ed.a((CommandContext<ds>)$$0, "gamemode")))))));
    }

    private static int a(ds $$0, int $$1, boolean $$2, @Nullable cmj $$3) throws CommandSyntaxException {
        if ($$0.l().p()) {
            throw b.create((Object)$$0.l().M());
        }
        if (!$$0.l().a($$3, $$2, $$1)) {
            throw a.create();
        }
        $$0.a(() -> afm.a($$1), true);
        return $$1;
    }

    public static tj a(int $$0) {
        tj $$1 = sy.a(String.valueOf($$0));
        return sw.a("commands.publish.started", $$1);
    }
}

