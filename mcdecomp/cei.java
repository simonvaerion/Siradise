/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Collection;
import javax.annotation.Nullable;

public class cei
extends cfu {
    public cei(cfu.a $$0) {
        super($$0);
    }

    @Override
    public boolean i(cfz $$0) {
        return true;
    }

    @Override
    public boolean a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
        if (!$$1.B) {
            this.a($$3, $$0, $$1, $$2, false, $$3.b(bdw.a));
        }
        return false;
    }

    @Override
    public bdx a(cij $$0) {
        gu $$3;
        byo $$1 = $$0.o();
        cmm $$2 = $$0.q();
        if (!$$2.B && $$1 != null && !this.a($$1, $$2.a_($$3 = $$0.a()), $$2, $$3, true, $$0.n())) {
            return bdx.e;
        }
        return bdx.a($$2.B);
    }

    private boolean a(byo $$0, dcb $$1, cmn $$2, gu $$3, boolean $$4, cfz $$5) {
        if (!$$0.gk()) {
            return false;
        }
        cpn $$6 = $$1.b();
        dcc<cpn, dcb> $$7 = $$6.l();
        Collection<dde<?>> $$8 = $$7.d();
        String $$9 = jb.f.b($$6).toString();
        if ($$8.isEmpty()) {
            cei.a($$0, sw.a(this.a() + ".empty", new Object[]{$$9}));
            return false;
        }
        qr $$10 = $$5.a("DebugProperty");
        String $$11 = $$10.l($$9);
        dde<?> $$12 = $$7.a($$11);
        if ($$4) {
            if ($$12 == null) {
                $$12 = $$8.iterator().next();
            }
            dcb $$13 = cei.a($$1, $$12, $$0.fD());
            $$2.a($$3, $$13, 18);
            cei.a($$0, sw.a(this.a() + ".update", new Object[]{$$12.f(), cei.a($$13, $$12)}));
        } else {
            $$12 = cei.a($$8, $$12, $$0.fD());
            String $$14 = $$12.f();
            $$10.a($$9, $$14);
            cei.a($$0, sw.a(this.a() + ".select", new Object[]{$$14, cei.a($$1, $$12)}));
        }
        return true;
    }

    private static <T extends Comparable<T>> dcb a(dcb $$0, dde<T> $$1, boolean $$2) {
        return (dcb)$$0.a($$1, (Comparable)cei.a($$1.a(), $$0.c($$1), $$2));
    }

    private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
        return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
    }

    private static void a(byo $$0, sw $$1) {
        ((aig)$$0).b($$1, true);
    }

    private static <T extends Comparable<T>> String a(dcb $$0, dde<T> $$1) {
        return $$1.a($$0.c($$1));
    }
}

