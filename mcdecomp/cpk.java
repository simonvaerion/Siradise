/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cpk
extends ctg
implements cpp,
cwo {
    private static final dcs a = dcr.C;
    private static final dcz<ddm> b = dcr.bl;
    private static final int c = -1;
    private static final Object2IntMap<ddm> d = (Object2IntMap)ac.a(new Object2IntArrayMap(), (T $$0) -> {
        $$0.defaultReturnValue(-1);
        $$0.put((Object)ddm.b, 10);
        $$0.put((Object)ddm.c, 10);
        $$0.put((Object)ddm.d, 100);
    });
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 11;
    private static final int h = 13;
    private static final Map<ddm, efb> i = ImmutableMap.of((Object)ddm.a, (Object)cpn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0), (Object)ddm.b, (Object)cpn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0), (Object)ddm.c, (Object)cpn.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0), (Object)ddm.d, (Object)eey.a());
    private static final efb j = cpn.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
    private static final Map<ha, efb> k = ImmutableMap.of((Object)ha.c, (Object)eey.b(cpl.a, j, eem.e), (Object)ha.d, (Object)eey.b(cpl.b, j, eem.e), (Object)ha.f, (Object)eey.b(cpl.c, j, eem.e), (Object)ha.e, (Object)eey.b(cpl.d, j, eem.e));
    private final Map<dcb, efb> l;

    protected cpk(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(aC, ha.c)).a(b, ddm.a));
        this.l = this.a(cpk::h);
    }

    private static efb h(dcb $$0) {
        return eey.a(i.get($$0.c(b)), k.get($$0.c(aC)));
    }

    public static void a(cmn $$0, apf $$1, gu $$2, ha $$3) {
        int $$6;
        int $$4 = apa.a($$1, 2, 5);
        gu.a $$5 = $$2.j();
        for ($$6 = 0; $$6 < $$4 && cpk.a((cmo)$$0, (gu)$$5, $$0.a_($$5)); ++$$6) {
            $$5.c(ha.b);
        }
        int $$7 = $$2.v() + $$6 - 1;
        $$5.q($$2.v());
        while ($$5.v() < $$7) {
            cpl.a($$0, (gu)$$5, $$0.b_($$5), $$3);
            $$5.c(ha.b);
        }
        cpk.a($$0, (gu)$$5, $$0.b_($$5), $$3);
    }

    private static boolean n(dcb $$0) {
        return $$0.i() || $$0.a(cpo.G) || $$0.a(cpo.rE);
    }

    protected static boolean a(cmo $$0, gu $$1, dcb $$2) {
        return !$$0.r($$1) && cpk.n($$2);
    }

    protected static boolean a(cmn $$0, gu $$1, dxe $$2, ha $$3) {
        dcb $$4 = (dcb)((dcb)cpo.rC.n().a(a, $$2.a(dxf.c))).a(aC, $$3);
        return $$0.a($$1, $$4, 3);
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        this.a($$1, $$0, $$2.a(), ddm.d, amh.gu);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(a).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.d();
        dcb $$4 = $$1.a_($$3);
        return $$4.a(this) || $$4.a(cpo.rD) || $$4.a(amw.bv);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.a && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        if ($$0.c(a).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1 == ha.b && $$2.a(this)) {
            return cpo.rD.l($$0);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        dcb $$4 = $$0.a_($$1.c());
        return cpk.n($$4);
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        dcb $$5;
        gu $$4 = $$2.c();
        if (cpk.a((cmo)$$0, $$4, $$5 = $$0.a_($$4))) {
            ha $$6 = $$3.c(aC);
            cpl.a((cmn)$$0, $$2, $$3.u(), $$6);
            cpk.a((cmn)$$0, $$4, $$5.u(), $$6);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if ($$1.B) {
            return;
        }
        if ($$0.c(b) == ddm.a && cpk.a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, ddm.b, null);
        }
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$1.B($$2)) {
            cpk.d($$0, $$1, $$2);
            return;
        }
        ddm $$4 = $$0.c(b);
        if ($$4 == ddm.b) {
            this.a($$0, (cmm)$$1, $$2, ddm.c, amh.gu);
        } else if ($$4 == ddm.c) {
            this.a($$0, (cmm)$$1, $$2, ddm.d, amh.gu);
        } else if ($$4 == ddm.d) {
            cpk.d($$0, $$1, $$2);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$1.B($$2)) {
            cpk.d($$0, $$1, $$2);
        }
    }

    private static void a(cmm $$0, gu $$1, amg $$2) {
        float $$3 = apa.b($$0.z, 0.8f, 1.2f);
        $$0.a(null, $$1, $$2, ami.e, 1.0f, $$3);
    }

    private static boolean a(gu $$0, bfj $$1) {
        return $$1.ay() && $$1.dg().d > (double)((float)$$0.v() + 0.6875f);
    }

    private void a(dcb $$0, cmm $$1, gu $$2, ddm $$3, @Nullable amg $$4) {
        int $$5;
        cpk.a($$0, $$1, $$2, $$3);
        if ($$4 != null) {
            cpk.a($$1, $$2, $$4);
        }
        if (($$5 = d.getInt((Object)$$3)) != -1) {
            $$1.a($$2, (cpn)this, $$5);
        }
    }

    private static void d(dcb $$0, cmm $$1, gu $$2) {
        cpk.a($$0, $$1, $$2, ddm.a);
        if ($$0.c(b) != ddm.a) {
            cpk.a($$1, $$2, amh.gv);
        }
    }

    private static void a(dcb $$0, cmm $$1, gu $$2, ddm $$3) {
        ddm $$4 = $$0.c(b);
        $$1.a($$2, (dcb)$$0.a(b, $$3), 2);
        if ($$3.a() && $$3 != $$4) {
            $$1.a(null, dgl.c, $$2);
        }
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return i.get($$0.c(b));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.l.get($$0);
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a().d());
        dxe $$2 = $$0.q().b_($$0.a());
        boolean $$3 = $$1.a(cpo.rC) || $$1.a(cpo.rD);
        return (dcb)((dcb)this.n().a(a, $$2.a(dxf.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, aC, b);
    }
}

