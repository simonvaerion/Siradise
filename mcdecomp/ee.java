/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ee
implements ArgumentType<a> {
    private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.player.unknown"));

    public static Collection<GameProfile> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return ((a)$$0.getArgument($$1, a.class)).getNames((ds)$$0.getSource());
    }

    public static ee a() {
        return new ee();
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '@') {
            gb $$12 = new gb($$0);
            ga $$2 = $$12.t();
            if ($$2.b()) {
                throw ec.c.create();
            }
            return new b($$2);
        }
        int $$3 = $$0.getCursor();
        while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
        }
        String $$4 = $$0.getString().substring($$3, $$0.getCursor());
        return $$1 -> {
            Optional<GameProfile> $$2 = $$1.l().ap().a($$4);
            return Collections.singleton($$2.orElseThrow(() -> ((SimpleCommandExceptionType)a).create()));
        };
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$12) {
        if ($$0.getSource() instanceof du) {
            StringReader $$2 = new StringReader($$12.getInput());
            $$2.setCursor($$12.getStart());
            gb $$3 = new gb($$2);
            try {
                $$3.t();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return $$3.a($$12, $$1 -> du.b(((du)$$0.getSource()).q(), $$1));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    @FunctionalInterface
    public static interface a {
        public Collection<GameProfile> getNames(ds var1) throws CommandSyntaxException;
    }

    public static class b
    implements a {
        private final ga a;

        public b(ga $$0) {
            this.a = $$0;
        }

        @Override
        public Collection<GameProfile> getNames(ds $$0) throws CommandSyntaxException {
            List<aig> $$1 = this.a.d($$0);
            if ($$1.isEmpty()) {
                throw ec.e.create();
            }
            ArrayList $$2 = Lists.newArrayList();
            for (aig $$3 : $$1) {
                $$2.add($$3.fM());
            }
            return $$2;
        }
    }
}

