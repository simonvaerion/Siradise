/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aej {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.difficulty.failure", $$0));

    public static void a(CommandDispatcher<ds> $$02) {
        LiteralArgumentBuilder<ds> $$12 = dt.a("difficulty");
        for (bdu $$2 : bdu.values()) {
            $$12.then(dt.a($$2.e()).executes($$1 -> aej.a((ds)$$1.getSource(), $$2)));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$12.requires($$0 -> $$0.c(2))).executes($$0 -> {
            bdu $$1 = ((ds)$$0.getSource()).e().ai();
            ((ds)$$0.getSource()).a(() -> sw.a("commands.difficulty.query", $$1.b()), false);
            return $$1.a();
        }));
    }

    public static int a(ds $$0, bdu $$1) throws CommandSyntaxException {
        MinecraftServer $$2 = $$0.l();
        if ($$2.aU().s() == $$1) {
            throw a.create((Object)$$1.e());
        }
        $$2.a($$1, true);
        $$0.a(() -> sw.a("commands.difficulty.success", $$1.b()), true);
        return 0;
    }
}

