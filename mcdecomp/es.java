/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class es<T>
implements ArgumentType<c<T>> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    final acp<? extends hr<T>> b;

    public es(acp<? extends hr<T>> $$0) {
        this.b = $$0;
    }

    public static <T> es<T> a(acp<? extends hr<T>> $$0) {
        return new es<T>($$0);
    }

    public static <T> c<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
        c $$4 = (c)$$0.getArgument($$1, c.class);
        Optional<c<T>> $$5 = $$4.a($$2);
        return $$5.orElseThrow(() -> $$3.create((Object)$$4));
    }

    public c<T> a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '#') {
            int $$1 = $$0.getCursor();
            try {
                $$0.skip();
                acq $$2 = acq.a($$0);
                return new d(anl.a(this.b, $$2));
            }
            catch (CommandSyntaxException $$3) {
                $$0.setCursor($$1);
                throw $$3;
            }
        }
        acq $$4 = acq.a($$0);
        return new b(acp.a(this.b, $$4));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        Object object = $$0.getSource();
        if (object instanceof du) {
            du $$2 = (du)object;
            return $$2.a(this.b, du.a.c, $$1, $$0);
        }
        return $$1.buildFuture();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface c<T>
    extends Predicate<he<T>> {
        public Either<acp<T>, anl<T>> a();

        public <E> Optional<c<E>> a(acp<? extends hr<E>> var1);

        public String b();
    }

    record d<T>(anl<T> a) implements c<T>
    {
        private final anl<T> a;

        @Override
        public Either<acp<T>, anl<T>> a() {
            return Either.right(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(acp<? extends hr<E>> $$0) {
            return this.a.d($$0).map(d::new);
        }

        public boolean a(he<T> $$0) {
            return $$0.a(this.a);
        }

        @Override
        public String b() {
            return "#" + this.a.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "key", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "key", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "key", "a"}, this, $$0);
        }

        public anl<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((he)object);
        }
    }

    record b<T>(acp<T> a) implements c<T>
    {
        private final acp<T> a;

        @Override
        public Either<acp<T>, anl<T>> a() {
            return Either.left(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(acp<? extends hr<E>> $$0) {
            return this.a.c($$0).map(b::new);
        }

        public boolean a(he<T> $$0) {
            return $$0.a(this.a);
        }

        @Override
        public String b() {
            return this.a.a().toString();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "key", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "key", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "key", "a"}, this, $$0);
        }

        public acp<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((he)object);
        }
    }

    public static class es$a<T>
    implements gg<es<T>, a> {
        @Override
        public void a(a $$0, sf $$1) {
            $$1.a($$0.b.a());
        }

        @Override
        public a a(sf $$0) {
            acq $$1 = $$0.t();
            return new a(acp.a($$1));
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("registry", $$0.b.a().toString());
        }

        @Override
        public a a(es<T> $$0) {
            return new a($$0.b);
        }

        @Override
        public /* synthetic */ gg.a b(sf sf2) {
            return this.a(sf2);
        }

        public final class a
        implements gg.a<es<T>> {
            final acp<? extends hr<T>> b;

            a(acp<? extends hr<T>> $$1) {
                this.b = $$1;
            }

            public es<T> a(dm $$0) {
                return new es(this.b);
            }

            @Override
            public gg<es<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dm dm2) {
                return this.a(dm2);
            }
        }
    }
}

