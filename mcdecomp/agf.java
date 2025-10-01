/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
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
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class agf {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.spectate.self"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.spectate.not_spectator", $$0));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spectate").requires($$0 -> $$0.c(2))).executes($$0 -> agf.a((ds)$$0.getSource(), null, ((ds)$$0.getSource()).h()))).then(((RequiredArgumentBuilder)dt.a("target", ec.a()).executes($$0 -> agf.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), ((ds)$$0.getSource()).h()))).then(dt.a("player", ec.c()).executes($$0 -> agf.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), ec.e((CommandContext<ds>)$$0, "player"))))));
    }

    private static int a(ds $$0, @Nullable bfj $$1, aig $$2) throws CommandSyntaxException {
        if ($$2 == $$1) {
            throw a.create();
        }
        if ($$2.e.b() != cmj.d) {
            throw b.create((Object)$$2.H_());
        }
        $$2.c($$1);
        if ($$1 != null) {
            $$0.a(() -> sw.a("commands.spectate.success.started", $$1.H_()), false);
        } else {
            $$0.a(() -> sw.c("commands.spectate.success.stopped"), false);
        }
        return 1;
    }
}

