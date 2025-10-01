/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class gk {
    private static final Map<acq, SuggestionProvider<du>> e = Maps.newHashMap();
    private static final acq f = new acq("ask_server");
    public static final SuggestionProvider<du> a = gk.a(f, (SuggestionProvider<du>)((SuggestionProvider)($$0, $$1) -> ((du)$$0.getSource()).a($$0)));
    public static final SuggestionProvider<ds> b = gk.a(new acq("all_recipes"), (SuggestionProvider<du>)((SuggestionProvider)($$0, $$1) -> du.a(((du)$$0.getSource()).t(), $$1)));
    public static final SuggestionProvider<ds> c = gk.a(new acq("available_sounds"), (SuggestionProvider<du>)((SuggestionProvider)($$0, $$1) -> du.a(((du)$$0.getSource()).s(), $$1)));
    public static final SuggestionProvider<ds> d = gk.a(new acq("summonable_entities"), (SuggestionProvider<du>)((SuggestionProvider)($$02, $$12) -> du.a(jb.h.s().filter($$1 -> $$1.a(((du)$$02.getSource()).w()) && $$1.c()), $$12, bfn::a, $$0 -> sw.c(ac.a("entity", bfn.a($$0))))));

    public static <S extends du> SuggestionProvider<S> a(acq $$0, SuggestionProvider<du> $$1) {
        if (e.containsKey($$0)) {
            throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
        }
        e.put($$0, $$1);
        return new a($$0, $$1);
    }

    public static SuggestionProvider<du> a(acq $$0) {
        return e.getOrDefault($$0, a);
    }

    public static acq a(SuggestionProvider<du> $$0) {
        if ($$0 instanceof a) {
            return ((a)$$0).b;
        }
        return f;
    }

    public static SuggestionProvider<du> b(SuggestionProvider<du> $$0) {
        if ($$0 instanceof a) {
            return $$0;
        }
        return a;
    }

    protected static class a
    implements SuggestionProvider<du> {
        private final SuggestionProvider<du> a;
        final acq b;

        public a(acq $$0, SuggestionProvider<du> $$1) {
            this.a = $$1;
            this.b = $$0;
        }

        public CompletableFuture<Suggestions> getSuggestions(CommandContext<du> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
            return this.a.getSuggestions($$0, $$1);
        }
    }
}

