/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class afr {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("return").requires($$0 -> $$0.c(2))).then(dt.a("value", IntegerArgumentType.integer()).executes($$0 -> afr.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))));
    }

    private static int a(ds $$0, int $$1) {
        $$0.p().accept($$1);
        return $$1;
    }
}

