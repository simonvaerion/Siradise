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

public class agt {
    private static final int a = -1;

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("weather").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)dt.a("clear").executes($$0 -> agt.a((ds)$$0.getSource(), -1))).then(dt.a("duration", fb.a(1)).executes($$0 -> agt.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration")))))).then(((LiteralArgumentBuilder)dt.a("rain").executes($$0 -> agt.b((ds)$$0.getSource(), -1))).then(dt.a("duration", fb.a(1)).executes($$0 -> agt.b((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration")))))).then(((LiteralArgumentBuilder)dt.a("thunder").executes($$0 -> agt.c((ds)$$0.getSource(), -1))).then(dt.a("duration", fb.a(1)).executes($$0 -> agt.c((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration"))))));
    }

    private static int a(ds $$0, int $$1, bdc $$2) {
        if ($$1 == -1) {
            return $$2.a($$0.e().y_());
        }
        return $$1;
    }

    private static int a(ds $$0, int $$1) {
        $$0.e().a(agt.a($$0, $$1, aif.b), 0, false, false);
        $$0.a(() -> sw.c("commands.weather.set.clear"), true);
        return $$1;
    }

    private static int b(ds $$0, int $$1) {
        $$0.e().a(0, agt.a($$0, $$1, aif.c), true, false);
        $$0.a(() -> sw.c("commands.weather.set.rain"), true);
        return $$1;
    }

    private static int c(ds $$0, int $$1) {
        $$0.e().a(0, agt.a($$0, $$1, aif.d), true, true);
        $$0.a(() -> sw.c("commands.weather.set.thunder"), true);
        return $$1;
    }
}

