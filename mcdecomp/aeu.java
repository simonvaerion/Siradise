/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aeu {
    public static void a(CommandDispatcher<ds> $$02) {
        final LiteralArgumentBuilder $$1 = (LiteralArgumentBuilder)dt.a("gamerule").requires($$0 -> $$0.c(2));
        cmi.a(new cmi.c(){

            @Override
            public <T extends cmi.g<T>> void a(cmi.e<T> $$0, cmi.f<T> $$12) {
                $$1.then(((LiteralArgumentBuilder)dt.a($$0.a()).executes($$1 -> aeu.a((ds)$$1.getSource(), $$0))).then($$12.a("value").executes($$1 -> aeu.a((CommandContext<ds>)$$1, $$0))));
            }
        });
        $$02.register($$1);
    }

    static <T extends cmi.g<T>> int a(CommandContext<ds> $$0, cmi.e<T> $$1) {
        ds $$2 = (ds)$$0.getSource();
        Object $$3 = $$2.l().aI().a($$1);
        ((cmi.g)$$3).b($$0, "value");
        $$2.a(() -> sw.a("commands.gamerule.set", new Object[]{$$1.a(), $$3.toString()}), true);
        return ((cmi.g)$$3).c();
    }

    static <T extends cmi.g<T>> int a(ds $$0, cmi.e<T> $$1) {
        Object $$2 = $$0.l().aI().a($$1);
        $$0.a(() -> sw.a("commands.gamerule.query", new Object[]{$$1.a(), $$2.toString()}), false);
        return ((cmi.g)$$2).c();
    }
}

