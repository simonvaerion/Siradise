/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class djx
extends dko<dmk> {
    public djx(Codec<dmk> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmk> $$0) {
        gu $$1 = $$0.e();
        cng $$2 = $$0.b();
        apf $$3 = $$0.d();
        dmk $$4 = $$0.f();
        if ($$1.v() < $$2.C_() + 5) {
            return false;
        }
        int $$5 = 2 + $$3.a(2);
        int $$6 = 2 + $$3.a(2);
        for (gu $$7 : gu.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$9;
            int $$8 = $$1.u() - $$7.u();
            if ((float)($$8 * $$8 + ($$9 = $$1.w() - $$7.w()) * $$9) <= $$3.i() * 10.0f - $$3.i() * 6.0f) {
                this.a((cmn)$$2, $$7, $$3, $$4);
                continue;
            }
            if (!((double)$$3.i() < 0.031)) continue;
            this.a((cmn)$$2, $$7, $$3, $$4);
        }
        return true;
    }

    private boolean a(cmn $$0, gu $$1, apf $$2) {
        gu $$3 = $$1.d();
        dcb $$4 = $$0.a_($$3);
        if ($$4.a(cpo.kE)) {
            return $$2.h();
        }
        return $$4.d($$0, $$3, ha.b);
    }

    private void a(cmn $$0, gu $$1, apf $$2, dmk $$3) {
        if ($$0.t($$1) && this.a($$0, $$1, $$2)) {
            $$0.a($$1, $$3.b.a($$2, $$1), 4);
        }
    }
}

