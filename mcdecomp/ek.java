/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ek
implements ArgumentType<efj> {
    private static final Collection<String> b = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("argument.criteria.invalid", $$0));

    private ek() {
    }

    public static ek a() {
        return new ek();
    }

    public static efj a(CommandContext<ds> $$0, String $$1) {
        return (efj)$$0.getArgument($$1, efj.class);
    }

    public efj a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
        }
        String $$2 = $$0.getString().substring($$1, $$0.getCursor());
        return efj.a($$2).orElseThrow(() -> {
            $$0.setCursor($$1);
            return a.create((Object)$$2);
        });
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        ArrayList $$2 = Lists.newArrayList(efj.c());
        for (amq amq2 : jb.y) {
            for (Object $$4 : amq2.a()) {
                String $$5 = this.a(amq2, $$4);
                $$2.add($$5);
            }
        }
        return du.b($$2, $$1);
    }

    public <T> String a(amq<T> $$0, Object $$1) {
        return amo.a($$0, $$1);
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

