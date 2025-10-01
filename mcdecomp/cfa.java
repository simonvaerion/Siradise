/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface cfa
extends cht {
    public bfo g();

    default public amg ak_() {
        return amh.af;
    }

    default public bdy<cfz> a(cfu $$0, cmm $$1, byo $$2, bdw $$3) {
        cfz $$4 = $$2.b($$3);
        bfo $$5 = bgb.h($$4);
        cfz $$6 = $$2.c($$5);
        if (cki.d($$6) || cfz.a($$4, $$6)) {
            return bdy.d($$4);
        }
        if (!$$1.r_()) {
            $$2.b(amr.c.b($$0));
        }
        cfz $$7 = $$6.b() ? $$4 : $$6.c();
        cfz $$8 = $$4.c();
        $$2.a($$5, $$8);
        return bdy.a($$7, $$1.r_());
    }

    @Nullable
    public static cfa c_(cfz $$0) {
        cds $$2;
        cfu cfu2 = $$0.d();
        if (cfu2 instanceof cfa) {
            cfa $$1 = (cfa)((Object)cfu2);
            return $$1;
        }
        cml cml2 = $$0.d();
        if (cml2 instanceof cds && (cml2 = ($$2 = (cds)cml2).e()) instanceof cfa) {
            cfa $$3 = (cfa)((Object)cml2);
            return $$3;
        }
        return null;
    }
}

