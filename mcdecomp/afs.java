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
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class afs {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.ride.not_riding", $$0));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.ride.already_riding", $$0, $$1));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.ride.mount.failure.generic", $$0, $$1));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("commands.ride.mount.failure.cant_ride_players"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("commands.ride.mount.failure.loop"));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)sw.c("commands.ride.mount.failure.wrong_dimension"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ride").requires($$0 -> $$0.c(2))).then(((RequiredArgumentBuilder)dt.a("target", ec.a()).then(dt.a("mount").then(dt.a("vehicle", ec.a()).executes($$0 -> afs.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"), ec.a((CommandContext<ds>)$$0, "vehicle")))))).then(dt.a("dismount").executes($$0 -> afs.a((ds)$$0.getSource(), ec.a((CommandContext<ds>)$$0, "target"))))));
    }

    private static int a(ds $$0, bfj $$12, bfj $$2) throws CommandSyntaxException {
        bfj $$3 = $$12.cW();
        if ($$3 != null) {
            throw b.create((Object)$$12.H_(), (Object)$$3.H_());
        }
        if ($$2.ae() == bfn.bt) {
            throw d.create();
        }
        if ($$12.cP().anyMatch($$1 -> $$1 == $$2)) {
            throw e.create();
        }
        if ($$12.dI() != $$2.dI()) {
            throw f.create();
        }
        if (!$$12.a($$2, true)) {
            throw c.create((Object)$$12.H_(), (Object)$$2.H_());
        }
        $$0.a(() -> sw.a("commands.ride.mount.success", $$12.H_(), $$2.H_()), true);
        return 1;
    }

    private static int a(ds $$0, bfj $$1) throws CommandSyntaxException {
        bfj $$2 = $$1.cW();
        if ($$2 == null) {
            throw a.create((Object)$$1.H_());
        }
        $$1.Y();
        $$0.a(() -> sw.a("commands.ride.dismount.success", $$1.H_(), $$2.H_()), true);
        return 1;
    }
}

