/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dju
extends dko<dmz> {
    public dju(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        gu $$1 = $$0.e();
        cng $$2 = $$0.b();
        apf $$3 = $$0.d();
        if (!$$2.t($$1) || $$2.t($$1.c())) {
            return false;
        }
        gu.a $$4 = $$1.j();
        gu.a $$5 = $$1.j();
        boolean $$6 = true;
        boolean $$7 = true;
        boolean $$8 = true;
        boolean $$9 = true;
        while ($$2.t($$4)) {
            if ($$2.r($$4)) {
                return true;
            }
            $$2.a((gu)$$4, cpo.dZ.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a((hz)$$4, ha.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a((hz)$$4, ha.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a((hz)$$4, ha.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a((hz)$$4, ha.f));
            $$4.c(ha.a);
        }
        $$4.c(ha.b);
        this.a($$2, $$3, $$5.a((hz)$$4, ha.c));
        this.a($$2, $$3, $$5.a((hz)$$4, ha.d));
        this.a($$2, $$3, $$5.a((hz)$$4, ha.e));
        this.a($$2, $$3, $$5.a((hz)$$4, ha.f));
        $$4.c(ha.a);
        gu.a $$10 = new gu.a();
        for (int $$11 = -3; $$11 < 4; ++$$11) {
            for (int $$12 = -3; $$12 < 4; ++$$12) {
                int $$13 = apa.a($$11) * apa.a($$12);
                if ($$3.a(10) >= 10 - $$13) continue;
                $$10.g($$4.b($$11, 0, $$12));
                int $$14 = 3;
                while ($$2.t($$5.a((hz)$$10, ha.a))) {
                    $$10.c(ha.a);
                    if (--$$14 > 0) continue;
                }
                if ($$2.t($$5.a((hz)$$10, ha.a))) continue;
                $$2.a((gu)$$10, cpo.dZ.n(), 2);
            }
        }
        return true;
    }

    private void a(cmn $$0, apf $$1, gu $$2) {
        if ($$1.h()) {
            $$0.a($$2, cpo.dZ.n(), 2);
        }
    }

    private boolean b(cmn $$0, apf $$1, gu $$2) {
        if ($$1.a(10) != 0) {
            $$0.a($$2, cpo.dZ.n(), 2);
            return true;
        }
        return false;
    }
}

