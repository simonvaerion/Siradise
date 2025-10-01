/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class agh {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stop").requires($$0 -> $$0.c(4))).executes($$0 -> {
            ((ds)$$0.getSource()).a(() -> sw.c("commands.stop.stopping"), true);
            ((ds)$$0.getSource()).l().a(false);
            return 1;
        }));
    }
}

