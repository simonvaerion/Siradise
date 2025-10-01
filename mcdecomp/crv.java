/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public class crv
extends cpa {
    protected static final efb a = cpn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
    public static final List<gu> b = gu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gu::i).toList();

    protected crv(dca.d $$0) {
        super($$0);
    }

    public static boolean a(cmm $$0, gu $$1, gu $$2) {
        return $$0.a_($$1.a($$2)).a(amw.cl) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(amw.cm);
    }

    @Override
    public boolean g_(dcb $$0) {
        return true;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return a;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        super.a($$0, $$1, $$2, $$3);
        for (gu $$4 : b) {
            if ($$3.a(16) != 0 || !crv.a($$1, $$2, $$4)) continue;
            $$1.a(iv.t, (double)$$2.u() + 0.5, (double)$$2.v() + 2.0, (double)$$2.w() + 0.5, (double)((float)$$4.u() + $$3.i()) - 0.5, (double)((float)$$4.v() - $$3.i() - 1.0f), (double)((float)$$4.w() + $$3.i()) - 0.5);
        }
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new dag($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return $$0.B ? crv.a($$2, czp.m, dag::a) : null;
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$1.B) {
            return bdx.a;
        }
        $$3.a($$0.b($$1, $$2));
        return bdx.b;
    }

    @Override
    @Nullable
    public bea b(dcb $$0, cmm $$1, gu $$22) {
        czn $$32 = $$1.c_($$22);
        if ($$32 instanceof dag) {
            sw $$42 = ((beb)((Object)$$32)).H_();
            return new bef(($$2, $$3, $$4) -> new cbx($$2, $$3, cbq.a($$1, $$22)), $$42);
        }
        return null;
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
        czn $$5;
        if ($$4.A() && ($$5 = $$0.c_($$1)) instanceof dag) {
            ((dag)$$5).a($$4.y());
        }
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

