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
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public class agn {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.teleport.invalidPosition"));

    public static void a(CommandDispatcher<ds> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("teleport").requires($$0 -> $$0.c(2))).then(dt.a("location", fp.a()).executes($$0 -> agn.a((ds)$$0.getSource(), Collections.singleton(((ds)$$0.getSource()).g()), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), fr.d(), null)))).then(dt.a("destination", ec.a()).executes($$0 -> agn.a((ds)$$0.getSource(), Collections.singleton(((ds)$$0.getSource()).g()), ec.a((CommandContext<ds>)$$0, "destination"))))).then(((RequiredArgumentBuilder)dt.a("targets", ec.b()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("location", fp.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), null, null))).then(dt.a("rotation", fm.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), fm.a((CommandContext<ds>)$$0, "rotation"), null)))).then(((LiteralArgumentBuilder)dt.a("facing").then(dt.a("entity").then(((RequiredArgumentBuilder)dt.a("facingEntity", ec.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), null, new a(ec.a((CommandContext<ds>)$$0, "facingEntity"), eb.a.a)))).then(dt.a("facingAnchor", eb.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), null, new a(ec.a((CommandContext<ds>)$$0, "facingEntity"), eb.a((CommandContext<ds>)$$0, "facingAnchor")))))))).then(dt.a("facingLocation", fp.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ((ds)$$0.getSource()).e(), fp.b((CommandContext<ds>)$$0, "location"), null, new a(fp.a((CommandContext<ds>)$$0, "facingLocation")))))))).then(dt.a("destination", ec.a()).executes($$0 -> agn.a((ds)$$0.getSource(), ec.b((CommandContext<ds>)$$0, "targets"), ec.a((CommandContext<ds>)$$0, "destination"))))));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tp").requires($$0 -> $$0.c(2))).redirect((CommandNode)$$1));
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, bfj $$2) throws CommandSyntaxException {
        for (bfj bfj2 : $$1) {
            agn.a($$0, bfj2, (aif)$$2.dI(), $$2.dn(), $$2.dp(), $$2.dt(), EnumSet.noneOf(bgn.class), $$2.dy(), $$2.dA(), null);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.teleport.success.entity.single", ((bfj)$$2.iterator().next()).H_(), $$2.H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.teleport.success.entity.multiple", $$2.size(), $$2.H_()), true);
        }
        return $$1.size();
    }

    private static int a(ds $$0, Collection<? extends bfj> $$1, aif $$2, fk $$3, @Nullable fk $$4, @Nullable a $$5) throws CommandSyntaxException {
        eei $$6 = $$3.a($$0);
        eeh $$7 = $$4 == null ? null : $$4.b($$0);
        EnumSet<bgn> $$8 = EnumSet.noneOf(bgn.class);
        if ($$3.a()) {
            $$8.add(bgn.a);
        }
        if ($$3.b()) {
            $$8.add(bgn.b);
        }
        if ($$3.c()) {
            $$8.add(bgn.c);
        }
        if ($$4 == null) {
            $$8.add(bgn.e);
            $$8.add(bgn.d);
        } else {
            if ($$4.a()) {
                $$8.add(bgn.e);
            }
            if ($$4.b()) {
                $$8.add(bgn.d);
            }
        }
        for (bfj bfj2 : $$1) {
            if ($$4 == null) {
                agn.a($$0, bfj2, $$2, $$6.c, $$6.d, $$6.e, $$8, bfj2.dy(), bfj2.dA(), $$5);
                continue;
            }
            agn.a($$0, bfj2, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.teleport.success.location.single", ((bfj)$$6.iterator().next()).H_(), agn.a($$1.c), agn.a($$1.d), agn.a($$1.e)), true);
        } else {
            $$0.a(() -> sw.a("commands.teleport.success.location.multiple", $$6.size(), agn.a($$1.c), agn.a($$1.d), agn.a($$1.e)), true);
        }
        return $$1.size();
    }

    private static String a(double $$0) {
        return String.format(Locale.ROOT, "%f", $$0);
    }

    private static void a(ds $$0, bfj $$1, aif $$2, double $$3, double $$4, double $$5, Set<bgn> $$6, float $$7, float $$8, @Nullable a $$9) throws CommandSyntaxException {
        bfz $$13;
        float $$12;
        gu $$10 = gu.a($$3, $$4, $$5);
        if (!cmm.k($$10)) {
            throw a.create();
        }
        float $$11 = apa.g($$7);
        if (!$$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12 = apa.g($$8))) {
            return;
        }
        if ($$9 != null) {
            $$9.a($$0, $$1);
        }
        if (!($$1 instanceof bfz) || !($$13 = (bfz)$$1).fr()) {
            $$1.f($$1.dl().d(1.0, 0.0, 1.0));
            $$1.c(true);
        }
        if ($$1 instanceof bgi) {
            bgi $$14 = (bgi)$$1;
            $$14.J().n();
        }
    }

    static class a {
        private final eei a;
        private final bfj b;
        private final eb.a c;

        public a(bfj $$0, eb.a $$1) {
            this.b = $$0;
            this.c = $$1;
            this.a = $$1.a($$0);
        }

        public a(eei $$0) {
            this.b = null;
            this.a = $$0;
            this.c = null;
        }

        public void a(ds $$0, bfj $$1) {
            if (this.b != null) {
                if ($$1 instanceof aig) {
                    ((aig)$$1).a($$0.m(), this.b, this.c);
                } else {
                    $$1.a($$0.m(), this.a);
                }
            } else {
                $$1.a($$0.m(), this.a);
            }
        }
    }
}

