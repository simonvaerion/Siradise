/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class ka
implements kd {
    protected static final eck.a a = ecr.a(bz.a.a().a(new bj(ckk.v, cj.d.b(1))));
    protected static final eck.a b = a.invert();
    protected static final eck.a c = ecr.a(bz.a.a().a(cgc.rg));
    private static final eck.a h = c.or(a);
    private static final eck.a i = h.invert();
    protected final Set<cfu> d;
    protected final caw e;
    protected final Map<acq, dzs.a> f;
    protected static final float[] g = new float[]{0.05f, 0.0625f, 0.083333336f, 0.1f};
    private static final float[] j = new float[]{0.02f, 0.022222223f, 0.025f, 0.033333335f, 0.1f};

    protected ka(Set<cfu> $$0, caw $$1) {
        this($$0, $$1, new HashMap<acq, dzs.a>());
    }

    protected ka(Set<cfu> $$0, caw $$1, Map<acq, dzs.a> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    protected <T extends eaw<T>> T a(cml $$0, eaw<T> $$1) {
        if (!this.d.contains($$0.k())) {
            return $$1.b(ean.c());
        }
        return $$1.c();
    }

    protected <T extends ecd<T>> T a(cml $$0, ecd<T> $$1) {
        if (!this.d.contains($$0.k())) {
            return $$1.b(ecg.c());
        }
        return $$1.d();
    }

    public dzs.a a(cml $$0) {
        return dzs.b().a(this.a($$0, dzr.a().a(edd.a(1.0f)).a(eac.a($$0))));
    }

    private static dzs.a a(cpn $$0, eck.a $$1, eaf.a<?> $$2) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a(((eah.a)eac.a($$0).a($$1)).a($$2)));
    }

    protected static dzs.a a(cpn $$0, eaf.a<?> $$1) {
        return ka.a($$0, a, $$1);
    }

    protected static dzs.a b(cpn $$0, eaf.a<?> $$1) {
        return ka.a($$0, c, $$1);
    }

    protected static dzs.a c(cpn $$0, eaf.a<?> $$1) {
        return ka.a($$0, h, $$1);
    }

    protected dzs.a a(cpn $$0, cml $$1) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, eac.a($$1)));
    }

    protected dzs.a a(cml $$0, edf $$1) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a((eaf.a)this.a($$0, (eaw)eac.a($$0).a(ebj.a($$1)))));
    }

    protected dzs.a a(cpn $$0, cml $$1, edf $$2) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)eac.a($$1).a(ebj.a($$2))));
    }

    private static dzs.a c(cml $$0) {
        return dzs.b().a(dzr.a().a(a).a(edd.a(1.0f)).a(eac.a($$0)));
    }

    private dzs.a d(cml $$0) {
        return dzs.b().a(this.a((cml)cpo.fR, dzr.a().a(edd.a(1.0f)).a(eac.a(cpo.fR)))).a(this.a($$0, dzr.a().a(edd.a(1.0f)).a(eac.a($$0))));
    }

    protected dzs.a a(cpn $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a((eaf.a)this.a((cml)$$0, (eaw)eac.a($$0).a((eaz.a)ebj.a(edd.a(2.0f)).a(ecj.a($$0).a(cz.a.a().a(cwq.a, ddj.c)))))));
    }

    protected <T extends Comparable<T> & apr> dzs.a a(cpn $$0, dde<T> $$1, T $$2) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a<?>)eac.a($$0).a(ecj.a($$0).a(cz.a.a().a($$1, $$2))))));
    }

    protected dzs.a b(cpn $$0) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a<?>)eac.a($$0).a(eap.a(eap.a.d)))));
    }

    protected dzs.a c(cpn $$0) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a<?>)((eah.a)((eah.a)eac.a($$0).a(eap.a(eap.a.d))).a(eaq.a(ecw.a).a("Lock", "BlockEntityTag.Lock").a("LootTable", "BlockEntityTag.LootTable").a("LootTableSeed", "BlockEntityTag.LootTableSeed"))).a(ebf.a(czp.x).a(dzz.a(cwm.b))))));
    }

    protected dzs.a d(cpn $$0) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)((eah.a)eac.a(cgc.nR).a(ebj.a(edi.a(2.0f, 5.0f)))).a(eam.a(ckk.x))));
    }

    protected dzs.a e(cpn $$0) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)((eah.a)eac.a(cgc.nM).a(ebj.a(edi.a(4.0f, 9.0f)))).a(eam.a(ckk.x))));
    }

    protected dzs.a f(cpn $$0) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)((eah.a)eac.a(cgc.ll).a(ebj.a(edi.a(4.0f, 5.0f)))).a(eam.b(ckk.x))));
    }

    protected dzs.a g(cpn $$0) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a<?>)((eah.a)eac.a($$0).a(eap.a(eap.a.d))).a(eaq.a(ecw.a).a("Patterns", "BlockEntityTag.Patterns")))));
    }

    protected static dzs.a h(cpn $$0) {
        return dzs.b().a(dzr.a().a(a).a(edd.a(1.0f)).a((eaf.a<?>)((eah.a)eac.a($$0).a(eaq.a(ecw.a).a("Bees", "BlockEntityTag.Bees"))).a(eao.a($$0).a(cph.b))));
    }

    protected static dzs.a i(cpn $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a(((eaf.a)((eah.a)((eah.a)eac.a($$0).a(a)).a(eaq.a(ecw.a).a("Bees", "BlockEntityTag.Bees"))).a(eao.a($$0).a(cph.b))).a(eac.a($$0))));
    }

    protected static dzs.a j(cpn $$0) {
        return dzs.b().a(dzr.a().a(eac.a(cgc.vw)).a(ecj.a($$0).a(cz.a.a().a(cqi.s_, true))));
    }

    protected dzs.a a(cpn $$0, cfu $$1) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)eac.a($$1).a(eam.a(ckk.x))));
    }

    protected dzs.a b(cpn $$0, cml $$1) {
        return ka.a($$0, (eaf.a)this.a((cml)$$0, (eaw)((eah.a)eac.a($$1).a(ebj.a(edi.a(-6.0f, 2.0f)))).a(eax.a(dzj.b(0)))));
    }

    protected dzs.a k(cpn $$0) {
        return ka.b($$0, (eaf.a)this.a((cml)$$0, (eaw)((eah.a)eac.a(cgc.oH).a(ecp.a(0.125f))).a(eam.a(ckk.x, 2))));
    }

    public dzs.a b(cpn $$0, cfu $$12) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a)eac.a($$12).a(cxj.b.a(), (E $$1) -> ebj.a(edc.a(3, (float)($$1 + 1) / 15.0f)).a(ecj.a($$0).a(cz.a.a().a(cxj.b, $$1.intValue())))))));
    }

    public dzs.a c(cpn $$0, cfu $$1) {
        return dzs.b().a(this.a((cml)$$0, dzr.a().a(edd.a(1.0f)).a((eaf.a<?>)eac.a($$1).a(ebj.a(edc.a(3, 0.53333336f))))));
    }

    protected static dzs.a b(cml $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a(c).a(eac.a($$0)));
    }

    protected dzs.a a(cpn $$0, eck.a $$12) {
        return dzs.b().a(dzr.a().a((eaf.a)this.a((cml)$$0, (eaw)((eah.a)((eah.a)eac.a($$0).a($$12)).a(ha.values(), (E $$1) -> ebj.a((edf)edd.a(1.0f), true).a(ecj.a($$0).a(cz.a.a().a(cul.b($$1), true))))).a(ebj.a((edf)edd.a(-1.0f), true)))));
    }

    protected dzs.a a(cpn $$0, cpn $$1, float ... $$2) {
        return ka.c($$0, ((eah.a)this.a((cml)$$0, eac.a($$1))).a(eca.a(ckk.x, $$2))).a(dzr.a().a(edd.a(1.0f)).a(i).a((eaf.a<?>)((eah.a)this.a((cml)$$0, (eaw)eac.a(cgc.oB).a(ebj.a(edi.a(1.0f, 2.0f))))).a(eca.a(ckk.x, j))));
    }

    protected dzs.a b(cpn $$0, cpn $$1, float ... $$2) {
        return this.a($$0, $$1, $$2).a(dzr.a().a(edd.a(1.0f)).a(i).a((eaf.a<?>)((eah.a)this.a((cml)$$0, eac.a(cgc.nF))).a(eca.a(ckk.x, 0.005f, 0.0055555557f, 0.00625f, 0.008333334f, 0.025f))));
    }

    protected dzs.a l(cpn $$0) {
        return ka.c($$0, ((eah.a)this.a((cml)cpo.aL, (eaw)eac.a(cgc.oB).a(ebj.a(edi.a(1.0f, 2.0f))))).a(eca.a(ckk.x, j)));
    }

    protected dzs.a a(cpn $$0, cfu $$1, cfu $$2, eck.a $$3) {
        return this.a((cml)$$0, dzs.b().a(dzr.a().a(((eah.a)eac.a($$1).a($$3)).a(eac.a($$2)))).a(dzr.a().a($$3).a((eaf.a<?>)eac.a($$2).a(eam.a(ckk.x, 0.5714286f, 3)))));
    }

    protected static dzs.a m(cpn $$0) {
        return dzs.b().a(dzr.a().a(c).a((eaf.a<?>)eac.a($$0).a(ebj.a(edd.a(2.0f)))));
    }

    protected dzs.a a(cpn $$0, cpn $$1) {
        dzw.a $$2 = ((eah.a)((eaf.a)eac.a($$1).a(ebj.a(edd.a(2.0f)))).a(c)).a((eaf.a<?>)((eah.a)this.a((cml)$$0, eac.a(cgc.oH))).a(ecp.a(0.125f)));
        return dzs.b().a(dzr.a().a($$2).a(ecj.a($$0).a(cz.a.a().a(crr.a, dcx.b))).a(eci.a(ch.a.a().a(at.a.a().a($$0).a(cz.a.a().a(crr.a, dcx.a).b()).b()), new gu(0, 1, 0)))).a(dzr.a().a($$2).a(ecj.a($$0).a(cz.a.a().a(crr.a, dcx.a))).a(eci.a(ch.a.a().a(at.a.a().a($$0).a(cz.a.a().a(crr.a, dcx.b).b()).b()), new gu(0, -1, 0))));
    }

    protected dzs.a n(cpn $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a((eaf.a)this.a((cml)$$0, (eaw)eac.a($$0).a(List.of(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)), (E $$1) -> ebj.a(edd.a($$1.intValue())).a(ecj.a($$0).a(cz.a.a().a(cqb.e, $$1.intValue())))))));
    }

    protected dzs.a o(cpn $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a((eaf.a)this.a((cml)$$0, (eaw)eac.a($$0).a(IntStream.rangeClosed(1, 4).boxed().toList(), (E $$1) -> ebj.a(edd.a($$1.intValue())).a(ecj.a($$0).a(cz.a.a().a(cuy.d, $$1.intValue())))))));
    }

    protected static dzs.a p(cpn $$0) {
        return dzs.b().a(dzr.a().a(edd.a(1.0f)).a(eac.a($$0)));
    }

    public static dzs.a a() {
        return dzs.b();
    }

    protected abstract void b();

    @Override
    public void generate(BiConsumer<acq, dzs.a> $$0) {
        this.b();
        HashSet<acq> $$1 = new HashSet<acq>();
        for (cpn $$2 : jb.f) {
            acq $$3;
            if (!$$2.a(this.e) || ($$3 = $$2.r()) == dzg.a || !$$1.add($$3)) continue;
            dzs.a $$4 = this.f.remove($$3);
            if ($$4 == null) {
                throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3, jb.f.b($$2)));
            }
            $$0.accept($$3, $$4);
        }
        if (!this.f.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + this.f.keySet());
        }
    }

    protected void b(cpn $$0, cpn $$1) {
        dzs.a $$2 = ka.c($$0, eac.a($$0).a(eca.a(ckk.x, 0.33f, 0.55f, 0.77f, 1.0f)));
        this.a($$0, $$2);
        this.a($$1, $$2);
    }

    protected dzs.a q(cpn $$0) {
        return this.a($$0, crp.e, dcx.b);
    }

    protected void r(cpn $$02) {
        this.a($$02, (cpn $$0) -> this.d((cml)((csm)$$0).a()));
    }

    protected void c(cpn $$0, cpn $$1) {
        this.a($$0, ka.c($$1));
    }

    protected void c(cpn $$0, cml $$1) {
        this.a($$0, this.a($$1));
    }

    protected void s(cpn $$0) {
        this.c($$0, $$0);
    }

    protected void t(cpn $$0) {
        this.c($$0, (cml)$$0);
    }

    protected void a(cpn $$0, Function<cpn, dzs.a> $$1) {
        this.a($$0, $$1.apply($$0));
    }

    protected void a(cpn $$0, dzs.a $$1) {
        this.f.put($$0.r(), $$1);
    }
}

