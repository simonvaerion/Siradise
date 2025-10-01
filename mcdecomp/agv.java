/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class agv {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.center.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.set.failed.nochange"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.set.failed.small"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.a("commands.worldborder.set.failed.big", 5.9999968E7));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.a("commands.worldborder.set.failed.far", 2.9999984E7));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.warning.time.failed"));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.warning.distance.failed"));
    private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.damage.buffer.failed"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)sw.c("commands.worldborder.damage.amount.failed"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("worldborder").requires($$0 -> $$0.c(2))).then(dt.a("add").then(((RequiredArgumentBuilder)dt.a("distance", DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes($$0 -> agv.a((ds)$$0.getSource(), ((ds)$$0.getSource()).e().w_().i() + DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), 0L))).then(dt.a("time", IntegerArgumentType.integer((int)0)).executes($$0 -> agv.a((ds)$$0.getSource(), ((ds)$$0.getSource()).e().w_().i() + DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), ((ds)$$0.getSource()).e().w_().j() + (long)IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time") * 1000L)))))).then(dt.a("set").then(((RequiredArgumentBuilder)dt.a("distance", DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes($$0 -> agv.a((ds)$$0.getSource(), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), 0L))).then(dt.a("time", IntegerArgumentType.integer((int)0)).executes($$0 -> agv.a((ds)$$0.getSource(), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), (long)IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time") * 1000L)))))).then(dt.a("center").then(dt.a("pos", fo.a()).executes($$0 -> agv.a((ds)$$0.getSource(), fo.a((CommandContext<ds>)$$0, "pos")))))).then(((LiteralArgumentBuilder)dt.a("damage").then(dt.a("amount").then(dt.a("damagePerBlock", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> agv.b((ds)$$0.getSource(), FloatArgumentType.getFloat((CommandContext)$$0, (String)"damagePerBlock")))))).then(dt.a("buffer").then(dt.a("distance", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> agv.a((ds)$$0.getSource(), FloatArgumentType.getFloat((CommandContext)$$0, (String)"distance"))))))).then(dt.a("get").executes($$0 -> agv.a((ds)$$0.getSource())))).then(((LiteralArgumentBuilder)dt.a("warning").then(dt.a("distance").then(dt.a("distance", IntegerArgumentType.integer((int)0)).executes($$0 -> agv.b((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"distance")))))).then(dt.a("time").then(dt.a("time", IntegerArgumentType.integer((int)0)).executes($$0 -> agv.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))));
    }

    private static int a(ds $$0, float $$1) throws CommandSyntaxException {
        dds $$2 = $$0.l().D().w_();
        if ($$2.n() == (double)$$1) {
            throw h.create();
        }
        $$2.b($$1);
        $$0.a(() -> sw.a("commands.worldborder.damage.buffer.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$1))}), true);
        return (int)$$1;
    }

    private static int b(ds $$0, float $$1) throws CommandSyntaxException {
        dds $$2 = $$0.l().D().w_();
        if ($$2.o() == (double)$$1) {
            throw i.create();
        }
        $$2.c($$1);
        $$0.a(() -> sw.a("commands.worldborder.damage.amount.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$1))}), true);
        return (int)$$1;
    }

    private static int a(ds $$0, int $$1) throws CommandSyntaxException {
        dds $$2 = $$0.l().D().w_();
        if ($$2.q() == $$1) {
            throw f.create();
        }
        $$2.b($$1);
        $$0.a(() -> sw.a("commands.worldborder.warning.time.success", $$1), true);
        return $$1;
    }

    private static int b(ds $$0, int $$1) throws CommandSyntaxException {
        dds $$2 = $$0.l().D().w_();
        if ($$2.r() == $$1) {
            throw g.create();
        }
        $$2.c($$1);
        $$0.a(() -> sw.a("commands.worldborder.warning.distance.success", $$1), true);
        return $$1;
    }

    private static int a(ds $$0) {
        double $$1 = $$0.l().D().w_().i();
        $$0.a(() -> sw.a("commands.worldborder.get", new Object[]{String.format(Locale.ROOT, "%.0f", $$1)}), false);
        return apa.a($$1 + 0.5);
    }

    private static int a(ds $$0, eeh $$1) throws CommandSyntaxException {
        dds $$2 = $$0.l().D().w_();
        if ($$2.a() == (double)$$1.i && $$2.b() == (double)$$1.j) {
            throw a.create();
        }
        if ((double)Math.abs($$1.i) > 2.9999984E7 || (double)Math.abs($$1.j) > 2.9999984E7) {
            throw e.create();
        }
        $$2.c($$1.i, $$1.j);
        $$0.a(() -> sw.a("commands.worldborder.center.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$0.i)), String.format(Locale.ROOT, "%.2f", Float.valueOf($$0.j))}), true);
        return 0;
    }

    private static int a(ds $$0, double $$1, long $$2) throws CommandSyntaxException {
        dds $$3 = $$0.l().D().w_();
        double $$4 = $$3.i();
        if ($$4 == $$1) {
            throw b.create();
        }
        if ($$1 < 1.0) {
            throw c.create();
        }
        if ($$1 > 5.9999968E7) {
            throw d.create();
        }
        if ($$2 > 0L) {
            $$3.a($$4, $$1, $$2);
            if ($$1 > $$4) {
                $$0.a(() -> sw.a("commands.worldborder.set.grow", new Object[]{String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)}), true);
            } else {
                $$0.a(() -> sw.a("commands.worldborder.set.shrink", new Object[]{String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)}), true);
            }
        } else {
            $$3.a($$1);
            $$0.a(() -> sw.a("commands.worldborder.set.immediate", new Object[]{String.format(Locale.ROOT, "%.1f", $$1)}), true);
        }
        return (int)($$1 - $$4);
    }
}

