/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cdp
extends chi {
    private static final String c = "block.minecraft.banner.";

    public cdp(cpn $$0, cpn $$1, cfu.a $$2) {
        super($$0, $$1, $$2, ha.a);
        Validate.isInstanceOf(cod.class, (Object)$$0);
        Validate.isInstanceOf(cod.class, (Object)$$1);
    }

    public static void a(cfz $$02, List<sw> $$1) {
        qr $$22 = cds.a($$02);
        if ($$22 == null || !$$22.e("Patterns")) {
            return;
        }
        qx $$3 = $$22.c("Patterns", 10);
        for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; ++$$4) {
            qr $$5 = $$3.a($$4);
            cen $$6 = cen.a($$5.h("Color"));
            he<cze> $$7 = cze.a($$5.l("Pattern"));
            if ($$7 == null) continue;
            $$7.e().map($$0 -> $$0.a().e()).ifPresent($$2 -> $$1.add(sw.c(c + $$2 + "." + $$6.b()).a(n.h)));
        }
    }

    public cen b() {
        return ((cod)this.e()).a();
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        cdp.a($$0, $$2);
    }
}

