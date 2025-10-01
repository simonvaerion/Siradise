/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dmg
extends dmd {
    public dmg(Codec<dnr> $$0) {
        super($$0);
    }

    @Override
    protected Set<gu> a(cng $$0, dnr $$1, apf $$2, gu $$3, Predicate<dcb> $$4, int $$5, int $$6) {
        Set<gu> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        HashSet<gu> $$8 = new HashSet<gu>();
        gu.a $$9 = new gu.a();
        for (gu $$10 : $$7) {
            if (dmg.a($$0, $$7, $$10, $$9)) continue;
            $$8.add($$10);
        }
        for (gu $$11 : $$8) {
            $$0.a($$11, cpo.G.n(), 2);
        }
        return $$8;
    }

    private static boolean a(cng $$0, Set<gu> $$1, gu $$2, gu.a $$3) {
        return dmg.a($$0, $$2, $$3, ha.c) || dmg.a($$0, $$2, $$3, ha.f) || dmg.a($$0, $$2, $$3, ha.d) || dmg.a($$0, $$2, $$3, ha.e) || dmg.a($$0, $$2, $$3, ha.a);
    }

    private static boolean a(cng $$0, gu $$1, gu.a $$2, ha $$3) {
        $$2.a((hz)$$1, $$3);
        return !$$0.a_($$2).d($$0, $$2, $$3.g());
    }

    @Override
    protected boolean a(cng $$0, dnr $$1, ddy $$2, apf $$3, gu $$4) {
        if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
            dcb $$5 = $$0.a_($$4);
            if ($$5.b(dcr.C) && !$$5.c(dcr.C).booleanValue()) {
                $$0.a($$4, (dcb)$$5.a(dcr.C, true), 2);
            }
            return true;
        }
        return false;
    }
}

