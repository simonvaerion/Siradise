/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class cim
extends ciu {
    public cim(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        cfz $$2 = cfz.b;
        ArrayList $$3 = Lists.newArrayList();
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            if ($$5.d() instanceof cer) {
                if (!$$2.b()) {
                    return false;
                }
                $$2 = $$5;
                continue;
            }
            if ($$5.d() instanceof ceo) {
                $$3.add($$5);
                continue;
            }
            return false;
        }
        return !$$2.b() && !$$3.isEmpty();
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        ArrayList $$2 = Lists.newArrayList();
        cfz $$3 = cfz.b;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            cfu $$6 = $$5.d();
            if ($$6 instanceof cer) {
                if (!$$3.b()) {
                    return cfz.b;
                }
                $$3 = $$5.p();
                continue;
            }
            if ($$6 instanceof ceo) {
                $$2.add((ceo)$$6);
                continue;
            }
            return cfz.b;
        }
        if ($$3.b() || $$2.isEmpty()) {
            return cfz.b;
        }
        return cer.a($$3, $$2);
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }

    @Override
    public cje<?> aj_() {
        return cje.c;
    }
}

