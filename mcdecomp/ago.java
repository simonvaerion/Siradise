/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ago {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tellraw").requires($$0 -> $$0.c(2))).then(dt.a("targets", ec.d()).then(dt.a("message", dy.a()).executes($$0 -> {
            int $$1 = 0;
            for (aig $$2 : ec.f((CommandContext<ds>)$$0, "targets")) {
                $$2.b(sy.a((ds)$$0.getSource(), dy.a((CommandContext<ds>)$$0, "message"), (bfj)$$2, 0), false);
                ++$$1;
            }
            return $$1;
        }))));
    }
}

