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
import java.util.Collections;

public class agc {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawnpoint").requires($$0 -> $$0.c(2))).executes($$0 -> agc.a((ds)$$0.getSource(), Collections.singleton(((ds)$$0.getSource()).h()), gu.a(((ds)$$0.getSource()).d()), 0.0f))).then(((RequiredArgumentBuilder)dt.a("targets", ec.d()).executes($$0 -> agc.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), gu.a(((ds)$$0.getSource()).d()), 0.0f))).then(((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$0 -> agc.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), fi.c((CommandContext<ds>)$$0, "pos"), 0.0f))).then(dt.a("angle", dv.a()).executes($$0 -> agc.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), fi.c((CommandContext<ds>)$$0, "pos"), dv.a((CommandContext<ds>)$$0, "angle")))))));
    }

    private static int a(ds $$0, Collection<aig> $$1, gu $$2, float $$3) {
        acp<cmm> $$4 = $$0.e().ac();
        for (aig $$5 : $$1) {
            $$5.a($$4, $$2, $$3, true, false);
        }
        String $$6 = $$4.a().toString();
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), Float.valueOf($$3), $$6, ((aig)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), Float.valueOf($$3), $$6, $$1.size()), true);
        }
        return $$1.size();
    }
}

