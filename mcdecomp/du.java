/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface du {
    public Collection<String> q();

    default public Collection<String> x() {
        return this.q();
    }

    default public Collection<String> y() {
        return Collections.emptyList();
    }

    public Collection<String> r();

    public Stream<acq> s();

    public Stream<acq> t();

    public CompletableFuture<Suggestions> a(CommandContext<?> var1);

    default public Collection<b> z() {
        return Collections.singleton(b.b);
    }

    default public Collection<b> A() {
        return Collections.singleton(b.b);
    }

    public Set<acp<cmm>> u();

    public hs v();

    public caw w();

    default public void a(hr<?> $$0, a $$1, SuggestionsBuilder $$2) {
        if ($$1.a()) {
            du.a($$0.j().map(anl::b), $$2, "#");
        }
        if ($$1.b()) {
            du.a($$0.e(), $$2);
        }
    }

    public CompletableFuture<Suggestions> a(acp<? extends hr<?>> var1, a var2, SuggestionsBuilder var3, CommandContext<?> var4);

    public boolean c(int var1);

    public static <T> void a(Iterable<T> $$0, String $$1, Function<T, acq> $$2, Consumer<T> $$3) {
        boolean $$4 = $$1.indexOf(58) > -1;
        for (T $$5 : $$0) {
            acq $$6 = $$2.apply($$5);
            if ($$4) {
                String $$7 = $$6.toString();
                if (!du.a($$1, $$7)) continue;
                $$3.accept($$5);
                continue;
            }
            if (!du.a($$1, $$6.b()) && (!$$6.b().equals("minecraft") || !du.a($$1, $$6.a()))) continue;
            $$3.accept($$5);
        }
    }

    public static <T> void a(Iterable<T> $$0, String $$1, String $$2, Function<T, acq> $$3, Consumer<T> $$4) {
        if ($$1.isEmpty()) {
            $$0.forEach($$4);
        } else {
            String $$5 = Strings.commonPrefix((CharSequence)$$1, (CharSequence)$$2);
            if (!$$5.isEmpty()) {
                String $$6 = $$1.substring($$5.length());
                du.a($$0, $$6, $$3, $$4);
            }
        }
    }

    public static CompletableFuture<Suggestions> a(Iterable<acq> $$02, SuggestionsBuilder $$1, String $$22) {
        String $$3 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        du.a($$02, $$3, $$22, $$0 -> $$0, $$2 -> $$1.suggest($$22 + $$2));
        return $$1.buildFuture();
    }

    public static CompletableFuture<Suggestions> a(Stream<acq> $$0, SuggestionsBuilder $$1, String $$2) {
        return du.a($$0::iterator, $$1, $$2);
    }

    public static CompletableFuture<Suggestions> a(Iterable<acq> $$02, SuggestionsBuilder $$12) {
        String $$2 = $$12.getRemaining().toLowerCase(Locale.ROOT);
        du.a($$02, $$2, (T $$0) -> $$0, (T $$1) -> $$12.suggest($$1.toString()));
        return $$12.buildFuture();
    }

    public static <T> CompletableFuture<Suggestions> a(Iterable<T> $$0, SuggestionsBuilder $$1, Function<T, acq> $$2, Function<T, Message> $$32) {
        String $$4 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        du.a($$0, $$4, $$2, (T $$3) -> $$1.suggest(((acq)$$2.apply($$3)).toString(), (Message)$$32.apply($$3)));
        return $$1.buildFuture();
    }

    public static CompletableFuture<Suggestions> a(Stream<acq> $$0, SuggestionsBuilder $$1) {
        return du.a($$0::iterator, $$1);
    }

    public static <T> CompletableFuture<Suggestions> a(Stream<T> $$0, SuggestionsBuilder $$1, Function<T, acq> $$2, Function<T, Message> $$3) {
        return du.a($$0::iterator, $$1, $$2, $$3);
    }

    public static CompletableFuture<Suggestions> a(String $$0, Collection<b> $$1, SuggestionsBuilder $$2, Predicate<String> $$3) {
        ArrayList $$4;
        block4: {
            String[] $$7;
            block5: {
                block3: {
                    $$4 = Lists.newArrayList();
                    if (!Strings.isNullOrEmpty((String)$$0)) break block3;
                    for (b $$5 : $$1) {
                        String $$6 = $$5.c + " " + $$5.d + " " + $$5.e;
                        if (!$$3.test($$6)) continue;
                        $$4.add($$5.c);
                        $$4.add($$5.c + " " + $$5.d);
                        $$4.add($$6);
                    }
                    break block4;
                }
                $$7 = $$0.split(" ");
                if ($$7.length != 1) break block5;
                for (b $$8 : $$1) {
                    String $$9 = $$7[0] + " " + $$8.d + " " + $$8.e;
                    if (!$$3.test($$9)) continue;
                    $$4.add($$7[0] + " " + $$8.d);
                    $$4.add($$9);
                }
                break block4;
            }
            if ($$7.length != 2) break block4;
            for (b $$10 : $$1) {
                String $$11 = $$7[0] + " " + $$7[1] + " " + $$10.e;
                if (!$$3.test($$11)) continue;
                $$4.add($$11);
            }
        }
        return du.b($$4, $$2);
    }

    public static CompletableFuture<Suggestions> b(String $$0, Collection<b> $$1, SuggestionsBuilder $$2, Predicate<String> $$3) {
        ArrayList $$4;
        block3: {
            block2: {
                $$4 = Lists.newArrayList();
                if (!Strings.isNullOrEmpty((String)$$0)) break block2;
                for (b $$5 : $$1) {
                    String $$6 = $$5.c + " " + $$5.e;
                    if (!$$3.test($$6)) continue;
                    $$4.add($$5.c);
                    $$4.add($$6);
                }
                break block3;
            }
            String[] $$7 = $$0.split(" ");
            if ($$7.length != 1) break block3;
            for (b $$8 : $$1) {
                String $$9 = $$7[0] + " " + $$8.e;
                if (!$$3.test($$9)) continue;
                $$4.add($$9);
            }
        }
        return du.b($$4, $$2);
    }

    public static CompletableFuture<Suggestions> b(Iterable<String> $$0, SuggestionsBuilder $$1) {
        String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        for (String $$3 : $$0) {
            if (!du.a($$2, $$3.toLowerCase(Locale.ROOT))) continue;
            $$1.suggest($$3);
        }
        return $$1.buildFuture();
    }

    public static CompletableFuture<Suggestions> b(Stream<String> $$0, SuggestionsBuilder $$12) {
        String $$2 = $$12.getRemaining().toLowerCase(Locale.ROOT);
        $$0.filter($$1 -> du.a($$2, $$1.toLowerCase(Locale.ROOT))).forEach(arg_0 -> ((SuggestionsBuilder)$$12).suggest(arg_0));
        return $$12.buildFuture();
    }

    public static CompletableFuture<Suggestions> a(String[] $$0, SuggestionsBuilder $$1) {
        String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        for (String $$3 : $$0) {
            if (!du.a($$2, $$3.toLowerCase(Locale.ROOT))) continue;
            $$1.suggest($$3);
        }
        return $$1.buildFuture();
    }

    public static <T> CompletableFuture<Suggestions> b(Iterable<T> $$0, SuggestionsBuilder $$1, Function<T, String> $$2, Function<T, Message> $$3) {
        String $$4 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        for (T $$5 : $$0) {
            String $$6 = $$2.apply($$5);
            if (!du.a($$4, $$6.toLowerCase(Locale.ROOT))) continue;
            $$1.suggest($$6, $$3.apply($$5));
        }
        return $$1.buildFuture();
    }

    public static boolean a(String $$0, String $$1) {
        int $$2 = 0;
        while (!$$1.startsWith($$0, $$2)) {
            if (($$2 = $$1.indexOf(95, $$2)) < 0) {
                return false;
            }
            ++$$2;
        }
        return true;
    }

    public static class b {
        public static final b a = new b("^", "^", "^");
        public static final b b = new b("~", "~", "~");
        public final String c;
        public final String d;
        public final String e;

        public b(String $$0, String $$1, String $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public boolean a() {
            return this == a || this == c;
        }

        public boolean b() {
            return this == b || this == c;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c};
        }

        static {
            d = du$a.c();
        }
    }
}

