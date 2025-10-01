/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.ReentrantLock;

public class fjf {
    public static final sw a = sw.c("quickplay.error.title");
    private static final sw b = sw.c("quickplay.error.invalid_identifier");
    private static final sw c = sw.c("quickplay.error.realm_connect");
    private static final sw d = sw.c("quickplay.error.realm_permission");
    private static final sw e = sw.c("gui.toTitle");
    private static final sw f = sw.c("gui.toWorld");
    private static final sw g = sw.c("gui.toRealms");

    public static void a(enn $$0, ezy.c $$1, akt $$2, eiz $$3) {
        String $$4 = $$1.c();
        String $$5 = $$1.d();
        String $$6 = $$1.e();
        $$2.a().thenRunAsync(() -> {
            if (!ac.b($$4)) {
                fjf.a($$0, $$4);
            } else if (!ac.b($$5)) {
                fjf.b($$0, $$5);
            } else if (!ac.b($$6)) {
                fjf.a($$0, $$3, $$6);
            }
        }, $$0);
    }

    private static void a(enn $$0, String $$1) {
        if (!$$0.k().b($$1)) {
            ezg $$2 = new ezg(new euw());
            $$0.a(new ett($$2, a, b, f));
            return;
        }
        $$0.c(new etx(sw.c("selectWorld.data_read")));
        $$0.w().a(new euw(), $$1);
    }

    private static void b(enn $$0, String $$1) {
        ffe $$2 = new ffe($$0);
        $$2.a();
        ffd $$3 = $$2.a($$1);
        if ($$3 == null) {
            $$3 = new ffd(fvz.a("selectServer.defaultName", new Object[0]), $$1, false);
            $$2.a($$3, true);
            $$2.b();
        }
        fga $$4 = fga.a($$1);
        etl.a(new exn(new euw()), $$0, $$4, $$3, true);
    }

    /*
     * WARNING - void declaration
     */
    private static void a(enn $$0, eiz $$1, String $$2) {
        void $$9;
        void $$10;
        try {
            long $$3 = Long.parseLong($$2);
            ejs $$4 = $$1.e();
        }
        catch (NumberFormatException $$5) {
            eiu $$6 = new eiu(new euw());
            $$0.a(new ett($$6, a, b, g));
            return;
        }
        catch (ekm $$7) {
            euw $$8 = new euw();
            $$0.a(new ett($$8, a, c, e));
            return;
        }
        ejq $$11 = $$10.a.stream().filter(arg_0 -> fjf.a((long)$$9, arg_0)).findFirst().orElse(null);
        if ($$11 == null) {
            eiu $$12 = new eiu(new euw());
            $$0.a(new ett($$12, a, d, g));
            return;
        }
        euw $$13 = new euw();
        emn $$14 = new emn(new eiu($$13), $$13, $$11, new ReentrantLock());
        $$0.a(new elh($$13, $$14));
    }

    private static /* synthetic */ boolean a(long $$0, ejq $$1) {
        return $$1.a == $$0;
    }
}

