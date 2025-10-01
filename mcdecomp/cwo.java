/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface cwo
extends cpt,
cub {
    @Override
    default public boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
        return $$3 == dxf.c;
    }

    @Override
    default public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
        if (!$$2.c(dcr.C).booleanValue() && $$3.a() == dxf.c) {
            if (!$$0.r_()) {
                $$0.a($$1, (dcb)$$2.a(dcr.C, true), 3);
                $$0.a($$1, $$3.a(), $$3.a().a($$0));
            }
            return true;
        }
        return false;
    }

    @Override
    default public cfz c(cmn $$0, gu $$1, dcb $$2) {
        if ($$2.c(dcr.C).booleanValue()) {
            $$0.a($$1, (dcb)$$2.a(dcr.C, false), 3);
            if (!$$2.a($$0, $$1)) {
                $$0.b($$1, true);
            }
            return new cfz(cgc.pL);
        }
        return cfz.b;
    }

    @Override
    default public Optional<amg> am_() {
        return dxf.c.j();
    }
}

