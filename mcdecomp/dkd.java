/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dkd
extends dko<dmz> {
    public dkd(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        apf $$12 = $$0.d();
        cng $$2 = $$0.b();
        gu $$3 = $$0.e();
        Optional<cpn> $$4 = jb.f.b(amw.ao).flatMap($$1 -> $$1.a($$12)).map(he::a);
        if ($$4.isEmpty()) {
            return false;
        }
        return this.a((cmn)$$2, $$12, $$3, $$4.get().n());
    }

    protected abstract boolean a(cmn var1, apf var2, gu var3, dcb var4);

    protected boolean b(cmn $$0, apf $$12, gu $$22, dcb $$32) {
        gu $$4 = $$22.c();
        dcb $$5 = $$0.a_($$22);
        if (!$$5.a(cpo.G) && !$$5.a(amw.ar) || !$$0.a_($$4).a(cpo.G)) {
            return false;
        }
        $$0.a($$22, $$32, 3);
        if ($$12.i() < 0.25f) {
            jb.f.b(amw.ar).flatMap($$1 -> $$1.a($$12)).map(he::a).ifPresent($$2 -> $$0.a($$4, $$2.n(), 2));
        } else if ($$12.i() < 0.05f) {
            $$0.a($$4, (dcb)cpo.mV.n().a(cwk.b, $$12.a(4) + 1), 2);
        }
        for (ha $$6 : ha.c.a) {
            gu $$7;
            if (!($$12.i() < 0.2f) || !$$0.a_($$7 = $$22.a($$6)).a(cpo.G)) continue;
            jb.f.b(amw.ap).flatMap($$1 -> $$1.a($$12)).map(he::a).ifPresent($$3 -> {
                dcb $$4 = $$3.n();
                if ($$4.b(coz.a)) {
                    $$4 = (dcb)$$4.a(coz.a, $$6);
                }
                $$0.a($$7, $$4, 2);
            });
        }
        return true;
    }
}

