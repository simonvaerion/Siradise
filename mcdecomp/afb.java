/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class afb {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0 -> afb.a((ds)$$0.getSource()))).then(dt.a("uuids").executes($$0 -> afb.b((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) {
        return afb.a($$0, byo::H_);
    }

    private static int b(ds $$02) {
        return afb.a($$02, $$0 -> sw.a("commands.list.nameAndId", $$0.Z(), $$0.fM().getId()));
    }

    private static int a(ds $$0, Function<aig, sw> $$1) {
        alk $$2 = $$0.l().ac();
        List<aig> $$3 = $$2.t();
        sw $$4 = sy.b($$3, $$1);
        $$0.a(() -> sw.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
        return $$3.size();
    }
}

