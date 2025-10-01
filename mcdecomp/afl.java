/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class afl {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.playsound.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        RequiredArgumentBuilder $$1 = dt.a("sound", eq.a()).suggests(gk.c);
        for (ami $$2 : ami.values()) {
            $$1.then(afl.a($$2));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("playsound").requires($$0 -> $$0.c(2))).then((ArgumentBuilder)$$1));
    }

    private static LiteralArgumentBuilder<ds> a(ami $$0) {
        return (LiteralArgumentBuilder)dt.a($$0.a()).then(((RequiredArgumentBuilder)dt.a("targets", ec.d()).executes($$1 -> afl.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), eq.e((CommandContext<ds>)$$1, "sound"), $$0, ((ds)$$1.getSource()).d(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)dt.a("pos", fp.a()).executes($$1 -> afl.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), eq.e((CommandContext<ds>)$$1, "sound"), $$0, fp.a((CommandContext<ds>)$$1, "pos"), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)dt.a("volume", FloatArgumentType.floatArg((float)0.0f)).executes($$1 -> afl.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), eq.e((CommandContext<ds>)$$1, "sound"), $$0, fp.a((CommandContext<ds>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), 1.0f, 0.0f))).then(((RequiredArgumentBuilder)dt.a("pitch", FloatArgumentType.floatArg((float)0.0f, (float)2.0f)).executes($$1 -> afl.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), eq.e((CommandContext<ds>)$$1, "sound"), $$0, fp.a((CommandContext<ds>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), ((Float)$$1.getArgument("pitch", Float.class)).floatValue(), 0.0f))).then(dt.a("minVolume", FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes($$1 -> afl.a((ds)$$1.getSource(), ec.f((CommandContext<ds>)$$1, "targets"), eq.e((CommandContext<ds>)$$1, "sound"), $$0, fp.a((CommandContext<ds>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), ((Float)$$1.getArgument("pitch", Float.class)).floatValue(), ((Float)$$1.getArgument("minVolume", Float.class)).floatValue())))))));
    }

    private static int a(ds $$0, Collection<aig> $$1, acq $$2, ami $$3, eei $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
        he<amg> $$8 = he.a(amg.a($$2));
        double $$9 = apa.k($$8.a().a($$5));
        int $$10 = 0;
        long $$11 = $$0.e().y_().g();
        for (aig $$12 : $$1) {
            double $$13 = $$4.c - $$12.dn();
            double $$14 = $$4.d - $$12.dp();
            double $$15 = $$4.e - $$12.dt();
            double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
            eei $$17 = $$4;
            float $$18 = $$5;
            if ($$16 > $$9) {
                if ($$7 <= 0.0f) continue;
                double $$19 = Math.sqrt($$16);
                $$17 = new eei($$12.dn() + $$13 / $$19 * 2.0, $$12.dp() + $$14 / $$19 * 2.0, $$12.dt() + $$15 / $$19 * 2.0);
                $$18 = $$7;
            }
            $$12.c.a(new ym($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
            ++$$10;
        }
        if ($$10 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.playsound.success.single", $$2, ((aig)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.playsound.success.multiple", $$2, $$1.size()), true);
        }
        return $$10;
    }
}

