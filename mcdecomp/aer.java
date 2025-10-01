/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class aer {
    private static final int a = 256;
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.forceload.toobig", $$0, $$1));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.forceload.query.failure", $$0, $$1));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.forceload.added.failure"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.forceload.removed.failure"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("forceload").requires($$0 -> $$0.c(2))).then(dt.a("add").then(((RequiredArgumentBuilder)dt.a("from", fj.a()).executes($$0 -> aer.a((ds)$$0.getSource(), fj.a((CommandContext<ds>)$$0, "from"), fj.a((CommandContext<ds>)$$0, "from"), true))).then(dt.a("to", fj.a()).executes($$0 -> aer.a((ds)$$0.getSource(), fj.a((CommandContext<ds>)$$0, "from"), fj.a((CommandContext<ds>)$$0, "to"), true)))))).then(((LiteralArgumentBuilder)dt.a("remove").then(((RequiredArgumentBuilder)dt.a("from", fj.a()).executes($$0 -> aer.a((ds)$$0.getSource(), fj.a((CommandContext<ds>)$$0, "from"), fj.a((CommandContext<ds>)$$0, "from"), false))).then(dt.a("to", fj.a()).executes($$0 -> aer.a((ds)$$0.getSource(), fj.a((CommandContext<ds>)$$0, "from"), fj.a((CommandContext<ds>)$$0, "to"), false))))).then(dt.a("all").executes($$0 -> aer.b((ds)$$0.getSource()))))).then(((LiteralArgumentBuilder)dt.a("query").executes($$0 -> aer.a((ds)$$0.getSource()))).then(dt.a("pos", fj.a()).executes($$0 -> aer.a((ds)$$0.getSource(), fj.a((CommandContext<ds>)$$0, "pos"))))));
    }

    private static int a(ds $$0, ahv $$1) throws CommandSyntaxException {
        clt $$2 = $$1.a();
        aif $$3 = $$0.e();
        acp<cmm> $$4 = $$3.ac();
        boolean $$5 = $$3.u().contains($$2.a());
        if ($$5) {
            $$0.a(() -> sw.a("commands.forceload.query.success", $$2, $$4.a()), false);
            return 1;
        }
        throw c.create((Object)$$2, (Object)$$4.a());
    }

    private static int a(ds $$0) {
        aif $$1 = $$0.e();
        acp<cmm> $$2 = $$1.ac();
        LongSet $$3 = $$1.u();
        int $$4 = $$3.size();
        if ($$4 > 0) {
            String $$5 = Joiner.on((String)", ").join($$3.stream().sorted().map(clt::new).map(clt::toString).iterator());
            if ($$4 == 1) {
                $$0.a(() -> sw.a("commands.forceload.list.single", $$2.a(), $$5), false);
            } else {
                $$0.a(() -> sw.a("commands.forceload.list.multiple", $$4, $$2.a(), $$5), false);
            }
        } else {
            $$0.b(sw.a("commands.forceload.added.none", $$2.a()));
        }
        return $$4;
    }

    private static int b(ds $$0) {
        aif $$12 = $$0.e();
        acp<cmm> $$2 = $$12.ac();
        LongSet $$3 = $$12.u();
        $$3.forEach($$1 -> $$12.a(clt.a($$1), clt.b($$1), false));
        $$0.a(() -> sw.a("commands.forceload.removed.all", $$2.a()), true);
        return 0;
    }

    private static int a(ds $$0, ahv $$1, ahv $$2, boolean $$3) throws CommandSyntaxException {
        int $$11;
        int $$4 = Math.min($$1.c(), $$2.c());
        int $$5 = Math.min($$1.d(), $$2.d());
        int $$6 = Math.max($$1.c(), $$2.c());
        int $$7 = Math.max($$1.d(), $$2.d());
        if ($$4 < -30000000 || $$5 < -30000000 || $$6 >= 30000000 || $$7 >= 30000000) {
            throw fi.b.create();
        }
        int $$8 = hx.a($$4);
        int $$9 = hx.a($$5);
        int $$10 = hx.a($$6);
        long $$12 = ((long)($$10 - $$8) + 1L) * ((long)(($$11 = hx.a($$7)) - $$9) + 1L);
        if ($$12 > 256L) {
            throw b.create((Object)256, (Object)$$12);
        }
        aif $$13 = $$0.e();
        acp<cmm> $$14 = $$13.ac();
        clt $$15 = null;
        int $$16 = 0;
        for (int $$17 = $$8; $$17 <= $$10; ++$$17) {
            for (int $$18 = $$9; $$18 <= $$11; ++$$18) {
                boolean $$19 = $$13.a($$17, $$18, $$3);
                if (!$$19) continue;
                ++$$16;
                if ($$15 != null) continue;
                $$15 = new clt($$17, $$18);
            }
        }
        clt $$20 = $$15;
        if ($$16 == 0) {
            throw ($$3 ? d : e).create();
        }
        if ($$16 == 1) {
            $$0.a(() -> sw.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", $$20, $$14.a()), true);
        } else {
            clt $$21 = new clt($$8, $$9);
            clt $$22 = new clt($$10, $$11);
            $$0.a(() -> sw.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$20, $$14.a(), $$21, $$22), true);
        }
        return $$16;
    }
}

