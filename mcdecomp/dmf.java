/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dmf
extends dko<dmz> {
    private static final gu a = new gu(8, 3, 8);
    private static final clt b = new clt(a);
    private static final int c = 16;
    private static final int d = 1;

    public dmf(Codec<dmz> $$0) {
        super($$0);
    }

    private static int a(int $$0, int $$1, int $$2, int $$3) {
        return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        cng $$1 = $$0.b();
        clt $$2 = new clt($$0.e());
        if (dmf.a($$2.e, $$2.f, dmf.b.e, dmf.b.f) > 1) {
            return true;
        }
        gu $$3 = a.h($$0.e().v() + a.v());
        gu.a $$4 = new gu.a();
        for (int $$5 = $$2.e(); $$5 <= $$2.g(); ++$$5) {
            for (int $$6 = $$2.d(); $$6 <= $$2.f(); ++$$6) {
                if (dmf.a($$3.u(), $$3.w(), $$6, $$5) > 16) continue;
                $$4.d($$6, $$3.v(), $$5);
                if ($$4.equals($$3)) {
                    $$1.a((gu)$$4, cpo.m.n(), 2);
                    continue;
                }
                $$1.a((gu)$$4, cpo.b.n(), 2);
            }
        }
        return true;
    }
}

