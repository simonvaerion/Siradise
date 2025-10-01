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
 *  com.mojang.datafixers.util.Either
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fx
implements ArgumentType<a> {
    private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
    private final hg<cfu> b;

    public fx(dm $$0) {
        this.b = $$0.a(jc.D);
    }

    public static fx a(dm $$0) {
        return new fx($$0);
    }

    public a a(StringReader $$02) throws CommandSyntaxException {
        Either<fw.a, fw.b> $$1 = fw.b(this.b, $$02);
        return (a)$$1.map($$0 -> fx.a((he<cfu> $$1) -> $$1 == $$0.a(), $$0.b()), $$0 -> fx.a($$0.a()::a, $$0.b()));
    }

    public static Predicate<cfz> a(CommandContext<ds> $$0, String $$1) {
        return (Predicate)$$0.getArgument($$1, a.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return fw.a(this.b, $$1, true);
    }

    public Collection<String> getExamples() {
        return a;
    }

    private static a a(Predicate<he<cfu>> $$0, @Nullable qr $$12) {
        return $$12 != null ? $$2 -> $$2.a($$0) && rd.a((rk)$$12, $$2.v(), true) : $$1 -> $$1.a($$0);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface a
    extends Predicate<cfz> {
    }
}

