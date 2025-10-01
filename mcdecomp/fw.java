/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fw {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.item.tag.disallowed"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("argument.item.id.invalid", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("arguments.item.tag.unknown", $$0));
    private static final char d = '{';
    private static final char e = '#';
    private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> f = SuggestionsBuilder::buildFuture;
    private final hg<cfu> g;
    private final StringReader h;
    private final boolean i;
    private Either<he<cfu>, hi<cfu>> j;
    @Nullable
    private qr k;
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = f;

    private fw(hg<cfu> $$0, StringReader $$1, boolean $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    public static a a(hg<cfu> $$0, StringReader $$1) throws CommandSyntaxException {
        int $$2 = $$1.getCursor();
        try {
            fw $$3 = new fw($$0, $$1, false);
            $$3.d();
            he $$4 = (he)$$3.j.left().orElseThrow(() -> new IllegalStateException("Parser returned unexpected tag name"));
            return new a($$4, $$3.k);
        }
        catch (CommandSyntaxException $$5) {
            $$1.setCursor($$2);
            throw $$5;
        }
    }

    public static Either<a, b> b(hg<cfu> $$0, StringReader $$12) throws CommandSyntaxException {
        int $$2 = $$12.getCursor();
        try {
            fw $$3 = new fw($$0, $$12, true);
            $$3.d();
            return $$3.j.mapBoth($$1 -> new a((he<cfu>)$$1, $$0.k), $$1 -> new b((hi<cfu>)$$1, $$0.k));
        }
        catch (CommandSyntaxException $$4) {
            $$12.setCursor($$2);
            throw $$4;
        }
    }

    public static CompletableFuture<Suggestions> a(hg<cfu> $$0, SuggestionsBuilder $$1, boolean $$2) {
        StringReader $$3 = new StringReader($$1.getInput());
        $$3.setCursor($$1.getStart());
        fw $$4 = new fw($$0, $$3, $$2);
        try {
            $$4.d();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$4.l.apply($$1.createOffset($$3.getCursor()));
    }

    private void a() throws CommandSyntaxException {
        int $$0 = this.h.getCursor();
        acq $$1 = acq.a(this.h);
        Optional<he.c<cfu>> $$2 = this.g.a(acp.a(jc.D, $$1));
        this.j = Either.left((Object)$$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return b.createWithContext((ImmutableStringReader)this.h, (Object)$$1);
        }));
    }

    private void b() throws CommandSyntaxException {
        if (!this.i) {
            throw a.createWithContext((ImmutableStringReader)this.h);
        }
        int $$0 = this.h.getCursor();
        this.h.expect('#');
        this.l = this::b;
        acq $$1 = acq.a(this.h);
        Optional<hi.c<cfu>> $$2 = this.g.a(anl.a(jc.D, $$1));
        this.j = Either.right((Object)$$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return c.createWithContext((ImmutableStringReader)this.h, (Object)$$1);
        }));
    }

    private void c() throws CommandSyntaxException {
        this.k = new rl(this.h).f();
    }

    private void d() throws CommandSyntaxException {
        this.l = this.i ? this::d : this::c;
        if (this.h.canRead() && this.h.peek() == '#') {
            this.b();
        } else {
            this.a();
        }
        this.l = this::a;
        if (this.h.canRead() && this.h.peek() == '{') {
            this.l = f;
            this.c();
        }
    }

    private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('{'));
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
        return du.a(this.g.e().map(anl::b), $$0, String.valueOf('#'));
    }

    private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
        return du.a(this.g.c().map(acp::a), $$0);
    }

    private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
        this.b($$0);
        return this.c($$0);
    }

    public record a(he<cfu> a, @Nullable qr b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "item;nbt", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "item;nbt", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "item;nbt", "a", "b"}, this, $$0);
        }
    }

    public record b(hi<cfu> a, @Nullable qr b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "tag;nbt", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "tag;nbt", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "tag;nbt", "a", "b"}, this, $$0);
        }
    }
}

