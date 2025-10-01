/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.ArgumentBuilder
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
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aeb {
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.clone.overlap"));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.clone.toobig", $$0, $$1));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.clone.failed"));
    public static final Predicate<dcf> a = $$0 -> !$$0.a().i();

    public static void a(CommandDispatcher<ds> $$02, dm $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0 -> $$0.c(2))).then(aeb.a($$1, (CommandContext<ds> $$0) -> ((ds)$$0.getSource()).e()))).then(dt.a("from").then(dt.a("sourceDimension", ea.a()).then(aeb.a($$1, (CommandContext<ds> $$0) -> ea.a((CommandContext<ds>)$$0, "sourceDimension"))))));
    }

    private static ArgumentBuilder<ds, ?> a(dm $$02, b<CommandContext<ds>, aif> $$1) {
        return dt.a("begin", fi.a()).then(((RequiredArgumentBuilder)dt.a("end", fi.a()).then(aeb.a($$02, $$1, (CommandContext<ds> $$0) -> ((ds)$$0.getSource()).e()))).then(dt.a("to").then(dt.a("targetDimension", ea.a()).then(aeb.a($$02, $$1, (CommandContext<ds> $$0) -> ea.a((CommandContext<ds>)$$0, "targetDimension"))))));
    }

    private static c a(CommandContext<ds> $$0, aif $$1, String $$2) throws CommandSyntaxException {
        gu $$3 = fi.a($$0, $$1, $$2);
        return new c($$1, $$3);
    }

    private static ArgumentBuilder<ds, ?> a(dm $$03, b<CommandContext<ds>, aif> $$12, b<CommandContext<ds>, aif> $$2) {
        b<CommandContext<ds>, c> $$32 = $$1 -> aeb.a((CommandContext<ds>)$$1, (aif)$$12.apply((CommandContext<ds>)$$1), "begin");
        b<CommandContext<ds>, c> $$4 = $$1 -> aeb.a((CommandContext<ds>)$$1, (aif)$$12.apply((CommandContext<ds>)$$1), "end");
        b<CommandContext<ds>, c> $$5 = $$1 -> aeb.a((CommandContext<ds>)$$1, (aif)$$2.apply((CommandContext<ds>)$$1), "destination");
        return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fi.a()).executes($$3 -> aeb.a((ds)$$3.getSource(), (c)$$32.apply($$3), (c)$$4.apply($$3), (c)$$5.apply($$3), $$0 -> true, aeb$d.c))).then(aeb.a($$32, $$4, $$5, (CommandContext<ds> $$02) -> $$0 -> true, dt.a("replace").executes($$3 -> aeb.a((ds)$$3.getSource(), (c)$$32.apply($$3), (c)$$4.apply($$3), (c)$$5.apply($$3), $$0 -> true, aeb$d.c))))).then(aeb.a($$32, $$4, $$5, (CommandContext<ds> $$0) -> a, dt.a("masked").executes($$3 -> aeb.a((ds)$$3.getSource(), (c)$$32.apply($$3), (c)$$4.apply($$3), (c)$$5.apply($$3), a, aeb$d.c))))).then(dt.a("filtered").then(aeb.a($$32, $$4, $$5, (CommandContext<ds> $$0) -> fe.a((CommandContext<ds>)$$0, "filter"), dt.a("filter", fe.a($$03)).executes($$3 -> aeb.a((ds)$$3.getSource(), (c)$$32.apply($$3), (c)$$4.apply($$3), (c)$$5.apply($$3), fe.a((CommandContext<ds>)$$3, "filter"), aeb$d.c)))));
    }

    private static ArgumentBuilder<ds, ?> a(b<CommandContext<ds>, c> $$0, b<CommandContext<ds>, c> $$1, b<CommandContext<ds>, c> $$2, b<CommandContext<ds>, Predicate<dcf>> $$3, ArgumentBuilder<ds, ?> $$42) {
        return $$42.then(dt.a("force").executes($$4 -> aeb.a((ds)$$4.getSource(), (c)$$0.apply($$4), (c)$$1.apply($$4), (c)$$2.apply($$4), (Predicate)$$3.apply($$4), aeb$d.a))).then(dt.a("move").executes($$4 -> aeb.a((ds)$$4.getSource(), (c)$$0.apply($$4), (c)$$1.apply($$4), (c)$$2.apply($$4), (Predicate)$$3.apply($$4), aeb$d.b))).then(dt.a("normal").executes($$4 -> aeb.a((ds)$$4.getSource(), (c)$$0.apply($$4), (c)$$1.apply($$4), (c)$$2.apply($$4), (Predicate)$$3.apply($$4), aeb$d.c)));
    }

    private static int a(ds $$0, c $$1, c $$2, c $$3, Predicate<dcf> $$4, d $$5) throws CommandSyntaxException {
        int $$15;
        gu $$6 = $$1.b();
        gu $$7 = $$2.b();
        drs $$8 = drs.a($$6, $$7);
        gu $$9 = $$3.b();
        gu $$10 = $$9.a($$8.b());
        drs $$11 = drs.a($$9, $$10);
        aif $$12 = $$1.a();
        aif $$13 = $$3.a();
        if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
            throw b.create();
        }
        int $$14 = $$8.c() * $$8.d() * $$8.e();
        if ($$14 > ($$15 = $$0.e().X().c(cmi.x))) {
            throw c.create((Object)$$15, (Object)$$14);
        }
        if (!$$12.a($$6, $$7) || !$$13.a($$9, $$10)) {
            throw fi.a.create();
        }
        ArrayList $$16 = Lists.newArrayList();
        ArrayList $$17 = Lists.newArrayList();
        ArrayList $$18 = Lists.newArrayList();
        LinkedList $$19 = Lists.newLinkedList();
        gu $$20 = new gu($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());
        for (int $$21 = $$8.i(); $$21 <= $$8.l(); ++$$21) {
            for (int $$22 = $$8.h(); $$22 <= $$8.k(); ++$$22) {
                for (int $$23 = $$8.g(); $$23 <= $$8.j(); ++$$23) {
                    gu $$24 = new gu($$23, $$22, $$21);
                    gu $$25 = $$24.a($$20);
                    dcf $$26 = new dcf($$12, $$24, false);
                    dcb $$27 = $$26.a();
                    if (!$$4.test($$26)) continue;
                    czn $$28 = $$12.c_($$24);
                    if ($$28 != null) {
                        qr $$29 = $$28.o();
                        $$17.add(new a($$25, $$27, $$29));
                        $$19.addLast($$24);
                        continue;
                    }
                    if ($$27.i($$12, $$24) || $$27.r($$12, $$24)) {
                        $$16.add(new a($$25, $$27, null));
                        $$19.addLast($$24);
                        continue;
                    }
                    $$18.add(new a($$25, $$27, null));
                    $$19.addFirst($$24);
                }
            }
        }
        if ($$5 == aeb$d.b) {
            for (gu $$30 : $$19) {
                czn $$31 = $$12.c_($$30);
                bdo.a_($$31);
                $$12.a($$30, cpo.hW.n(), 2);
            }
            for (gu $$32 : $$19) {
                $$12.a($$32, cpo.a.n(), 3);
            }
        }
        ArrayList $$33 = Lists.newArrayList();
        $$33.addAll($$16);
        $$33.addAll($$17);
        $$33.addAll($$18);
        List $$34 = Lists.reverse((List)$$33);
        for (Iterator $$35 : $$34) {
            czn $$36 = $$13.c_(((a)((Object)$$35)).a);
            bdo.a_($$36);
            $$13.a(((a)((Object)$$35)).a, cpo.hW.n(), 2);
        }
        int $$37 = 0;
        for (a $$38 : $$33) {
            if (!$$13.a($$38.a, $$38.b, 2)) continue;
            ++$$37;
        }
        for (a $$39 : $$17) {
            czn $$40 = $$13.c_($$39.a);
            if ($$39.c != null && $$40 != null) {
                $$40.a($$39.c);
                $$40.e();
            }
            $$13.a($$39.a, $$39.b, 2);
        }
        for (a $$41 : $$34) {
            $$13.b($$41.a, $$41.b.b());
        }
        $$13.l().a($$12.l(), $$8, $$20);
        if ($$37 == 0) {
            throw d.create();
        }
        int $$42 = $$37;
        $$0.a(() -> sw.a("commands.clone.success", $$42), true);
        return $$37;
    }

    @FunctionalInterface
    static interface b<T, R> {
        public R apply(T var1) throws CommandSyntaxException;
    }

    record c(aif a, gu b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this, $$0);
        }
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(true);
        public static final /* enum */ d b = new d(true);
        public static final /* enum */ d c = new d(false);
        private final boolean d;
        private static final /* synthetic */ d[] e;

        public static d[] values() {
            return (d[])e.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(boolean $$0) {
            this.d = $$0;
        }

        public boolean a() {
            return this.d;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c};
        }

        static {
            e = aeb$d.b();
        }
    }

    static class a {
        public final gu a;
        public final dcb b;
        @Nullable
        public final qr c;

        public a(gu $$0, dcb $$1, @Nullable qr $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

