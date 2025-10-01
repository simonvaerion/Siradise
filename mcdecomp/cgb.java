/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public class cgb {
    public static bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        $$1.c($$2);
        return bdy.b($$1.b($$2));
    }

    public static cfz a(cfz $$0, byo $$1, cfz $$2, boolean $$3) {
        boolean $$4 = $$1.fO().d;
        if ($$3 && $$4) {
            if (!$$1.fN().h($$2)) {
                $$1.fN().e($$2);
            }
            return $$0;
        }
        if (!$$4) {
            $$0.h(1);
        }
        if ($$0.b()) {
            return $$2;
        }
        if (!$$1.fN().e($$2)) {
            $$1.a($$2, false);
        }
        return $$0;
    }

    public static cfz a(cfz $$0, byo $$1, cfz $$2) {
        return cgb.a($$0, $$1, $$2, true);
    }

    public static void a(bvh $$0, Stream<cfz> $$1) {
        cmm $$22 = $$0.dI();
        if ($$22.B) {
            return;
        }
        $$1.forEach($$2 -> $$22.b(new bvh($$22, $$0.dn(), $$0.dp(), $$0.dt(), (cfz)$$2)));
    }
}

