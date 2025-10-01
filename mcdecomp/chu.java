/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class chu
extends cfu {
    public chu(cfu.a $$0) {
        super($$0);
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

    public static boolean a(@Nullable qr $$0) {
        if ($$0 == null) {
            return false;
        }
        if (!$$0.b("pages", 9)) {
            return false;
        }
        qx $$1 = $$0.c("pages", 8);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            String $$3 = $$1.j($$2);
            if ($$3.length() <= Short.MAX_VALUE) continue;
            return false;
        }
        return true;
    }
}

