/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class afz {
    public static void a(CommandDispatcher<ds> $$02, boolean $$12) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("seed").requires($$1 -> !$$12 || $$1.c(2))).executes($$0 -> {
            long $$1 = ((ds)$$0.getSource()).e().A();
            tj $$2 = sy.a(String.valueOf($$1));
            ((ds)$$0.getSource()).a(() -> sw.a("commands.seed.success", $$2), false);
            return (int)$$1;
        }));
    }
}

