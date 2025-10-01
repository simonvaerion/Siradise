/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class agm {
    private static final ts a = ts.a.a(new tb(tb.a.a, sw.c("chat.type.team.hover"))).a(new su(su.a.d, "/teammsg "));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.teammsg.failed.noteam"));

    public static void a(CommandDispatcher<ds> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", eg.a()).executes($$0 -> {
            ds $$1 = (ds)$$0.getSource();
            bfj $$22 = $$1.g();
            efe $$3 = (efe)$$22.cd();
            if ($$3 == null) {
                throw b.create();
            }
            List<aig> $$42 = $$1.l().ac().t().stream().filter($$2 -> $$2 == $$22 || $$2.cd() == $$3).toList();
            if (!$$42.isEmpty()) {
                eg.a((CommandContext<ds>)$$0, "message", (tl $$4) -> agm.a($$1, $$22, $$3, $$42, $$4));
            }
            return $$42.size();
        })));
        $$02.register((LiteralArgumentBuilder)dt.a("tm").redirect((CommandNode)$$1));
    }

    private static void a(ds $$0, bfj $$1, efe $$2, List<aig> $$3, tl $$4) {
        tj $$5 = $$2.d().c(a);
        ss.a $$6 = ss.a(ss.g, $$0).c($$5);
        ss.a $$7 = ss.a(ss.h, $$0).c($$5);
        tk $$8 = tk.a($$4);
        boolean $$9 = false;
        for (aig $$10 : $$3) {
            ss.a $$11 = $$10 == $$1 ? $$7 : $$6;
            boolean $$12 = $$0.a($$10);
            $$10.a($$8, $$12, $$11);
            $$9 |= $$12 && $$4.i();
        }
        if ($$9) {
            $$0.a(alk.f);
        }
    }
}

