/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class ags {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("warden_spawn_tracker").requires($$0 -> $$0.c(2))).then(dt.a("clear").executes($$0 -> ags.a((ds)$$0.getSource(), (Collection<? extends byo>)ImmutableList.of((Object)((ds)$$0.getSource()).h()))))).then(dt.a("set").then(dt.a("warning_level", IntegerArgumentType.integer((int)0, (int)4)).executes($$0 -> ags.a((ds)$$0.getSource(), (Collection<? extends byo>)ImmutableList.of((Object)((ds)$$0.getSource()).h()), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"warning_level"))))));
    }

    private static int a(ds $$0, Collection<? extends byo> $$12, int $$2) {
        for (byo byo2 : $$12) {
            byo2.W().ifPresent($$1 -> $$1.a($$2));
        }
        if ($$12.size() == 1) {
            $$0.a(() -> sw.a("commands.warden_spawn_tracker.set.success.single", ((byo)$$12.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.warden_spawn_tracker.set.success.multiple", $$12.size()), true);
        }
        return $$12.size();
    }

    private static int a(ds $$0, Collection<? extends byo> $$1) {
        for (byo byo2 : $$1) {
            byo2.W().ifPresent(bxu::b);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.warden_spawn_tracker.clear.success.single", ((byo)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

