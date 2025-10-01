/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aeh {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.b("Source is not a mob"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.b("Path not found"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.b("Target not reached"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugpath").requires($$0 -> $$0.c(2))).then(dt.a("to", fi.a()).executes($$0 -> aeh.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "to")))));
    }

    private static int a(ds $$0, gu $$1) throws CommandSyntaxException {
        bfj $$2 = $$0.f();
        if (!($$2 instanceof bgb)) {
            throw a.create();
        }
        bgb $$3 = (bgb)$$2;
        bpi $$4 = new bpi($$3, $$0.e());
        dxt $$5 = ((bpj)$$4).a($$1, 0);
        za.a((cmm)$$0.e(), $$3, $$5, $$4.r());
        if ($$5 == null) {
            throw b.create();
        }
        if (!$$5.j()) {
            throw c.create();
        }
        $$0.a(() -> sw.b("Made path"), true);
        return 1;
    }
}

