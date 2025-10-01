/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class agu {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.whitelist.alreadyOn"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.whitelist.alreadyOff"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.whitelist.add.failed"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.whitelist.remove.failed"));

    public static void a(CommandDispatcher<ds> $$03) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("whitelist").requires($$0 -> $$0.c(3))).then(dt.a("on").executes($$0 -> agu.b((ds)$$0.getSource())))).then(dt.a("off").executes($$0 -> agu.c((ds)$$0.getSource())))).then(dt.a("list").executes($$0 -> agu.d((ds)$$0.getSource())))).then(dt.a("add").then(dt.a("targets", ee.a()).suggests(($$02, $$12) -> {
            alk $$2 = ((ds)$$02.getSource()).l().ac();
            return du.b($$2.t().stream().filter($$1 -> !$$2.i().a($$1.fM())).map($$0 -> $$0.fM().getName()), $$12);
        }).executes($$0 -> agu.a((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets")))))).then(dt.a("remove").then(dt.a("targets", ee.a()).suggests(($$0, $$1) -> du.a(((ds)$$0.getSource()).l().ac().j(), $$1)).executes($$0 -> agu.b((ds)$$0.getSource(), ee.a((CommandContext<ds>)$$0, "targets")))))).then(dt.a("reload").executes($$0 -> agu.a((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) {
        $$0.l().ac().a();
        $$0.a(() -> sw.c("commands.whitelist.reloaded"), true);
        $$0.l().a($$0);
        return 1;
    }

    private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
        als $$2 = $$0.l().ac().i();
        int $$3 = 0;
        for (GameProfile $$4 : $$1) {
            if ($$2.a($$4)) continue;
            alt $$5 = new alt($$4);
            $$2.a($$5);
            $$0.a(() -> sw.a("commands.whitelist.add.success", sy.a($$4)), true);
            ++$$3;
        }
        if ($$3 == 0) {
            throw c.create();
        }
        return $$3;
    }

    private static int b(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
        als $$2 = $$0.l().ac().i();
        int $$3 = 0;
        for (GameProfile $$4 : $$1) {
            if (!$$2.a($$4)) continue;
            alt $$5 = new alt($$4);
            $$2.b($$5);
            $$0.a(() -> sw.a("commands.whitelist.remove.success", sy.a($$4)), true);
            ++$$3;
        }
        if ($$3 == 0) {
            throw d.create();
        }
        $$0.l().a($$0);
        return $$3;
    }

    private static int b(ds $$0) throws CommandSyntaxException {
        alk $$1 = $$0.l().ac();
        if ($$1.o()) {
            throw a.create();
        }
        $$1.a(true);
        $$0.a(() -> sw.c("commands.whitelist.enabled"), true);
        $$0.l().a($$0);
        return 1;
    }

    private static int c(ds $$0) throws CommandSyntaxException {
        alk $$1 = $$0.l().ac();
        if (!$$1.o()) {
            throw b.create();
        }
        $$1.a(false);
        $$0.a(() -> sw.c("commands.whitelist.disabled"), true);
        return 1;
    }

    private static int d(ds $$0) {
        String[] $$1 = $$0.l().ac().j();
        if ($$1.length == 0) {
            $$0.a(() -> sw.c("commands.whitelist.none"), false);
        } else {
            $$0.a(() -> sw.a("commands.whitelist.list", $$1.length, String.join((CharSequence)", ", $$1)), false);
        }
        return $$1.length;
    }
}

