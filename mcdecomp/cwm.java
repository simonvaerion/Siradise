/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cwm
extends cpa {
    private static final float c = 1.0f;
    private static final efb d = cpn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb e = cpn.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    private static final efb f = cpn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final efb g = cpn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb h = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final efb i = cpn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    private static final Map<ha, efb> j = ac.a(Maps.newEnumMap(ha.class), (T $$0) -> {
        $$0.put(ha.c, h);
        $$0.put(ha.f, g);
        $$0.put(ha.d, i);
        $$0.put(ha.e, f);
        $$0.put(ha.b, d);
        $$0.put(ha.a, e);
    });
    public static final dcz<ha> a = crm.a;
    public static final acq b = new acq("contents");
    @Nullable
    private final cen k;

    public cwm(@Nullable cen $$0, dca.d $$1) {
        super($$1);
        this.k = $$0;
        this.k((dcb)((dcb)this.C.b()).a(a, ha.b));
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new dau(this.k, $$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cwm.a($$2, czp.x, dau::a);
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.b;
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$1.B) {
            return bdx.a;
        }
        if ($$3.G_()) {
            return bdx.b;
        }
        czn $$6 = $$1.c_($$2);
        if ($$6 instanceof dau) {
            dau $$7 = (dau)$$6;
            if (cwm.a($$0, $$1, $$2, $$7)) {
                $$3.a($$7);
                $$3.a(amr.aq);
                bxf.a($$3, true);
            }
            return bdx.b;
        }
        return bdx.d;
    }

    private static boolean a(dcb $$0, cmm $$1, gu $$2, dau $$3) {
        if ($$3.i() != dau.a.a) {
            return true;
        }
        eed $$4 = bwi.a($$0.c(a), 0.0f, 0.5f).a($$2).h(1.0E-6);
        return $$1.b($$4);
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, $$0.k());
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        czn $$4 = $$0.c_($$1);
        if ($$4 instanceof dau) {
            dau $$5 = (dau)$$4;
            if (!$$0.B && $$3.f() && !$$5.ab_()) {
                cfz $$6 = cwm.b(this.a());
                $$4.e($$6);
                if ($$5.aa()) {
                    $$6.a($$5.ab());
                }
                bvh $$7 = new bvh($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
                $$7.o();
                $$0.b($$7);
            } else {
                $$5.e($$3);
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public List<cfz> a(dcb $$0, dzq.a $$12) {
        czn $$2 = $$12.b(ebw.h);
        if ($$2 instanceof dau) {
            dau $$3 = (dau)$$2;
            $$12 = $$12.a(b, (Consumer<cfz> $$1) -> {
                for (int $$2 = 0; $$2 < $$3.b(); ++$$2) {
                    $$1.accept($$3.a($$2));
                }
            });
        }
        return super.a($$0, $$12);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
        czn $$5;
        if ($$4.A() && ($$5 = $$0.c_($$1)) instanceof dau) {
            ((dau)$$5).a($$4.y());
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        czn $$5 = $$1.c_($$2);
        if ($$5 instanceof dau) {
            $$1.c($$2, $$0.b());
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(cfz $$0, @Nullable cls $$1, List<sw> $$2, chq $$3) {
        super.a($$0, $$1, $$2, $$3);
        qr $$4 = cds.a($$0);
        if ($$4 != null) {
            if ($$4.b("LootTable", 8)) {
                $$2.add(sw.b("???????"));
            }
            if ($$4.b("Items", 9)) {
                hn<cfz> $$5 = hn.a(27, cfz.b);
                bdr.b($$4, $$5);
                int $$6 = 0;
                int $$7 = 0;
                for (cfz $$8 : $$5) {
                    if ($$8.b()) continue;
                    ++$$7;
                    if ($$6 > 4) continue;
                    ++$$6;
                    tj $$9 = $$8.y().e();
                    $$9.f(" x").f(String.valueOf($$8.L()));
                    $$2.add($$9);
                }
                if ($$7 - $$6 > 0) {
                    $$2.add(sw.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
                }
            }
        }
    }

    @Override
    public efb b_(dcb $$0, cls $$1, gu $$2) {
        dau $$4;
        czn $$3 = $$1.c_($$2);
        if ($$3 instanceof dau && !($$4 = (dau)$$3).v()) {
            return j.get($$0.c(a).g());
        }
        return eey.b();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        czn $$4 = $$1.c_($$2);
        if ($$4 instanceof dau) {
            return eey.a(((dau)$$4).a($$0));
        }
        return eey.b();
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$0, cmm $$1, gu $$2) {
        return cbf.b((bdq)((Object)$$1.c_($$2)));
    }

    @Override
    public cfz a(cls $$0, gu $$12, dcb $$2) {
        cfz $$3 = super.a($$0, $$12, $$2);
        $$0.a($$12, czp.x).ifPresent($$1 -> $$1.e($$3));
        return $$3;
    }

    @Nullable
    public static cen b(cfu $$0) {
        return cwm.a(cpn.a($$0));
    }

    @Nullable
    public static cen a(cpn $$0) {
        if ($$0 instanceof cwm) {
            return ((cwm)$$0).a();
        }
        return null;
    }

    public static cpn a(@Nullable cen $$0) {
        if ($$0 == null) {
            return cpo.kP;
        }
        switch ($$0) {
            case a: {
                return cpo.kQ;
            }
            case b: {
                return cpo.kR;
            }
            case c: {
                return cpo.kS;
            }
            case d: {
                return cpo.kT;
            }
            case e: {
                return cpo.kU;
            }
            case f: {
                return cpo.kV;
            }
            case g: {
                return cpo.kW;
            }
            case h: {
                return cpo.kX;
            }
            case i: {
                return cpo.kY;
            }
            case j: {
                return cpo.kZ;
            }
            default: {
                return cpo.la;
            }
            case l: {
                return cpo.lb;
            }
            case m: {
                return cpo.lc;
            }
            case n: {
                return cpo.ld;
            }
            case o: {
                return cpo.le;
            }
            case p: 
        }
        return cpo.lf;
    }

    @Nullable
    public cen a() {
        return this.k;
    }

    public static cfz b(@Nullable cen $$0) {
        return new cfz(cwm.a($$0));
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }
}

