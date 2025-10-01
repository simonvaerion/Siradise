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
import java.util.concurrent.CompletableFuture;

public class el
implements ArgumentType<a> {
    private static final Collection<String> a = Arrays.asList("=", ">", "<");
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("arguments.operation.invalid"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("arguments.operation.div0"));

    public static el a() {
        return new el();
    }

    public static a a(CommandContext<ds> $$0, String $$1) {
        return (a)$$0.getArgument($$1, a.class);
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead()) {
            int $$1 = $$0.getCursor();
            while ($$0.canRead() && $$0.peek() != ' ') {
                $$0.skip();
            }
            return el.a($$0.getString().substring($$1, $$0.getCursor()));
        }
        throw b.create();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return du.a(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    private static a a(String $$02) throws CommandSyntaxException {
        if ($$02.equals("><")) {
            return ($$0, $$1) -> {
                int $$2 = $$0.b();
                $$0.b($$1.b());
                $$1.b($$2);
            };
        }
        return el.b($$02);
    }

    private static b b(String $$02) throws CommandSyntaxException {
        switch ($$02) {
            case "=": {
                return ($$0, $$1) -> $$1;
            }
            case "+=": {
                return ($$0, $$1) -> $$0 + $$1;
            }
            case "-=": {
                return ($$0, $$1) -> $$0 - $$1;
            }
            case "*=": {
                return ($$0, $$1) -> $$0 * $$1;
            }
            case "/=": {
                return ($$0, $$1) -> {
                    if ($$1 == 0) {
                        throw c.create();
                    }
                    return apa.a($$0, $$1);
                };
            }
            case "%=": {
                return ($$0, $$1) -> {
                    if ($$1 == 0) {
                        throw c.create();
                    }
                    return apa.b($$0, $$1);
                };
            }
            case "<": {
                return Math::min;
            }
            case ">": {
                return Math::max;
            }
        }
        throw b.create();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    @FunctionalInterface
    public static interface a {
        public void apply(eff var1, eff var2) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface b
    extends a {
        public int apply(int var1, int var2) throws CommandSyntaxException;

        @Override
        default public void apply(eff $$0, eff $$1) throws CommandSyntaxException {
            $$0.b(this.apply($$0.b(), $$1.b()));
        }
    }
}

