/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class aep {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.pos.unloaded"));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.fillbiome.toobig", $$0, $$1));

    public static void a(CommandDispatcher<ds> $$03, dm $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fillbiome").requires($$0 -> $$0.c(2))).then(dt.a("from", fi.a()).then(dt.a("to", fi.a()).then(((RequiredArgumentBuilder)dt.a("biome", eo.a($$1, jc.ap)).executes($$02 -> aep.a((ds)$$02.getSource(), fi.a((CommandContext<ds>)$$02, "from"), fi.a((CommandContext<ds>)$$02, "to"), eo.a((CommandContext<ds>)$$02, "biome", jc.ap), (he<cnk> $$0) -> true))).then(dt.a("replace").then(dt.a("filter", er.a($$1, jc.ap)).executes($$0 -> aep.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to"), eo.a((CommandContext<ds>)$$0, "biome", jc.ap), er.a((CommandContext<ds>)$$0, "filter", jc.ap)::test))))))));
    }

    private static int a(int $$0) {
        return hq.c(hq.a($$0));
    }

    private static gu a(gu $$0) {
        return new gu(aep.a($$0.u()), aep.a($$0.v()), aep.a($$0.w()));
    }

    private static cnn a(MutableInt $$0, ddx $$1, drs $$2, he<cnk> $$3, Predicate<he<cnk>> $$4) {
        return ($$5, $$6, $$7, $$8) -> {
            int $$9 = hq.c($$5);
            int $$10 = hq.c($$6);
            int $$11 = hq.c($$7);
            he<cnk> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
            if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
                $$0.increment();
                return $$3;
            }
            return $$12;
        };
    }

    private static int a(ds $$0, gu $$1, gu $$2, he.c<cnk> $$3, Predicate<he<cnk>> $$4) throws CommandSyntaxException {
        int $$9;
        gu $$6;
        gu $$5 = aep.a($$1);
        drs $$7 = drs.a($$5, $$6 = aep.a($$2));
        int $$8 = $$7.c() * $$7.d() * $$7.e();
        if ($$8 > ($$9 = $$0.e().X().c(cmi.x))) {
            throw b.create((Object)$$9, (Object)$$8);
        }
        aif $$10 = $$0.e();
        ArrayList<ddx> $$11 = new ArrayList<ddx>();
        for (int $$12 = hx.a($$7.i()); $$12 <= hx.a($$7.l()); ++$$12) {
            for (int $$13 = hx.a($$7.g()); $$13 <= hx.a($$7.j()); ++$$13) {
                ddx $$14 = $$10.a($$13, $$12, dec.n, false);
                if ($$14 == null) {
                    throw a.create();
                }
                $$11.add($$14);
            }
        }
        MutableInt $$15 = new MutableInt(0);
        for (ddx $$16 : $$11) {
            $$16.a(aep.a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
        }
        $$10.k().a.a($$11);
        $$0.a(() -> sw.a("commands.fillbiome.success.count", $$15.getValue(), $$7.g(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l()), true);
        return $$15.getValue();
    }
}

