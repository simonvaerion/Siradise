/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class qe {
    private static final Logger c = LogUtils.getLogger();
    public static final String a = "gameteststructures";
    public static String b = "gameteststructures";
    private static final int d = 4;

    public static cvz a(int $$0) {
        switch ($$0) {
            case 0: {
                return cvz.a;
            }
            case 1: {
                return cvz.b;
            }
            case 2: {
                return cvz.c;
            }
            case 3: {
                return cvz.d;
            }
        }
        throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
    }

    public static int a(cvz $$0) {
        switch ($$0) {
            case a: {
                return 0;
            }
            case b: {
                return 1;
            }
            case c: {
                return 2;
            }
            case d: {
                return 3;
            }
        }
        throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
    }

    public static void a(String[] $$02) throws IOException {
        acs.a();
        Files.walk(Paths.get(b, new String[0]), new FileVisitOption[0]).filter($$0 -> $$0.toString().endsWith(".snbt")).forEach($$0 -> {
            try {
                String $$1 = Files.readString($$0);
                qr $$2 = rd.a($$1);
                qr $$3 = mi.a($$0.toString(), $$2);
                mg.a(jg.a, $$0, rd.c($$3));
            }
            catch (CommandSyntaxException | IOException $$4) {
                c.error("Something went wrong upgrading: {}", $$0, (Object)$$4);
            }
        });
    }

    public static eed a(dba $$0) {
        gu $$1 = $$0.p();
        gu $$2 = $$1.a($$0.j().c(-1, -1, -1));
        gu $$3 = dvt.a($$2, cui.a, $$0.w(), $$1);
        return new eed($$1, $$3);
    }

    public static drs b(dba $$0) {
        gu $$1 = $$0.p();
        gu $$2 = $$1.a($$0.j().c(-1, -1, -1));
        gu $$3 = dvt.a($$2, cui.a, $$0.w(), $$1);
        return drs.a($$1, $$3);
    }

    public static void a(gu $$0, gu $$1, cvz $$2, aif $$3) {
        gu $$4 = dvt.a($$0.a($$1), cui.a, $$2, $$0);
        $$3.b($$4, cpo.fN.n());
        czx $$5 = (czx)$$3.c_($$4);
        $$5.c().a("test runthis");
        gu $$6 = dvt.a($$4.b(0, 0, -1), cui.a, $$2, $$4);
        $$3.b($$6, cpo.dM.n().a($$2));
    }

    public static void a(String $$0, gu $$1, hz $$2, cvz $$3, aif $$4) {
        drs $$5 = qe.a($$1, $$2, $$3);
        qe.a($$5, $$1.v(), $$4);
        $$4.b($$1, cpo.pa.n());
        dba $$6 = (dba)$$4.c_($$1);
        $$6.a(false);
        $$6.a(new acq($$0));
        $$6.a($$2);
        $$6.a(ddl.a);
        $$6.e(true);
    }

    /*
     * WARNING - void declaration
     */
    public static dba a(String $$0, gu $$1, cvz $$2, int $$3, aif $$4, boolean $$5) {
        void $$12;
        hz $$6 = qe.a($$0, $$4).a();
        drs $$7 = qe.a($$1, $$6, $$2);
        if ($$2 == cvz.a) {
            gu $$8 = $$1;
        } else if ($$2 == cvz.b) {
            gu $$9 = $$1.b($$6.w() - 1, 0, 0);
        } else if ($$2 == cvz.c) {
            gu $$10 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
        } else if ($$2 == cvz.d) {
            gu $$11 = $$1.b(0, 0, $$6.u() - 1);
        } else {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
        }
        qe.a($$1, $$4);
        qe.a($$7, $$1.v(), $$4);
        dba $$13 = qe.a($$0, (gu)$$12, $$2, $$4, $$5);
        $$4.l().a($$7);
        $$4.a($$7);
        return $$13;
    }

    private static void a(gu $$0, aif $$1) {
        clt $$2 = new clt($$0);
        for (int $$3 = -1; $$3 < 4; ++$$3) {
            for (int $$4 = -1; $$4 < 4; ++$$4) {
                int $$5 = $$2.e + $$3;
                int $$6 = $$2.f + $$4;
                $$1.a($$5, $$6, true);
            }
        }
    }

    public static void a(drs $$02, int $$1, aif $$22) {
        drs $$3 = new drs($$02.g() - 2, $$02.h() - 3, $$02.i() - 3, $$02.j() + 3, $$02.k() + 20, $$02.l() + 3);
        gu.a($$3).forEach($$2 -> qe.a($$1, $$2, $$22));
        $$22.l().a($$3);
        $$22.a($$3);
        eed $$4 = new eed($$3.g(), $$3.h(), $$3.i(), $$3.j(), $$3.k(), $$3.l());
        List<bfj> $$5 = $$22.a(bfj.class, $$4, $$0 -> !($$0 instanceof byo));
        $$5.forEach(bfj::ai);
    }

    public static drs a(gu $$0, hz $$1, cvz $$2) {
        gu $$3 = $$0.a($$1).b(-1, -1, -1);
        gu $$4 = dvt.a($$3, cui.a, $$2, $$0);
        drs $$5 = drs.a($$0, $$4);
        int $$6 = Math.min($$5.g(), $$5.j());
        int $$7 = Math.min($$5.i(), $$5.l());
        return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
    }

    public static Optional<gu> a(gu $$0, int $$1, aif $$22) {
        return qe.c($$0, $$1, $$22).stream().filter($$2 -> qe.a($$2, $$0, $$22)).findFirst();
    }

    @Nullable
    public static gu b(gu $$0, int $$12, aif $$2) {
        Comparator<gu> $$3 = Comparator.comparingInt($$1 -> $$1.k($$0));
        Collection<gu> $$4 = qe.c($$0, $$12, $$2);
        Optional<gu> $$5 = $$4.stream().min($$3);
        return $$5.orElse(null);
    }

    public static Collection<gu> c(gu $$0, int $$1, aif $$2) {
        ArrayList $$3 = Lists.newArrayList();
        eed $$4 = new eed($$0);
        $$4 = $$4.g($$1);
        for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; ++$$5) {
            for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; ++$$6) {
                for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; ++$$7) {
                    gu $$8 = new gu($$5, $$6, $$7);
                    dcb $$9 = $$2.a_($$8);
                    if (!$$9.a(cpo.pa)) continue;
                    $$3.add($$8);
                }
            }
        }
        return $$3;
    }

    private static dvt a(String $$0, aif $$1) {
        dvu $$2 = $$1.p();
        Optional<dvt> $$3 = $$2.b(new acq($$0));
        if ($$3.isPresent()) {
            return $$3.get();
        }
        String $$4 = $$0 + ".snbt";
        Path $$5 = Paths.get(b, $$4);
        qr $$6 = qe.a($$5);
        if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
        }
        return $$2.a($$6);
    }

    private static dba a(String $$0, gu $$1, cvz $$2, aif $$3, boolean $$4) {
        $$3.b($$1, cpo.pa.n());
        dba $$5 = (dba)$$3.c_($$1);
        $$5.a(ddl.b);
        $$5.a($$2);
        $$5.a(false);
        $$5.a(new acq($$0));
        $$5.a($$3, $$4);
        if ($$5.j() != hz.g) {
            return $$5;
        }
        dvt $$6 = qe.a($$0, $$3);
        $$5.a($$3, $$4, $$6);
        if ($$5.j() == hz.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
        }
        return $$5;
    }

    @Nullable
    private static qr a(Path $$0) {
        try {
            BufferedReader $$1 = Files.newBufferedReader($$0);
            String $$2 = IOUtils.toString((Reader)$$1);
            return rd.a($$2);
        }
        catch (IOException $$3) {
            return null;
        }
        catch (CommandSyntaxException $$4) {
            throw new RuntimeException("Error while trying to load structure " + $$0, $$4);
        }
    }

    private static void a(int $$0, gu $$1, aif $$2) {
        dcb $$3 = null;
        hs $$4 = $$2.B_();
        dqd $$5 = dqd.a($$4.b(jc.ap), $$4.b(jc.aB), $$4.b(jc.ay));
        List<dcb> $$6 = $$5.f();
        int $$7 = $$1.v() - $$2.C_();
        if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
            $$3 = $$6.get($$7 - 1);
        }
        if ($$3 == null) {
            $$3 = cpo.a.n();
        }
        fd $$8 = new fd($$3, Collections.emptySet(), null);
        $$8.a($$2, $$1, 2);
        $$2.b($$1, $$3.b());
    }

    private static boolean a(gu $$0, gu $$1, aif $$2) {
        dba $$3 = (dba)$$2.c_($$0);
        eed $$4 = qe.a($$3).g(1.0);
        return $$4.d(eei.b($$1));
    }
}

