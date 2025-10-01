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
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class eo<T>
implements ArgumentType<he.c<T>> {
    private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("entity.not_summonable", $$0));
    public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.resource.not_found", $$0, $$1));
    public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> sw.a("argument.resource.invalid_type", $$0, $$1, $$2));
    final acp<? extends hr<T>> e;
    private final hg<T> f;

    public eo(dm $$0, acp<? extends hr<T>> $$1) {
        this.e = $$1;
        this.f = $$0.a($$1);
    }

    public static <T> eo<T> a(dm $$0, acp<? extends hr<T>> $$1) {
        return new eo<T>($$0, $$1);
    }

    public static <T> he.c<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2) throws CommandSyntaxException {
        he.c $$3 = (he.c)$$0.getArgument($$1, he.c.class);
        acp $$4 = $$3.g();
        if ($$4.b($$2)) {
            return $$3;
        }
        throw b.create((Object)$$4.a(), (Object)$$4.b(), (Object)$$2.a());
    }

    public static he.c<bhb> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.b);
    }

    public static he.c<dkb<?, ?>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.as);
    }

    public static he.c<dsa> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.az);
    }

    public static he.c<bfn<?>> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.s);
    }

    public static he.c<bfn<?>> e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        he.c<bfn<?>> $$2 = eo.a($$0, $$1, jc.s);
        if (!((bfn)$$2.a()).c()) {
            throw d.create((Object)$$2.g().a().toString());
        }
        return $$2;
    }

    public static he.c<bey> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.O);
    }

    public static he.c<ckg> g(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return eo.a($$0, $$1, jc.r);
    }

    public he.c<T> a(StringReader $$0) throws CommandSyntaxException {
        acq $$1 = acq.a($$0);
        acp $$2 = acp.a(this.e, $$1);
        return this.f.a($$2).orElseThrow(() -> a.create((Object)$$1, (Object)this.e.a()));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return du.a(this.f.c().map(acp::a), $$1);
    }

    public Collection<String> getExamples() {
        return c;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class eo$a<T>
    implements gg<eo<T>, a> {
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
        public a a(eo<T> $$0) {
            return new a($$0.e);
        }

        @Override
        public /* synthetic */ gg.a b(sf sf2) {
            return this.a(sf2);
        }

        public final class a
        implements gg.a<eo<T>> {
            final acp<? extends hr<T>> b;

            a(acp<? extends hr<T>> $$1) {
                this.b = $$1;
            }

            public eo<T> a(dm $$0) {
                return new eo($$0, this.b);
            }

            @Override
            public gg<eo<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dm dm2) {
                return this.a(dm2);
            }
        }
    }
}

