/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class qj
implements ArgumentType<qi> {
    private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

    public qi a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        Optional<qi> $$2 = pt.e($$1);
        if ($$2.isPresent()) {
            return $$2.get();
        }
        tj $$3 = sw.b("No such test: " + $$1);
        throw new CommandSyntaxException((CommandExceptionType)new SimpleCommandExceptionType((Message)$$3), (Message)$$3);
    }

    public static qj a() {
        return new qj();
    }

    public static qi a(CommandContext<ds> $$0, String $$1) {
        return (qi)$$0.getArgument($$1, qi.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        Stream<String> $$2 = pt.a().stream().map(qi::a);
        return du.b($$2, $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

