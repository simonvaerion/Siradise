/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class aeo {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.experience.set.points.invalid"));

    public static void a(CommandDispatcher<ds> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("experience").requires($$0 -> $$0.c(2))).then(dt.a("add").then(dt.a("targets", ec.d()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer()).executes($$0 -> aeo.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.a))).then(dt.a("points").executes($$0 -> aeo.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.a)))).then(dt.a("levels").executes($$0 -> aeo.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.b))))))).then(dt.a("set").then(dt.a("targets", ec.d()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer((int)0)).executes($$0 -> aeo.b((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.a))).then(dt.a("points").executes($$0 -> aeo.b((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.a)))).then(dt.a("levels").executes($$0 -> aeo.b((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aeo$a.b))))))).then(dt.a("query").then(((RequiredArgumentBuilder)dt.a("targets", ec.c()).then(dt.a("points").executes($$0 -> aeo.a((ds)$$0.getSource(), ec.e((CommandContext<ds>)$$0, "targets"), aeo$a.a)))).then(dt.a("levels").executes($$0 -> aeo.a((ds)$$0.getSource(), ec.e((CommandContext<ds>)$$0, "targets"), aeo$a.b))))));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("xp").requires($$0 -> $$0.c(2))).redirect((CommandNode)$$1));
    }

    private static int a(ds $$0, aig $$1, a $$2) {
        int $$3 = $$2.f.applyAsInt($$1);
        $$0.a(() -> sw.a("commands.experience.query." + $$0.e, $$1.H_(), $$3), false);
        return $$3;
    }

    private static int a(ds $$0, Collection<? extends aig> $$1, int $$2, a $$3) {
        for (aig aig2 : $$1) {
            $$3.c.accept(aig2, $$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.experience.add." + $$0.e + ".success.single", $$1, ((aig)$$2.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.experience.add." + $$0.e + ".success.multiple", $$1, $$2.size()), true);
        }
        return $$1.size();
    }

    private static int b(ds $$0, Collection<? extends aig> $$1, int $$2, a $$3) throws CommandSyntaxException {
        int $$4 = 0;
        for (aig aig2 : $$1) {
            if (!$$3.d.test(aig2, $$2)) continue;
            ++$$4;
        }
        if ($$4 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.experience.set." + $$0.e + ".success.single", $$1, ((aig)$$2.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a("commands.experience.set." + $$0.e + ".success.multiple", $$1, $$2.size()), true);
        }
        return $$1.size();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("points", byo::d, ($$0, $$1) -> {
            if ($$1 >= $$0.fW()) {
                return false;
            }
            $$0.a((int)$$1);
            return true;
        }, $$0 -> apa.d($$0.cg * (float)$$0.fW()));
        public static final /* enum */ a b = new a("levels", aig::c, ($$0, $$1) -> {
            $$0.b((int)$$1);
            return true;
        }, $$0 -> $$0.ce);
        public final BiConsumer<aig, Integer> c;
        public final BiPredicate<aig, Integer> d;
        public final String e;
        final ToIntFunction<aig> f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, BiConsumer<aig, Integer> $$1, BiPredicate<aig, Integer> $$2, ToIntFunction<aig> $$3) {
            this.c = $$1;
            this.e = $$0;
            this.d = $$2;
            this.f = $$3;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            g = aeo$a.a();
        }
    }
}

