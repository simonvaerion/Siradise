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
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ea
implements ArgumentType<acq> {
    private static final Collection<String> a = Stream.of(cmm.h, cmm.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("argument.dimension.invalid", $$0));

    public acq a(StringReader $$0) throws CommandSyntaxException {
        return acq.a($$0);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof du) {
            return du.a(((du)$$0.getSource()).u().stream().map(acp::a), $$1);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public static ea a() {
        return new ea();
    }

    public static aif a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        acq $$2 = (acq)$$0.getArgument($$1, acq.class);
        acp<cmm> $$3 = acp.a(jc.aH, $$2);
        aif $$4 = ((ds)$$0.getSource()).l().a($$3);
        if ($$4 == null) {
            throw b.create((Object)$$2);
        }
        return $$4;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

