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

public class agb {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setidletimeout").requires($$0 -> $$0.c(3))).then(dt.a("minutes", IntegerArgumentType.integer((int)0)).executes($$0 -> agb.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"minutes")))));
    }

    private static int a(ds $$0, int $$1) {
        $$0.l().c($$1);
        $$0.a(() -> sw.a("commands.setidletimeout.success", $$1), true);
        return $$1;
    }
}

