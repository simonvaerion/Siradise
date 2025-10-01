/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public class chv
extends cfu {
    public static final int a = 16;
    public static final int b = 32;
    public static final int c = 1024;
    public static final int d = Short.MAX_VALUE;
    public static final int e = 100;
    public static final int f = 2;
    public static final String g = "title";
    public static final String h = "filtered_title";
    public static final String i = "author";
    public static final String j = "pages";
    public static final String k = "filtered_pages";
    public static final String r = "generation";
    public static final String s = "resolved";

    public chv(cfu.a $$0) {
        super($$0);
    }

    public static boolean a(@Nullable qr $$0) {
        if (!chu.a($$0)) {
            return false;
        }
        if (!$$0.b(g, 8)) {
            return false;
        }
        String $$1 = $$0.l(g);
        if ($$1.length() > 32) {
            return false;
        }
        return $$0.b(i, 8);
    }

    public static int d(cfz $$0) {
        return $$0.v().h(r);
    }

    public static int k(cfz $$0) {
        qr $$1 = $$0.v();
        return $$1 != null ? $$1.c(j, 8).size() : 0;
    }

    @Override
    public sw m(cfz $$0) {
        String $$2;
        qr $$1 = $$0.v();
        if ($$1 != null && !aps.b($$2 = $$1.l(g))) {
            return sw.b($$2);
        }
        return super.m($$0);
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        if ($$0.u()) {
            qr $$4 = $$0.v();
            String $$5 = $$4.l(i);
            if (!aps.b($$5)) {
                $$2.add(sw.a("book.byAuthor", new Object[]{$$5}).a(n.h));
            }
            $$2.add(sw.c("book.generation." + $$4.h(r)).a(n.h));
        }
    }

    @Override
    public bdx a(cij $$0) {
        gu $$2;
        cmm $$1 = $$0.q();
        dcb $$3 = $$1.a_($$2 = $$0.a());
        if ($$3.a(cpo.oa)) {
            return ctv.a((bfj)$$0.o(), $$1, $$2, $$3, $$0.n()) ? bdx.a($$1.B) : bdx.d;
        }
        return bdx.d;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        $$1.a($$3, $$2);
        $$1.b(amr.c.b(this));
        return bdy.a($$3, $$0.r_());
    }

    public static boolean a(cfz $$0, @Nullable ds $$1, @Nullable byo $$2) {
        qr $$3 = $$0.v();
        if ($$3 == null || $$3.q(s)) {
            return false;
        }
        $$3.a(s, true);
        if (!chv.a($$3)) {
            return false;
        }
        qx $$4 = $$3.c(j, 8);
        qx $$5 = new qx();
        for (int $$6 = 0; $$6 < $$4.size(); ++$$6) {
            String $$7 = chv.a($$1, $$2, $$4.j($$6));
            if ($$7.length() > Short.MAX_VALUE) {
                return false;
            }
            $$5.c($$6, ri.a($$7));
        }
        if ($$3.b(k, 10)) {
            qr $$8 = $$3.p(k);
            qr $$9 = new qr();
            for (String $$10 : $$8.e()) {
                String $$11 = chv.a($$1, $$2, $$8.l($$10));
                if ($$11.length() > Short.MAX_VALUE) {
                    return false;
                }
                $$9.a($$10, $$11);
            }
            $$3.a(k, $$9);
        }
        $$3.a(j, $$5);
        return true;
    }

    private static String a(@Nullable ds $$0, @Nullable byo $$1, String $$2) {
        tj $$5;
        try {
            tj $$3 = sw.a.b($$2);
            $$3 = sy.a($$0, $$3, (bfj)$$1, 0);
        }
        catch (Exception $$4) {
            $$5 = sw.b($$2);
        }
        return sw.a.a($$5);
    }

    @Override
    public boolean i(cfz $$0) {
        return true;
    }
}

