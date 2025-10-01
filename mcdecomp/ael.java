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

public class ael {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)dt.a("me").then(dt.a("action", eg.a()).executes($$0 -> {
            eg.a((CommandContext<ds>)$$0, "action", $$1 -> {
                ds $$2 = (ds)$$0.getSource();
                alk $$3 = $$2.l().ac();
                $$3.a((tl)$$1, $$2, ss.a(ss.i, $$2));
            });
            return 1;
        })));
    }
}

