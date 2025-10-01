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

public class aeg {
    public static void a(CommandDispatcher<ds> $$02) {
        LiteralArgumentBuilder $$12 = (LiteralArgumentBuilder)dt.a("debugmobspawning").requires($$0 -> $$0.c(2));
        for (bgc $$2 : bgc.values()) {
            $$12.then(dt.a($$2.a()).then(dt.a("at", fi.a()).executes($$1 -> aeg.a((ds)$$1.getSource(), $$2, fi.a((CommandContext<ds>)$$1, "at")))));
        }
        $$02.register($$12);
    }

    private static int a(ds $$0, bgc $$1, gu $$2) {
        cmx.a($$1, $$0.e(), $$2);
        return 1;
    }
}

