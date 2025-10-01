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
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fe
implements ArgumentType<b> {
    private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
    private final hg<cpn> b;

    public fe(dm $$0) {
        this.b = $$0.a(jc.e);
    }

    public static fe a(dm $$0) {
        return new fe($$0);
    }

    public b a(StringReader $$0) throws CommandSyntaxException {
        return fe.a(this.b, $$0);
    }

    public static b a(hg<cpn> $$02, StringReader $$1) throws CommandSyntaxException {
        return (b)fg.b($$02, $$1, true).map($$0 -> new a($$0.a(), $$0.b().keySet(), $$0.c()), $$0 -> new c($$0.a(), $$0.b(), $$0.c()));
    }

    public static Predicate<dcf> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return (Predicate)$$0.getArgument($$1, b.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return fg.a(this.b, $$1, true, true);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface b
    extends Predicate<dcf> {
        public boolean a();
    }

    static class c
    implements b {
        private final hi<cpn> a;
        @Nullable
        private final qr b;
        private final Map<String, String> c;

        c(hi<cpn> $$0, Map<String, String> $$1, @Nullable qr $$2) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
        }

        public boolean a(dcf $$0) {
            dcb $$1 = $$0.a();
            if (!$$1.a(this.a)) {
                return false;
            }
            for (Map.Entry<String, String> $$2 : this.c.entrySet()) {
                dde<?> $$3 = $$1.b().l().a($$2.getKey());
                if ($$3 == null) {
                    return false;
                }
                Comparable $$4 = $$3.b($$2.getValue()).orElse(null);
                if ($$4 == null) {
                    return false;
                }
                if ($$1.c($$3) == $$4) continue;
                return false;
            }
            if (this.b != null) {
                czn $$5 = $$0.b();
                return $$5 != null && rd.a((rk)this.b, $$5.m(), true);
            }
            return true;
        }

        @Override
        public boolean a() {
            return this.b != null;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((dcf)object);
        }
    }

    static class a
    implements b {
        private final dcb a;
        private final Set<dde<?>> b;
        @Nullable
        private final qr c;

        public a(dcb $$0, Set<dde<?>> $$1, @Nullable qr $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a(dcf $$0) {
            dcb $$1 = $$0.a();
            if (!$$1.a(this.a.b())) {
                return false;
            }
            for (dde<?> $$2 : this.b) {
                if ($$1.c($$2) == this.a.c($$2)) continue;
                return false;
            }
            if (this.c != null) {
                czn $$3 = $$0.b();
                return $$3 != null && rd.a((rk)this.c, $$3.m(), true);
            }
            return true;
        }

        @Override
        public boolean a() {
            return this.c != null;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((dcf)object);
        }
    }
}

