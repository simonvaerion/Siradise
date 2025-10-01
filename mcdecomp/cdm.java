/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class cdm
extends cfu {
    public cdm(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        ha $$1 = $$0.k();
        if ($$1 == ha.a) {
            return bdx.e;
        }
        cmm $$2 = $$0.q();
        cih $$3 = new cih($$0);
        gu $$4 = $$3.a();
        cfz $$5 = $$0.n();
        eei $$6 = eei.c($$4);
        eed $$7 = bfn.d.n().a($$6.a(), $$6.b(), $$6.c());
        if (!$$2.a((bfj)null, $$7) || !$$2.a_(null, $$7).isEmpty()) {
            return bdx.e;
        }
        if ($$2 instanceof aif) {
            aif $$8 = (aif)$$2;
            Consumer $$9 = bfn.a($$8, $$5, $$0.o());
            bux $$10 = bfn.d.b($$8, $$5.v(), $$9, $$4, bgd.m, true, true);
            if ($$10 == null) {
                return bdx.e;
            }
            float $$11 = (float)apa.d((apa.g($$0.i() - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            $$10.b($$10.dn(), $$10.dp(), $$10.dt(), $$11, 0.0f);
            $$8.a_($$10);
            $$2.a(null, $$10.dn(), $$10.dp(), $$10.dt(), amh.ao, ami.e, 0.75f, 0.8f);
            $$10.a(dgl.t, (bfj)$$0.o());
        }
        $$5.h(1);
        return bdx.a($$2.B);
    }
}

