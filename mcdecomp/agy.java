/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class agy {
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.data.merge.failed"));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.get.invalid", $$0));
    private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.get.unknown", $$0));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)sw.c("commands.data.get.multiple"));
    private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.modify.expected_object", $$0));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.modify.expected_value", $$0));
    private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.data.modify.invalid_substring", $$0, $$1));
    public static final List<Function<String, c>> a = ImmutableList.of(agz.a, agw.a, aha.a);
    public static final List<c> b = (List)a.stream().map($$0 -> (c)$$0.apply("target")).collect(ImmutableList.toImmutableList());
    public static final List<c> c = (List)a.stream().map($$0 -> (c)$$0.apply("source")).collect(ImmutableList.toImmutableList());

    public static void a(CommandDispatcher<ds> $$03) {
        LiteralArgumentBuilder $$1 = (LiteralArgumentBuilder)dt.a("data").requires($$0 -> $$0.c(2));
        for (c $$2 : b) {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then($$2.a((ArgumentBuilder<ds, ?>)dt.a("merge"), $$12 -> $$12.then(dt.a("nbt", dz.a()).executes($$1 -> agy.a((ds)$$1.getSource(), $$2.a((CommandContext<ds>)$$1), dz.a($$1, "nbt"))))))).then($$2.a((ArgumentBuilder<ds, ?>)dt.a("get"), $$12 -> $$12.executes($$1 -> agy.a((ds)$$1.getSource(), $$2.a((CommandContext<ds>)$$1))).then(((RequiredArgumentBuilder)dt.a("path", eh.a()).executes($$1 -> agy.b((ds)$$1.getSource(), $$2.a((CommandContext<ds>)$$1), eh.a((CommandContext<ds>)$$1, "path")))).then(dt.a("scale", DoubleArgumentType.doubleArg()).executes($$1 -> agy.a((ds)$$1.getSource(), $$2.a((CommandContext<ds>)$$1), eh.a((CommandContext<ds>)$$1, "path"), DoubleArgumentType.getDouble((CommandContext)$$1, (String)"scale")))))))).then($$2.a((ArgumentBuilder<ds, ?>)dt.a("remove"), $$12 -> $$12.then(dt.a("path", eh.a()).executes($$1 -> agy.a((ds)$$1.getSource(), $$2.a((CommandContext<ds>)$$1), eh.a((CommandContext<ds>)$$1, "path"))))))).then(agy.a((ArgumentBuilder<ds, ?> $$02, b $$12) -> $$02.then(dt.a("insert").then(dt.a("index", IntegerArgumentType.integer()).then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"index"), $$1, $$3))))).then(dt.a("prepend").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(0, $$1, $$3)))).then(dt.a("append").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(-1, $$1, $$3)))).then(dt.a("set").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a((rk)$$1, (rk)Iterables.getLast((Iterable)$$3))))).then(dt.a("merge").then($$12.create(($$0, $$1, $$2, $$3) -> {
                qr $$4 = new qr();
                for (rk $$5 : $$3) {
                    if (eh.g.a($$5, 0)) {
                        throw eh.b.create();
                    }
                    if ($$5 instanceof qr) {
                        qr $$6 = (qr)$$5;
                        $$4.a($$6);
                        continue;
                    }
                    throw h.create((Object)$$5);
                }
                List<rk> $$7 = $$2.a((rk)$$1, qr::new);
                int $$8 = 0;
                for (rk $$9 : $$7) {
                    void $$11;
                    if (!($$9 instanceof qr)) {
                        throw h.create((Object)$$9);
                    }
                    qr $$10 = (qr)$$9;
                    qr $$12 = $$11.h();
                    $$11.a($$4);
                    $$8 += $$12.equals($$11) ? 0 : 1;
                }
                return $$8;
            })))));
        }
        $$03.register($$1);
    }

    private static String a(rk $$0) throws CommandSyntaxException {
        if ($$0.c().d()) {
            return $$0.m_();
        }
        throw i.create((Object)$$0);
    }

    private static List<rk> a(List<rk> $$0, d $$1) throws CommandSyntaxException {
        ArrayList<rk> $$2 = new ArrayList<rk>($$0.size());
        for (rk $$3 : $$0) {
            String $$4 = agy.a($$3);
            $$2.add(ri.a($$1.process($$4)));
        }
        return $$2;
    }

    private static ArgumentBuilder<ds, ?> a(BiConsumer<ArgumentBuilder<ds, ?>, b> $$0) {
        LiteralArgumentBuilder<ds> $$1 = dt.a("modify");
        for (c $$2 : b) {
            $$2.a((ArgumentBuilder<ds, ?>)$$1, $$22 -> {
                RequiredArgumentBuilder<ds, eh.g> $$3 = dt.a("targetPath", eh.a());
                for (c $$4 : c) {
                    $$0.accept((ArgumentBuilder<ds, ?>)$$3, $$2 -> $$4.a((ArgumentBuilder<ds, ?>)dt.a("from"), $$32 -> $$32.executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.a((CommandContext<ds>)$$3, $$4))).then(dt.a("sourcePath", eh.a()).executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.b((CommandContext<ds>)$$3, $$4))))));
                    $$0.accept((ArgumentBuilder<ds, ?>)$$3, $$2 -> $$4.a((ArgumentBuilder<ds, ?>)dt.a("string"), $$32 -> $$32.executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.a(agy.a((CommandContext<ds>)$$3, $$4), (String $$0) -> $$0))).then(((RequiredArgumentBuilder)dt.a("sourcePath", eh.a()).executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.a(agy.b((CommandContext<ds>)$$3, $$4), (String $$0) -> $$0)))).then(((RequiredArgumentBuilder)dt.a("start", IntegerArgumentType.integer()).executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.a(agy.b((CommandContext<ds>)$$3, $$4), (String $$1) -> agy.a($$1, IntegerArgumentType.getInteger((CommandContext)$$3, (String)"start")))))).then(dt.a("end", IntegerArgumentType.integer()).executes($$3 -> agy.a((CommandContext<ds>)$$3, $$2, $$2, agy.a(agy.b((CommandContext<ds>)$$3, $$4), (String $$1) -> agy.b($$1, IntegerArgumentType.getInteger((CommandContext)$$3, (String)"start"), IntegerArgumentType.getInteger((CommandContext)$$3, (String)"end"))))))))));
                }
                $$0.accept((ArgumentBuilder<ds, ?>)$$3, $$1 -> dt.a("value").then(dt.a("value", ei.a()).executes($$2 -> {
                    List<rk> $$3 = Collections.singletonList(ei.a($$2, "value"));
                    return agy.a((CommandContext<ds>)$$2, $$2, $$1, $$3);
                })));
                return $$22.then($$3);
            });
        }
        return $$1;
    }

    private static String a(String $$0, int $$1, int $$2) throws CommandSyntaxException {
        if ($$1 < 0 || $$2 > $$0.length() || $$1 > $$2) {
            throw j.create((Object)$$1, (Object)$$2);
        }
        return $$0.substring($$1, $$2);
    }

    private static String b(String $$0, int $$1, int $$2) throws CommandSyntaxException {
        int $$3 = $$0.length();
        int $$4 = agy.a($$1, $$3);
        int $$5 = agy.a($$2, $$3);
        return agy.a($$0, $$4, $$5);
    }

    private static String a(String $$0, int $$1) throws CommandSyntaxException {
        int $$2 = $$0.length();
        return agy.a($$0, agy.a($$1, $$2), $$2);
    }

    private static int a(int $$0, int $$1) {
        return $$0 >= 0 ? $$0 : $$1 + $$0;
    }

    private static List<rk> a(CommandContext<ds> $$0, c $$1) throws CommandSyntaxException {
        agx $$2 = $$1.a($$0);
        return Collections.singletonList($$2.a());
    }

    private static List<rk> b(CommandContext<ds> $$0, c $$1) throws CommandSyntaxException {
        agx $$2 = $$1.a($$0);
        eh.g $$3 = eh.a($$0, "sourcePath");
        return $$3.a($$2.a());
    }

    private static int a(CommandContext<ds> $$0, c $$1, a $$2, List<rk> $$3) throws CommandSyntaxException {
        agx $$4 = $$1.a($$0);
        eh.g $$5 = eh.a($$0, "targetPath");
        qr $$6 = $$4.a();
        int $$7 = $$2.modify($$0, $$6, $$5, $$3);
        if ($$7 == 0) {
            throw d.create();
        }
        $$4.a($$6);
        ((ds)$$0.getSource()).a(() -> $$4.b(), true);
        return $$7;
    }

    private static int a(ds $$0, agx $$1, eh.g $$2) throws CommandSyntaxException {
        qr $$3 = $$1.a();
        int $$4 = $$2.c($$3);
        if ($$4 == 0) {
            throw d.create();
        }
        $$1.a($$3);
        $$0.a(() -> $$1.b(), true);
        return $$4;
    }

    private static rk a(eh.g $$0, agx $$1) throws CommandSyntaxException {
        List<rk> $$2 = $$0.a($$1.a());
        Iterator $$3 = $$2.iterator();
        rk $$4 = (rk)$$3.next();
        if ($$3.hasNext()) {
            throw g.create();
        }
        return $$4;
    }

    /*
     * WARNING - void declaration
     */
    private static int b(ds $$0, agx $$1, eh.g $$2) throws CommandSyntaxException {
        void $$8;
        rk $$3 = agy.a($$2, $$1);
        if ($$3 instanceof re) {
            int $$4 = apa.a(((re)$$3).j());
        } else if ($$3 instanceof qq) {
            int $$5 = ((qq)$$3).size();
        } else if ($$3 instanceof qr) {
            int $$6 = ((qr)$$3).f();
        } else if ($$3 instanceof ri) {
            int $$7 = $$3.m_().length();
        } else {
            throw f.create((Object)$$2.toString());
        }
        $$0.a(() -> $$1.a($$3), false);
        return (int)$$8;
    }

    private static int a(ds $$0, agx $$1, eh.g $$2, double $$3) throws CommandSyntaxException {
        rk $$4 = agy.a($$2, $$1);
        if (!($$4 instanceof re)) {
            throw e.create((Object)$$2.toString());
        }
        int $$5 = apa.a(((re)$$4).j() * $$3);
        $$0.a(() -> $$1.a($$2, $$3, $$5), false);
        return $$5;
    }

    private static int a(ds $$0, agx $$1) throws CommandSyntaxException {
        qr $$2 = $$1.a();
        $$0.a(() -> $$1.a((rk)$$2), false);
        return 1;
    }

    private static int a(ds $$0, agx $$1, qr $$2) throws CommandSyntaxException {
        qr $$3 = $$1.a();
        if (eh.g.a($$2, 0)) {
            throw eh.b.create();
        }
        qr $$4 = $$3.h().a($$2);
        if ($$3.equals($$4)) {
            throw d.create();
        }
        $$1.a($$4);
        $$0.a(() -> $$1.b(), true);
        return 1;
    }

    public static interface c {
        public agx a(CommandContext<ds> var1) throws CommandSyntaxException;

        public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> var1, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> var2);
    }

    @FunctionalInterface
    static interface d {
        public String process(String var1) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public int modify(CommandContext<ds> var1, qr var2, eh.g var3, List<rk> var4) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface b {
        public ArgumentBuilder<ds, ?> create(a var1);
    }
}

