/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afp {
    private static final Logger a = LogUtils.getLogger();

    public static void a(Collection<String> $$0, ds $$12) {
        $$12.l().a($$0).exceptionally($$1 -> {
            a.warn("Failed to execute reload", $$1);
            $$12.b(sw.c("commands.reload.failure"));
            return null;
        });
    }

    private static Collection<String> a(aki $$0, dze $$1, Collection<String> $$2) {
        $$0.a();
        ArrayList $$3 = Lists.newArrayList($$2);
        List<String> $$4 = $$1.F().a().b();
        for (String $$5 : $$0.b()) {
            if ($$4.contains($$5) || $$3.contains($$5)) continue;
            $$3.add($$5);
        }
        return $$3;
    }

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("reload").requires($$0 -> $$0.c(2))).executes($$0 -> {
            ds $$1 = (ds)$$0.getSource();
            MinecraftServer $$2 = $$1.l();
            aki $$3 = $$2.aB();
            dze $$4 = $$2.aU();
            Collection<String> $$5 = $$3.d();
            Collection<String> $$6 = afp.a($$3, $$4, $$5);
            $$1.a(() -> sw.c("commands.reload.success"), true);
            afp.a($$6, $$1);
            return 0;
        }));
    }
}

