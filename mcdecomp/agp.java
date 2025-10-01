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

public class agp {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("time").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("set").then(dt.a("day").executes($$0 -> agp.a((ds)$$0.getSource(), 1000)))).then(dt.a("noon").executes($$0 -> agp.a((ds)$$0.getSource(), 6000)))).then(dt.a("night").executes($$0 -> agp.a((ds)$$0.getSource(), 13000)))).then(dt.a("midnight").executes($$0 -> agp.a((ds)$$0.getSource(), 18000)))).then(dt.a("time", fb.a()).executes($$0 -> agp.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(dt.a("add").then(dt.a("time", fb.a()).executes($$0 -> agp.b((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("query").then(dt.a("daytime").executes($$0 -> agp.c((ds)$$0.getSource(), agp.a(((ds)$$0.getSource()).e()))))).then(dt.a("gametime").executes($$0 -> agp.c((ds)$$0.getSource(), (int)(((ds)$$0.getSource()).e().V() % Integer.MAX_VALUE))))).then(dt.a("day").executes($$0 -> agp.c((ds)$$0.getSource(), (int)(((ds)$$0.getSource()).e().W() / 24000L % Integer.MAX_VALUE))))));
    }

    private static int a(aif $$0) {
        return (int)($$0.W() % 24000L);
    }

    private static int c(ds $$0, int $$1) {
        $$0.a(() -> sw.a("commands.time.query", $$1), false);
        return $$1;
    }

    public static int a(ds $$0, int $$1) {
        for (aif $$2 : $$0.l().F()) {
            $$2.b((long)$$1);
        }
        $$0.a(() -> sw.a("commands.time.set", $$1), true);
        return agp.a($$0.e());
    }

    public static int b(ds $$0, int $$1) {
        for (aif $$2 : $$0.l().F()) {
            $$2.b($$2.W() + (long)$$1);
        }
        int $$3 = agp.a($$0.e());
        $$0.a(() -> sw.a("commands.time.set", $$3), true);
        return $$3;
    }
}

