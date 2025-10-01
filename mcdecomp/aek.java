/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class aek {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.effect.give.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.effect.clear.everything.failed"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.effect.clear.specific.failed"));

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("effect").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)dt.a("clear").executes($$0 -> aek.a((ds)$$0.getSource(), (Collection<? extends bfj>)ImmutableList.of((Object)((ds)$$0.getSource()).g())))).then(((RequiredArgumentBuilder)dt.a("targets", ec.b()).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets")))).then(dt.a("effect", eo.a($$1, jc.O)).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"))))))).then(dt.a("give").then(dt.a("targets", ec.b()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("effect", eo.a($$1, jc.O)).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), null, 0, true))).then(((RequiredArgumentBuilder)dt.a("seconds", IntegerArgumentType.integer((int)1, (int)1000000)).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), 0, true))).then(((RequiredArgumentBuilder)dt.a("amplifier", IntegerArgumentType.integer((int)0, (int)255)).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), true))).then(dt.a("hideParticles", BoolArgumentType.bool()).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)$$0, (String)"hideParticles"))))))).then(((LiteralArgumentBuilder)dt.a("infinite").executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), -1, 0, true))).then(((RequiredArgumentBuilder)dt.a("amplifier", IntegerArgumentType.integer((int)0, (int)255)).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), -1, IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), true))).then(dt.a("hideParticles", BoolArgumentType.bool()).executes($$0 -> aek.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), eo.f((CommandContext<ds>)$$0, "effect"), -1, IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)$$0, (String)"hideParticles"))))))))));
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, he<bey> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
        int $$12;
        bey $$6 = $$2.a();
        int $$7 = 0;
        if ($$3 != null) {
            if ($$6.a()) {
                int $$8 = $$3;
            } else if ($$3 == -1) {
                int $$9 = -1;
            } else {
                int $$10 = $$3 * 20;
            }
        } else if ($$6.a()) {
            boolean $$11 = true;
        } else {
            $$12 = 600;
        }
        for (bfj bfj2 : $$1) {
            bfa $$14;
            if (!(bfj2 instanceof bfz) || !((bfz)bfj2).b($$14 = new bfa($$6, $$12, $$4, false, $$5), $$0.f())) continue;
            ++$$7;
        }
        if ($$7 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.give.success.single", $$6.e(), ((bfj)$$1.iterator().next()).H_(), $$12 / 20), true);
        } else {
            $$0.a(() -> sw.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$12 / 20), true);
        }
        return $$7;
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1) throws CommandSyntaxException {
        int $$2 = 0;
        for (bfj bfj2 : $$1) {
            if (!(bfj2 instanceof bfz) || !((bfz)bfj2).en()) continue;
            ++$$2;
        }
        if ($$2 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.clear.everything.success.single", ((bfj)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
        }
        return $$2;
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, he<bey> $$2) throws CommandSyntaxException {
        bey $$3 = $$2.a();
        int $$4 = 0;
        for (bfj bfj2 : $$1) {
            if (!(bfj2 instanceof bfz) || !((bfz)bfj2).d($$3)) continue;
            ++$$4;
        }
        if ($$4 == 0) {
            throw c.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.clear.specific.success.single", $$3.e(), ((bfj)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
        }
        return $$4;
    }
}

