/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fu
implements ArgumentType<fv> {
    private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
    private final hg<cfu> b;

    public fu(dm $$0) {
        this.b = $$0.a(jc.D);
    }

    public static fu a(dm $$0) {
        return new fu($$0);
    }

    public fv a(StringReader $$0) throws CommandSyntaxException {
        fw.a $$1 = fw.a(this.b, $$0);
        return new fv($$1.a(), $$1.b());
    }

    public static <S> fv a(CommandContext<S> $$0, String $$1) {
        return (fv)$$0.getArgument($$1, fv.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return fw.a(this.b, $$1, false);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

