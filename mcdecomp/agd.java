/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class agd {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setworldspawn").requires($$0 -> $$0.c(2))).executes($$0 -> agd.a((ds)$$0.getSource(), gu.a(((ds)$$0.getSource()).d()), 0.0f))).then(((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$0 -> agd.a((ds)$$0.getSource(), fi.c((CommandContext<ds>)$$0, "pos"), 0.0f))).then(dt.a("angle", dv.a()).executes($$0 -> agd.a((ds)$$0.getSource(), fi.c((CommandContext<ds>)$$0, "pos"), dv.a((CommandContext<ds>)$$0, "angle"))))));
    }

    private static int a(ds $$0, gu $$1, float $$2) {
        $$0.e().a($$1, $$2);
        $$0.a(() -> sw.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), Float.valueOf($$2)), true);
        return 1;
    }
}

