/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aga {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.setblock.failed"));

    public static void a(CommandDispatcher<ds> $$03, dm $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setblock").requires($$0 -> $$0.c(2))).then(dt.a("pos", fi.a()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("block", ff.a($$1)).executes($$0 -> aga.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ff.a((CommandContext<ds>)$$0, "block"), b.a, null))).then(dt.a("destroy").executes($$0 -> aga.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ff.a((CommandContext<ds>)$$0, "block"), b.b, null)))).then(dt.a("keep").executes($$02 -> aga.a((ds)$$02.getSource(), fi.a((CommandContext<ds>)$$02, "pos"), ff.a((CommandContext<ds>)$$02, "block"), b.a, $$0 -> $$0.c().t($$0.d()))))).then(dt.a("replace").executes($$0 -> aga.a((ds)$$0.getSource(), fi.a((CommandContext<ds>)$$0, "pos"), ff.a((CommandContext<ds>)$$0, "block"), b.a, null))))));
    }

    private static int a(ds $$0, gu $$1, fd $$2, b $$3, @Nullable Predicate<dcf> $$4) throws CommandSyntaxException {
        boolean $$8;
        aif $$5 = $$0.e();
        if ($$4 != null && !$$4.test(new dcf($$5, $$1, true))) {
            throw a.create();
        }
        if ($$3 == b.b) {
            $$5.b($$1, true);
            boolean $$6 = !$$2.a().i() || !$$5.a_($$1).i();
        } else {
            czn $$7 = $$5.c_($$1);
            bdo.a_($$7);
            $$8 = true;
        }
        if ($$8 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
        }
        $$5.b($$1, $$2.a().b());
        $$0.a(() -> sw.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
        return 1;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = aga$b.a();
        }
    }

    public static interface a {
        @Nullable
        public fd filter(drs var1, gu var2, fd var3, aif var4);
    }
}

