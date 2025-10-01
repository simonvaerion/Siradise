/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eh
implements ArgumentType<g> {
    private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("arguments.nbtpath.node.invalid"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("arguments.nbtpath.too_deep"));
    public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("arguments.nbtpath.nothing_found", $$0));
    static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.modify.expected_list", $$0));
    static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> sw.a("commands.data.modify.invalid_index", $$0));
    private static final char g = '[';
    private static final char h = ']';
    private static final char i = '{';
    private static final char j = '}';
    private static final char k = '\"';
    private static final char l = '\'';

    public static eh a() {
        return new eh();
    }

    public static g a(CommandContext<ds> $$0, String $$1) {
        return (g)$$0.getArgument($$1, g.class);
    }

    public g a(StringReader $$0) throws CommandSyntaxException {
        ArrayList $$1 = Lists.newArrayList();
        int $$2 = $$0.getCursor();
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        boolean $$4 = true;
        while ($$0.canRead() && $$0.peek() != ' ') {
            char $$6;
            h $$5 = eh.a($$0, $$4);
            $$1.add($$5);
            $$3.put((Object)$$5, $$0.getCursor() - $$2);
            $$4 = false;
            if (!$$0.canRead() || ($$6 = $$0.peek()) == ' ' || $$6 == '[' || $$6 == '{') continue;
            $$0.expect('.');
        }
        return new g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new h[0]), (Object2IntMap<h>)$$3);
    }

    private static h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        return switch ($$0.peek()) {
            case '{' -> {
                if (!$$1) {
                    throw a.createWithContext((ImmutableStringReader)$$0);
                }
                qr $$2 = new rl($$0).f();
                yield new f($$2);
            }
            case '[' -> {
                $$0.skip();
                char $$3 = $$0.peek();
                if ($$3 == '{') {
                    qr $$4 = new rl($$0).f();
                    $$0.expect(']');
                    yield new d($$4);
                }
                if ($$3 == ']') {
                    $$0.skip();
                    yield eh$a.a;
                }
                int $$5 = $$0.readInt();
                $$0.expect(']');
                yield new c($$5);
            }
            case '\"', '\'' -> eh.a($$0, $$0.readString());
            default -> eh.a($$0, eh.b($$0));
        };
    }

    private static h a(StringReader $$0, String $$1) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '{') {
            qr $$2 = new rl($$0).f();
            return new e($$1, $$2);
        }
        return new b($$1);
    }

    private static String b(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && eh.a($$0.peek())) {
            $$0.skip();
        }
        if ($$0.getCursor() == $$1) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        return $$0.getString().substring($$1, $$0.getCursor());
    }

    public Collection<String> getExamples() {
        return d;
    }

    private static boolean a(char $$0) {
        return $$0 != ' ' && $$0 != '\"' && $$0 != '\'' && $$0 != '[' && $$0 != ']' && $$0 != '.' && $$0 != '{' && $$0 != '}';
    }

    static Predicate<rk> a(qr $$0) {
        return $$1 -> rd.a((rk)$$0, $$1, true);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class g {
        private final String a;
        private final Object2IntMap<h> b;
        private final h[] c;

        public g(String $$0, h[] $$1, Object2IntMap<h> $$2) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
        }

        public List<rk> a(rk $$0) throws CommandSyntaxException {
            List<rk> $$1 = Collections.singletonList($$0);
            for (h $$2 : this.c) {
                if (!($$1 = $$2.a($$1)).isEmpty()) continue;
                throw this.a($$2);
            }
            return $$1;
        }

        public int b(rk $$0) {
            List<rk> $$1 = Collections.singletonList($$0);
            for (h $$2 : this.c) {
                if (!($$1 = $$2.a($$1)).isEmpty()) continue;
                return 0;
            }
            return $$1.size();
        }

        private List<rk> d(rk $$0) throws CommandSyntaxException {
            List<rk> $$1 = Collections.singletonList($$0);
            for (int $$2 = 0; $$2 < this.c.length - 1; ++$$2) {
                h $$3 = this.c[$$2];
                int $$4 = $$2 + 1;
                if (!($$1 = $$3.a($$1, this.c[$$4]::a)).isEmpty()) continue;
                throw this.a($$3);
            }
            return $$1;
        }

        public List<rk> a(rk $$0, Supplier<rk> $$1) throws CommandSyntaxException {
            List<rk> $$2 = this.d($$0);
            h $$3 = this.c[this.c.length - 1];
            return $$3.a($$2, $$1);
        }

        private static int a(List<rk> $$02, Function<rk, Integer> $$12) {
            return $$02.stream().map($$12).reduce(0, ($$0, $$1) -> $$0 + $$1);
        }

        public static boolean a(rk $$0, int $$1) {
            block4: {
                block3: {
                    if ($$1 >= 512) {
                        return true;
                    }
                    if (!($$0 instanceof qr)) break block3;
                    qr $$2 = (qr)$$0;
                    for (String $$3 : $$2.e()) {
                        rk $$4 = $$2.c($$3);
                        if ($$4 == null || !eh$g.a($$4, $$1 + 1)) continue;
                        return true;
                    }
                    break block4;
                }
                if (!($$0 instanceof qx)) break block4;
                qx $$5 = (qx)$$0;
                for (rk $$6 : $$5) {
                    if (!eh$g.a($$6, $$1 + 1)) continue;
                    return true;
                }
            }
            return false;
        }

        public int a(rk $$0, rk $$1) throws CommandSyntaxException {
            if (eh$g.a($$1, this.a())) {
                throw b.create();
            }
            rk $$2 = $$1.d();
            List<rk> $$32 = this.d($$0);
            if ($$32.isEmpty()) {
                return 0;
            }
            h $$4 = this.c[this.c.length - 1];
            MutableBoolean $$5 = new MutableBoolean(false);
            return eh$g.a($$32, (rk $$3) -> $$4.a((rk)$$3, () -> {
                if ($$5.isFalse()) {
                    $$5.setTrue();
                    return $$2;
                }
                return $$2.d();
            }));
        }

        private int a() {
            return this.c.length;
        }

        public int a(int $$0, qr $$1, List<rk> $$2) throws CommandSyntaxException {
            ArrayList<rk> $$3 = new ArrayList<rk>($$2.size());
            for (rk $$4 : $$2) {
                rk $$5 = $$4.d();
                $$3.add($$5);
                if (!eh$g.a($$5, this.a())) continue;
                throw b.create();
            }
            List<rk> $$6 = this.a((rk)$$1, qx::new);
            int $$7 = 0;
            boolean $$8 = false;
            for (rk $$9 : $$6) {
                if (!($$9 instanceof qq)) {
                    throw e.create((Object)$$9);
                }
                qq $$10 = (qq)$$9;
                boolean $$11 = false;
                int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;
                for (rk $$13 : $$3) {
                    try {
                        if (!$$10.b($$12, $$8 ? $$13.d() : $$13)) continue;
                        ++$$12;
                        $$11 = true;
                    }
                    catch (IndexOutOfBoundsException $$14) {
                        throw f.create((Object)$$12);
                    }
                }
                $$8 = true;
                $$7 += $$11 ? 1 : 0;
            }
            return $$7;
        }

        public int c(rk $$0) {
            List<rk> $$1 = Collections.singletonList($$0);
            for (int $$2 = 0; $$2 < this.c.length - 1; ++$$2) {
                $$1 = this.c[$$2].a($$1);
            }
            h $$3 = this.c[this.c.length - 1];
            return eh$g.a($$1, $$3::a);
        }

        private CommandSyntaxException a(h $$0) {
            int $$1 = this.b.getInt((Object)$$0);
            return c.create((Object)this.a.substring(0, $$1));
        }

        public String toString() {
            return this.a;
        }
    }

    static interface h {
        public void a(rk var1, List<rk> var2);

        public void a(rk var1, Supplier<rk> var2, List<rk> var3);

        public rk a();

        public int a(rk var1, Supplier<rk> var2);

        public int a(rk var1);

        default public List<rk> a(List<rk> $$0) {
            return this.a($$0, this::a);
        }

        default public List<rk> a(List<rk> $$0, Supplier<rk> $$12) {
            return this.a($$0, (rk $$1, List<rk> $$2) -> this.a((rk)$$1, $$12, (List<rk>)$$2));
        }

        default public List<rk> a(List<rk> $$0, BiConsumer<rk, List<rk>> $$1) {
            ArrayList $$2 = Lists.newArrayList();
            for (rk $$3 : $$0) {
                $$1.accept($$3, $$2);
            }
            return $$2;
        }
    }

    static class f
    implements h {
        private final Predicate<rk> a;

        public f(qr $$0) {
            this.a = eh.a($$0);
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            if ($$0 instanceof qr && this.a.test($$0)) {
                $$1.add($$0);
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$2) {
            this.a($$0, $$2);
        }

        @Override
        public rk a() {
            return new qr();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            return 0;
        }

        @Override
        public int a(rk $$0) {
            return 0;
        }
    }

    static class d
    implements h {
        private final qr a;
        private final Predicate<rk> b;

        public d(qr $$0) {
            this.a = $$0;
            this.b = eh.a($$0);
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            if ($$0 instanceof qx) {
                qx $$2 = (qx)$$0;
                $$2.stream().filter(this.b).forEach($$1::add);
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$22) {
            MutableBoolean $$3 = new MutableBoolean();
            if ($$0 instanceof qx) {
                qx $$4 = (qx)$$0;
                $$4.stream().filter(this.b).forEach($$2 -> {
                    $$22.add((rk)$$2);
                    $$3.setTrue();
                });
                if ($$3.isFalse()) {
                    qr $$5 = this.a.h();
                    $$4.add($$5);
                    $$22.add($$5);
                }
            }
        }

        @Override
        public rk a() {
            return new qx();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            int $$2 = 0;
            if ($$0 instanceof qx) {
                qx $$3 = (qx)$$0;
                int $$4 = $$3.size();
                if ($$4 == 0) {
                    $$3.add($$1.get());
                    ++$$2;
                } else {
                    for (int $$5 = 0; $$5 < $$4; ++$$5) {
                        rk $$7;
                        rk $$6 = $$3.k($$5);
                        if (!this.b.test($$6) || ($$7 = $$1.get()).equals($$6) || !$$3.a($$5, $$7)) continue;
                        ++$$2;
                    }
                }
            }
            return $$2;
        }

        @Override
        public int a(rk $$0) {
            int $$1 = 0;
            if ($$0 instanceof qx) {
                qx $$2 = (qx)$$0;
                for (int $$3 = $$2.size() - 1; $$3 >= 0; --$$3) {
                    if (!this.b.test($$2.k($$3))) continue;
                    $$2.c($$3);
                    ++$$1;
                }
            }
            return $$1;
        }
    }

    static class a
    implements h {
        public static final a a = new a();

        private a() {
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            if ($$0 instanceof qq) {
                $$1.addAll((qq)$$0);
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$2) {
            if ($$0 instanceof qq) {
                qq $$3 = (qq)$$0;
                if ($$3.isEmpty()) {
                    rk $$4 = $$1.get();
                    if ($$3.b(0, $$4)) {
                        $$2.add($$4);
                    }
                } else {
                    $$2.addAll($$3);
                }
            }
        }

        @Override
        public rk a() {
            return new qx();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            if ($$0 instanceof qq) {
                qq $$2 = (qq)$$0;
                int $$3 = $$2.size();
                if ($$3 == 0) {
                    $$2.b(0, $$1.get());
                    return 1;
                }
                rk $$4 = $$1.get();
                int $$5 = $$3 - (int)$$2.stream().filter($$4::equals).count();
                if ($$5 == 0) {
                    return 0;
                }
                $$2.clear();
                if (!$$2.b(0, $$4)) {
                    return 0;
                }
                for (int $$6 = 1; $$6 < $$3; ++$$6) {
                    $$2.b($$6, $$1.get());
                }
                return $$5;
            }
            return 0;
        }

        @Override
        public int a(rk $$0) {
            qq $$1;
            int $$2;
            if ($$0 instanceof qq && ($$2 = ($$1 = (qq)$$0).size()) > 0) {
                $$1.clear();
                return $$2;
            }
            return 0;
        }
    }

    static class c
    implements h {
        private final int a;

        public c(int $$0) {
            this.a = $$0;
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            if ($$0 instanceof qq) {
                int $$4;
                qq $$2 = (qq)$$0;
                int $$3 = $$2.size();
                int n2 = $$4 = this.a < 0 ? $$3 + this.a : this.a;
                if (0 <= $$4 && $$4 < $$3) {
                    $$1.add((rk)$$2.get($$4));
                }
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$2) {
            this.a($$0, $$2);
        }

        @Override
        public rk a() {
            return new qx();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            if ($$0 instanceof qq) {
                int $$4;
                qq $$2 = (qq)$$0;
                int $$3 = $$2.size();
                int n2 = $$4 = this.a < 0 ? $$3 + this.a : this.a;
                if (0 <= $$4 && $$4 < $$3) {
                    rk $$5 = (rk)$$2.get($$4);
                    rk $$6 = $$1.get();
                    if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                        return 1;
                    }
                }
            }
            return 0;
        }

        @Override
        public int a(rk $$0) {
            if ($$0 instanceof qq) {
                int $$3;
                qq $$1 = (qq)$$0;
                int $$2 = $$1.size();
                int n2 = $$3 = this.a < 0 ? $$2 + this.a : this.a;
                if (0 <= $$3 && $$3 < $$2) {
                    $$1.c($$3);
                    return 1;
                }
            }
            return 0;
        }
    }

    static class e
    implements h {
        private final String a;
        private final qr b;
        private final Predicate<rk> c;

        public e(String $$0, qr $$1) {
            this.a = $$0;
            this.b = $$1;
            this.c = eh.a($$1);
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            rk $$2;
            if ($$0 instanceof qr && this.c.test($$2 = ((qr)$$0).c(this.a))) {
                $$1.add($$2);
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$2) {
            if ($$0 instanceof qr) {
                qr $$3 = (qr)$$0;
                rk $$4 = $$3.c(this.a);
                if ($$4 == null) {
                    $$4 = this.b.h();
                    $$3.a(this.a, $$4);
                    $$2.add($$4);
                } else if (this.c.test($$4)) {
                    $$2.add($$4);
                }
            }
        }

        @Override
        public rk a() {
            return new qr();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            rk $$4;
            qr $$2;
            rk $$3;
            if ($$0 instanceof qr && this.c.test($$3 = ($$2 = (qr)$$0).c(this.a)) && !($$4 = $$1.get()).equals($$3)) {
                $$2.a(this.a, $$4);
                return 1;
            }
            return 0;
        }

        @Override
        public int a(rk $$0) {
            qr $$1;
            rk $$2;
            if ($$0 instanceof qr && this.c.test($$2 = ($$1 = (qr)$$0).c(this.a))) {
                $$1.r(this.a);
                return 1;
            }
            return 0;
        }
    }

    static class b
    implements h {
        private final String a;

        public b(String $$0) {
            this.a = $$0;
        }

        @Override
        public void a(rk $$0, List<rk> $$1) {
            rk $$2;
            if ($$0 instanceof qr && ($$2 = ((qr)$$0).c(this.a)) != null) {
                $$1.add($$2);
            }
        }

        @Override
        public void a(rk $$0, Supplier<rk> $$1, List<rk> $$2) {
            if ($$0 instanceof qr) {
                rk $$5;
                qr $$3 = (qr)$$0;
                if ($$3.e(this.a)) {
                    rk $$4 = $$3.c(this.a);
                } else {
                    $$5 = $$1.get();
                    $$3.a(this.a, $$5);
                }
                $$2.add($$5);
            }
        }

        @Override
        public rk a() {
            return new qr();
        }

        @Override
        public int a(rk $$0, Supplier<rk> $$1) {
            if ($$0 instanceof qr) {
                rk $$4;
                qr $$2 = (qr)$$0;
                rk $$3 = $$1.get();
                if (!$$3.equals($$4 = $$2.a(this.a, $$3))) {
                    return 1;
                }
            }
            return 0;
        }

        @Override
        public int a(rk $$0) {
            qr $$1;
            if ($$0 instanceof qr && ($$1 = (qr)$$0).e(this.a)) {
                $$1.r(this.a);
                return 1;
            }
            return 0;
        }
    }
}

