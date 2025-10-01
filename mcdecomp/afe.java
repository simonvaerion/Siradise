/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class afe {
    public static void a(CommandDispatcher<ds> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)dt.a("msg").then(dt.a("targets", ec.d()).then(dt.a("message", eg.a()).executes($$0 -> {
            Collection<aig> $$1 = ec.f((CommandContext<ds>)$$0, "targets");
            if (!$$1.isEmpty()) {
                eg.a((CommandContext<ds>)$$0, "message", (tl $$2) -> afe.a((ds)$$0.getSource(), $$1, $$2));
            }
            return $$1.size();
        }))));
        $$02.register((LiteralArgumentBuilder)dt.a("tell").redirect((CommandNode)$$1));
        $$02.register((LiteralArgumentBuilder)dt.a("w").redirect((CommandNode)$$1));
    }

    private static void a(ds $$0, Collection<aig> $$1, tl $$2) {
        ss.a $$3 = ss.a(ss.e, $$0);
        tk $$4 = tk.a($$2);
        boolean $$5 = false;
        for (aig $$6 : $$1) {
            ss.a $$7 = ss.a(ss.f, $$0).c($$6.H_());
            $$0.a($$4, false, $$7);
            boolean $$8 = $$0.a($$6);
            $$6.a($$4, $$8, $$3);
            $$5 |= $$8 && $$2.i();
        }
        if ($$5) {
            $$0.a(alk.f);
        }
    }
}

