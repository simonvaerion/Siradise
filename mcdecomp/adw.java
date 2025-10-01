/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class adw {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("banlist").requires($$0 -> $$0.c(3))).executes($$0 -> {
            alk $$1 = ((ds)$$0.getSource()).l().ac();
            return adw.a((ds)$$0.getSource(), Lists.newArrayList((Iterable)Iterables.concat($$1.f().d(), $$1.g().d())));
        })).then(dt.a("ips").executes($$0 -> adw.a((ds)$$0.getSource(), ((ds)$$0.getSource()).l().ac().g().d())))).then(dt.a("players").executes($$0 -> adw.a((ds)$$0.getSource(), ((ds)$$0.getSource()).l().ac().f().d()))));
    }

    private static int a(ds $$0, Collection<? extends alf<?>> $$1) {
        if ($$1.isEmpty()) {
            $$0.a(() -> sw.c("commands.banlist.none"), false);
        } else {
            $$0.a(() -> sw.a("commands.banlist.list", $$1.size()), false);
            for (alf<?> $$2 : $$1) {
                $$0.a(() -> sw.a("commands.banlist.entry", $$2.e(), $$2.b(), $$2.d()), false);
            }
        }
        return $$1.size();
    }
}

