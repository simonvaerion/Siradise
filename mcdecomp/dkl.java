/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dkl
extends dko<dmr> {
    public dkl(Codec<dmr> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmr> $$0) {
        gu $$1 = $$0.e();
        cng $$2 = $$0.b();
        dmr $$32 = $$0.f();
        for (gu $$4 : gu.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
            boolean $$8;
            boolean $$5 = $$4.u() == $$1.u();
            boolean $$6 = $$4.v() == $$1.v();
            boolean $$7 = $$4.w() == $$1.w();
            boolean bl2 = $$8 = Math.abs($$4.v() - $$1.v()) == 2;
            if ($$5 && $$6 && $$7) {
                gu $$9 = $$4.i();
                this.a($$2, $$9, cpo.kF.n());
                $$32.b().ifPresent($$3 -> {
                    czn $$4 = $$2.c_($$9);
                    if ($$4 instanceof dbb) {
                        dbb $$5 = (dbb)$$4;
                        $$5.a((gu)$$3, $$32.c());
                        $$4.e();
                    }
                });
                continue;
            }
            if ($$6) {
                this.a($$2, $$4, cpo.a.n());
                continue;
            }
            if ($$8 && $$5 && $$7) {
                this.a($$2, $$4, cpo.F.n());
                continue;
            }
            if (!$$5 && !$$7 || $$8) {
                this.a($$2, $$4, cpo.a.n());
                continue;
            }
            this.a($$2, $$4, cpo.F.n());
        }
        return true;
    }
}

