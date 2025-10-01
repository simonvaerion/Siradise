/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class acs {
    public static final PrintStream a = System.out;
    private static volatile boolean c;
    private static final Logger d;
    public static final AtomicLong b;

    public static void a() {
        if (c) {
            return;
        }
        c = true;
        Instant $$0 = Instant.now();
        if (jb.ap.e().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
        }
        csj.a();
        cqw.a();
        if (bfn.a(bfn.bt) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
        }
        chx.a();
        gc.a();
        ih.c();
        ib.b();
        jb.a();
        ceg.a();
        acs.d();
        b.set(Duration.between($$0, Instant.now()).toMillis());
    }

    private static <T> void a(Iterable<T> $$0, Function<T, String> $$1, Set<String> $$2) {
        qm $$32 = qm.a();
        $$0.forEach($$3 -> {
            String $$4 = (String)$$1.apply($$3);
            if (!$$32.b($$4)) {
                $$2.add($$4);
            }
        });
    }

    private static void a(final Set<String> $$0) {
        final qm $$1 = qm.a();
        cmi.a(new cmi.c(){

            @Override
            public <T extends cmi.g<T>> void a(cmi.e<T> $$02, cmi.f<T> $$12) {
                if (!$$1.b($$02.b())) {
                    $$0.add($$02.a());
                }
            }
        });
    }

    public static Set<String> b() {
        TreeSet<String> $$02 = new TreeSet<String>();
        acs.a(jb.v, bhb::c, $$02);
        acs.a(jb.h, bfn::g, $$02);
        acs.a(jb.e, bey::d, $$02);
        acs.a(jb.i, cfu::a, $$02);
        acs.a(jb.g, ckg::g, $$02);
        acs.a(jb.f, cpn::f, $$02);
        acs.a(jb.n, $$0 -> "stat." + $$0.toString().replace(':', '.'), $$02);
        acs.a($$02);
        return $$02;
    }

    public static void a(Supplier<String> $$0) {
        if (!c) {
            throw acs.b($$0);
        }
    }

    private static RuntimeException b(Supplier<String> $$0) {
        try {
            String $$1 = $$0.get();
            return new IllegalArgumentException("Not bootstrapped (called from " + $$1 + ")");
        }
        catch (Exception $$2) {
            IllegalArgumentException $$3 = new IllegalArgumentException("Not bootstrapped (failed to resolve location)");
            $$3.addSuppressed($$2);
            return $$3;
        }
    }

    public static void c() {
        acs.a(() -> "validate");
        if (aa.aS) {
            acs.b().forEach($$0 -> d.error("Missing translations: {}", $$0));
            dt.b();
        }
        bhh.a();
    }

    private static void d() {
        if (d.isDebugEnabled()) {
            System.setErr(new acv("STDERR", System.err));
            System.setOut(new acv("STDOUT", a));
        } else {
            System.setErr(new acx("STDERR", System.err));
            System.setOut(new acx("STDOUT", a));
        }
    }

    public static void a(String $$0) {
        a.println($$0);
    }

    static {
        d = LogUtils.getLogger();
        b = new AtomicLong(-1L);
    }
}

