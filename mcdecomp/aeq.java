/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aeq {
    private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.fill.toobig", $$0, $$1));
    static final fd b = new fd(cpo.a.n(), Collections.emptySet(), null);
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.fill.failed"));

    public static void a(CommandDispatcher<ds> $$03, dm $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fill").requires($$0 -> $$0.c(2))).then(dt.a("from", fi.a()).then(dt.a("to", fi.a()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("block", ff.a($$1)).executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.a, null))).then(((LiteralArgumentBuilder)dt.a("replace").executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.a, null))).then(dt.a("filter", fe.a($$1)).executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.a, fe.a((CommandContext<ds>)$$0, "filter")))))).then(dt.a("keep").executes($$02 -> aeq.a((ds)$$02.getSource(), drs.a(fi.a((CommandContext<ds>)$$02, "from"), fi.a((CommandContext<ds>)$$02, "to")), ff.a((CommandContext<ds>)$$02, "block"), aeq$a.a, $$0 -> $$0.c().t($$0.d()))))).then(dt.a("outline").executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.b, null)))).then(dt.a("hollow").executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.c, null)))).then(dt.a("destroy").executes($$0 -> aeq.a((ds)$$0.getSource(), drs.a(fi.a((CommandContext<ds>)$$0, "from"), fi.a((CommandContext<ds>)$$0, "to")), ff.a((CommandContext<ds>)$$0, "block"), aeq$a.d, null)))))));
    }

    private static int a(ds $$0, drs $$1, fd $$2, a $$3, @Nullable Predicate<dcf> $$4) throws CommandSyntaxException {
        int $$6;
        int $$5 = $$1.c() * $$1.d() * $$1.e();
        if ($$5 > ($$6 = $$0.e().X().c(cmi.x))) {
            throw a.create((Object)$$6, (Object)$$5);
        }
        ArrayList $$7 = Lists.newArrayList();
        aif $$8 = $$0.e();
        int $$9 = 0;
        for (gu $$10 : gu.b($$1.g(), $$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l())) {
            fd $$11;
            if ($$4 != null && !$$4.test(new dcf($$8, $$10, true)) || ($$11 = $$3.e.filter($$1, $$10, $$2, $$8)) == null) continue;
            czn $$12 = $$8.c_($$10);
            bdo.a_($$12);
            if (!$$11.a($$8, $$10, 2)) continue;
            $$7.add($$10.i());
            ++$$9;
        }
        for (gu $$13 : $$7) {
            cpn $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
        }
        if ($$9 == 0) {
            throw c.create();
        }
        int $$15 = $$9;
        $$0.a(() -> sw.a("commands.fill.success", $$15), true);
        return $$9;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(($$0, $$1, $$2, $$3) -> $$2);
        public static final /* enum */ a b = new a(($$0, $$1, $$2, $$3) -> {
            if ($$1.u() == $$0.g() || $$1.u() == $$0.j() || $$1.v() == $$0.h() || $$1.v() == $$0.k() || $$1.w() == $$0.i() || $$1.w() == $$0.l()) {
                return $$2;
            }
            return null;
        });
        public static final /* enum */ a c = new a(($$0, $$1, $$2, $$3) -> {
            if ($$1.u() == $$0.g() || $$1.u() == $$0.j() || $$1.v() == $$0.h() || $$1.v() == $$0.k() || $$1.w() == $$0.i() || $$1.w() == $$0.l()) {
                return $$2;
            }
            return b;
        });
        public static final /* enum */ a d = new a(($$0, $$1, $$2, $$3) -> {
            $$3.b($$1, true);
            return $$2;
        });
        public final aga.a e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(aga.a $$0) {
            this.e = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            f = aeq$a.a();
        }
    }
}

