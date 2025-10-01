/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class aia {
    @Nullable
    protected static gu a(aif $$0, int $$1, int $$2) {
        int $$5;
        boolean $$3 = $$0.x_().h();
        dei $$4 = $$0.d(hx.a($$1), hx.a($$2));
        int n2 = $$5 = $$3 ? $$0.k().g().a($$0) : $$4.a(dhk.a.e, $$1 & 0xF, $$2 & 0xF);
        if ($$5 < $$0.C_()) {
            return null;
        }
        int $$6 = $$4.a(dhk.a.b, $$1 & 0xF, $$2 & 0xF);
        if ($$6 <= $$5 && $$6 > $$4.a(dhk.a.d, $$1 & 0xF, $$2 & 0xF)) {
            return null;
        }
        gu.a $$7 = new gu.a();
        for (int $$8 = $$5 + 1; $$8 >= $$0.C_(); --$$8) {
            $$7.d($$1, $$8, $$2);
            dcb $$9 = $$0.a_($$7);
            if (!$$9.u().c()) break;
            if (!cpn.a($$9.k($$0, $$7), ha.b)) continue;
            return $$7.c().i();
        }
        return null;
    }

    @Nullable
    public static gu a(aif $$0, clt $$1) {
        if (aa.a($$1)) {
            return null;
        }
        for (int $$2 = $$1.d(); $$2 <= $$1.f(); ++$$2) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); ++$$3) {
                gu $$4 = aia.a($$0, $$2, $$3);
                if ($$4 == null) continue;
                return $$4;
            }
        }
        return null;
    }
}

