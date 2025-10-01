/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class afu {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.save.alreadyOff"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("save-off").requires($$0 -> $$0.c(4))).executes($$0 -> {
            ds $$1 = (ds)$$0.getSource();
            boolean $$2 = false;
            for (aif $$3 : $$1.l().F()) {
                if ($$3 == null || $$3.e) continue;
                $$3.e = true;
                $$2 = true;
            }
            if (!$$2) {
                throw a.create();
            }
            $$1.a(() -> sw.c("commands.save.disabled"), true);
            return 1;
        }));
    }
}

