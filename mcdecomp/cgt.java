/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cgt
extends cds {
    public cgt(cpn $$0, cfu.a $$1) {
        super($$0, $$1);
    }

    @Override
    @Nullable
    public cih b(cih $$0) {
        cpn $$4;
        gu $$1 = $$0.a();
        cmm $$2 = $$0.q();
        dcb $$3 = $$2.a_($$1);
        if ($$3.a($$4 = this.e())) {
            ha $$6;
            if ($$0.h()) {
                ha $$5 = $$0.m() ? $$0.k().g() : $$0.k();
            } else {
                $$6 = $$0.k() == ha.b ? $$0.g() : ha.b;
            }
            int $$7 = 0;
            gu.a $$8 = $$1.j().c($$6);
            while ($$7 < 7) {
                if (!$$2.B && !$$2.j($$8)) {
                    byo $$9 = $$0.o();
                    int $$10 = $$2.aj();
                    if (!($$9 instanceof aig) || $$8.v() < $$10) break;
                    ((aig)$$9).b(sw.a("build.tooHigh", $$10 - 1).a(n.m), true);
                    break;
                }
                $$3 = $$2.a_($$8);
                if (!$$3.a(this.e())) {
                    if (!$$3.a($$0)) break;
                    return cih.a($$0, $$8, $$6);
                }
                $$8.c($$6);
                if (!$$6.o().d()) continue;
                ++$$7;
            }
            return null;
        }
        if (cwc.a($$2, $$1) == 7) {
            return null;
        }
        return $$0;
    }

    @Override
    protected boolean d() {
        return false;
    }
}

