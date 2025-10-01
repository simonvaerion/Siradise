/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.OptionalInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class aes {
    public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
        ade $$2 = ((ds)$$0.getSource()).l().aA();
        du.a($$2.f(), $$1, "#");
        return du.a($$2.e(), $$1);
    };

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("function").requires($$0 -> $$0.c(2))).then(dt.a("name", ft.a()).suggests(a).executes($$0 -> aes.a((ds)$$0.getSource(), ft.a((CommandContext<ds>)$$0, "name")))));
    }

    private static int a(ds $$0, Collection<dn> $$12) {
        int $$2 = 0;
        boolean $$3 = false;
        for (dn $$4 : $$12) {
            MutableObject $$5 = new MutableObject((Object)OptionalInt.empty());
            int $$6 = $$0.l().aA().a($$4, $$0.a().b(2).a($$1 -> $$5.setValue((Object)OptionalInt.of($$1))));
            OptionalInt $$7 = (OptionalInt)$$5.getValue();
            $$2 += $$7.orElse($$6);
            $$3 |= $$7.isPresent();
        }
        int $$8 = $$2;
        if ($$12.size() == 1) {
            if ($$3) {
                $$0.a(() -> sw.a("commands.function.success.single.result", $$8, ((dn)$$12.iterator().next()).a()), true);
            } else {
                $$0.a(() -> sw.a("commands.function.success.single", $$8, ((dn)$$12.iterator().next()).a()), true);
            }
        } else if ($$3) {
            $$0.a(() -> sw.a("commands.function.success.multiple.result", $$12.size()), true);
        } else {
            $$0.a(() -> sw.a("commands.function.success.multiple", $$8, $$12.size()), true);
        }
        return $$2;
    }
}

