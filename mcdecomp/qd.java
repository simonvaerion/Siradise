/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
import com.google.common.base.MoreObjects;
import java.util.Arrays;
import org.apache.commons.lang3.exception.ExceptionUtils;

class qd
implements ps {
    private final pr c;
    private final px d;
    private final gu e;
    int a;
    int b;

    public qd(pr $$0, px $$1, gu $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.a = 0;
        this.b = 0;
    }

    @Override
    public void a(pr $$0) {
        qd.a(this.c, cpo.er);
        ++this.a;
    }

    @Override
    public void b(pr $$0) {
        ++this.b;
        if (!$$0.x()) {
            qd.a($$0, $$0.c() + " passed! (" + $$0.l() + "ms)");
            return;
        }
        if (this.b >= $$0.z()) {
            qd.a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
        } else {
            qd.a(this.c.g(), n.k, "Flaky test " + this.c + " succeeded, attempt: " + this.a + " successes: " + this.b);
            this.a();
        }
    }

    @Override
    public void c(pr $$0) {
        if (!$$0.x()) {
            qd.a($$0, $$0.n());
            return;
        }
        qi $$1 = this.c.v();
        String $$2 = "Flaky test " + this.c + " failed, attempt: " + this.a + "/" + $$1.i();
        if ($$1.j() > 1) {
            $$2 = $$2 + ", successes: " + this.b + " (" + $$1.j() + " required)";
        }
        qd.a(this.c.g(), n.o, $$2);
        if ($$0.y() - this.a + this.b >= $$0.z()) {
            this.a();
        } else {
            qd.a($$0, new pi(this.a, this.b, $$0));
        }
    }

    public static void a(pr $$0, String $$1) {
        qd.a($$0, cpo.eo);
        qd.b($$0, $$1);
    }

    private static void b(pr $$0, String $$1) {
        qd.a($$0.g(), n.k, $$1);
        pz.b($$0);
    }

    protected static void a(pr $$0, Throwable $$1) {
        qd.a($$0, $$0.r() ? cpo.ex : cpo.ek);
        qd.c($$0, ac.c($$1));
        qd.b($$0, $$1);
    }

    protected static void b(pr $$0, Throwable $$1) {
        String $$2 = $$1.getMessage() + (String)($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
        String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.c() + " failed! " + $$2;
        qd.a($$0.g(), $$0.r() ? n.m : n.o, $$3);
        Throwable $$4 = (Throwable)MoreObjects.firstNonNull((Object)ExceptionUtils.getRootCause((Throwable)$$1), (Object)$$1);
        if ($$4 instanceof pl) {
            pl $$5 = (pl)$$4;
            qd.a($$0.g(), $$5.c(), $$5.a());
        }
        pz.a($$0);
    }

    private void a() {
        this.c.o();
        pr $$0 = new pr(this.c.v(), this.c.u(), this.c.g());
        $$0.a();
        this.d.a($$0);
        $$0.a(this);
        $$0.a(this.e, 2);
    }

    protected static void a(pr $$0, cpn $$1) {
        aif $$2 = $$0.g();
        gu $$3 = $$0.d();
        gu $$4 = new gu(-1, -1, -1);
        gu $$5 = dvt.a($$3.a($$4), cui.a, $$0.u(), $$3);
        $$2.b($$5, cpo.fO.n().a($$0.u()));
        gu $$6 = $$5.b(0, 1, 0);
        $$2.b($$6, $$1.n());
        for (int $$7 = -1; $$7 <= 1; ++$$7) {
            for (int $$8 = -1; $$8 <= 1; ++$$8) {
                gu $$9 = $$5.b($$7, -1, $$8);
                $$2.b($$9, cpo.ci.n());
            }
        }
    }

    private static void c(pr $$0, String $$1) {
        aif $$2 = $$0.g();
        gu $$3 = $$0.d();
        gu $$4 = new gu(-1, 1, -1);
        gu $$5 = dvt.a($$3.a($$4), cui.a, $$0.u(), $$3);
        $$2.b($$5, cpo.oa.n().a($$0.u()));
        dcb $$6 = $$2.a_($$5);
        cfz $$7 = qd.a($$0.c(), $$0.r(), $$1);
        ctv.a(null, (cmm)$$2, $$5, $$6, $$7);
    }

    private static cfz a(String $$0, boolean $$12, String $$2) {
        cfz $$3 = new cfz(cgc.tg);
        qx $$4 = new qx();
        StringBuffer $$5 = new StringBuffer();
        Arrays.stream($$0.split("\\.")).forEach($$1 -> $$5.append((String)$$1).append('\n'));
        if (!$$12) {
            $$5.append("(optional)\n");
        }
        $$5.append("-------------------\n");
        $$4.add(ri.a($$5 + $$2));
        $$3.a("pages", $$4);
        return $$3;
    }

    protected static void a(aif $$02, n $$1, String $$22) {
        $$02.a((? super aig $$0) -> true).forEach($$2 -> $$2.a(sw.b($$22).a($$1)));
    }

    private static void a(aif $$0, gu $$1, String $$2) {
        za.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
    }
}

