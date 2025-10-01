/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class dev {
    private static final Logger b = LogUtils.getLogger();
    public static final dev a = new dev(cmb.a);
    private static final String c = "Indices";
    private static final hb[] d = hb.values();
    private final EnumSet<hb> e = EnumSet.noneOf(hb.class);
    private final List<efs<cpn>> f = Lists.newArrayList();
    private final List<efs<dxd>> g = Lists.newArrayList();
    private final int[][] h;
    static final Map<cpn, a> i = new IdentityHashMap<cpn, a>();
    static final Set<a> j = Sets.newHashSet();

    private dev(cmo $$0) {
        this.h = new int[$$0.ak()][];
    }

    public dev(qr $$02, cmo $$1) {
        this($$1);
        if ($$02.b(c, 10)) {
            qr $$2 = $$02.p(c);
            for (int $$3 = 0; $$3 < this.h.length; ++$$3) {
                String $$4 = String.valueOf($$3);
                if (!$$2.b($$4, 11)) continue;
                this.h[$$3] = $$2.n($$4);
            }
        }
        int $$5 = $$02.h("Sides");
        for (hb $$6 : hb.values()) {
            if (($$5 & 1 << $$6.ordinal()) == 0) continue;
            this.e.add($$6);
        }
        dev.a($$02, "neighbor_block_ticks", $$0 -> jb.f.b(acq.a($$0)).or(() -> Optional.of(cpo.a)), this.f);
        dev.a($$02, "neighbor_fluid_ticks", $$0 -> jb.d.b(acq.a($$0)).or(() -> Optional.of(dxf.a)), this.g);
    }

    private static <T> void a(qr $$0, String $$1, Function<String, Optional<T>> $$2, List<efs<T>> $$3) {
        if ($$0.b($$1, 9)) {
            qx $$4 = $$0.c($$1, 10);
            for (rk $$5 : $$4) {
                efs.a((qr)$$5, $$2).ifPresent($$3::add);
            }
        }
    }

    public void a(dei $$0) {
        this.b($$0);
        for (hb $$12 : d) {
            dev.a($$0, $$12);
        }
        cmm $$2 = $$0.F();
        this.f.forEach($$1 -> {
            cpn $$2 = $$1.a() == cpo.a ? $$2.a_($$1.b()).b() : (cpn)$$1.a();
            $$2.a($$1.b(), $$2, $$1.c(), $$1.d());
        });
        this.g.forEach($$1 -> {
            dxd $$2 = $$1.a() == dxf.a ? $$2.b_($$1.b()).a() : (dxd)$$1.a();
            $$2.a($$1.b(), $$2, $$1.c(), $$1.d());
        });
        j.forEach($$1 -> $$1.a($$2));
    }

    private static void a(dei $$0, hb $$1) {
        cmm $$2 = $$0.F();
        if (!$$0.r().e.remove((Object)$$1)) {
            return;
        }
        Set<ha> $$3 = $$1.a();
        boolean $$4 = false;
        int $$5 = 15;
        boolean $$6 = $$3.contains(ha.f);
        boolean $$7 = $$3.contains(ha.e);
        boolean $$8 = $$3.contains(ha.d);
        boolean $$9 = $$3.contains(ha.c);
        boolean $$10 = $$3.size() == 1;
        clt $$11 = $$0.f();
        int $$12 = $$11.d() + ($$10 && ($$9 || $$8) ? 1 : ($$7 ? 0 : 15));
        int $$13 = $$11.d() + ($$10 && ($$9 || $$8) ? 14 : ($$7 ? 0 : 15));
        int $$14 = $$11.e() + ($$10 && ($$6 || $$7) ? 1 : ($$9 ? 0 : 15));
        int $$15 = $$11.e() + ($$10 && ($$6 || $$7) ? 14 : ($$9 ? 0 : 15));
        ha[] $$16 = ha.values();
        gu.a $$17 = new gu.a();
        for (gu $$18 : gu.b($$12, $$2.C_(), $$14, $$13, $$2.aj() - 1, $$15)) {
            dcb $$19;
            dcb $$20 = $$19 = $$2.a_($$18);
            for (ha $$21 : $$16) {
                $$17.a((hz)$$18, $$21);
                $$20 = dev.a($$20, $$21, $$2, $$18, $$17);
            }
            cpn.a($$19, $$20, $$2, $$18, 18);
        }
    }

    private static dcb a(dcb $$0, ha $$1, cmn $$2, gu $$3, gu $$4) {
        return i.getOrDefault($$0.b(), dev$b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
    }

    private void b(dei $$0) {
        gu.a $$1 = new gu.a();
        gu.a $$2 = new gu.a();
        clt $$3 = $$0.f();
        cmm $$4 = $$0.F();
        for (int $$5 = 0; $$5 < this.h.length; ++$$5) {
            dej $$6 = $$0.b($$5);
            int[] $$7 = this.h[$$5];
            this.h[$$5] = null;
            if ($$7 == null || $$7.length <= 0) continue;
            ha[] $$8 = ha.values();
            deq<dcb> $$9 = $$6.h();
            int $$10 = $$0.g($$5);
            int $$11 = hx.c($$10);
            for (int $$12 : $$7) {
                dcb $$16;
                int $$13 = $$12 & 0xF;
                int $$14 = $$12 >> 8 & 0xF;
                int $$15 = $$12 >> 4 & 0xF;
                $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
                dcb $$17 = $$16 = $$9.a($$12);
                for (ha $$18 : $$8) {
                    $$2.a((hz)$$1, $$18);
                    if (hx.a($$1.u()) != $$3.e || hx.a($$1.w()) != $$3.f) continue;
                    $$17 = dev.a($$17, $$18, $$4, $$1, $$2);
                }
                cpn.a($$16, $$17, $$4, $$1, 18);
            }
        }
        for (int $$19 = 0; $$19 < this.h.length; ++$$19) {
            if (this.h[$$19] != null) {
                b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.g($$19), $$3.e, $$3.f});
            }
            this.h[$$19] = null;
        }
    }

    public boolean a() {
        for (int[] $$0 : this.h) {
            if ($$0 == null) continue;
            return false;
        }
        return this.e.isEmpty();
    }

    public qr b() {
        qr $$0 = new qr();
        qr $$12 = new qr();
        for (int $$2 = 0; $$2 < this.h.length; ++$$2) {
            String $$3 = String.valueOf($$2);
            if (this.h[$$2] == null || this.h[$$2].length == 0) continue;
            $$12.a($$3, this.h[$$2]);
        }
        if (!$$12.g()) {
            $$0.a(c, $$12);
        }
        int $$4 = 0;
        for (hb $$5 : this.e) {
            $$4 |= 1 << $$5.ordinal();
        }
        $$0.a("Sides", (byte)$$4);
        if (!this.f.isEmpty()) {
            qx $$6 = new qx();
            this.f.forEach($$1 -> $$6.add($$1.a((T $$0) -> jb.f.b((cpn)$$0).toString())));
            $$0.a("neighbor_block_ticks", $$6);
        }
        if (!this.g.isEmpty()) {
            qx $$7 = new qx();
            this.g.forEach($$1 -> $$7.add($$1.a((T $$0) -> jb.d.b((dxd)$$0).toString())));
            $$0.a("neighbor_fluid_ticks", $$7);
        }
        return $$0;
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    static abstract class b
    extends Enum<b>
    implements a {
        public static final /* enum */ b a = new b(new cpn[]{cpo.kO, cpo.ee, cpo.lM, cpo.lN, cpo.lO, cpo.lP, cpo.lQ, cpo.lR, cpo.lS, cpo.lT, cpo.lU, cpo.lV, cpo.lW, cpo.lX, cpo.lY, cpo.lZ, cpo.ma, cpo.mb, cpo.gS, cpo.gT, cpo.gU, cpo.fA, cpo.L, cpo.I, cpo.K, cpo.cE, cpo.cF, cpo.cG, cpo.cH, cpo.cI, cpo.cJ, cpo.cK, cpo.cR, cpo.cS, cpo.cT, cpo.cU, cpo.cW, cpo.cX, cpo.da, cpo.db, cpo.dc, cpo.dd, cpo.df, cpo.dg, cpo.dl, cpo.dm, cpo.dn, cpo.do, cpo.dq, cpo.dr}){

            @Override
            public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
                return $$0;
            }
        };
        public static final /* enum */ b b = new b(new cpn[0]){

            @Override
            public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
                return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            }
        };
        public static final /* enum */ b c = new b(new cpn[]{cpo.cv, cpo.gV}){

            @Override
            public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
                if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(cqp.c) == dct.a && $$2.c(cqp.c) == dct.a) {
                    ha $$6 = $$0.c(cqp.b);
                    if ($$1.o() != $$6.o() && $$6 == $$2.c(cqp.b)) {
                        dct $$7 = $$1 == $$6.h() ? dct.b : dct.c;
                        $$3.a($$5, (dcb)$$2.a(cqp.c, $$7.a()), 18);
                        if ($$6 == ha.c || $$6 == ha.f) {
                            czn $$8 = $$3.c_($$4);
                            czn $$9 = $$3.c_($$5);
                            if ($$8 instanceof czu && $$9 instanceof czu) {
                                czu.a((czu)$$8, (czu)$$9);
                            }
                        }
                        return (dcb)$$0.a(cqp.c, $$7);
                    }
                }
                return $$0;
            }
        };
        public static final /* enum */ b d = new b(true, new cpn[]{cpo.aI, cpo.aJ, cpo.aG, cpo.aK, cpo.aH, cpo.aE, cpo.aF}){
            private final ThreadLocal<List<ObjectSet<gu>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity((int)7));

            @Override
            public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
                dcb $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
                if ($$0 != $$6) {
                    int $$7 = $$6.c(dcr.aC);
                    List<ObjectSet<gu>> $$8 = this.g.get();
                    if ($$8.isEmpty()) {
                        for (int $$9 = 0; $$9 < 7; ++$$9) {
                            $$8.add((ObjectSet<gu>)new ObjectOpenHashSet());
                        }
                    }
                    $$8.get($$7).add((Object)$$4.i());
                }
                return $$0;
            }

            @Override
            public void a(cmn $$0) {
                gu.a $$1 = new gu.a();
                List<ObjectSet<gu>> $$2 = this.g.get();
                for (int $$3 = 2; $$3 < $$2.size(); ++$$3) {
                    int $$4 = $$3 - 1;
                    ObjectSet<gu> $$5 = $$2.get($$4);
                    ObjectSet<gu> $$6 = $$2.get($$3);
                    for (gu $$7 : $$5) {
                        dcb $$8 = $$0.a_($$7);
                        if ($$8.c(dcr.aC) < $$4) continue;
                        $$0.a($$7, (dcb)$$8.a(dcr.aC, $$4), 18);
                        if ($$3 == 7) continue;
                        for (ha $$9 : f) {
                            $$1.a((hz)$$7, $$9);
                            dcb $$10 = $$0.a_($$1);
                            if (!$$10.b(dcr.aC) || $$8.c(dcr.aC) <= $$3) continue;
                            $$6.add((Object)$$1.i());
                        }
                    }
                }
                $$2.clear();
            }
        };
        public static final /* enum */ b e = new b(new cpn[]{cpo.fe, cpo.fd}){

            @Override
            public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
                cxk $$6;
                if ($$0.c(cxj.b) == 7 && $$2.a($$6 = ((cxj)$$0.b()).a())) {
                    return (dcb)$$6.b().n().a(ctg.aC, $$1);
                }
                return $$0;
            }
        };
        public static final ha[] f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        b(cpn ... $$0) {
            this(false, $$0);
        }

        b(boolean $$0, cpn ... $$1) {
            for (cpn $$2 : $$1) {
                i.put($$2, this);
            }
            if ($$0) {
                j.add(this);
            }
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            g = dev$b.a();
            f = ha.values();
        }
    }

    public static interface a {
        public dcb a(dcb var1, ha var2, dcb var3, cmn var4, gu var5, gu var6);

        default public void a(cmn $$0) {
        }
    }
}

