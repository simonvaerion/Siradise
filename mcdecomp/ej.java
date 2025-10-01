/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ej
implements ArgumentType<String> {
    private static final Collection<String> a = Arrays.asList("foo", "*", "012");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("arguments.objective.notFound", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("arguments.objective.readonly", $$0));

    public static ej a() {
        return new ej();
    }

    public static efd a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        String $$2 = (String)$$0.getArgument($$1, String.class);
        adg $$3 = ((ds)$$0.getSource()).l().aF();
        efd $$4 = $$3.d($$2);
        if ($$4 == null) {
            throw b.create((Object)$$2);
        }
        return $$4;
    }

    public static efd b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        efd $$2 = ej.a($$0, $$1);
        if ($$2.c().e()) {
            throw c.create((Object)$$2.b());
        }
        return $$2;
    }

    public String a(StringReader $$0) throws CommandSyntaxException {
        return $$0.readUnquotedString();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        Object $$2 = $$0.getSource();
        if ($$2 instanceof ds) {
            ds $$3 = (ds)$$2;
            return du.b($$3.l().aF().d(), $$1);
        }
        if ($$2 instanceof du) {
            du $$4 = (du)$$2;
            return $$4.a($$0);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

