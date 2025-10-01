/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class afa {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kill").requires($$0 -> $$0.c(2))).executes($$0 -> afa.a((ds)$$0.getSource(), (Collection<? extends bfj>)ImmutableList.of((Object)((ds)$$0.getSource()).g())))).then(dt.a("targets", ec.b()).executes($$0 -> afa.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets")))));
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1) {
        for (bfj bfj2 : $$1) {
            bfj2.ah();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.kill.success.single", ((bfj)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.kill.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

