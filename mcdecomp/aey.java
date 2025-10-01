/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aey {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.jfr.start.failed"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.jfr.dump.failed", $$0));

    private aey() {
    }

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("jfr").requires($$0 -> $$0.c(4))).then(dt.a("start").executes($$0 -> aey.a((ds)$$0.getSource())))).then(dt.a("stop").executes($$0 -> aey.b((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) throws CommandSyntaxException {
        bar $$1 = bar.a($$0.l());
        if (!bat.e.a($$1)) {
            throw a.create();
        }
        $$0.a(() -> sw.c("commands.jfr.started"), false);
        return 1;
    }

    private static int b(ds $$0) throws CommandSyntaxException {
        try {
            Path $$12 = Paths.get(".", new String[0]).relativize(bat.e.b().normalize());
            Path $$2 = !$$0.l().p() || aa.aS ? $$12.toAbsolutePath() : $$12;
            tj $$3 = sw.b($$12.toString()).a(n.t).a($$1 -> $$1.a(new su(su.a.f, $$2.toString())).a(new tb(tb.a.a, sw.c("chat.copy.click"))));
            $$0.a(() -> sw.a("commands.jfr.stopped", $$3), false);
            return 1;
        }
        catch (Throwable $$4) {
            throw b.create((Object)$$4.getMessage());
        }
    }
}

