/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fuc {
    private static final Map<acq, fud> a = Maps.newHashMap();
    private static final String b = "CustomModelData";
    private static final acq c = new acq("damaged");
    private static final acq d = new acq("damage");
    private static final fua e = ($$0, $$1, $$2, $$3) -> $$0.j() ? 1.0f : 0.0f;
    private static final fua f = ($$0, $$1, $$2, $$3) -> apa.a((float)$$0.k() / (float)$$0.l(), 0.0f, 1.0f);
    private static final Map<cfu, Map<acq, fud>> g = Maps.newHashMap();

    private static fua a(acq $$0, fua $$1) {
        a.put($$0, $$1);
        return $$1;
    }

    private static void a(fud $$0) {
        a.put(new acq("custom_model_data"), $$0);
    }

    private static void a(cfu $$02, acq $$1, fua $$2) {
        g.computeIfAbsent($$02, $$0 -> Maps.newHashMap()).put($$1, $$2);
    }

    @Nullable
    public static fud a(cfu $$0, acq $$1) {
        fud $$2;
        if ($$0.n() > 0) {
            if (d.equals($$1)) {
                return f;
            }
            if (c.equals($$1)) {
                return e;
            }
        }
        if (($$2 = a.get($$1)) != null) {
            return $$2;
        }
        Map<acq, fud> $$3 = g.get($$0);
        if ($$3 == null) {
            return null;
        }
        return $$3.get($$1);
    }

    static {
        fuc.a(new acq("lefthanded"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 == null || $$2.fh() == bft.b ? 0.0f : 1.0f);
        fuc.a(new acq("cooldown"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 instanceof byo ? ((byo)$$2).gi().a($$0.d(), 0.0f) : 0.0f);
        fua $$02 = ($$0, $$1, $$2, $$3) -> {
            if (!$$0.a(ane.aH)) {
                return Float.NEGATIVE_INFINITY;
            }
            if ($$1 == null) {
                return 0.0f;
            }
            return cib.a($$1.B_(), $$0).map(cib::b).map(he::a).map(cic::c).orElse(Float.valueOf(0.0f)).floatValue();
        };
        fuc.a(kr.a, $$02);
        fuc.a((cfz $$0, few $$1, bfz $$2, int $$3) -> $$0.u() ? (float)$$0.v().h(b) : 0.0f);
        fuc.a(cgc.nG, new acq("pull"), (cfz $$0, few $$1, bfz $$2, int $$3) -> {
            if ($$2 == null) {
                return 0.0f;
            }
            if ($$2.fk() != $$0) {
                return 0.0f;
            }
            return (float)($$0.r() - $$2.fl()) / 20.0f;
        });
        fuc.a(cgc.wv, new acq("brushing"), (cfz $$0, few $$1, bfz $$2, int $$3) -> {
            if ($$2 == null || $$2.fk() != $$0) {
                return 0.0f;
            }
            return (float)($$2.fl() % 10) / 10.0f;
        });
        fuc.a(cgc.nG, new acq("pulling"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0 ? 1.0f : 0.0f);
        fuc.a(cgc.qg, new acq("filled"), (cfz $$0, few $$1, bfz $$2, int $$3) -> ceb.d($$0));
        fuc.a(cgc.qi, new acq("time"), new fua(){
            private double a;
            private double b;
            private long c;

            @Override
            public float unclampedCall(cfz $$0, @Nullable few $$1, @Nullable bfz $$2, int $$3) {
                double $$6;
                bfj $$4;
                bfj bfj2 = $$4 = $$2 != null ? $$2 : $$0.H();
                if ($$4 == null) {
                    return 0.0f;
                }
                if ($$1 == null && $$4.dI() instanceof few) {
                    $$1 = (few)$$4.dI();
                }
                if ($$1 == null) {
                    return 0.0f;
                }
                if ($$1.x_().j()) {
                    double $$5 = $$1.f(1.0f);
                } else {
                    $$6 = Math.random();
                }
                $$6 = this.a($$1, $$6);
                return (float)$$6;
            }

            private double a(cmm $$0, double $$1) {
                if ($$0.V() != this.c) {
                    this.c = $$0.V();
                    double $$2 = $$1 - this.a;
                    $$2 = apa.c($$2 + 0.5, 1.0) - 0.5;
                    this.b += $$2 * 0.1;
                    this.b *= 0.9;
                    this.a = apa.c(this.a + this.b, 1.0);
                }
                return this.a;
            }
        });
        fuc.a(cgc.qe, new acq("angle"), new fub(($$0, $$1, $$2) -> {
            if (ced.d($$1)) {
                return ced.a($$1.w());
            }
            return ced.a($$0);
        }));
        fuc.a(cgc.qf, new acq("angle"), new fub(($$0, $$1, $$2) -> {
            if ($$2 instanceof byo) {
                byo $$3 = (byo)$$2;
                return $$3.gm().orElse(null);
            }
            return null;
        }));
        fuc.a(cgc.uZ, new acq("pull"), (cfz $$0, few $$1, bfz $$2, int $$3) -> {
            if ($$2 == null) {
                return 0.0f;
            }
            if (ceh.d($$0)) {
                return 0.0f;
            }
            return (float)($$0.r() - $$2.fl()) / (float)ceh.k($$0);
        });
        fuc.a(cgc.uZ, new acq("pulling"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0 && !ceh.d($$0) ? 1.0f : 0.0f);
        fuc.a(cgc.uZ, new acq("charged"), (cfz $$0, few $$1, bfz $$2, int $$3) -> ceh.d($$0) ? 1.0f : 0.0f);
        fuc.a(cgc.uZ, new acq("firework"), (cfz $$0, few $$1, bfz $$2, int $$3) -> ceh.d($$0) && ceh.a($$0, cgc.tA) ? 1.0f : 0.0f);
        fuc.a(cgc.nh, new acq("broken"), (cfz $$0, few $$1, bfz $$2, int $$3) -> cet.d($$0) ? 0.0f : 1.0f);
        fuc.a(cgc.qh, new acq("cast"), (cfz $$0, few $$1, bfz $$2, int $$3) -> {
            boolean $$5;
            if ($$2 == null) {
                return 0.0f;
            }
            boolean $$4 = $$2.eO() == $$0;
            boolean bl2 = $$5 = $$2.eP() == $$0;
            if ($$2.eO().d() instanceof cff) {
                $$5 = false;
            }
            return ($$4 || $$5) && $$2 instanceof byo && ((byo)$$2).cj != null ? 1.0f : 0.0f;
        });
        fuc.a(cgc.uy, new acq("blocking"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0 ? 1.0f : 0.0f);
        fuc.a(cgc.uV, new acq("throwing"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0 ? 1.0f : 0.0f);
        fuc.a(cgc.hg, new acq("level"), (cfz $$0, few $$1, bfz $$2, int $$3) -> {
            qr $$4 = $$0.b("BlockStateTag");
            try {
                rk $$5;
                if ($$4 != null && ($$5 = $$4.c(cty.b.f())) != null) {
                    return (float)Integer.parseInt($$5.m_()) / 16.0f;
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            return 1.0f;
        });
        fuc.a(cgc.vi, new acq("tooting"), (cfz $$0, few $$1, bfz $$2, int $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0 ? 1.0f : 0.0f);
    }
}

