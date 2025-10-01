/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import javax.annotation.Nullable;

public class agi {
    public static void a(CommandDispatcher<ds> $$02) {
        RequiredArgumentBuilder $$12 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.d()).executes($$0 -> agi.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), null, null))).then(dt.a("*").then(dt.a("sound", eq.a()).suggests(gk.c).executes($$0 -> agi.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), null, eq.e((CommandContext<ds>)$$0, "sound")))));
        for (ami $$2 : ami.values()) {
            $$12.then(((LiteralArgumentBuilder)dt.a($$2.a()).executes($$1 -> agi.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), $$2, null))).then(dt.a("sound", eq.a()).suggests(gk.c).executes($$1 -> agi.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), $$2, eq.e((CommandContext<ds>)$$1, "sound")))));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("stopsound").requires($$0 -> $$0.c(2))).then((ArgumentBuilder)$$12));
    }

    private static int a(ds $$0, Collection<aig> $$1, @Nullable ami $$2, @Nullable acq $$3) {
        yn $$4 = new yn($$3, $$2);
        for (aig $$5 : $$1) {
            $$5.c.a($$4);
        }
        if ($$2 != null) {
            if ($$3 != null) {
                $$0.a(() -> sw.a("commands.stopsound.success.source.sound", $$3, $$2.a()), true);
            } else {
                $$0.a(() -> sw.a("commands.stopsound.success.source.any", new Object[]{$$2.a()}), true);
            }
        } else if ($$3 != null) {
            $$0.a(() -> sw.a("commands.stopsound.success.sourceless.sound", $$3), true);
        } else {
            $$0.a(() -> sw.c("commands.stopsound.success.sourceless.any"), true);
        }
        return $$1.size();
    }
}

