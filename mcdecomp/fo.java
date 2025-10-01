/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.ImmutableStringReader;
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

public class fo
implements ArgumentType<fk> {
    private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.pos2d.incomplete"));
    private final boolean c;

    public fo(boolean $$0) {
        this.c = $$0;
    }

    public static fo a() {
        return new fo(true);
    }

    public static fo a(boolean $$0) {
        return new fo($$0);
    }

    public static eeh a(CommandContext<ds> $$0, String $$1) {
        eei $$2 = ((fk)$$0.getArgument($$1, fk.class)).a((ds)$$0.getSource());
        return new eeh((float)$$2.c, (float)$$2.e);
    }

    public fk a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        fq $$2 = fq.a($$0, this.c);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        fq $$3 = fq.a($$0, this.c);
        return new fr($$2, new fq(true, 0.0), $$3);
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
            return du.b($$2, $$4, $$1, dt.a(this::a));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

