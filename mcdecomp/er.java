/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
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

public class er<T>
implements ArgumentType<c<T>> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.resource_tag.not_found", $$0, $$1));
    private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> sw.a("argument.resource_tag.invalid_type", $$0, $$1, $$2));
    private final hg<T> d;
    final acp<? extends hr<T>> e;

    public er(dm $$0, acp<? extends hr<T>> $$1) {
        this.e = $$1;
        this.d = $$0.a($$1);
    }

    public static <T> er<T> a(dm $$0, acp<? extends hr<T>> $$1) {
        return new er<T>($$0, $$1);
    }

    public static <T> c<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2) throws CommandSyntaxException {
        c $$3 = (c)$$0.getArgument($$1, c.class);
        Optional<c<T>> $$4 = $$3.a($$2);
        return $$4.orElseThrow(() -> (CommandSyntaxException)((Object)((Object)$$3.a().map($$1 -> {
            acp $$2 = $$1.g();
            return eo.b.create((Object)$$2.a(), (Object)$$2.b(), (Object)$$2.a());
        }, $$1 -> {
            anl $$2 = $$1.f();
            return c.create((Object)$$2.b(), $$2.a(), (Object)$$2.a());
        }))));
    }

    public c<T> a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '#') {
            int $$1 = $$0.getCursor();
            try {
                $$0.skip();
                acq $$2 = acq.a($$0);
                anl $$3 = anl.a(this.e, $$2);
                hi.c $$4 = this.d.a($$3).orElseThrow(() -> b.create((Object)$$2, (Object)this.e.a()));
                return new d($$4);
            }
            catch (CommandSyntaxException $$5) {
                $$0.setCursor($$1);
                throw $$5;
            }
        }
        acq $$6 = acq.a($$0);
        acp $$7 = acp.a(this.e, $$6);
        he.c $$8 = this.d.a($$7).orElseThrow(() -> eo.a.create((Object)$$6, (Object)this.e.a()));
        return new b($$8);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        du.a(this.d.e().map(anl::b), $$1, "#");
        return du.a(this.d.c().map(acp::a), $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface c<T>
    extends Predicate<he<T>> {
        public Either<he.c<T>, hi.c<T>> a();

        public <E> Optional<c<E>> a(acp<? extends hr<E>> var1);

        public String b();
    }

    record d<T>(hi.c<T> a) implements c<T>
    {
        private final hi.c<T> a;

        @Override
        public Either<he.c<T>, hi.c<T>> a() {
            return Either.right(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(acp<? extends hr<E>> $$0) {
            return this.a.f().c($$0) ? Optional.of(this) : Optional.empty();
        }

        public boolean a(he<T> $$0) {
            return this.a.a($$0);
        }

        @Override
        public String b() {
            return "#" + this.a.f().b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "tag", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "tag", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "tag", "a"}, this, $$0);
        }

        public hi.c<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((he)object);
        }
    }

    record b<T>(he.c<T> a) implements c<T>
    {
        private final he.c<T> a;

        @Override
        public Either<he.c<T>, hi.c<T>> a() {
            return Either.left(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(acp<? extends hr<E>> $$0) {
            return this.a.g().b($$0) ? Optional.of(this) : Optional.empty();
        }

        public boolean a(he<T> $$0) {
            return $$0.equals(this.a);
        }

        @Override
        public String b() {
            return this.a.g().a().toString();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "a"}, this, $$0);
        }

        public he.c<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((he)object);
        }
    }

    public static class er$a<T>
    implements gg<er<T>, a> {
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
        public a a(er<T> $$0) {
            return new a($$0.e);
        }

        @Override
        public /* synthetic */ gg.a b(sf sf2) {
            return this.a(sf2);
        }

        public final class a
        implements gg.a<er<T>> {
            final acp<? extends hr<T>> b;

            a(acp<? extends hr<T>> $$1) {
                this.b = $$1;
            }

            public er<T> a(dm $$0) {
                return new er($$0, this.b);
            }

            @Override
            public gg<er<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dm dm2) {
                return this.a(dm2);
            }
        }
    }
}

