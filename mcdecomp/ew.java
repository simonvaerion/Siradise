/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ew
implements ArgumentType<Integer> {
    private static final Collection<String> a = Arrays.asList("container.5", "12", "weapon");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("slot.unknown", $$0));
    private static final Map<String, Integer> c = ac.a(Maps.newHashMap(), (T $$0) -> {
        for (int $$1 = 0; $$1 < 54; ++$$1) {
            $$0.put("container." + $$1, $$1);
        }
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            $$0.put("hotbar." + $$2, $$2);
        }
        for (int $$3 = 0; $$3 < 27; ++$$3) {
            $$0.put("inventory." + $$3, 9 + $$3);
        }
        for (int $$4 = 0; $$4 < 27; ++$$4) {
            $$0.put("enderchest." + $$4, 200 + $$4);
        }
        for (int $$5 = 0; $$5 < 8; ++$$5) {
            $$0.put("villager." + $$5, 300 + $$5);
        }
        for (int $$6 = 0; $$6 < 15; ++$$6) {
            $$0.put("horse." + $$6, 500 + $$6);
        }
        $$0.put("weapon", bfo.a.a(98));
        $$0.put("weapon.mainhand", bfo.a.a(98));
        $$0.put("weapon.offhand", bfo.b.a(98));
        $$0.put("armor.head", bfo.f.a(100));
        $$0.put("armor.chest", bfo.e.a(100));
        $$0.put("armor.legs", bfo.d.a(100));
        $$0.put("armor.feet", bfo.c.a(100));
        $$0.put("horse.saddle", 400);
        $$0.put("horse.armor", 401);
        $$0.put("horse.chest", 499);
    });

    public static ew a() {
        return new ew();
    }

    public static int a(CommandContext<ds> $$0, String $$1) {
        return (Integer)$$0.getArgument($$1, Integer.class);
    }

    public Integer a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        if (!c.containsKey($$1)) {
            throw b.create((Object)$$1);
        }
        return c.get($$1);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return du.b(c.keySet(), $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

