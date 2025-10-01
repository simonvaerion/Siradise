/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class cix
extends ciu {
    private static final ciz a = ciz.a(cgc.tB);

    public cix(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        boolean $$2 = false;
        boolean $$3 = false;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            if ($$5.d() instanceof ceo) {
                $$2 = true;
                continue;
            }
            if (a.a($$5)) {
                if ($$3) {
                    return false;
                }
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$3 && $$2;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        ArrayList $$2 = Lists.newArrayList();
        cfz $$3 = null;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            cfu $$6 = $$5.d();
            if ($$6 instanceof ceo) {
                $$2.add(((ceo)$$6).d().f());
                continue;
            }
            if (!a.a($$5)) continue;
            $$3 = $$5.c(1);
        }
        if ($$3 == null || $$2.isEmpty()) {
            return cfz.b;
        }
        $$3.a("Explosion").b("FadeColors", $$2);
        return $$3;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }

    @Override
    public cje<?> aj_() {
        return cje.i;
    }
}

