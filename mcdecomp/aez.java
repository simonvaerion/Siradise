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
import java.util.Collection;

public class aez {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kick").requires($$0 -> $$0.c(3))).then(((RequiredArgumentBuilder)dt.a("targets", ec.d()).executes($$0 -> aez.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), sw.c("multiplayer.disconnect.kicked")))).then(dt.a("reason", eg.a()).executes($$0 -> aez.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), eg.a((CommandContext<ds>)$$0, "reason"))))));
    }

    private static int a(ds $$0, Collection<aig> $$1, sw $$2) {
        for (aig $$3 : $$1) {
            $$3.c.b($$2);
            $$0.a(() -> sw.a("commands.kick.success", $$3.H_(), $$2), true);
        }
        return $$1.size();
    }
}

