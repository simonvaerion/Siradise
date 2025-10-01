/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dmc
extends dko<dnq> {
    public dmc(Codec<dnq> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dnq> $$0) {
        hz $$7;
        cng $$12 = $$0.b();
        gu $$22 = $$0.e();
        dnq $$3 = $$0.f();
        apf $$4 = $$0.d();
        OptionalInt $$5 = dmc.a($$12, $$22, $$3);
        if (!$$5.isPresent()) {
            return false;
        }
        gu $$6 = $$22.h($$5.getAsInt());
        eed $$8 = new eed($$6.b($$7 = new hz($$3.c, $$3.c, $$3.c)), $$6.a($$7));
        return gu.a($$8).filter($$2 -> $$4.i() < $$1.d).filter($$1 -> this.b($$12, (gu)$$1)).mapToInt($$1 -> {
            $$12.a((gu)$$1, cpo.kJ.n(), 2);
            return 1;
        }).sum() > 0;
    }

    private static OptionalInt a(cng $$02, gu $$1, dnq $$2) {
        Predicate<dcb> $$3 = $$0 -> $$0.a(cpo.G);
        Predicate<dcb> $$4 = $$0 -> !$$0.a(cpo.G);
        Optional<dha> $$5 = dha.a($$02, $$1, $$2.b, $$3, $$4);
        return $$5.map(dha::c).orElseGet(OptionalInt::empty);
    }

    private boolean b(cng $$0, gu $$1) {
        if (this.a((cmn)$$0, $$1) || this.a((cmn)$$0, $$1.d())) {
            return false;
        }
        for (ha $$2 : ha.c.a) {
            if (!this.a((cmn)$$0, $$1.a($$2))) continue;
            return false;
        }
        return true;
    }

    private boolean a(cmn $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        return $$2.a(cpo.G) || $$2.i();
    }
}

