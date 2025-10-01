/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class afj {
    private static final Logger a = LogUtils.getLogger();
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("commands.perf.notRunning"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("commands.perf.alreadyRunning"));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("perf").requires($$0 -> $$0.c(4))).then(dt.a("start").executes($$0 -> afj.a((ds)$$0.getSource())))).then(dt.a("stop").executes($$0 -> afj.b((ds)$$0.getSource()))));
    }

    private static int a(ds $$0) throws CommandSyntaxException {
        MinecraftServer $$12 = $$0.l();
        if ($$12.aO()) {
            throw c.create();
        }
        Consumer<bam> $$22 = $$1 -> afj.a($$0, $$1);
        Consumer<Path> $$3 = $$2 -> afj.a($$0, $$2, $$12);
        $$12.a($$22, $$3);
        $$0.a(() -> sw.c("commands.perf.started"), false);
        return 0;
    }

    private static int b(ds $$0) throws CommandSyntaxException {
        MinecraftServer $$1 = $$0.l();
        if (!$$1.aO()) {
            throw b.create();
        }
        $$1.aQ();
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void a(ds $$0, Path $$1, MinecraftServer $$2) {
        void $$6;
        String $$3 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2.aU().g(), aa.b().b());
        try {
            String $$4 = v.a(bcd.a, $$3, ".zip");
        }
        catch (IOException $$5) {
            $$0.b(sw.c("commands.perf.reportFailed"));
            a.error("Failed to create report name", (Throwable)$$5);
            return;
        }
        try (aol $$7 = new aol(bcd.a.resolve((String)$$6));){
            $$7.a(Paths.get("system.txt", new String[0]), $$2.b(new ab()).a());
            $$7.a($$1);
        }
        try {
            FileUtils.forceDelete((File)$$1.toFile());
        }
        catch (IOException $$8) {
            a.warn("Failed to delete temporary profiling file {}", (Object)$$1, (Object)$$8);
        }
        $$0.a(() -> afj.a((String)$$6), false);
    }

    private static void a(ds $$0, bam $$1) {
        if ($$1 == bai.a) {
            return;
        }
        int $$2 = $$1.f();
        double $$3 = (double)$$1.g() / (double)apw.a;
        $$0.a(() -> sw.a("commands.perf.stopped", new Object[]{String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)}), false);
    }

    private static /* synthetic */ sw a(String $$0) {
        return sw.a("commands.perf.reportSaved", new Object[]{$$0});
    }
}

