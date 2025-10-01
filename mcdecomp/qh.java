/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class qh {
    private static final int a = 200;
    private static final int b = 1024;
    private static final int c = 15;
    private static final int d = 200;
    private static final int e = 3;
    private static final int f = 10000;
    private static final int g = 5;
    private static final int h = 5;
    private static final int i = 5;

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("test").then(dt.a("runthis").executes($$0 -> qh.a((ds)$$0.getSource())))).then(dt.a("runthese").executes($$0 -> qh.b((ds)$$0.getSource())))).then(((LiteralArgumentBuilder)dt.a("runfailed").executes($$0 -> qh.a((ds)$$0.getSource(), false, 0, 8))).then(((RequiredArgumentBuilder)dt.a("onlyRequiredTests", BoolArgumentType.bool()).executes($$0 -> qh.a((ds)$$0.getSource(), BoolArgumentType.getBool((CommandContext)$$0, (String)"onlyRequiredTests"), 0, 8))).then(((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), BoolArgumentType.getBool((CommandContext)$$0, (String)"onlyRequiredTests"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), 8))).then(dt.a("testsPerRow", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), BoolArgumentType.getBool((CommandContext)$$0, (String)"onlyRequiredTests"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"testsPerRow")))))))).then(dt.a("run").then(((RequiredArgumentBuilder)dt.a("testName", qj.a()).executes($$0 -> qh.a((ds)$$0.getSource(), qj.a((CommandContext<ds>)$$0, "testName"), 0))).then(dt.a("rotationSteps", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), qj.a((CommandContext<ds>)$$0, "testName"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("runall").executes($$0 -> qh.a((ds)$$0.getSource(), 0, 8))).then(((RequiredArgumentBuilder)dt.a("testClassName", qg.a()).executes($$0 -> qh.a((ds)$$0.getSource(), qg.a((CommandContext<ds>)$$0, "testClassName"), 0, 8))).then(((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), qg.a((CommandContext<ds>)$$0, "testClassName"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), 8))).then(dt.a("testsPerRow", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), qg.a((CommandContext<ds>)$$0, "testClassName"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"testsPerRow"))))))).then(((RequiredArgumentBuilder)dt.a("rotationSteps", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), 8))).then(dt.a("testsPerRow", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"testsPerRow"))))))).then(dt.a("export").then(dt.a("testName", StringArgumentType.word()).executes($$0 -> qh.c((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"testName")))))).then(dt.a("exportthis").executes($$0 -> qh.c((ds)$$0.getSource())))).then(dt.a("import").then(dt.a("testName", StringArgumentType.word()).executes($$0 -> qh.d((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"testName")))))).then(((LiteralArgumentBuilder)dt.a("pos").executes($$0 -> qh.a((ds)$$0.getSource(), "pos"))).then(dt.a("var", StringArgumentType.word()).executes($$0 -> qh.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"var")))))).then(dt.a("create").then(((RequiredArgumentBuilder)dt.a("testName", StringArgumentType.word()).executes($$0 -> qh.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"testName"), 5, 5, 5))).then(((RequiredArgumentBuilder)dt.a("width", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"testName"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width")))).then(dt.a("height", IntegerArgumentType.integer()).then(dt.a("depth", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"testName"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"height"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"depth"))))))))).then(((LiteralArgumentBuilder)dt.a("clearall").executes($$0 -> qh.a((ds)$$0.getSource(), 200))).then(dt.a("radius", IntegerArgumentType.integer()).executes($$0 -> qh.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"radius"))))));
    }

    private static int a(ds $$0, String $$1, int $$2, int $$3, int $$4) {
        if ($$2 > 48 || $$3 > 48 || $$4 > 48) {
            throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
        }
        aif $$5 = $$0.e();
        gu $$6 = gu.a($$0.d());
        gu $$7 = new gu($$6.u(), $$0.e().a(dhk.a.b, $$6).v(), $$6.w() + 3);
        qe.a($$1.toLowerCase(), $$7, new hz($$2, $$3, $$4), cvz.a, $$5);
        for (int $$8 = 0; $$8 < $$2; ++$$8) {
            for (int $$9 = 0; $$9 < $$4; ++$$9) {
                gu $$10 = new gu($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
                cpn $$11 = cpo.h;
                fd $$12 = new fd($$11.n(), Collections.emptySet(), null);
                $$12.a($$5, $$10, 2);
            }
        }
        qe.a($$7, new gu(1, 0, -1), cvz.a, $$5);
        return 0;
    }

    private static int a(ds $$0, String $$1) throws CommandSyntaxException {
        aif $$4;
        eee $$2 = (eee)$$0.h().a(10.0, 1.0f, false);
        gu $$3 = $$2.a();
        Optional<gu> $$5 = qe.a($$3, 15, $$4 = $$0.e());
        if (!$$5.isPresent()) {
            $$5 = qe.a($$3, 200, $$4);
        }
        if (!$$5.isPresent()) {
            $$0.b(sw.b("Can't find a structure block that contains the targeted pos " + $$3));
            return 0;
        }
        dba $$6 = (dba)$$4.c_($$5.get());
        gu $$7 = $$3.b($$5.get());
        String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
        String $$9 = $$6.f();
        tj $$10 = sw.b($$8).b(ts.a.a(true).a(n.k).a(new tb(tb.a.a, sw.b("Click to copy to clipboard"))).a(new su(su.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");")));
        $$0.a(() -> sw.b("Position relative to " + $$9 + ": ").b($$10), false);
        za.a($$4, new gu($$3), $$8, -2147418368, 10000);
        return 1;
    }

    private static int a(ds $$0) {
        aif $$2;
        gu $$1 = gu.a($$0.d());
        gu $$3 = qe.b($$1, 15, $$2 = $$0.e());
        if ($$3 == null) {
            qh.a($$2, "Couldn't find any structure block within 15 radius", n.m);
            return 0;
        }
        pu.a($$2);
        qh.a($$2, $$3, null);
        return 1;
    }

    private static int b(ds $$0) {
        aif $$22;
        gu $$1 = gu.a($$0.d());
        Collection<gu> $$3 = qe.c($$1, 200, $$22 = $$0.e());
        if ($$3.isEmpty()) {
            qh.a($$22, "Couldn't find any structure blocks within 200 block radius", n.m);
            return 1;
        }
        pu.a($$22);
        qh.b($$0, "Running " + $$3.size() + " tests...");
        qc $$4 = new qc();
        $$3.forEach($$2 -> qh.a($$22, $$2, $$4));
        return 1;
    }

    private static void a(aif $$0, gu $$1, @Nullable qc $$2) {
        dba $$3 = (dba)$$0.c_($$1);
        String $$4 = $$3.f();
        qi $$5 = pt.f($$4);
        pr $$6 = new pr($$5, $$3.w(), $$0);
        if ($$2 != null) {
            $$2.a($$6);
            $$6.a(new a($$0, $$2));
        }
        qh.a($$5, $$0);
        eed $$7 = qe.a($$3);
        gu $$8 = gu.a($$7.a, $$7.b, $$7.c);
        pu.a($$6, $$8, px.a);
    }

    static void a(aif $$0, qc $$1) {
        if ($$1.i()) {
            qh.a($$0, "GameTest done! " + $$1.h() + " tests were run", n.p);
            if ($$1.d()) {
                qh.a($$0, $$1.a() + " required tests failed :(", n.m);
            } else {
                qh.a($$0, "All required tests passed :)", n.k);
            }
            if ($$1.e()) {
                qh.a($$0, $$1.b() + " optional tests failed", n.h);
            }
        }
    }

    private static int a(ds $$0, int $$1) {
        aif $$2 = $$0.e();
        pu.a($$2);
        gu $$3 = gu.a($$0.d().c, (double)$$0.e().a(dhk.a.b, gu.a($$0.d())).v(), $$0.d().e);
        pu.a($$2, $$3, px.a, apa.a($$1, 0, 1024));
        return 1;
    }

    private static int a(ds $$0, qi $$1, int $$2) {
        aif $$3 = $$0.e();
        gu $$4 = gu.a($$0.d());
        int $$5 = $$0.e().a(dhk.a.b, $$4).v();
        gu $$6 = new gu($$4.u(), $$5, $$4.w() + 3);
        pu.a($$3);
        qh.a($$1, $$3);
        cvz $$7 = qe.a($$2);
        pr $$8 = new pr($$1, $$7, $$3);
        pu.a($$8, $$6, px.a);
        return 1;
    }

    private static void a(qi $$0, aif $$1) {
        Consumer<aif> $$2 = pt.c($$0.e());
        if ($$2 != null) {
            $$2.accept($$1);
        }
    }

    private static int a(ds $$0, int $$1, int $$2) {
        pu.a($$0.e());
        Collection<qi> $$3 = pt.a();
        qh.b($$0, "Running all " + $$3.size() + " tests...");
        pt.d();
        qh.a($$0, $$3, $$1, $$2);
        return 1;
    }

    private static int a(ds $$0, String $$1, int $$2, int $$3) {
        Collection<qi> $$4 = pt.a($$1);
        pu.a($$0.e());
        qh.b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
        pt.d();
        qh.a($$0, $$4, $$2, $$3);
        return 1;
    }

    private static int a(ds $$0, boolean $$1, int $$2, int $$3) {
        Collection<qi> $$5;
        if ($$1) {
            Collection $$4 = pt.c().stream().filter(qi::d).collect(Collectors.toList());
        } else {
            $$5 = pt.c();
        }
        if ($$5.isEmpty()) {
            qh.b($$0, "No failed tests to rerun");
            return 0;
        }
        pu.a($$0.e());
        qh.b($$0, "Rerunning " + $$5.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
        qh.a($$0, $$5, $$2, $$3);
        return 1;
    }

    private static void a(ds $$02, Collection<qi> $$1, int $$2, int $$3) {
        gu $$4 = gu.a($$02.d());
        gu $$5 = new gu($$4.u(), $$02.e().a(dhk.a.b, $$4).v(), $$4.w() + 3);
        aif $$6 = $$02.e();
        cvz $$7 = qe.a($$2);
        Collection<pr> $$8 = pu.b($$1, $$5, $$7, $$6, px.a, $$3);
        qc $$9 = new qc($$8);
        $$9.a(new a($$6, $$9));
        $$9.a($$0 -> pt.a($$0.v()));
    }

    private static void b(ds $$0, String $$1) {
        $$0.a(() -> sw.b($$1), false);
    }

    private static int c(ds $$0) {
        aif $$2;
        gu $$1 = gu.a($$0.d());
        gu $$3 = qe.b($$1, 15, $$2 = $$0.e());
        if ($$3 == null) {
            qh.a($$2, "Couldn't find any structure block within 15 radius", n.m);
            return 0;
        }
        dba $$4 = (dba)$$2.c_($$3);
        String $$5 = $$4.f();
        return qh.c($$0, $$5);
    }

    private static int c(ds $$0, String $$1) {
        Path $$2 = Paths.get(qe.b, new String[0]);
        acq $$3 = new acq("minecraft", $$1);
        Path $$4 = $$0.e().p().a($$3, ".nbt");
        Path $$5 = mg.a(jg.a, $$4, $$1, $$2);
        if ($$5 == null) {
            qh.b($$0, "Failed to export " + $$4);
            return 1;
        }
        try {
            Files.createDirectories($$5.getParent(), new FileAttribute[0]);
        }
        catch (IOException $$6) {
            qh.b($$0, "Could not create folder " + $$5.getParent());
            $$6.printStackTrace();
            return 1;
        }
        qh.b($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
        return 0;
    }

    private static int d(ds $$0, String $$1) {
        Path $$2 = Paths.get(qe.b, $$1 + ".snbt");
        acq $$3 = new acq("minecraft", $$1);
        Path $$4 = $$0.e().p().a($$3, ".nbt");
        try {
            BufferedReader $$5 = Files.newBufferedReader($$2);
            String $$6 = IOUtils.toString((Reader)$$5);
            Files.createDirectories($$4.getParent(), new FileAttribute[0]);
            try (OutputStream $$7 = Files.newOutputStream($$4, new OpenOption[0]);){
                rb.a(rd.a($$6), $$7);
            }
            qh.b($$0, "Imported to " + $$4.toAbsolutePath());
            return 0;
        }
        catch (CommandSyntaxException | IOException $$8) {
            System.err.println("Failed to load structure " + $$1);
            $$8.printStackTrace();
            return 1;
        }
    }

    private static void a(aif $$02, String $$1, n $$22) {
        $$02.a($$0 -> true).forEach($$2 -> $$2.a(sw.b($$22 + $$1)));
    }

    static class a
    implements ps {
        private final aif a;
        private final qc b;

        public a(aif $$0, qc $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void a(pr $$0) {
        }

        @Override
        public void b(pr $$0) {
            qh.a(this.a, this.b);
        }

        @Override
        public void c(pr $$0) {
            qh.a(this.a, this.b);
        }
    }
}

