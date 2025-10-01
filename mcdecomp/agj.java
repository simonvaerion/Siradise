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
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agj {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.summon.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.summon.failed.uuid"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.summon.invalidPosition"));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0 -> $$0.c(2))).then(((RequiredArgumentBuilder)dt.a("entity", eo.a($$1, jc.s)).suggests(gk.d).executes($$0 -> agj.b((ds)$$0.getSource(), eo.e((CommandContext<ds>)$$0, "entity"), ((ds)$$0.getSource()).d(), new qr(), true))).then(((RequiredArgumentBuilder)dt.a("pos", fp.a()).executes($$0 -> agj.b((ds)$$0.getSource(), eo.e((CommandContext<ds>)$$0, "entity"), fp.a((CommandContext<ds>)$$0, "pos"), new qr(), true))).then(dt.a("nbt", dz.a()).executes($$0 -> agj.b((ds)$$0.getSource(), eo.e((CommandContext<ds>)$$0, "entity"), fp.a((CommandContext<ds>)$$0, "pos"), dz.a($$0, "nbt"), false))))));
    }

    public static bfj a(ds $$0, he.c<bfn<?>> $$12, eei $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
        gu $$5 = gu.a($$2);
        if (!cmm.k($$5)) {
            throw c.create();
        }
        qr $$6 = $$3.h();
        $$6.a("id", $$12.g().a().toString());
        aif $$7 = $$0.e();
        bfj $$8 = bfn.a($$6, $$7, $$1 -> {
            $$1.b($$0.c, $$0.d, $$0.e, $$1.dy(), $$1.dA());
            return $$1;
        });
        if ($$8 == null) {
            throw a.create();
        }
        if ($$4 && $$8 instanceof bgb) {
            ((bgb)$$8).a($$0.e(), $$0.e().d_($$8.di()), bgd.n, null, null);
        }
        if (!$$7.e($$8)) {
            throw b.create();
        }
        return $$8;
    }

    private static int b(ds $$0, he.c<bfn<?>> $$1, eei $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
        bfj $$5 = agj.a($$0, $$1, $$2, $$3, $$4);
        $$0.a(() -> sw.a("commands.summon.success", $$5.H_()), true);
        return 1;
    }
}

