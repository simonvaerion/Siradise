/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class agl {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.team.add.duplicate"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.team.empty.unchanged"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.name.unchanged"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.color.unchanged"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.friendlyfire.alreadyEnabled"));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.friendlyfire.alreadyDisabled"));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
    private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.nametagVisibility.unchanged"));
    private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.deathMessageVisibility.unchanged"));
    private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType((Message)sw.c("commands.team.option.collisionRule.unchanged"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("team").requires($$0 -> $$0.c(2))).then(((LiteralArgumentBuilder)dt.a("list").executes($$0 -> agl.a((ds)$$0.getSource()))).then(dt.a("team", ey.a()).executes($$0 -> agl.c((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team")))))).then(dt.a("add").then(((RequiredArgumentBuilder)dt.a("team", StringArgumentType.word()).executes($$0 -> agl.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"team")))).then(dt.a("displayName", dy.a()).executes($$0 -> agl.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"team"), dy.a((CommandContext<ds>)$$0, "displayName"))))))).then(dt.a("remove").then(dt.a("team", ey.a()).executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team")))))).then(dt.a("empty").then(dt.a("team", ey.a()).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team")))))).then(dt.a("join").then(((RequiredArgumentBuilder)dt.a("team", ey.a()).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), Collections.singleton(((ds)$$0.getSource()).g().cv())))).then(dt.a("members", et.b()).suggests(et.a).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), et.c((CommandContext<ds>)$$0, "members"))))))).then(dt.a("leave").then(dt.a("members", et.b()).suggests(et.a).executes($$0 -> agl.a((ds)$$0.getSource(), et.c((CommandContext<ds>)$$0, "members")))))).then(dt.a("modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("team", ey.a()).then(dt.a("displayName").then(dt.a("displayName", dy.a()).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), dy.a((CommandContext<ds>)$$0, "displayName")))))).then(dt.a("color").then(dt.a("value", dx.a()).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), dx.a((CommandContext<ds>)$$0, "value")))))).then(dt.a("friendlyFire").then(dt.a("allowed", BoolArgumentType.bool()).executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowed")))))).then(dt.a("seeFriendlyInvisibles").then(dt.a("allowed", BoolArgumentType.bool()).executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowed")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("nametagVisibility").then(dt.a("never").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.b)))).then(dt.a("hideForOtherTeams").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.c)))).then(dt.a("hideForOwnTeam").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.d)))).then(dt.a("always").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.a))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("deathMessageVisibility").then(dt.a("never").executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.b)))).then(dt.a("hideForOtherTeams").executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.c)))).then(dt.a("hideForOwnTeam").executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.d)))).then(dt.a("always").executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.b.a))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("collisionRule").then(dt.a("never").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.a.b)))).then(dt.a("pushOwnTeam").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.a.d)))).then(dt.a("pushOtherTeams").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.a.c)))).then(dt.a("always").executes($$0 -> agl.a((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), efi.a.a))))).then(dt.a("prefix").then(dt.a("prefix", dy.a()).executes($$0 -> agl.b((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), dy.a((CommandContext<ds>)$$0, "prefix")))))).then(dt.a("suffix").then(dt.a("suffix", dy.a()).executes($$0 -> agl.c((ds)$$0.getSource(), ey.a((CommandContext<ds>)$$0, "team"), dy.a((CommandContext<ds>)$$0, "suffix"))))))));
    }

    private static int a(ds $$0, Collection<String> $$1) {
        adg $$2 = $$0.l().aF();
        for (String $$3 : $$1) {
            $$2.h($$3);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.team.leave.success.single", $$1.iterator().next()), true);
        } else {
            $$0.a(() -> sw.a("commands.team.leave.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ds $$0, efe $$1, Collection<String> $$2) {
        adg $$3 = $$0.l().aF();
        for (String $$4 : $$2) {
            ((efg)$$3).a($$4, $$1);
        }
        if ($$2.size() == 1) {
            $$0.a(() -> sw.a("commands.team.join.success.single", $$2.iterator().next(), $$1.d()), true);
        } else {
            $$0.a(() -> sw.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
        }
        return $$2.size();
    }

    private static int a(ds $$0, efe $$1, efi.b $$2) throws CommandSyntaxException {
        if ($$1.j() == $$2) {
            throw i.create();
        }
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
        return 0;
    }

    private static int b(ds $$0, efe $$1, efi.b $$2) throws CommandSyntaxException {
        if ($$1.k() == $$2) {
            throw j.create();
        }
        $$1.b($$2);
        $$0.a(() -> sw.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
        return 0;
    }

    private static int a(ds $$0, efe $$1, efi.a $$2) throws CommandSyntaxException {
        if ($$1.l() == $$2) {
            throw k.create();
        }
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
        return 0;
    }

    private static int a(ds $$0, efe $$1, boolean $$2) throws CommandSyntaxException {
        if ($$1.i() == $$2) {
            if ($$2) {
                throw g.create();
            }
            throw h.create();
        }
        $$1.b($$2);
        $$0.a(() -> sw.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
        return 0;
    }

    private static int b(ds $$0, efe $$1, boolean $$2) throws CommandSyntaxException {
        if ($$1.h() == $$2) {
            if ($$2) {
                throw e.create();
            }
            throw f.create();
        }
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
        return 0;
    }

    private static int a(ds $$0, efe $$1, sw $$2) throws CommandSyntaxException {
        if ($$1.c().equals($$2)) {
            throw c.create();
        }
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.team.option.name.success", $$1.d()), true);
        return 0;
    }

    private static int a(ds $$0, efe $$1, n $$2) throws CommandSyntaxException {
        if ($$1.n() == $$2) {
            throw d.create();
        }
        $$1.a($$2);
        $$0.a(() -> sw.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
        return 0;
    }

    private static int a(ds $$0, efe $$1) throws CommandSyntaxException {
        adg $$2 = $$0.l().aF();
        ArrayList $$3 = Lists.newArrayList($$1.g());
        if ($$3.isEmpty()) {
            throw b.create();
        }
        for (String $$4 : $$3) {
            ((efg)$$2).b($$4, $$1);
        }
        $$0.a(() -> sw.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
        return $$3.size();
    }

    private static int b(ds $$0, efe $$1) {
        adg $$2 = $$0.l().aF();
        $$2.d($$1);
        $$0.a(() -> sw.a("commands.team.remove.success", $$1.d()), true);
        return $$2.g().size();
    }

    private static int a(ds $$0, String $$1) throws CommandSyntaxException {
        return agl.a($$0, $$1, (sw)sw.b($$1));
    }

    private static int a(ds $$0, String $$1, sw $$2) throws CommandSyntaxException {
        adg $$3 = $$0.l().aF();
        if ($$3.f($$1) != null) {
            throw a.create();
        }
        efe $$4 = $$3.g($$1);
        $$4.a($$2);
        $$0.a(() -> sw.a("commands.team.add.success", $$4.d()), true);
        return $$3.g().size();
    }

    private static int c(ds $$0, efe $$1) {
        Collection<String> $$2 = $$1.g();
        if ($$2.isEmpty()) {
            $$0.a(() -> sw.a("commands.team.list.members.empty", $$1.d()), false);
        } else {
            $$0.a(() -> sw.a("commands.team.list.members.success", $$1.d(), $$2.size(), sy.a($$2)), false);
        }
        return $$2.size();
    }

    private static int a(ds $$0) {
        Collection<efe> $$1 = $$0.l().aF().g();
        if ($$1.isEmpty()) {
            $$0.a(() -> sw.c("commands.team.list.teams.empty"), false);
        } else {
            $$0.a(() -> sw.a("commands.team.list.teams.success", $$1.size(), sy.b($$1, efe::d)), false);
        }
        return $$1.size();
    }

    private static int b(ds $$0, efe $$1, sw $$2) {
        $$1.b($$2);
        $$0.a(() -> sw.a("commands.team.option.prefix.success", $$2), false);
        return 1;
    }

    private static int c(ds $$0, efe $$1, sw $$2) {
        $$1.c($$2);
        $$0.a(() -> sw.a("commands.team.option.suffix.success", $$2), false);
        return 1;
    }
}

