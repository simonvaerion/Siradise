/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class aev {
    public static final int a = 100;

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("give").requires($$0 -> $$0.c(2))).then(dt.a("targets", ec.d()).then(((RequiredArgumentBuilder)dt.a("item", fu.a($$1)).executes($$0 -> aev.a((ds)$$0.getSource(), fu.a($$0, "item"), ec.f((CommandContext<ds>)$$0, "targets"), 1))).then(dt.a("count", IntegerArgumentType.integer((int)1)).executes($$0 -> aev.a((ds)$$0.getSource(), fu.a($$0, "item"), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count")))))));
    }

    private static int a(ds $$0, fv $$1, Collection<aig> $$2, int $$3) throws CommandSyntaxException {
        int $$4 = $$1.a().l();
        int $$5 = $$4 * 100;
        cfz $$6 = $$1.a($$3, false);
        if ($$3 > $$5) {
            $$0.b(sw.a("commands.give.failed.toomanyitems", $$5, $$6.J()));
            return 0;
        }
        for (aig $$7 : $$2) {
            int $$8 = $$3;
            while ($$8 > 0) {
                int $$9 = Math.min($$4, $$8);
                $$8 -= $$9;
                cfz $$10 = $$1.a($$9, false);
                boolean $$11 = $$7.fN().e($$10);
                if (!$$11 || !$$10.b()) {
                    bvh $$12 = $$7.a($$10, false);
                    if ($$12 == null) continue;
                    $$12.p();
                    $$12.b($$7.ct());
                    continue;
                }
                $$10.f(1);
                bvh $$13 = $$7.a($$10, false);
                if ($$13 != null) {
                    $$13.w();
                }
                $$7.dI().a(null, $$7.dn(), $$7.dp(), $$7.dt(), amh.ma, ami.h, 0.2f, (($$7.ec().i() - $$7.ec().i()) * 0.7f + 1.0f) * 2.0f);
                $$7.bR.d();
            }
        }
        if ($$2.size() == 1) {
            $$0.a(() -> sw.a("commands.give.success.single", $$3, $$6.J(), ((aig)$$2.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.give.success.single", $$3, $$6.J(), $$2.size()), true);
        }
        return $$2.size();
    }
}

