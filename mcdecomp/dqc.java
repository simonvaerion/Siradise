/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dqc {
    public static final acp<dqb> a = dqc.a("classic_flat");
    public static final acp<dqb> b = dqc.a("tunnelers_dream");
    public static final acp<dqb> c = dqc.a("water_world");
    public static final acp<dqb> d = dqc.a("overworld");
    public static final acp<dqb> e = dqc.a("snowy_kingdom");
    public static final acp<dqb> f = dqc.a("bottomless_pit");
    public static final acp<dqb> g = dqc.a("desert");
    public static final acp<dqb> h = dqc.a("redstone_ready");
    public static final acp<dqb> i = dqc.a("the_void");

    public static void a(nm<dqb> $$0) {
        new a($$0).a();
    }

    private static acp<dqb> a(String $$0) {
        return acp.a(jc.av, new acq($$0));
    }

    static class a {
        private final nm<dqb> a;

        a(nm<dqb> $$0) {
            this.a = $$0;
        }

        private void a(acp<dqb> $$0, cml $$1, acp<cnk> $$2, Set<acp<dsg>> $$3, boolean $$4, boolean $$5, dqa ... $$6) {
            hf<dsg> $$7 = this.a.a(jc.aB);
            hf<dre> $$8 = this.a.a(jc.ay);
            hf<cnk> $$9 = this.a.a(jc.ap);
            hi.a $$10 = hi.a($$3.stream().map($$7::b).collect(Collectors.toList()));
            dqd $$11 = new dqd(Optional.of($$10), $$9.b($$2), dqd.b($$8));
            if ($$4) {
                $$11.a();
            }
            if ($$5) {
                $$11.b();
            }
            for (int $$12 = $$6.length - 1; $$12 >= 0; --$$12) {
                $$11.e().add($$6[$$12]);
            }
            this.a.a($$0, new dqb($$1.k().j(), $$11));
        }

        public void a() {
            this.a(a, cpo.i, cnr.b, (Set<acp<dsg>>)ImmutableSet.of(drt.a), false, false, new dqa(1, cpo.i), new dqa(2, cpo.j), new dqa(1, cpo.F));
            this.a(b, cpo.b, cnr.t, (Set<acp<dsg>>)ImmutableSet.of(drt.j, drt.r), true, false, new dqa(1, cpo.i), new dqa(5, cpo.j), new dqa(230, cpo.b), new dqa(1, cpo.F));
            this.a(c, cgc.pL, cnr.T, (Set<acp<dsg>>)ImmutableSet.of(drt.m, drt.l, drt.g), false, false, new dqa(90, cpo.G), new dqa(5, cpo.L), new dqa(5, cpo.j), new dqa(5, cpo.b), new dqa(64, cpo.rI), new dqa(1, cpo.F));
            this.a(d, cpo.bt, cnr.b, (Set<acp<dsg>>)ImmutableSet.of(drt.a, drt.j, drt.f, drt.k, drt.r), true, true, new dqa(1, cpo.i), new dqa(3, cpo.j), new dqa(59, cpo.b), new dqa(1, cpo.F));
            this.a(e, cpo.dN, cnr.d, (Set<acp<dsg>>)ImmutableSet.of(drt.a, drt.c), false, false, new dqa(1, cpo.dN), new dqa(1, cpo.i), new dqa(3, cpo.j), new dqa(59, cpo.b), new dqa(1, cpo.F));
            this.a(f, cgc.oF, cnr.b, (Set<acp<dsg>>)ImmutableSet.of(drt.a), false, false, new dqa(1, cpo.i), new dqa(3, cpo.j), new dqa(2, cpo.m));
            this.a(g, cpo.I, cnr.f, (Set<acp<dsg>>)ImmutableSet.of(drt.a, drt.b, drt.j, drt.r), true, false, new dqa(8, cpo.I), new dqa(52, cpo.aV), new dqa(3, cpo.b), new dqa(1, cpo.F));
            this.a(h, cgc.ll, cnr.f, (Set<acp<dsg>>)ImmutableSet.of(), false, false, new dqa(116, cpo.aV), new dqa(3, cpo.b), new dqa(1, cpo.F));
            this.a(i, cpo.hW, cnr.a, (Set<acp<dsg>>)ImmutableSet.of(), true, false, new dqa(1, cpo.a));
        }
    }
}

