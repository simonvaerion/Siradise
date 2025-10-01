/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class fp
implements ArgumentType<fk> {
    private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.pos3d.incomplete"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("argument.pos.mixed"));
    private final boolean d;

    public fp(boolean $$0) {
        this.d = $$0;
    }

    public static fp a() {
        return new fp(true);
    }

    public static fp a(boolean $$0) {
        return new fp($$0);
    }

    public static eei a(CommandContext<ds> $$0, String $$1) {
        return ((fk)$$0.getArgument($$1, fk.class)).a((ds)$$0.getSource());
    }

    public static fk b(CommandContext<ds> $$0, String $$1) {
        return (fk)$$0.getArgument($$1, fk.class);
    }

    public fk a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '^') {
            return fl.a($$0);
        }
        return fr.a($$0, this.d);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof du) {
            Collection<du.b> $$4;
            String $$2 = $$1.getRemaining();
            if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
                Set<du.b> $$3 = Collections.singleton(du.b.a);
            } else {
                $$4 = ((du)$$0.getSource()).A();
            }
            return du.a($$2, $$4, $$1, dt.a(this::a));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return c;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

