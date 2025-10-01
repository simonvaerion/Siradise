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

public class afw {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("say").requires($$0 -> $$0.c(2))).then(dt.a("message", eg.a()).executes($$0 -> {
            eg.a((CommandContext<ds>)$$0, "message", $$1 -> {
                ds $$2 = (ds)$$0.getSource();
                alk $$3 = $$2.l().ac();
                $$3.a((tl)$$1, $$2, ss.a(ss.d, $$2));
            });
            return 1;
        })));
    }
}

