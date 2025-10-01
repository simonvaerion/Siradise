/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aft {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.save.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("save-all").requires($$0 -> $$0.c(4))).executes($$0 -> aft.a((ds)$$0.getSource(), false))).then(dt.a("flush").executes($$0 -> aft.a((ds)$$0.getSource(), true))));
    }

    private static int a(ds $$0, boolean $$1) throws CommandSyntaxException {
        $$0.a(() -> sw.c("commands.save.saving"), false);
        MinecraftServer $$2 = $$0.l();
        boolean $$3 = $$2.b(true, $$1, true);
        if (!$$3) {
            throw a.create();
        }
        $$0.a(() -> sw.c("commands.save.success"), true);
        return 1;
    }
}

