/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Optional;
import org.slf4j.Logger;

public class cgd
extends cfu {
    private static final String a = "Recipes";
    private static final Logger b = LogUtils.getLogger();

    public cgd(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        qr $$4 = $$3.v();
        if (!$$1.fO().d) {
            $$1.a($$2, cfz.b);
        }
        if ($$4 == null || !$$4.b(a, 9)) {
            b.error("Tag not valid: {}", (Object)$$4);
            return bdy.d($$3);
        }
        if (!$$0.B) {
            qx $$5 = $$4.c(a, 8);
            ArrayList $$6 = Lists.newArrayList();
            cjd $$7 = $$0.n().aE();
            for (int $$8 = 0; $$8 < $$5.size(); ++$$8) {
                String $$9 = $$5.j($$8);
                Optional<cjc<?>> $$10 = $$7.a(new acq($$9));
                if (!$$10.isPresent()) {
                    b.error("Invalid recipe: {}", (Object)$$9);
                    return bdy.d($$3);
                }
                $$6.add($$10.get());
            }
            $$1.a($$6);
            $$1.b(amr.c.b(this));
        }
        return bdy.a($$3, $$0.r_());
    }
}

