/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class me {
    private static final hu a = new hu().a(jc.au, np::a).a(jc.ar, nn::a).a(jc.as, om::a).a(jc.ay, pb::a).a(jc.az, ny::a).a(jc.aB, nx::a).a(jc.aA, nu::a).a(jc.aC, nt::a).a(jc.ap, oe::a).a(jc.aG, cnz::a).a(jc.ax, nq::a).a(jc.at, dhr::a).a(jc.aw, dhp::a).a(jc.aF, drq::a).a(jc.av, dqc::a).a(jc.aq, ss::a).a(jc.aE, cif::a).a(jc.aD, cid::a).a(jc.p, beq::a);

    private static void a(hg.b $$0) {
        me.a($$0.b(jc.ay), $$0.b(jc.ap));
    }

    public static void a(hf<dre> $$0, hg<cnk> $$12) {
        $$12.b().forEach($$1 -> {
            acq $$2 = $$1.g().a();
            List<hi<dre>> $$32 = ((cnk)$$1.a()).d().b();
            $$32.stream().flatMap(hi::a).forEach($$3 -> $$3.d().ifLeft($$2 -> {
                Object $$3 = $$0.b((acp<dre>)$$2);
                if (!me.a((dre)$$3.a())) {
                    ac.a("Placed feature " + $$2.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
                }
            }).ifRight($$1 -> {
                if (!me.a($$1)) {
                    ac.a("Placed inline feature in biome " + $$1 + " is missing BiomeFilter.biome()");
                }
            }));
        });
    }

    private static boolean a(dre $$0) {
        return $$0.c().contains(dqs.a());
    }

    public static hg.b a() {
        hs.b $$0 = hs.a(jb.ap);
        hg.b $$1 = a.a($$0);
        me.a($$1);
        return $$1;
    }
}

