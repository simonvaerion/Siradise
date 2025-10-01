/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.gson.JsonObject
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
import com.google.common.collect.Iterables;
import com.google.gson.JsonObject;
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
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ec
implements ArgumentType<ga> {
    private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.entity.toomany"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("argument.player.toomany"));
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("argument.player.entities"));
    public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("argument.entity.notfound.entity"));
    public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("argument.entity.notfound.player"));
    public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)sw.c("argument.entity.selector.not_allowed"));
    final boolean h;
    final boolean i;

    protected ec(boolean $$0, boolean $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public static ec a() {
        return new ec(true, false);
    }

    public static bfj a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return ((ga)$$0.getArgument($$1, ga.class)).a((ds)$$0.getSource());
    }

    public static ec b() {
        return new ec(false, false);
    }

    public static Collection<? extends bfj> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        Collection<? extends bfj> $$2 = ec.c($$0, $$1);
        if ($$2.isEmpty()) {
            throw d.create();
        }
        return $$2;
    }

    public static Collection<? extends bfj> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return ((ga)$$0.getArgument($$1, ga.class)).b((ds)$$0.getSource());
    }

    public static Collection<aig> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return ((ga)$$0.getArgument($$1, ga.class)).d((ds)$$0.getSource());
    }

    public static ec c() {
        return new ec(true, true);
    }

    public static aig e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return ((ga)$$0.getArgument($$1, ga.class)).c((ds)$$0.getSource());
    }

    public static ec d() {
        return new ec(false, true);
    }

    public static Collection<aig> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        List<aig> $$2 = ((ga)$$0.getArgument($$1, ga.class)).d((ds)$$0.getSource());
        if ($$2.isEmpty()) {
            throw e.create();
        }
        return $$2;
    }

    public ga a(StringReader $$0) throws CommandSyntaxException {
        boolean $$1 = false;
        gb $$2 = new gb($$0);
        ga $$3 = $$2.t();
        if ($$3.a() > 1 && this.h) {
            if (this.i) {
                $$0.setCursor(0);
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            $$0.setCursor(0);
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        if ($$3.b() && this.i && !$$3.c()) {
            $$0.setCursor(0);
            throw c.createWithContext((ImmutableStringReader)$$0);
        }
        return $$3;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$12) {
        Object object = $$0.getSource();
        if (object instanceof du) {
            du $$2 = (du)object;
            StringReader $$3 = new StringReader($$12.getInput());
            $$3.setCursor($$12.getStart());
            gb $$4 = new gb($$3, $$2.c(2));
            try {
                $$4.t();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return $$4.a($$12, (SuggestionsBuilder $$1) -> {
                Collection<String> $$2 = $$2.q();
                Collection<String> $$3 = this.i ? $$2 : Iterables.concat($$2, $$2.y());
                du.b($$3, $$1);
            });
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return g;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class ec$a
    implements gg<ec, a> {
        private static final byte a = 1;
        private static final byte b = 2;

        @Override
        public void a(a $$0, sf $$1) {
            int $$2 = 0;
            if ($$0.b) {
                $$2 |= 1;
            }
            if ($$0.c) {
                $$2 |= 2;
            }
            $$1.writeByte($$2);
        }

        @Override
        public a a(sf $$0) {
            byte $$1 = $$0.readByte();
            return new a(($$1 & 1) != 0, ($$1 & 2) != 0);
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("amount", $$0.b ? "single" : "multiple");
            $$1.addProperty("type", $$0.c ? "players" : "entities");
        }

        @Override
        public a a(ec $$0) {
            return new a($$0.h, $$0.i);
        }

        @Override
        public /* synthetic */ gg.a b(sf sf2) {
            return this.a(sf2);
        }

        public final class a
        implements gg.a<ec> {
            final boolean b;
            final boolean c;

            a(boolean $$1, boolean $$2) {
                this.b = $$1;
                this.c = $$2;
            }

            public ec a(dm $$0) {
                return new ec(this.b, this.c);
            }

            @Override
            public gg<ec, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dm dm2) {
                return this.a(dm2);
            }
        }
    }
}

