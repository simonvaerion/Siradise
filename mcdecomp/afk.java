/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Optional;

public class afk {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.place.feature.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.place.jigsaw.failed"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.place.structure.failed"));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.place.template.invalid", $$0));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.place.template.failed"));
    private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
        dvu $$2 = ((ds)$$0.getSource()).e().p();
        return du.a($$2.a(), $$1);
    };

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("place").requires($$0 -> $$0.c(2))).then(dt.a("feature").then(((RequiredArgumentBuilder)dt.a("feature", ep.a(jc.as)).executes($$0 -> afk.a((ds)$$0.getSource(), ep.a((CommandContext<ds>)$$0, "feature"), gu.a(((ds)$$0.getSource()).d())))).then(dt.a("pos", fi.a()).executes($$0 -> afk.a((ds)$$0.getSource(), ep.a((CommandContext<ds>)$$0, "feature"), fi.a((CommandContext<ds>)$$0, "pos"))))))).then(dt.a("jigsaw").then(dt.a("pool", ep.a(jc.aC)).then(dt.a("target", eq.a()).then(((RequiredArgumentBuilder)dt.a("max_depth", IntegerArgumentType.integer((int)1, (int)7)).executes($$0 -> afk.a((ds)$$0.getSource(), ep.c((CommandContext<ds>)$$0, "pool"), eq.e((CommandContext<ds>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"max_depth"), gu.a(((ds)$$0.getSource()).d())))).then(dt.a("position", fi.a()).executes($$0 -> afk.a((ds)$$0.getSource(), ep.c((CommandContext<ds>)$$0, "pool"), eq.e((CommandContext<ds>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"max_depth"), fi.a((CommandContext<ds>)$$0, "position"))))))))).then(dt.a("structure").then(((RequiredArgumentBuilder)dt.a("structure", ep.a(jc.az)).executes($$0 -> afk.b((ds)$$0.getSource(), ep.b((CommandContext<ds>)$$0, "structure"), gu.a(((ds)$$0.getSource()).d())))).then(dt.a("pos", fi.a()).executes($$0 -> afk.b((ds)$$0.getSource(), ep.b((CommandContext<ds>)$$0, "structure"), fi.a((CommandContext<ds>)$$0, "pos"))))))).then(dt.a("template").then(((RequiredArgumentBuilder)dt.a("template", eq.a()).suggests(f).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), gu.a(((ds)$$0.getSource()).d()), cvz.a, cui.a, 1.0f, 0))).then(((RequiredArgumentBuilder)dt.a("pos", fi.a()).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), fi.a((CommandContext<ds>)$$0, "pos"), cvz.a, cui.a, 1.0f, 0))).then(((RequiredArgumentBuilder)dt.a("rotation", fa.a()).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), fi.a((CommandContext<ds>)$$0, "pos"), fa.a((CommandContext<ds>)$$0, "rotation"), cui.a, 1.0f, 0))).then(((RequiredArgumentBuilder)dt.a("mirror", ez.a()).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), fi.a((CommandContext<ds>)$$0, "pos"), fa.a((CommandContext<ds>)$$0, "rotation"), ez.a((CommandContext<ds>)$$0, "mirror"), 1.0f, 0))).then(((RequiredArgumentBuilder)dt.a("integrity", FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), fi.a((CommandContext<ds>)$$0, "pos"), fa.a((CommandContext<ds>)$$0, "rotation"), ez.a((CommandContext<ds>)$$0, "mirror"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"integrity"), 0))).then(dt.a("seed", IntegerArgumentType.integer()).executes($$0 -> afk.a((ds)$$0.getSource(), eq.e((CommandContext<ds>)$$0, "template"), fi.a((CommandContext<ds>)$$0, "pos"), fa.a((CommandContext<ds>)$$0, "rotation"), ez.a((CommandContext<ds>)$$0, "mirror"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"integrity"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed")))))))))));
    }

    public static int a(ds $$0, he.c<dkb<?, ?>> $$1, gu $$2) throws CommandSyntaxException {
        aif $$3 = $$0.e();
        dkb<?, ?> $$4 = $$1.a();
        clt $$5 = new clt($$2);
        afk.a($$3, new clt($$5.e - 1, $$5.f - 1), new clt($$5.e + 1, $$5.f + 1));
        if (!$$4.a($$3, $$3.k().g(), $$3.y_(), $$2)) {
            throw a.create();
        }
        String $$6 = $$1.g().a().toString();
        $$0.a(() -> sw.a("commands.place.feature.success", new Object[]{$$6, $$2.u(), $$2.v(), $$2.w()}), true);
        return 1;
    }

    public static int a(ds $$0, he<dtj> $$1, acq $$2, int $$3, gu $$4) throws CommandSyntaxException {
        aif $$5 = $$0.e();
        if (!dtd.a($$5, $$1, $$2, $$3, $$4, false)) {
            throw b.create();
        }
        $$0.a(() -> sw.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
        return 1;
    }

    public static int b(ds $$02, he.c<dsa> $$1, gu $$2) throws CommandSyntaxException {
        aif $$32 = $$02.e();
        dsa $$4 = $$1.a();
        ddy $$5 = $$32.k().g();
        dsi $$6 = $$4.a($$02.v(), $$5, $$5.c(), $$32.k().i(), $$32.p(), $$32.A(), new clt($$2), 0, $$32, $$0 -> true);
        if (!$$6.b()) {
            throw c.create();
        }
        drs $$7 = $$6.a();
        clt $$8 = new clt(hx.a($$7.g()), hx.a($$7.i()));
        clt $$9 = new clt(hx.a($$7.j()), hx.a($$7.l()));
        afk.a($$32, $$8, $$9);
        clt.a($$8, $$9).forEach($$3 -> $$6.a($$32, $$32.a(), $$5, $$32.y_(), new drs($$3.d(), $$32.C_(), $$3.e(), $$3.f(), $$32.aj(), $$3.g()), (clt)$$3));
        String $$10 = $$1.g().a().toString();
        $$02.a(() -> sw.a("commands.place.structure.success", new Object[]{$$10, $$2.u(), $$2.v(), $$2.w()}), true);
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public static int a(ds $$0, acq $$1, gu $$2, cvz $$3, cui $$4, float $$5, int $$6) throws CommandSyntaxException {
        boolean $$14;
        void $$11;
        aif $$7 = $$0.e();
        dvu $$8 = $$7.p();
        try {
            Optional<dvt> $$9 = $$8.b($$1);
        }
        catch (z $$10) {
            throw d.create((Object)$$1);
        }
        if ($$11.isEmpty()) {
            throw d.create((Object)$$1);
        }
        dvt $$12 = (dvt)$$11.get();
        afk.a($$7, new clt($$2), new clt($$2.a($$12.a())));
        dvp $$13 = new dvp().a($$4).a($$3);
        if ($$5 < 1.0f) {
            $$13.b().a(new dux($$5)).a(dba.b($$6));
        }
        if (!($$14 = $$12.a($$7, $$2, $$2, $$13, dba.b($$6), 2))) {
            throw e.create();
        }
        $$0.a(() -> sw.a("commands.place.template.success", $$1, $$2.u(), $$2.v(), $$2.w()), true);
        return 1;
    }

    private static void a(aif $$0, clt $$12, clt $$2) throws CommandSyntaxException {
        if (clt.a($$12, $$2).filter($$1 -> !$$0.o($$1.l())).findAny().isPresent()) {
            throw fi.a.create();
        }
    }
}

