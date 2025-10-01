/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 */
package net.minecraft.data;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
    @DontObfuscate
    public static void main(String[] $$02) throws IOException {
        aa.a();
        OptionParser $$1 = new OptionParser();
        AbstractOptionSpec $$2 = $$1.accepts("help", "Show the help menu").forHelp();
        OptionSpecBuilder $$3 = $$1.accepts("server", "Include server generators");
        OptionSpecBuilder $$4 = $$1.accepts("client", "Include client generators");
        OptionSpecBuilder $$5 = $$1.accepts("dev", "Include development tools");
        OptionSpecBuilder $$6 = $$1.accepts("reports", "Include data reports");
        OptionSpecBuilder $$7 = $$1.accepts("validate", "Validate inputs");
        OptionSpecBuilder $$8 = $$1.accepts("all", "Include all generators");
        ArgumentAcceptingOptionSpec $$9 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$10 = $$1.accepts("input", "Input folder").withRequiredArg();
        OptionSet $$11 = $$1.parse($$02);
        if ($$11.has((OptionSpec)$$2) || !$$11.hasOptions()) {
            $$1.printHelpOn((OutputStream)System.out);
            return;
        }
        Path $$12 = Paths.get((String)$$9.value($$11), new String[0]);
        boolean $$13 = $$11.has((OptionSpec)$$8);
        boolean $$14 = $$13 || $$11.has((OptionSpec)$$4);
        boolean $$15 = $$13 || $$11.has((OptionSpec)$$3);
        boolean $$16 = $$13 || $$11.has((OptionSpec)$$5);
        boolean $$17 = $$13 || $$11.has((OptionSpec)$$6);
        boolean $$18 = $$13 || $$11.has((OptionSpec)$$7);
        jh $$19 = Main.a($$12, $$11.valuesOf((OptionSpec)$$10).stream().map($$0 -> Paths.get($$0, new String[0])).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
        $$19.a();
    }

    private static <T extends ji> ji.a<T> a(BiFunction<jk, CompletableFuture<hg.b>, T> $$0, CompletableFuture<hg.b> $$1) {
        return $$2 -> (ji)$$0.apply($$2, $$1);
    }

    public static jh a(Path $$02, Collection<Path> $$12, boolean $$22, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
        jh $$9 = new jh($$02, $$7, $$8);
        jh.a $$10 = $$9.a($$22 || $$3);
        $$10.a($$1 -> new mh($$1, $$12).a(new mi()));
        CompletableFuture<hg.b> $$11 = CompletableFuture.supplyAsync(me::a, ac.f());
        jh.a $$122 = $$9.a($$22);
        $$122.a(ks::new);
        jh.a $$13 = $$9.a($$3);
        $$13.a(Main.a(md::new, $$11));
        $$13.a(Main.a(jo::a, $$11));
        $$13.a(kl::a);
        $$13.a(mb::new);
        my $$14 = $$13.a(Main.a(mz::new, $$11));
        my $$15 = $$13.a($$2 -> new na($$2, $$11, $$14.c()));
        $$13.a(Main.a(mk::new, $$11));
        $$13.a(Main.a(ml::new, $$11));
        $$13.a(Main.a(mm::new, $$11));
        $$13.a(Main.a(mn::new, $$11));
        $$13.a(Main.a(mo::new, $$11));
        $$13.a(Main.a(mp::new, $$11));
        $$13.a(Main.a(mq::new, $$11));
        $$13.a(Main.a(mr::new, $$11));
        $$13.a(Main.a(ms::new, $$11));
        $$13.a(Main.a(mv::new, $$11));
        $$13.a(Main.a(mw::new, $$11));
        $$13.a(Main.a(mx::new, $$11));
        $$13.a(Main.a(nb::new, $$11));
        jh.a $$16 = $$9.a($$4);
        $$16.a($$1 -> new mg($$1, $$12));
        jh.a $$17 = $$9.a($$5);
        $$17.a(Main.a(jv::new, $$11));
        $$17.a(jw::new);
        $$17.a(Main.a(jx::new, $$11));
        $$17.a(jy::new);
        jh.a $$18 = $$9.a($$3, "bundle");
        $$18.a(ma::new);
        $$18.a($$0 -> ko.a($$0, sw.c("dataPack.bundle.description"), caw.a(cay.b)));
        return $$9;
    }
}

