/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class crf
extends cpn
implements cwo {
    public static final dcs a = cuz.a;
    public static final dcs b = cuz.b;
    public static final dcs c = cuz.c;
    public static final dcs d = cuz.d;
    public static final dcs e = dcr.C;
    protected static final Map<ha, dcs> f = cuz.g.entrySet().stream().filter($$0 -> ((ha)$$0.getKey()).o().d()).collect(ac.a());
    protected final efb[] g;
    protected final efb[] h;
    private final Object2IntMap<dcb> i = new Object2IntOpenHashMap();

    protected crf(float $$0, float $$1, float $$2, float $$3, float $$4, dca.d $$5) {
        super($$5);
        this.g = this.a($$0, $$1, $$4, 0.0f, $$4);
        this.h = this.a($$0, $$1, $$2, 0.0f, $$3);
        for (dcb $$6 : this.C.a()) {
            this.g($$6);
        }
    }

    protected efb[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
        float $$5 = 8.0f - $$0;
        float $$6 = 8.0f + $$0;
        float $$7 = 8.0f - $$1;
        float $$8 = 8.0f + $$1;
        efb $$9 = cpn.a($$5, 0.0, $$5, $$6, $$2, $$6);
        efb $$10 = cpn.a($$7, $$3, 0.0, $$8, $$4, $$8);
        efb $$11 = cpn.a($$7, $$3, $$7, $$8, $$4, 16.0);
        efb $$12 = cpn.a(0.0, $$3, $$7, $$8, $$4, $$8);
        efb $$13 = cpn.a($$7, $$3, $$7, 16.0, $$4, $$8);
        efb $$14 = eey.a($$10, $$13);
        efb $$15 = eey.a($$11, $$12);
        efb[] $$16 = new efb[]{eey.a(), $$11, $$12, $$15, $$10, eey.a($$11, $$10), eey.a($$12, $$10), eey.a($$15, $$10), $$13, eey.a($$11, $$13), eey.a($$12, $$13), eey.a($$15, $$13), $$14, eey.a($$11, $$14), eey.a($$12, $$14), eey.a($$15, $$14)};
        for (int $$17 = 0; $$17 < 16; ++$$17) {
            $$16[$$17] = eey.a($$9, $$16[$$17]);
        }
        return $$16;
    }

    @Override
    public boolean c(dcb $$0, cls $$1, gu $$2) {
        return $$0.c(e) == false;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.h[this.g($$0)];
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.g[this.g($$0)];
    }

    private static int a(ha $$0) {
        return 1 << $$0.e();
    }

    protected int g(dcb $$02) {
        return this.i.computeIntIfAbsent((Object)$$02, $$0 -> {
            int $$1 = 0;
            if ($$0.c(a).booleanValue()) {
                $$1 |= crf.a(ha.c);
            }
            if ($$0.c(b).booleanValue()) {
                $$1 |= crf.a(ha.f);
            }
            if ($$0.c(c).booleanValue()) {
                $$1 |= crf.a(ha.d);
            }
            if ($$0.c(d).booleanValue()) {
                $$1 |= crf.a(ha.e);
            }
            return $$1;
        });
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(e).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(c))).a(b, $$0.c(d))).a(c, $$0.c(a))).a(d, $$0.c(b));
            }
            case d: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(b))).a(b, $$0.c(c))).a(c, $$0.c(d))).a(d, $$0.c(a));
            }
            case b: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(d))).a(b, $$0.c(a))).a(c, $$0.c(b))).a(d, $$0.c(c));
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        switch ($$1) {
            case b: {
                return (dcb)((dcb)$$0.a(a, $$0.c(c))).a(c, $$0.c(a));
            }
            case c: {
                return (dcb)((dcb)$$0.a(b, $$0.c(d))).a(d, $$0.c(b));
            }
        }
        return super.a($$0, $$1);
    }
}

