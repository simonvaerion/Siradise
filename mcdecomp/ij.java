/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ij
extends ii {
    @Override
    protected cfz a(gv $$0, cfz $$1) {
        aif $$2 = $$0.g();
        if (!$$2.r_()) {
            gu $$3 = $$0.d().a($$0.e().c(cro.a));
            this.a(ij.a($$2, $$3) || ij.b($$2, $$3));
            if (this.a() && $$1.a(1, $$2.y_(), null)) {
                $$1.f(0);
            }
        }
        return $$1;
    }

    private static boolean a(aif $$02, gu $$1) {
        int $$3;
        dcb $$2 = $$02.a_($$1);
        if ($$2.a(amw.aE, (dca.a $$0) -> $$0.b(cph.b) && $$0.b() instanceof cph) && ($$3 = $$2.c(cph.b).intValue()) >= 5) {
            $$02.a(null, $$1, amh.bI, ami.e, 1.0f, 1.0f);
            cph.a($$02, $$1);
            ((cph)$$2.b()).a((cmm)$$02, $$2, $$1, null, czk.b.b);
            $$02.a(null, dgl.N, $$1);
            return true;
        }
        return false;
    }

    private static boolean b(aif $$0, gu $$1) {
        List<bfj> $$2 = $$0.a(bfz.class, new eed($$1), bfm.f);
        for (bfz bfz2 : $$2) {
            bgr $$4;
            if (!(bfz2 instanceof bgr) || !($$4 = (bgr)((Object)bfz2)).a()) continue;
            $$4.a(ami.e);
            $$0.a(null, dgl.N, $$1);
            return true;
        }
        return false;
    }
}

