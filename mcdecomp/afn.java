/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import javax.annotation.Nullable;

public class afn {
    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("raid").requires($$0 -> $$0.c(3))).then(dt.a("start").then(dt.a("omenlvl", IntegerArgumentType.integer((int)0)).executes($$0 -> afn.b((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"omenlvl")))))).then(dt.a("stop").executes($$0 -> afn.c((ds)$$0.getSource())))).then(dt.a("check").executes($$0 -> afn.d((ds)$$0.getSource())))).then(dt.a("sound").then(dt.a("type", dy.a()).executes($$0 -> afn.a((ds)$$0.getSource(), dy.a((CommandContext<ds>)$$0, "type")))))).then(dt.a("spawnleader").executes($$0 -> afn.b((ds)$$0.getSource())))).then(dt.a("setomen").then(dt.a("level", IntegerArgumentType.integer((int)0)).executes($$0 -> afn.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"level")))))).then(dt.a("glow").executes($$0 -> afn.a((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) throws CommandSyntaxException {
        bzv $$1 = afn.a($$0.h());
        if ($$1 != null) {
            Set<bzw> $$2 = $$1.h();
            for (bzw $$3 : $$2) {
                $$3.b(new bfa(bfc.x, 1000, 1));
            }
        }
        return 1;
    }

    private static int a(ds $$0, int $$1) throws CommandSyntaxException {
        bzv $$2 = afn.a($$0.h());
        if ($$2 != null) {
            int $$3 = $$2.l();
            if ($$1 > $$3) {
                $$0.b(sw.b("Sorry, the max bad omen level you can set is " + $$3));
            } else {
                int $$4 = $$2.m();
                $$2.a($$1);
                $$0.a(() -> sw.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
            }
        } else {
            $$0.b(sw.b("No raid found here"));
        }
        return 1;
    }

    private static int b(ds $$0) {
        $$0.a(() -> sw.b("Spawned a raid captain"), false);
        bzw $$1 = bfn.ay.a($$0.e());
        if ($$1 == null) {
            $$0.b(sw.b("Pillager failed to spawn"));
            return 0;
        }
        $$1.w(true);
        $$1.a(bfo.f, bzv.s());
        $$1.e($$0.d().c, $$0.d().d, $$0.d().e);
        $$1.a($$0.e(), $$0.e().d_(gu.a($$0.d())), bgd.n, null, null);
        $$0.e().a_($$1);
        return 1;
    }

    private static int a(ds $$0, @Nullable sw $$1) {
        if ($$1 != null && $$1.getString().equals("local")) {
            aif $$2 = $$0.e();
            eei $$3 = $$0.d().b(5.0, 0.0, 0.0);
            $$2.a(null, $$3.c, $$3.d, $$3.e, amh.tp, ami.g, 2.0f, 1.0f, $$2.z.g());
        }
        return 1;
    }

    private static int b(ds $$0, int $$1) throws CommandSyntaxException {
        aig $$2 = $$0.h();
        gu $$3 = $$2.di();
        if ($$2.x().d($$3)) {
            $$0.b(sw.b("Raid already started close by"));
            return -1;
        }
        bzx $$4 = $$2.x().x();
        bzv $$5 = $$4.a($$2);
        if ($$5 != null) {
            $$5.a($$1);
            $$4.b();
            $$0.a(() -> sw.b("Created a raid in your local village"), false);
        } else {
            $$0.b(sw.b("Failed to create a raid in your local village"));
        }
        return 1;
    }

    private static int c(ds $$0) throws CommandSyntaxException {
        aig $$1 = $$0.h();
        gu $$2 = $$1.di();
        bzv $$3 = $$1.x().c($$2);
        if ($$3 != null) {
            $$3.n();
            $$0.a(() -> sw.b("Stopped raid"), false);
            return 1;
        }
        $$0.b(sw.b("No raid here"));
        return -1;
    }

    private static int d(ds $$0) throws CommandSyntaxException {
        bzv $$1 = afn.a($$0.h());
        if ($$1 != null) {
            StringBuilder $$2 = new StringBuilder();
            $$2.append("Found a started raid! ");
            $$0.a(() -> sw.b($$2.toString()), false);
            StringBuilder $$3 = new StringBuilder();
            $$3.append("Num groups spawned: ");
            $$3.append($$1.k());
            $$3.append(" Bad omen level: ");
            $$3.append($$1.m());
            $$3.append(" Num mobs: ");
            $$3.append($$1.r());
            $$3.append(" Raid health: ");
            $$3.append($$1.q());
            $$3.append(" / ");
            $$3.append($$1.g());
            $$0.a(() -> sw.b($$3.toString()), false);
            return 1;
        }
        $$0.b(sw.b("Found no started raids"));
        return 0;
    }

    @Nullable
    private static bzv a(aig $$0) {
        return $$0.x().c($$0.di());
    }
}

